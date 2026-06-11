package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class zzhhz implements zzhas {
    private static final ThreadLocal zza = new zzhhx();

    public static zzhas zzb(zzhdo zzhdoVar) {
        return zzhgq.zzc(zzhdoVar, zzhhy.zza);
    }

    public static /* synthetic */ Cipher zzc() {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e4) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
