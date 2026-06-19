package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b3.e;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjn;

/* loaded from: classes.dex */
abstract class zzba {
    private static final zzcr zza;

    static {
        zzcr zzcrVar = null;
        try {
            Object newInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcrVar = queryLocalInterface instanceof zzcr ? (zzcr) queryLocalInterface : new zzcp(iBinder);
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzcrVar;
    }

    private final Object zze() {
        zzcr zzcrVar = zza;
        if (zzcrVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzcrVar);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e4);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzb();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e4);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb();

    public abstract Object zzc(zzcr zzcrVar);

    public final Object zzd(Context context, boolean z4) {
        boolean z5;
        Object zze;
        if (!z4) {
            zzbb.zza();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 12451000)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z4 = true;
            }
        }
        boolean z6 = false;
        boolean z7 = !(e.a(context, ModuleDescriptor.MODULE_ID) <= e.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbhe.zza(context);
        if (((Boolean) zzbiz.zza.zze()).booleanValue()) {
            z5 = false;
        } else if (((Boolean) zzbiz.zzb.zze()).booleanValue()) {
            z5 = true;
            z6 = true;
        } else {
            z6 = z4 | z7;
            z5 = false;
        }
        if (z6) {
            zze = zze();
            if (zze == null && !z5) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzbb.zzh().nextInt(((Long) zzbjn.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.zza().zzh(context, zzbb.zzg().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        return zze == null ? zza() : zze;
    }
}
