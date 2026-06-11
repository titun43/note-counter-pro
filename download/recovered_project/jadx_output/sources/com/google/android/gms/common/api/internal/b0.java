package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f956a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.d f957b;

    public /* synthetic */ b0(a aVar, t2.d dVar) {
        this.f956a = aVar;
        this.f957b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b0)) {
            b0 b0Var = (b0) obj;
            if (com.google.android.gms.common.internal.b0.j(this.f956a, b0Var.f956a) && com.google.android.gms.common.internal.b0.j(this.f957b, b0Var.f957b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f956a, this.f957b});
    }

    public final String toString() {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this);
        pVar.h(this.f956a, "key");
        pVar.h(this.f957b, "feature");
        return pVar.toString();
    }
}
