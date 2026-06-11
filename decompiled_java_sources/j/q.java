package j;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class q implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public k1.j f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f1992b;

    public q(u uVar, ActionProvider actionProvider) {
        this.f1992b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        k1.j jVar = this.f1991a;
        if (jVar != null) {
            n nVar = ((p) jVar.h).f1979n;
            nVar.h = true;
            nVar.p(true);
        }
    }
}
