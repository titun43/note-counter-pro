package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzbwh extends u2.a {
    public static final Parcelable.Creator<zzbwh> CREATOR = new zzbwi();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbwh(int i5, int i6, int i7) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
    }

    public static zzbwh zza(VersionInfo versionInfo) {
        return new zzbwh(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwh)) {
            zzbwh zzbwhVar = (zzbwh) obj;
            if (zzbwhVar.zzc == this.zzc && zzbwhVar.zzb == this.zzb && zzbwhVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int i6 = this.zzb;
        int length2 = String.valueOf(i6).length();
        int i7 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i7).length());
        sb.append(i5);
        sb.append(".");
        sb.append(i6);
        sb.append(".");
        sb.append(i7);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzb;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = this.zzc;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i8);
        z2.b.P(parcel, O);
    }
}
