package com.google.android.gms.internal.ads;

import h3.n;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfcg implements zzfax {
    private final zzcdu zza;
    private final ScheduledExecutorService zzb;
    private final zzgzy zzc;

    public zzfcg(String str, zzbfg zzbfgVar, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.zza = zzcduVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdP)).booleanValue()) {
                n nVar = new n();
                nVar.e(null);
                j3.a zza = zzgat.zza(nVar, null);
                zzgzy zzgzyVar = this.zzc;
                j3.a zzj = zzgzo.zzj(zza, zzfcf.zza, zzgzyVar);
                if (((Boolean) zzbir.zza.zze()).booleanValue()) {
                    zzj = zzgzo.zzi(zzj, ((Long) zzbir.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgzo.zzg(zzj, Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfce
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return zzfcg.this.zzc((Exception) obj);
                    }
                }, zzgzyVar);
            }
        }
        return zzgzo.zza(new zzfch(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzfch zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfch(null, -1);
    }
}
