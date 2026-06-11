package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzna {
    private static final zzmx zza;

    static {
        if (zzmv.zzx() && zzmv.zzy()) {
            int i5 = zzin.zza;
        }
        zza = new zzmy();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i5, int i6) {
        byte b2 = bArr[i5 - 1];
        int i7 = i6 - i5;
        if (i7 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i7 == 1) {
            byte b5 = bArr[i5];
            if (b2 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b2;
        }
        if (i7 != 2) {
            throw new AssertionError();
        }
        byte b6 = bArr[i5];
        byte b7 = bArr[i5 + 1];
        if (b2 > -12 || b6 > -65 || b7 > -65) {
            return -1;
        }
        return (b7 << 16) ^ ((b6 << 8) ^ b2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(CharSequence charSequence, byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        char charAt;
        int length = charSequence.length();
        int i9 = i6 + i5;
        int i10 = 0;
        while (i10 < length && (i8 = i10 + i5) < i9 && (charAt = charSequence.charAt(i10)) < 128) {
            bArr[i8] = (byte) charAt;
            i10++;
        }
        int i11 = i5 + i10;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 < 128 && i11 < i9) {
                bArr[i11] = (byte) charAt2;
                i11++;
            } else if (charAt2 < 2048 && i11 <= i9 - 2) {
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 >>> 6) | 960);
                i11 += 2;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i11 > i9 - 3) {
                    if (i11 > i9 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i7 = i10 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i7)))) {
                            throw new zzmz(i10, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i11);
                    }
                    int i13 = i10 + 1;
                    if (i13 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i14 = i11 + 3;
                            bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i10 = i13;
                        } else {
                            i10 = i13;
                        }
                    }
                    throw new zzmz(i10 - 1, length);
                }
                bArr[i11] = (byte) ((charAt2 >>> '\f') | 480);
                int i15 = i11 + 2;
                bArr[i11 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i11 += 3;
                bArr[i15] = (byte) ((charAt2 & '?') | 128);
            }
            i10++;
        }
        return i11;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i6);
            if (charAt < 2048) {
                i7 += (127 - charAt) >>> 31;
                i6++;
            } else {
                int length2 = charSequence.length();
                while (i6 < length2) {
                    char charAt2 = charSequence.charAt(i6);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i6) < 65536) {
                                throw new zzmz(i6, length2);
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

    public static String zzd(byte[] bArr, int i5, int i6) {
        int length = bArr.length;
        if ((i5 | i6 | ((length - i5) - i6)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        int i7 = i5 + i6;
        char[] cArr = new char[i6];
        int i8 = 0;
        while (i5 < i7) {
            byte b2 = bArr[i5];
            if (!zzmw.zzd(b2)) {
                break;
            }
            i5++;
            cArr[i8] = (char) b2;
            i8++;
        }
        int i9 = i8;
        while (i5 < i7) {
            int i10 = i5 + 1;
            byte b5 = bArr[i5];
            if (zzmw.zzd(b5)) {
                cArr[i9] = (char) b5;
                i9++;
                i5 = i10;
                while (i5 < i7) {
                    byte b6 = bArr[i5];
                    if (!zzmw.zzd(b6)) {
                        break;
                    }
                    i5++;
                    cArr[i9] = (char) b6;
                    i9++;
                }
            } else if (b5 < -32) {
                if (i10 >= i7) {
                    throw zzkm.zzc();
                }
                i5 += 2;
                zzmw.zzc(b5, bArr[i10], cArr, i9);
                i9++;
            } else if (b5 < -16) {
                if (i10 >= i7 - 1) {
                    throw zzkm.zzc();
                }
                int i11 = i5 + 2;
                i5 += 3;
                zzmw.zzb(b5, bArr[i10], bArr[i11], cArr, i9);
                i9++;
            } else {
                if (i10 >= i7 - 2) {
                    throw zzkm.zzc();
                }
                int i12 = i5 + 2;
                int i13 = i5 + 3;
                i5 += 4;
                zzmw.zza(b5, bArr[i10], bArr[i12], bArr[i13], cArr, i9);
                i9 += 2;
            }
        }
        return new String(cArr, 0, i9);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i5, int i6) {
        return zza.zzb(bArr, i5, i6);
    }
}
