package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhno extends zzhnr {
    private final int zza;

    private zzhno(int i5) {
        this.zza = i5;
    }

    public static zzhno zzb(int i5) {
        if (i5 == 16 || i5 == 32) {
            return new zzhno(i5);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i5 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhno) && ((zzhno) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhno.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i5 = this.zza;
        return u.m(new StringBuilder(String.valueOf(i5).length() + 34), "AesCmac PRF Parameters (", i5, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
