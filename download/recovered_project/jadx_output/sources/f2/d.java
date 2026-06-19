package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1449a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1450b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.c f1451c;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1450b = new k3.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        n3.a aVar2 = new n3.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(n3.d.class, aVar2);
        f1451c = new k3.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        i2.e eVar = (i2.e) obj;
        k3.e eVar2 = (k3.e) obj2;
        eVar2.d(f1450b, eVar.f1849a);
        eVar2.d(f1451c, eVar.f1850b);
    }
}
