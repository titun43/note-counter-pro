package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdjy;

/* loaded from: classes.dex */
public final class zzbl implements zzdjy {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbl(zzb zzbVar, int i5, String str) {
        this.zza = zzbVar;
        this.zzb = i5;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbj zzbjVar) {
        this.zza.zza(this.zzc, zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(final zzbj zzbjVar) {
        if (zzbjVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbl.this.zza(zzbjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
    }
}
