package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.emoji2.text.t;
import f2.j;
import f2.r;
import java.util.concurrent.Executor;
import l2.e;
import p2.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f904a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i5 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        t a5 = j.a();
        a5.y(queryParameter);
        a5.f285j = a.b(intValue);
        if (queryParameter2 != null) {
            a5.f284i = Base64.decode(queryParameter2, 0);
        }
        l2.j jVar = r.a().f1489d;
        ((Executor) jVar.f2537e).execute(new e(jVar, a5.f(), i5, new l2.a()));
    }
}
