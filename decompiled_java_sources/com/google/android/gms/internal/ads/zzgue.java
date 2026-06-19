package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgue extends zzguf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzguf zzc;

    public zzgue(zzguf zzgufVar, int i5, int i6) {
        Objects.requireNonNull(zzgufVar);
        this.zzc = zzgufVar;
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzgrc.zzm(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, java.util.List
    /* renamed from: zzh */
    public final zzguf subList(int i5, int i6) {
        zzgrc.zzo(i5, i6, this.zzb);
        int i7 = this.zza;
        return this.zzc.subList(i5 + i7, i6 + i7);
    }
}
