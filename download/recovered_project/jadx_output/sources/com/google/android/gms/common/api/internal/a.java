package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f936a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f937b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f938c;

    /* renamed from: d, reason: collision with root package name */
    public final String f939d;

    public a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f937b = iVar;
        this.f938c = eVar;
        this.f939d = str;
        this.f936a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.b0.j(this.f937b, aVar.f937b) && com.google.android.gms.common.internal.b0.j(this.f938c, aVar.f938c) && com.google.android.gms.common.internal.b0.j(this.f939d, aVar.f939d);
    }

    public final int hashCode() {
        return this.f936a;
    }
}
