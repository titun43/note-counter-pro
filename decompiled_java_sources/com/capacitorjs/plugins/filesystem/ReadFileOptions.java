package com.capacitorjs.plugins.filesystem;

import g4.i;
import r3.a0;
import r3.g0;

/* loaded from: classes.dex */
public final class ReadFileOptions {
    private final a0 options;
    private final g0 uri;

    public ReadFileOptions(g0 g0Var, a0 a0Var) {
        i.e(g0Var, "uri");
        i.e(a0Var, "options");
        this.uri = g0Var;
        this.options = a0Var;
    }

    public static /* synthetic */ ReadFileOptions copy$default(ReadFileOptions readFileOptions, g0 g0Var, a0 a0Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            g0Var = readFileOptions.uri;
        }
        if ((i5 & 2) != 0) {
            a0Var = readFileOptions.options;
        }
        return readFileOptions.copy(g0Var, a0Var);
    }

    public final g0 component1() {
        return this.uri;
    }

    public final a0 component2() {
        return this.options;
    }

    public final ReadFileOptions copy(g0 g0Var, a0 a0Var) {
        i.e(g0Var, "uri");
        i.e(a0Var, "options");
        return new ReadFileOptions(g0Var, a0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadFileOptions)) {
            return false;
        }
        ReadFileOptions readFileOptions = (ReadFileOptions) obj;
        return i.a(this.uri, readFileOptions.uri) && i.a(this.options, readFileOptions.options);
    }

    public final a0 getOptions() {
        return this.options;
    }

    public final g0 getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.options.hashCode() + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "ReadFileOptions(uri=" + this.uri + ", options=" + this.options + ")";
    }
}
