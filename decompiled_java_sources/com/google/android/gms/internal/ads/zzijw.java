package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzijw implements Iterator {
    int zza = 0;
    final /* synthetic */ zzijx zzb;

    public zzijw(zzijx zzijxVar) {
        this.zzb = zzijxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zza;
        zzijx zzijxVar = this.zzb;
        return i5 < zzijxVar.zza.size() || zzijxVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.zza;
        zzijx zzijxVar = this.zzb;
        List list = zzijxVar.zza;
        if (i5 >= list.size()) {
            list.add(zzijxVar.zzb.next());
            return next();
        }
        int i6 = this.zza;
        this.zza = i6 + 1;
        return list.get(i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
