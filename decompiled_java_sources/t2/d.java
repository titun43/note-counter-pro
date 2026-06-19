package t2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends u2.a {
    public static final Parcelable.Creator<d> CREATOR = new k0(14);

    /* renamed from: g, reason: collision with root package name */
    public final String f3368g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3369i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3370j;

    public d(String str, int i5, long j2, boolean z4) {
        this.f3368g = str;
        this.h = i5;
        this.f3369i = j2;
        this.f3370j = z4;
    }

    public final long a() {
        long j2 = this.f3369i;
        return j2 == -1 ? this.h : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (b0.j(this.f3368g, dVar.f3368g) && a() == dVar.a() && this.f3370j == dVar.f3370j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3368g, Long.valueOf(a()), Boolean.valueOf(this.f3370j)});
    }

    public final String toString() {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this);
        pVar.h(this.f3368g, "name");
        pVar.h(Long.valueOf(a()), "version");
        pVar.h(Boolean.valueOf(this.f3370j), "is_fully_rolled_out");
        return pVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, this.f3368g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        long a5 = a();
        z2.b.N(parcel, 3, 8);
        parcel.writeLong(a5);
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(this.f3370j ? 1 : 0);
        z2.b.P(parcel, O);
    }

    public d(String str, long j2) {
        this(str, -1, j2, false);
    }
}
