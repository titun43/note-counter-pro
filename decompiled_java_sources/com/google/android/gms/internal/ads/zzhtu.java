package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhtu implements zzhla {
    private static final zzhtu zza = new zzhtu();
    private static final zzhku zzb = zzhku.zzd(zzhtr.zza, zzhjo.class, zzhbs.class);

    public static void zzc() {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) {
        zzhye zzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i5 = 0; i5 < zzhjjVar.zzd(); i5++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i5);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhbs zzhbsVar = (zzhbs) zzhkzVar.zza(zze);
                zzhaz zza2 = zze.zza();
                if (zza2 instanceof zzhuw) {
                    zzd = ((zzhuw) zza2).zze();
                } else {
                    if (!(zza2 instanceof zzhjo)) {
                        String name = zza2.getClass().getName();
                        String valueOf = String.valueOf(zza2.zza());
                        throw new GeneralSecurityException(u.n(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    zzd = ((zzhjo) zza2).zzd();
                }
                zzhkpVar.zza(zzd, new zzhts(zzhbsVar, zze.zzc()));
            }
        }
        return new zzhtt(zzhkpVar.zzb(), !zzhjrVar.zza() ? zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_verify", "verify") : zzhjv.zza);
    }
}
