package com.google.android.gms.ads.internal.client;

import a3.b;
import a3.c;
import a3.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyr;

/* loaded from: classes.dex */
public final class zzk extends d {
    private zzbyr zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // a3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzby(iBinder);
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        zzbhe.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            try {
                IBinder zze = ((zzby) getRemoteCreatorInstance(context)).zze(new b(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i5);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(zze);
            } catch (c e4) {
                e = e4;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e5) {
                e = e5;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(new b(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i5);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbx ? (zzbx) queryLocalInterface2 : new zzbv(zze2);
        } catch (RemoteException e6) {
            e = e6;
            Throwable th = e;
            zzbyr zza = zzbyp.zza(context);
            this.zza = zza;
            zza.zzh(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            Throwable th2 = e;
            zzbyr zza2 = zzbyp.zza(context);
            this.zza = zza2;
            zza2.zzh(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            Throwable th22 = e;
            zzbyr zza22 = zzbyp.zza(context);
            this.zza = zza22;
            zza22.zzh(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
            return null;
        }
    }
}
