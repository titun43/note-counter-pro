package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzfx extends a {
    public static final Parcelable.Creator<zzfx> CREATOR = new zzfy();
    public final String zza;

    public zzfx(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 15, str);
        b.P(parcel, O);
    }
}
