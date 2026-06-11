package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbi;

/* loaded from: classes.dex */
public final class zzfb extends com.google.android.gms.ads.preload.zzb {
    public zzfb(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzcaz zzcazVar;
        try {
            zzcazVar = this.zza.zzq(str);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            zzcazVar = null;
        }
        if (zzcazVar == null) {
            return null;
        }
        return new zzcbi(zzj(), zzcazVar);
    }
}
