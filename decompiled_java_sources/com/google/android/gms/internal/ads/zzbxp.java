package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbxp extends a3.d {
    public zzbxp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbxv ? (zzbxv) queryLocalInterface : new zzbxt(iBinder);
    }

    public final zzbxs zza(Activity activity) {
        try {
            IBinder zze = ((zzbxv) getRemoteCreatorInstance(activity)).zze(new a3.b(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbxs ? (zzbxs) queryLocalInterface : new zzbxq(zze);
        } catch (a3.c e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e4);
            return null;
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e5);
            return null;
        }
    }
}
