package q4;

import androidx.emoji2.text.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o4.k1;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: q, reason: collision with root package name */
    public final a f3138q;

    public m(int i5, a aVar) {
        super(i5);
        String b2;
        this.f3138q = aVar;
        if (aVar != a.f3098g) {
            if (i5 < 1) {
                throw new IllegalArgumentException(u.i(i5, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        g4.o.f1705a.getClass();
        String str = null;
        if (!c.class.isAnonymousClass()) {
            if (c.class.isLocalClass()) {
                str = c.class.getSimpleName();
                Method enclosingMethod = c.class.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = c.class.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int W = n4.i.W(str, '$', 0, 6);
                        if (W != -1) {
                            str = str.substring(W + 1, str.length());
                            g4.i.d(str, "substring(...)");
                        }
                    } else {
                        str = n4.i.Z(str, enclosingConstructor.getName() + '$');
                    }
                } else {
                    str = n4.i.Z(str, enclosingMethod.getName() + '$');
                }
            } else if (c.class.isArray()) {
                Class<?> componentType = c.class.getComponentType();
                if (componentType.isPrimitive() && (b2 = g4.q.b(componentType.getName())) != null) {
                    str = b2.concat("Array");
                }
                if (str == null) {
                    str = "Array";
                }
            } else {
                str = g4.q.b(c.class.getName());
                if (str == null) {
                    str = c.class.getSimpleName();
                }
            }
        }
        throw new IllegalArgumentException(s.c.d(sb, str, " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z4) {
        a aVar = this.f3138q;
        a aVar2 = a.f3099i;
        t3.h hVar = t3.h.f3400a;
        if (aVar == aVar2) {
            Object m5 = super.m(obj);
            return (!(m5 instanceof i) || (m5 instanceof h)) ? m5 : hVar;
        }
        androidx.emoji2.text.q qVar = e.f3116d;
        k kVar = (k) c.f3106l.get(this);
        while (true) {
            long andIncrement = c.h.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean s5 = s(andIncrement, false);
            int i5 = e.f3114b;
            long j5 = i5;
            long j6 = j2 / j5;
            int i6 = (int) (j2 % j5);
            if (kVar.f3442c != j6) {
                k a5 = c.a(this, j6, kVar);
                if (a5 != null) {
                    kVar = a5;
                } else if (s5) {
                    return new h(p());
                }
            }
            int e4 = c.e(this, kVar, i6, obj, j2, qVar, s5);
            if (e4 == 0) {
                kVar.a();
                return hVar;
            }
            if (e4 == 1) {
                break;
            }
            if (e4 != 2) {
                if (e4 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e4 == 4) {
                    if (j2 < c.f3103i.get(this)) {
                        kVar.a();
                    }
                    return new h(p());
                }
                if (e4 == 5) {
                    kVar.a();
                }
            } else {
                if (s5) {
                    kVar.h();
                    return new h(p());
                }
                k1 k1Var = qVar instanceof k1 ? (k1) qVar : null;
                if (k1Var != null) {
                    k1Var.a(kVar, i6 + i5);
                }
                j((kVar.f3442c * j5) + i6);
            }
        }
    }

    @Override // q4.c, q4.q
    public final Object c(Object obj, w3.c cVar) {
        if (D(obj, true) instanceof h) {
            throw p();
        }
        return t3.h.f3400a;
    }

    @Override // q4.c, q4.q
    public final Object m(Object obj) {
        return D(obj, false);
    }

    @Override // q4.c
    public final boolean t() {
        return this.f3138q == a.h;
    }
}
