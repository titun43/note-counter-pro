package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhwt {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhwt(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhwt zzc() {
        byte[] zza = zzhle.zza(32);
        if (zza.length == 32) {
            return new zzhwt(zzhio.zza(zzhio.zzb(zza)), zza);
        }
        throw new IllegalArgumentException("Given secret seed length is not 32");
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
