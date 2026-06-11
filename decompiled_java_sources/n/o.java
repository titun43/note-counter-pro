package n;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2636a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final b.d f2637b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2638c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f2639d;

    public o(b.d dVar, g gVar, ComponentName componentName) {
        this.f2637b = dVar;
        this.f2638c = gVar;
        this.f2639d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f2636a) {
            try {
                try {
                    ((b.b) this.f2637b).b(this.f2638c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
