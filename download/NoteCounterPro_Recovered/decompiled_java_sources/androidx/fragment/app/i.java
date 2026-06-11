package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f393c;

    public i(ViewGroup viewGroup, boolean z4, g1 g1Var, j jVar) {
        this.f391a = viewGroup;
        this.f392b = z4;
        this.f393c = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g4.i.e(animator, "anim");
        this.f391a.endViewTransition(null);
        if (!this.f392b) {
            throw null;
        }
        throw null;
    }
}
