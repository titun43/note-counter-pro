package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class c extends u2.a {
    public static final Parcelable.Creator<c> CREATOR = new androidx.fragment.app.b(18);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f798k = new c0(0);

    /* renamed from: g, reason: collision with root package name */
    public final List f799g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final List f800i;

    /* renamed from: j, reason: collision with root package name */
    public final String f801j;

    public c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        com.google.android.gms.common.internal.b0.h(arrayList, "transitions can't be null");
        int i5 = 0;
        com.google.android.gms.common.internal.b0.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f798k);
        int size = arrayList.size();
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            b bVar = (b) obj;
            com.google.android.gms.common.internal.b0.a("Found duplicated transition: " + bVar + ".", treeSet.add(bVar));
        }
        this.f799g = Collections.unmodifiableList(arrayList);
        this.h = str;
        this.f800i = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f801j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (com.google.android.gms.common.internal.b0.j(this.f799g, cVar.f799g) && com.google.android.gms.common.internal.b0.j(this.h, cVar.h) && com.google.android.gms.common.internal.b0.j(this.f801j, cVar.f801j) && com.google.android.gms.common.internal.b0.j(this.f800i, cVar.f800i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f799g.hashCode() * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f800i;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f801j;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f799g);
        String valueOf2 = String.valueOf(this.f800i);
        int length = valueOf.length();
        String str = this.h;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.f801j;
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        s.c.e(sb, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str);
        s.c.e(sb, "', mClients=", valueOf2, ", mAttributionTag=", str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        com.google.android.gms.common.internal.b0.g(parcel);
        int O = z2.b.O(parcel, 20293);
        z2.b.M(parcel, 1, this.f799g);
        z2.b.I(parcel, 2, this.h);
        z2.b.M(parcel, 3, this.f800i);
        z2.b.I(parcel, 4, this.f801j);
        z2.b.P(parcel, O);
    }
}
