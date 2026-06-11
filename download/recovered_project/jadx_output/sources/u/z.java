package u;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements Iterable {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3492g = new ArrayList();
    public final g.k h;

    public z(g.k kVar) {
        this.h = kVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3492g.iterator();
    }
}
