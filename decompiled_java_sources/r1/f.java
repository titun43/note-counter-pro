package r1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.n;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3157i = n.g("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f3158g;
    public final e h;

    public f(Context context, w1.a aVar) {
        super(context, aVar);
        this.f3158g = (ConnectivityManager) this.f3152b.getSystemService("connectivity");
        this.h = new e(this);
    }

    @Override // r1.d
    public final Object a() {
        return f();
    }

    @Override // r1.d
    public final void d() {
        String str = f3157i;
        try {
            n.e().b(str, "Registering network callback", new Throwable[0]);
            this.f3158g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e4) {
            n.e().d(str, "Received exception while registering network callback", e4);
        }
    }

    @Override // r1.d
    public final void e() {
        String str = f3157i;
        try {
            n.e().b(str, "Unregistering network callback", new Throwable[0]);
            this.f3158g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e4) {
            n.e().d(str, "Received exception while unregistering network callback", e4);
        }
    }

    public final p1.a f() {
        boolean z4;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f3158g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z5 = false;
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e4) {
            n.e().d(f3157i, "Unable to validate active network", e4);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z4 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z5 = true;
                }
                p1.a aVar = new p1.a();
                aVar.f2973a = z6;
                aVar.f2974b = z4;
                aVar.f2975c = isActiveNetworkMetered;
                aVar.f2976d = z5;
                return aVar;
            }
        }
        z4 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z5 = true;
        }
        p1.a aVar2 = new p1.a();
        aVar2.f2973a = z6;
        aVar2.f2974b = z4;
        aVar2.f2975c = isActiveNetworkMetered2;
        aVar2.f2976d = z5;
        return aVar2;
    }
}
