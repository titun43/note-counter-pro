package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzfii extends zzcay {
    private final zzfie zza;
    private final zzfhv zzb;
    private final String zzc;
    private final zzfjd zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzazh zzg;
    private final zzdxz zzh;
    private zzdtz zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbk)).booleanValue();

    public zzfii(String str, zzfie zzfieVar, Context context, zzfhv zzfhvVar, zzfjd zzfjdVar, VersionInfoParcel versionInfoParcel, zzazh zzazhVar, zzdxz zzdxzVar) {
        this.zzc = str;
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzd = zzfjdVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzazhVar;
        this.zzh = zzdxzVar;
    }

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar, int i5) {
        try {
            if (!zzmVar.zzb()) {
                boolean z4 = false;
                if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                        z4 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue() || !z4) {
                    b0.d("#008 Must be called on the main UI thread.");
                }
            }
            zzfhv zzfhvVar = this.zzb;
            zzfhvVar.zzh(zzcbgVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzM(this.zze) && zzmVar.zzs == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfhvVar.zzdI(zzfkm.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfhx zzfhxVar = new zzfhx(null);
            zzfie zzfieVar = this.zza;
            zzfieVar.zzj(i5);
            zzfieVar.zza(zzmVar, this.zzc, zzfhxVar, new zzfih(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzb(a3.a aVar) {
        zzk(aVar, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        zzx(zzmVar, zzcbgVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        zzx(zzmVar, zzcbgVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) {
        b0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfig(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() {
        b0.d("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzh(zzcbn zzcbnVar) {
        b0.d("#008 Must be called on the main UI thread.");
        zzfjd zzfjdVar = this.zzd;
        zzfjdVar.zza = zzcbnVar.zza;
        zzfjdVar.zzb = zzcbnVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        b0.d("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return (zzdtzVar == null || zzdtzVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized String zzj() {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzk(a3.a aVar, boolean z4) {
        b0.d("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfkm.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z4, (Activity) a3.b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() {
        b0.d("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar != null) {
            return zzdtzVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        zzdtz zzdtzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzi) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        b0.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzb.zzl(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzp(boolean z4) {
        b0.d("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized long zzq() {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return 0L;
        }
        return zzdtzVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzr(long j2) {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return;
        }
        zzdtzVar.zzo().zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) {
        b0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzcbhVar);
    }

    public final /* synthetic */ zzfjd zzu() {
        return this.zzd;
    }

    public final /* synthetic */ zzdtz zzv() {
        return this.zzi;
    }

    public final /* synthetic */ void zzw(zzdtz zzdtzVar) {
        this.zzi = zzdtzVar;
    }
}
