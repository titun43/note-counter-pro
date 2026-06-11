package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class zzrb {
    private final Handler zza;
    private final zzrc zzb;

    public zzrb(Handler handler, zzrc zzrcVar) {
        this.zza = zzrcVar == null ? null : handler;
        this.zzb = zzrcVar;
    }

    public final /* synthetic */ void zzA(int i5) {
        String str = zzfj.zza;
        this.zzb.zzx(i5);
    }

    public final /* synthetic */ void zzB(zzil zzilVar) {
        String str = zzfj.zza;
        this.zzb.zzy(zzilVar);
    }

    public final void zza(final zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzo(zzinVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j2, final long j5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzp(str, j2, j5);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzq(zzvVar, zzioVar);
                }
            });
        }
    }

    public final void zzd(final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzr(j2);
                }
            });
        }
    }

    public final void zze(final int i5, final long j2, final long j5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzs(i5, j2, j5);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzu(zzinVar);
                }
            });
        }
    }

    public final void zzh(final boolean z4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzv(z4);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzy(zzrdVar);
                }
            });
        }
    }

    public final void zzl(final zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzz(zzrdVar);
                }
            });
        }
    }

    public final void zzm(final int i5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzA(i5);
                }
            });
        }
    }

    public final void zzn(final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrb.this.zzB(zzilVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzo(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzl(zzinVar);
    }

    public final /* synthetic */ void zzp(String str, long j2, long j5) {
        String str2 = zzfj.zza;
        this.zzb.zzm(str, j2, j5);
    }

    public final /* synthetic */ void zzq(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzn(zzvVar, zzioVar);
    }

    public final /* synthetic */ void zzr(long j2) {
        String str = zzfj.zza;
        this.zzb.zzo(j2);
    }

    public final /* synthetic */ void zzs(int i5, long j2, long j5) {
        String str = zzfj.zza;
        this.zzb.zzp(i5, j2, j5);
    }

    public final /* synthetic */ void zzt(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzu(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzr(zzinVar);
    }

    public final /* synthetic */ void zzv(boolean z4) {
        String str = zzfj.zza;
        this.zzb.zzs(z4);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzx(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzu(exc);
    }

    public final /* synthetic */ void zzy(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzv(zzrdVar);
    }

    public final /* synthetic */ void zzz(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzw(zzrdVar);
    }
}
