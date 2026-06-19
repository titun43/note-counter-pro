package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzfxd {
    final zzfxg zza;
    final boolean zzb;

    private zzfxd(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
        this.zzb = zzfxgVar != null;
    }

    public static zzfxd zzb(Context context, String str, String str2) {
        zzfxg zzfxeVar;
        try {
            try {
                try {
                    IBinder b2 = b3.e.c(context, b3.e.f717b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b2 == null) {
                        zzfxeVar = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfxeVar = queryLocalInterface instanceof zzfxg ? (zzfxg) queryLocalInterface : new zzfxe(b2);
                    }
                    zzfxeVar.zzj(new a3.b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfxd(zzfxeVar);
                } catch (Exception e4) {
                    throw new zzfwg(e4);
                }
            } catch (RemoteException | zzfwg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfxd(new zzfxh());
            }
        } catch (Exception e5) {
            throw new zzfwg(e5);
        }
    }

    public static zzfxd zzc() {
        zzfxh zzfxhVar = new zzfxh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfxd(zzfxhVar);
    }

    public final zzfxc zza(byte[] bArr) {
        return new zzfxc(this, bArr, null);
    }
}
