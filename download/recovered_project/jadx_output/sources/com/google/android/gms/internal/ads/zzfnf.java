package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfnf {
    public static final zzfnl zza(j3.a aVar, Object obj, zzfnm zzfnmVar) {
        j3.a aVar2;
        aVar2 = zzfnm.zza;
        return new zzfnl(zzfnmVar, obj, null, aVar2, Collections.EMPTY_LIST, aVar, null);
    }

    public static final zzfnl zzb(Callable callable, Object obj, zzfnm zzfnmVar) {
        return zzc(callable, zzfnmVar.zze(), obj, zzfnmVar);
    }

    public static final zzfnl zzc(Callable callable, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        j3.a aVar;
        aVar = zzfnm.zza;
        return new zzfnl(zzfnmVar, obj, null, aVar, Collections.EMPTY_LIST, zzgzyVar.submit(callable), null);
    }

    public static final zzfnl zzd(final zzfna zzfnaVar, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfne
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfna.this.zza();
                return null;
            }
        }, zzgzyVar, obj, zzfnmVar);
    }
}
