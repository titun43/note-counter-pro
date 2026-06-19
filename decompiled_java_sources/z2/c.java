package z2;

import android.content.Context;
import f2.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3943b;

    /* renamed from: a, reason: collision with root package name */
    public k f3944a;

    static {
        c cVar = new c();
        cVar.f3944a = null;
        f3943b = cVar;
    }

    public static k a(Context context) {
        k kVar;
        c cVar = f3943b;
        synchronized (cVar) {
            try {
                if (cVar.f3944a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f3944a = new k(context);
                }
                kVar = cVar.f3944a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
