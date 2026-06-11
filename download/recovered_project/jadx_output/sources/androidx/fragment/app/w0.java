package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w0 implements Parcelable {
    public static final Parcelable.Creator<w0> CREATOR = new b(3);

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f477g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public c[] f478i;

    /* renamed from: j, reason: collision with root package name */
    public int f479j;

    /* renamed from: k, reason: collision with root package name */
    public String f480k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f481l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f482m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f483n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f477g);
        parcel.writeStringList(this.h);
        parcel.writeTypedArray(this.f478i, i5);
        parcel.writeInt(this.f479j);
        parcel.writeString(this.f480k);
        parcel.writeStringList(this.f481l);
        parcel.writeTypedList(this.f482m);
        parcel.writeTypedList(this.f483n);
    }
}
