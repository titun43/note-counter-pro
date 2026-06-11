package q4;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3135a = new i();

    public static c a(int i5, a aVar, int i6) {
        if ((i6 & 2) != 0) {
            aVar = a.f3098g;
        }
        if (i5 == -2) {
            if (aVar != a.f3098g) {
                return new m(1, aVar);
            }
            g.f3133e.getClass();
            return new c(f.f3132b);
        }
        if (i5 != -1) {
            return i5 != 0 ? i5 != Integer.MAX_VALUE ? aVar == a.f3098g ? new c(i5) : new m(i5, aVar) : new c(com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : aVar == a.f3098g ? new c(0) : new m(1, aVar);
        }
        if (aVar == a.f3098g) {
            return new m(1, a.h);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
