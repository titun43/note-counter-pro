package com.google.android.gms.internal.ads;

import g4.i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zziex implements Iterator, h4.a {
    private final /* synthetic */ Iterator zza;

    public zziex(Iterator it) {
        i.e(it, "delegate");
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
