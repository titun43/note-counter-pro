package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbzu extends u2.a {
    public static final Parcelable.Creator<zzbzu> CREATOR = new zzbzv();
    public final Bundle zza;
    public final VersionInfoParcel zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzflg zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final int zzo;

    public zzbzu(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzflg zzflgVar, String str4, boolean z4, boolean z5, Bundle bundle2, Bundle bundle3, int i5) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzflgVar;
        this.zzj = str4;
        this.zzk = z4;
        this.zzl = z5;
        this.zzm = bundle2;
        this.zzn = bundle3;
        this.zzo = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Bundle bundle = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.E(parcel, 1, bundle);
        z2.b.H(parcel, 2, this.zzb, i5);
        z2.b.H(parcel, 3, this.zzc, i5);
        z2.b.I(parcel, 4, this.zzd);
        z2.b.K(parcel, 5, this.zze);
        z2.b.H(parcel, 6, this.zzf, i5);
        z2.b.I(parcel, 7, this.zzg);
        z2.b.I(parcel, 9, this.zzh);
        z2.b.H(parcel, 10, this.zzi, i5);
        z2.b.I(parcel, 11, this.zzj);
        boolean z4 = this.zzk;
        z2.b.N(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzl;
        z2.b.N(parcel, 13, 4);
        parcel.writeInt(z5 ? 1 : 0);
        z2.b.E(parcel, 14, this.zzm);
        z2.b.E(parcel, 15, this.zzn);
        int i6 = this.zzo;
        z2.b.N(parcel, 16, 4);
        parcel.writeInt(i6);
        z2.b.P(parcel, O);
    }
}
