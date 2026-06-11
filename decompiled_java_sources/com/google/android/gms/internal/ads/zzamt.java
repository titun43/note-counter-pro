package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class zzamt implements zzamf {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzams zzc = new zzams();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i6 + i5);
        zzerVar.zzh(i5);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzams zzamsVar = this.zzc;
        zzamsVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() >= 3) {
            int zze = zzerVar.zze();
            int zzs = zzerVar.zzs();
            int zzt = zzerVar.zzt();
            int zzg = zzerVar.zzg() + zzt;
            zzcx zzcxVar = null;
            if (zzg > zze) {
                zzerVar.zzh(zze);
            } else {
                if (zzs != 128) {
                    switch (zzs) {
                        case 20:
                            zzamsVar.zzc(zzerVar, zzt);
                            break;
                        case zzbgj.zzt.zzm /* 21 */:
                            zzamsVar.zzd(zzerVar, zzt);
                            break;
                        case 22:
                            zzamsVar.zze(zzerVar, zzt);
                            break;
                    }
                } else {
                    zzcxVar = zzamsVar.zza();
                    zzamsVar.zzb();
                }
                zzerVar.zzh(zzg);
            }
            if (zzcxVar != null) {
                arrayList.add(zzcxVar);
            }
        }
        zzdrVar.zza(new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
