package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class l0 implements r0, DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public g.i f2156g;
    public m0 h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2157i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f2158j;

    public l0(s0 s0Var) {
        this.f2158j = s0Var;
    }

    @Override // k.r0
    public final boolean a() {
        g.i iVar = this.f2156g;
        if (iVar != null) {
            return iVar.isShowing();
        }
        return false;
    }

    @Override // k.r0
    public final int b() {
        return 0;
    }

    @Override // k.r0
    public final void c(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // k.r0
    public final CharSequence d() {
        return this.f2157i;
    }

    @Override // k.r0
    public final void dismiss() {
        g.i iVar = this.f2156g;
        if (iVar != null) {
            iVar.dismiss();
            this.f2156g = null;
        }
    }

    @Override // k.r0
    public final Drawable f() {
        return null;
    }

    @Override // k.r0
    public final void h(CharSequence charSequence) {
        this.f2157i = charSequence;
    }

    @Override // k.r0
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // k.r0
    public final void l(int i5) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // k.r0
    public final void m(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // k.r0
    public final void n(int i5, int i6) {
        if (this.h == null) {
            return;
        }
        s0 s0Var = this.f2158j;
        c0.j jVar = new c0.j(s0Var.getPopupContext());
        g.e eVar = (g.e) jVar.f764b;
        CharSequence charSequence = this.f2157i;
        if (charSequence != null) {
            eVar.f1506d = charSequence;
        }
        m0 m0Var = this.h;
        int selectedItemPosition = s0Var.getSelectedItemPosition();
        eVar.f1509g = m0Var;
        eVar.h = this;
        eVar.f1511j = selectedItemPosition;
        eVar.f1510i = true;
        g.i c5 = jVar.c();
        this.f2156g = c5;
        AlertController$RecycleListView alertController$RecycleListView = c5.f1580l.f1558e;
        alertController$RecycleListView.setTextDirection(i5);
        alertController$RecycleListView.setTextAlignment(i6);
        this.f2156g.show();
    }

    @Override // k.r0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        s0 s0Var = this.f2158j;
        s0Var.setSelection(i5);
        if (s0Var.getOnItemClickListener() != null) {
            s0Var.performItemClick(null, i5, this.h.getItemId(i5));
        }
        dismiss();
    }

    @Override // k.r0
    public final void p(ListAdapter listAdapter) {
        this.h = (m0) listAdapter;
    }
}
