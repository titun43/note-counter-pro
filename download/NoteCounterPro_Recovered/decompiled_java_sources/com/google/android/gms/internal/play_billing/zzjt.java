package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzjt {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzjq.zzx() && zzjq.zzy()) {
            int i5 = zzfy.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i5, int i6) {
        int i7 = i6 - i5;
        byte b2 = bArr[i5 - 1];
        if (i7 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(String str, byte[] bArr, int i5, int i6) {
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
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i8 = i10 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i8)))) {
                            throw new zzjs(i10, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i11);
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
                    throw new zzjs(i10 - 1, length);
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

    public static int zzc(String str) {
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
                                throw new zzjs(i6, length2);
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzd(byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            return true;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            int i8 = bArr[i5];
            if (i8 >= 0) {
                i5 = i7;
            } else if (i8 < -32) {
                if (i7 >= i6) {
                    return i8 == 0;
                }
                if (i8 < -62) {
                    return false;
                }
                i5 += 2;
                if (bArr[i7] > 65471) {
                    return false;
                }
            } else if (i8 < -16) {
                if (i7 >= i6 - 1) {
                    i8 = zza(bArr, i7, i6);
                    if (i8 == 0) {
                    }
                } else {
                    int i9 = i5 + 2;
                    char c5 = bArr[i7];
                    if (c5 > 65471) {
                        return false;
                    }
                    if (i8 == -32 && c5 < 65440) {
                        return false;
                    }
                    if (i8 == -19 && c5 >= 65440) {
                        return false;
                    }
                    i5 += 3;
                    if (bArr[i9] > 65471) {
                        return false;
                    }
                }
            } else if (i7 >= i6 - 2) {
                i8 = zza(bArr, i7, i6);
                if (i8 == 0) {
                }
            } else {
                int i10 = i5 + 2;
                int i11 = bArr[i7];
                if (i11 > -65) {
                    return false;
                }
                if ((((i11 + 112) + (i8 << 28)) >> 30) != 0) {
                    return false;
                }
                int i12 = i5 + 3;
                if (bArr[i10] > 65471) {
                    return false;
                }
                i5 += 4;
                if (bArr[i12] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
