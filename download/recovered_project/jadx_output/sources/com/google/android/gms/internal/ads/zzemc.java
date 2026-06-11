package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzemc implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdlu zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    public zzemc(Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, zzdlu zzdluVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdluVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzduvVar;
        this.zzg = zzbokVar;
        this.zzi = zzejfVar;
        this.zzj = zzdxtVar;
        this.zzk = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final j3.a zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        final zzduz zzduzVar = new zzduz();
        j3.a zza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzemc.this.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zze;
        j3.a zzj = zzgzo.zzj(zza, zzgywVar, executor);
        zzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    public final j3.a zzc(final zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzj.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzd;
        final zzcjl zza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zza.zzaw(zzfirVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzj.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcen zzcenVar = new zzcen();
        zzdlu zzdluVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z4 = this.zzh;
        zzbok zzbokVar = this.zzg;
        final zzdko zzd = zzdluVar.zzd(zzcwvVar, new zzdkr(new zzema(context, versionInfoParcel, zzcenVar, zzfirVar, zza, zzfjkVar, z4, zzbokVar, this.zzi, this.zzk), zza));
        zzcenVar.zzc(zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzj.zze(), zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzd.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjl.this;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        }, zzcei.zzg);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzd.zzl().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzduu zzk = zzd.zzk();
        zzbok zzbokVar2 = true != z4 ? null : zzbokVar;
        zzdxt zzdxtVar = this.zzj;
        zzk.zzi(zza, true, zzbokVar2, zzdxtVar.zze());
        zzd.zzk();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzdluVar.zzc()), new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzdko zzdkoVar = zzd;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzdkoVar.zzh();
            }
        }, this.zze);
    }
}
