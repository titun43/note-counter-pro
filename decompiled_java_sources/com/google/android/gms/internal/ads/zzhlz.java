package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhlz implements zzhla {
    private static final zzhlz zza = new zzhlz();

    private zzhlz() {
    }

    public static void zzc() {
        zzhkd.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) {
        zzhye zzd;
        zzhbi zzc = ((zzhbk) zzhjjVar).zzc();
        zzhkp zzhkpVar = new zzhkp();
        for (int i5 = 0; i5 < zzhjjVar.zzd(); i5++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i5);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhlx zzhlxVar = (zzhlx) zzhkzVar.zza(zze);
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
                zzhkpVar.zza(zzd, zzhlxVar);
            }
        }
        return new zzhly(zzhkpVar.zzb(), (zzhlx) zzhkzVar.zza(zzc), null);
    }
}
