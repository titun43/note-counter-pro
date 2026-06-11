package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class c0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f33a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f34b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f35c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f36d;

    public c0(z zVar, z zVar2, a0 a0Var, a0 a0Var2) {
        this.f33a = zVar;
        this.f34b = zVar2;
        this.f35c = a0Var;
        this.f36d = a0Var2;
    }

    public final void onBackCancelled() {
        this.f36d.invoke();
    }

    public final void onBackInvoked() {
        this.f35c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        g4.i.e(backEvent, "backEvent");
        this.f34b.a(new c(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        g4.i.e(backEvent, "backEvent");
        this.f33a.a(new c(backEvent));
    }
}
