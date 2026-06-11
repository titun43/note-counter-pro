package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfrc extends zzfsa {
    public zzfrc(ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar) {
        super(clientApi, context, i5, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final j3.a zza(Context context) {
        zzbtt zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an interstitial ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzc = this.zza.zzc(new a3.b(context), new com.google.android.gms.ads.internal.client.zzr(), this.zze.zza, zzd, this.zzc);
        if (zzc == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an interstitial ad manager."));
        }
        zzhah zze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzc.zzQ(this.zze.zzc, new zzfrb(this, zze, zzc));
            return zze;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e4);
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzQ)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).zzt();
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e4);
            return null;
        }
    }

    public zzfrc(String str, ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar, zzfqr zzfqrVar) {
        super(str, clientApi, context, i5, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar, zzfqrVar);
    }
}
