package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class k2 extends t1 {

    /* renamed from: s, reason: collision with root package name */
    public final int f2134s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2135t;

    /* renamed from: u, reason: collision with root package name */
    public h2 f2136u;

    /* renamed from: v, reason: collision with root package name */
    public j.p f2137v;

    public k2(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2134s = 21;
            this.f2135t = 22;
        } else {
            this.f2134s = 22;
            this.f2135t = 21;
        }
    }

    @Override // k.t1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.k kVar;
        int i5;
        int pointToPosition;
        int i6;
        if (this.f2136u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i5 = headerViewListAdapter.getHeadersCount();
                kVar = (j.k) headerViewListAdapter.getWrappedAdapter();
            } else {
                kVar = (j.k) adapter;
                i5 = 0;
            }
            j.p item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = pointToPosition - i5) < 0 || i6 >= kVar.getCount()) ? null : kVar.getItem(i6);
            j.p pVar = this.f2137v;
            if (pVar != item) {
                j.n nVar = kVar.f1936a;
                if (pVar != null) {
                    this.f2136u.i(nVar, pVar);
                }
                this.f2137v = item;
                if (item != null) {
                    this.f2136u.e(nVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i5 == this.f2134s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i5 != this.f2135t) {
            return super.onKeyDown(i5, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.k) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.k) adapter).f1936a.c(false);
        return true;
    }

    public void setHoverListener(h2 h2Var) {
        this.f2136u = h2Var;
    }

    @Override // k.t1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
