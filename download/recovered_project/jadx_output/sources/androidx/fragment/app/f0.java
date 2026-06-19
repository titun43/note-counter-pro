package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class f0 extends AnimationSet implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f376g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f377i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f378j;

    public f0(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.f378j = true;
        this.f376g = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f378j = true;
        if (this.h) {
            return !this.f377i;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.h = true;
            f0.v.a(this.f376g, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.h;
        ViewGroup viewGroup = this.f376g;
        if (z4 || !this.f378j) {
            viewGroup.endViewTransition(null);
            this.f377i = true;
        } else {
            this.f378j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f5) {
        this.f378j = true;
        if (this.h) {
            return !this.f377i;
        }
        if (!super.getTransformation(j2, transformation, f5)) {
            this.h = true;
            f0.v.a(this.f376g, this);
        }
        return true;
    }
}
