package c3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends u2.a {
    public static final Parcelable.Creator<a0> CREATOR = new androidx.fragment.app.b(14);

    /* renamed from: g, reason: collision with root package name */
    public final zzbs f792g;
    public final PendingIntent h;

    /* renamed from: i, reason: collision with root package name */
    public final String f793i;

    public a0(List list, PendingIntent pendingIntent, String str) {
        this.f792g = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.h = pendingIntent;
        this.f793i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.K(parcel, 1, this.f792g);
        z2.b.H(parcel, 2, this.h, i5);
        z2.b.I(parcel, 3, this.f793i);
        z2.b.P(parcel, O);
    }
}
