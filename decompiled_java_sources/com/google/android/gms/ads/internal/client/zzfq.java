package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbn;

/* loaded from: classes.dex */
public final class zzfq extends zzcay {
    private static void zzu(final zzcbg zzcbgVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbg zzcbgVar2 = zzcbg.this;
                if (zzcbgVar2 != null) {
                    try {
                        zzcbgVar2.zzf(1);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(zzm zzmVar, zzcbg zzcbgVar) {
        zzu(zzcbgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(zzm zzmVar, zzcbg zzcbgVar) {
        zzu(zzcbgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzea zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(zzdt zzdtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(a aVar, boolean z4) {
    }
}
