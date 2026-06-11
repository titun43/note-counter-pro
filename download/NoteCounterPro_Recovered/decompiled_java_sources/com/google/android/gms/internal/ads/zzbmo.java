package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzbmo extends a3.d {
    public zzbmo() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbkz ? (zzbkz) queryLocalInterface : new zzbkx(iBinder);
    }

    public final zzbkw zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbkz) getRemoteCreatorInstance(context)).zze(new a3.b(context), new a3.b(frameLayout), new a3.b(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbkw ? (zzbkw) queryLocalInterface : new zzbku(zze);
        } catch (a3.c e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
