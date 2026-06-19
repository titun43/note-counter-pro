package w3;

import f4.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final i f3631g = new i();

    @Override // w3.h
    public final f d(g gVar) {
        g4.i.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // w3.h
    public final h i(g gVar) {
        g4.i.e(gVar, "key");
        return this;
    }

    @Override // w3.h
    public final h l(h hVar) {
        g4.i.e(hVar, "context");
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // w3.h
    public final Object j(Object obj, p pVar) {
        return obj;
    }
}
