package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzajt {
    public final zzafr zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzajt(zzafr zzafrVar, long j2, long j5, long[] jArr, int i5, int i6) {
        this.zza = new zzafr(zzafrVar);
        this.zzb = j2;
        this.zzc = j5;
        this.zzf = jArr;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzajt zza(zzafr zzafrVar, zzer zzerVar) {
        long[] jArr;
        int i5;
        int i6;
        int zzB = zzerVar.zzB();
        int zzH = (zzB & 1) != 0 ? zzerVar.zzH() : -1;
        long zzz = (zzB & 2) != 0 ? zzerVar.zzz() : -1L;
        if ((zzB & 4) == 4) {
            jArr = new long[100];
            for (int i7 = 0; i7 < 100; i7++) {
                jArr[i7] = zzerVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((zzB & 8) != 0) {
            zzerVar.zzk(4);
        }
        if (zzerVar.zzd() >= 24) {
            zzerVar.zzk(21);
            int zzx = zzerVar.zzx();
            i6 = zzx & 4095;
            i5 = zzx >> 12;
        } else {
            i5 = -1;
            i6 = -1;
        }
        return new zzajt(zzafrVar, zzH, zzz, jArr2, i5, i6);
    }

    public final long zzb() {
        long j2 = this.zzb;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        return zzfj.zzr((j2 * r4.zzg) - 1, this.zza.zzd);
    }
}
