package c1;

import android.os.Bundle;
import androidx.lifecycle.j;
import g4.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f778b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f779c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f780d;

    /* renamed from: e, reason: collision with root package name */
    public a f781e;

    /* renamed from: a, reason: collision with root package name */
    public final m.f f777a = new m.f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f782f = true;

    public final Bundle a(String str) {
        if (!this.f780d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f779c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f779c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f779c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f779c = null;
        return bundle2;
    }

    public final c b() {
        String str;
        c cVar;
        Iterator it = this.f777a.iterator();
        do {
            m.b bVar = (m.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            i.d(entry, "components");
            str = (String) entry.getKey();
            cVar = (c) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String str, c cVar) {
        Object obj;
        i.e(cVar, "provider");
        m.f fVar = this.f777a;
        m.c a5 = fVar.a(str);
        if (a5 != null) {
            obj = a5.h;
        } else {
            m.c cVar2 = new m.c(str, cVar);
            fVar.f2551j++;
            m.c cVar3 = fVar.h;
            if (cVar3 == null) {
                fVar.f2549g = cVar2;
                fVar.h = cVar2;
            } else {
                cVar3.f2545i = cVar2;
                cVar2.f2546j = cVar3;
                fVar.h = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f782f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f781e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f781e = aVar;
        try {
            j.class.getDeclaredConstructor(null);
            a aVar2 = this.f781e;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f776b).add(j.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
