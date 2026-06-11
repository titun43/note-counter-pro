package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class c0 extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public final t2.b f1042g;

    public c0(t2.b bVar) {
        b0.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.h == 0 || bVar.f3363i == null) ? false : true);
        this.f1042g = bVar;
    }
}
