package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhne implements zzhlx {
    private zzhne(zzhlp zzhlpVar, Provider provider) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhlpVar.zze().zzc();
            zzhlpVar.zzf();
            new SecretKeySpec(zzhlpVar.zzd().zzc(zzhax.zza()), "AES");
        } catch (NoSuchAlgorithmException e4) {
            throw new GeneralSecurityException("AES-CMAC not available.", e4);
        }
    }

    public static zzhlx zza(zzhlp zzhlpVar, Provider provider) {
        return new zzhne(zzhlpVar, provider);
    }
}
