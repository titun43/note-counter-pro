package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzcad extends zzcaf {
    private final String zza;
    private final int zzb;

    public zzcad(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcad)) {
            return false;
        }
        zzcad zzcadVar = (zzcad) obj;
        if (b0.j(this.zza, zzcadVar.zza)) {
            if (b0.j(Integer.valueOf(this.zzb), Integer.valueOf(zzcadVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcag
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcag
    public final int zzc() {
        return this.zzb;
    }
}
