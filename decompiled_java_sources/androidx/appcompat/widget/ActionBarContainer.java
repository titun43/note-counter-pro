package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.lokhnathtechnical.notecounterpro.R;
import f.a;
import k.b;
import k.q2;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public boolean f99g;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public View f100i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f101j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f102k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f103l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f104m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f105n;

    /* renamed from: o, reason: collision with root package name */
    public final int f106o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1310a);
        boolean z4 = false;
        this.f101j = obtainStyledAttributes.getDrawable(0);
        this.f102k = obtainStyledAttributes.getDrawable(2);
        this.f106o = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f104m = true;
            this.f103l = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f104m ? !(this.f101j != null || this.f102k != null) : this.f103l == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f101j;
        if (drawable != null && drawable.isStateful()) {
            this.f101j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f102k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f102k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f103l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f101j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f102k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.action_bar);
        this.f100i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f99g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        boolean z5 = true;
        if (this.f104m) {
            Drawable drawable = this.f103l;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f101j == null) {
                z5 = false;
            } else if (this.h.getVisibility() == 0) {
                this.f101j.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            } else {
                View view = this.f100i;
                if (view == null || view.getVisibility() != 0) {
                    this.f101j.setBounds(0, 0, 0, 0);
                } else {
                    this.f101j.setBounds(this.f100i.getLeft(), this.f100i.getTop(), this.f100i.getRight(), this.f100i.getBottom());
                }
            }
            this.f105n = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        if (this.h == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i7 = this.f106o) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i6)), Integer.MIN_VALUE);
        }
        super.onMeasure(i5, i6);
        if (this.h == null) {
            return;
        }
        View.MeasureSpec.getMode(i6);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f101j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f101j);
        }
        this.f101j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.h;
            if (view != null) {
                this.f101j.setBounds(view.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f104m ? !(this.f101j != null || this.f102k != null) : this.f103l == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f103l);
        }
        this.f103l = drawable;
        boolean z4 = this.f104m;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f103l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f101j != null || this.f102k != null) : this.f103l == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f102k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f102k);
        }
        this.f102k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f105n && this.f102k != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f104m ? !(this.f101j != null || this.f102k != null) : this.f103l == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.f99g = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z4 = i5 == 0;
        Drawable drawable = this.f101j;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f102k;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f101j;
        boolean z4 = this.f104m;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.f102k && this.f105n) {
            return true;
        }
        return (drawable == this.f103l && z4) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }

    public void setTabContainer(q2 q2Var) {
    }
}
