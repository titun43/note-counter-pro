package g4;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements l4.a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public transient l4.a f1691g;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f1692i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1693j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1694k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1695l;

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.h = obj;
        this.f1692i = cls;
        this.f1693j = str;
        this.f1694k = str2;
        this.f1695l = z4;
    }

    public final d b() {
        boolean z4 = this.f1695l;
        Class cls = this.f1692i;
        if (z4) {
            o.f1705a.getClass();
            return new k(cls);
        }
        o.f1705a.getClass();
        return new e(cls);
    }
}
