package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhxr implements zzhnp {
    public static zzhnp zzb(zzhnn zzhnnVar) {
        zzhnp zzb = zzhnt.zzb(zzhnnVar);
        try {
            return new zzhxq(zzb, zzhnu.zzb(zzhnnVar), null);
        } catch (GeneralSecurityException unused) {
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i5) {
        throw null;
    }
}
