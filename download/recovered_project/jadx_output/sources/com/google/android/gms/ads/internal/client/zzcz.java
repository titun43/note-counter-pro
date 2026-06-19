package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcz extends zzbcs implements zzdb {
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f5) {
        Parcel zza = zza();
        zza.writeFloat(f5);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(a aVar, String str) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, a aVar) {
        Parcel zza = zza();
        zza.writeString(null);
        zzbcu.zze(zza, aVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() {
        Parcel zzcZ = zzcZ(7, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbtt zzbttVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbttVar);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbqn zzbqnVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbqnVar);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() {
        Parcel zzcZ = zzcZ(13, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzbqg.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzfvVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdnVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzw() {
        zzda(19, zza());
    }
}
