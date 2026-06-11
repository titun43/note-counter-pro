package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzlc {
    public zzmd zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlc(zzmd zzmdVar) {
        this.zza = zzmdVar;
    }

    public final void zza(int i5) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i5);
        this.zzb += i5;
    }

    public final void zzb(zzmd zzmdVar) {
        this.zze |= this.zza != zzmdVar;
        this.zza = zzmdVar;
    }

    public final void zzc(int i5) {
        if (this.zzc && this.zzd != 5) {
            zzgrc.zza(i5 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i5;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
