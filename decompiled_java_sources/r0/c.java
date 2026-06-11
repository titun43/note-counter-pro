package r0;

import androidx.lifecycle.t;
import androidx.lifecycle.w0;
import java.io.PrintWriter;
import o.m;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final t f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3146b;

    public c(t tVar, w0 w0Var) {
        this.f3145a = tVar;
        androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(w0Var, b.f3143e);
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f3146b = (b) tVar2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        m mVar = this.f3146b.f3144d;
        if (mVar.f2735i > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (mVar.f2735i <= 0) {
                return;
            }
            if (mVar.h[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(mVar.f2734g[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        t tVar = this.f3145a;
        if (tVar == null) {
            sb.append("null");
        } else {
            String simpleName = tVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = tVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(tVar)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
