package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b3 extends j0.c {
    public static final Parcelable.Creator<b3> CREATOR = new j0.b(1);

    /* renamed from: i, reason: collision with root package name */
    public int f2032i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2033j;

    public b3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2032i = parcel.readInt();
        this.f2033j = parcel.readInt() != 0;
    }

    @Override // j0.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f2032i);
        parcel.writeInt(this.f2033j ? 1 : 0);
    }
}
