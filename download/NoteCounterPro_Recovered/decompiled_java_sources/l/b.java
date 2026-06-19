package l;

/* loaded from: classes.dex */
public final class b extends y4.b {

    /* renamed from: j, reason: collision with root package name */
    public static volatile b f2447j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f2448k = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public final d f2449i = new d();

    public static b S() {
        if (f2447j != null) {
            return f2447j;
        }
        synchronized (b.class) {
            try {
                if (f2447j == null) {
                    f2447j = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2447j;
    }
}
