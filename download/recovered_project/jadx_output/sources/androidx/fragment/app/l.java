package androidx.fragment.app;

import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f402a = new l();

    public final void a(AnimatorSet animatorSet) {
        g4.i.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j2) {
        g4.i.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j2);
    }
}
