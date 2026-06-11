package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.MediaView;

/* loaded from: classes.dex */
public final class zzbln {
    private final zzblm zza;

    public zzbln(zzblm zzblmVar) {
        Context context;
        this.zza = zzblmVar;
        try {
            context = (Context) a3.b.b(zzblmVar.zzm());
        } catch (RemoteException | NullPointerException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(new a3.b(new MediaView(context)));
            } catch (RemoteException e5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
            }
        }
    }

    public final zzblm zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            return null;
        }
    }
}
