package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class zzedp implements zzikg {
    public static zzedp zza() {
        return zzedo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zziko.zzb(uuid);
        return uuid;
    }
}
