package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public final class zzayc implements PackageManager$OnChecksumsReadyListener {
    final zzhah zza = zzhah.zze();

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.zza.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return;
        }
        try {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ApkChecksum c5 = c.c(list.get(i5));
                type = c5.getType();
                if (type == 8) {
                    zzhah zzhahVar = this.zza;
                    zzgxa zzi = zzgxa.zzn().zzi();
                    value = c5.getValue();
                    zzhahVar.zza(zzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }
}
