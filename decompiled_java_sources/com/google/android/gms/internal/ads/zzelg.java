package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.emoji2.text.u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzelg implements zzekg {
    private final zzcvc zza;
    private final Context zzb;
    private final zzduv zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final zzgqt zzf;
    private final zzdxt zzg;

    public zzelg(zzcvc zzcvcVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, zzgqt zzgqtVar, zzdxt zzdxtVar) {
        this.zzb = context;
        this.zza = zzcvcVar;
        this.zze = executor;
        this.zzc = zzduvVar;
        this.zzd = zzfjkVar;
        this.zzf = zzgqtVar;
        this.zzg = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final j3.a zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzelg.this.zzc(zzfjcVar, zzfirVar, obj);
            }
        }, this.zze);
    }

    public final j3.a zzc(zzfjc zzfjcVar, zzfir zzfirVar, Object obj) {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzg.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = zzfjq.zza(context, zzfirVar.zzu);
        final zzcjl zza2 = this.zzc.zza(zza, zzfirVar, zzfjcVar.zzb.zzb);
        zza2.zzaw(zzfirVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? zzcvr.zza(context, zza2.zzE(), zzfirVar) : new zzduy(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfirVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzg.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcvc zzcvcVar = this.zza;
        final zzcty zzf = zzcvcVar.zzf(new zzcwv(zzfjcVar, zzfirVar, null), new zzcue(zza3, zza2, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcjl.this.zzh();
            }
        }, zzfjq.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzg.zze(), zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzduu zzj = zzf.zzj();
        zzdxt zzdxtVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdxtVar.zze());
        zzdbx zzd = zzf.zzd();
        zzdbz zzdbzVar = new zzdbz() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjl.this;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        zzd.zzq(zzdbzVar, zzgzyVar);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzj();
        j3.a zzj2 = zzduu.zzj(zza2, zzfiwVar.zzb, str, zzdxtVar.zze(), zzcvcVar.zze());
        if (zzfirVar.zzM) {
            zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzelg.this.zzd(zza2);
            }
        }, this.zze);
        return zzgzo.zzk(zzj2, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcty.this.zzi();
            }
        }, zzgzyVar);
    }

    public final /* synthetic */ void zzd(zzcjl zzcjlVar) {
        zzcjlVar.zzJ();
        zzfjk zzfjkVar = this.zzd;
        zzckr zzh = zzcjlVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfjkVar.zza;
        if (zzgaVar != null && zzh != null) {
            zzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbP)).booleanValue() || zzcjlVar.isAttachedToWindow()) {
            return;
        }
        zzcjlVar.onPause();
        zzcjlVar.zzaG(true);
    }
}
