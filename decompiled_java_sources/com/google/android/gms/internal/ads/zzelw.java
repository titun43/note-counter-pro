package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzelw extends zzcaq implements zzdcp {
    private zzcar zza;
    private zzdco zzb;
    private zzdjx zzc;

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zza(zzdco zzdcoVar) {
        this.zzb = zzdcoVar;
    }

    public final synchronized void zzc(zzcar zzcarVar) {
        this.zza = zzcarVar;
    }

    public final synchronized void zzd(zzdjx zzdjxVar) {
        this.zzc = zzdjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zze(a3.a aVar) {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            final zzekj zzekjVar = ((zzeow) zzdjxVar).zzc;
            final zzfir zzfirVar = ((zzeow) zzdjxVar).zzb;
            final zzfjc zzfjcVar = ((zzeow) zzdjxVar).zza;
            final zzeow zzeowVar = (zzeow) zzdjxVar;
            ((zzeow) zzdjxVar).zzd.zzc().execute(new Runnable(zzeowVar, zzfjcVar, zzfirVar, zzekjVar) { // from class: com.google.android.gms.internal.ads.zzeov
                private final /* synthetic */ zzfjc zza;
                private final /* synthetic */ zzfir zzb;
                private final /* synthetic */ zzekj zzc;

                {
                    this.zza = zzfjcVar;
                    this.zzb = zzfirVar;
                    this.zzc = zzekjVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeoz.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzf(a3.a aVar, int i5) {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            String str = ((zzeow) zzdjxVar).zzc.zza;
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzg(a3.a aVar) {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzh(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzi(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzj(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            zzcarVar.zzj(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzk(a3.a aVar, zzcas zzcasVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(zzcasVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzl(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzm(a3.a aVar, int i5) {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzb(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzn(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzo(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzp(a3.a aVar) {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(null);
        }
    }
}
