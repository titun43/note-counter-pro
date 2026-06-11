package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhfl extends zzhcg {
    private final zzhfq zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfl(zzhfq zzhfqVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfqVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhfl zzd(zzhfq zzhfqVar, zzhyg zzhygVar, Integer num) {
        zzhye zzb;
        zzhfp zzc = zzhfqVar.zzc();
        zzhfp zzhfpVar = zzhfp.zzb;
        if (zzc != zzhfpVar && num == null) {
            String zzhfpVar2 = zzhfqVar.zzc().toString();
            throw new GeneralSecurityException(h1.b(new StringBuilder(zzhfpVar2.length() + 62), "For given Variant ", zzhfpVar2, " the value of idRequirement must be non-null"));
        }
        if (zzhfqVar.zzc() == zzhfpVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int zzd = zzhygVar.zzd();
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(zzd).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", zzd));
        }
        if (zzhfqVar.zzc() == zzhfpVar) {
            zzb = zzhkh.zza;
        } else {
            if (zzhfqVar.zzc() != zzhfp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfqVar.zzc().toString()));
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfl(zzhfqVar, zzhygVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzc;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhfq zzf() {
        return this.zza;
    }
}
