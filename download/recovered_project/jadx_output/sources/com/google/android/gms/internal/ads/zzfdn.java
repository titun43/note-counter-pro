package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfdn implements zzfax {
    private final zzcdu zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgzy zzd;
    private final int zze;
    private final int zzf;

    public zzfdn(zzcdu zzcduVar, boolean z4, zzcdk zzcdkVar, zzgzy zzgzyVar, String str, ScheduledExecutorService scheduledExecutorService, int i5, int i6) {
        this.zza = zzcduVar;
        this.zzb = z4;
        this.zzd = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zze = i5;
        this.zzf = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhV)).booleanValue() && this.zzb) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (this.zzf == 2) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgzo.zza(new zzfdo(null));
        }
        j3.a zza = zzgzo.zza(null);
        zzgzy zzgzyVar = this.zzd;
        return zzgzo.zzg(zzgzo.zzi(zzgzo.zzk(zza, zzfdm.zza, zzgzyVar), ((Long) zzbjt.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzfdn.this.zzc((Exception) obj);
            }
        }, zzgzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzfdo zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfdo(null);
    }
}
