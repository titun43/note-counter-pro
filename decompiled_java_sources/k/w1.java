package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final float f2261g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2262i;

    /* renamed from: j, reason: collision with root package name */
    public final View f2263j;

    /* renamed from: k, reason: collision with root package name */
    public v1 f2264k;

    /* renamed from: l, reason: collision with root package name */
    public v1 f2265l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2266m;

    /* renamed from: n, reason: collision with root package name */
    public int f2267n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f2268o = new int[2];

    public w1(View view) {
        this.f2263j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2261g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.h = tapTimeout;
        this.f2262i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v1 v1Var = this.f2265l;
        View view = this.f2263j;
        if (v1Var != null) {
            view.removeCallbacks(v1Var);
        }
        v1 v1Var2 = this.f2264k;
        if (v1Var2 != null) {
            view.removeCallbacks(v1Var2);
        }
    }

    public abstract j.d0 b();

    public abstract boolean c();

    public boolean d() {
        j.d0 b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        t1 j2;
        boolean z5 = this.f2266m;
        View view2 = this.f2263j;
        if (z5) {
            j.d0 b2 = b();
            if (b2 != null && b2.a() && (j2 = b2.j()) != null && j2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2268o;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                j2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = j2.b(obtainNoHistory, this.f2267n);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            if (d()) {
                z4 = false;
            }
            z4 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2267n);
                            if (findPointerIndex >= 0) {
                                float x5 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f5 = this.f2261g;
                                float f6 = -f5;
                                if (x5 < f6 || y2 < f6 || x5 >= (view2.getRight() - view2.getLeft()) + f5 || y2 >= (view2.getBottom() - view2.getTop()) + f5) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z4 = true;
                                        if (z4) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f2267n = motionEvent.getPointerId(0);
                    if (this.f2264k == null) {
                        this.f2264k = new v1(this, 0);
                    }
                    view2.postDelayed(this.f2264k, this.h);
                    if (this.f2265l == null) {
                        this.f2265l = new v1(this, 1);
                    }
                    view2.postDelayed(this.f2265l, this.f2262i);
                }
            }
            z4 = false;
            if (z4) {
            }
        }
        this.f2266m = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2266m = false;
        this.f2267n = -1;
        v1 v1Var = this.f2264k;
        if (v1Var != null) {
            this.f2263j.removeCallbacks(v1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
