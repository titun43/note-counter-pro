package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbop implements zzboh {
    private final zzdzc zza;

    public zzbop(zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            long parseLong = Long.parseLong((String) map.get("id"));
            int parseInt = Integer.parseInt((String) map.get("event_type"));
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            this.zza.zza(parseLong, parseInt, System.currentTimeMillis());
        } catch (NumberFormatException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e4);
        }
    }
}
