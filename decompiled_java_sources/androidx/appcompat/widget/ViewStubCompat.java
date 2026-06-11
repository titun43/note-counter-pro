package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.a;
import java.lang.ref.WeakReference;
import k.j3;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: g, reason: collision with root package name */
    public int f181g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f182i;

    /* renamed from: j, reason: collision with root package name */
    public LayoutInflater f183j;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f181g = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1333z, 0, 0);
        this.h = obtainStyledAttributes.getResourceId(2, -1);
        this.f181g = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f181g == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f183j;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f181g, viewGroup, false);
        int i5 = this.h;
        if (i5 != -1) {
            inflate.setId(i5);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f182i = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.h;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f183j;
    }

    public int getLayoutResource() {
        return this.f181g;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i5) {
        this.h = i5;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f183j = layoutInflater;
    }

    public void setLayoutResource(int i5) {
        this.f181g = i5;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        WeakReference weakReference = this.f182i;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i5);
            return;
        }
        super.setVisibility(i5);
        if (i5 == 0 || i5 == 4) {
            a();
        }
    }

    public void setOnInflateListener(j3 j3Var) {
    }
}
