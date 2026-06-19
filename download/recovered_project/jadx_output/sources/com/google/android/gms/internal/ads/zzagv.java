package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzagv implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzagv(int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.zza = i5;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
    }

    public static zzagv zzb(zzer zzerVar) {
        int zzC = zzerVar.zzC();
        zzerVar.zzk(12);
        int zzC2 = zzerVar.zzC();
        int zzC3 = zzerVar.zzC();
        int zzC4 = zzerVar.zzC();
        zzerVar.zzk(4);
        int zzC5 = zzerVar.zzC();
        int zzC6 = zzerVar.zzC();
        zzerVar.zzk(4);
        return new zzagv(zzC, zzC2, zzC3, zzC4, zzC5, zzC6, zzerVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i5 = this.zza;
        if (i5 == 1935960438) {
            return 2;
        }
        if (i5 == 1935963489) {
            return 1;
        }
        if (i5 == 1937012852) {
            return 3;
        }
        zzee.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i5))));
        return -1;
    }

    public final long zzd() {
        return zzfj.zzt(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
