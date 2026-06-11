package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: g, reason: collision with root package name */
    public final int[] f344g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f345i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f346j;

    /* renamed from: k, reason: collision with root package name */
    public final int f347k;

    /* renamed from: l, reason: collision with root package name */
    public final String f348l;

    /* renamed from: m, reason: collision with root package name */
    public final int f349m;

    /* renamed from: n, reason: collision with root package name */
    public final int f350n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f351o;

    /* renamed from: p, reason: collision with root package name */
    public final int f352p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f353q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f354r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f355s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f356t;

    public c(a aVar) {
        int size = aVar.f302a.size();
        this.f344g = new int[size * 6];
        if (!aVar.f308g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.h = new ArrayList(size);
        this.f345i = new int[size];
        this.f346j = new int[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            c1 c1Var = (c1) aVar.f302a.get(i6);
            int i7 = i5 + 1;
            this.f344g[i5] = c1Var.f358a;
            ArrayList arrayList = this.h;
            z zVar = c1Var.f359b;
            arrayList.add(zVar != null ? zVar.f494k : null);
            int[] iArr = this.f344g;
            iArr[i7] = c1Var.f360c ? 1 : 0;
            iArr[i5 + 2] = c1Var.f361d;
            iArr[i5 + 3] = c1Var.f362e;
            int i8 = i5 + 5;
            iArr[i5 + 4] = c1Var.f363f;
            i5 += 6;
            iArr[i8] = c1Var.f364g;
            this.f345i[i6] = c1Var.h.ordinal();
            this.f346j[i6] = c1Var.f365i.ordinal();
        }
        this.f347k = aVar.f307f;
        this.f348l = aVar.h;
        this.f349m = aVar.f319s;
        this.f350n = aVar.f309i;
        this.f351o = aVar.f310j;
        this.f352p = aVar.f311k;
        this.f353q = aVar.f312l;
        this.f354r = aVar.f313m;
        this.f355s = aVar.f314n;
        this.f356t = aVar.f315o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f344g);
        parcel.writeStringList(this.h);
        parcel.writeIntArray(this.f345i);
        parcel.writeIntArray(this.f346j);
        parcel.writeInt(this.f347k);
        parcel.writeString(this.f348l);
        parcel.writeInt(this.f349m);
        parcel.writeInt(this.f350n);
        TextUtils.writeToParcel(this.f351o, parcel, 0);
        parcel.writeInt(this.f352p);
        TextUtils.writeToParcel(this.f353q, parcel, 0);
        parcel.writeStringList(this.f354r);
        parcel.writeStringList(this.f355s);
        parcel.writeInt(this.f356t ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f344g = parcel.createIntArray();
        this.h = parcel.createStringArrayList();
        this.f345i = parcel.createIntArray();
        this.f346j = parcel.createIntArray();
        this.f347k = parcel.readInt();
        this.f348l = parcel.readString();
        this.f349m = parcel.readInt();
        this.f350n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f351o = (CharSequence) creator.createFromParcel(parcel);
        this.f352p = parcel.readInt();
        this.f353q = (CharSequence) creator.createFromParcel(parcel);
        this.f354r = parcel.createStringArrayList();
        this.f355s = parcel.createStringArrayList();
        this.f356t = parcel.readInt() != 0;
    }
}
