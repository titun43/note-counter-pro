package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzeew extends zzeeq {
    private String zzg;
    private int zzh = 1;

    public zzeew(Context context) {
        this.zzf = new zzbyw(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i5 = this.zzh;
                        if (i5 == 2) {
                            this.zzf.zzp().zzg(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                        } else if (i5 == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                        } else {
                            this.zza.zzd(new zzeff(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeff(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzeff(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.c
    public final void onConnectionFailed(t2.b bVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeff(1));
    }

    public final j3.a zza(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            try {
                int i5 = this.zzh;
                if (i5 != 1 && i5 != 2) {
                    return zzgzo.zzc(new zzeff(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzuVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeev
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeew.this.zzb();
                    }
                }, zzcei.zzg);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j3.a zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i5 = this.zzh;
                if (i5 != 1 && i5 != 3) {
                    return zzgzo.zzc(new zzeff(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeew.this.zzb();
                    }
                }, zzcei.zzg);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
