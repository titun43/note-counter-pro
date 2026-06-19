package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzsy {
    static {
        if (zzsw.zzx() && zzsw.zzy()) {
            int i5 = zzpc.zza;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(String str, byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        char charAt;
        int length = str.length();
        int i10 = 0;
        while (true) {
            i7 = i5 + i6;
            if (i10 >= length || (i9 = i10 + i5) >= i7 || (charAt = str.charAt(i10)) >= 128) {
                break;
            }
            bArr[i9] = (byte) charAt;
            i10++;
        }
        int i11 = i5 + i10;
        while (i10 < length) {
            char charAt2 = str.charAt(i10);
            if (charAt2 < 128 && i11 < i7) {
                bArr[i11] = (byte) charAt2;
                i11++;
            } else if (charAt2 < 2048 && i11 <= i7 - 2) {
                bArr[i11] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                i11 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i11 > i7 - 3) {
                    if (i11 > i7 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i8 = i10 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i8)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new zzsx(i10, length);
                    }
                    int i12 = i10 + 1;
                    if (i12 != str.length()) {
                        char charAt3 = str.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i13 = i11 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                            i10 = i12;
                        } else {
                            i10 = i12;
                        }
                    }
                    throw new zzsx(i10 - 1, length);
                }
                bArr[i11] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i11 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                i11 += 3;
            }
            i10++;
        }
        return i11;
    }

    public static int zzb(String str) {
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = str.charAt(i6);
            if (charAt < 2048) {
                i7 += (127 - charAt) >>> 31;
                i6++;
            } else {
                int length2 = str.length();
                while (i6 < length2) {
                    char charAt2 = str.charAt(i6);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i6) < 65536) {
                                throw new zzsx(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i7 += i5;
            }
        }
        if (i7 >= length) {
            return i7;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i7 + 4294967296L));
    }
}
