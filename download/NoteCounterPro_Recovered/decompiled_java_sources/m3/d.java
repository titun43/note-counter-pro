package m3;

import java.util.Date;
import java.util.HashMap;
import k3.f;
import k3.g;

/* loaded from: classes.dex */
public final class d implements l3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f2590f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2591g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2592a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2593b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2594c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2595d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2589e = new a(0);
    public static final c h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [m3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [m3.b] */
    static {
        final int i5 = 0;
        f2590f = new f() { // from class: m3.b
            @Override // k3.a
            public final void a(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i6 = 1;
        f2591g = new f() { // from class: m3.b
            @Override // k3.a
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f2592a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f2593b = hashMap2;
        this.f2594c = f2589e;
        this.f2595d = false;
        hashMap2.put(String.class, f2590f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f2591g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final l3.a a(Class cls, k3.d dVar) {
        this.f2592a.put(cls, dVar);
        this.f2593b.remove(cls);
        return this;
    }
}
