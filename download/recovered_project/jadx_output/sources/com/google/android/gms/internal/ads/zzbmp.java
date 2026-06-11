package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzbmp extends a3.d {
    public zzbmp() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzblf ? (zzblf) queryLocalInterface : new zzbld(iBinder);
    }

    public final zzblc zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzblf) getRemoteCreatorInstance(view.getContext())).zze(new a3.b(view), new a3.b(hashMap), new a3.b(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzblc ? (zzblc) queryLocalInterface : new zzbla(zze);
        } catch (a3.c e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
