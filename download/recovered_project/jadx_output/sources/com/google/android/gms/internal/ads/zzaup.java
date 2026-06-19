package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzaup {
    public int zza;
    public zzauk zzb;
    public zzaty zzc;
    public zzaub zzd;

    public zzaup() {
        this(new zzaub(1));
    }

    private final long zzg() {
        int i5 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i6 = 1600766768 % 649830540;
        int i7 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i8 = 1743768897 % 152059765;
        int i9 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i10 = 1861701682 % 1196748250;
        int i11 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i12 = 2091729405 % 1207774949;
        int i13 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i14 = 1050760512 % 184320788;
        int i15 = 0;
        long j2 = 0;
        while (i15 < (i5 ^ i6)) {
            try {
                zzaty zzatyVar = this.zzc;
                zzauk zzaukVar = this.zzb;
                int i16 = i5;
                int i17 = this.zza;
                int i18 = i6;
                this.zza = i17 + 1;
                byte zza = zzatyVar.zza(zzaukVar, i17);
                int i19 = i9 ^ i10;
                j2 |= ((i7 ^ i8) & zza) << i15;
                if (i15 == i19) {
                    if (zza > 1) {
                        throw new zzaum();
                    }
                    i15 = i19;
                }
                if ((zza & (i11 ^ i12)) == 0) {
                    return (j2 >>> 1) ^ (-(1 & j2));
                }
                i15 += i13 ^ i14;
                i5 = i16;
                i6 = i18;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzauo(e4);
            }
        }
        throw new zzaum();
    }

    private static final void zzh(long j2) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j5 = jArr[0];
        long j6 = jArr[1];
        long j7 = jArr[2];
        long j8 = jArr[3];
        long j9 = jArr[4];
        long j10 = jArr[5];
        if (j2 % (((((((~j5) & j6) | j7) + ((j5 & j8) | j9)) - j10) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzaun();
        }
    }

    public final void zza(long j2) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j5 = jArr[0];
        long j6 = jArr[1];
        long j7 = jArr[2];
        long j8 = jArr[3];
        long j9 = jArr[4];
        long j10 = jArr[5];
        long j11 = jArr[6];
        long j12 = jArr[7];
        zzh(j2);
        long j13 = j2 / (((((((~j5) & j6) | j7) + ((j5 & j8) | j9)) - j10) + j11) ^ (j12 % 899334107));
        if (j13 < 0 || j13 > this.zzb.zza.length) {
            throw new zzauo();
        }
        this.zza = (int) j13;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j2 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        return this.zza * (((((((~j2) & j5) | j6) + ((j2 & j7) | j8)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() {
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            this.zza = this.zza + 1;
            return zzatyVar.zza(zzaukVar, r2);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzauo(e4);
        }
    }

    public final int zzd() {
        int i5 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i6 = 1609416931 % 1031126087;
        int i7 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i8 = 1723578341 % 672563970;
        int i9 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i10 = 1124734562 % 530406424;
        int i11 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i12 = 529302443 % 418646579;
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            int i13 = this.zza;
            this.zza = i13 + 1;
            int i14 = i5 ^ i6;
            int zza = zzatyVar.zza(zzaukVar, i13) & i14;
            zzaty zzatyVar2 = this.zzc;
            zzauk zzaukVar2 = this.zzb;
            int i15 = this.zza;
            this.zza = i15 + 1;
            int zza2 = zza | ((zzatyVar2.zza(zzaukVar2, i15) & i14) << (i7 ^ i8));
            zzaty zzatyVar3 = this.zzc;
            zzauk zzaukVar3 = this.zzb;
            int i16 = this.zza;
            this.zza = i16 + 1;
            int zza3 = zza2 | ((i14 & zzatyVar3.zza(zzaukVar3, i16)) << (i9 ^ i10));
            zzaty zzatyVar4 = this.zzc;
            zzauk zzaukVar4 = this.zzb;
            int i17 = this.zza;
            this.zza = i17 + 1;
            return zza3 | (zzatyVar4.zza(zzaukVar4, i17) << (i11 ^ i12));
        } catch (IndexOutOfBoundsException e4) {
            throw new zzauo(e4);
        }
    }

    public final long zze() {
        return zzg();
    }

    public final zzauk zzf(long j2) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzh(zzb() + j2);
        int i13 = this.zza;
        long j5 = i13;
        zzauk zzaukVar = this.zzb;
        long j6 = (j2 >> ((i12 % 774318984) ^ d5)) + j5;
        if (j6 > zzaukVar.zza.length || j6 < j5) {
            throw new zzauo();
        }
        try {
            int i14 = (int) j6;
            zzauk zzb = this.zzc.zzb(zzaukVar, i13, i14);
            this.zza = i14;
            return zzb;
        } catch (IndexOutOfBoundsException e4) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e4);
        }
    }

    public zzaup(zzaub zzaubVar) {
        this(zzauk.zzb, 0, new zzatz());
        this.zzd = zzaubVar;
    }

    private zzaup(zzauk zzaukVar, int i5, zzaty zzatyVar) {
        this.zzb = zzaukVar;
        this.zza = i5;
        this.zzc = zzatyVar;
    }

    public zzaup(zzauk zzaukVar, int i5, zzaty zzatyVar, zzaub zzaubVar) {
        this(zzaukVar, i5, zzatyVar);
        this.zzd = zzaubVar;
    }
}
