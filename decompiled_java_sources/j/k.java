package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final n f1936a;

    /* renamed from: b, reason: collision with root package name */
    public int f1937b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1938c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1939d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f1940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1941f;

    public k(n nVar, LayoutInflater layoutInflater, boolean z4, int i5) {
        this.f1939d = z4;
        this.f1940e = layoutInflater;
        this.f1936a = nVar;
        this.f1941f = i5;
        a();
    }

    public final void a() {
        n nVar = this.f1936a;
        p pVar = nVar.f1963v;
        if (pVar != null) {
            nVar.i();
            ArrayList arrayList = nVar.f1951j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((p) arrayList.get(i5)) == pVar) {
                    this.f1937b = i5;
                    return;
                }
            }
        }
        this.f1937b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i5) {
        ArrayList l5;
        boolean z4 = this.f1939d;
        n nVar = this.f1936a;
        if (z4) {
            nVar.i();
            l5 = nVar.f1951j;
        } else {
            l5 = nVar.l();
        }
        int i6 = this.f1937b;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return (p) l5.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l5;
        boolean z4 = this.f1939d;
        n nVar = this.f1936a;
        if (z4) {
            nVar.i();
            l5 = nVar.f1951j;
        } else {
            l5 = nVar.l();
        }
        return this.f1937b < 0 ? l5.size() : l5.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f1940e.inflate(this.f1941f, viewGroup, false);
        }
        int i6 = getItem(i5).f1968b;
        int i7 = i5 - 1;
        int i8 = i7 >= 0 ? getItem(i7).f1968b : i6;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1936a.m() && i6 != i8) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        a0 a0Var = (a0) view;
        if (this.f1938c) {
            listMenuItemView.setForceShowIcon(true);
        }
        a0Var.c(getItem(i5));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
