package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzsy implements zzso {
    public zzsy(zzsx zzsxVar) {
    }

    public static int zza(int i5, int i6, int i7) {
        return zzgxz.zza(((i5 * i6) * i7) / 1000000);
    }

    public static final int zzb(int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 250000;
        if (i7 == 0) {
            int zza = zza(250000, i9, i8);
            int zza2 = zza(750000, i9, i8);
            String str = zzfj.zza;
            return Math.max(zza, Math.min(i5 * 4, zza2));
        }
        if (i7 == 1) {
            return zzgxz.zza((zzc(i6) * 50000000) / 1000000);
        }
        if (i6 == 5) {
            i11 = 500000;
        } else if (i6 == 8) {
            i11 = 1000000;
            i6 = 8;
        }
        return zzgxz.zza((i11 * (i10 != -1 ? zzgxs.zzb(i10, 8, RoundingMode.CEILING) : zzc(i6))) / 1000000);
    }

    private static int zzc(int i5) {
        int zzf = zzaey.zzf(i5);
        zzgrc.zzi(zzf != -2147483647);
        return zzf;
    }
}
