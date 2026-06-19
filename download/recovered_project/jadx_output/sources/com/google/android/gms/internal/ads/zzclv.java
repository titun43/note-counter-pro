package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzclv {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzclv(int i5, int i6, int i7) {
        this.zzc = i5;
        this.zzb = i6;
        this.zza = i7;
    }

    public static zzclv zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzclv(3, 0, 0) : zzrVar.zzi ? new zzclv(2, 0, 0) : zzrVar.zzh ? new zzclv(0, 0, 0) : new zzclv(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzclv zzb() {
        return new zzclv(0, 0, 0);
    }

    public static zzclv zzc(int i5, int i6) {
        return new zzclv(1, i5, i6);
    }

    public static zzclv zzd() {
        return new zzclv(4, 0, 0);
    }

    public static zzclv zze() {
        return new zzclv(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
