package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.p;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends b implements j.l {

    /* renamed from: i, reason: collision with root package name */
    public Context f1740i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContextView f1741j;

    /* renamed from: k, reason: collision with root package name */
    public p f1742k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f1743l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1744m;

    /* renamed from: n, reason: collision with root package name */
    public j.n f1745n;

    @Override // i.b
    public final void a() {
        if (this.f1744m) {
            return;
        }
        this.f1744m = true;
        this.f1742k.b(this);
    }

    @Override // i.b
    public final View b() {
        WeakReference weakReference = this.f1743l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public final j.n c() {
        return this.f1745n;
    }

    @Override // i.b
    public final MenuInflater d() {
        return new i(this.f1741j.getContext());
    }

    @Override // i.b
    public final CharSequence e() {
        return this.f1741j.getSubtitle();
    }

    @Override // j.l
    public final void f(j.n nVar) {
        i();
        k.l lVar = this.f1741j.f109j;
        if (lVar != null) {
            lVar.l();
        }
    }

    @Override // j.l
    public final boolean g(j.n nVar, MenuItem menuItem) {
        return ((a) this.f1742k.h).a(this, menuItem);
    }

    @Override // i.b
    public final CharSequence h() {
        return this.f1741j.getTitle();
    }

    @Override // i.b
    public final void i() {
        this.f1742k.f(this, this.f1745n);
    }

    @Override // i.b
    public final boolean j() {
        return this.f1741j.f123y;
    }

    @Override // i.b
    public final void k(View view) {
        this.f1741j.setCustomView(view);
        this.f1743l = view != null ? new WeakReference(view) : null;
    }

    @Override // i.b
    public final void l(int i5) {
        m(this.f1740i.getString(i5));
    }

    @Override // i.b
    public final void m(CharSequence charSequence) {
        this.f1741j.setSubtitle(charSequence);
    }

    @Override // i.b
    public final void n(int i5) {
        o(this.f1740i.getString(i5));
    }

    @Override // i.b
    public final void o(CharSequence charSequence) {
        this.f1741j.setTitle(charSequence);
    }

    @Override // i.b
    public final void p(boolean z4) {
        this.h = z4;
        this.f1741j.setTitleOptional(z4);
    }
}
