package j0;

import android.os.Parcel;
import android.os.Parcelable;
import k.b3;
import s.f;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2012a;

    public /* synthetic */ b(int i5) {
        this.f2012a = i5;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2012a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.h;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new b3(parcel, classLoader);
            default:
                return new f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f2012a) {
            case 0:
                return new c[i5];
            case 1:
                return new b3[i5];
            default:
                return new f[i5];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2012a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.h;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new b3(parcel, null);
            default:
                return new f(parcel, null);
        }
    }
}
