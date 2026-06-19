package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j2, long j5, long j6, int i5) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2;
        this.zzd = j6;
        this.zze = i5;
    }

    public static zzajs zzd(long j2, long j5, zzafr zzafrVar, zzer zzerVar) {
        int zzs;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(6);
        int zzB = zzerVar2.zzB();
        long j6 = zzafrVar.zzc;
        long j7 = zzB;
        if (zzerVar2.zzB() <= 0) {
            return null;
        }
        long zzr = zzfj.zzr((r4 * zzafrVar.zzg) - 1, zzafrVar.zzd);
        int zzt = zzerVar2.zzt();
        int zzt2 = zzerVar2.zzt();
        int zzt3 = zzerVar2.zzt();
        zzerVar2.zzk(2);
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        int i5 = 0;
        long j8 = j5 + zzafrVar.zzc;
        while (i5 < zzt) {
            long j9 = j6;
            jArr[i5] = (i5 * zzr) / zzt;
            jArr2[i5] = j8;
            if (zzt3 == 1) {
                zzs = zzerVar2.zzs();
            } else if (zzt3 == 2) {
                zzs = zzerVar2.zzt();
            } else if (zzt3 == 3) {
                zzs = zzerVar2.zzx();
            } else {
                if (zzt3 != 4) {
                    return null;
                }
                zzs = zzerVar2.zzH();
            }
            j8 += zzs * zzt2;
            i5++;
            zzerVar2 = zzerVar;
            zzt = zzt;
            j6 = j9;
        }
        long j10 = j5 + j6;
        long j11 = j10 + j7;
        if (j2 != -1 && j2 != j11) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 27 + String.valueOf(j11).length());
            u.t(sb, "VBRI data size mismatch: ", j2, ", ");
            sb.append(j11);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (j11 != j8) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + String.valueOf(j11).length() + 43 + 28);
            u.t(sb2, "VBRI bytes and ToC mismatch (using max): ", j11, ", ");
            sb2.append(j8);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            j11 = Math.max(j11, j8);
        }
        return new zzajs(jArr, jArr2, zzr, j10, j11, zzafrVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long[] jArr = this.zza;
        int zzm = zzfj.zzm(jArr, j2, true, true);
        long j5 = jArr[zzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j5, jArr2[zzm]);
        if (zzafzVar.zzb >= j2 || zzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i5 = zzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i5], jArr2[i5]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return this.zza[zzfj.zzm(this.zzb, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }
}
