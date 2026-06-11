package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.i;

/* loaded from: classes.dex */
final class zzn extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, i iVar, Object obj, f fVar, n nVar) {
        return new zzd(context, looper, iVar, fVar, nVar);
    }
}
