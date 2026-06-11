package u;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g, reason: collision with root package name */
    public Object f3448g;
    public Activity h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3449i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3450j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3451k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3452l = false;

    public c(Activity activity) {
        this.h = activity;
        this.f3449i = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h == activity) {
            this.h = null;
            this.f3451k = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f3451k || this.f3452l || this.f3450j) {
            return;
        }
        Object obj = this.f3448g;
        try {
            Object obj2 = d.f3455c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f3449i) {
                d.f3459g.postAtFrontOfQueue(new c0.a(20, d.f3454b.get(activity), obj2));
                this.f3452l = true;
                this.f3448g = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.h == activity) {
            this.f3450j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
