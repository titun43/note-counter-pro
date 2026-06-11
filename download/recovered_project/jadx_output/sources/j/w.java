package j;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class w implements PopupWindow.OnDismissListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f2001g;

    public w(x xVar) {
        this.f2001g = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2001g.c();
    }
}
