package g3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.k0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends u2.a implements t {
    public static final Parcelable.Creator<e> CREATOR = new k0(4);

    /* renamed from: g, reason: collision with root package name */
    public final List f1684g;
    public final String h;

    public e(ArrayList arrayList, String str) {
        this.f1684g = arrayList;
        this.h = str;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.h != null ? Status.f924k : Status.f928o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.K(parcel, 1, this.f1684g);
        z2.b.I(parcel, 2, this.h);
        z2.b.P(parcel, O);
    }
}
