package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfrv implements Runnable {
    final /* synthetic */ zzfsa zza;

    public zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            x2.b zzJ = zzfsaVar.zzJ();
            zzfrm zzK = zzfsaVar.zzK();
            ((x2.c) zzJ).getClass();
            zzI.zzj(System.currentTimeMillis(), zzK, zzfsaVar.zze.zzd, zzfsaVar.zzH());
        }
    }
}
