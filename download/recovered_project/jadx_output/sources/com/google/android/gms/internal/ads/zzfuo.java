package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzfuo implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfur.zzc;
        if (handler != null) {
            handler2 = zzfur.zzc;
            runnable = zzfur.zzk;
            handler2.post(runnable);
            handler3 = zzfur.zzc;
            runnable2 = zzfur.zzl;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
