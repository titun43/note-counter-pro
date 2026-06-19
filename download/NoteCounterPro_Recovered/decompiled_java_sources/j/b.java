package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.w1;

/* loaded from: classes.dex */
public final class b extends w1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1882p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f1883q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1883q = actionMenuItemView;
    }

    @Override // k.w1
    public final d0 b() {
        k.h hVar;
        switch (this.f1882p) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f1883q).f78s;
                if (cVar == null || (hVar = ((k.i) cVar).f2109a.f2155z) == null) {
                    return null;
                }
                return hVar.a();
            default:
                k.h hVar2 = ((k.k) this.f1883q).f2133j.f2154y;
                if (hVar2 == null) {
                    return null;
                }
                return hVar2.a();
        }
    }

    @Override // k.w1
    public final boolean c() {
        d0 b2;
        switch (this.f1882p) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1883q;
                m mVar = actionMenuItemView.f76q;
                return mVar != null && mVar.a(actionMenuItemView.f73n) && (b2 = b()) != null && b2.a();
            default:
                ((k.k) this.f1883q).f2133j.l();
                return true;
        }
    }

    @Override // k.w1
    public boolean d() {
        switch (this.f1882p) {
            case 1:
                k.l lVar = ((k.k) this.f1883q).f2133j;
                if (lVar.A != null) {
                    return false;
                }
                lVar.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k.k kVar, k.k kVar2) {
        super(kVar2);
        this.f1883q = kVar;
    }
}
