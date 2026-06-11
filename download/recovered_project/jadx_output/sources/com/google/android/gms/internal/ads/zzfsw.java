package com.google.android.gms.internal.ads;

import com.getcapacitor.PluginMethod;

/* loaded from: classes.dex */
public enum zzfsw {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(PluginMethod.RETURN_NONE);

    private final String zzd;

    zzfsw(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
