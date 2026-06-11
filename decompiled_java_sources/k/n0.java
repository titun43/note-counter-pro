package k;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class n0 implements AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0 f2170g;

    public n0(p0 p0Var) {
        this.f2170g = p0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
        p0 p0Var = this.f2170g;
        s0 s0Var = p0Var.L;
        s0Var.setSelection(i5);
        if (s0Var.getOnItemClickListener() != null) {
            s0Var.performItemClick(view, i5, p0Var.I.getItemId(i5));
        }
        p0Var.dismiss();
    }
}
