package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfxc {
    final /* synthetic */ zzfxd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfxc(zzfxd zzfxdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfxdVar);
        this.zza = zzfxdVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfxd zzfxdVar = this.zza;
            if (zzfxdVar.zzb) {
                zzfxg zzfxgVar = zzfxdVar.zza;
                zzfxgVar.zzg(this.zzb);
                zzfxgVar.zzh(this.zzc);
                zzfxgVar.zzi(this.zzd);
                zzfxgVar.zzf(null);
                zzfxgVar.zze();
            }
        } catch (RemoteException e4) {
            Log.d("GASS", "Clearcut log failed", e4);
        }
    }

    public final zzfxc zzb(int i5) {
        this.zzc = i5;
        return this;
    }

    public final zzfxc zzc(int i5) {
        this.zzd = i5;
        return this;
    }
}
