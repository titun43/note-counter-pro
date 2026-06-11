package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbkm extends NativeAd.AdChoicesInfo {
    private final zzbkl zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbkm(zzbkl zzbklVar) {
        zzbks zzbksVar;
        this.zza = zzbklVar;
        try {
            this.zzc = zzbklVar.zzb();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            this.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbksVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(iBinder);
                } else {
                    zzbksVar = null;
                }
                if (zzbksVar != null) {
                    this.zzb.add(new zzbkt(zzbksVar));
                }
            }
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
