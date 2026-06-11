package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f41a;

    /* renamed from: b, reason: collision with root package name */
    public final u3.e f42b = new u3.e();

    /* renamed from: c, reason: collision with root package name */
    public y f43c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f44d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f45e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47g;

    public f0(Runnable runnable) {
        this.f41a = runnable;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            this.f44d = i5 >= 34 ? new c0(new z(this, 0), new z(this, 1), new a0(this, 0), new a0(this, 1)) : new b0(new a0(this, 2), 0);
        }
    }

    public final void a(androidx.lifecycle.t tVar, y yVar) {
        g4.i.e(tVar, "owner");
        g4.i.e(yVar, "onBackPressedCallback");
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        if (((androidx.lifecycle.v) lifecycle).f585c == androidx.lifecycle.n.f558g) {
            return;
        }
        yVar.addCancellable(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, yVar));
        e();
        yVar.setEnabledChangedCallback$activity_release(new e0(0, this, f0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        y yVar;
        y yVar2 = this.f43c;
        if (yVar2 == null) {
            u3.e eVar = this.f42b;
            ListIterator listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    yVar = 0;
                    break;
                } else {
                    yVar = listIterator.previous();
                    if (((y) yVar).isEnabled()) {
                        break;
                    }
                }
            }
            yVar2 = yVar;
        }
        this.f43c = null;
        if (yVar2 != null) {
            yVar2.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        y yVar;
        y yVar2 = this.f43c;
        if (yVar2 == null) {
            u3.e eVar = this.f42b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.f3545i);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    yVar = 0;
                    break;
                } else {
                    yVar = listIterator.previous();
                    if (((y) yVar).isEnabled()) {
                        break;
                    }
                }
            }
            yVar2 = yVar;
        }
        this.f43c = null;
        if (yVar2 != null) {
            yVar2.handleOnBackPressed();
        } else {
            this.f41a.run();
        }
    }

    public final void d(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f45e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f44d) == null) {
            return;
        }
        if (z4 && !this.f46f) {
            k.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f46f = true;
        } else {
            if (z4 || !this.f46f) {
                return;
            }
            k.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f46f = false;
        }
    }

    public final void e() {
        boolean z4 = this.f47g;
        boolean z5 = false;
        u3.e eVar = this.f42b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((y) it.next()).isEnabled()) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f47g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z5);
    }
}
