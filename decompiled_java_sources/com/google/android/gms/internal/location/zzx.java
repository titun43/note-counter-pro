package com.google.android.gms.internal.location;

import c3.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.t;

/* loaded from: classes.dex */
abstract class zzx extends x {
    public zzx(p pVar) {
        super(pVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return status;
    }
}
