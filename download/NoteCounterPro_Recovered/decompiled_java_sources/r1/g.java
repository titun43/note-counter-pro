package r1;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3159i = n.g("StorageNotLowTracker");

    @Override // r1.d
    public final Object a() {
        Intent registerReceiver = this.f3152b.registerReceiver(null, f());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // r1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // r1.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.e().b(f3159i, s.c.a("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
