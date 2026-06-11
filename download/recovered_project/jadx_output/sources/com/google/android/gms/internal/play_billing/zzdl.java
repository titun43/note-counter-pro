package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdl extends zzco {
    final /* synthetic */ zzdm zza;

    public zzdl(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        int i6;
        Object[] objArr;
        Object[] objArr2;
        i6 = this.zza.zzc;
        zzbe.zza(i5, i6, "index");
        objArr = this.zza.zzb;
        int i7 = i5 + i5;
        Object obj = objArr[i7];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i7 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i5;
        i5 = this.zza.zzc;
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return true;
    }
}
