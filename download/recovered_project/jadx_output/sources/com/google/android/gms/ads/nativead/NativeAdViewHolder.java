package com.google.android.gms.ads.nativead;

import a3.a;
import a3.b;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzblc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();
    private zzblc zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        b0.h(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzo.zzf("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzo.zzf("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzbb.zzb().zzf(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzd(new b(view));
        } catch (RemoteException e4) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e4);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        a aVar = (a) nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzo.zzi("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzblc zzblcVar = this.zzb;
        if (zzblcVar != null) {
            try {
                zzblcVar.zzb(aVar);
            } catch (RemoteException e4) {
                zzo.zzg("Unable to call setNativeAd on delegate", e4);
            }
        }
    }

    public void unregisterNativeAd() {
        zzblc zzblcVar = this.zzb;
        if (zzblcVar != null) {
            try {
                zzblcVar.zzc();
            } catch (RemoteException e4) {
                zzo.zzg("Unable to call unregisterNativeAd on delegate", e4);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
