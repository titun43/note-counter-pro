package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbzb extends u2.a {
    public static final Parcelable.Creator<zzbzb> CREATOR = new zzbzc();
    public final boolean zza;
    public final List zzb;

    public zzbzb(boolean z4, List list) {
        this.zza = z4;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z4 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        z2.b.K(parcel, 3, this.zzb);
        z2.b.P(parcel, O);
    }

    public zzbzb() {
        this(false, Collections.EMPTY_LIST);
    }
}
