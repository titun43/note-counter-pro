package com.capacitorjs.plugins.filesystem;

import g4.i;
import r3.c0;
import r3.g0;

/* loaded from: classes.dex */
public final class WriteFileOptions {
    private final c0 options;
    private final g0 uri;

    public WriteFileOptions(g0 g0Var, c0 c0Var) {
        i.e(g0Var, "uri");
        i.e(c0Var, "options");
        this.uri = g0Var;
        this.options = c0Var;
    }

    public static /* synthetic */ WriteFileOptions copy$default(WriteFileOptions writeFileOptions, g0 g0Var, c0 c0Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            g0Var = writeFileOptions.uri;
        }
        if ((i5 & 2) != 0) {
            c0Var = writeFileOptions.options;
        }
        return writeFileOptions.copy(g0Var, c0Var);
    }

    public final g0 component1() {
        return this.uri;
    }

    public final c0 component2() {
        return this.options;
    }

    public final WriteFileOptions copy(g0 g0Var, c0 c0Var) {
        i.e(g0Var, "uri");
        i.e(c0Var, "options");
        return new WriteFileOptions(g0Var, c0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteFileOptions)) {
            return false;
        }
        WriteFileOptions writeFileOptions = (WriteFileOptions) obj;
        return i.a(this.uri, writeFileOptions.uri) && i.a(this.options, writeFileOptions.options);
    }

    public final c0 getOptions() {
        return this.options;
    }

    public final g0 getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.options.hashCode() + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "WriteFileOptions(uri=" + this.uri + ", options=" + this.options + ")";
    }
}
