package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.w;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.getcapacitor.PluginMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1169a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1170b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1171c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1172d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1173e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1174f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1175g = new Bundle();

    public final boolean a(int i5, int i6, Intent intent) {
        String str = (String) this.f1169a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f1173e.get(str);
        if ((eVar != null ? eVar.f1161a : null) != null) {
            ArrayList arrayList = this.f1172d;
            if (arrayList.contains(str)) {
                eVar.f1161a.c(eVar.f1162b.c(intent, i6));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1174f.remove(str);
        this.f1175g.putParcelable(str, new a(intent, i6));
        return true;
    }

    public abstract void b(int i5, e.a aVar, Object obj);

    public final g c(final String str, t tVar, final e.a aVar, final b bVar) {
        g4.i.e(str, "key");
        g4.i.e(tVar, "lifecycleOwner");
        g4.i.e(aVar, "contract");
        g4.i.e(bVar, PluginMethod.RETURN_CALLBACK);
        o lifecycle = tVar.getLifecycle();
        v vVar = (v) lifecycle;
        if (vVar.f585c.compareTo(n.f560j) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + tVar + " is attempting to register while current state is " + vVar.f585c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f1171c;
        f fVar = (f) linkedHashMap.get(str);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        r rVar = new r() { // from class: d.d
            @Override // androidx.lifecycle.r
            public final void a(t tVar2, m mVar) {
                h hVar = h.this;
                LinkedHashMap linkedHashMap2 = hVar.f1173e;
                m mVar2 = m.ON_START;
                String str2 = str;
                if (mVar2 != mVar) {
                    if (m.ON_STOP == mVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (m.ON_DESTROY == mVar) {
                            hVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = hVar.f1175g;
                LinkedHashMap linkedHashMap3 = hVar.f1174f;
                e.a aVar2 = aVar;
                b bVar2 = bVar;
                linkedHashMap2.put(str2, new e(aVar2, bVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.c(obj);
                }
                a aVar3 = (a) y4.b.v(bundle, str2);
                if (aVar3 != null) {
                    bundle.remove(str2);
                    bVar2.c(aVar2.c(aVar3.h, aVar3.f1157g));
                }
            }
        };
        fVar.f1163a.a(rVar);
        fVar.f1164b.add(rVar);
        linkedHashMap.put(str, fVar);
        return new g(this, str, aVar, 0);
    }

    public final g d(String str, e.a aVar, b bVar) {
        g4.i.e(str, "key");
        e(str);
        this.f1173e.put(str, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f1174f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.c(obj);
        }
        Bundle bundle = this.f1175g;
        a aVar2 = (a) y4.b.v(bundle, str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.c(aVar.c(aVar2.h, aVar2.f1157g));
        }
        return new g(this, str, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f1170b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        w wVar = new w(2);
        Iterator it = new m4.a(new m4.c(wVar, new m4.g(wVar, 0))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f1169a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        g4.i.e(str, "key");
        if (!this.f1172d.contains(str) && (num = (Integer) this.f1170b.remove(str)) != null) {
            this.f1169a.remove(num);
        }
        this.f1173e.remove(str);
        LinkedHashMap linkedHashMap = this.f1174f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1175g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) y4.b.v(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1171c;
        f fVar = (f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f1164b;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                fVar.f1163a.b((r) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
