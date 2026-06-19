package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhyb {
    public static String zza(zzhxn zzhxnVar) {
        zzhyc.zzb(zzhxnVar);
        return zzhxnVar.toString().concat("withECDSA");
    }

    public static String zzb(zzhxn zzhxnVar) {
        int ordinal = zzhxnVar.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzhxnVar.toString()));
    }
}
