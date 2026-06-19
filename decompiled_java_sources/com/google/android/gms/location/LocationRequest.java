package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.fragment.app.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import u2.a;

/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b(7);

    /* renamed from: g, reason: collision with root package name */
    public int f1144g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f1145i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1146j;

    /* renamed from: k, reason: collision with root package name */
    public long f1147k;

    /* renamed from: l, reason: collision with root package name */
    public int f1148l;

    /* renamed from: m, reason: collision with root package name */
    public float f1149m;

    /* renamed from: n, reason: collision with root package name */
    public long f1150n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1151o;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f1144g != locationRequest.f1144g) {
            return false;
        }
        long j2 = this.h;
        long j5 = locationRequest.h;
        if (j2 != j5 || this.f1145i != locationRequest.f1145i || this.f1146j != locationRequest.f1146j || this.f1147k != locationRequest.f1147k || this.f1148l != locationRequest.f1148l || this.f1149m != locationRequest.f1149m) {
            return false;
        }
        long j6 = this.f1150n;
        if (j6 >= j2) {
            j2 = j6;
        }
        long j7 = locationRequest.f1150n;
        if (j7 >= j5) {
            j5 = j7;
        }
        return j2 == j5 && this.f1151o == locationRequest.f1151o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1144g), Long.valueOf(this.h), Float.valueOf(this.f1149m), Long.valueOf(this.f1150n)});
    }

    public final String toString() {
        int i5 = this.f1148l;
        float f5 = this.f1149m;
        long j2 = this.f1150n;
        long j5 = this.h;
        StringBuilder sb = new StringBuilder("Request[");
        int i6 = this.f1144g;
        sb.append(i6 != 100 ? i6 != 102 ? i6 != 104 ? i6 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i6 != 105) {
            sb.append(" requested=");
            sb.append(j5);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f1145i);
        sb.append("ms");
        if (j2 > j5) {
            sb.append(" maxWait=");
            sb.append(j2);
            sb.append("ms");
        }
        if (f5 > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f5);
            sb.append("m");
        }
        long j6 = this.f1147k;
        if (j6 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j6 - elapsedRealtime);
            sb.append("ms");
        }
        if (i5 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i5);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        int i6 = this.f1144g;
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        long j2 = this.h;
        z2.b.N(parcel, 2, 8);
        parcel.writeLong(j2);
        long j5 = this.f1145i;
        z2.b.N(parcel, 3, 8);
        parcel.writeLong(j5);
        boolean z4 = this.f1146j;
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j6 = this.f1147k;
        z2.b.N(parcel, 5, 8);
        parcel.writeLong(j6);
        int i7 = this.f1148l;
        z2.b.N(parcel, 6, 4);
        parcel.writeInt(i7);
        float f5 = this.f1149m;
        z2.b.N(parcel, 7, 4);
        parcel.writeFloat(f5);
        long j7 = this.f1150n;
        z2.b.N(parcel, 8, 8);
        parcel.writeLong(j7);
        boolean z5 = this.f1151o;
        z2.b.N(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        z2.b.P(parcel, O);
    }
}
