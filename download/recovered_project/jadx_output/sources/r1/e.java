package r1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.n;

/* loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3156a;

    public e(f fVar) {
        this.f3156a = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        n.e().b(f.f3157i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
        f fVar = this.f3156a;
        fVar.c(fVar.f());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        n.e().b(f.f3157i, "Network connection lost", new Throwable[0]);
        f fVar = this.f3156a;
        fVar.c(fVar.f());
    }
}
