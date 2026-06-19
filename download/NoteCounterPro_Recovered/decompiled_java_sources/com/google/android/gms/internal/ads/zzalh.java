package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzalh implements zzafy {
    final /* synthetic */ zzali zza;

    public /* synthetic */ zzalh(zzali zzaliVar, byte[] bArr) {
        Objects.requireNonNull(zzaliVar);
        this.zza = zzaliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        zzali zzaliVar = this.zza;
        return zzaliVar.zzf().zzh(zzaliVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzali zzaliVar = this.zza;
        long zzd = zzaliVar.zzd() + BigInteger.valueOf(zzaliVar.zzf().zzi(j2)).multiply(BigInteger.valueOf(zzaliVar.zze() - zzaliVar.zzd())).divide(BigInteger.valueOf(zzaliVar.zzg())).longValue();
        String str = zzfj.zza;
        zzafz zzafzVar = new zzafz(j2, Math.max(zzaliVar.zzd(), Math.min(zzd - 30000, zzaliVar.zze() - 1)));
        return new zzafw(zzafzVar, zzafzVar);
    }
}
