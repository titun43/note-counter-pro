package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzazl extends zzaxz {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzazl() {
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzazl(String str) {
        HashMap zzb = zzaxz.zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
            this.zzc = (Long) zzb.get(2);
        }
    }
}
