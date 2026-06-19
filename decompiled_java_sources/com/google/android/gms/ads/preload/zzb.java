package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zzb {
    protected final zzck zza;
    private final AdFormat zzb;
    private final Context zzc;

    public zzb(Context context, AdFormat adFormat) {
        this.zza = com.google.android.gms.ads.zzb.zza(context);
        this.zzc = context.getApplicationContext();
        this.zzb = adFormat;
    }

    public final boolean zzb(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzs(this.zzc, preloadConfiguration, this.zzb), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e4) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            zzo.zzj(sb.toString(), e4);
            return false;
        }
    }

    public final boolean zzc(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzs(this.zzc, preloadConfiguration, this.zzb), null);
        } catch (RemoteException e4) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            zzo.zzj(sb.toString(), e4);
            return false;
        }
    }

    public final boolean zzd(String str) {
        try {
            return this.zza.zzn(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final int zze(String str) {
        try {
            return this.zza.zzt(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return 0;
        }
    }

    public final boolean zzf(String str) {
        try {
            return this.zza.zzu(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.zza.zzv(this.zzb.getValue());
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final Map zzh() {
        try {
            Bundle zzs = this.zza.zzs(this.zzb.getValue());
            HashMap hashMap = new HashMap();
            for (String str : zzs.keySet()) {
                byte[] byteArray = zzs.getByteArray(str);
                if (byteArray != null) {
                    Parcelable.Creator<zzft> creator = zzft.CREATOR;
                    b0.g(creator);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    zzft createFromParcel = creator.createFromParcel(obtain);
                    obtain.recycle();
                    PreloadConfiguration zzq = zzf.zzq(createFromParcel);
                    if (zzq != null) {
                        hashMap.put(str, zzq);
                    }
                }
            }
            return hashMap;
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return new HashMap();
        }
    }

    public final PreloadConfiguration zzi(String str) {
        try {
            zzft zzr = this.zza.zzr(this.zzb.getValue(), str);
            if (zzr == null) {
                return null;
            }
            return zzf.zzq(zzr);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
    }

    public final Context zzj() {
        return this.zzc;
    }
}
