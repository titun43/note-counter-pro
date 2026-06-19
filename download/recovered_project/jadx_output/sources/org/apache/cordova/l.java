package org.apache.cordova;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2941g;
    public final /* synthetic */ k1.j h;

    public /* synthetic */ l(k1.j jVar, int i5) {
        this.f2941g = i5;
        this.h = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f2941g) {
            case 0:
                this.h.y(null, true);
                break;
            default:
                this.h.y(null, false);
                break;
        }
    }
}
