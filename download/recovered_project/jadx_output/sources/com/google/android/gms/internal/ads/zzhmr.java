package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhmr implements zzhla {
    private static final zzhmr zza = new zzhmr();
    private static final zzhku zzb = zzhku.zzd(zzhmo.zza, zzhjo.class, zzhbo.class);

    public static void zzc() {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) {
        zzhjs zzhjsVar;
        zzhjs zzhjsVar2;
        zzhye zzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i5 = 0; i5 < zzhjjVar.zzd(); i5++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i5);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhbo zzhboVar = (zzhbo) zzhkzVar.zza(zze);
                zzhaz zza2 = zze.zza();
                if (zza2 instanceof zzhmm) {
                    zzd = ((zzhmm) zza2).zze();
                } else {
                    if (!(zza2 instanceof zzhjo)) {
                        String name = zza2.getClass().getName();
                        String valueOf = String.valueOf(zza2.zza());
                        throw new GeneralSecurityException(u.n(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    zzd = ((zzhjo) zza2).zzd();
                }
                zzhkpVar.zza(zzd, new zzhmp(zzhboVar, zze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVar2 = zzhjsVar;
        } else {
            zzhjt zzb2 = zzhkb.zza().zzb();
            zzhjs zza3 = zzb2.zza(zzhjjVar, zzhjrVar, "mac", "compute");
            zzhjsVar2 = zzb2.zza(zzhjjVar, zzhjrVar, "mac", "verify");
            zzhjsVar = zza3;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhmq(new zzhmp((zzhbo) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVar2, null);
    }
}
