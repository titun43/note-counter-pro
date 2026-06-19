package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1453a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1454b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.c f1455c;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1454b = new k3.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        n3.a aVar2 = new n3.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(n3.d.class, aVar2);
        f1455c = new k3.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        i2.f fVar = (i2.f) obj;
        k3.e eVar = (k3.e) obj2;
        eVar.a(f1454b, fVar.f1851a);
        eVar.a(f1455c, fVar.f1852b);
    }
}
