package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1446a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1447b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.c f1448c;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1447b = new k3.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        n3.a aVar2 = new n3.a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(n3.d.class, aVar2);
        f1448c = new k3.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        i2.d dVar = (i2.d) obj;
        k3.e eVar = (k3.e) obj2;
        eVar.a(f1447b, dVar.f1846a);
        eVar.d(f1448c, dVar.f1847b);
    }
}
