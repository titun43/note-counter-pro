package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class v implements d0, z, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public Rect f2000g;

    public static int m(ListAdapter listAdapter, Context context, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i6 = 0;
        int i7 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = listAdapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i8, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i5) {
                return i5;
            }
            if (measuredWidth > i6) {
                i6 = measuredWidth;
            }
        }
        return i6;
    }

    @Override // j.z
    public final boolean c(p pVar) {
        return false;
    }

    @Override // j.z
    public final boolean k(p pVar) {
        return false;
    }

    public abstract void l(n nVar);

    public abstract void n(View view);

    public abstract void o(boolean z4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (k) listAdapter).f1936a.q((MenuItem) listAdapter.getItem(i5), this, !(this instanceof h) ? 0 : 4);
    }

    public abstract void p(int i5);

    public abstract void q(int i5);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z4);

    public abstract void t(int i5);

    @Override // j.z
    public final void i(Context context, n nVar) {
    }
}
