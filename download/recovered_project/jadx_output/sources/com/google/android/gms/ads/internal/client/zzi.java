package com.google.android.gms.ads.internal.client;

import a3.b;
import a3.c;
import a3.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: classes.dex */
public final class zzi extends d {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbu(iBinder);
    }

    public final zzbt zza(Context context, String str, zzbtt zzbttVar) {
        try {
            IBinder zze = ((zzbu) getRemoteCreatorInstance(context)).zze(new b(context), str, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(zze);
        } catch (c e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
