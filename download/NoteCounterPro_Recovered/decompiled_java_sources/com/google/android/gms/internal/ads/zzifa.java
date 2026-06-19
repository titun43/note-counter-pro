package com.google.android.gms.internal.ads;

import g4.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzifa implements Map.Entry, h4.a {
    private final /* synthetic */ Map.Entry zza;

    public zzifa(Map.Entry entry) {
        i.e(entry, "delegate");
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
