package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzgrt;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzba extends a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    public final String zza;
    public final int zzb;

    public zzba(String str, int i5) {
        this.zza = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        this.zzb = i5;
    }

    public static zzba zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zza = zzfkm.zza(th);
        return new zzba(zzgrt.zzc(th.getMessage()) ? zza.zzb : th.getMessage(), zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 1, str);
        int i6 = this.zzb;
        b.N(parcel, 2, 4);
        parcel.writeInt(i6);
        b.P(parcel, O);
    }

    public final zzaz zzb() {
        return new zzaz(this.zza, this.zzb);
    }
}
