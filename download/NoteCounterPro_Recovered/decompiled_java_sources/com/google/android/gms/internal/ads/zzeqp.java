package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.b0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzeqp extends com.google.android.gms.ads.internal.client.zzbw {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbk zzb;
    private final zzfjk zzc;
    private final zzctx zzd;
    private final ViewGroup zze;
    private final zzdxz zzf;

    public zzeqp(Context context, com.google.android.gms.ads.internal.client.zzbk zzbkVar, zzfjk zzfjkVar, zzctx zzctxVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzbkVar;
        this.zzc = zzfjkVar;
        this.zzd = zzctxVar;
        this.zzf = zzdxzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zza = zzctxVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        frameLayout.addView(zza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().zzc);
        frameLayout.setMinimumWidth(zzn().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzA() {
        zzctx zzctxVar = this.zzd;
        return zzctxVar != null && zzctxVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzB() {
        return false;
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
    public final com.google.android.gms.ads.internal.client.zzed zzF() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
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

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmY)).booleanValue()) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzerp zzerpVar = this.zzc.zzc;
        if (zzerpVar != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e4) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e4);
            }
            zzerpVar.zzo(zzdtVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(long j2) {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzo() != null) {
            zzctxVar.zzo().zzb(j2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final long zzU() {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return 0L;
        }
        return zzctxVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final a3.a zzb() {
        return new a3.b(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzc() {
        b0.d("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdR(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzf() {
        b0.d("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzg() {
        b0.d("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        zzerp zzerpVar = this.zzc.zzc;
        if (zzerpVar != null) {
            zzerpVar.zzn(zzcoVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        b0.d("getAdSize must be called on the main UI thread.");
        return zzfjq.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        b0.d("setAdSize must be called on the main UI thread.");
        zzctx zzctxVar = this.zzd;
        if (zzctxVar != null) {
            zzctxVar.zzb(this.zze, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbyb zzbybVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbye zzbyeVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzn() != null) {
            return zzctxVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzn() != null) {
            return zzctxVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea zzt() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzu() {
        return this.zzc.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzc.zzo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx(zzbhz zzbhzVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z4) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(a3.a aVar) {
    }
}
