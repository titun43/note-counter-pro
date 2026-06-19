package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzier {
    private static final zzieo zza;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (java.lang.System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) goto L4;
     */
    static {
        if (zziem.zza() && zziem.zzb()) {
            int i5 = zziaa.zza;
        }
        zza = new zziep();
    }

    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    public static boolean zzb(byte[] bArr, int i5, int i6) {
        return zza.zza(bArr, i5, i6);
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
                try {
                    int length2 = str.length();
                    while (i6 < length2) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 < 2048) {
                            i5 += (127 - charAt2) >>> 31;
                        } else {
                            i5 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i6) < 65536) {
                                    throw new zzieq(i6, length2);
                                }
                                i6++;
                            }
                        }
                        i6++;
                    }
                    i7 += i5;
                } catch (zzieq unused) {
                    return str.getBytes(zzice.zza).length;
                }
            }
        }
        if (i7 >= length) {
            return i7;
        }
        long j2 = i7 + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzd(String str, byte[] bArr, int i5, int i6) {
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
                        return zzieo.zzc(str, bArr, i5, i6);
                    }
                    i10++;
                    if (i10 != str.length()) {
                        char charAt3 = str.charAt(i10);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i12 = i11 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzieo.zzc(str, bArr, i5, i6);
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

    public static String zze(byte[] bArr, int i5, int i6) {
        int i7;
        int length = bArr.length;
        if ((((length - i5) - i6) | i5 | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        int i8 = i5 + i6;
        char[] cArr = new char[i6];
        int i9 = 0;
        while (i5 < i8) {
            byte b2 = bArr[i5];
            if (!zzien.zza(b2)) {
                break;
            }
            i5++;
            cArr[i9] = (char) b2;
            i9++;
        }
        int i10 = i9;
        while (i5 < i8) {
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (zzien.zza(b5)) {
                cArr[i10] = (char) b5;
                i10++;
                i5 = i11;
                while (i5 < i8) {
                    byte b6 = bArr[i5];
                    if (zzien.zza(b6)) {
                        i5++;
                        cArr[i10] = (char) b6;
                        i10++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i11 >= i8) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i7 = i10 + 1;
                    i5 += 2;
                    zzien.zzb(b5, bArr[i11], cArr, i10);
                } else if (b5 < -16) {
                    if (i11 >= i8 - 1) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i7 = i10 + 1;
                    int i12 = i5 + 2;
                    i5 += 3;
                    zzien.zzc(b5, bArr[i11], bArr[i12], cArr, i10);
                } else {
                    if (i11 >= i8 - 2) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i11];
                    int i13 = i5 + 3;
                    byte b8 = bArr[i5 + 2];
                    i5 += 4;
                    zzien.zzd(b5, b7, b8, bArr[i13], cArr, i10);
                    i10 += 2;
                }
                i10 = i7;
            }
        }
        return new String(cArr, 0, i10);
    }

    public static /* synthetic */ int zzf(byte[] bArr, int i5, int i6) {
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
}
