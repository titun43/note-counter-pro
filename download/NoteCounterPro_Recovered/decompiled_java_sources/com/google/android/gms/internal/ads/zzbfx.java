package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbfx implements com.google.android.gms.common.internal.b {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbfp zza;
    final /* synthetic */ zzcen zzb;
    final /* synthetic */ zzbfz zzc;

    public zzbfx(zzbfz zzbfzVar, zzbfp zzbfpVar, zzcen zzcenVar) {
        this.zza = zzbfpVar;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzc = zzbfzVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzbfz zzbfzVar = this.zzc;
        synchronized (zzbfzVar.zzf()) {
            try {
                if (zzbfzVar.zzd()) {
                    return;
                }
                zzbfzVar.zze(true);
                final zzbfo zzc = zzbfzVar.zzc();
                if (zzc == null) {
                    return;
                }
                zzgzy zzgzyVar = zzcei.zza;
                final zzbfp zzbfpVar = this.zza;
                final zzcen zzcenVar = this.zzb;
                final j3.a submit = zzgzyVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcen zzcenVar2 = zzcenVar;
                        zzbfo zzbfoVar = zzc;
                        zzbfx zzbfxVar = zzbfx.this;
                        try {
                            zzbfr zzq = zzbfoVar.zzq();
                            boolean zzp = zzbfoVar.zzp();
                            zzbfp zzbfpVar2 = zzbfpVar;
                            zzbfm zzf = zzp ? zzq.zzf(zzbfpVar2) : zzq.zze(zzbfpVar2);
                            if (!zzf.zza()) {
                                zzcenVar2.zzd(new RuntimeException("No entry contents."));
                                zzbfxVar.zzc.zzb();
                                return;
                            }
                            zzbfu zzbfuVar = new zzbfu(zzbfxVar, zzf.zzb(), 1);
                            int read = zzbfuVar.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbfuVar.unread(read);
                            zzcenVar2.zzc(zzbgb.zza(zzbfuVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
                        } catch (RemoteException e4) {
                            e = e4;
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcenVar2.zzd(e);
                            zzbfxVar.zzc.zzb();
                        } catch (IOException e5) {
                            e = e5;
                            int i52 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcenVar2.zzd(e);
                            zzbfxVar.zzc.zzb();
                        }
                    }
                });
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcen.this.isCancelled()) {
                            submit.cancel(true);
                        }
                    }
                }, zzcei.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i5) {
    }
}
