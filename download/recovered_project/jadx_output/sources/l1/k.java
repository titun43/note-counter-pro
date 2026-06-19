package l1;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.emoji2.text.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.n;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k extends z2.b {

    /* renamed from: l, reason: collision with root package name */
    public static k f2484l;

    /* renamed from: m, reason: collision with root package name */
    public static k f2485m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f2486n;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2487c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.b f2488d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f2489e;

    /* renamed from: f, reason: collision with root package name */
    public final t f2490f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2491g;
    public final b h;

    /* renamed from: i, reason: collision with root package name */
    public final k1.j f2492i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2493j;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f2494k;

    static {
        n.g("WorkManagerImpl");
        f2484l = null;
        f2485m = null;
        f2486n = new Object();
    }

    public k(Context context, androidx.work.b bVar, t tVar) {
        z0.h hVar;
        Executor executor;
        String str;
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        u1.i iVar = (u1.i) tVar.h;
        int i5 = WorkDatabase.f642k;
        if (z4) {
            hVar = new z0.h(applicationContext, null);
            hVar.f3918g = true;
        } else {
            String str2 = j.f2482a;
            z0.h hVar2 = new z0.h(applicationContext, "androidx.work.workdb");
            hVar2.f3917f = new f2.k(applicationContext);
            hVar = hVar2;
        }
        hVar.f3915d = iVar;
        f fVar = new f();
        if (hVar.f3914c == null) {
            hVar.f3914c = new ArrayList();
        }
        hVar.f3914c.add(fVar);
        hVar.a(i.f2475a);
        hVar.a(new h(applicationContext, 2, 3));
        hVar.a(i.f2476b);
        hVar.a(i.f2477c);
        hVar.a(new h(applicationContext, 5, 6));
        hVar.a(i.f2478d);
        hVar.a(i.f2479e);
        hVar.a(i.f2480f);
        hVar.a(new h(applicationContext));
        hVar.a(new h(applicationContext, 10, 11));
        hVar.a(i.f2481g);
        hVar.h = false;
        hVar.f3919i = true;
        Context context2 = hVar.f3913b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = hVar.f3915d;
        if (executor2 == null && hVar.f3916e == null) {
            l.a aVar = l.b.f2448k;
            hVar.f3916e = aVar;
            hVar.f3915d = aVar;
        } else if (executor2 != null && hVar.f3916e == null) {
            hVar.f3916e = executor2;
        } else if (executor2 == null && (executor = hVar.f3916e) != null) {
            hVar.f3915d = executor;
        }
        if (hVar.f3917f == null) {
            hVar.f3917f = new t2.i(12);
        }
        String str3 = hVar.f3912a;
        d1.b bVar2 = hVar.f3917f;
        k1.j jVar = hVar.f3920j;
        ArrayList arrayList = hVar.f3914c;
        boolean z5 = hVar.f3918g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i6 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = hVar.f3915d;
        z0.a aVar2 = new z0.a(context2, str3, bVar2, jVar, arrayList, z5, i6, executor3, hVar.f3916e, hVar.h, hVar.f3919i);
        int i7 = i6;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            z0.i iVar2 = (z0.i) Class.forName(str).newInstance();
            d1.c e4 = iVar2.e(aVar2);
            iVar2.f3924c = e4;
            boolean z6 = i7 == 3;
            e4.setWriteAheadLoggingEnabled(z6);
            iVar2.f3928g = arrayList;
            iVar2.f3923b = executor3;
            new ArrayDeque();
            iVar2.f3926e = z5;
            iVar2.f3927f = z6;
            WorkDatabase workDatabase = (WorkDatabase) iVar2;
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(bVar.f620f);
            synchronized (n.class) {
                n.h = nVar;
            }
            String str5 = d.f2465a;
            o1.c cVar = new o1.c(applicationContext2, this);
            u1.g.a(applicationContext2, SystemJobService.class, true);
            n.e().b(d.f2465a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List asList = Arrays.asList(cVar, new m1.b(applicationContext2, bVar, tVar, this));
            b bVar3 = new b(context, bVar, tVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f2487c = applicationContext3;
            this.f2488d = bVar;
            this.f2490f = tVar;
            this.f2489e = workDatabase;
            this.f2491g = asList;
            this.h = bVar3;
            this.f2492i = new k1.j(workDatabase, 21);
            this.f2493j = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f2490f.i(new u1.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static k Q(Context context) {
        k kVar;
        Object obj = f2486n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f2484l;
                    if (kVar == null) {
                        kVar = f2485m;
                    }
                }
                return kVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (l1.k.f2485m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        l1.k.f2485m = new l1.k(r4, r5, new androidx.emoji2.text.t(r5.f616b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        l1.k.f2484l = l1.k.f2485m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(Context context, androidx.work.b bVar) {
        synchronized (f2486n) {
            try {
                k kVar = f2484l;
                if (kVar != null && f2485m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void S() {
        synchronized (f2486n) {
            try {
                this.f2493j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f2494k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f2494k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T() {
        ArrayList e4;
        String str = o1.c.f2740k;
        Context context = this.f2487c;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e4 = o1.c.e(context, jobScheduler)) != null && !e4.isEmpty()) {
            int size = e4.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = e4.get(i5);
                i5++;
                o1.c.c(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f2489e;
        l2.j n5 = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) n5.f2540i;
        e1.f a5 = eVar.a();
        workDatabase_Impl.c();
        try {
            a5.f1242j.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(a5);
            d.a(this.f2488d, workDatabase, this.f2491g);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(a5);
            throw th;
        }
    }

    public final void U(String str, t tVar) {
        c0.n nVar = new c0.n(6);
        nVar.h = this;
        nVar.f773i = str;
        nVar.f774j = tVar;
        this.f2490f.i(nVar);
    }

    public final void V(String str) {
        this.f2490f.i(new u1.j(this, str, false));
    }
}
