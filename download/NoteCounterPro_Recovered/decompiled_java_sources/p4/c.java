package p4;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.u;
import g4.i;
import java.util.concurrent.CancellationException;
import o4.a0;
import o4.e0;
import o4.r;
import o4.r0;
import o4.s;
import t4.o;
import v4.e;
import w3.h;

/* loaded from: classes.dex */
public final class c extends r implements a0 {

    /* renamed from: i, reason: collision with root package name */
    public final Handler f3042i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3043j;

    /* renamed from: k, reason: collision with root package name */
    public final c f3044k;

    public c(Handler handler, boolean z4) {
        this.f3042i = handler;
        this.f3043j = z4;
        this.f3044k = z4 ? this : new c(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f3042i == this.f3042i && cVar.f3043j == this.f3043j;
    }

    @Override // o4.r
    public final void f(h hVar, Runnable runnable) {
        if (this.f3042i.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        r0 r0Var = (r0) hVar.d(s.h);
        if (r0Var != null) {
            r0Var.b(cancellationException);
        }
        e eVar = e0.f2793a;
        v4.d.f3605i.f(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3042i) ^ (this.f3043j ? 1231 : 1237);
    }

    @Override // o4.r
    public final boolean k(h hVar) {
        return (this.f3043j && i.a(Looper.myLooper(), this.f3042i.getLooper())) ? false : true;
    }

    @Override // o4.r
    public final String toString() {
        c cVar;
        String str;
        e eVar = e0.f2793a;
        c cVar2 = o.f3438a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3044k;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f3042i.toString();
        return this.f3043j ? u.j(handler, ".immediate") : handler;
    }
}
