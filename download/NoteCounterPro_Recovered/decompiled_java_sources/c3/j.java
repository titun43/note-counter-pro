package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class j extends u2.a implements com.google.android.gms.common.api.t {
    public static final Parcelable.Creator<j> CREATOR = new androidx.fragment.app.b(11);

    /* renamed from: g, reason: collision with root package name */
    public final Status f816g;
    public final k h;

    public j(Status status, k kVar) {
        this.f816g = status;
        this.h = kVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f816g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 1, this.f816g, i5);
        z2.b.H(parcel, 2, this.h, i5);
        z2.b.P(parcel, O);
    }
}
