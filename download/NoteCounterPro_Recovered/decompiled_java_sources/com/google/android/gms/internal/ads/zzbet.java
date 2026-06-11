package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbet extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzbex zzb;
    private final AtomicReference zzc;
    private final zzbeu zzd;
    private OnPaidEventListener zze;
    private final AtomicLong zzf;

    public zzbet(zzbex zzbexVar) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzj();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                str = null;
            }
            if (str == null) {
                this.zzc.set(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } else {
                this.zzc.set(str);
            }
            str2 = (String) this.zzc.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j2;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzk);
                    j2 = atomicLong2.get();
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzb.zzg();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            zzeaVar = null;
        }
        return ResponseInfo.zzc(zzeaVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z4) {
        try {
            this.zzb.zzh(z4);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzi(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j2) {
        try {
            this.zzb.zzl(j2);
            this.zzf.set(j2);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.zzb.zzf(new a3.b(activity), this.zzd);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public zzbet(zzbex zzbexVar, String str) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference(str);
    }
}
