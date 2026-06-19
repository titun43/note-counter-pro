package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class t1 extends ListView {

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2227g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2228i;

    /* renamed from: j, reason: collision with root package name */
    public int f2229j;

    /* renamed from: k, reason: collision with root package name */
    public int f2230k;

    /* renamed from: l, reason: collision with root package name */
    public int f2231l;

    /* renamed from: m, reason: collision with root package name */
    public r1 f2232m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2233n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2234o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2235p;

    /* renamed from: q, reason: collision with root package name */
    public i0.d f2236q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.o f2237r;

    public t1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2227g = new Rect();
        this.h = 0;
        this.f2228i = 0;
        this.f2229j = 0;
        this.f2230k = 0;
        this.f2234o = z4;
        setCacheColorHint(0);
    }

    public final int a(int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i5, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i6) {
                return i6;
            }
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i5) {
        boolean z4;
        boolean z5;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 1) {
            z4 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z4 = true;
                    if (z4 || z6) {
                        this.f2235p = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f2231l - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z4) {
                        i0.d dVar = this.f2236q;
                        if (dVar != null) {
                            if (dVar.f1814v) {
                                dVar.d();
                            }
                            dVar.f1814v = false;
                        }
                    } else {
                        if (this.f2236q == null) {
                            this.f2236q = new i0.d(this);
                        }
                        i0.d dVar2 = this.f2236q;
                        boolean z7 = dVar2.f1814v;
                        dVar2.f1814v = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z4;
                }
                z4 = false;
                if (z4) {
                }
                this.f2235p = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2231l - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z4) {
                }
                return z4;
            }
            z4 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i5);
        if (findPointerIndex >= 0) {
            int x5 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x5, y2);
            if (pointToPosition == -1) {
                z6 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f5 = x5;
                float f6 = y2;
                this.f2235p = true;
                int i6 = Build.VERSION.SDK_INT;
                o1.a(this, f5, f6);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i7 = this.f2231l;
                if (i7 != -1 && (childAt = getChildAt(i7 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2231l = pointToPosition;
                o1.a(childAt3, f5 - childAt3.getLeft(), f6 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z8 = (selector == null || pointToPosition == -1) ? false : true;
                if (z8) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2227g;
                rect.set(left, top, right, bottom);
                rect.left -= this.h;
                rect.top -= this.f2228i;
                rect.right += this.f2229j;
                rect.bottom += this.f2230k;
                if (i6 >= 33) {
                    z5 = q1.a(this);
                } else {
                    Field field = s1.f2216a;
                    if (field != null) {
                        try {
                            z5 = field.getBoolean(this);
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                        }
                    }
                    z5 = false;
                }
                if (childAt3.isEnabled() != z5) {
                    boolean z9 = !z5;
                    if (Build.VERSION.SDK_INT >= 33) {
                        q1.b(this, z9);
                    } else {
                        Field field2 = s1.f2216a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z9));
                            } catch (IllegalAccessException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z8) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f5, f6);
                }
                r1 r1Var = this.f2232m;
                if (r1Var != null) {
                    r1Var.h = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z4 = true;
                z6 = false;
            }
            if (z4) {
            }
            this.f2235p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2231l - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z4) {
            }
            return z4;
        }
        z4 = false;
        if (z4) {
        }
        this.f2235p = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2231l - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z4) {
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2227g;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2237r != null) {
            return;
        }
        super.drawableStateChanged();
        r1 r1Var = this.f2232m;
        if (r1Var != null) {
            r1Var.h = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2235p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2234o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2234o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2234o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2234o && this.f2233n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2237r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2237r == null) {
            androidx.fragment.app.o oVar = new androidx.fragment.app.o(this, 13);
            this.f2237r = oVar;
            post(oVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i5 < 30 || !p1.f2187d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        p1.f2184a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        p1.f2185b.invoke(this, Integer.valueOf(pointToPosition));
                        p1.f2186c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2235p && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2231l = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.o oVar = this.f2237r;
        if (oVar != null) {
            t1 t1Var = (t1) oVar.h;
            t1Var.f2237r = null;
            t1Var.removeCallbacks(oVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f2233n = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        r1 r1Var = null;
        if (drawable != null) {
            r1 r1Var2 = new r1();
            Drawable drawable2 = r1Var2.f2204g;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            r1Var2.f2204g = drawable;
            drawable.setCallback(r1Var2);
            r1Var2.h = true;
            r1Var = r1Var2;
        }
        this.f2232m = r1Var;
        super.setSelector(r1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.h = rect.left;
        this.f2228i = rect.top;
        this.f2229j = rect.right;
        this.f2230k = rect.bottom;
    }
}
