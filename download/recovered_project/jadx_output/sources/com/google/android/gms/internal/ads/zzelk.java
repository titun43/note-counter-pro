package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzelk implements zzekm {
    private final Context zza;
    private final zzcvc zzb;
    private final Executor zzc;

    public zzelk(Context context, zzcvc zzcvcVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfjkVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfjq.zza(this.zza, zzfirVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            ((zzfki) zzekjVar.zzb).zzb(this.zza, zzrVar3, zzfjkVar.zzd, zzfirVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfirVar.zzs), (zzbtz) zzekjVar.zzc);
        } else {
            ((zzfki) zzekjVar.zzb).zzg(this.zza, zzrVar3, zzfjkVar.zzd, zzfirVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfirVar.zzs), (zzbtz) zzekjVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, final zzfir zzfirVar, zzekj zzekjVar) {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            zzbuc zzc = ((zzfki) zzekjVar.zzb).zzc();
            if (zzc == null) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfjr(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) a3.b.b(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfjr(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeli
                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ j3.a zza(Object obj) {
                                return zzelk.this.zzc(zza, zzfirVar, obj);
                            }
                        }, zzcei.zzf).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        throw new zzfjr(e4);
                    }
                }
            } catch (RemoteException e5) {
                throw new zzfjr(e5);
            }
        } else {
            zza = ((zzfki) zzekjVar.zzb).zza();
        }
        zzcvc zzcvcVar = this.zzb;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza);
        final zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        Objects.requireNonNull(zzfkiVar);
        zzcty zzf2 = zzcvcVar.zzf(zzcwvVar, new zzcue(zza, null, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfki.this.zzt();
            }
        }, (zzfis) zzfirVar.zzu.get(0)));
        zzf2.zzk().zza(zza);
        zzf2.zza().zzq(new zzcrl(zzfkiVar), this.zzc);
        ((zzelv) zzekjVar.zzc).zzc(zzf2.zzf());
        return zzf2.zzi();
    }

    public final /* synthetic */ j3.a zzc(View view, zzfir zzfirVar, Object obj) {
        return zzgzo.zza(zzcvr.zza(this.zza, view, zzfirVar));
    }
}
