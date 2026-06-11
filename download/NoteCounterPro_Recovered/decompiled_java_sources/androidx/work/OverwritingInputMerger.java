package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // androidx.work.i
    public final g a(ArrayList arrayList) {
        f fVar = new f();
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            hashMap.putAll(Collections.unmodifiableMap(((g) obj).f636a));
        }
        fVar.a(hashMap);
        g gVar = new g(fVar.f633a);
        g.c(gVar);
        return gVar;
    }
}
