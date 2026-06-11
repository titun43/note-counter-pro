package k;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class c3 implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final j.a f2037g;
    public final /* synthetic */ d3 h;

    public c3(d3 d3Var) {
        this.h = d3Var;
        Context context = d3Var.f2050a.getContext();
        CharSequence charSequence = d3Var.h;
        j.a aVar = new j.a();
        aVar.f1871e = 4096;
        aVar.f1873g = 4096;
        aVar.f1877l = null;
        aVar.f1878m = null;
        aVar.f1879n = false;
        aVar.f1880o = false;
        aVar.f1881p = 16;
        aVar.f1874i = context;
        aVar.f1867a = charSequence;
        this.f2037g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d3 d3Var = this.h;
        Window.Callback callback = d3Var.f2059k;
        if (callback == null || !d3Var.f2060l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2037g);
    }
}
