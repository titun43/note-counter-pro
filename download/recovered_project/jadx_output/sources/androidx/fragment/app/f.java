package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f375b;

    public f(g1 g1Var, ViewGroup viewGroup, g gVar) {
        this.f374a = viewGroup;
        this.f375b = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        g4.i.e(animation, "animation");
        ViewGroup viewGroup = this.f374a;
        viewGroup.post(new a2.b(2, viewGroup, this.f375b));
        if (u0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        g4.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        g4.i.e(animation, "animation");
        if (u0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
