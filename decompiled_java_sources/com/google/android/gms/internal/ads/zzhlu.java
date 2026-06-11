package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzhlu {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhlv zzc = zzhlv.zzd;

    private zzhlu() {
    }

    public final zzhlu zza(int i5) {
        if (i5 != 16 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i5 * 8)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhlu zzb(int i5) {
        if (i5 < 10 || i5 > 16) {
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(i5).length() + 40), "Invalid tag size for AesCmacParameters: ", i5));
        }
        this.zzb = Integer.valueOf(i5);
        return this;
    }

    public final zzhlu zzc(zzhlv zzhlvVar) {
        this.zzc = zzhlvVar;
        return this;
    }

    public final zzhlw zzd() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhlw(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhlu(byte[] bArr) {
    }
}
