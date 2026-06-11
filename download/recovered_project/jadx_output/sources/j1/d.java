package j1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2016a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2017b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2018c;

    /* renamed from: d, reason: collision with root package name */
    public final x4.d f2019d;

    public d(String str, String str2, x4.d dVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f2017b = str;
        this.f2018c = str2;
        this.f2016a = true;
        this.f2019d = dVar;
    }
}
