package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class o implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: g, reason: collision with root package name */
    public f0 f1965g;
    public g.i h;

    /* renamed from: i, reason: collision with root package name */
    public j f1966i;

    @Override // j.y
    public final void b(n nVar, boolean z4) {
        g.i iVar;
        if ((z4 || nVar == this.f1965g) && (iVar = this.h) != null) {
            iVar.dismiss();
        }
    }

    @Override // j.y
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        f0 f0Var = this.f1965g;
        j jVar = this.f1966i;
        if (jVar.f1935l == null) {
            jVar.f1935l = new i(jVar);
        }
        f0Var.q(jVar.f1935l.getItem(i5), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1966i.b(this.f1965g, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f0 f0Var = this.f1965g;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.h.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f0Var.performShortcut(i5, keyEvent, 0);
    }
}
