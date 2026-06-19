package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgld implements zzgky {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzgct zzc;
    private final zzgct zzd;
    private final zzika zze;
    private final zzika zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgoe zzi;

    public zzgld(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgct zzgctVar3, zzgct zzgctVar4, zzika zzikaVar2, File file, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzc = zzgctVar2;
        this.zze = zzikaVar;
        this.zzb = zzgctVar3;
        this.zzd = zzgctVar4;
        this.zzf = zzikaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgoeVar;
    }

    private final j3.a zzj(byte[] bArr) {
        j3.a zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final j3.a zzk(zzgdu zzgduVar) {
        j3.a zzc = this.zzb.zzc(zzgduVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(zzgld.this.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzb() {
        j3.a zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        j3.a zzc = ((zzgct) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzj(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgld.this.zzi(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final j3.a zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzj(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgld.this.zzh(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final j3.a zze() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(this.zza.zzb()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgld.this.zzg((zzgdu) obj);
            }
        }, zzhaf.zza());
        this.zzi.zze(15314, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ boolean zzf() {
        zzgct zzgctVar;
        try {
            zzgct zzgctVar2 = this.zzb;
            File zza = zzgctVar2.zza();
            if (!zza.exists()) {
                zzgctVar2.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File zza2 = ((zzgct) this.zzf.zzb()).zza();
            File zza3 = ((zzgct) this.zze.zzb()).zza();
            try {
                if (zza2.exists()) {
                    File parentFile = zza3.getParentFile();
                    if (parentFile != null) {
                        zzfws.zze(parentFile);
                    }
                    zzgxm.zzb(zza3);
                    zzgxm.zzc(zza2, zza3);
                }
                File zza4 = this.zzd.zza();
                File zza5 = this.zzc.zza();
                try {
                    if (zza4.exists()) {
                        zzgxm.zzb(zza5);
                        zzgxm.zzc(zza4, zza5);
                    }
                    File zza6 = this.zza.zza();
                    try {
                        if (zza.exists()) {
                            zzgxm.zzb(zza6);
                            zzgxm.zzc(zza, zza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e4) {
                        this.zzi.zzd(15313, e4);
                        zzgctVar = this.zzb;
                        zzgctVar.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e5) {
                    this.zzi.zzd(15312, e5);
                    zzgctVar = this.zzb;
                }
            } catch (IOException e6) {
                e = e6;
                this.zzi.zzd(15311, e);
                zzgctVar = this.zzb;
                zzgctVar.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            } catch (SecurityException e7) {
                e = e7;
                this.zzi.zzd(15311, e);
                zzgctVar = this.zzb;
                zzgctVar.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    public final /* synthetic */ zzfwq zzg(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            return null;
        }
        zzbcp zza = zzgduVar.zza();
        File zza2 = ((zzgct) this.zze.zzb()).zza();
        zzgct zzgctVar = this.zzc;
        return new zzfwq(zza, zza2, zzgctVar.zza(), this.zzg);
    }

    public final /* synthetic */ j3.a zzh(zzgdu zzgduVar, Void r2) {
        return zzk(zzgduVar);
    }

    public final /* synthetic */ j3.a zzi(zzgdu zzgduVar, List list) {
        return zzk(zzgduVar);
    }
}
