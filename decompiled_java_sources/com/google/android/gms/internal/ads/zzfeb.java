package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.b0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zzfeb implements zzesf {
    protected final zzcma zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfer zzd;
    private final zzfgj zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfor zzh;
    private final zzfjj zzi;
    private j3.a zzj;

    public zzfeb(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzferVar;
        this.zzi = zzfjjVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcmaVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdal zzg(zzfgh zzfghVar) {
        zzfdy zzfdyVar = (zzfdy) zzfghVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
            zzctu zzctuVar = new zzctu(this.zzg);
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(this.zzb);
            zzdanVar.zzb(zzfdyVar.zza);
            zzdao zze = zzdanVar.zze();
            zzdhe zzdheVar = new zzdhe();
            zzfer zzferVar = this.zzd;
            Executor executor = this.zzc;
            zzdheVar.zzd(zzferVar, executor);
            zzdheVar.zzg(zzferVar, executor);
            return zzc(zzctuVar, zze, zzdheVar.zzn());
        }
        zzfer zzn = zzfer.zzn(this.zzd);
        zzdhe zzdheVar2 = new zzdhe();
        Executor executor2 = this.zzc;
        zzdheVar2.zzc(zzn, executor2);
        zzdheVar2.zzi(zzn, executor2);
        zzdheVar2.zzj(zzn, executor2);
        zzdheVar2.zzk(zzn, executor2);
        zzdheVar2.zzd(zzn, executor2);
        zzdheVar2.zzg(zzn, executor2);
        zzdheVar2.zzl(zzn);
        zzctu zzctuVar2 = new zzctu(this.zzg);
        zzdan zzdanVar2 = new zzdan();
        zzdanVar2.zza(this.zzb);
        zzdanVar2.zzb(zzfdyVar.zza);
        return zzc(zzctuVar2, zzdanVar2.zze(), zzdheVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) {
        Throwable th;
        boolean z4;
        zzfoo zzfooVar;
        zzcth zzcthVar;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) zzbjc.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                                z4 = true;
                                if (this.zzf.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue() || !z4) {
                                    b0.d("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z4 = false;
                    if (this.zzf.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue()) {
                    }
                    b0.d("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfea
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfeb.this.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzbb.zzc();
                }
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzcthVar = (zzcth) this.zze.zzd()) == null) {
                    zzfooVar = null;
                } else {
                    zzfoo zzd = zzcthVar.zzd();
                    zzd.zzi(7);
                    zzd.zzc(zzmVar.zzp);
                    zzd.zzd(zzmVar.zzm);
                    zzfooVar = zzd;
                }
                Context context = this.zzb;
                boolean z5 = zzmVar.zzf;
                zzfkh.zzb(context, z5);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z5) {
                    this.zza.zzw().zzc(true);
                }
                Pair pair = new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz));
                String zza = zzdxh.DYNAMITE_ENTER.zza();
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                Bundle zza2 = zzdxj.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
                zzfjj zzfjjVar = this.zzi;
                zzfjjVar.zzg(str);
                zzfjjVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzfjjVar.zza(zzmVar);
                zzfjjVar.zzv(zza2);
                zzfjk zzA = zzfjjVar.zzA();
                zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 7, zzmVar);
                zzfdy zzfdyVar = new zzfdy(null);
                zzfdyVar.zza = zzA;
                j3.a zzc = this.zze.zzc(new zzfgk(zzfdyVar, null), new zzfgi() { // from class: com.google.android.gms.internal.ads.zzfdz
                    @Override // com.google.android.gms.internal.ads.zzfgi
                    public final /* synthetic */ zzdal zza(zzfgh zzfghVar) {
                        return zzfeb.this.zzf(zzfghVar);
                    }
                }, null);
                this.zzj = zzc;
                zzgzo.zzr(zzc, new zzfdx(this, zzeseVar, zzfooVar, zzo, zzfdyVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        j3.a aVar = this.zzj;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    public abstract zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    public final /* synthetic */ void zze() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzfer zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzfgj zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzk() {
        return this.zzh;
    }

    public final /* synthetic */ void zzl(j3.a aVar) {
        this.zzj = null;
    }
}
