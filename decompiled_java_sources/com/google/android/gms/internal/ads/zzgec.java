package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    public zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    private final j3.a zze(final int i5) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgec.this.zzc(i5);
            }
        }, this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    public final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    public final j3.a zzb(int i5, boolean z4) {
        j3.a zze = zze(i5);
        return (!z4 || i5 == 2) ? zze : (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(zze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
    }

    public final /* synthetic */ zzgdv zzc(int i5) {
        int i6 = i5 - 1;
        if (i6 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i6 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i6 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ j3.a zzd(int i5) {
        return zze(2);
    }
}
