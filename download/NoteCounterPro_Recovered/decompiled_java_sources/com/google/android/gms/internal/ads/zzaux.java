package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzaux {
    public final ArrayList zza = new ArrayList();
    public int zzb = 0;

    public zzaux(int i5) {
    }

    public final int zza(long j2) {
        long j5;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = i12 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j6 = jArr[0];
        long j7 = jArr[1];
        long j8 = jArr[2];
        long j9 = jArr[3];
        long j10 = jArr[4];
        long j11 = jArr[5];
        long j12 = jArr[6];
        long j13 = jArr[7];
        long j14 = (((((~j6) & j7) | j8) + ((j6 & j9) | j10)) - j11) + j12;
        long j15 = j13 % 438792350;
        if (j2 >= 0) {
            j5 = (this.zzb + (d5 ^ i13)) - j2;
        } else {
            j5 = (j14 ^ j15) + (-j2);
        }
        if (j5 < 0 || j5 >= this.zzb) {
            throw new zzauv();
        }
        return (int) j5;
    }

    public final void zzb(zzavg zzavgVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = this.zzb;
        if (i13 >= ((i12 % 937558955) ^ d5)) {
            throw new zzauw();
        }
        ArrayList arrayList = this.zza;
        if (i13 == arrayList.size()) {
            arrayList.add(zzavgVar);
        } else {
            arrayList.set(this.zzb, zzavgVar);
        }
        this.zzb++;
    }

    public final zzavg zzc() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = i12 % 459541652;
        int i14 = this.zzb;
        if (i14 <= 0) {
            throw new zzauv();
        }
        int i15 = i13 ^ d5;
        ArrayList arrayList = this.zza;
        zzavg zzavgVar = (zzavg) arrayList.get(i14 + i15);
        arrayList.set(this.zzb + i15, null);
        this.zzb += i15;
        return zzavgVar;
    }

    public final zzavg zzd(long j2) {
        return (zzavg) this.zza.get(zza(j2));
    }

    public final void zze(long j2, zzavg zzavgVar) {
        this.zza.set(zza(j2), zzavgVar);
    }
}
