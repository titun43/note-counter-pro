package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* loaded from: classes.dex */
public final class zzhih {
    private static final String[] zza = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider zza() {
        String[] strArr = zza;
        for (int i5 = 0; i5 < 3; i5++) {
            Provider provider = Security.getProvider(strArr[i5]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
