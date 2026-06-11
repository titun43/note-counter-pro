package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.emoji2.text.t;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.n;
import l1.k;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f657a = n.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f657a;
        n.e().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.Q(context).f(new t(DiagnosticsWorker.class).e());
        } catch (IllegalStateException e4) {
            n.e().d(str, "WorkManager is not initialized", e4);
        }
    }
}
