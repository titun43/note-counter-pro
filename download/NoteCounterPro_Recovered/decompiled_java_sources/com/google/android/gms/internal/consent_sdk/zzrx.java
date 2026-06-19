package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzrx {
    private static final zzrx zza = new zzrx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzsb zzb = new zzrh();

    private zzrx() {
    }

    public static zzrx zza() {
        return zza;
    }

    public final zzsa zzb(Class cls) {
        byte[] bArr = zzqs.zzb;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.zzc;
        zzsa zzsaVar = (zzsa) concurrentMap.get(cls);
        if (zzsaVar == null) {
            zzsaVar = this.zzb.zza(cls);
            zzsa zzsaVar2 = (zzsa) concurrentMap.putIfAbsent(cls, zzsaVar);
            if (zzsaVar2 != null) {
                return zzsaVar2;
            }
        }
        return zzsaVar;
    }
}
