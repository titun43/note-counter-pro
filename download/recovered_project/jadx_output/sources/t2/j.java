package t2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.d0;
import androidx.fragment.app.s;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public class j extends s {

    /* renamed from: o0, reason: collision with root package name */
    public Dialog f3380o0;

    /* renamed from: p0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3381p0;

    /* renamed from: q0, reason: collision with root package name */
    public AlertDialog f3382q0;

    @Override // androidx.fragment.app.s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3381p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.s
    public final Dialog x() {
        Dialog dialog = this.f3380o0;
        if (dialog != null) {
            return dialog;
        }
        this.f426f0 = false;
        if (this.f3382q0 == null) {
            d0 d0Var = this.A;
            g.k kVar = d0Var == null ? null : d0Var.f368n;
            b0.g(kVar);
            this.f3382q0 = new AlertDialog.Builder(kVar).create();
        }
        return this.f3382q0;
    }
}
