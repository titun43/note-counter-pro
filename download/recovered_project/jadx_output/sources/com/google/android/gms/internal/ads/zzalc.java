package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzald[] zzl;

    public zzalc(int i5, int i6, long j2, long j5, long j6, long j7, zzv zzvVar, int i7, zzald[] zzaldVarArr, int i8, long[] jArr, long[] jArr2) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = j2;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
        this.zzg = zzvVar;
        this.zzh = i7;
        this.zzl = zzaldVarArr;
        this.zzk = i8;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzald zza(int i5) {
        return this.zzl[i5];
    }

    public final zzalc zzb(zzv zzvVar) {
        return new zzalc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
