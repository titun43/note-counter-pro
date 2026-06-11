package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzeb extends zzbcs implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() {
        Parcel zzcZ = zzcZ(4, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(zzeg zzegVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzegVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final zzeg zzo() {
        zzeg zzeeVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzeeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzeeVar = queryLocalInterface instanceof zzeg ? (zzeg) queryLocalInterface : new zzee(readStrongBinder);
        }
        zzcZ.recycle();
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() {
        zzda(13, zza());
    }
}
