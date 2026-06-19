package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.n;
import l1.k;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f652a = n.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.e().b(f652a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k Q = k.Q(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (k.f2486n) {
                try {
                    Q.f2494k = goAsync;
                    if (Q.f2493j) {
                        goAsync.finish();
                        Q.f2494k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e4) {
            n.e().d(f652a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
