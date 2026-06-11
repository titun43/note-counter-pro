package s1;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.emoji2.text.j;
import androidx.emoji2.text.t;
import androidx.work.h;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.v0;
import l1.k;
import n.e;
import p1.c;
import t1.i;

/* loaded from: classes.dex */
public final class b implements p1.b, l1.a {

    /* renamed from: p, reason: collision with root package name */
    public static final String f3289p = n.g("SystemFgDispatcher");

    /* renamed from: g, reason: collision with root package name */
    public final k f3290g;
    public final w1.a h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3291i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public String f3292j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f3293k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f3294l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f3295m;

    /* renamed from: n, reason: collision with root package name */
    public final c f3296n;

    /* renamed from: o, reason: collision with root package name */
    public SystemForegroundService f3297o;

    public b(Context context) {
        k Q = k.Q(context);
        this.f3290g = Q;
        t tVar = Q.f2490f;
        this.h = tVar;
        this.f3292j = null;
        this.f3293k = new LinkedHashMap();
        this.f3295m = new HashSet();
        this.f3294l = new HashMap();
        this.f3296n = new c(context, tVar, this);
        Q.h.a(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f637a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f638b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f639c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f637a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f638b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f639c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        Map.Entry entry;
        synchronized (this.f3291i) {
            try {
                i iVar = (i) this.f3294l.remove(str);
                if (iVar != null ? this.f3295m.remove(iVar) : false) {
                    this.f3296n.b(this.f3295m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f3293k.remove(str);
        if (str.equals(this.f3292j) && this.f3293k.size() > 0) {
            Iterator it = this.f3293k.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f3292j = (String) entry.getKey();
            if (this.f3297o != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.f3297o;
                systemForegroundService.h.post(new e(systemForegroundService, hVar2.f637a, hVar2.f639c, hVar2.f638b));
                SystemForegroundService systemForegroundService2 = this.f3297o;
                systemForegroundService2.h.post(new j(systemForegroundService2, hVar2.f637a, 2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f3297o;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        n.e().b(f3289p, "Removing Notification (id: " + hVar.f637a + ", workSpecId: " + str + " ,notificationType: " + hVar.f638b + ")", new Throwable[0]);
        systemForegroundService3.h.post(new j(systemForegroundService3, hVar.f637a, 2));
    }

    public final void d(Intent intent) {
        int i5 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n.e().b(f3289p, "Notifying with (id: " + intExtra + ", workSpecId: " + stringExtra + ", notificationType: " + intExtra2 + ")", new Throwable[0]);
        if (notification == null || this.f3297o == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f3293k;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f3292j)) {
            this.f3292j = stringExtra;
            SystemForegroundService systemForegroundService = this.f3297o;
            systemForegroundService.h.post(new e(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f3297o;
        systemForegroundService2.h.post(new v0(systemForegroundService2, intExtra, notification, 3));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i5 |= ((h) ((Map.Entry) it.next()).getValue()).f638b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f3292j);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f3297o;
            systemForegroundService3.h.post(new e(systemForegroundService3, hVar2.f637a, hVar2.f639c, i5));
        }
    }

    @Override // p1.b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str = (String) obj;
            n.e().b(f3289p, s.c.a("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            k kVar = this.f3290g;
            kVar.f2490f.i(new u1.j(kVar, str, true));
        }
    }

    public final void g() {
        this.f3297o = null;
        synchronized (this.f3291i) {
            this.f3296n.c();
        }
        this.f3290g.h.e(this);
    }

    @Override // p1.b
    public final void f(List list) {
    }
}
