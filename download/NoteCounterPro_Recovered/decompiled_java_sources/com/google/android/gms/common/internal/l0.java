package com.google.android.gms.common.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1085b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1086c;

    public l0(String str, String str2, boolean z4) {
        b0.e(str);
        this.f1084a = str;
        b0.e(str2);
        this.f1085b = str2;
        this.f1086c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return b0.j(this.f1084a, l0Var.f1084a) && b0.j(this.f1085b, l0Var.f1085b) && b0.j(null, null) && this.f1086c == l0Var.f1086c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1084a, this.f1085b, null, 4225, Boolean.valueOf(this.f1086c)});
    }

    public final String toString() {
        String str = this.f1084a;
        if (str != null) {
            return str;
        }
        b0.g(null);
        throw null;
    }
}
