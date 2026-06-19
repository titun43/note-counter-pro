package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    public zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i5) {
        return new zzgoc(i5, this.zzb, this.zza);
    }

    public final void zzb(int i5) {
        this.zza.zzb(i5 - 1, -1L, null, null);
    }

    public final void zzc(int i5, String str) {
        this.zza.zzb(i5 - 1, -1L, null, str);
    }

    public final void zzd(int i5, Throwable th) {
        this.zza.zzb(i5 - 1, -1L, th, null);
    }

    public final j3.a zze(int i5, j3.a aVar) {
        zzgoc zza = zza(i5);
        zza.zza();
        zzgzo.zzr(aVar, new zzgod(this, zza), zzhaf.zza());
        return aVar;
    }

    public final void zzf(int i5, Runnable runnable) {
        try {
            zza(i5).zza();
            runnable.run();
        } finally {
        }
    }
}
