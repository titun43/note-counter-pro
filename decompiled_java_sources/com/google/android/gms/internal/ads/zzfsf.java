package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfsf extends zzfsa {
    public zzfsf(ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar) {
        super(clientApi, context, i5, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final j3.a zza(Context context) {
        zzbtt zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzcaz zzl = this.zza.zzl(new a3.b(context), this.zze.zza, zzd, this.zzc);
        if (zzl == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzhah zze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzl.zzc(this.zze.zzc, new zzfse(this, zze, zzl));
            return zze;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzR)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((zzcaz) obj).zzm();
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e4);
            return null;
        }
    }

    public zzfsf(String str, ClientApi clientApi, Context context, int i5, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, x2.b bVar, zzfqr zzfqrVar) {
        super(str, clientApi, context, i5, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, bVar, zzfqrVar);
    }
}
