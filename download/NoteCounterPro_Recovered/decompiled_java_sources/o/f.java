package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends l implements Map {

    /* renamed from: j, reason: collision with root package name */
    public a f2718j;

    /* renamed from: k, reason: collision with root package name */
    public c f2719k;

    /* renamed from: l, reason: collision with root package name */
    public e f2720l;

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f2718j;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f2718j = aVar2;
        return aVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i5 = this.f2733i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i5 != this.f2733i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f2719k;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f2719k = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f2733i);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f2720l;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f2720l = eVar2;
        return eVar2;
    }
}
