package f1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.x;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1434d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1435e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1438c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1437b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1436a = new HashMap();

    public a(Context context) {
        this.f1438c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1434d == null) {
            synchronized (f1435e) {
                try {
                    if (f1434d == null) {
                        f1434d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1434d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1438c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1437b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new x(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f1436a;
        if (a.a.p()) {
            try {
                a.a.e(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a5 = bVar.a();
                if (!a5.isEmpty()) {
                    for (Class cls2 : a5) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f1438c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new x(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
