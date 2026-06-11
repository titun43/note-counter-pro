package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzba extends a {
    final LocationRequest zzb;
    final List<g> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<g> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public zzba(LocationRequest locationRequest, List<g> list, String str, boolean z4, boolean z5, boolean z6, String str2, boolean z7, boolean z8, String str3, long j2) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = z6;
        this.zzh = str2;
        this.zzi = z7;
        this.zzj = z8;
        this.zzk = str3;
        this.zzl = j2;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (b0.j(this.zzb, zzbaVar.zzb) && b0.j(this.zzc, zzbaVar.zzc) && b0.j(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && b0.j(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && b0.j(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.H(parcel, 1, this.zzb, i5);
        b.M(parcel, 5, this.zzc);
        b.I(parcel, 6, this.zzd);
        boolean z4 = this.zze;
        b.N(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzf;
        b.N(parcel, 8, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzg;
        b.N(parcel, 9, 4);
        parcel.writeInt(z6 ? 1 : 0);
        b.I(parcel, 10, this.zzh);
        boolean z7 = this.zzi;
        b.N(parcel, 11, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzj;
        b.N(parcel, 12, 4);
        parcel.writeInt(z8 ? 1 : 0);
        b.I(parcel, 13, this.zzk);
        long j2 = this.zzl;
        b.N(parcel, 14, 8);
        parcel.writeLong(j2);
        b.P(parcel, O);
    }

    public final zzba zzb(long j2) {
        LocationRequest locationRequest = this.zzb;
        long j5 = locationRequest.f1150n;
        long j6 = locationRequest.h;
        if (j5 < j6) {
            j5 = j6;
        }
        if (j5 <= j6) {
            this.zzl = 10000L;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j7 = locationRequest2.h;
        long j8 = locationRequest2.f1150n;
        if (j8 < j7) {
            j8 = j7;
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(j7);
        sb.append("maxWaitTime=");
        sb.append(j8);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z4) {
        this.zzj = true;
        return this;
    }
}
