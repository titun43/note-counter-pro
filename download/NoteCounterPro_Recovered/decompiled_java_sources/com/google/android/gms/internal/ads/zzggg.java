package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzggg implements zzgha {
    private final Map zza;
    private final zzawg zzb;
    private final zzgoc zzc;
    private final long zzd;

    public zzggg(zzawg zzawgVar, Map map, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        this.zza = map;
        this.zzb = zzawgVar;
        this.zzc = zzgoeVar.zza(112);
        this.zzd = zzgbfVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zza();
        return null;
    }

    public final Void zza() {
        zzaxg zzaxgVar;
        try {
            try {
                this.zzc.zza();
                j3.a aVar = (j3.a) this.zza.get("gs");
                if (aVar != null && (zzaxgVar = (zzaxg) aVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzawg zzawgVar = this.zzb;
                    synchronized (zzawgVar) {
                        zzawgVar.zzad(zzaxgVar.zzh());
                        zzawgVar.zzN(zzaxgVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e4) {
            this.zzc.zzb(e4);
        }
        this.zzc.zzc();
        return null;
    }
}
