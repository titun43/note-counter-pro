package u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class r extends z2.b {
    public static int Q(int i5) {
        return i5 < 0 ? i5 : i5 < 3 ? i5 + 1 : i5 < 1073741824 ? (int) ((i5 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map R(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.f3548g;
        }
        if (size == 1) {
            t3.c cVar = (t3.c) arrayList.get(0);
            g4.i.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f3394g, cVar.h);
            g4.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q(arrayList.size()));
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList.get(i5);
            i5++;
            t3.c cVar2 = (t3.c) obj;
            linkedHashMap.put(cVar2.f3394g, cVar2.h);
        }
        return linkedHashMap;
    }
}
