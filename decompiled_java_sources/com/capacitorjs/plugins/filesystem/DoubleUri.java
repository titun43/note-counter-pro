package com.capacitorjs.plugins.filesystem;

import g4.i;
import r3.g0;

/* loaded from: classes.dex */
public final class DoubleUri {
    private final g0 fromUri;
    private final g0 toUri;

    public DoubleUri(g0 g0Var, g0 g0Var2) {
        i.e(g0Var, "fromUri");
        i.e(g0Var2, "toUri");
        this.fromUri = g0Var;
        this.toUri = g0Var2;
    }

    public static /* synthetic */ DoubleUri copy$default(DoubleUri doubleUri, g0 g0Var, g0 g0Var2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            g0Var = doubleUri.fromUri;
        }
        if ((i5 & 2) != 0) {
            g0Var2 = doubleUri.toUri;
        }
        return doubleUri.copy(g0Var, g0Var2);
    }

    public final g0 component1() {
        return this.fromUri;
    }

    public final g0 component2() {
        return this.toUri;
    }

    public final DoubleUri copy(g0 g0Var, g0 g0Var2) {
        i.e(g0Var, "fromUri");
        i.e(g0Var2, "toUri");
        return new DoubleUri(g0Var, g0Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleUri)) {
            return false;
        }
        DoubleUri doubleUri = (DoubleUri) obj;
        return i.a(this.fromUri, doubleUri.fromUri) && i.a(this.toUri, doubleUri.toUri);
    }

    public final g0 getFromUri() {
        return this.fromUri;
    }

    public final g0 getToUri() {
        return this.toUri;
    }

    public int hashCode() {
        return this.toUri.hashCode() + (this.fromUri.hashCode() * 31);
    }

    public String toString() {
        return "DoubleUri(fromUri=" + this.fromUri + ", toUri=" + this.toUri + ")";
    }
}
