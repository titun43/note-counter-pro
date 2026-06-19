package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f526a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f527b;

    public b(HashMap hashMap) {
        this.f527b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            m mVar = (m) entry.getValue();
            List list = (List) this.f526a.get(mVar);
            if (list == null) {
                list = new ArrayList();
                this.f526a.put(mVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, t tVar, m mVar, s sVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f529b;
                try {
                    int i5 = cVar.f528a;
                    if (i5 == 0) {
                        method.invoke(sVar, null);
                    } else if (i5 == 1) {
                        method.invoke(sVar, tVar);
                    } else if (i5 == 2) {
                        method.invoke(sVar, tVar, mVar);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to call observer method", e5.getCause());
                }
            }
        }
    }
}
