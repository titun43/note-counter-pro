package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1456a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1457b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.c f1458c;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1457b = new k3.c("startMs", Collections.unmodifiableMap(new HashMap(hashMap)));
        n3.a aVar2 = new n3.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(n3.d.class, aVar2);
        f1458c = new k3.c("endMs", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        i2.g gVar = (i2.g) obj;
        k3.e eVar = (k3.e) obj2;
        eVar.a(f1457b, gVar.f1853a);
        eVar.a(f1458c, gVar.f1854b);
    }
}
