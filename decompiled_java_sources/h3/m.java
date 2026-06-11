package h3;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1724a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f1725b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1726c;

    public final void a(l lVar) {
        synchronized (this.f1724a) {
            try {
                if (this.f1725b == null) {
                    this.f1725b = new ArrayDeque();
                }
                this.f1725b.add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(g gVar) {
        l lVar;
        synchronized (this.f1724a) {
            if (this.f1725b != null && !this.f1726c) {
                this.f1726c = true;
                while (true) {
                    synchronized (this.f1724a) {
                        try {
                            lVar = (l) this.f1725b.poll();
                            if (lVar == null) {
                                this.f1726c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(gVar);
                }
            }
        }
    }
}
