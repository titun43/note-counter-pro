package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class i0 extends Fragment {
    public static final /* synthetic */ int h = 0;

    /* renamed from: g, reason: collision with root package name */
    public u1.f f542g;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final h0 Companion = new h0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            g4.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            g4.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            g4.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            g4.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            g4.i.e(activity, "activity");
            int i5 = i0.h;
            f0.a(activity, m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            g4.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            g4.i.e(activity, "activity");
            g4.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            g4.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            g4.i.e(activity, "activity");
        }
    }

    public final void a(m mVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            g4.i.d(activity, "activity");
            f0.a(activity, mVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(m.ON_DESTROY);
        this.f542g = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        u1.f fVar = this.f542g;
        if (fVar != null) {
            ((e0) fVar.h).a();
        }
        a(m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        u1.f fVar = this.f542g;
        if (fVar != null) {
            e0 e0Var = (e0) fVar.h;
            int i5 = e0Var.f534g + 1;
            e0Var.f534g = i5;
            if (i5 == 1 && e0Var.f536j) {
                e0Var.f538l.e(m.ON_START);
                e0Var.f536j = false;
            }
        }
        a(m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(m.ON_STOP);
    }
}
