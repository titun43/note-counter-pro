package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzboo implements zzboh {
    static final Map zza;
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbwr zzc;
    private final zzbwy zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        o.f fVar = new o.f(7);
        for (int i5 = 0; i5 < 7; i5++) {
            fVar.put(strArr[i5], numArr[i5]);
        }
        zza = Collections.unmodifiableMap(fVar);
    }

    public zzboo(com.google.android.gms.ads.internal.zzb zzbVar, zzbwr zzbwrVar, zzbwy zzbwyVar) {
        this.zzb = zzbVar;
        this.zzc = zzbwrVar;
        this.zzd = zzbwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i5 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbwu(zzcjlVar, map).zza();
                    return;
                }
                if (intValue == 4) {
                    new zzbwo(zzcjlVar, map).zza();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcjlVar == null) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i5 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i5 = parseBoolean ? -1 : 14;
        }
        zzcjlVar.zzam(i5);
    }
}
