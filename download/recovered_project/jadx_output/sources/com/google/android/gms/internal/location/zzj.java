package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.h1;
import c3.d0;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.g;
import java.util.Collections;
import java.util.List;
import s.c;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzj extends a {
    final d0 zzc;
    final List<g> zzd;
    final String zze;
    static final List<g> zza = Collections.EMPTY_LIST;
    static final d0 zzb = new d0(true, 50, 0.0f, Long.MAX_VALUE, f.API_PRIORITY_OTHER);
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(d0 d0Var, List<g> list, String str) {
        this.zzc = d0Var;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return b0.j(this.zzc, zzjVar.zzc) && b0.j(this.zzd, zzjVar.zzd) && b0.j(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        c.e(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return h1.b(sb, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.H(parcel, 1, this.zzc, i5);
        b.M(parcel, 2, this.zzd);
        b.I(parcel, 3, this.zze);
        b.P(parcel, O);
    }
}
