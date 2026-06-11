package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    public zzgzc(zzgub zzgubVar, boolean z4, Executor executor, Callable callable) {
        super(zzgubVar, z4, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzA(int i5) {
        super.zzA(i5);
        if (i5 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzw(int i5, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }
}
