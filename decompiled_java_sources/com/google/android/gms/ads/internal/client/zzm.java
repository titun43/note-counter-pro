package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzm extends a {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    public final long zzA;
    public final Bundle zzB = new Bundle();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfx zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public zzm(int i5, long j2, Bundle bundle, int i6, List list, boolean z4, int i7, boolean z5, String str, zzfx zzfxVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z6, zzc zzcVar, int i8, String str5, List list3, int i9, String str6, int i10, long j5, long j6) {
        this.zza = i5;
        this.zzb = j2;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i6;
        this.zze = list;
        this.zzf = z4;
        this.zzg = i7;
        this.zzh = z5;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z6;
        this.zzs = zzcVar;
        this.zzt = i8;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i9;
        this.zzx = str6;
        this.zzy = i10;
        this.zzz = j5;
        this.zzA = j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz), Long.valueOf(this.zzA)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        long j2 = this.zzb;
        b.N(parcel, 2, 8);
        parcel.writeLong(j2);
        b.E(parcel, 3, this.zzc);
        int i7 = this.zzd;
        b.N(parcel, 4, 4);
        parcel.writeInt(i7);
        b.K(parcel, 5, this.zze);
        boolean z4 = this.zzf;
        b.N(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i8 = this.zzg;
        b.N(parcel, 7, 4);
        parcel.writeInt(i8);
        boolean z5 = this.zzh;
        b.N(parcel, 8, 4);
        parcel.writeInt(z5 ? 1 : 0);
        b.I(parcel, 9, this.zzi);
        b.H(parcel, 10, this.zzj, i5);
        b.H(parcel, 11, this.zzk, i5);
        b.I(parcel, 12, this.zzl);
        b.E(parcel, 13, this.zzm);
        b.E(parcel, 14, this.zzn);
        b.K(parcel, 15, this.zzo);
        b.I(parcel, 16, this.zzp);
        b.I(parcel, 17, this.zzq);
        boolean z6 = this.zzr;
        b.N(parcel, 18, 4);
        parcel.writeInt(z6 ? 1 : 0);
        b.H(parcel, 19, this.zzs, i5);
        int i9 = this.zzt;
        b.N(parcel, 20, 4);
        parcel.writeInt(i9);
        b.I(parcel, 21, this.zzu);
        b.K(parcel, 22, this.zzv);
        int i10 = this.zzw;
        b.N(parcel, 23, 4);
        parcel.writeInt(i10);
        b.I(parcel, 24, this.zzx);
        int i11 = this.zzy;
        b.N(parcel, 25, 4);
        parcel.writeInt(i11);
        long j5 = this.zzz;
        b.N(parcel, 26, 8);
        parcel.writeLong(j5);
        long j6 = this.zzA;
        b.N(parcel, 27, 8);
        parcel.writeLong(j6);
        b.P(parcel, O);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && b0.j(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && b0.j(this.zzi, zzmVar.zzi) && b0.j(this.zzj, zzmVar.zzj) && b0.j(this.zzk, zzmVar.zzk) && b0.j(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && b0.j(this.zzo, zzmVar.zzo) && b0.j(this.zzp, zzmVar.zzp) && b0.j(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && b0.j(this.zzu, zzmVar.zzu) && b0.j(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && b0.j(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
    }

    public final boolean zzb() {
        return zzc() || zzd();
    }

    public final boolean zzc() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.zzc.getBoolean("zenith_v2", false);
    }
}
