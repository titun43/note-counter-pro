package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    public zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzb() {
        j3.a zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgme.this.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzc(final zzgdu zzgduVar, final byte[] bArr, final byte[] bArr2) {
        j3.a zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgme.this.zzi(zzgduVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzd(final zzgdu zzgduVar, final byte[] bArr) {
        j3.a zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgme.this.zzh(zzgduVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final j3.a zze() {
        j3.a zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgme.this.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    public final /* synthetic */ zzgdu zzf() {
        zzgdu zzc = this.zza.zzc(1);
        return zzc == null ? zzgdu.zzg() : zzc;
    }

    public final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
