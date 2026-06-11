package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import t2.g;

/* loaded from: classes.dex */
final class zzc extends zzb {
    private final Context zza;

    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z4;
        try {
            z4 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (IOException | IllegalStateException | g e4) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e4);
            z4 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzh(z4);
        StringBuilder sb = new StringBuilder(String.valueOf(z4).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z4);
        String sb2 = sb.toString();
        int i6 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
    }
}
