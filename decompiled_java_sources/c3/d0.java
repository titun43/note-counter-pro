package c3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 extends u2.a {
    public static final Parcelable.Creator<d0> CREATOR = new androidx.fragment.app.b(19);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f803g;
    public final long h;

    /* renamed from: i, reason: collision with root package name */
    public final float f804i;

    /* renamed from: j, reason: collision with root package name */
    public final long f805j;

    /* renamed from: k, reason: collision with root package name */
    public final int f806k;

    public d0(boolean z4, long j2, float f5, long j5, int i5) {
        this.f803g = z4;
        this.h = j2;
        this.f804i = f5;
        this.f805j = j5;
        this.f806k = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f803g == d0Var.f803g && this.h == d0Var.h && Float.compare(this.f804i, d0Var.f804i) == 0 && this.f805j == d0Var.f805j && this.f806k == d0Var.f806k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f803g), Long.valueOf(this.h), Float.valueOf(this.f804i), Long.valueOf(this.f805j), Integer.valueOf(this.f806k)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f803g);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.h);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f804i);
        long j2 = this.f805j;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j2 - elapsedRealtime);
            sb.append("ms");
        }
        int i5 = this.f806k;
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
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f803g ? 1 : 0);
        z2.b.N(parcel, 2, 8);
        parcel.writeLong(this.h);
        z2.b.N(parcel, 3, 4);
        parcel.writeFloat(this.f804i);
        z2.b.N(parcel, 4, 8);
        parcel.writeLong(this.f805j);
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(this.f806k);
        z2.b.P(parcel, O);
    }
}
