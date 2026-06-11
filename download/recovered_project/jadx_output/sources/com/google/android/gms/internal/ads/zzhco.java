package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final /* synthetic */ class zzhco implements zzhjb {
    static final /* synthetic */ zzhco zza = new zzhco();

    private /* synthetic */ zzhco() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhcv zzhcvVar = (zzhcv) zzhbpVar;
        int i5 = zzhcr.zza;
        if (zzhcvVar.zzc() != 16 && zzhcvVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzhcm zzhcmVar = new zzhcm(null);
        zzhcmVar.zza(zzhcvVar);
        zzhcmVar.zzd(num);
        zzhcmVar.zzb(zzhyg.zzb(zzhcvVar.zzc()));
        zzhcmVar.zzc(zzhyg.zzb(zzhcvVar.zzd()));
        return zzhcmVar.zze();
    }
}
