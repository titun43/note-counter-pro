package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzhdt {
    private Integer zza = null;
    private zzhdu zzb = zzhdu.zzc;

    private zzhdt() {
    }

    public final zzhdt zza(int i5) {
        if (i5 != 16 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhdt zzb(zzhdu zzhduVar) {
        this.zzb = zzhduVar;
        return this;
    }

    public final zzhdv zzc() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzhdv(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzhdt(byte[] bArr) {
    }
}
