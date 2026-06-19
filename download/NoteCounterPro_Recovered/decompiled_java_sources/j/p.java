package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements a0.a {
    public q A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1970d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1971e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1972f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f1973g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f1975j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1977l;

    /* renamed from: n, reason: collision with root package name */
    public final n f1979n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f1980o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f1981p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1982q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1983r;

    /* renamed from: y, reason: collision with root package name */
    public int f1989y;

    /* renamed from: z, reason: collision with root package name */
    public View f1990z;

    /* renamed from: i, reason: collision with root package name */
    public int f1974i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f1976k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f1978m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f1984s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f1985t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1986u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1987v = false;
    public boolean w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f1988x = 16;
    public boolean C = false;

    public p(n nVar, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        this.f1979n = nVar;
        this.f1967a = i6;
        this.f1968b = i5;
        this.f1969c = i7;
        this.f1970d = i8;
        this.f1971e = charSequence;
        this.f1989y = i9;
    }

    public static void c(StringBuilder sb, int i5, int i6, String str) {
        if ((i5 & i6) == i6) {
            sb.append(str);
        }
    }

    @Override // a0.a
    public final a0.a a(q qVar) {
        this.f1990z = null;
        this.A = qVar;
        this.f1979n.p(true);
        q qVar2 = this.A;
        if (qVar2 != null) {
            qVar2.f1991a = new k1.j(this, 10);
            qVar2.f1992b.setVisibilityListener(qVar2);
        }
        return this;
    }

    @Override // a0.a
    public final q b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f1989y & 8) == 0) {
            return false;
        }
        if (this.f1990z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1979n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.f1986u || this.f1987v)) {
            drawable = drawable.mutate();
            if (this.f1986u) {
                drawable.setTintList(this.f1984s);
            }
            if (this.f1987v) {
                drawable.setTintMode(this.f1985t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        q qVar;
        if ((this.f1989y & 8) != 0) {
            if (this.f1990z == null && (qVar = this.A) != null) {
                this.f1990z = qVar.f1992b.onCreateActionView(this);
            }
            if (this.f1990z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1979n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f1988x |= 32;
        } else {
            this.f1988x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f1990z;
        if (view != null) {
            return view;
        }
        q qVar = this.A;
        if (qVar == null) {
            return null;
        }
        View onCreateActionView = qVar.f1992b.onCreateActionView(this);
        this.f1990z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // a0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1976k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1975j;
    }

    @Override // a0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1982q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1968b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f1977l;
        if (drawable != null) {
            return d(drawable);
        }
        int i5 = this.f1978m;
        if (i5 == 0) {
            return null;
        }
        Drawable t5 = b3.g.t(this.f1979n.f1943a, i5);
        this.f1978m = 0;
        this.f1977l = t5;
        return d(t5);
    }

    @Override // a0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1984s;
    }

    @Override // a0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1985t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1973g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f1967a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1974i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1969c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f1980o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1971e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1972f;
        return charSequence != null ? charSequence : this.f1971e;
    }

    @Override // a0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1983r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f1980o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f1988x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1988x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1988x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        q qVar = this.A;
        return (qVar == null || !qVar.f1992b.overridesItemVisibility()) ? (this.f1988x & 8) == 0 : (this.f1988x & 8) == 0 && this.A.f1992b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i5;
        this.f1990z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i5 = this.f1967a) > 0) {
            view.setId(i5);
        }
        n nVar = this.f1979n;
        nVar.f1952k = true;
        nVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f1975j == c5) {
            return this;
        }
        this.f1975j = Character.toLowerCase(c5);
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i5 = this.f1988x;
        int i6 = (z4 ? 1 : 0) | (i5 & (-2));
        this.f1988x = i6;
        if (i5 != i6) {
            this.f1979n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i5 = this.f1988x;
        int i6 = i5 & 4;
        n nVar = this.f1979n;
        if (i6 == 0) {
            int i7 = (i5 & (-3)) | (z4 ? 2 : 0);
            this.f1988x = i7;
            if (i5 != i7) {
                nVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = nVar.f1948f;
        int size = arrayList.size();
        nVar.w();
        for (int i8 = 0; i8 < size; i8++) {
            p pVar = (p) arrayList.get(i8);
            if (pVar.f1968b == this.f1968b && (pVar.f1988x & 4) != 0 && pVar.isCheckable()) {
                boolean z5 = pVar == this;
                int i9 = pVar.f1988x;
                int i10 = (z5 ? 2 : 0) | (i9 & (-3));
                pVar.f1988x = i10;
                if (i9 != i10) {
                    pVar.f1979n.p(false);
                }
            }
        }
        nVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f1988x |= 16;
        } else {
            this.f1988x &= -17;
        }
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1978m = 0;
        this.f1977l = drawable;
        this.w = true;
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1984s = colorStateList;
        this.f1986u = true;
        this.w = true;
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1985t = mode;
        this.f1987v = true;
        this.w = true;
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1973g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.h == c5) {
            return this;
        }
        this.h = c5;
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1981p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.h = c5;
        this.f1975j = Character.toLowerCase(c6);
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
        int i6 = i5 & 3;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1989y = i5;
        n nVar = this.f1979n;
        nVar.f1952k = true;
        nVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1971e = charSequence;
        this.f1979n.p(false);
        f0 f0Var = this.f1980o;
        if (f0Var != null) {
            f0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1972f = charSequence;
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i5 = this.f1988x;
        int i6 = (z4 ? 0 : 8) | (i5 & (-9));
        this.f1988x = i6;
        if (i5 != i6) {
            n nVar = this.f1979n;
            nVar.h = true;
            nVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f1971e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // a0.a, android.view.MenuItem
    public final a0.a setContentDescription(CharSequence charSequence) {
        this.f1982q = charSequence;
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final a0.a setTooltipText(CharSequence charSequence) {
        this.f1983r = charSequence;
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i5) {
        if (this.f1975j == c5 && this.f1976k == i5) {
            return this;
        }
        this.f1975j = Character.toLowerCase(c5);
        this.f1976k = KeyEvent.normalizeMetaState(i5);
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i5) {
        if (this.h == c5 && this.f1974i == i5) {
            return this;
        }
        this.h = c5;
        this.f1974i = KeyEvent.normalizeMetaState(i5);
        this.f1979n.p(false);
        return this;
    }

    @Override // a0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i5, int i6) {
        this.h = c5;
        this.f1974i = KeyEvent.normalizeMetaState(i5);
        this.f1975j = Character.toLowerCase(c6);
        this.f1976k = KeyEvent.normalizeMetaState(i6);
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f1977l = null;
        this.f1978m = i5;
        this.w = true;
        this.f1979n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        setTitle(this.f1979n.f1943a.getString(i5));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        int i6;
        n nVar = this.f1979n;
        Context context = nVar.f1943a;
        View inflate = LayoutInflater.from(context).inflate(i5, (ViewGroup) new LinearLayout(context), false);
        this.f1990z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i6 = this.f1967a) > 0) {
            inflate.setId(i6);
        }
        nVar.f1952k = true;
        nVar.p(true);
        return this;
    }
}
