package t2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class k extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f3384b = eVar;
        this.f3383a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i5);
            return;
        }
        int i6 = f.f3373a;
        e eVar = this.f3384b;
        Context context = this.f3383a;
        int c5 = eVar.c(context, i6);
        int i7 = h.f3377c;
        if (c5 == 1 || c5 == 2 || c5 == 3 || c5 == 9) {
            Intent b2 = eVar.b(context, "n", c5);
            eVar.g(context, c5, b2 == null ? null : PendingIntent.getActivity(context, 0, b2, 201326592));
        }
    }
}
