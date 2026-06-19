package p0;

import android.util.Log;
import androidx.fragment.app.u0;
import androidx.fragment.app.z;
import g4.i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2971a = b.f2970a;

    public static b a(z zVar) {
        while (zVar != null) {
            if (zVar.A != null && zVar.f500q) {
                zVar.e();
            }
            zVar = zVar.C;
        }
        return f2971a;
    }

    public static void b(e eVar) {
        if (u0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f2972g.getClass().getName()), eVar);
        }
    }

    public static final void c(z zVar, String str) {
        i.e(str, "previousFragmentId");
        b(new a(zVar, "Attempting to reuse fragment " + zVar + " with previous ID " + str));
        a(zVar).getClass();
    }
}
