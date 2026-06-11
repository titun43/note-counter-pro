package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes.dex */
public final class zzeky implements zzekm {
    private final Context zza;
    private final zzctl zzb;

    public zzeky(Context context, zzctl zzctlVar) {
        this.zza = context;
        this.zzb = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzs(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, new a3.b(this.zza), new zzekx(zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e4);
            throw new zzfjr(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.APP_OPEN_AD);
        zzcti zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null), new zzctj(zzfirVar.zzaa));
        zzemeVar.zzc(zzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzg());
        return zzf.zzh();
    }
}
