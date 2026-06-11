package j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class a implements a0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1867a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1868b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f1869c;

    /* renamed from: d, reason: collision with root package name */
    public char f1870d;

    /* renamed from: e, reason: collision with root package name */
    public int f1871e;

    /* renamed from: f, reason: collision with root package name */
    public char f1872f;

    /* renamed from: g, reason: collision with root package name */
    public int f1873g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Context f1874i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1875j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1876k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1877l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1878m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1879n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1880o;

    /* renamed from: p, reason: collision with root package name */
    public int f1881p;

    @Override // a0.a
    public final a0.a a(q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a0.a
    public final q b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f1879n || this.f1880o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f1879n) {
                    mutate.setTintList(this.f1877l);
                }
                if (this.f1880o) {
                    this.h.setTintMode(this.f1878m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // a0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1873g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1872f;
    }

    @Override // a0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1875j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // a0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1877l;
    }

    @Override // a0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1878m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1869c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1871e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1870d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1867a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1868b;
        return charSequence != null ? charSequence : this.f1867a;
    }

    @Override // a0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1876k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f1881p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1881p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1881p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f1881p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        this.f1872f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f1881p = (z4 ? 1 : 0) | (this.f1881p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f1881p = (z4 ? 2 : 0) | (this.f1881p & (-3));
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final a0.a setContentDescription(CharSequence charSequence) {
        this.f1875j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f1881p = (z4 ? 16 : 0) | (this.f1881p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1877l = colorStateList;
        this.f1879n = true;
        c();
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1878m = mode;
        this.f1880o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1869c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        this.f1870d = c5;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f1870d = c5;
        this.f1872f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1867a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1868b = charSequence;
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final a0.a setTooltipText(CharSequence charSequence) {
        this.f1876k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f1881p = (this.f1881p & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i5) {
        this.f1872f = Character.toLowerCase(c5);
        this.f1873g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1875j = charSequence;
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i5) {
        this.f1870d = c5;
        this.f1871e = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        this.f1867a = this.f1874i.getResources().getString(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1876k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.h = v.a.getDrawable(this.f1874i, i5);
        c();
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i5, int i6) {
        this.f1870d = c5;
        this.f1871e = KeyEvent.normalizeMetaState(i5);
        this.f1872f = Character.toLowerCase(c6);
        this.f1873g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        return this;
    }
}
