package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzepf implements zzdco {
    boolean zza;
    final /* synthetic */ zzekj zzb;
    final /* synthetic */ zzcen zzc;

    public zzepf(zzepi zzepiVar, zzekj zzekjVar, zzcen zzcenVar) {
        this.zzb = zzekjVar;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzepiVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i5 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgy)).booleanValue()) {
            i5 = 3;
        }
        this.zzc.zzd(new zzekk(i5, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzb(int i5) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i5, zzepi.zze(this.zzb.zza, i5), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzc(int i5, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzepi.zze(this.zzb.zza, i5);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i5, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
