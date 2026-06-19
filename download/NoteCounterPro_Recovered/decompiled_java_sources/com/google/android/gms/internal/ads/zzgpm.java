package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgpm extends zzgok {
    final /* synthetic */ zzgpo zza;
    private final zzgpt zzb;

    public zzgpm(zzgpo zzgpoVar, zzgpt zzgptVar) {
        Objects.requireNonNull(zzgpoVar);
        this.zza = zzgpoVar;
        this.zzb = zzgptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        int i5 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i6 = bundle.getInt("uiMode", 0);
        zzgpr zzd = zzgps.zzd();
        zzd.zza(i5);
        if (string != null) {
            zzd.zzb(string);
        }
        zzd.zzc(i6);
        this.zzb.zza(zzd.zzd());
        if (i5 == 8157) {
            this.zza.zzd();
        }
    }
}
