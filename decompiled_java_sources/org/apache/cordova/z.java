package org.apache.cordova;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class z extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public final w f2963g;

    public z(Context context, w wVar) {
        super(context);
        this.f2963g = wVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = this.f2963g.getView().dispatchKeyEvent(keyEvent);
        return !dispatchKeyEvent ? super.dispatchKeyEvent(keyEvent) : dispatchKeyEvent;
    }
}
