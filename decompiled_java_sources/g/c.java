package g;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.y2;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1498g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(Object obj, int i5) {
        this.f1498g = i5;
        this.h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1498g) {
            case 0:
                h hVar = (h) this.h;
                hVar.f1574v.obtainMessage(1, hVar.f1555b).sendToTarget();
                break;
            case 1:
                ((i.b) this.h).a();
                break;
            default:
                y2 y2Var = ((Toolbar) this.h).S;
                j.p pVar = y2Var == null ? null : y2Var.h;
                if (pVar != null) {
                    pVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
