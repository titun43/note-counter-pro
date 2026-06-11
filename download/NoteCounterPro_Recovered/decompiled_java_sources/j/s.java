package j;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f1994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f1995b;

    public s(u uVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1995b = uVar;
        this.f1994a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1994a.onMenuItemActionCollapse(this.f1995b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1994a.onMenuItemActionExpand(this.f1995b.f(menuItem));
    }
}
