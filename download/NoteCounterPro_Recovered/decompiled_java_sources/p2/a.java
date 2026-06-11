package p2;

import android.util.SparseArray;
import androidx.emoji2.text.u;
import c2.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f2981a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2982b;

    static {
        HashMap hashMap = new HashMap();
        f2982b = hashMap;
        hashMap.put(c.f788g, 0);
        hashMap.put(c.h, 1);
        hashMap.put(c.f789i, 2);
        for (c cVar : hashMap.keySet()) {
            f2981a.append(((Integer) f2982b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f2982b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i5) {
        c cVar = (c) f2981a.get(i5);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(u.h(i5, "Unknown Priority for value "));
    }
}
