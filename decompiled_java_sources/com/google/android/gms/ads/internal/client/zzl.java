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
public final class zzl extends d {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcl(iBinder);
    }

    public final zzck zza(Context context, zzbtt zzbttVar) {
        try {
            IBinder zze = ((zzcl) getRemoteCreatorInstance(context)).zze(new b(context), zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            return queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(zze);
        } catch (c e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
