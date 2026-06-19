package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzfbk implements zzfav {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfbk(String str, int i5, int i6, int i7, boolean z4, int i8) {
        this.zza = str;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
        this.zze = z4;
        this.zzf = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zzb(bundle, "carrier", this.zza, !TextUtils.isEmpty(r0));
        int i5 = this.zzb;
        zzfjz.zzc(bundle, "cnt", i5, i5 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfjz.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfjz.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
