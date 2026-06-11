package org.apache.cordova;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class j implements DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2932g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(Object obj, int i5) {
        this.f2932g = i5;
        this.h = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f2932g) {
            case 0:
                ((u1.f) this.h).k(null, true);
                break;
            default:
                ((u1.f) this.h).k(null, false);
                break;
        }
    }
}
