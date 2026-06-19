package s4;

import java.util.concurrent.CancellationException;
import k0.s;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: g, reason: collision with root package name */
    public final transient s f3302g;

    public a(s sVar) {
        super("Flow was aborted, no more elements needed");
        this.f3302g = sVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
