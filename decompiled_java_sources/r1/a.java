package r1;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3147i = n.g("BatteryChrgTracker");

    @Override // r1.d
    public final Object a() {
        Intent registerReceiver = this.f3152b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            n.e().d(f3147i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // r1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // r1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c5 = 0;
        n.e().b(f3147i, "Received ".concat(action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                c(Boolean.FALSE);
                break;
            case 1:
                c(Boolean.FALSE);
                break;
            case 2:
                c(Boolean.TRUE);
                break;
            case 3:
                c(Boolean.TRUE);
                break;
        }
    }
}
