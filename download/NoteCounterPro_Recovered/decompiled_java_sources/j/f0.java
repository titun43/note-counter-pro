package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class f0 extends n implements SubMenu {
    public final p A;

    /* renamed from: z, reason: collision with root package name */
    public final n f1908z;

    public f0(Context context, n nVar, p pVar) {
        super(context);
        this.f1908z = nVar;
        this.A = pVar;
    }

    @Override // j.n
    public final boolean d(p pVar) {
        return this.f1908z.d(pVar);
    }

    @Override // j.n
    public final boolean e(n nVar, MenuItem menuItem) {
        return super.e(nVar, menuItem) || this.f1908z.e(nVar, menuItem);
    }

    @Override // j.n
    public final boolean f(p pVar) {
        return this.f1908z.f(pVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // j.n
    public final String j() {
        p pVar = this.A;
        int i5 = pVar != null ? pVar.f1967a : 0;
        if (i5 == 0) {
            return null;
        }
        return androidx.emoji2.text.u.h(i5, "android:menu:actionviewstates:");
    }

    @Override // j.n
    public final n k() {
        return this.f1908z.k();
    }

    @Override // j.n
    public final boolean m() {
        return this.f1908z.m();
    }

    @Override // j.n
    public final boolean n() {
        return this.f1908z.n();
    }

    @Override // j.n
    public final boolean o() {
        return this.f1908z.o();
    }

    @Override // j.n, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f1908z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // j.n, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f1908z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i5) {
        u(0, null, i5, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i5) {
        u(i5, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i5) {
        this.A.setIcon(i5);
        return this;
    }
}
