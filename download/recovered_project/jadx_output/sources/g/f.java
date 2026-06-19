package g;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1527a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == -3 || i5 == -2 || i5 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1527a.get(), message.what);
        } else {
            if (i5 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
