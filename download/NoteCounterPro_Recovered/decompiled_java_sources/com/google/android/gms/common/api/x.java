package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class x extends UnsupportedOperationException {

    /* renamed from: g, reason: collision with root package name */
    public final t2.d f1036g;

    public x(t2.d dVar) {
        this.f1036g = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1036g));
    }
}
