package u1;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import f0.n1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f3499j = androidx.work.n.g("ForceStopRunnable");

    /* renamed from: k, reason: collision with root package name */
    public static final long f3500k = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: g, reason: collision with root package name */
    public final Context f3501g;
    public final l1.k h;

    /* renamed from: i, reason: collision with root package name */
    public int f3502i = 0;

    public e(Context context, l1.k kVar) {
        this.f3501g = context.getApplicationContext();
        this.h = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i5 = b0.b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i5);
        long currentTimeMillis = System.currentTimeMillis() + f3500k;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z4;
        WorkDatabase workDatabase;
        int i5;
        List historicalProcessExitReasons;
        int reason;
        String string;
        String str = o1.c.f2740k;
        Context context = this.f3501g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList e4 = o1.c.e(context, jobScheduler);
        l1.k kVar = this.h;
        androidx.emoji2.text.t k5 = kVar.f2489e.k();
        k5.getClass();
        z0.j d5 = z0.j.d(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) k5.h;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            HashSet hashSet = new HashSet(e4 != null ? e4.size() : 0);
            if (e4 != null && !e4.isEmpty()) {
                int size = e4.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = e4.get(i6);
                    i6++;
                    JobInfo jobInfo = (JobInfo) obj;
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                            if (TextUtils.isEmpty(string)) {
                                hashSet.add(string);
                            } else {
                                o1.c.c(jobScheduler, jobInfo.getId());
                            }
                        }
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                }
            }
            int size2 = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    z4 = false;
                    break;
                }
                Object obj2 = arrayList.get(i7);
                i7++;
                if (!hashSet.contains((String) obj2)) {
                    androidx.work.n.e().b(o1.c.f2740k, "Reconciling jobs", new Throwable[0]);
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                workDatabase = kVar.f2489e;
                workDatabase.c();
                try {
                    l2.j n5 = workDatabase.n();
                    int size3 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj3 = arrayList.get(i8);
                        i8++;
                        n5.k((String) obj3, -1L);
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = kVar.f2489e;
            l2.j n6 = workDatabase.n();
            r1.h m5 = workDatabase.m();
            workDatabase.c();
            try {
                ArrayList c5 = n6.c();
                boolean isEmpty = c5.isEmpty();
                if (!isEmpty) {
                    int size4 = c5.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj4 = c5.get(i9);
                        i9++;
                        t1.i iVar = (t1.i) obj4;
                        n6.o(1, iVar.f3340a);
                        n6.k(iVar.f3340a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) m5.f3161g;
                workDatabase_Impl2.b();
                t1.e eVar = (t1.e) m5.f3163j;
                e1.f a5 = eVar.a();
                workDatabase_Impl2.c();
                try {
                    a5.l();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    eVar.c(a5);
                    workDatabase.h();
                    workDatabase.f();
                    boolean z5 = !isEmpty || z4;
                    Long z6 = ((WorkDatabase) kVar.f2492i.h).j().z("reschedule_needed");
                    String str2 = f3499j;
                    if (z6 != null && z6.longValue() == 1) {
                        androidx.work.n.e().b(str2, "Rescheduling Workers.", new Throwable[0]);
                        kVar.T();
                        k1.j jVar = kVar.f2492i;
                        jVar.getClass();
                        ((WorkDatabase) jVar.h).j().B(new t1.c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i10 = b0.b.b() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                    reason = n1.c(historicalProcessExitReasons.get(i11)).getReason();
                                    if (reason == 10) {
                                        i5 = 0;
                                    }
                                }
                            }
                            if (z5) {
                                return;
                            }
                            androidx.work.n.e().b(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            l1.d.a(kVar.f2488d, kVar.f2489e, kVar.f2491g);
                            return;
                        }
                        if (broadcast == null) {
                            c(context);
                            i5 = 0;
                        }
                        if (z5) {
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        i5 = 0;
                        androidx.work.n.e().h(str2, "Ignoring exception", e);
                        androidx.work.n.e().b(str2, "Application was force-stopped, rescheduling.", new Throwable[i5]);
                        kVar.T();
                    } catch (SecurityException e6) {
                        e = e6;
                        i5 = 0;
                        androidx.work.n.e().h(str2, "Ignoring exception", e);
                        androidx.work.n.e().b(str2, "Application was force-stopped, rescheduling.", new Throwable[i5]);
                        kVar.T();
                    }
                    androidx.work.n.e().b(str2, "Application was force-stopped, rescheduling.", new Throwable[i5]);
                    kVar.T();
                } catch (Throwable th2) {
                    workDatabase_Impl2.f();
                    eVar.c(a5);
                    throw th2;
                }
            } finally {
                workDatabase.f();
            }
        } finally {
            g5.close();
            d5.h();
        }
    }

    public final boolean b() {
        androidx.work.b bVar = this.h.f2488d;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3499j;
        if (isEmpty) {
            androidx.work.n.e().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a5 = h.a(this.f3501g, bVar);
        androidx.work.n.e().b(str, "Is default app process = " + a5, new Throwable[0]);
        return a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3499j;
        l1.k kVar = this.h;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                l1.j.a(this.f3501g);
                androidx.work.n.e().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                    int i5 = this.f3502i + 1;
                    this.f3502i = i5;
                    if (i5 >= 3) {
                        androidx.work.n.e().d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        kVar.f2488d.getClass();
                        throw illegalStateException;
                    }
                    long j2 = i5 * 300;
                    androidx.work.n.e().b(str, "Retrying after " + j2, e4);
                    try {
                        Thread.sleep(this.f3502i * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.S();
        }
    }
}
