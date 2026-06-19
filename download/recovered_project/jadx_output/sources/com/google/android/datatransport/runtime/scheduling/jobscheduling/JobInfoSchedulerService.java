package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a2.b;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.emoji2.text.t;
import f2.j;
import f2.r;
import java.util.concurrent.Executor;
import l2.e;
import p2.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f905g = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i5 = jobParameters.getExtras().getInt("priority");
        int i6 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        t a5 = j.a();
        a5.y(string);
        a5.f285j = a.b(i5);
        if (string2 != null) {
            a5.f284i = Base64.decode(string2, 0);
        }
        l2.j jVar = r.a().f1489d;
        ((Executor) jVar.f2537e).execute(new e(jVar, a5.f(), i6, new b(9, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
