package q;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i5) {
        super(str);
        this.f3048g = i5;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i5 = this.f3048g;
        synchronized (this) {
            switch (i5) {
            }
            return this;
        }
    }
}
