package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzeul implements zzfav {
    final String zza;
    final int zzb;

    public zzeul(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i5;
        Bundle bundle = ((zzdah) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i5 = this.zzb) == -1) {
            return;
        }
        Bundle zza = zzfjz.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i5);
    }
}
