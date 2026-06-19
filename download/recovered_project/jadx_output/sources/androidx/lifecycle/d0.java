package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d0 extends g {
    final /* synthetic */ e0 this$0;

    public static final class a extends g {
        final /* synthetic */ e0 this$0;

        public a(e0 e0Var) {
            this.this$0 = e0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g4.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g4.i.e(activity, "activity");
            e0 e0Var = this.this$0;
            int i5 = e0Var.f534g + 1;
            e0Var.f534g = i5;
            if (i5 == 1 && e0Var.f536j) {
                e0Var.f538l.e(m.ON_START);
                e0Var.f536j = false;
            }
        }
    }

    public d0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        g4.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i5 = i0.h;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            g4.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((i0) findFragmentByTag).f542g = this.this$0.f540n;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        g4.i.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i5 = e0Var.h - 1;
        e0Var.h = i5;
        if (i5 == 0) {
            Handler handler = e0Var.f537k;
            g4.i.b(handler);
            handler.postDelayed(e0Var.f539m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        g4.i.e(activity, "activity");
        c0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        g4.i.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i5 = e0Var.f534g - 1;
        e0Var.f534g = i5;
        if (i5 == 0 && e0Var.f535i) {
            e0Var.f538l.e(m.ON_STOP);
            e0Var.f536j = true;
        }
    }
}
