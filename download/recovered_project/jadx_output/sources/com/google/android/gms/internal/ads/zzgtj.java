package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgtj extends AbstractSet {
    final /* synthetic */ zzgtm zza;

    public /* synthetic */ zzgtj(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new zzgte(zzgtmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        Object zzj = zzgtmVar.zzj(obj);
        obj2 = zzgtm.zzd;
        return zzj != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
