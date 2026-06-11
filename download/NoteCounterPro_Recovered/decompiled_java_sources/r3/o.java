package r3;

/* loaded from: classes.dex */
public final class o extends u {

    /* renamed from: g, reason: collision with root package name */
    public final String f3191g;
    public final Throwable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, Throwable th) {
        super("The file/directory at " + str + " does not exist", null);
        g4.i.e(str, "path");
        this.f3191g = str;
        this.h = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.h;
    }
}
