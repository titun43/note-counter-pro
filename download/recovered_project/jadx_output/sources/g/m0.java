package g;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;

/* loaded from: classes.dex */
public final class m0 implements j.y {

    /* renamed from: g, reason: collision with root package name */
    public boolean f1592g;
    public Object h;

    public m0(String str, boolean z4) {
        this.f1592g = z4;
        this.h = str;
    }

    public void a(zzlk zzlkVar) {
        if (this.f1592g) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((androidx.emoji2.text.t) this.h).x(new c2.a(zzlkVar));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    @Override // j.y
    public void b(j.n nVar, boolean z4) {
        k.l lVar;
        n0 n0Var = (n0) this.h;
        if (this.f1592g) {
            return;
        }
        this.f1592g = true;
        ActionMenuView actionMenuView = n0Var.f1593a.f2050a.f163g;
        if (actionMenuView != null && (lVar = actionMenuView.f146z) != null) {
            lVar.g();
            k.h hVar = lVar.f2155z;
            if (hVar != null && hVar.b()) {
                hVar.f2009i.dismiss();
            }
        }
        n0Var.f1594b.onPanelClosed(108, nVar);
        this.f1592g = false;
    }

    @Override // j.y
    public boolean k(j.n nVar) {
        ((n0) this.h).f1594b.onMenuOpened(108, nVar);
        return true;
    }
}
