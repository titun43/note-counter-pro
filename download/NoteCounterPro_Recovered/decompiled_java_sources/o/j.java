package o;

import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2730a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2731b = new Object();

    public static final void a(g gVar, int i5) {
        gVar.f2721g = new int[i5];
        gVar.h = new Object[i5];
    }

    public static final int b(g gVar, Object obj, int i5) {
        int i6 = gVar.f2722i;
        if (i6 == 0) {
            return -1;
        }
        try {
            int a5 = p.a.a(gVar.f2721g, i6, i5);
            if (a5 < 0 || g4.i.a(obj, gVar.h[a5])) {
                return a5;
            }
            int i7 = a5 + 1;
            while (i7 < i6 && gVar.f2721g[i7] == i5) {
                if (g4.i.a(obj, gVar.h[i7])) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = a5 - 1; i8 >= 0 && gVar.f2721g[i8] == i5; i8--) {
                if (g4.i.a(obj, gVar.h[i8])) {
                    return i8;
                }
            }
            return ~i7;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
