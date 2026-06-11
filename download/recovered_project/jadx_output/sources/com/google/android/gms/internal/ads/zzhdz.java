package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzhdz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhdy.zza, zzhdw.class, zzhas.class);
    private static final zzhjb zzc = zzhdx.zza;
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhas.class, zzhqb.SYMMETRIC, zzhpa.zze());

    public static void zza(boolean z4) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i5 = zzhhb.zza;
        zzhhb.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zzc, zzheb.class);
        zzhkc zza2 = zzhkc.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzheb.zzb(zzhea.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzheb.zzb(zzhea.zzc));
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhjc.zza().zzb(zzd, true);
    }
}
