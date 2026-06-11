package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27b;

    public /* synthetic */ b0(Object obj, int i5) {
        this.f26a = i5;
        this.f27b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f26a) {
            case 0:
                ((a0) this.f27b).invoke();
                break;
            case 1:
                ((g.f0) this.f27b).F();
                break;
            default:
                ((Runnable) this.f27b).run();
                break;
        }
    }
}
