package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class a0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1493c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f1494d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var, androidx.emoji2.text.t tVar) {
        super(f0Var);
        this.f1494d = f0Var;
        this.f1495e = tVar;
    }

    @Override // g.c0
    public final IntentFilter d() {
        switch (this.f1493c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // g.c0
    public final int e() {
        Location location;
        boolean z4;
        long j2;
        Location location2;
        switch (this.f1493c) {
            case 0:
                return w.a((PowerManager) this.f1495e) ? 2 : 1;
            default:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f1495e;
                p0 p0Var = (p0) tVar.f285j;
                LocationManager locationManager = (LocationManager) tVar.f284i;
                if (p0Var.f1608b > System.currentTimeMillis()) {
                    z4 = p0Var.f1607a;
                } else {
                    Context context = (Context) tVar.h;
                    Location location3 = null;
                    if (b3.g.e(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (b3.g.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (o0.f1600d == null) {
                            o0.f1600d = new o0();
                        }
                        o0 o0Var = o0.f1600d;
                        o0Var.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        o0Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z4 = o0Var.f1603c == 1;
                        long j5 = o0Var.f1602b;
                        long j6 = o0Var.f1601a;
                        o0Var.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j7 = o0Var.f1602b;
                        if (j5 == -1 || j6 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j6) {
                                j5 = j7;
                            } else if (currentTimeMillis > j5) {
                                j5 = j6;
                            }
                            j2 = j5 + 60000;
                        }
                        p0Var.f1607a = z4;
                        p0Var.f1608b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i5 = Calendar.getInstance().get(11);
                        if (i5 < 6 || i5 >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // g.c0
    public final void g() {
        switch (this.f1493c) {
            case 0:
                this.f1494d.p(true, true);
                break;
            default:
                this.f1494d.p(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var, Context context) {
        super(f0Var);
        this.f1494d = f0Var;
        this.f1495e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
