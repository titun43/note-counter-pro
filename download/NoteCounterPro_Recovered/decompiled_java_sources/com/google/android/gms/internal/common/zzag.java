package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzag extends zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzah zzc;

    public zzag(zzah zzahVar, int i5, int i6) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzr.zzb(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi */
    public final zzah subList(int i5, int i6) {
        zzr.zzd(i5, i6, this.zzb);
        int i7 = this.zza;
        return this.zzc.subList(i5 + i7, i6 + i7);
    }
}
