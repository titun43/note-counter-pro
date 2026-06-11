package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbfj implements com.google.android.gms.common.internal.b {
    final /* synthetic */ zzbfl zza;

    public zzbfj(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzk(zzbflVar.zzi().zzq());
                }
            } catch (DeadObjectException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e4);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i5) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            zzbflVar.zzk(null);
            zzbflVar.zzh().notifyAll();
        }
    }
}
