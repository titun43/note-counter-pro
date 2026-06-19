package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class e0 extends androidx.activity.s implements u.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final h0 mFragments;
    boolean mResumed;
    final androidx.lifecycle.v mFragmentLifecycleRegistry = new androidx.lifecycle.v(this);
    boolean mStopped = true;

    public e0() {
        final g.k kVar = (g.k) this;
        this.mFragments = new h0(new d0(kVar));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new a0(kVar, 0));
        final int i5 = 0;
        addOnConfigurationChangedListener(new e0.a() { // from class: androidx.fragment.app.b0
            @Override // e0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        kVar.mFragments.a();
                        break;
                    default:
                        kVar.mFragments.a();
                        break;
                }
            }
        });
        final int i6 = 1;
        addOnNewIntentListener(new e0.a() { // from class: androidx.fragment.app.b0
            @Override // e0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        kVar.mFragments.a();
                        break;
                    default:
                        kVar.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new c.b() { // from class: androidx.fragment.app.c0
            @Override // c.b
            public final void a(androidx.activity.s sVar) {
                d0 d0Var = g.k.this.mFragments.f389a;
                d0Var.f370p.b(d0Var, d0Var, null);
            }
        });
    }

    public static boolean f(u0 u0Var) {
        boolean z4 = false;
        for (z zVar : u0Var.f441c.m()) {
            if (zVar != null) {
                d0 d0Var = zVar.A;
                if ((d0Var == null ? null : d0Var.f371q) != null) {
                    z4 |= f(zVar.c());
                }
                if (zVar.T.f585c.compareTo(androidx.lifecycle.n.f560j) >= 0) {
                    zVar.T.g();
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f389a.f370p.f444f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                r0.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f389a.f370p.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public u0 getSupportFragmentManager() {
        return this.mFragments.f389a.f370p;
    }

    @Deprecated
    public r0.a getSupportLoaderManager() {
        return r0.a.a(this);
    }

    public void markFragmentsCreated() {
        while (f(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.s, android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i5, i6, intent);
    }

    @Deprecated
    public void onAttachFragment(z zVar) {
    }

    @Override // androidx.activity.s, u.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_CREATE);
        v0 v0Var = this.mFragments.f389a.f370p;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f389a.f370p.l();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.s, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 6) {
            return this.mFragments.f389a.f370p.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f389a.f370p.u(5);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.s, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f389a.f370p.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_RESUME);
        v0 v0Var = this.mFragments.f389a.f370p;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            v0 v0Var = this.mFragments.f389a.f370p;
            v0Var.H = false;
            v0Var.I = false;
            v0Var.O.f490i = false;
            v0Var.u(4);
        }
        this.mFragments.f389a.f370p.A(true);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_START);
        v0 v0Var2 = this.mFragments.f389a.f370p;
        v0Var2.H = false;
        v0Var2.I = false;
        v0Var2.O.f490i = false;
        v0Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        v0 v0Var = this.mFragments.f389a.f370p;
        v0Var.I = true;
        v0Var.O.f490i = true;
        v0Var.u(4);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_STOP);
    }

    public void setEnterSharedElementCallback(u.x xVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(u.x xVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(z zVar, Intent intent, int i5, Bundle bundle) {
        if (i5 == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (zVar.A == null) {
            throw new IllegalStateException("Fragment " + zVar + " not attached to Activity");
        }
        u0 e4 = zVar.e();
        if (e4.C != null) {
            e4.F.addLast(new q0(zVar.f494k, i5));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            e4.C.a(intent);
            return;
        }
        d0 d0Var = e4.w;
        d0Var.getClass();
        g4.i.e(intent, "intent");
        if (i5 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        v.a.startActivity(d0Var.f368n, intent, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(z zVar, IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        if (i5 == -1) {
            startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
            return;
        }
        Intent intent2 = intent;
        if (zVar.A == null) {
            throw new IllegalStateException("Fragment " + zVar + " not attached to Activity");
        }
        if (u0.J(2)) {
            Log.v("FragmentManager", "Fragment " + zVar + " received the following in startIntentSenderForResult() requestCode: " + i5 + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        u0 e4 = zVar.e();
        if (e4.D == null) {
            d0 d0Var = e4.w;
            d0Var.getClass();
            g4.i.e(intentSender, "intent");
            if (i5 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            g.k kVar = d0Var.f367m;
            if (kVar == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            kVar.startIntentSenderForResult(intentSender, i5, intent2, i6, i7, i8, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (u0.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + zVar);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        g4.i.e(intentSender, "intentSender");
        d.i iVar = new d.i(intentSender, intent2, i6, i7);
        e4.F.addLast(new q0(zVar.f494k, i5));
        if (u0.J(2)) {
            Log.v("FragmentManager", "Fragment " + zVar + "is launching an IntentSender for result ");
        }
        e4.D.a(iVar);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // u.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i5) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(z zVar, Intent intent, int i5) {
        startActivityFromFragment(zVar, intent, i5, (Bundle) null);
    }
}
