package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzhjc {
    private static final Logger zza = Logger.getLogger(zzhjc.class.getName());
    private static final zzhjc zzd = new zzhjc();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhjc zza() {
        return zzd;
    }

    private final synchronized zzhba zzg(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhba) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhba zzhbaVar, boolean z4, boolean z5) {
        try {
            String zzb = zzhbaVar.zzb();
            if (z5) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(zzb) && !((Boolean) concurrentMap.get(zzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(zzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhba zzhbaVar2 = (zzhba) concurrentMap2.get(zzb);
            if (zzhbaVar2 != null && !zzhbaVar2.getClass().equals(zzhbaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(zzb));
                throw new GeneralSecurityException("typeUrl (" + zzb + ") is already registered with " + zzhbaVar2.getClass().getName() + ", cannot be re-registered with " + zzhbaVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(zzb, zzhbaVar);
            this.zzc.put(zzb, Boolean.valueOf(z5));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhba zzhbaVar, boolean z4) {
        zzf(zzhbaVar, 1, z4);
    }

    public final zzhba zzc(String str, Class cls) {
        zzhba zzg = zzg(str);
        if (zzg.zzc().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzc().toString();
        StringBuilder sb = new StringBuilder(u.e(valueOf, name.length() + 53, 23) + obj.length());
        s.c.e(sb, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(s.c.d(sb, ", which only supports: ", obj));
    }

    public final zzhba zzd(String str) {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhba zzhbaVar, int i5, boolean z4) {
        if (!zzhid.zza(i5)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhbaVar, false, z4);
    }
}
