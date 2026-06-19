package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public final class r extends zab implements h {

    /* renamed from: g, reason: collision with root package name */
    public final d f1017g;

    public r(d dVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.f1017g = dVar;
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        Status status = (Status) zac.zaa(parcel, Status.CREATOR);
        zac.zab(parcel);
        this.f1017g.setResult(status);
        return true;
    }
}
