package r1;

import android.content.Context;
import androidx.emoji2.text.t;
import androidx.work.n;
import f2.q;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3150f = n.g("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final w1.a f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3152b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3153c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3154d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f3155e;

    public d(Context context, w1.a aVar) {
        this.f3152b = context.getApplicationContext();
        this.f3151a = aVar;
    }

    public abstract Object a();

    public final void b(q1.c cVar) {
        synchronized (this.f3153c) {
            try {
                if (this.f3154d.remove(cVar) && this.f3154d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f3153c) {
            try {
                Object obj2 = this.f3155e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f3155e = obj;
                    ((q) ((t) this.f3151a).f285j).execute(new c0.a(this, new ArrayList(this.f3154d), 16, false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
