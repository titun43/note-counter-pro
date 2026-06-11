package o4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class s0 extends CancellationException {

    /* renamed from: g, reason: collision with root package name */
    public final transient z0 f2830g;

    public s0(String str, Throwable th, z0 z0Var) {
        super(str);
        this.f2830g = z0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (!g4.i.a(s0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = s0Var.f2830g;
        if (obj2 == null) {
            obj2 = b1.h;
        }
        Object obj3 = this.f2830g;
        if (obj3 == null) {
            obj3 = b1.h;
        }
        return g4.i.a(obj2, obj3) && g4.i.a(s0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        g4.i.b(message);
        int hashCode = message.hashCode() * 31;
        Object obj = this.f2830g;
        if (obj == null) {
            obj = b1.h;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f2830g;
        if (obj == null) {
            obj = b1.h;
        }
        sb.append(obj);
        return sb.toString();
    }
}
