package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfok implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ boolean zzc;

    public zzfok(zzfoo zzfooVar, zzfoe zzfoeVar, boolean z4) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zzb;
        if (zzfoeVar.zzb()) {
            zzfoo zzfooVar = this.zza;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            if (this.zzc) {
                zzfooVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzd(true);
        zzfoo zzfooVar = this.zza;
        zzfooVar.zza(zzfoeVar);
        if (this.zzc) {
            zzfooVar.zzh();
        }
    }
}
