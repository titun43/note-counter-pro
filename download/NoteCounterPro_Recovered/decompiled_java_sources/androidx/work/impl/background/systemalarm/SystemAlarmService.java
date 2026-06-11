package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.w;
import androidx.work.n;
import java.util.HashMap;
import java.util.WeakHashMap;
import n1.g;
import u1.k;

/* loaded from: classes.dex */
public class SystemAlarmService extends w {

    /* renamed from: j, reason: collision with root package name */
    public static final String f653j = n.g("SystemAlarmService");
    public g h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f654i;

    public final void a() {
        this.f654i = true;
        n.e().b(f653j, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f3512a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = k.f3513b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                n.e().h(k.f3512a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.h = gVar;
        if (gVar.f2686p != null) {
            n.e().d(g.f2677q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.f2686p = this;
        }
        this.f654i = false;
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f654i = true;
        this.h.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        super.onStartCommand(intent, i5, i6);
        if (this.f654i) {
            n.e().f(f653j, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.h.d();
            g gVar = new g(this);
            this.h = gVar;
            if (gVar.f2686p != null) {
                n.e().d(g.f2677q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.f2686p = this;
            }
            this.f654i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.h.a(intent, i6);
        return 3;
    }
}
