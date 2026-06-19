package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i extends androidx.activity.u implements DialogInterface, l {

    /* renamed from: j, reason: collision with root package name */
    public f0 f1578j;

    /* renamed from: k, reason: collision with root package name */
    public final g0 f1579k;

    /* renamed from: l, reason: collision with root package name */
    public final h f1580l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(ContextThemeWrapper contextThemeWrapper, int i5) {
        super(contextThemeWrapper, r2);
        int i6;
        int e4 = e(contextThemeWrapper, i5);
        if (e4 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i6 = typedValue.resourceId;
        } else {
            i6 = e4;
        }
        this.f1579k = new f0.j() { // from class: g.g0
            @Override // f0.j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return i.this.g(keyEvent);
            }
        };
        r c5 = c();
        if (e4 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            e4 = typedValue2.resourceId;
        }
        ((f0) c5).Z = e4;
        c5.e();
        this.f1580l = new h(getContext(), this, getWindow());
    }

    public static int e(Context context, int i5) {
        if (((i5 >>> 24) & 255) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        f0 f0Var = (f0) c();
        f0Var.y();
        ((ViewGroup) f0Var.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        f0Var.f1546s.a(f0Var.f1545r.getCallback());
    }

    public final r c() {
        if (this.f1578j == null) {
            p pVar = r.f1612g;
            this.f1578j = new f0(getContext(), getWindow(), this, this);
        }
        return this.f1578j;
    }

    public final void d(Bundle bundle) {
        c().b();
        super.onCreate(bundle);
        c().e();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.a.i(this.f1579k, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().n(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i5) {
        f0 f0Var = (f0) c();
        f0Var.y();
        return f0Var.f1545r.findViewById(i5);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().c();
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i5;
        ListAdapter listAdapter;
        View findViewById;
        d(bundle);
        h hVar = this.f1580l;
        hVar.f1555b.setContentView(hVar.f1569q);
        Context context = hVar.f1554a;
        Window window = hVar.f1556c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a5 = h.a(findViewById6, findViewById3);
        ViewGroup a6 = h.a(findViewById7, findViewById4);
        ViewGroup a7 = h.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hVar.f1561i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f1561i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a6.findViewById(android.R.id.message);
        hVar.f1565m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            hVar.f1561i.removeView(hVar.f1565m);
            if (hVar.f1558e != null) {
                ViewGroup viewGroup2 = (ViewGroup) hVar.f1561i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(hVar.f1561i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(hVar.f1558e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a6.setVisibility(8);
            }
        }
        Button button = (Button) a7.findViewById(android.R.id.button1);
        hVar.f1559f = button;
        c cVar = hVar.w;
        button.setOnClickListener(cVar);
        if (TextUtils.isEmpty(null)) {
            hVar.f1559f.setVisibility(8);
            i5 = 0;
        } else {
            hVar.f1559f.setText((CharSequence) null);
            hVar.f1559f.setVisibility(0);
            i5 = 1;
        }
        Button button2 = (Button) a7.findViewById(android.R.id.button2);
        hVar.f1560g = button2;
        button2.setOnClickListener(cVar);
        if (TextUtils.isEmpty(null)) {
            hVar.f1560g.setVisibility(8);
        } else {
            hVar.f1560g.setText((CharSequence) null);
            hVar.f1560g.setVisibility(0);
            i5 |= 2;
        }
        Button button3 = (Button) a7.findViewById(android.R.id.button3);
        hVar.h = button3;
        button3.setOnClickListener(cVar);
        if (TextUtils.isEmpty(null)) {
            hVar.h.setVisibility(8);
        } else {
            hVar.h.setText((CharSequence) null);
            hVar.h.setVisibility(0);
            i5 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i5 == 1) {
                Button button4 = hVar.f1559f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i5 == 2) {
                Button button5 = hVar.f1560g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i5 == 4) {
                Button button6 = hVar.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i5 == 0) {
            a7.setVisibility(8);
        }
        if (hVar.f1566n != null) {
            a5.addView(hVar.f1566n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hVar.f1563k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(hVar.f1557d) || !hVar.f1573u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                hVar.f1563k.setVisibility(8);
                a5.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hVar.f1564l = textView2;
                textView2.setText(hVar.f1557d);
                Drawable drawable = hVar.f1562j;
                if (drawable != null) {
                    hVar.f1563k.setImageDrawable(drawable);
                } else {
                    hVar.f1564l.setPadding(hVar.f1563k.getPaddingLeft(), hVar.f1563k.getPaddingTop(), hVar.f1563k.getPaddingRight(), hVar.f1563k.getPaddingBottom());
                    hVar.f1563k.setVisibility(8);
                }
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        int i6 = (a5 == null || a5.getVisibility() == 8) ? 0 : 1;
        boolean z5 = a7.getVisibility() != 8;
        if (!z5 && (findViewById = a6.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f1561i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = hVar.f1558e != null ? a5.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a6.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f1558e;
        if (alertController$RecycleListView != null && (!z5 || i6 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i6 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f72g, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.h);
        }
        if (!z4) {
            View view = hVar.f1558e;
            if (view == null) {
                view = hVar.f1561i;
            }
            if (view != null) {
                int i7 = z5 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = f0.r0.f1407a;
                f0.l0.b(view, i6 | i7, 3);
                if (findViewById11 != null) {
                    a6.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a6.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f1558e;
        if (alertController$RecycleListView2 == null || (listAdapter = hVar.f1567o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i8 = hVar.f1568p;
        if (i8 > -1) {
            alertController$RecycleListView2.setItemChecked(i8, true);
            alertController$RecycleListView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1580l.f1561i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1580l.f1561i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void onStop() {
        super.onStop();
        f0 f0Var = (f0) c();
        f0Var.C();
        a aVar = f0Var.f1548u;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    @Override // g.l
    public final i.b onWindowStartingSupportActionMode(i.a aVar) {
        return null;
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void setContentView(int i5) {
        b();
        c().k(i5);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i5) {
        super.setTitle(i5);
        c().n(getContext().getString(i5));
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().l(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        h hVar = this.f1580l;
        hVar.f1557d = charSequence;
        TextView textView = hVar.f1564l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.u, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().m(view, layoutParams);
    }

    @Override // g.l
    public final void onSupportActionModeFinished(i.b bVar) {
    }

    @Override // g.l
    public final void onSupportActionModeStarted(i.b bVar) {
    }
}
