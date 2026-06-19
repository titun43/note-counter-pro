package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* loaded from: classes.dex */
public final class zzbkh extends u2.a {
    public static final Parcelable.Creator<zzbkh> CREATOR = new zzbki();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzga zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbkh(int i5, boolean z4, int i6, boolean z5, int i7, com.google.android.gms.ads.internal.client.zzga zzgaVar, boolean z6, int i8, int i9, boolean z7, int i10) {
        this.zza = i5;
        this.zzb = z4;
        this.zzc = i6;
        this.zzd = z5;
        this.zze = i7;
        this.zzf = zzgaVar;
        this.zzg = z6;
        this.zzh = i8;
        this.zzj = z7;
        this.zzi = i9;
        this.zzk = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NativeAdOptions zza(zzbkh zzbkhVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbkhVar == null) {
            return builder.build();
        }
        int i5 = zzbkhVar.zza;
        int i6 = 2;
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbkhVar.zzg);
                    builder.setMediaAspectRatio(zzbkhVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbkhVar.zzi, zzbkhVar.zzj);
                    int i7 = zzbkhVar.zzk;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            i6 = 3;
                        }
                        builder.zzi(i6);
                    }
                    i6 = 1;
                    builder.zzi(i6);
                }
                builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
                builder.setRequestMultipleImages(zzbkhVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
        }
        builder.setAdChoicesPlacement(zzbkhVar.zze);
        builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
        builder.setRequestMultipleImages(zzbkhVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        boolean z4 = this.zzb;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i7 = this.zzc;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i7);
        boolean z5 = this.zzd;
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i8 = this.zze;
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(i8);
        z2.b.H(parcel, 6, this.zzf, i5);
        boolean z6 = this.zzg;
        z2.b.N(parcel, 7, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i9 = this.zzh;
        z2.b.N(parcel, 8, 4);
        parcel.writeInt(i9);
        int i10 = this.zzi;
        z2.b.N(parcel, 9, 4);
        parcel.writeInt(i10);
        boolean z7 = this.zzj;
        z2.b.N(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        int i11 = this.zzk;
        z2.b.N(parcel, 11, 4);
        parcel.writeInt(i11);
        z2.b.P(parcel, O);
    }

    @Deprecated
    public zzbkh(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
