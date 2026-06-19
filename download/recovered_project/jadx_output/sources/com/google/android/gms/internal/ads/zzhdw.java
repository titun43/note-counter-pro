package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhdw extends zzhcg {
    private final zzheb zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhdw(zzheb zzhebVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhebVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhdw zzd(zzhea zzheaVar, zzhyg zzhygVar, Integer num) {
        zzhye zzb;
        zzhea zzheaVar2 = zzhea.zzc;
        if (zzheaVar != zzheaVar2 && num == null) {
            String zzheaVar3 = zzheaVar.toString();
            throw new GeneralSecurityException(h1.b(new StringBuilder(zzheaVar3.length() + 62), "For given Variant ", zzheaVar3, " the value of idRequirement must be non-null"));
        }
        if (zzheaVar == zzheaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int zzd = zzhygVar.zzd();
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(zzd).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzd));
        }
        zzheb zzb2 = zzheb.zzb(zzheaVar);
        if (zzb2.zzc() == zzheaVar2) {
            zzb = zzhkh.zza;
        } else if (zzb2.zzc() == zzhea.zzb) {
            zzb = zzhkh.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhea.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhkh.zzb(num.intValue());
        }
        return new zzhdw(zzb2, zzhygVar, zzb, num);
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

    public final zzheb zzf() {
        return this.zza;
    }
}
