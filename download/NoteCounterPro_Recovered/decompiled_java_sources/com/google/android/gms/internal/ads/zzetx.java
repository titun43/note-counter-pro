package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzetx implements zzfav {
    private final String zza;
    private final boolean zzb;

    public zzetx(String str, boolean z4) {
        this.zza = str;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (str != null) {
            Bundle zza = zzfjz.zza(zzdahVar.zza, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
