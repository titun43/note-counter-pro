package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhcf {
    public static final /* synthetic */ int zza = 0;
    private static final zzhix zzb = zzb();

    public static zzhaw zza() {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzhix zzb() {
        try {
            zzhkv zza2 = zzhky.zza();
            zzhcl.zzd(zza2);
            zza2.zza(zzhku.zzd(zzhcd.zza, zzhcn.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhcb.zza, zzhdf.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhcc.zza, zzhdo.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhca.zza, zzhcx.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhbz.zza, zzhdw.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhby.zza, zzhfr.class, zzhas.class));
            zza2.zza(zzhku.zzd(zzhce.zza, zzhfl.class, zzhas.class));
            return zzhix.zzb(zza2.zzc());
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
