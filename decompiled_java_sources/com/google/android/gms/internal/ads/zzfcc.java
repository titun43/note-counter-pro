package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, PackageInfo packageInfo, int i5) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        j3.a zza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = zzfcb.zza;
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(zza, zzfcbVar, executor), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzfcc.this.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ j3.a zzc(Throwable th) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
