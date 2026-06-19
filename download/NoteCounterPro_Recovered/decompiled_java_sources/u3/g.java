package u3;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static final void V(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, f4.l lVar) {
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.a(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    public static String X(Collection collection, m4.g gVar, int i5) {
        int i6 = i5 & 2;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str2 = i6 != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "[";
        if ((i5 & 4) == 0) {
            str = "]";
        }
        String str3 = str;
        if ((i5 & 32) != 0) {
            gVar = null;
        }
        StringBuilder sb = new StringBuilder();
        V(collection, sb, ", ", str2, str3, "...", gVar);
        return sb.toString();
    }

    public static Object Y(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static final void Z(Iterable iterable, AbstractCollection abstractCollection) {
        g4.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List a0(Iterable iterable) {
        ArrayList arrayList;
        g4.i.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        o oVar = o.f3547g;
        if (z4) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return oVar;
            }
            if (size != 1) {
                return b0(collection);
            }
            return y4.b.y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z4) {
            arrayList = b0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            Z(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : y4.b.y(arrayList.get(0)) : oVar;
    }

    public static ArrayList b0(Collection collection) {
        g4.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set c0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return q.f3549g;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(r.Q(arrayList.size()));
            Z(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        g4.i.d(singleton, "singleton(...)");
        return singleton;
    }
}
