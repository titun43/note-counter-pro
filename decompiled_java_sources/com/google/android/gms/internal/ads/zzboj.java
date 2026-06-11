package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzboj implements zzboh {
    private final zzbok zza;

    public zzboj(zzbok zzbokVar) {
        this.zza = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f5 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f5 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e4);
        }
        zzbok zzbokVar = this.zza;
        zzbokVar.zza(equals);
        zzbokVar.zzb(equals2, f5);
        zzcjlVar.zzaE(equals);
    }
}
