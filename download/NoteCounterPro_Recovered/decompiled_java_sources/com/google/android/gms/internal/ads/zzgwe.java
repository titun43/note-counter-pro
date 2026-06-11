package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgwe extends zzguf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgwe(Object[] objArr, int i5, int i6) {
        this.zza = objArr;
        this.zzb = i5;
        this.zzc = i6;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzgrc.zzm(i5, this.zzc, "index");
        Object obj = this.zza[i5 + i5 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }
}
