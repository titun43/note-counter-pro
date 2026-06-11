package y3;

import w3.h;

/* loaded from: classes.dex */
public final class b implements w3.c {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3876g = new b();

    @Override // w3.c
    public final h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
