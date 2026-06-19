package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhwu implements zzhbr {
    private final byte[] zza;

    private zzhwu(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        byte[] zzb = zzhio.zzb(bArr);
        this.zza = zzb;
        zzhio.zza(zzb);
    }

    public static zzhbr zzb(zzhsr zzhsrVar) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhvn.zzb(zzhsrVar);
        } catch (GeneralSecurityException unused) {
            return new zzhwu(zzhsrVar.zzf().zzc(zzhax.zza()), zzhsrVar.zze().zze().zzc(), zzhsrVar.zzd().zzc().equals(zzhsp.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
