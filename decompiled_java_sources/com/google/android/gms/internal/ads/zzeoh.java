package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes.dex */
public final class zzeoh implements zzekm {
    private final Context zza;
    private final zzdue zzb;

    public zzeoh(Context context, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzp.zza == 3) {
                zzbvsVar.zzp(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, new a3.b(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            } else {
                zzbvsVar.zzl(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, new a3.b(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.REWARDED);
        zzdua zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(zzemeVar));
        zzemeVar.zzc(zzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzn());
        return zzf.zzh();
    }
}
