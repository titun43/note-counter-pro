package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends u2.a {
    public static final Parcelable.Creator<z> CREATOR = new androidx.fragment.app.b(13);

    /* renamed from: g, reason: collision with root package name */
    public final int f826g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final long f827i;

    /* renamed from: j, reason: collision with root package name */
    public final long f828j;

    public z(long j2, int i5, int i6, long j5) {
        this.f826g = i5;
        this.h = i6;
        this.f827i = j2;
        this.f828j = j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f826g == zVar.f826g && this.h == zVar.h && this.f827i == zVar.f827i && this.f828j == zVar.f828j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.f826g), Long.valueOf(this.f828j), Long.valueOf(this.f827i)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f826g + " Cell status: " + this.h + " elapsed time NS: " + this.f828j + " system time ms: " + this.f827i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f826g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.N(parcel, 3, 8);
        parcel.writeLong(this.f827i);
        z2.b.N(parcel, 4, 8);
        parcel.writeLong(this.f828j);
        z2.b.P(parcel, O);
    }
}
