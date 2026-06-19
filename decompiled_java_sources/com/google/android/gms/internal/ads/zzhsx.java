package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhsx extends zzhuw {
    private final zzhsq zza;
    private final zzhye zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhsx(zzhsq zzhsqVar, zzhye zzhyeVar, zzhye zzhyeVar2, Integer num) {
        this.zza = zzhsqVar;
        this.zzb = zzhyeVar;
        this.zzc = zzhyeVar2;
        this.zzd = num;
    }

    public static zzhsx zzc(zzhsp zzhspVar, zzhye zzhyeVar, Integer num) {
        zzhye zza;
        zzhsq zzb = zzhsq.zzb(zzhspVar);
        zzhsp zzhspVar2 = zzhsp.zzd;
        if (!zzhspVar.equals(zzhspVar2) && num == null) {
            String zzhspVar3 = zzhspVar.toString();
            throw new GeneralSecurityException(h1.b(new StringBuilder(zzhspVar3.length() + 62), "For given Variant ", zzhspVar3, " the value of idRequirement must be non-null"));
        }
        if (zzhspVar.equals(zzhspVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhyeVar.zzd() != 32) {
            int zzd = zzhyeVar.zzd();
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(zzd).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", zzd));
        }
        if (zzb.zzc() == zzhspVar2) {
            zza = zzhkh.zza;
        } else if (zzb.zzc() == zzhsp.zzb || zzb.zzc() == zzhsp.zzc) {
            zza = zzhkh.zza(num.intValue());
        } else {
            if (zzb.zzc() != zzhsp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb.zzc().toString()));
            }
            zza = zzhkh.zzb(num.intValue());
        }
        return new zzhsx(zzb, zzhyeVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhye zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhsq zzf() {
        return this.zza;
    }
}
