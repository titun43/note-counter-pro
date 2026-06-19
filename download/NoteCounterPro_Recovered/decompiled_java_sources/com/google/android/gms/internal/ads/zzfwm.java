package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfwm extends u2.a {
    public static final Parcelable.Creator<zzfwm> CREATOR = new zzfwn();
    public final int zza;
    private zzaxg zzb = null;
    private byte[] zzc;

    public zzfwm(int i5, byte[] bArr) {
        this.zza = i5;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaxg zzaxgVar = this.zzb;
        if (zzaxgVar != null || this.zzc == null) {
            if (zzaxgVar == null || this.zzc != null) {
                if (zzaxgVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaxgVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaN();
        }
        z2.b.F(parcel, 2, bArr);
        z2.b.P(parcel, O);
    }

    public final zzaxg zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaxg.zzi(this.zzc, zzibb.zza());
                this.zzc = null;
            } catch (zzicg | NullPointerException e4) {
                throw new IllegalStateException(e4);
            }
        }
        zzb();
        return this.zzb;
    }
}
