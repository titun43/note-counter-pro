package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.work.n;
import java.util.Arrays;
import java.util.HashMap;
import l1.a;
import l1.b;
import l1.k;
import s.c;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f655i = n.g("SystemJobService");

    /* renamed from: g, reason: collision with root package name */
    public k f656g;
    public final HashMap h = new HashMap();

    @Override // l1.a
    public final void c(String str, boolean z4) {
        JobParameters jobParameters;
        n.e().b(f655i, u.j(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.h) {
            jobParameters = (JobParameters) this.h.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k Q = k.Q(getApplicationContext());
            this.f656g = Q;
            Q.h.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            n.e().h(f655i, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f656g;
        if (kVar != null) {
            kVar.h.e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        Network network;
        PersistableBundle extras;
        if (this.f656g == null) {
            n.e().b(f655i, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                n.e().d(f655i, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            synchronized (this.h) {
                try {
                    if (this.h.containsKey(str)) {
                        n.e().b(f655i, "Job is already being executed by SystemJobService: " + str, new Throwable[0]);
                        return false;
                    }
                    n.e().b(f655i, "onStartJob for " + str, new Throwable[0]);
                    this.h.put(str, jobParameters);
                    int i5 = Build.VERSION.SDK_INT;
                    t tVar = new t(4);
                    if (jobParameters.getTriggeredContentUris() != null) {
                        tVar.f284i = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        tVar.h = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i5 >= 28) {
                        network = jobParameters.getNetwork();
                        tVar.f285j = network;
                    }
                    this.f656g.U(str, tVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStopJob(JobParameters jobParameters) {
        String str;
        boolean contains;
        PersistableBundle extras;
        if (this.f656g == null) {
            n.e().b(f655i, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                n.e().d(f655i, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            n.e().b(f655i, c.a("onStopJob for ", str), new Throwable[0]);
            synchronized (this.h) {
                this.h.remove(str);
            }
            this.f656g.V(str);
            b bVar = this.f656g.h;
            synchronized (bVar.f2464q) {
                contains = bVar.f2462o.contains(str);
            }
            return !contains;
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }
}
