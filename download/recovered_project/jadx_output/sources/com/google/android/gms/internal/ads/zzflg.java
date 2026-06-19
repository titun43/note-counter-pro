package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzflg extends u2.a {
    public static final Parcelable.Creator<zzflg> CREATOR = new zzflh();
    public final Context zza;
    public final zzfld zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfld[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzflg(int i5, int i6, int i7, int i8, String str, int i9, int i10) {
        zzfld[] values = zzfld.values();
        this.zzh = values;
        int[] zza = zzfle.zza();
        this.zzl = zza;
        int[] zza2 = zzflf.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i5;
        this.zzb = values[i5];
        this.zzc = i6;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = str;
        this.zzj = i9;
        this.zzg = zza[i9];
        this.zzk = i10;
        int i11 = zza2[i10];
    }

    public static zzflg zza(zzfld zzfldVar, Context context) {
        if (zzfldVar == zzfld.Rewarded) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhu)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhw), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzho), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhq));
        }
        if (zzfldVar == zzfld.Interstitial) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhn)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzht)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhv)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhx), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhp), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhr));
        }
        if (zzfldVar != zzfld.AppOpen) {
            return null;
        }
        return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhy), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhz), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhB));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zzi;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzc;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = this.zzd;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i8);
        int i9 = this.zze;
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(i9);
        z2.b.I(parcel, 5, this.zzf);
        int i10 = this.zzj;
        z2.b.N(parcel, 6, 4);
        parcel.writeInt(i10);
        int i11 = this.zzk;
        z2.b.N(parcel, 7, 4);
        parcel.writeInt(i11);
        z2.b.P(parcel, O);
    }

    private zzflg(Context context, zzfld zzfldVar, int i5, int i6, int i7, String str, String str2, String str3) {
        this.zzh = zzfld.values();
        this.zzl = zzfle.zza();
        this.zzm = zzflf.zza();
        this.zza = context;
        this.zzi = zzfldVar.ordinal();
        this.zzb = zzfldVar;
        this.zzc = i5;
        this.zzd = i6;
        this.zze = i7;
        this.zzf = str;
        int i8 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i8;
        this.zzj = i8 - 1;
        this.zzk = 0;
    }
}
