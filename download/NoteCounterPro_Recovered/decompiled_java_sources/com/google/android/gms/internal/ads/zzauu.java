package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes.dex */
public final class zzauu {
    public final ArrayDeque zza = new ArrayDeque();

    public zzauu(int i5) {
    }

    public final void zza(long j2, long j5, long j6) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        zzaur zzaurVar = new zzaur(j2, j5, j6);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= (u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11) ^ (i12 % 452867621))) {
            throw new zzaus();
        }
        arrayDeque.push(zzaurVar);
    }

    public final zzaur zzb() {
        return (zzaur) Optional.ofNullable((zzaur) this.zza.peek()).orElseThrow(zzauq.zza);
    }
}
