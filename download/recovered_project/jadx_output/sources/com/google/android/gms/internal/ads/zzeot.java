package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeot implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdue zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    public zzeot(Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, zzdue zzdueVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdueVar;
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
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzeot.this.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zze;
        j3.a zzj = zzgzo.zzj(zza, zzgywVar, executor);
        zzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzeom
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
        zzdue zzdueVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbok zzbokVar = this.zzg;
        boolean z4 = this.zzh;
        zzejf zzejfVar = this.zzi;
        zzdxt zzdxtVar = this.zzj;
        final zzdua zzf = zzdueVar.zzf(zzcwvVar, new zzdub(new zzeop(context, zzduvVar, zzfjkVar, versionInfoParcel, zzfirVar, zzcenVar, zza, zzbokVar, z4, zzejfVar, zzdxtVar, this.zzk), zza));
        zzcenVar.zzc(zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), zzdxtVar.zze(), zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzbpa.zzb(zza, zzf.zzk());
        zzf.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzeoq
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjl.this;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        }, zzcei.zzg);
        zzf.zzl().zzi(zza, true, true != z4 ? null : zzbokVar, zzdxtVar.zze());
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzo().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzl();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzdueVar.zzd()), new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzdua zzduaVar = zzf;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzduaVar.zzh();
            }
        }, this.zze);
    }
}
