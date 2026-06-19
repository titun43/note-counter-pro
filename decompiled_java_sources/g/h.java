package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1555b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f1556c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1557d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1558e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1559f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1560g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f1561i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1562j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1563k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1564l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1565m;

    /* renamed from: n, reason: collision with root package name */
    public View f1566n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f1567o;

    /* renamed from: q, reason: collision with root package name */
    public final int f1569q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1570r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1571s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1572t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1573u;

    /* renamed from: v, reason: collision with root package name */
    public final f f1574v;

    /* renamed from: p, reason: collision with root package name */
    public int f1568p = -1;
    public final c w = new c(this, 0);

    public h(Context context, i iVar, Window window) {
        this.f1554a = context;
        this.f1555b = iVar;
        this.f1556c = window;
        f fVar = new f();
        fVar.f1527a = new WeakReference(iVar);
        this.f1574v = fVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1314e, R.attr.alertDialogStyle, 0);
        this.f1569q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f1570r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f1571s = obtainStyledAttributes.getResourceId(7, 0);
        this.f1572t = obtainStyledAttributes.getResourceId(3, 0);
        this.f1573u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        iVar.c().j(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
