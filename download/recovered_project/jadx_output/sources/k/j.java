package k;

import android.view.View;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final h f2128g;
    public final /* synthetic */ l h;

    public j(l lVar, h hVar) {
        this.h = lVar;
        this.f2128g = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.l lVar;
        l lVar2 = this.h;
        j.n nVar = lVar2.f2139i;
        if (nVar != null && (lVar = nVar.f1947e) != null) {
            lVar.f(nVar);
        }
        View view = (View) lVar2.f2144n;
        if (view != null && view.getWindowToken() != null) {
            h hVar = this.f2128g;
            if (!hVar.b()) {
                if (hVar.f2006e != null) {
                    hVar.d(0, 0, false, false);
                }
            }
            lVar2.f2154y = hVar;
        }
        lVar2.A = null;
    }
}
