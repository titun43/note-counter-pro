package n1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.emoji2.text.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import l1.k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2659a = n.g("Alarms");

    public static void a(Context context, String str, int i5) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i5, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.e().b(f2659a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i5 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j2) {
        int intValue;
        WorkDatabase workDatabase = kVar.f2489e;
        t k5 = workDatabase.k();
        t1.d o2 = k5.o(str);
        if (o2 != null) {
            a(context, str, o2.f3333b);
            int i5 = o2.f3333b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i5, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j2, service);
                return;
            }
            return;
        }
        synchronized (u1.f.class) {
            workDatabase.c();
            try {
                Long z4 = workDatabase.j().z("next_alarm_manager_id");
                intValue = z4 != null ? z4.intValue() : 0;
                workDatabase.j().B(new t1.c("next_alarm_manager_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        k5.q(new t1.d(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j2, service2);
        }
    }
}
