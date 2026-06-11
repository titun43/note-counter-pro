package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzafg zzk;
    private final zzap zzl;

    public zzafh(int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j2, zzafg zzafgVar, zzap zzapVar) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = zzf(i9);
        this.zzg = i10;
        this.zzh = i11;
        this.zzi = zzg(i11);
        this.zzj = j2;
        this.zzk = zzafgVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i5) {
        switch (i5) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i5) {
        if (i5 == 8) {
            return 1;
        }
        if (i5 == 12) {
            return 2;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 20) {
            return 5;
        }
        if (i5 != 24) {
            return i5 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j2 = this.zzj;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.zze;
    }

    public final long zzb(long j2) {
        String str = zzfj.zza;
        return Math.max(0L, Math.min((j2 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzv zzc(byte[] bArr, zzap zzapVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzap zzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzm("audio/flac");
        int i5 = this.zzd;
        if (i5 <= 0) {
            i5 = -1;
        }
        zztVar.zzn(i5);
        zztVar.zzE(this.zzg);
        zztVar.zzF(this.zze);
        zztVar.zzG(zzfj.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzp(Collections.singletonList(bArr));
        zztVar.zzk(zzd);
        return zztVar.zzM();
    }

    public final zzap zzd(zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }

    public final zzafh zze(zzafg zzafgVar) {
        return new zzafh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzafgVar, this.zzl);
    }

    public zzafh(byte[] bArr, int i5) {
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        zzeqVar.zzf(i5 * 8);
        this.zza = zzeqVar.zzj(16);
        this.zzb = zzeqVar.zzj(16);
        this.zzc = zzeqVar.zzj(24);
        this.zzd = zzeqVar.zzj(24);
        int zzj = zzeqVar.zzj(20);
        this.zze = zzj;
        this.zzf = zzf(zzj);
        this.zzg = zzeqVar.zzj(3) + 1;
        int zzj2 = zzeqVar.zzj(5) + 1;
        this.zzh = zzj2;
        this.zzi = zzg(zzj2);
        this.zzj = zzeqVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
