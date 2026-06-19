package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public class u extends Dialog implements androidx.lifecycle.t, c1.f {

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.v f63g;
    public final c1.e h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f64i;

    public u(Context context, int i5) {
        super(context, i5);
        this.h = new c1.e(this);
        this.f64i = new f0(new o(this, 1));
    }

    public static void a(u uVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g4.i.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        g4.i.b(window);
        View decorView = window.getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        g4.i.b(window2);
        View decorView2 = window2.getDecorView();
        g4.i.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        g4.i.b(window3);
        View decorView3 = window3.getDecorView();
        g4.i.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        androidx.lifecycle.v vVar = this.f63g;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f63g = vVar2;
        return vVar2;
    }

    @Override // c1.f
    public final c1.d getSavedStateRegistry() {
        return this.h.f784b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f64i.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            g4.i.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            f0 f0Var = this.f64i;
            f0Var.f45e = onBackInvokedDispatcher;
            f0Var.d(f0Var.f47g);
        }
        this.h.b(bundle);
        androidx.lifecycle.v vVar = this.f63g;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f63g = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        g4.i.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.h.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.f63g;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f63g = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.v vVar = this.f63g;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f63g = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_DESTROY);
        this.f63g = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        b();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        g4.i.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g4.i.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
