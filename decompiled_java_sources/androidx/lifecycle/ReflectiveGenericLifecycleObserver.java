package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements r {

    /* renamed from: g, reason: collision with root package name */
    public final s f512g;
    public final b h;

    public ReflectiveGenericLifecycleObserver(s sVar) {
        this.f512g = sVar;
        d dVar = d.f530c;
        Class<?> cls = sVar.getClass();
        b bVar = (b) dVar.f531a.get(cls);
        this.h = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        HashMap hashMap = this.h.f526a;
        List list = (List) hashMap.get(mVar);
        s sVar = this.f512g;
        b.a(list, tVar, mVar, sVar);
        b.a((List) hashMap.get(m.ON_ANY), tVar, mVar, sVar);
    }
}
