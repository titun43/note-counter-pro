package com.capacitorjs.plugins.filesystem;

import g4.i;
import r3.g0;

/* loaded from: classes.dex */
public final class SingleUriWithRecursiveOptions {
    private final boolean recursive;
    private final g0 uri;

    public SingleUriWithRecursiveOptions(g0 g0Var, boolean z4) {
        i.e(g0Var, "uri");
        this.uri = g0Var;
        this.recursive = z4;
    }

    public static /* synthetic */ SingleUriWithRecursiveOptions copy$default(SingleUriWithRecursiveOptions singleUriWithRecursiveOptions, g0 g0Var, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            g0Var = singleUriWithRecursiveOptions.uri;
        }
        if ((i5 & 2) != 0) {
            z4 = singleUriWithRecursiveOptions.recursive;
        }
        return singleUriWithRecursiveOptions.copy(g0Var, z4);
    }

    public final g0 component1() {
        return this.uri;
    }

    public final boolean component2() {
        return this.recursive;
    }

    public final SingleUriWithRecursiveOptions copy(g0 g0Var, boolean z4) {
        i.e(g0Var, "uri");
        return new SingleUriWithRecursiveOptions(g0Var, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUriWithRecursiveOptions)) {
            return false;
        }
        SingleUriWithRecursiveOptions singleUriWithRecursiveOptions = (SingleUriWithRecursiveOptions) obj;
        return i.a(this.uri, singleUriWithRecursiveOptions.uri) && this.recursive == singleUriWithRecursiveOptions.recursive;
    }

    public final boolean getRecursive() {
        return this.recursive;
    }

    public final g0 getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Boolean.hashCode(this.recursive) + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "SingleUriWithRecursiveOptions(uri=" + this.uri + ", recursive=" + this.recursive + ")";
    }
}
