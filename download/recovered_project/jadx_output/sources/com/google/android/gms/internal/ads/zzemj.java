package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes.dex */
public final class zzemj implements zzekm {
    private final Context zza;
    private final zzdlu zzb;

    public zzemj(Context context, zzdlu zzdluVar) {
        this.zza = context;
        this.zzb = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzj(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, new a3.b(this.zza), new zzemi(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e4);
            throw new zzfjr(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.INTERSTITIAL);
        zzdko zzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null));
        zzemeVar.zzc(zzd.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzd.zzg());
        return zzd.zzh();
    }
}
