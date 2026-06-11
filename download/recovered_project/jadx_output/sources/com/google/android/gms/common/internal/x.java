package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class x extends u2.a {
    public static final Parcelable.Creator<x> CREATOR = new androidx.fragment.app.b(25);

    /* renamed from: g, reason: collision with root package name */
    public final int f1127g;
    public final Account h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1128i;

    /* renamed from: j, reason: collision with root package name */
    public final GoogleSignInAccount f1129j;

    public x(int i5, Account account, int i6, GoogleSignInAccount googleSignInAccount) {
        this.f1127g = i5;
        this.h = account;
        this.f1128i = i6;
        this.f1129j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1127g);
        z2.b.H(parcel, 2, this.h, i5);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f1128i);
        z2.b.H(parcel, 4, this.f1129j, i5);
        z2.b.P(parcel, O);
    }
}
