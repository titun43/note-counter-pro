package g3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.k0;

/* loaded from: classes.dex */
public final class b extends u2.a implements t {
    public static final Parcelable.Creator<b> CREATOR = new k0(3);

    /* renamed from: g, reason: collision with root package name */
    public final int f1682g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f1683i;

    public b(int i5, int i6, Intent intent) {
        this.f1682g = i5;
        this.h = i6;
        this.f1683i = intent;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.h == 0 ? Status.f924k : Status.f928o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1682g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.H(parcel, 3, this.f1683i, i5);
        z2.b.P(parcel, O);
    }
}
