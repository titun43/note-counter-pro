package k;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class z1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2 f2307g;

    public z1(g2 g2Var) {
        this.f2307g = g2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j2) {
        t1 t1Var;
        if (i5 == -1 || (t1Var = this.f2307g.f2072i) == null) {
            return;
        }
        t1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
