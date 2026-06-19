package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f592a = new LinkedHashMap();

    public final void a() {
        for (r0 r0Var : this.f592a.values()) {
            r0Var.f576c = true;
            HashMap hashMap = r0Var.f574a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = r0Var.f574a.values().iterator();
                        while (it.hasNext()) {
                            r0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = r0Var.f575b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = r0Var.f575b.iterator();
                        while (it2.hasNext()) {
                            r0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            r0Var.b();
        }
        this.f592a.clear();
    }
}
