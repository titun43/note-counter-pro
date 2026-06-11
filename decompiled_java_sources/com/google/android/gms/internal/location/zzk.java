package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import c3.d0;
import com.google.android.gms.common.internal.g;
import java.util.List;
import y4.b;

/* loaded from: classes.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        d0 d0Var = zzj.zzb;
        List<g> list = zzj.zza;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                d0Var = (d0) b.n(parcel, readInt, d0.CREATOR);
            } else if (c5 == 2) {
                list = b.s(parcel, readInt, g.CREATOR);
            } else if (c5 != 3) {
                b.P(parcel, readInt);
            } else {
                str = b.o(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzj(d0Var, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i5) {
        return new zzj[i5];
    }
}
