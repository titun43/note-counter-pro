package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzcts extends zzbew {
    private final zzctr zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzfer zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbn)).booleanValue();
    private final zzdxz zze;

    public zzcts(zzctr zzctrVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzfer zzferVar, zzdxz zzdxzVar) {
        this.zza = zzctrVar;
        this.zzb = zzbxVar;
        this.zzc = zzferVar;
        this.zze = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(a3.a aVar, zzbfe zzbfeVar) {
        try {
            this.zzc.zzp(zzbfeVar);
            this.zza.zzb((Activity) a3.b.b(aVar), zzbfeVar, this.zzd);
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z4) {
        this.zzd = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        b0.d("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e4);
            }
            this.zzc.zzr(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return 0L;
        }
        return zzctrVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j2) {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return;
        }
        zzctrVar.zzo().zzb(j2);
    }
}
