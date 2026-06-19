package o1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.k;
import t1.d;
import t1.i;
import u1.f;

/* loaded from: classes.dex */
public final class c implements l1.c {

    /* renamed from: k, reason: collision with root package name */
    public static final String f2740k = n.g("SystemJobScheduler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f2741g;
    public final JobScheduler h;

    /* renamed from: i, reason: collision with root package name */
    public final k f2742i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2743j;

    public c(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.f2741g = context;
        this.f2742i = kVar;
        this.h = jobScheduler;
        this.f2743j = bVar;
    }

    public static void c(JobScheduler jobScheduler, int i5) {
        try {
            jobScheduler.cancel(i5);
        } catch (Throwable th) {
            n.e().d(f2740k, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i5)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.e().d(f2740k, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // l1.c
    public final void a(i... iVarArr) {
        int m5;
        k kVar = this.f2742i;
        WorkDatabase workDatabase = kVar.f2489e;
        f fVar = new f(workDatabase, 0);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i h = workDatabase.n().h(iVar.f3340a);
                String str = f2740k;
                if (h == null) {
                    n.e().h(str, "Skipping scheduling " + iVar.f3340a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (h.f3341b != 1) {
                    n.e().h(str, "Skipping scheduling " + iVar.f3340a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    d o2 = workDatabase.k().o(iVar.f3340a);
                    if (o2 != null) {
                        m5 = o2.f3333b;
                    } else {
                        kVar.f2488d.getClass();
                        m5 = fVar.m(kVar.f2488d.f621g);
                    }
                    if (o2 == null) {
                        kVar.f2489e.k().q(new d(iVar.f3340a, m5));
                    }
                    f(iVar, m5);
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // l1.c
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0018 A[SYNTHETIC] */
    @Override // l1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str) {
        String string;
        Context context = this.f2741g;
        JobScheduler jobScheduler = this.h;
        ArrayList e4 = e(context, jobScheduler);
        int i5 = 0;
        ArrayList arrayList = null;
        if (e4 != null) {
            ArrayList arrayList2 = new ArrayList(2);
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
                        if (!str.equals(string)) {
                            arrayList2.add(Integer.valueOf(jobInfo.getId()));
                        }
                    }
                }
                string = null;
                if (!str.equals(string)) {
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        this.f2742i.f2489e.k().v(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(i iVar, int i5) {
        int i6;
        JobScheduler jobScheduler = this.h;
        b bVar = this.f2743j;
        bVar.getClass();
        androidx.work.c cVar = iVar.f3348j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f3340a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i5, bVar.f2739a).setRequiresCharging(cVar.f624b).setRequiresDeviceIdle(cVar.f625c).setExtras(persistableBundle);
        int i7 = cVar.f623a;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || i7 != 6) {
            int c5 = h1.c(i7);
            if (c5 != 0) {
                if (c5 != 1) {
                    if (c5 != 2) {
                        i6 = 3;
                        if (c5 != 3) {
                            i6 = 4;
                            if (c5 != 4 || i8 < 26) {
                                n.e().b(b.f2738b, "API version too low. Cannot convert network type value ".concat(u.A(i7)), new Throwable[0]);
                            }
                        }
                    } else {
                        i6 = 2;
                    }
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            extras.setRequiredNetworkType(i6);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f625c) {
            extras.setBackoffCriteria(iVar.f3351m, iVar.f3350l == 2 ? 0 : 1);
        }
        long max = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i8 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!iVar.f3355q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.h.f632a.size() > 0) {
            Iterator it = cVar.h.f632a.iterator();
            while (it.hasNext()) {
                androidx.work.d dVar = (androidx.work.d) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f630a, dVar.f631b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f628f);
            extras.setTriggerContentMaxDelay(cVar.f629g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f626d);
            extras.setRequiresStorageNotLow(cVar.f627e);
        }
        Object[] objArr = iVar.f3349k > 0;
        if (b0.b.b() && iVar.f3355q && objArr == false) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        n e4 = n.e();
        String str = iVar.f3340a;
        String str2 = f2740k;
        e4.b(str2, "Scheduling work ID " + str + " Job ID " + i5, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                n.e().h(str2, "Unable to schedule work ID " + iVar.f3340a, new Throwable[0]);
                if (iVar.f3355q && iVar.f3356r == 1) {
                    iVar.f3355q = false;
                    n.e().b(str2, "Scheduling a non-expedited job (work ID " + iVar.f3340a + ")", new Throwable[0]);
                    f(iVar, i5);
                }
            }
        } catch (IllegalStateException e5) {
            ArrayList e6 = e(this.f2741g, jobScheduler);
            int size = e6 != null ? e6.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            k kVar = this.f2742i;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(kVar.f2489e.n().d().size()), Integer.valueOf(kVar.f2488d.h));
            n.e().d(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e5);
        } catch (Throwable th) {
            n.e().d(str2, "Unable to schedule " + iVar, th);
        }
    }
}
