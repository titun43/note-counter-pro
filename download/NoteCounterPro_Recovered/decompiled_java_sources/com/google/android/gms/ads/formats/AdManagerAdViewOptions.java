package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends a {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzb();
    private final boolean zza;

    public static final class Builder {
        private boolean zza = false;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, null);
        }

        public Builder setManualImpressionsEnabled(boolean z4) {
            this.zza = z4;
            return this;
        }

        public final /* synthetic */ boolean zza() {
            return this.zza;
        }
    }

    public AdManagerAdViewOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        b.N(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        b.P(parcel, O);
    }

    public AdManagerAdViewOptions(boolean z4) {
        this.zza = z4;
    }
}
