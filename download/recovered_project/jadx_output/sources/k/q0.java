package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class q0 extends View.BaseSavedState {
    public static final Parcelable.Creator<q0> CREATOR = new com.google.android.gms.common.internal.k0(9);

    /* renamed from: g, reason: collision with root package name */
    public boolean f2201g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeByte(this.f2201g ? (byte) 1 : (byte) 0);
    }
}
