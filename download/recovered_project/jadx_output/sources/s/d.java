package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3273a;

    /* renamed from: b, reason: collision with root package name */
    public int f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3275c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3277e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3278f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3279g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3280i;

    /* renamed from: j, reason: collision with root package name */
    public View f3281j;

    /* renamed from: k, reason: collision with root package name */
    public View f3282k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f3283l;

    public d() {
        super(-2, -2);
        this.f3273a = false;
        this.f3274b = 0;
        this.f3275c = 0;
        this.f3276d = -1;
        this.f3277e = -1;
        this.f3278f = 0;
        this.f3279g = 0;
        this.f3283l = new Rect();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3273a = false;
        this.f3274b = 0;
        this.f3275c = 0;
        this.f3276d = -1;
        this.f3277e = -1;
        this.f3278f = 0;
        this.f3279g = 0;
        this.f3283l = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f3142b);
        this.f3274b = obtainStyledAttributes.getInteger(0, 0);
        this.f3277e = obtainStyledAttributes.getResourceId(1, -1);
        this.f3275c = obtainStyledAttributes.getInteger(2, 0);
        this.f3276d = obtainStyledAttributes.getInteger(6, -1);
        this.f3278f = obtainStyledAttributes.getInt(5, 0);
        this.f3279g = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3273a = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f185x;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f185x;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f187z;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f186y);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    if (constructor.newInstance(context, attributeSet) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e4) {
                    throw new RuntimeException(c.a("Could not inflate Behavior subclass ", string), e4);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f3273a = false;
        this.f3274b = 0;
        this.f3275c = 0;
        this.f3276d = -1;
        this.f3277e = -1;
        this.f3278f = 0;
        this.f3279g = 0;
        this.f3283l = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3273a = false;
        this.f3274b = 0;
        this.f3275c = 0;
        this.f3276d = -1;
        this.f3277e = -1;
        this.f3278f = 0;
        this.f3279g = 0;
        this.f3283l = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3273a = false;
        this.f3274b = 0;
        this.f3275c = 0;
        this.f3276d = -1;
        this.f3277e = -1;
        this.f3278f = 0;
        this.f3279g = 0;
        this.f3283l = new Rect();
    }
}
