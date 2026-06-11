package s4;

import androidx.emoji2.text.r;
import f4.p;
import g4.q;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3314a = new r("NULL", 2);

    public static final Object a(w3.h hVar, Object obj, Object obj2, p pVar, w3.c cVar) {
        Object invoke;
        Object m5 = t4.b.m(hVar, obj2);
        try {
            n nVar = new n(cVar, hVar);
            if (pVar == null) {
                invoke = a.a.z(pVar, obj, nVar);
            } else {
                q.a(2, pVar);
                invoke = pVar.invoke(obj, nVar);
            }
            t4.b.g(hVar, m5);
            if (invoke == x3.a.f3712g) {
                g4.i.e(cVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            t4.b.g(hVar, m5);
            throw th;
        }
    }
}
