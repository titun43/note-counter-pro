package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zzhle {
    private static final ThreadLocal zza = new zzhld();

    public static byte[] zza(int i5) {
        byte[] bArr = new byte[i5];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    public static /* synthetic */ SecureRandom zzb() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    private static SecureRandom zzc() {
        Provider zza2 = zzhih.zza();
        if (zza2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (Throwable unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
