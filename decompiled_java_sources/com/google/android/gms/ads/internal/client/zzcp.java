package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdd;

/* loaded from: classes.dex */
public final class zzcp extends zzbcs implements zzcr {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(a aVar, zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(a aVar, zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(a aVar, String str, zzbtt zzbttVar, int i5) {
        zzbt zzbrVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(3, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbrVar = queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbkw zze(a aVar, a aVar2) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        Parcel zzcZ = zzcZ(5, zza);
        zzbkw zzdF = zzbkv.zzdF(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaj zzf(a aVar, zzbtt zzbttVar, int i5) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxs zzg(a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(8, zza);
        zzbxs zzI = zzbxr.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(a aVar, zzbtt zzbttVar, int i5) {
        zzck zzciVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(18, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzciVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzciVar = queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(readStrongBinder);
        }
        zzcZ.recycle();
        return zzciVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(a aVar, int i5) {
        zzdb zzczVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(9, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzczVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzczVar = queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(readStrongBinder);
        }
        zzcZ.recycle();
        return zzczVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(a aVar, zzr zzrVar, String str, int i5) {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zza.writeString(str);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(10, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzblc zzk(a aVar, a aVar2, a aVar3) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        Parcel zzcZ = zzcZ(11, zza);
        zzblc zze = zzblb.zze(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaz zzl(a aVar, String str, zzbtt zzbttVar, int i5) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(12, zza);
        zzcaz zzt = zzcay.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(a aVar, zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(13, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcdd zzn(a aVar, zzbtt zzbttVar, int i5) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(14, zza);
        zzcdd zzb = zzcdc.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxl zzo(a aVar, zzbtt zzbttVar, int i5) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(15, zza);
        zzbxl zzb = zzbxk.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbpk zzp(a aVar, zzbtt zzbttVar, int i5, zzbph zzbphVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbcu.zze(zza, zzbphVar);
        Parcel zzcZ = zzcZ(16, zza);
        zzbpk zzb = zzbpj.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(a aVar, zzbtt zzbttVar, int i5) {
        zzdw zzduVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(17, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzduVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzduVar = queryLocalInterface instanceof zzdw ? (zzdw) queryLocalInterface : new zzdu(readStrongBinder);
        }
        zzcZ.recycle();
        return zzduVar;
    }
}
