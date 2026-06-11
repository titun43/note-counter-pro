package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class i0 extends z {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f1059g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f fVar, int i5, Bundle bundle) {
        super(fVar, i5, bundle);
        this.f1059g = fVar;
    }

    @Override // com.google.android.gms.common.internal.z
    public final boolean a() {
        this.f1059g.zzc.a(t2.b.f3361l);
        return true;
    }

    @Override // com.google.android.gms.common.internal.z
    public final void b(t2.b bVar) {
        f fVar = this.f1059g;
        if (fVar.enableLocalFallback() && fVar.zzg()) {
            fVar.zzf(16);
        } else {
            fVar.zzc.a(bVar);
            fVar.onConnectionFailed(bVar);
        }
    }
}
