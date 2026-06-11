package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 implements Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public final String f322g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f323i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f324j;

    /* renamed from: k, reason: collision with root package name */
    public final int f325k;

    /* renamed from: l, reason: collision with root package name */
    public final int f326l;

    /* renamed from: m, reason: collision with root package name */
    public final String f327m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f328n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f329o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f330p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f331q;

    /* renamed from: r, reason: collision with root package name */
    public final int f332r;

    /* renamed from: s, reason: collision with root package name */
    public final String f333s;

    /* renamed from: t, reason: collision with root package name */
    public final int f334t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f335u;

    public a1(z zVar) {
        this.f322g = zVar.getClass().getName();
        this.h = zVar.f494k;
        this.f323i = zVar.f503t;
        this.f324j = zVar.f505v;
        this.f325k = zVar.D;
        this.f326l = zVar.E;
        this.f327m = zVar.F;
        this.f328n = zVar.I;
        this.f329o = zVar.f501r;
        this.f330p = zVar.H;
        this.f331q = zVar.G;
        this.f332r = zVar.S.ordinal();
        this.f333s = zVar.f497n;
        this.f334t = zVar.f498o;
        this.f335u = zVar.N;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f322g);
        sb.append(" (");
        sb.append(this.h);
        sb.append(")}:");
        if (this.f323i) {
            sb.append(" fromLayout");
        }
        if (this.f324j) {
            sb.append(" dynamicContainer");
        }
        int i5 = this.f326l;
        if (i5 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i5));
        }
        String str = this.f327m;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f328n) {
            sb.append(" retainInstance");
        }
        if (this.f329o) {
            sb.append(" removing");
        }
        if (this.f330p) {
            sb.append(" detached");
        }
        if (this.f331q) {
            sb.append(" hidden");
        }
        String str2 = this.f333s;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f334t);
        }
        if (this.f335u) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f322g);
        parcel.writeString(this.h);
        parcel.writeInt(this.f323i ? 1 : 0);
        parcel.writeInt(this.f324j ? 1 : 0);
        parcel.writeInt(this.f325k);
        parcel.writeInt(this.f326l);
        parcel.writeString(this.f327m);
        parcel.writeInt(this.f328n ? 1 : 0);
        parcel.writeInt(this.f329o ? 1 : 0);
        parcel.writeInt(this.f330p ? 1 : 0);
        parcel.writeInt(this.f331q ? 1 : 0);
        parcel.writeInt(this.f332r);
        parcel.writeString(this.f333s);
        parcel.writeInt(this.f334t);
        parcel.writeInt(this.f335u ? 1 : 0);
    }

    public a1(Parcel parcel) {
        this.f322g = parcel.readString();
        this.h = parcel.readString();
        this.f323i = parcel.readInt() != 0;
        this.f324j = parcel.readInt() != 0;
        this.f325k = parcel.readInt();
        this.f326l = parcel.readInt();
        this.f327m = parcel.readString();
        this.f328n = parcel.readInt() != 0;
        this.f329o = parcel.readInt() != 0;
        this.f330p = parcel.readInt() != 0;
        this.f331q = parcel.readInt() != 0;
        this.f332r = parcel.readInt();
        this.f333s = parcel.readString();
        this.f334t = parcel.readInt();
        this.f335u = parcel.readInt() != 0;
    }
}
