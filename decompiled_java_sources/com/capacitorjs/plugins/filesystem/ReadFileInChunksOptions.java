package com.capacitorjs.plugins.filesystem;

import g4.i;
import r3.g0;
import r3.z;

/* loaded from: classes.dex */
public final class ReadFileInChunksOptions {
    private final z options;
    private final g0 uri;

    public ReadFileInChunksOptions(g0 g0Var, z zVar) {
        i.e(g0Var, "uri");
        i.e(zVar, "options");
        this.uri = g0Var;
        this.options = zVar;
    }

    public static /* synthetic */ ReadFileInChunksOptions copy$default(ReadFileInChunksOptions readFileInChunksOptions, g0 g0Var, z zVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            g0Var = readFileInChunksOptions.uri;
        }
        if ((i5 & 2) != 0) {
            zVar = readFileInChunksOptions.options;
        }
        return readFileInChunksOptions.copy(g0Var, zVar);
    }

    public final g0 component1() {
        return this.uri;
    }

    public final z component2() {
        return this.options;
    }

    public final ReadFileInChunksOptions copy(g0 g0Var, z zVar) {
        i.e(g0Var, "uri");
        i.e(zVar, "options");
        return new ReadFileInChunksOptions(g0Var, zVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadFileInChunksOptions)) {
            return false;
        }
        ReadFileInChunksOptions readFileInChunksOptions = (ReadFileInChunksOptions) obj;
        return i.a(this.uri, readFileInChunksOptions.uri) && i.a(this.options, readFileInChunksOptions.options);
    }

    public final z getOptions() {
        return this.options;
    }

    public final g0 getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.options.hashCode() + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "ReadFileInChunksOptions(uri=" + this.uri + ", options=" + this.options + ")";
    }
}
