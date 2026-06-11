package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t extends d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f436a;

    public t(AtomicReference atomicReference) {
        this.f436a = atomicReference;
    }

    @Override // d.c
    public final void a(Object obj) {
        d.c cVar = (d.c) this.f436a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }
}
