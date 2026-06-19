package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z implements Window.Callback {

    /* renamed from: g, reason: collision with root package name */
    public final Window.Callback f1654g;
    public l0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1655i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1656j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1657k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0 f1658l;

    public z(f0 f0Var, Window.Callback callback) {
        this.f1658l = f0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1654g = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1655i = true;
            callback.onContentChanged();
        } finally {
            this.f1655i = false;
        }
    }

    public final boolean b(int i5, Menu menu) {
        return this.f1654g.onMenuOpened(i5, menu);
    }

    public final void c(int i5, Menu menu) {
        this.f1654g.onPanelClosed(i5, menu);
    }

    public final void d(List list, Menu menu, int i5) {
        i.m.a(this.f1654g, list, menu, i5);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1654g.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f1656j;
        Window.Callback callback = this.f1654g;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.f1658l.w(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f1654g.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            f0 f0Var = this.f1658l;
            f0Var.C();
            a aVar = f0Var.f1548u;
            if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                e0 e0Var = f0Var.S;
                if (e0Var == null || !f0Var.H(e0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (f0Var.S == null) {
                        e0 B = f0Var.B(0);
                        f0Var.I(B, keyEvent);
                        boolean H = f0Var.H(B, keyEvent.getKeyCode(), keyEvent);
                        B.f1521k = false;
                        if (H) {
                        }
                    }
                    return false;
                }
                e0 e0Var2 = f0Var.S;
                if (e0Var2 != null) {
                    e0Var2.f1522l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1654g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1654g.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1654g.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1654g.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1654g.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1654g.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1655i) {
            this.f1654g.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0 || (menu instanceof j.n)) {
            return this.f1654g.onCreatePanelMenu(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i5) {
        l0 l0Var = this.h;
        if (l0Var != null) {
            View view = i5 == 0 ? new View(l0Var.f1590a.f1593a.f2050a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f1654g.onCreatePanelView(i5);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1654g.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        return this.f1654g.onMenuItemSelected(i5, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i5, Menu menu) {
        b(i5, menu);
        f0 f0Var = this.f1658l;
        if (i5 == 108) {
            f0Var.C();
            a aVar = f0Var.f1548u;
            if (aVar != null) {
                aVar.c(true);
            }
        } else {
            f0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) {
        if (this.f1657k) {
            this.f1654g.onPanelClosed(i5, menu);
            return;
        }
        c(i5, menu);
        f0 f0Var = this.f1658l;
        if (i5 == 108) {
            f0Var.C();
            a aVar = f0Var.f1548u;
            if (aVar != null) {
                aVar.c(false);
                return;
            }
            return;
        }
        if (i5 == 0) {
            e0 B = f0Var.B(i5);
            if (B.f1523m) {
                f0Var.u(B, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        i.n.a(this.f1654g, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        j.n nVar = menu instanceof j.n ? (j.n) menu : null;
        if (i5 == 0 && nVar == null) {
            return false;
        }
        if (nVar != null) {
            nVar.f1964x = true;
        }
        l0 l0Var = this.h;
        if (l0Var != null && i5 == 0) {
            n0 n0Var = l0Var.f1590a;
            if (!n0Var.f1596d) {
                n0Var.f1593a.f2060l = true;
                n0Var.f1596d = true;
            }
        }
        boolean onPreparePanel = this.f1654g.onPreparePanel(i5, view, menu);
        if (nVar != null) {
            nVar.f1964x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i5) {
        j.n nVar = this.f1658l.B(0).h;
        if (nVar != null) {
            d(list, nVar, i5);
        } else {
            d(list, menu, i5);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.l.a(this.f1654g, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1654g.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f1654g.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return i.l.b(this.f1654g, callback, i5);
        }
        f0 f0Var = this.f1658l;
        Context context = f0Var.f1544q;
        r1.h hVar = new r1.h();
        hVar.h = context;
        hVar.f3161g = callback;
        hVar.f3162i = new ArrayList();
        hVar.f3163j = new o.l(0);
        i.b o2 = f0Var.o(hVar);
        if (o2 != null) {
            return hVar.i(o2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1654g.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
