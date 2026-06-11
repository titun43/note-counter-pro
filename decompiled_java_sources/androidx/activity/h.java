package androidx.activity;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f50g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h(Object obj, int i5) {
        this.f50g = i5;
        this.h = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        Window window;
        View peekDecorView;
        switch (this.f50g) {
            case 0:
                s sVar = (s) this.h;
                if (mVar == androidx.lifecycle.m.ON_STOP && (window = sVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                s.c((s) this.h, tVar, mVar);
                break;
            default:
                c1.d dVar = (c1.d) this.h;
                g4.i.e(dVar, "this$0");
                if (mVar != androidx.lifecycle.m.ON_START) {
                    if (mVar == androidx.lifecycle.m.ON_STOP) {
                        dVar.f782f = false;
                        break;
                    }
                } else {
                    dVar.f782f = true;
                    break;
                }
                break;
        }
    }
}
