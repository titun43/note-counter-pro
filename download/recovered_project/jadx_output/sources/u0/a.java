package u0;

import android.net.Uri;
import android.view.InputEvent;
import g4.i;
import o4.e0;
import o4.w;
import r4.e;
import w0.d;
import w3.c;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final w0.b f3493a;

    public a(w0.b bVar) {
        this.f3493a = bVar;
    }

    @Override // u0.b
    public j3.a b(Uri uri, InputEvent inputEvent) {
        i.e(uri, "attributionSource");
        return y4.b.b(w.b(w.a(e0.f2793a), new p3.w(this, uri, inputEvent, (c) null)));
    }

    public j3.a c(w0.a aVar) {
        i.e(aVar, "deletionRequest");
        throw null;
    }

    public j3.a d() {
        return y4.b.b(w.b(w.a(e0.f2793a), new e(this, null, 1)));
    }

    public j3.a e(Uri uri) {
        i.e(uri, "trigger");
        return y4.b.b(w.b(w.a(e0.f2793a), new k0.b(this, uri, null, 3)));
    }

    public j3.a f(w0.c cVar) {
        i.e(cVar, "request");
        throw null;
    }

    public j3.a g(d dVar) {
        i.e(dVar, "request");
        throw null;
    }
}
