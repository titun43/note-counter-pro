package com.google.android.gms.internal.play_billing;

import y1.s;

/* loaded from: classes.dex */
public final class zzv {
    public static zzeu zza(s sVar) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = sVar.getClass();
        try {
            sVar.a(zzrVar);
            zzrVar.zza = "billingOverrideService.getBillingOverride";
            return zzuVar;
        } catch (Exception e4) {
            zzuVar.zzc(e4);
            return zzuVar;
        }
    }
}
