package t2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: g, reason: collision with root package name */
    public Dialog f3366g;
    public DialogInterface.OnCancelListener h;

    /* renamed from: i, reason: collision with root package name */
    public AlertDialog f3367i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3366g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3367i == null) {
            Activity activity = getActivity();
            b0.g(activity);
            this.f3367i = new AlertDialog.Builder(activity).create();
        }
        return this.f3367i;
    }
}
