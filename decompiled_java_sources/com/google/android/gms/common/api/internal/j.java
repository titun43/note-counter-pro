package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f995b;

    public j(Object obj, String str) {
        this.f994a = obj;
        this.f995b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f994a == jVar.f994a && this.f995b.equals(jVar.f995b);
    }

    public final int hashCode() {
        return this.f995b.hashCode() + (System.identityHashCode(this.f994a) * 31);
    }
}
