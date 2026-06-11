package com.google.android.gms.internal.location;

import c3.a;
import c3.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.t;

/* loaded from: classes.dex */
abstract class zzf extends s {
    public zzf(p pVar) {
        super(a.f791a, pVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return status;
    }
}
