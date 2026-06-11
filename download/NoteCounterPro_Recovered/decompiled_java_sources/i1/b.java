package i1;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.ads.RequestConfiguration;
import o.f;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1825d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1826e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1827f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1828g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1829i;

    /* renamed from: j, reason: collision with root package name */
    public int f1830j;

    /* renamed from: k, reason: collision with root package name */
    public int f1831k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new f(0), new f(0), new f(0));
    }

    @Override // i1.a
    public final b a() {
        Parcel parcel = this.f1826e;
        int dataPosition = parcel.dataPosition();
        int i5 = this.f1830j;
        if (i5 == this.f1827f) {
            i5 = this.f1828g;
        }
        return new b(parcel, dataPosition, i5, s.c.d(new StringBuilder(), this.h, "  "), this.f1822a, this.f1823b, this.f1824c);
    }

    @Override // i1.a
    public final boolean e(int i5) {
        while (this.f1830j < this.f1828g) {
            int i6 = this.f1831k;
            if (i6 == i5) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            int i7 = this.f1830j;
            Parcel parcel = this.f1826e;
            parcel.setDataPosition(i7);
            int readInt = parcel.readInt();
            this.f1831k = parcel.readInt();
            this.f1830j += readInt;
        }
        return this.f1831k == i5;
    }

    @Override // i1.a
    public final void h(int i5) {
        int i6 = this.f1829i;
        SparseIntArray sparseIntArray = this.f1825d;
        Parcel parcel = this.f1826e;
        if (i6 >= 0) {
            int i7 = sparseIntArray.get(i6);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(dataPosition - i7);
            parcel.setDataPosition(dataPosition);
        }
        this.f1829i = i5;
        sparseIntArray.put(i5, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i5);
    }

    public b(Parcel parcel, int i5, int i6, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f1825d = new SparseIntArray();
        this.f1829i = -1;
        this.f1831k = -1;
        this.f1826e = parcel;
        this.f1827f = i5;
        this.f1828g = i6;
        this.f1830j = i5;
        this.h = str;
    }
}
