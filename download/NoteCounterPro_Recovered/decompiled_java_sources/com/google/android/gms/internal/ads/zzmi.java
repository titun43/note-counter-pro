package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzmi extends zzvy {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmi(zzmj zzmjVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmjVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z4) {
        zzbf zzbfVar = this.zzb;
        zzbd zzd = zzbfVar.zzd(i5, zzbdVar, z4);
        if (zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
            return zzd;
        }
        zzd.zzf = true;
        return zzd;
    }
}
