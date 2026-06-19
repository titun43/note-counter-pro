package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new k0(1);

    /* renamed from: g, reason: collision with root package name */
    public final int f1157g;
    public final Intent h;

    public a(Intent intent, int i5) {
        this.f1157g = i5;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i5 = this.f1157g;
        sb.append(i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        g4.i.e(parcel, "dest");
        parcel.writeInt(this.f1157g);
        Intent intent = this.h;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i5);
        }
    }
}
