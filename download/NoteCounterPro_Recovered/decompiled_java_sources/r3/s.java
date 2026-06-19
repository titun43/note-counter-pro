package r3;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f3192g;

    public s(Throwable th) {
        super("An unknown error occurred.", null);
        this.f3192g = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3192g;
    }
}
