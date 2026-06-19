package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class w extends Service implements t {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.emoji2.text.t f591g = new androidx.emoji2.text.t(this);

    @Override // androidx.lifecycle.t
    public final o getLifecycle() {
        return (v) this.f591g.h;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        g4.i.e(intent, "intent");
        this.f591g.s(m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f591g.s(m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m mVar = m.ON_STOP;
        androidx.emoji2.text.t tVar = this.f591g;
        tVar.s(mVar);
        tVar.s(m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i5) {
        this.f591g.s(m.ON_START);
        super.onStart(intent, i5);
    }
}
