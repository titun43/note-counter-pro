package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzemx implements zzekm {
    private final Context zza;
    private final zzdmq zzb;
    private zzbui zzc;
    private final VersionInfoParcel zzd;

    public zzemx(Context context, zzdmq zzdmqVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdmqVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcn)).intValue()) {
                zzbvsVar.zzn(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, new a3.b(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
                return;
            }
            String str = zzfirVar.zzU;
            String jSONObject = zzfirVar.zzv.toString();
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            zzbvsVar.zzr(str, jSONObject, zzfjkVar.zzd, new a3.b(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzj);
        } catch (RemoteException e4) {
            throw new zzfjr(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        ArrayList arrayList = zzfjcVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzenv(2, "Unified must be used for RTB.");
        }
        zzdoh zzaf = zzdoh.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzaf.zzx()))) {
            throw new zzenv(1, "No corresponding native ad listener");
        }
        zzdoj zze = this.zzb.zze(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdos(zzaf), new zzdql(null, null, this.zzc));
        ((zzelv) zzekjVar.zzc).zzc(zze.zzg());
        return zze.zzh();
    }

    public final /* synthetic */ void zzc(zzbui zzbuiVar) {
        this.zzc = zzbuiVar;
    }
}
