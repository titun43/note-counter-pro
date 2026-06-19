package n1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.n;
import java.util.ArrayList;
import java.util.HashMap;
import k.v0;
import l1.k;
import t1.i;

/* loaded from: classes.dex */
public final class b implements l1.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f2660j = n.g("CommandHandler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f2661g;
    public final HashMap h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final Object f2662i = new Object();

    public b(Context context) {
        this.f2661g = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        synchronized (this.f2662i) {
            try {
                l1.a aVar = (l1.a) this.h.remove(str);
                if (aVar != null) {
                    aVar.c(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i5, g gVar) {
        boolean z4;
        String action = intent.getAction();
        int i6 = 2;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            n.e().b(f2660j, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f2661g;
            d dVar = new d(context, i5, gVar);
            p1.c cVar = dVar.f2666b;
            ArrayList d5 = gVar.f2681k.f2489e.n().d();
            String str = c.f2663a;
            int size = d5.size();
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = d5.get(i7);
                i7++;
                androidx.work.c cVar2 = ((i) obj).f3348j;
                z5 |= cVar2.f626d;
                z6 |= cVar2.f624b;
                z7 |= cVar2.f627e;
                z8 |= cVar2.f623a != 1;
                if (z5 && z6 && z7 && z8) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f651a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z6).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z8);
            context.sendBroadcast(intent2);
            cVar.b(d5);
            ArrayList arrayList = new ArrayList(d5.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d5.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = d5.get(i8);
                i8++;
                i iVar = (i) obj2;
                String str3 = iVar.f3340a;
                if (currentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                String str4 = ((i) obj3).f3340a;
                Intent a5 = a(context, str4);
                n.e().b(d.f2664c, s.c.b("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new v0(gVar, dVar.f2665a, i6, a5));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n.e().b(f2660j, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i5)), new Throwable[0]);
            gVar.f2681k.T();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n.e().d(f2660j, s.c.b("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f2661g;
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n e4 = n.e();
            String str5 = f2660j;
            e4.b(str5, s.c.a("Handling schedule work for ", string), new Throwable[0]);
            k kVar = gVar.f2681k;
            WorkDatabase workDatabase = kVar.f2489e;
            workDatabase.c();
            try {
                i h = workDatabase.n().h(string);
                if (h == null) {
                    n.e().h(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    return;
                }
                if (u.a(h.f3341b)) {
                    n.e().h(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    return;
                }
                long a6 = h.a();
                if (h.b()) {
                    n.e().b(str5, "Opportunistically setting an alarm for " + string + " at " + a6, new Throwable[0]);
                    a.b(context2, kVar, string, a6);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new v0(gVar, i5, 2, intent3));
                } else {
                    n.e().b(str5, "Setting up Alarms for " + string + " at " + a6, new Throwable[0]);
                    a.b(context2, kVar, string, a6);
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f2662i) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    n e5 = n.e();
                    String str6 = f2660j;
                    e5.b(str6, "Handing delay met for " + string2, new Throwable[0]);
                    if (this.h.containsKey(string2)) {
                        n.e().b(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    } else {
                        e eVar = new e(this.f2661g, i5, string2, gVar);
                        this.h.put(string2, eVar);
                        eVar.b();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                n.e().h(f2660j, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z9 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            n.e().b(f2660j, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i5)), new Throwable[0]);
            c(string3, z9);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        n.e().b(f2660j, s.c.a("Handing stopWork work for ", string4), new Throwable[0]);
        gVar.f2681k.V(string4);
        Context context3 = this.f2661g;
        k kVar2 = gVar.f2681k;
        String str7 = a.f2659a;
        t k5 = kVar2.f2489e.k();
        t1.d o2 = k5.o(string4);
        if (o2 != null) {
            a.a(context3, string4, o2.f3333b);
            z4 = false;
            n.e().b(a.f2659a, s.c.b("Removing SystemIdInfo for workSpecId (", string4, ")"), new Throwable[0]);
            k5.v(string4);
        } else {
            z4 = false;
        }
        gVar.c(string4, z4);
    }
}
