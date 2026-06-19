package m;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f2541k = new HashMap();

    @Override // m.f
    public final c a(Object obj) {
        return (c) this.f2541k.get(obj);
    }

    @Override // m.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f2541k.remove(obj);
        return b2;
    }
}
