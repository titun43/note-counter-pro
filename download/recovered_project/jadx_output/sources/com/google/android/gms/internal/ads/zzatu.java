package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzatu {
    public static byte[] zza() {
        int i5 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i6 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        ByteBuffer allocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ u.d((i8 & (~i7)) | i9, (i7 & i10) | i11, i12, i13));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i6);
        allocate.putInt(i5);
        return allocate.array();
    }
}
