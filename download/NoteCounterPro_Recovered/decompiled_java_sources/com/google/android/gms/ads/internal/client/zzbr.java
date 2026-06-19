package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

/* loaded from: classes.dex */
public final class zzbr extends zzbcs implements zzbt {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq zze() {
        zzbq zzboVar;
        Parcel zzcZ = zzcZ(1, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbk zzbkVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbkVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzblq zzblqVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzblt zzbltVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzblz zzblzVar, zzblw zzblwVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzblzVar);
        zzbcu.zze(zza, zzblwVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbkh zzbkhVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbkhVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbmd zzbmdVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmdVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbmg zzbmgVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmgVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbqs zzbqsVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbrb zzbrbVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel zza = zza();
        zzbcu.zzc(zza, adManagerAdViewOptions);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(zzcs zzcsVar) {
        throw null;
    }
}
