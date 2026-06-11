package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzevd implements zzfav {
    private final double zza;
    private final boolean zzb;

    public zzevd(double d5, boolean z4) {
        this.zza = d5;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Bundle zza = zzfjz.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfjz.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
