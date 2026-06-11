package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, n nVar, o oVar) {
        return buildClient(context, looper, iVar, obj, (com.google.android.gms.common.api.internal.f) nVar, (com.google.android.gms.common.api.internal.n) oVar);
    }

    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
