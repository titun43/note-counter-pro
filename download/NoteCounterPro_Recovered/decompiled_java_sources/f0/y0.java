package f0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class y0 extends d1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f1428e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1429f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f1430g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f1431c;

    /* renamed from: d, reason: collision with root package name */
    public y.c f1432d;

    public y0() {
        this.f1431c = i();
    }

    private static WindowInsets i() {
        if (!f1429f) {
            try {
                f1428e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f1429f = true;
        }
        Field field = f1428e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!h) {
            try {
                f1430g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            h = true;
        }
        Constructor constructor = f1430g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // f0.d1
    public q1 b() {
        a();
        q1 g5 = q1.g(this.f1431c, null);
        y.c[] cVarArr = this.f1352b;
        m1 m1Var = g5.f1406a;
        m1Var.p(cVarArr);
        m1Var.r(this.f1432d);
        return g5;
    }

    @Override // f0.d1
    public void e(y.c cVar) {
        this.f1432d = cVar;
    }

    @Override // f0.d1
    public void g(y.c cVar) {
        WindowInsets windowInsets = this.f1431c;
        if (windowInsets != null) {
            this.f1431c = windowInsets.replaceSystemWindowInsets(cVar.f3729a, cVar.f3730b, cVar.f3731c, cVar.f3732d);
        }
    }

    public y0(q1 q1Var) {
        super(q1Var);
        this.f1431c = q1Var.f();
    }
}
