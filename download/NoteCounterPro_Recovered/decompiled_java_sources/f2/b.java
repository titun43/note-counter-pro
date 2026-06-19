package f2;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements k3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1444a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final k3.c f1445b;

    static {
        n3.a aVar = new n3.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n3.d.class, aVar);
        f1445b = new k3.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // k3.a
    public final void a(Object obj, Object obj2) {
        ((k3.e) obj2).d(f1445b, ((i2.b) obj).f1837a);
    }
}
