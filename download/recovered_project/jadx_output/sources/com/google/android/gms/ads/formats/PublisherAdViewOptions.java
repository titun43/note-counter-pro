package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzco;
import u2.a;
import z2.b;

@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends a {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    private final boolean zza;
    private final zzco zzb;
    private final IBinder zzc;

    @Deprecated
    public static final class Builder {
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z4, IBinder iBinder, IBinder iBinder2) {
        this.zza = z4;
        this.zzb = iBinder != null ? zzcn.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        boolean z4 = this.zza;
        b.N(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        zzco zzcoVar = this.zzb;
        b.G(parcel, 2, zzcoVar == null ? null : zzcoVar.asBinder());
        b.G(parcel, 3, this.zzc);
        b.P(parcel, O);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final zzco zzb() {
        return this.zzb;
    }
}
