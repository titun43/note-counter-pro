package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class j implements z, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f1931g;
    public LayoutInflater h;

    /* renamed from: i, reason: collision with root package name */
    public n f1932i;

    /* renamed from: j, reason: collision with root package name */
    public ExpandedMenuView f1933j;

    /* renamed from: k, reason: collision with root package name */
    public y f1934k;

    /* renamed from: l, reason: collision with root package name */
    public i f1935l;

    public j(ContextWrapper contextWrapper) {
        this.f1931g = contextWrapper;
        this.h = LayoutInflater.from(contextWrapper);
    }

    @Override // j.z
    public final void b(n nVar, boolean z4) {
        y yVar = this.f1934k;
        if (yVar != null) {
            yVar.b(nVar, z4);
        }
    }

    @Override // j.z
    public final boolean c(p pVar) {
        return false;
    }

    @Override // j.z
    public final boolean d() {
        return false;
    }

    @Override // j.z
    public final void e(y yVar) {
        throw null;
    }

    @Override // j.z
    public final boolean f(f0 f0Var) {
        boolean hasVisibleItems = f0Var.hasVisibleItems();
        Context context = f0Var.f1943a;
        if (!hasVisibleItems) {
            return false;
        }
        o oVar = new o();
        oVar.f1965g = f0Var;
        c0.j jVar = new c0.j(context);
        g.e eVar = (g.e) jVar.f764b;
        j jVar2 = new j(eVar.f1503a);
        oVar.f1966i = jVar2;
        jVar2.f1934k = oVar;
        f0Var.b(jVar2, context);
        j jVar3 = oVar.f1966i;
        if (jVar3.f1935l == null) {
            jVar3.f1935l = new i(jVar3);
        }
        eVar.f1509g = jVar3.f1935l;
        eVar.h = oVar;
        View view = f0Var.f1956o;
        if (view != null) {
            eVar.f1507e = view;
        } else {
            eVar.f1505c = f0Var.f1955n;
            eVar.f1506d = f0Var.f1954m;
        }
        eVar.f1508f = oVar;
        g.i c5 = jVar.c();
        oVar.h = c5;
        c5.setOnDismissListener(oVar);
        WindowManager.LayoutParams attributes = oVar.h.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oVar.h.show();
        y yVar = this.f1934k;
        if (yVar == null) {
            return true;
        }
        yVar.k(f0Var);
        return true;
    }

    @Override // j.z
    public final void h() {
        i iVar = this.f1935l;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // j.z
    public final void i(Context context, n nVar) {
        if (this.f1931g != null) {
            this.f1931g = context;
            if (this.h == null) {
                this.h = LayoutInflater.from(context);
            }
        }
        this.f1932i = nVar;
        i iVar = this.f1935l;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // j.z
    public final boolean k(p pVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
        this.f1932i.q(this.f1935l.getItem(i5), this, 0);
    }
}
