package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1439a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1440b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.c f1441c;

    /* renamed from: d, reason: collision with root package name */
    public static final k3.c f1442d;

    /* renamed from: e, reason: collision with root package name */
    public static final k3.c f1443e;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1440b = new k3.c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        n3.a aVar2 = new n3.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(n3.d.class, aVar2);
        f1441c = new k3.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        n3.a aVar3 = new n3.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(n3.d.class, aVar3);
        f1442d = new k3.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        n3.a aVar4 = new n3.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(n3.d.class, aVar4);
        f1443e = new k3.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        i2.a aVar = (i2.a) obj;
        k3.e eVar = (k3.e) obj2;
        eVar.d(f1440b, aVar.f1833a);
        eVar.d(f1441c, aVar.f1834b);
        eVar.d(f1442d, aVar.f1835c);
        eVar.d(f1443e, aVar.f1836d);
    }
}
