package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzft extends a {
    public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
    public final String zza;
    public final int zzb;
    public final zzm zzc;
    public final int zzd;

    public zzft(String str, int i5, zzm zzmVar, int i6) {
        this.zza = str;
        this.zzb = i5;
        this.zzc = zzmVar;
        this.zzd = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (this.zza.equals(zzftVar.zza) && this.zzb == zzftVar.zzb && this.zzc.zza(zzftVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 1, str);
        int i6 = this.zzb;
        b.N(parcel, 2, 4);
        parcel.writeInt(i6);
        b.H(parcel, 3, this.zzc, i5);
        int i7 = this.zzd;
        b.N(parcel, 4, 4);
        parcel.writeInt(i7);
        b.P(parcel, O);
    }
}
