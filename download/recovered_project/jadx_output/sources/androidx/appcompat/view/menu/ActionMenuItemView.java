package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.a;
import j.a0;
import j.b;
import j.c;
import j.n;
import j.p;
import k.d1;
import k.m;

/* loaded from: classes.dex */
public class ActionMenuItemView extends d1 implements a0, View.OnClickListener, m {

    /* renamed from: n, reason: collision with root package name */
    public p f73n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f74o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f75p;

    /* renamed from: q, reason: collision with root package name */
    public j.m f76q;

    /* renamed from: r, reason: collision with root package name */
    public b f77r;

    /* renamed from: s, reason: collision with root package name */
    public c f78s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f79t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f80u;

    /* renamed from: v, reason: collision with root package name */
    public final int f81v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f82x;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f79t = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1312c, 0, 0);
        this.f81v = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f82x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.w = -1;
        setSaveEnabled(false);
    }

    @Override // k.m
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.m
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f73n.getIcon() == null;
    }

    @Override // j.a0
    public final void c(p pVar) {
        this.f73n = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.getTitleCondensed());
        setId(pVar.f1967a);
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f77r == null) {
            this.f77r = new b(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (i5 < 480) {
            return (i5 >= 640 && i6 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.a0
    public p getItemData() {
        return this.f73n;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f74o);
        if (this.f75p != null && ((this.f73n.f1989y & 4) != 4 || (!this.f79t && !this.f80u))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f74o : null);
        CharSequence charSequence = this.f73n.f1982q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f73n.f1971e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f73n.f1983r;
        if (TextUtils.isEmpty(charSequence2)) {
            z2.b.z(this, z6 ? null : this.f73n.f1971e);
        } else {
            z2.b.z(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.m mVar = this.f76q;
        if (mVar != null) {
            mVar.a(this.f73n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f79t = g();
        h();
    }

    @Override // k.d1, android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i7 = this.w) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int i8 = this.f81v;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i8) : i8;
        if (mode != 1073741824 && i8 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i6);
        }
        if (!isEmpty || this.f75p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f75p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f73n.hasSubMenu() && (bVar = this.f77r) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f80u != z4) {
            this.f80u = z4;
            p pVar = this.f73n;
            if (pVar != null) {
                n nVar = pVar.f1979n;
                nVar.f1952k = true;
                nVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f75p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i5 = this.f82x;
            if (intrinsicWidth > i5) {
                intrinsicHeight = (int) (intrinsicHeight * (i5 / intrinsicWidth));
                intrinsicWidth = i5;
            }
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (intrinsicWidth * (i5 / intrinsicHeight));
            } else {
                i5 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i5);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(j.m mVar) {
        this.f76q = mVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i5, int i6, int i7, int i8) {
        this.w = i5;
        super.setPadding(i5, i6, i7, i8);
    }

    public void setPopupCallback(c cVar) {
        this.f78s = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f74o = charSequence;
        h();
    }
}
