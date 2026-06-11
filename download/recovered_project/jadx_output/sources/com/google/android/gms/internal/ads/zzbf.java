package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class zzbf {
    public static final zzbf zza = new zzbc();

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int zzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbf)) {
            return false;
        }
        zzbf zzbfVar = (zzbf) obj;
        if (zzbfVar.zza() == zza() && zzbfVar.zzc() == zzc()) {
            zzbe zzbeVar = new zzbe();
            zzbd zzbdVar = new zzbd();
            zzbe zzbeVar2 = new zzbe();
            zzbd zzbdVar2 = new zzbd();
            for (int i5 = 0; i5 < zza(); i5++) {
                if (!zzb(i5, zzbeVar, 0L).equals(zzbfVar.zzb(i5, zzbeVar2, 0L))) {
                    return false;
                }
            }
            for (int i6 = 0; i6 < zzc(); i6++) {
                if (!zzd(i6, zzbdVar, true).equals(zzbfVar.zzd(i6, zzbdVar2, true))) {
                    return false;
                }
            }
            int zzk = zzk(true);
            if (zzk == zzbfVar.zzk(true) && (zzj = zzj(true)) == zzbfVar.zzj(true)) {
                while (zzk != zzj) {
                    int zzh = zzh(zzk, 0, true);
                    if (zzh != zzbfVar.zzh(zzk, 0, true)) {
                        return false;
                    }
                    zzk = zzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int zza2 = zza() + 217;
        int i6 = 0;
        while (true) {
            i5 = zza2 * 31;
            if (i6 >= zza()) {
                break;
            }
            zza2 = i5 + zzb(i6, zzbeVar, 0L).hashCode();
            i6++;
        }
        int zzc = zzc() + i5;
        for (int i7 = 0; i7 < zzc(); i7++) {
            zzc = (zzc * 31) + zzd(i7, zzbdVar, true).hashCode();
        }
        int zzk = zzk(true);
        while (zzk != -1) {
            zzc = (zzc * 31) + zzk;
            zzk = zzh(zzk, 0, true);
        }
        return zzc;
    }

    public abstract int zza();

    public abstract zzbe zzb(int i5, zzbe zzbeVar, long j2);

    public abstract int zzc();

    public abstract zzbd zzd(int i5, zzbd zzbdVar, boolean z4);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i5);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i5, int i6, boolean z4) {
        if (i6 == 0) {
            if (i5 == zzj(z4)) {
                return -1;
            }
            return i5 + 1;
        }
        if (i6 == 1) {
            return i5;
        }
        if (i6 == 2) {
            return i5 == zzj(z4) ? zzk(z4) : i5 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i5, int i6, boolean z4) {
        if (i5 == zzk(false)) {
            return -1;
        }
        return i5 - 1;
    }

    public int zzj(boolean z4) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z4) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i5, zzbd zzbdVar, zzbe zzbeVar, int i6, boolean z4) {
        int i7 = zzd(i5, zzbdVar, false).zzc;
        if (zzb(i7, zzbeVar, 0L).zzo != i5) {
            return i5 + 1;
        }
        int zzh = zzh(i7, i6, z4);
        if (zzh == -1) {
            return -1;
        }
        return zzb(zzh, zzbeVar, 0L).zzn;
    }

    public final Pair zzm(zzbe zzbeVar, zzbd zzbdVar, int i5, long j2) {
        Pair zzn = zzn(zzbeVar, zzbdVar, i5, j2, 0L);
        zzn.getClass();
        return zzn;
    }

    public final Pair zzn(zzbe zzbeVar, zzbd zzbdVar, int i5, long j2, long j5) {
        zzgrc.zzm(i5, zza(), "index");
        zzb(i5, zzbeVar, j5);
        if (j2 == -9223372036854775807L) {
            long j6 = zzbeVar.zzl;
            j2 = 0;
        }
        int i6 = zzbeVar.zzn;
        zzd(i6, zzbdVar, false);
        while (i6 < zzbeVar.zzo) {
            long j7 = zzbdVar.zze;
            if (j2 == 0) {
                break;
            }
            int i7 = i6 + 1;
            long j8 = zzd(i7, zzbdVar, false).zze;
            if (j2 < 0) {
                break;
            }
            i6 = i7;
        }
        zzd(i6, zzbdVar, true);
        long j9 = zzbdVar.zze;
        long j10 = zzbdVar.zzd;
        if (j10 != -9223372036854775807L) {
            j2 = Math.min(j2, j10 - 1);
        }
        long max = Math.max(0L, j2);
        Object obj = zzbdVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbd zzo(Object obj, zzbd zzbdVar) {
        return zzd(zze(obj), zzbdVar, true);
    }
}
