package h3;

import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f1713a = new n();

    public final void a(Object obj) {
        this.f1713a.e(obj);
    }

    public final void b(Exception exc) {
        n nVar = this.f1713a;
        nVar.getClass();
        b0.h(exc, "Exception must not be null");
        synchronized (nVar.f1727a) {
            try {
                if (nVar.f1729c) {
                    return;
                }
                nVar.f1729c = true;
                nVar.f1732f = exc;
                nVar.f1728b.b(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
