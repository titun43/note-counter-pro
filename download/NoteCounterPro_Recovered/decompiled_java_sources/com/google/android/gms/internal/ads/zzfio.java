package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzfio extends zzcai {
    private final zzfie zza;
    private final zzfhv zzb;
    private final zzfjd zzc;
    private zzdtz zzd;
    private boolean zze = false;

    public zzfio(zzfie zzfieVar, zzfhv zzfhvVar, zzfjd zzfjdVar) {
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzc = zzfjdVar;
    }

    private final synchronized boolean zzy() {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar != null) {
            if (!zzdtzVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzgx)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzcaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(zzcan zzcanVar) {
        b0.d("loadAd must be called on the main UI thread.");
        String str = zzcanVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgv);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        zzfhx zzfhxVar = new zzfhx(null);
        this.zzd = null;
        zzfie zzfieVar = this.zza;
        zzfieVar.zzj(1);
        zzfieVar.zza(zzcanVar.zza, zzcanVar.zzb, zzfhxVar, new zzfim(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzc() {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd(zzcam zzcamVar) {
        b0.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final boolean zze() {
        b0.d("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzh() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzi(a3.a aVar) {
        b0.d("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(aVar == null ? null : (Context) a3.b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzj(a3.a aVar) {
        b0.d("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(aVar == null ? null : (Context) a3.b.b(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzk(a3.a aVar) {
        b0.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (aVar != null) {
                context = (Context) a3.b.b(aVar);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized String zzl() {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzm(String str) {
        b0.d("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzn(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        b0.d("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfin(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final Bundle zzo() {
        b0.d("getAdMetadata can only be called from the UI thread.");
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzp(a3.a aVar) {
        try {
            b0.d("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object b2 = a3.b.b(aVar);
                    if (b2 instanceof Activity) {
                        activity = (Activity) b2;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzq(String str) {
        b0.d("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized void zzr(boolean z4) {
        b0.d("setImmersiveMode must be called on the main UI thread.");
        this.zze = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final boolean zzs() {
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null && zzdtzVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzdtz zzdtzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzd) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzu(zzcah zzcahVar) {
        b0.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzcahVar);
    }

    public final /* synthetic */ zzfjd zzv() {
        return this.zzc;
    }

    public final /* synthetic */ zzdtz zzw() {
        return this.zzd;
    }

    public final /* synthetic */ void zzx(zzdtz zzdtzVar) {
        this.zzd = zzdtzVar;
    }
}
