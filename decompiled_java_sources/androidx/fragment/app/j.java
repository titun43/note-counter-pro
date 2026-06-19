package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class j extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final h f396b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f397c;

    public j(h hVar) {
        this.f396b = hVar;
    }

    @Override // androidx.fragment.app.f1
    public final void a(ViewGroup viewGroup) {
        g4.i.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f397c;
        animatorSet.getClass();
        animatorSet.start();
        if (u0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.f1
    public final void b(androidx.activity.c cVar, ViewGroup viewGroup) {
        g4.i.e(viewGroup, "container");
        this.f397c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.f1
    public final void c(ViewGroup viewGroup) {
        g4.i.e(viewGroup, "container");
        h hVar = this.f396b;
        if (hVar.x()) {
            return;
        }
        Context context = viewGroup.getContext();
        g4.i.d(context, "context");
        androidx.emoji2.text.p S = hVar.S(context);
        this.f397c = S != null ? (AnimatorSet) S.f274i : null;
        throw null;
    }
}
