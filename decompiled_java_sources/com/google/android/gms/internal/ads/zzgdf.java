package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgdf {
    private final zzika zza;
    private final zzika zzb;
    private final ExecutorService zzc;
    private final zzika zzd;
    private j3.a zze = null;

    public zzgdf(zzika zzikaVar, zzika zzikaVar2, ExecutorService executorService, zzika zzikaVar3) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = executorService;
        this.zzd = zzikaVar3;
    }

    public final synchronized j3.a zza() {
        try {
            j3.a aVar = this.zze;
            if (aVar != null) {
                return aVar;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgdd) it.next()).zza());
            }
            zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
            j3.a zzk = zzgzo.zzk(zzgzo.zzm(arrayList), zzgde.zza, this.zzc);
            zzgoeVar.zze(2, zzk);
            this.zze = zzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgdd) it2.next()).zza();
            }
            j3.a aVar2 = this.zze;
            if (aVar2 != null) {
                return aVar2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized j3.a zzb() {
        j3.a aVar;
        aVar = this.zze;
        if (aVar == null) {
            throw null;
        }
        return aVar;
    }
}
