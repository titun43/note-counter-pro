package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzfc extends a {
    public static final Parcelable.Creator<zzfc> CREATOR = new zzfd();
    private final int zza;
    private final int zzb;
    private final String zzc;

    public zzfc(int i5, int i6, String str) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        int i6 = this.zza;
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzb;
        b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        b.I(parcel, 3, this.zzc);
        b.P(parcel, O);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public zzfc() {
        this(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.9.0");
    }
}
