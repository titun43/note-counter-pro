package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzga extends a {
    public static final Parcelable.Creator<zzga> CREATOR = new zzgb();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzga(boolean z4, boolean z5, boolean z6) {
        this.zza = z4;
        this.zzb = z5;
        this.zzc = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z4 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzb;
        b.N(parcel, 3, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzc;
        b.N(parcel, 4, 4);
        parcel.writeInt(z6 ? 1 : 0);
        b.P(parcel, O);
    }

    public zzga(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }
}
