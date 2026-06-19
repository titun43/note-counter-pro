package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnCancelListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p(Object obj, int i5) {
        this.f415g = i5;
        this.h = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f415g) {
            case 0:
                s sVar = (s) this.h;
                Dialog dialog = sVar.f430j0;
                if (dialog != null) {
                    sVar.onCancel(dialog);
                    break;
                }
                break;
            case 1:
                ((u1.f) this.h).k(null, false);
                break;
            default:
                ((k1.j) this.h).y(null, false);
                break;
        }
    }
}
