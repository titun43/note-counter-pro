package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends u2.a implements t, ReflectedParcelable {

    /* renamed from: g, reason: collision with root package name */
    public final int f929g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f930i;

    /* renamed from: j, reason: collision with root package name */
    public final t2.b f931j;

    /* renamed from: k, reason: collision with root package name */
    public static final Status f924k = new Status(0, null, null, null);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f925l = new Status(14, null, null, null);

    /* renamed from: m, reason: collision with root package name */
    public static final Status f926m = new Status(8, null, null, null);

    /* renamed from: n, reason: collision with root package name */
    public static final Status f927n = new Status(15, null, null, null);

    /* renamed from: o, reason: collision with root package name */
    public static final Status f928o = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new androidx.fragment.app.b(21);

    public Status(int i5, String str, PendingIntent pendingIntent, t2.b bVar) {
        this.f929g = i5;
        this.h = str;
        this.f930i = pendingIntent;
        this.f931j = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f929g == status.f929g && b0.j(this.h, status.h) && b0.j(this.f930i, status.f930i) && b0.j(this.f931j, status.f931j);
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f929g), this.h, this.f930i, this.f931j});
    }

    public final String toString() {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this);
        String str = this.h;
        if (str == null) {
            str = a.a.m(this.f929g);
        }
        pVar.h(str, "statusCode");
        pVar.h(this.f930i, "resolution");
        return pVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f929g);
        z2.b.I(parcel, 2, this.h);
        z2.b.H(parcel, 3, this.f930i, i5);
        z2.b.H(parcel, 4, this.f931j, i5);
        z2.b.P(parcel, O);
    }
}
