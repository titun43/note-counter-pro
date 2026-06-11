package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f1929a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1930b;

    public i(j jVar) {
        this.f1930b = jVar;
        a();
    }

    public final void a() {
        n nVar = this.f1930b.f1932i;
        p pVar = nVar.f1963v;
        if (pVar != null) {
            nVar.i();
            ArrayList arrayList = nVar.f1951j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((p) arrayList.get(i5)) == pVar) {
                    this.f1929a = i5;
                    return;
                }
            }
        }
        this.f1929a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i5) {
        j jVar = this.f1930b;
        n nVar = jVar.f1932i;
        nVar.i();
        ArrayList arrayList = nVar.f1951j;
        jVar.getClass();
        int i6 = this.f1929a;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return (p) arrayList.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        j jVar = this.f1930b;
        n nVar = jVar.f1932i;
        nVar.i();
        int size = nVar.f1951j.size();
        jVar.getClass();
        return this.f1929a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1930b.h.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((a0) view).c(getItem(i5));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
