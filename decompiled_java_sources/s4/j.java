package s4;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import f4.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.o;
import o4.w;

/* loaded from: classes.dex */
public final class j extends y3.c implements r4.c {

    /* renamed from: g, reason: collision with root package name */
    public final r4.c f3315g;
    public final w3.h h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3316i;

    /* renamed from: j, reason: collision with root package name */
    public w3.h f3317j;

    /* renamed from: k, reason: collision with root package name */
    public w3.c f3318k;

    public j(r4.c cVar, w3.h hVar) {
        super(g.f3312g, w3.i.f3631g);
        this.f3315g = cVar;
        this.h = hVar;
        this.f3316i = ((Number) hVar.j(0, new o(3))).intValue();
    }

    @Override // r4.c
    public final Object b(Object obj, w3.c cVar) {
        try {
            Object c5 = c(cVar, obj);
            return c5 == x3.a.f3712g ? c5 : t3.h.f3400a;
        } catch (Throwable th) {
            this.f3317j = new e(th, cVar.getContext());
            throw th;
        }
    }

    public final Object c(w3.c cVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        w3.h context = cVar.getContext();
        w.c(context);
        w3.h hVar = this.f3317j;
        if (hVar != context) {
            int i5 = 0;
            if (hVar instanceof e) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((e) hVar).h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                g4.i.e(str2, "<this>");
                n4.b bVar = new n4.b(str2);
                if (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (bVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = y4.b.y(next);
                    }
                } else {
                    list = u3.o.f3547g;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!n4.i.X((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(u3.i.T(arrayList2));
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = arrayList2.get(i6);
                    i6++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i7);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 == -1) {
                        i7 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i7));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i8 = i5 + 1;
                    if (i5 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i5 == 0 || i5 == size2) && n4.i.X(str4)) {
                        str = null;
                    } else {
                        g4.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(u.i(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        g4.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i5 = i8;
                }
                StringBuilder sb = new StringBuilder(length2);
                u3.g.V(arrayList4, sb, "\n", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.j(0, new d4.m(this, 1))).intValue() != this.f3316i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.h + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3317j = context;
        }
        this.f3318k = cVar;
        q qVar = l.f3320a;
        r4.c cVar2 = this.f3315g;
        g4.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = qVar.invoke(cVar2, obj, this);
        if (!g4.i.a(invoke, x3.a.f3712g)) {
            this.f3318k = null;
        }
        return invoke;
    }

    @Override // y3.a, y3.d
    public final y3.d getCallerFrame() {
        w3.c cVar = this.f3318k;
        if (cVar instanceof y3.d) {
            return (y3.d) cVar;
        }
        return null;
    }

    @Override // y3.c, w3.c
    public final w3.h getContext() {
        w3.h hVar = this.f3317j;
        return hVar == null ? w3.i.f3631g : hVar;
    }

    @Override // y3.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        Throwable a5 = t3.e.a(obj);
        if (a5 != null) {
            this.f3317j = new e(a5, getContext());
        }
        w3.c cVar = this.f3318k;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return x3.a.f3712g;
    }
}
