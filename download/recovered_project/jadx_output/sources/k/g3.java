package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public static g3 f2089q;

    /* renamed from: r, reason: collision with root package name */
    public static g3 f2090r;

    /* renamed from: g, reason: collision with root package name */
    public final View f2091g;
    public final CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2092i;

    /* renamed from: j, reason: collision with root package name */
    public final f3 f2093j;

    /* renamed from: k, reason: collision with root package name */
    public final f3 f2094k;

    /* renamed from: l, reason: collision with root package name */
    public int f2095l;

    /* renamed from: m, reason: collision with root package name */
    public int f2096m;

    /* renamed from: n, reason: collision with root package name */
    public h3 f2097n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2098o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2099p;

    /* JADX WARN: Type inference failed for: r0v0, types: [k.f3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k.f3] */
    public g3(View view, CharSequence charSequence) {
        final int i5 = 0;
        this.f2093j = new Runnable(this) { // from class: k.f3
            public final /* synthetic */ g3 h;

            {
                this.h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.h.c(false);
                        break;
                    default:
                        this.h.a();
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f2094k = new Runnable(this) { // from class: k.f3
            public final /* synthetic */ g3 h;

            {
                this.h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.h.c(false);
                        break;
                    default:
                        this.h.a();
                        break;
                }
            }
        };
        this.f2091g = view;
        this.h = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i7 = f0.s0.f1417a;
        this.f2092i = Build.VERSION.SDK_INT >= 28 ? b0.e.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2099p = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(g3 g3Var) {
        g3 g3Var2 = f2089q;
        if (g3Var2 != null) {
            g3Var2.f2091g.removeCallbacks(g3Var2.f2093j);
        }
        f2089q = g3Var;
        if (g3Var != null) {
            g3Var.f2091g.postDelayed(g3Var.f2093j, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        g3 g3Var = f2090r;
        View view = this.f2091g;
        if (g3Var == this) {
            f2090r = null;
            h3 h3Var = this.f2097n;
            if (h3Var != null) {
                View view2 = (View) h3Var.h;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) h3Var.f2103g).getSystemService("window")).removeView(view2);
                }
                this.f2097n = null;
                this.f2099p = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2089q == this) {
            b(null);
        }
        view.removeCallbacks(this.f2094k);
    }

    public final void c(boolean z4) {
        int height;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        long longPressTimeout;
        long j2;
        long j5;
        View view = this.f2091g;
        if (view.isAttachedToWindow()) {
            b(null);
            g3 g3Var = f2090r;
            if (g3Var != null) {
                g3Var.a();
            }
            f2090r = this;
            this.f2098o = z4;
            Context context = view.getContext();
            h3 h3Var = new h3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            h3Var.f2105j = layoutParams;
            h3Var.f2106k = new Rect();
            h3Var.f2107l = new int[2];
            h3Var.f2108m = new int[2];
            h3Var.f2103g = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            h3Var.h = inflate;
            h3Var.f2104i = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(h3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) h3Var.h;
            Context context2 = (Context) h3Var.f2103g;
            this.f2097n = h3Var;
            int i9 = this.f2095l;
            int i10 = this.f2096m;
            boolean z6 = this.f2098o;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) h3Var.f2105j;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) h3Var.f2104i).setText(this.h);
            int[] iArr = (int[]) h3Var.f2108m;
            int[] iArr2 = (int[]) h3Var.f2107l;
            Rect rect = (Rect) h3Var.f2106k;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i5 = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i5 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z6 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i11 = i9;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i8 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i6 = i5;
                    z5 = z6;
                    i7 = 0;
                    i8 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i8 = 1;
                    i6 = i5;
                    z5 = z6;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i7 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i7] - iArr[i7];
                iArr2[i7] = i12;
                iArr2[i8] = iArr2[i8] - iArr[i8];
                layoutParams2.x = (i12 + i11) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, i7);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i8];
                int i14 = ((i13 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z5) {
                    if (i14 >= 0) {
                        layoutParams2.y = i14;
                    } else {
                        layoutParams2.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i14;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f2098o) {
                j5 = 2500;
            } else {
                WeakHashMap weakHashMap = f0.r0.f1407a;
                if ((view.getWindowSystemUiVisibility() & 1) == i8) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j5 = j2 - longPressTimeout;
            }
            f3 f3Var = this.f2094k;
            view.removeCallbacks(f3Var);
            view.postDelayed(f3Var, j5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2096m) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2097n == null || !this.f2098o) {
            View view2 = this.f2091g;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f2099p = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f2097n == null) {
                    int x5 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (!this.f2099p) {
                        int abs = Math.abs(x5 - this.f2095l);
                        int i5 = this.f2092i;
                        if (abs <= i5) {
                        }
                    }
                    this.f2095l = x5;
                    this.f2096m = y2;
                    this.f2099p = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2095l = view.getWidth() / 2;
        this.f2096m = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
