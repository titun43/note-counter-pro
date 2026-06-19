package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzxr extends zzvy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxr(zzxu zzxuVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j2) {
        this.zzb.zzb(i5, zzbeVar, j2);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z4) {
        this.zzb.zzd(i5, zzbdVar, z4);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
