package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final /* synthetic */ class zzecv implements zzgyw {
    static final /* synthetic */ zzecv zza = new zzecv();

    private /* synthetic */ zzecv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ j3.a zza(Object obj) {
        Throwable th = (ExecutionException) obj;
        if (th.getCause() != null) {
            th = th.getCause();
        }
        return zzgzo.zzc(th);
    }
}
