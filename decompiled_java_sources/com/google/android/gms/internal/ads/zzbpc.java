package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b0;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbpc implements zzboh {
    private final zzebf zza;

    public zzbpc(zzebf zzebfVar) {
        b0.h(zzebfVar, "The Inspector Manager must not be null");
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j2 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j2);
    }
}
