package r1;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3148i = n.g("BatteryNotLowTracker");

    @Override // r1.d
    public final Object a() {
        Intent registerReceiver = this.f3152b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        n.e().d(f3148i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // r1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // r1.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.e().b(f3148i, s.c.a("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
