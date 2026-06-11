package androidx.activity;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f28a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32e;

    public c(BackEvent backEvent) {
        float k5 = a.k(backEvent);
        float l5 = a.l(backEvent);
        float h = a.h(backEvent);
        int j2 = a.j(backEvent);
        long b2 = Build.VERSION.SDK_INT >= 36 ? b.b(backEvent) : 0L;
        this.f28a = k5;
        this.f29b = l5;
        this.f30c = h;
        this.f31d = j2;
        this.f32e = b2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f28a + ", touchY=" + this.f29b + ", progress=" + this.f30c + ", swipeEdge=" + this.f31d + ", frameTimeMillis=" + this.f32e + '}';
    }
}
