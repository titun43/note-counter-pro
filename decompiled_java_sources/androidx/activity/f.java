package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements f4.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f40g;
    public final /* synthetic */ s h;

    public /* synthetic */ f(s sVar, int i5) {
        this.f40g = i5;
        this.h = sVar;
    }

    @Override // f4.a
    public final Object invoke() {
        switch (this.f40g) {
            case 0:
                this.h.reportFullyDrawn();
                return t3.h.f3400a;
            case 1:
                return s.d(this.h);
            case 2:
                s sVar = this.h;
                return new o0(sVar.getApplication(), sVar, sVar.getIntent() != null ? sVar.getIntent().getExtras() : null);
            default:
                s sVar2 = this.h;
                f0 f0Var = new f0(new e(sVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (g4.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        sVar2.getLifecycle().a(new g(0, f0Var, sVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a2.b(1, sVar2, f0Var));
                    }
                }
                return f0Var;
        }
    }
}
