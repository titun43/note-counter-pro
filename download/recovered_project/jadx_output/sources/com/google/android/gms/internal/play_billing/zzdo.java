package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzdo extends zzco {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzdo(Object[] objArr, int i5, int i6) {
        this.zza = objArr;
        this.zzb = i5;
        this.zzc = i6;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzbe.zza(i5, this.zzc, "index");
        Object obj = this.zza[i5 + i5 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return true;
    }
}
