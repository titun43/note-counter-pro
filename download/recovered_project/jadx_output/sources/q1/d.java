package q1;

import android.os.Build;
import androidx.work.n;
import t1.i;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3083e = n.g("NetworkMeteredCtrlr");

    @Override // q1.c
    public final boolean a(i iVar) {
        return iVar.f3348j.f623a == 5;
    }

    @Override // q1.c
    public final boolean b(Object obj) {
        p1.a aVar = (p1.a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (aVar.f2973a && aVar.f2975c) ? false : true;
        }
        n.e().b(f3083e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !aVar.f2973a;
    }
}
