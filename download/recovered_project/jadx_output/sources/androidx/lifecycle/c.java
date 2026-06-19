package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f528a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f529b;

    public c(int i5, Method method) {
        this.f528a = i5;
        this.f529b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f528a == cVar.f528a && this.f529b.getName().equals(cVar.f529b.getName());
    }

    public final int hashCode() {
        return this.f529b.getName().hashCode() + (this.f528a * 31);
    }
}
