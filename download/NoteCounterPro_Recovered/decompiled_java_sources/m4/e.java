package m4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u3.o;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static List Q(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return o.f3547g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return y4.b.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
