package f0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1374a;

    /* renamed from: b, reason: collision with root package name */
    public int f1375b;

    /* renamed from: c, reason: collision with root package name */
    public int f1376c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1377d;

    public h0() {
        if (t2.i.f3378i == null) {
            t2.i.f3378i = new t2.i(19);
        }
    }

    public int a(int i5) {
        if (i5 < this.f1376c) {
            return ((ByteBuffer) this.f1377d).getShort(this.f1375b + i5);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1375b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1375b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f1374a);
            if (!((Class) this.f1377d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d5 = r0.d(view);
            b bVar = d5 == null ? null : d5 instanceof a ? ((a) d5).f1334a : new b(d5);
            if (bVar == null) {
                bVar = new b();
            }
            r0.i(view, bVar);
            view.setTag(this.f1374a, obj);
            r0.f(view, this.f1376c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
