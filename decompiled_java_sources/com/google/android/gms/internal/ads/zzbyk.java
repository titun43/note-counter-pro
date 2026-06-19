package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbyk extends u2.a {
    public static final Parcelable.Creator<zzbyk> CREATOR = new zzbyl();
    public final View zza;
    public final Map zzb;

    public zzbyk(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) a3.b.b(a3.b.a(iBinder));
        this.zzb = (Map) a3.b.b(a3.b.a(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        View view = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.G(parcel, 1, new a3.b(view).asBinder());
        z2.b.G(parcel, 2, new a3.b(this.zzb).asBinder());
        z2.b.P(parcel, O);
    }
}
