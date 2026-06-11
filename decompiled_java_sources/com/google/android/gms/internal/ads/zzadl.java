package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzadl {
    private final Handler zza;
    private final zzadm zzb;

    public zzadl(Handler handler, zzadm zzadmVar) {
        if (zzadmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzadmVar;
    }

    public final void zza(final zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzk(zzinVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j2, final long j5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzl(str, j2, j5);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzm(zzvVar, zzioVar);
                }
            });
        }
    }

    public final void zzd(final int i5, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzn(i5, j2);
                }
            });
        }
    }

    public final void zze(final long j2, final int i5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzade
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzo(j2, i5);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzp(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzq(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzs(zzinVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzt(exc);
                }
            });
        }
    }

    public final /* synthetic */ void zzk(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzb(zzinVar);
    }

    public final /* synthetic */ void zzl(String str, long j2, long j5) {
        String str2 = zzfj.zza;
        this.zzb.zzc(str, j2, j5);
    }

    public final /* synthetic */ void zzm(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzd(zzvVar, zzioVar);
    }

    public final /* synthetic */ void zzn(int i5, long j2) {
        String str = zzfj.zza;
        this.zzb.zze(i5, j2);
    }

    public final /* synthetic */ void zzo(long j2, int i5) {
        String str = zzfj.zza;
        this.zzb.zzj(j2, i5);
    }

    public final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzfj.zza;
        this.zzb.zzf(zzbvVar);
    }

    public final /* synthetic */ void zzq(Object obj, long j2) {
        String str = zzfj.zza;
        this.zzb.zzg(obj, j2);
    }

    public final /* synthetic */ void zzr(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzh(str);
    }

    public final /* synthetic */ void zzs(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzi(zzinVar);
    }

    public final /* synthetic */ void zzt(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzk(exc);
    }
}
