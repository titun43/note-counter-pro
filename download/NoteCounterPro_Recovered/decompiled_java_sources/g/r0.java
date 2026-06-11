package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class r0 extends i.b implements j.l {

    /* renamed from: i, reason: collision with root package name */
    public final Context f1620i;

    /* renamed from: j, reason: collision with root package name */
    public final j.n f1621j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.emoji2.text.p f1622k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f1623l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f1624m;

    public r0(s0 s0Var, Context context, androidx.emoji2.text.p pVar) {
        this.f1624m = s0Var;
        this.f1620i = context;
        this.f1622k = pVar;
        j.n nVar = new j.n(context);
        nVar.f1953l = 1;
        this.f1621j = nVar;
        nVar.f1947e = this;
    }

    @Override // i.b
    public final void a() {
        s0 s0Var = this.f1624m;
        if (s0Var.f1635i != this) {
            return;
        }
        if (s0Var.f1642p) {
            s0Var.f1636j = this;
            s0Var.f1637k = this.f1622k;
        } else {
            this.f1622k.b(this);
        }
        this.f1622k = null;
        s0Var.p(false);
        ActionBarContextView actionBarContextView = s0Var.f1633f;
        if (actionBarContextView.f116q == null) {
            actionBarContextView.e();
        }
        s0Var.f1630c.setHideOnContentScrollEnabled(s0Var.f1647u);
        s0Var.f1635i = null;
    }

    @Override // i.b
    public final View b() {
        WeakReference weakReference = this.f1623l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public final j.n c() {
        return this.f1621j;
    }

    @Override // i.b
    public final MenuInflater d() {
        return new i.i(this.f1620i);
    }

    @Override // i.b
    public final CharSequence e() {
        return this.f1624m.f1633f.getSubtitle();
    }

    @Override // j.l
    public final void f(j.n nVar) {
        if (this.f1622k == null) {
            return;
        }
        i();
        k.l lVar = this.f1624m.f1633f.f109j;
        if (lVar != null) {
            lVar.l();
        }
    }

    @Override // j.l
    public final boolean g(j.n nVar, MenuItem menuItem) {
        androidx.emoji2.text.p pVar = this.f1622k;
        if (pVar != null) {
            return ((i.a) pVar.h).a(this, menuItem);
        }
        return false;
    }

    @Override // i.b
    public final CharSequence h() {
        return this.f1624m.f1633f.getTitle();
    }

    @Override // i.b
    public final void i() {
        if (this.f1624m.f1635i != this) {
            return;
        }
        j.n nVar = this.f1621j;
        nVar.w();
        try {
            this.f1622k.f(this, nVar);
        } finally {
            nVar.v();
        }
    }

    @Override // i.b
    public final boolean j() {
        return this.f1624m.f1633f.f123y;
    }

    @Override // i.b
    public final void k(View view) {
        this.f1624m.f1633f.setCustomView(view);
        this.f1623l = new WeakReference(view);
    }

    @Override // i.b
    public final void l(int i5) {
        m(this.f1624m.f1628a.getResources().getString(i5));
    }

    @Override // i.b
    public final void m(CharSequence charSequence) {
        this.f1624m.f1633f.setSubtitle(charSequence);
    }

    @Override // i.b
    public final void n(int i5) {
        o(this.f1624m.f1628a.getResources().getString(i5));
    }

    @Override // i.b
    public final void o(CharSequence charSequence) {
        this.f1624m.f1633f.setTitle(charSequence);
    }

    @Override // i.b
    public final void p(boolean z4) {
        this.h = z4;
        this.f1624m.f1633f.setTitleOptional(z4);
    }
}
