package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new k0(2);

    /* renamed from: g, reason: collision with root package name */
    public final IntentSender f1176g;
    public final Intent h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1177i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1178j;

    public i(IntentSender intentSender, Intent intent, int i5, int i6) {
        g4.i.e(intentSender, "intentSender");
        this.f1176g = intentSender;
        this.h = intent;
        this.f1177i = i5;
        this.f1178j = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        g4.i.e(parcel, "dest");
        parcel.writeParcelable(this.f1176g, i5);
        parcel.writeParcelable(this.h, i5);
        parcel.writeInt(this.f1177i);
        parcel.writeInt(this.f1178j);
    }
}
