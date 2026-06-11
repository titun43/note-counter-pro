package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r implements d, b, c {

    /* renamed from: b, reason: collision with root package name */
    public static r f1114b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f1115c = new s(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f1116a;

    public /* synthetic */ r(Object obj) {
        this.f1116a = obj;
    }

    public static synchronized r b() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f1114b == null) {
                    f1114b = new r();
                }
                rVar = f1114b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.common.internal.d
    public void a(t2.b bVar) {
        f fVar = (f) this.f1116a;
        if (bVar.h == 0) {
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (fVar.zzl() != null) {
            fVar.zzl().onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnected(Bundle bundle) {
        ((com.google.android.gms.common.api.internal.f) this.f1116a).a();
    }

    @Override // com.google.android.gms.common.internal.c
    public void onConnectionFailed(t2.b bVar) {
        ((com.google.android.gms.common.api.internal.n) this.f1116a).onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnectionSuspended(int i5) {
        ((com.google.android.gms.common.api.internal.f) this.f1116a).onConnectionSuspended(i5);
    }
}
