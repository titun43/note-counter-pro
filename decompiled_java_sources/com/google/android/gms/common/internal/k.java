package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class k extends u2.a {
    public static final Parcelable.Creator<k> CREATOR = new k0(0);

    /* renamed from: u, reason: collision with root package name */
    public static final Scope[] f1068u = new Scope[0];

    /* renamed from: v, reason: collision with root package name */
    public static final t2.d[] f1069v = new t2.d[0];

    /* renamed from: g, reason: collision with root package name */
    public final int f1070g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1071i;

    /* renamed from: j, reason: collision with root package name */
    public String f1072j;

    /* renamed from: k, reason: collision with root package name */
    public IBinder f1073k;

    /* renamed from: l, reason: collision with root package name */
    public Scope[] f1074l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1075m;

    /* renamed from: n, reason: collision with root package name */
    public Account f1076n;

    /* renamed from: o, reason: collision with root package name */
    public t2.d[] f1077o;

    /* renamed from: p, reason: collision with root package name */
    public t2.d[] f1078p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1079q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1080r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1081s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1082t;

    public k(int i5, int i6, int i7, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, t2.d[] dVarArr, t2.d[] dVarArr2, boolean z4, int i8, boolean z5, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f1068u : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        t2.d[] dVarArr3 = f1069v;
        t2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f1070g = i5;
        this.h = i6;
        this.f1071i = i7;
        if ("com.google.android.gms".equals(str)) {
            this.f1072j = "com.google.android.gms";
        } else {
            this.f1072j = str;
        }
        if (i5 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i9 = a.f1037g;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface q0Var = queryLocalInterface instanceof n ? (n) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        q0 q0Var2 = (q0) q0Var;
                        Parcel zzB = q0Var2.zzB(2, q0Var2.zza());
                        Account account3 = (Account) zzc.zzb(zzB, Account.CREATOR);
                        zzB.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.f1076n = account2;
        } else {
            this.f1073k = iBinder;
            this.f1076n = account;
        }
        this.f1074l = scopeArr2;
        this.f1075m = bundle2;
        this.f1077o = dVarArr4;
        this.f1078p = dVarArr3;
        this.f1079q = z4;
        this.f1080r = i8;
        this.f1081s = z5;
        this.f1082t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        k0.a(this, parcel, i5);
    }
}
