package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzfbe implements zzfav {
    private final int zza;
    private final int zzb;

    public zzfbe(int i5, int i6) {
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i5;
        Bundle bundle = ((zzdah) obj).zza;
        int i6 = this.zza;
        if (i6 == -1 || (i5 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i6);
        bundle.putInt("crashes_without_flags", i5);
        int i7 = com.google.android.gms.ads.internal.client.zzbb.zza;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
