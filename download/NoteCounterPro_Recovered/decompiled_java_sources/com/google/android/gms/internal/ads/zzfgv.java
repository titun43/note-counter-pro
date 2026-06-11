package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfgv implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzfhv zze;
    private zzbhz zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private j3.a zzi;

    public zzfgv(Context context, Executor executor, zzcma zzcmaVar, zzerp zzerpVar, zzfhv zzfhvVar, zzfjj zzfjjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zzh = zzfjjVar;
        this.zze = zzfhvVar;
        this.zzg = zzcmaVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) {
        zzdlu zzh;
        zzfoo zzfooVar;
        if (str == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfgv.this.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfgo) zzesdVar).zza;
        Pair pair = new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz));
        String zza = zzdxh.DYNAMITE_ENTER.zza();
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        Bundle zza2 = zzdxj.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
        zzfjj zzfjjVar = this.zzh;
        zzfjjVar.zzg(str);
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zza(zzmVar);
        zzfjjVar.zzv(zza2);
        Context context = this.zza;
        zzfjk zzA = zzfjjVar.zzA();
        zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
            zzdlt zzm = this.zzc.zzm();
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(context);
            zzdanVar.zzb(zzA);
            zzm.zze(zzdanVar.zze());
            zzdhe zzdheVar = new zzdhe();
            zzerp zzerpVar = this.zzd;
            Executor executor = this.zzb;
            zzdheVar.zzm(zzerpVar, executor);
            zzdheVar.zze(zzerpVar, executor);
            zzm.zzf(zzdheVar.zzn());
            zzm.zzd(new zzepw(this.zzf));
            zzh = zzm.zzh();
        } else {
            zzdhe zzdheVar2 = new zzdhe();
            zzfhv zzfhvVar = this.zze;
            if (zzfhvVar != null) {
                Executor executor2 = this.zzb;
                zzdheVar2.zza(zzfhvVar, executor2);
                zzdheVar2.zzb(zzfhvVar, executor2);
                zzdheVar2.zzc(zzfhvVar, executor2);
            }
            zzdlt zzm2 = this.zzc.zzm();
            zzdan zzdanVar2 = new zzdan();
            zzdanVar2.zza(context);
            zzdanVar2.zzb(zzA);
            zzm2.zze(zzdanVar2.zze());
            zzerp zzerpVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdheVar2.zzm(zzerpVar2, executor3);
            zzdheVar2.zza(zzerpVar2, executor3);
            zzdheVar2.zzb(zzerpVar2, executor3);
            zzdheVar2.zzc(zzerpVar2, executor3);
            zzdheVar2.zzf(zzerpVar2, executor3);
            zzdheVar2.zzg(zzerpVar2, executor3);
            zzdheVar2.zze(zzerpVar2, executor3);
            zzdheVar2.zzk(zzerpVar2, executor3);
            zzdheVar2.zzd(zzerpVar2, executor3);
            zzm2.zzf(zzdheVar2.zzn());
            zzm2.zzd(new zzepw(this.zzf));
            zzh = zzm2.zzh();
        }
        zzdlu zzdluVar = zzh;
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfooVar = zzdluVar.zzc();
            zzfooVar.zzi(4);
            zzfooVar.zzc(zzmVar.zzp);
            zzfooVar.zzd(zzmVar.zzm);
        } else {
            zzfooVar = null;
        }
        zzfoo zzfooVar2 = zzfooVar;
        zzcxj zzb = zzdluVar.zzb();
        j3.a zzc = zzb.zzc(zzb.zzb());
        this.zzi = zzc;
        zzgzo.zzr(zzc, new zzfgt(this, zzeseVar, zzfooVar2, zzo, zzdluVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        j3.a aVar = this.zzi;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    public final void zzc(zzbhz zzbhzVar) {
        this.zzf = zzbhzVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzerp zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfhv zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(j3.a aVar) {
        this.zzi = null;
    }
}
