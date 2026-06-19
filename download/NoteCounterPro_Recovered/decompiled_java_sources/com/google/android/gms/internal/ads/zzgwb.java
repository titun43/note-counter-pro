package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgwb extends zzguf {
    final /* synthetic */ zzgwc zza;

    public zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i5, zzgwcVar.zzw(), "index");
        int i6 = i5 + i5;
        Object obj = zzgwcVar.zzv()[i6];
        Objects.requireNonNull(obj);
        Object obj2 = zzgwcVar.zzv()[i6 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }
}
