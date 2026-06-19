package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcdl implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcen zzb;

    public zzcdl(zzcdm zzcdmVar, Context context, zzcen zzcenVar) {
        this.zza = context;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzcdmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (IOException | IllegalStateException | t2.g e4) {
            this.zzb.zzd(e4);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e4);
        }
    }
}
