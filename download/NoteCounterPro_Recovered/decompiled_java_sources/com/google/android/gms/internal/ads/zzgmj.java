package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    public zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final j3.a zzh(zzgdu zzgduVar) {
        j3.a zzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, zzc);
        return zzc;
    }

    private final j3.a zzi(byte[] bArr) {
        j3.a zzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzb() {
        j3.a zzb = this.zza.zzb();
        this.zzd.zze(20302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        j3.a zzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgmj.this.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgmj.this.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final j3.a zze() {
        j3.a zzb = this.zzb.zzb();
        this.zzd.zze(20304, zzb);
        return zzb;
    }

    public final /* synthetic */ j3.a zzf(zzgdu zzgduVar, Void r2) {
        return zzh(zzgduVar);
    }

    public final /* synthetic */ j3.a zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
