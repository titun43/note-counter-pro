package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.b0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzequ extends com.google.android.gms.ads.internal.client.zzbw implements zzdeb {
    private final Context zza;
    private final zzfff zzb;
    private final String zzc;
    private final zzerp zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfjj zzf;
    private final VersionInfoParcel zzg;
    private final zzdxz zzh;
    private zzctx zzi;

    public zzequ(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfff zzfffVar, zzerp zzerpVar, VersionInfoParcel versionInfoParcel, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzfffVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzerpVar;
        this.zzf = zzfffVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdxzVar;
        zzfffVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzfjj zzfjjVar = this.zzf;
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            if (zzW()) {
                b0.d("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (!com.google.android.gms.ads.internal.util.zzs.zzM(context) || zzmVar.zzs != null) {
                zzfkh.zzb(context, zzmVar.zzf);
                return this.zzb.zza(zzmVar, this.zzc, null, new zzeqt(this));
            }
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzerp zzerpVar = this.zzd;
            if (zzerpVar != null) {
                zzerpVar.zzdI(zzfkm.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzW() {
        boolean z4;
        if (((Boolean) zzbjc.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                z4 = true;
                return this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue() || !z4;
            }
        }
        z4 = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzA() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            if (zzctxVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzcam zzcamVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzF() {
        b0.d("getVideoController must be called from the main thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null) {
            return null;
        }
        return zzctxVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        try {
            if (zzW()) {
                b0.d("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(zzgaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbfa zzbfaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zzL() {
        zzfff zzfffVar = this.zzb;
        if (zzfffVar.zzh()) {
            zzfffVar.zzc();
        } else {
            zzfffVar.zzk();
        }
    }

    public final /* synthetic */ zzctx zzM() {
        return this.zzi;
    }

    public final /* synthetic */ void zzN(zzctx zzctxVar) {
        this.zzi = zzctxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (zzW()) {
            b0.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzd.zzo(zzdtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzT(long j2) {
        this.zzf.zzx(j2);
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return;
        }
        zzctxVar.zzo().zzb(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized long zzU() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzctxVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        b0.d("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzZ(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzfjj zzfjjVar = this.zzf;
            com.google.android.gms.ads.internal.client.zzr zzf = zzfjjVar.zzf();
            if (this.zzi != null && zzfjjVar.zzC()) {
                zzf = zzfjq.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(zzf);
            zzfjjVar.zzd(true);
            try {
                zzV(zzfjjVar.zzb());
            } catch (RemoteException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final a3.a zzb() {
        if (zzW()) {
            b0.d("getAdFrame must be called on the main UI thread.");
        }
        return new a3.b(this.zzb.zzd());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc() {
        zzctx zzctxVar;
        try {
            if (((Boolean) zzbjc.zze.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmC)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmH)).intValue()) {
                    }
                    zzctxVar = this.zzi;
                    if (zzctxVar == null) {
                        zzctxVar.zzd();
                        return;
                    }
                    return;
                }
            }
            b0.d("destroy must be called on the main UI thread.");
            zzctxVar = this.zzi;
            if (zzctxVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdR(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (zzW()) {
            b0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzf() {
        zzctx zzctxVar;
        try {
            if (((Boolean) zzbjc.zzg.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmD)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmH)).intValue()) {
                    }
                    zzctxVar = this.zzi;
                    if (zzctxVar == null) {
                        zzctxVar.zzl().zza(null);
                        return;
                    }
                    return;
                }
            }
            b0.d("pause must be called on the main UI thread.");
            zzctxVar = this.zzi;
            if (zzctxVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg() {
        zzctx zzctxVar;
        try {
            if (((Boolean) zzbjc.zzh.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmB)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmH)).intValue()) {
                    }
                    zzctxVar = this.zzi;
                    if (zzctxVar == null) {
                        zzctxVar.zzl().zzb(null);
                        return;
                    }
                    return;
                }
            }
            b0.d("resume must be called on the main UI thread.");
            zzctxVar = this.zzi;
            if (zzctxVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        if (zzW()) {
            b0.d("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(zzcoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        b0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        b0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzm() {
        b0.d("recordManualImpression must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        b0.d("getAdSize must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            return zzfjq.zza(this.zza, Collections.singletonList(zzctxVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        b0.d("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbyb zzbybVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbye zzbyeVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzctx zzctxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzctxVar = this.zzi) != null) {
            return zzctxVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx(zzbhz zzbhzVar) {
        b0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbhzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            b0.d("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz(boolean z4) {
        try {
            if (zzW()) {
                b0.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(a3.a aVar) {
    }
}
