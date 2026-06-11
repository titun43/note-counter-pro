package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zziep extends zzieo {
    @Override // com.google.android.gms.internal.ads.zzieo
    public final int zzb(int i5, byte[] bArr, int i6, int i7) {
        while (i6 < i7 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i7) {
            return 0;
        }
        while (i6 < i7) {
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i6 = i8;
            } else {
                if (b2 < -32) {
                    if (i8 >= i7) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i6 += 2;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i8 >= i7 - 2) {
                        return zzier.zzf(bArr, i8, i7);
                    }
                    int i9 = i6 + 2;
                    byte b5 = bArr[i8];
                    if (b5 <= -65) {
                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i10 = i6 + 3;
                            if (bArr[i9] <= -65) {
                                i6 += 4;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i8 >= i7 - 1) {
                    return zzier.zzf(bArr, i8, i7);
                }
                int i11 = i6 + 2;
                byte b6 = bArr[i8];
                if (b6 > -65 || (b2 == -32 && b6 < -96)) {
                    return -1;
                }
                if (b2 == -19 && b6 >= -96) {
                    return -1;
                }
                i6 += 3;
                if (bArr[i11] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
