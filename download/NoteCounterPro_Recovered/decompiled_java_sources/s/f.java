package s;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f extends j0.c {
    public static final Parcelable.Creator<f> CREATOR = new j0.b(2);

    /* renamed from: i, reason: collision with root package name */
    public SparseArray f3285i;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f3285i = new SparseArray(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f3285i.append(iArr[i5], readParcelableArray[i5]);
        }
    }

    @Override // j0.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        SparseArray sparseArray = this.f3285i;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = this.f3285i.keyAt(i6);
            parcelableArr[i6] = (Parcelable) this.f3285i.valueAt(i6);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i5);
    }
}
