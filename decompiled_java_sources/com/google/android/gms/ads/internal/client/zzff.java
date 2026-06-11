package com.google.android.gms.ads.internal.client;

import a3.b;
import a3.c;
import a3.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzff extends d {
    public zzff() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzdc ? (zzdc) queryLocalInterface : new zzdc(iBinder);
    }

    public final zzdb zza(Context context) {
        try {
            IBinder zze = ((zzdc) getRemoteCreatorInstance(context)).zze(new b(context), ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(zze);
        } catch (c e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
