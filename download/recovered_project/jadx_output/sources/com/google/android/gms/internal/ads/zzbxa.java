package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes.dex */
public final class zzbxa implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzblm zza;

    public zzbxa(zzblm zzblmVar) {
        this.zza = zzblmVar;
        try {
            zzblmVar.zzr();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzq(new a3.b(view));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            return false;
        }
    }
}
