package org.apache.cordova;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class k implements DialogInterface.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2935g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(Object obj, int i5) {
        this.f2935g = i5;
        this.h = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        switch (this.f2935g) {
            case 0:
                if (i5 == 4) {
                    ((u1.f) this.h).k(null, true);
                    break;
                }
                break;
            default:
                if (i5 == 4) {
                    ((k1.j) this.h).y(null, false);
                    break;
                }
                break;
        }
        return false;
    }
}
