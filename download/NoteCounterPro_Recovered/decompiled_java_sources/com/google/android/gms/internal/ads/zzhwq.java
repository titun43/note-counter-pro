package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzhwq {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i5) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhwp zzhwpVar = new zzhwp(2, new byte[(length * 3) / 4]);
        if (!zzhwpVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i6 = zzhwpVar.zzb;
        byte[] bArr = zzhwpVar.zza;
        if (i6 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, 0, bArr2, 0, i6);
        return bArr2;
    }
}
