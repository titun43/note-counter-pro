package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzhnf implements zzhlx {
    public zzhnf(zzhlp zzhlpVar) {
    }

    public static zzhlx zza(zzhlp zzhlpVar) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza = zzhih.zza();
        if (zza != null) {
            try {
                return zzhne.zza(zzhlpVar, zza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhnf(zzhlpVar);
    }
}
