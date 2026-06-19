package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdae implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfjc zzc;
    private final zzfir zzd;
    private final x2.b zze;
    private final zzdxz zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfpk zza = zzfpl.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzdae(zzfjc zzfjcVar, zzfir zzfirVar, x2.b bVar, zzdxz zzdxzVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfjcVar;
        this.zzd = zzfirVar;
        this.zze = bVar;
        this.zzf = zzdxzVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdxz zzdxzVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String encodeToString = Base64.encodeToString(((zzfpl) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzop)).booleanValue()) {
                    zzdxy zza = zzdxzVar.zza();
                    zza.zzc("action", "pclma");
                    zza.zzc("pclmd", encodeToString);
                    zza.zzc("gqi", str);
                    zza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i5) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfpk zzfpkVar = this.zza;
                    zzfoc zza = zzfod.zza();
                    zza.zzb(i5);
                    ((x2.c) this.zze).getClass();
                    zza.zza(System.currentTimeMillis());
                    zzfpkVar.zza((zzfod) zza.zzbu());
                    if (i5 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i5) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                zzfpk zzfpkVar = this.zza;
                ((x2.c) this.zze).getClass();
                zzfpkVar.zzb(System.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdad
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdae.this.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
