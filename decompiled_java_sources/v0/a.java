package v0;

import android.content.Context;
import android.os.Build;
import g4.i;
import o4.e0;
import o4.w;
import t4.o;
import v4.e;
import x0.d;
import x0.g;
import y4.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f3552a;

    public a(g gVar) {
        this.f3552a = gVar;
    }

    public static final a a(Context context) {
        d dVar;
        i.e(context, "context");
        int i5 = Build.VERSION.SDK_INT;
        s0.a aVar = s0.a.f3288a;
        if ((i5 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) com.google.android.gms.internal.ads.a.B());
            i.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(com.google.android.gms.internal.ads.a.l(systemService), 1);
        } else {
            if ((i5 >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) com.google.android.gms.internal.ads.a.B());
                i.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new d(com.google.android.gms.internal.ads.a.l(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new a(dVar);
        }
        return null;
    }

    public j3.a b(x0.a aVar) {
        i.e(aVar, "request");
        e eVar = e0.f2793a;
        return b.b(w.b(w.a(o.f3438a), new k0.b(this, aVar, null, 4)));
    }
}
