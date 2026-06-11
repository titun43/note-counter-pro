package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class q implements DialogInterface.OnDismissListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f417g;

    public q(s sVar) {
        this.f417g = sVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        s sVar = this.f417g;
        Dialog dialog = sVar.f430j0;
        if (dialog != null) {
            sVar.onDismiss(dialog);
        }
    }
}
