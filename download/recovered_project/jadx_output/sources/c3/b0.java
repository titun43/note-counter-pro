package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 extends u2.a {
    public static final Parcelable.Creator<b0> CREATOR = new androidx.fragment.app.b(16);

    /* renamed from: g, reason: collision with root package name */
    public final int f795g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f796i;

    /* renamed from: j, reason: collision with root package name */
    public final int f797j;

    public b0(int i5, int i6, int i7, int i8) {
        com.google.android.gms.common.internal.b0.i("Start hour must be in range [0, 23].", i5 >= 0 && i5 <= 23);
        com.google.android.gms.common.internal.b0.i("Start minute must be in range [0, 59].", i6 >= 0 && i6 <= 59);
        com.google.android.gms.common.internal.b0.i("End hour must be in range [0, 23].", i7 >= 0 && i7 <= 23);
        com.google.android.gms.common.internal.b0.i("End minute must be in range [0, 59].", i8 >= 0 && i8 <= 59);
        com.google.android.gms.common.internal.b0.i("Parameters can't be all 0.", ((i5 + i6) + i7) + i8 > 0);
        this.f795g = i5;
        this.h = i6;
        this.f796i = i7;
        this.f797j = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f795g == b0Var.f795g && this.h == b0Var.h && this.f796i == b0Var.f796i && this.f797j == b0Var.f797j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f795g), Integer.valueOf(this.h), Integer.valueOf(this.f796i), Integer.valueOf(this.f797j)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(this.f795g);
        sb.append(", startMinute=");
        sb.append(this.h);
        androidx.emoji2.text.u.s(sb, ", endHour=", this.f796i, ", endMinute=", this.f797j);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        com.google.android.gms.common.internal.b0.g(parcel);
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f795g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f796i);
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(this.f797j);
        z2.b.P(parcel, O);
    }
}
