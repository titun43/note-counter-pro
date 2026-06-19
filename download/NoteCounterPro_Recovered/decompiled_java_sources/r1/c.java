package r1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;
import g.b0;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static final String h = n.g("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final b0 f3149g;

    public c(Context context, w1.a aVar) {
        super(context, aVar);
        this.f3149g = new b0(this, 2);
    }

    @Override // r1.d
    public final void d() {
        n.e().b(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f3152b.registerReceiver(this.f3149g, f());
    }

    @Override // r1.d
    public final void e() {
        n.e().b(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f3152b.unregisterReceiver(this.f3149g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
