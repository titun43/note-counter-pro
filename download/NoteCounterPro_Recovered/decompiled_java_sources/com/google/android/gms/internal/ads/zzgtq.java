package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzgtq extends zzgts {
    public zzgtq() {
        super(null);
    }

    public static final zzgts zzf(int i5) {
        zzgts zzgtsVar;
        zzgts zzgtsVar2;
        zzgts zzgtsVar3;
        if (i5 < 0) {
            zzgtsVar3 = zzgts.zzb;
            return zzgtsVar3;
        }
        if (i5 > 0) {
            zzgtsVar2 = zzgts.zzc;
            return zzgtsVar2;
        }
        zzgtsVar = zzgts.zza;
        return zzgtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzb(int i5, int i6) {
        return zzf(Integer.compare(i5, i6));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzc(boolean z4, boolean z5) {
        return zzf(Boolean.compare(z5, z4));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzd(boolean z4, boolean z5) {
        return zzf(Boolean.compare(z4, z5));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final int zze() {
        return 0;
    }
}
