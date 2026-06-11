package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbtx extends zzbcs implements zzbtz {
    public zzbtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzi() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzk() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzl(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzm(zzblm zzblmVar, String str) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzn() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzo() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzp(zzcas zzcasVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzq() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzr(zzcaw zzcawVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzs(int i5) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzt() {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzu() {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzv(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzw(int i5, String str) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zza.writeString(str);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzz() {
        zzda(25, zza());
    }
}
