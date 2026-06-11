package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public class s extends z implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a0, reason: collision with root package name */
    public final p f421a0;

    /* renamed from: b0, reason: collision with root package name */
    public final q f422b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f423c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f424d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f425e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f426f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f427g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f428h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k1.j f429i0;

    /* renamed from: j0, reason: collision with root package name */
    public Dialog f430j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f431k0;
    public boolean l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f432m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f433n0;

    public s() {
        int i5 = 0;
        new o(this, i5);
        this.f421a0 = new p(this, i5);
        this.f422b0 = new q(this);
        this.f423c0 = 0;
        this.f424d0 = 0;
        this.f425e0 = true;
        this.f426f0 = true;
        this.f427g0 = -1;
        this.f429i0 = new k1.j(this, 2);
        this.f433n0 = false;
    }

    @Override // androidx.fragment.app.z
    public final a.a a() {
        return new r(this, new r(this));
    }

    @Override // androidx.fragment.app.z
    public final void j() {
        this.K = true;
    }

    @Override // androidx.fragment.app.z
    public final void l(Context context) {
        super.l(context);
        this.U.d(this.f429i0);
        if (this.f432m0) {
            return;
        }
        this.l0 = false;
    }

    @Override // androidx.fragment.app.z
    public final void m(Bundle bundle) {
        Bundle bundle2;
        this.K = true;
        Bundle bundle3 = this.h;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.B.U(bundle2);
            v0 v0Var = this.B;
            v0Var.H = false;
            v0Var.I = false;
            v0Var.O.f490i = false;
            v0Var.u(1);
        }
        v0 v0Var2 = this.B;
        if (v0Var2.f459v < 1) {
            v0Var2.H = false;
            v0Var2.I = false;
            v0Var2.O.f490i = false;
            v0Var2.u(1);
        }
        new Handler();
        this.f426f0 = this.E == 0;
        if (bundle != null) {
            this.f423c0 = bundle.getInt("android:style", 0);
            this.f424d0 = bundle.getInt("android:theme", 0);
            this.f425e0 = bundle.getBoolean("android:cancelable", true);
            this.f426f0 = bundle.getBoolean("android:showsDialog", this.f426f0);
            this.f427g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.z
    public final void n() {
        this.K = true;
        Dialog dialog = this.f430j0;
        if (dialog != null) {
            this.f431k0 = true;
            dialog.setOnDismissListener(null);
            this.f430j0.dismiss();
            if (!this.l0) {
                onDismiss(this.f430j0);
            }
            this.f430j0 = null;
            this.f433n0 = false;
        }
    }

    @Override // androidx.fragment.app.z
    public final void o() {
        this.K = true;
        if (!this.f432m0 && !this.l0) {
            this.l0 = true;
        }
        androidx.lifecycle.a0 a0Var = this.U;
        a0Var.getClass();
        androidx.lifecycle.a0.a("removeObserver");
        androidx.lifecycle.z zVar = (androidx.lifecycle.z) a0Var.f518b.b(this.f429i0);
        if (zVar == null) {
            return;
        }
        zVar.c();
        zVar.b(false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f431k0) {
            return;
        }
        if (u0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.l0) {
            return;
        }
        this.l0 = true;
        this.f432m0 = false;
        Dialog dialog = this.f430j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f430j0.dismiss();
        }
        this.f431k0 = true;
        if (this.f427g0 >= 0) {
            u0 e4 = e();
            int i5 = this.f427g0;
            if (i5 < 0) {
                throw new IllegalArgumentException(androidx.emoji2.text.u.h(i5, "Bad id: "));
            }
            e4.y(new s0(e4, i5), true);
            this.f427g0 = -1;
            return;
        }
        a aVar = new a(e());
        aVar.f315o = true;
        u0 u0Var = this.f508z;
        if (u0Var == null || u0Var == aVar.f317q) {
            aVar.b(new c1(3, this));
            aVar.e(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater p(Bundle bundle) {
        d0 d0Var;
        LayoutInflater p5 = super.p(bundle);
        boolean z4 = this.f426f0;
        if (z4 && !this.f428h0) {
            if (z4 && !this.f433n0) {
                try {
                    this.f428h0 = true;
                    Dialog x5 = x();
                    this.f430j0 = x5;
                    g.k kVar = null;
                    if (this.f426f0) {
                        int i5 = this.f423c0;
                        if (i5 != 1 && i5 != 2) {
                            if (i5 == 3) {
                                Window window = x5.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                d0Var = this.A;
                                if (d0Var == null) {
                                    kVar = d0Var.f368n;
                                }
                                if (kVar != null) {
                                    this.f430j0.setOwnerActivity(kVar);
                                }
                                this.f430j0.setCancelable(this.f425e0);
                                this.f430j0.setOnCancelListener(this.f421a0);
                                this.f430j0.setOnDismissListener(this.f422b0);
                                this.f433n0 = true;
                            }
                        }
                        x5.requestWindowFeature(1);
                        d0Var = this.A;
                        if (d0Var == null) {
                        }
                        if (kVar != null) {
                        }
                        this.f430j0.setCancelable(this.f425e0);
                        this.f430j0.setOnCancelListener(this.f421a0);
                        this.f430j0.setOnDismissListener(this.f422b0);
                        this.f433n0 = true;
                    } else {
                        this.f430j0 = null;
                    }
                    this.f428h0 = false;
                } catch (Throwable th) {
                    this.f428h0 = false;
                    throw th;
                }
            }
            if (u0.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f430j0;
            if (dialog != null) {
                return p5.cloneInContext(dialog.getContext());
            }
        } else if (u0.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f426f0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return p5;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return p5;
    }

    @Override // androidx.fragment.app.z
    public final void q(Bundle bundle) {
        Dialog dialog = this.f430j0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i5 = this.f423c0;
        if (i5 != 0) {
            bundle.putInt("android:style", i5);
        }
        int i6 = this.f424d0;
        if (i6 != 0) {
            bundle.putInt("android:theme", i6);
        }
        boolean z4 = this.f425e0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f426f0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i7 = this.f427g0;
        if (i7 != -1) {
            bundle.putInt("android:backStackId", i7);
        }
    }

    @Override // androidx.fragment.app.z
    public final void r() {
        this.K = true;
        Dialog dialog = this.f430j0;
        if (dialog != null) {
            this.f431k0 = false;
            dialog.show();
            View decorView = this.f430j0.getWindow().getDecorView();
            g4.i.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.z
    public final void s() {
        this.K = true;
        Dialog dialog = this.f430j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.z
    public final void t(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.t(layoutInflater, viewGroup, bundle);
        if (this.f430j0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f430j0.onRestoreInstanceState(bundle2);
    }

    public Dialog x() {
        if (u0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.u(v(), this.f424d0);
    }
}
