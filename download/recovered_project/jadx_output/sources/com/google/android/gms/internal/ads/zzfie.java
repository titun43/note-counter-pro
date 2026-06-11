package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfie implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzfhv zzd;
    private final zzfgj zze;
    private final zzfjd zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private j3.a zzi;

    public zzfie(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfhv zzfhvVar, zzfjj zzfjjVar, zzfjd zzfjdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzfhvVar;
        this.zzh = zzfjjVar;
        this.zzf = zzfjdVar;
        this.zzg = zzcmaVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdud zze(zzfgh zzfghVar) {
        zzdud zzp = this.zzc.zzp();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(((zzfid) zzfghVar).zza);
        zzdanVar.zzf(this.zzf);
        zzp.zzd(zzdanVar.zze());
        zzp.zze(new zzdhe().zzn());
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) {
        zzfoo zzfooVar;
        zzcan zzcanVar = new zzcan(zzmVar, str);
        String str2 = zzcanVar.zzb;
        if (str2 == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfie.this.zzc();
                }
            });
            return false;
        }
        j3.a aVar = this.zzi;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfgj zzfgjVar = this.zze;
            if (zzfgjVar.zzd() != null) {
                zzfoo zzd = ((zzdue) zzfgjVar.zzd()).zzd();
                zzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzcanVar.zza;
                zzd.zzc(zzmVar2.zzp);
                zzd.zzd(zzmVar2.zzm);
                zzfooVar = zzd;
                Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzcanVar.zza;
                boolean z4 = zzmVar3.zzf;
                zzfkh.zzb(context, z4);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z4) {
                    this.zzc.zzw().zzc(true);
                }
                Pair pair = new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz));
                String zza = zzdxh.DYNAMITE_ENTER.zza();
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                Bundle zza2 = zzdxj.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
                zzfjj zzfjjVar = this.zzh;
                zzfjjVar.zzg(str2);
                zzfjjVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzfjjVar.zza(zzmVar3);
                zzfjjVar.zzv(zza2);
                zzfjk zzA = zzfjjVar.zzA();
                zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 5, zzmVar3);
                zzfid zzfidVar = new zzfid(null);
                zzfidVar.zza = zzA;
                j3.a zzc = this.zze.zzc(new zzfgk(zzfidVar, null), new zzfgi() { // from class: com.google.android.gms.internal.ads.zzfib
                    @Override // com.google.android.gms.internal.ads.zzfgi
                    public final /* synthetic */ zzdal zza(zzfgh zzfghVar) {
                        return zzfie.this.zzd(zzfghVar);
                    }
                }, null);
                this.zzi = zzc;
                zzgzo.zzr(zzc, new zzfia(this, zzeseVar, zzfooVar, zzo, zzfidVar), this.zzb);
                return true;
            }
        }
        zzfooVar = null;
        Context context2 = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzcanVar.zza;
        boolean z42 = zzmVar32.zzf;
        zzfkh.zzb(context2, z42);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
            this.zzc.zzw().zzc(true);
        }
        Pair pair2 = new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar32.zzz));
        String zza3 = zzdxh.DYNAMITE_ENTER.zza();
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        Bundle zza22 = zzdxj.zza(pair2, new Pair(zza3, Long.valueOf(System.currentTimeMillis())));
        zzfjj zzfjjVar2 = this.zzh;
        zzfjjVar2.zzg(str2);
        zzfjjVar2.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfjjVar2.zza(zzmVar32);
        zzfjjVar2.zzv(zza22);
        zzfjk zzA2 = zzfjjVar2.zzA();
        zzfoe zzo2 = zzfoe.zzo(context2, zzfon.zzg(zzA2), 5, zzmVar32);
        zzfid zzfidVar2 = new zzfid(null);
        zzfidVar2.zza = zzA2;
        j3.a zzc2 = this.zze.zzc(new zzfgk(zzfidVar2, null), new zzfgi() { // from class: com.google.android.gms.internal.ads.zzfib
            @Override // com.google.android.gms.internal.ads.zzfgi
            public final /* synthetic */ zzdal zza(zzfgh zzfghVar) {
                return zzfie.this.zzd(zzfghVar);
            }
        }, null);
        this.zzi = zzc2;
        zzgzo.zzr(zzc2, new zzfia(this, zzeseVar, zzfooVar, zzo2, zzfidVar2), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfhv zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfgj zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzi() {
        return this.zzg;
    }

    public final void zzj(int i5) {
        this.zzh.zzj().zza(i5);
    }
}
