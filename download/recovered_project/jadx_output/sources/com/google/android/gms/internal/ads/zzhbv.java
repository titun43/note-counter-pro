package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhbv {
    public static byte[] zza(zzhbp zzhbpVar) {
        return ((zzhlc) zzhkg.zza().zzk(zzhbpVar, zzhlc.class)).zzc().zzaN();
    }

    public static zzhbp zzb(byte[] bArr) {
        try {
            zzhqf zzd = zzhqf.zzd(bArr, zzibb.zza());
            zzhkg zza = zzhkg.zza();
            zzhlc zzb = zzhlc.zzb(zzd);
            return !zza.zzi(zzb) ? new zzhjp(zzb) : zza.zzj(zzb);
        } catch (IOException e4) {
            throw new GeneralSecurityException("Failed to parse proto", e4);
        }
    }
}
