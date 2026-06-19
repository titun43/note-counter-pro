package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzieo {
    public static final int zzc(String str, byte[] bArr, int i5, int i6) {
        byte[] bytes = str.getBytes(zzice.zza);
        int length = bytes.length;
        if (length - i5 > i6) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i5, length);
        return i5 + length;
    }

    public final boolean zza(byte[] bArr, int i5, int i6) {
        return zzb(0, bArr, i5, i6) == 0;
    }

    public abstract int zzb(int i5, byte[] bArr, int i6, int i7);
}
