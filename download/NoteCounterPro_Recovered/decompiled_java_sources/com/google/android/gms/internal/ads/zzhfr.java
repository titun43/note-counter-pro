package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhfr extends zzhcg {
    private final zzhfx zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfr(zzhfx zzhfxVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfxVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhfr zzd(zzhfw zzhfwVar, zzhyg zzhygVar, Integer num) {
        zzhye zzb;
        zzhfw zzhfwVar2 = zzhfw.zzc;
        if (zzhfwVar != zzhfwVar2 && num == null) {
            String zzhfwVar3 = zzhfwVar.toString();
            throw new GeneralSecurityException(h1.b(new StringBuilder(zzhfwVar3.length() + 62), "For given Variant ", zzhfwVar3, " the value of idRequirement must be non-null"));
        }
        if (zzhfwVar == zzhfwVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int zzd = zzhygVar.zzd();
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(zzd).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzd));
        }
        zzhfx zzb2 = zzhfx.zzb(zzhfwVar);
        if (zzb2.zzc() == zzhfwVar2) {
            zzb = zzhkh.zza;
        } else if (zzb2.zzc() == zzhfw.zzb) {
            zzb = zzhkh.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhfw.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfr(zzb2, zzhygVar, zzb, num);
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

    public final zzhfx zzf() {
        return this.zza;
    }
}
