package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzacz {
    private final Context zzb;
    private zzacv zzc;
    private boolean zzd;
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabv zza = new zzabv();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzacz(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzabv zzabvVar = this.zza;
        float zzg = zzabvVar.zzc() ? zzabvVar.zzg() : this.zzf;
        float f5 = this.zzg;
        if (zzg != f5) {
            if (zzg != -1.0f && f5 != -1.0f) {
                float f6 = 1.0f;
                if (zzabvVar.zzc() && zzabvVar.zze() >= 5000000000L) {
                    f6 = 0.1f;
                }
                if (Math.abs(zzg - this.zzg) < f6) {
                    return;
                }
            } else if (zzg == -1.0f && zzabvVar.zzd() < 30) {
                return;
            }
            this.zzg = zzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z4) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f5 = 0.0f;
        if (this.zzd) {
            float f6 = this.zzg;
            if (f6 != -1.0f) {
                f5 = this.zzi * f6;
            }
        }
        if (z4 || this.zzh != f5) {
            this.zzh = f5;
            zzacu.zza(this.zze, f5);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzacu.zza(this.zze, 0.0f);
    }

    public final void zza(int i5) {
        if (this.zzj == i5) {
            return;
        }
        this.zzj = i5;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzacv zzacvVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacvVar = Build.VERSION.SDK_INT >= 33 ? new zzacy(choreographer, displayManager, null) : new zzacw(choreographer, displayManager, null);
            } catch (RuntimeException e4) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
        }
        this.zzc = zzacvVar;
        if (zzacvVar != null) {
            zzacvVar.zza();
        }
        zzl(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f5) {
        this.zzi = f5;
        zzl(false);
    }

    public final void zzf(float f5) {
        this.zzf = f5;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j2) {
        long j5 = this.zzn;
        if (j5 != -1) {
            this.zzq = j5;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j2 * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            zzacvVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzi(long j2, long j5) {
        long j6;
        zzacv zzacvVar;
        long j7;
        long j8;
        long j9;
        if (this.zzq != -1) {
            if (this.zza.zzc()) {
                j9 = (long) (((this.zzm - this.zzq) * r3.zzf()) / this.zzi);
            } else {
                j9 = (long) (((j5 - this.zzs) * 1000) / this.zzi);
            }
            j6 = this.zzr + j9;
            if (Math.abs(j2 - j6) > 20000000) {
                zzj();
            }
            this.zzn = this.zzm;
            this.zzo = j6;
            this.zzp = j5;
            zzacvVar = this.zzc;
            if (zzacvVar != null) {
                long j10 = zzacvVar.zzc;
                long j11 = this.zzc.zzd;
                if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
                    long j12 = (((j6 - j10) / j11) * j11) + j10;
                    if (j6 <= j12) {
                        j7 = j12 - j11;
                    } else {
                        j12 += j11;
                        j7 = j12;
                    }
                    long j13 = j11 / 2;
                    long j14 = j12 - j6;
                    long j15 = j6 - j7;
                    long abs = Math.abs(j14 - j15);
                    if (abs < j13) {
                        long j16 = j11 / 4;
                        if (abs < j16) {
                            j8 = this.zzk;
                            if (j8 == 0) {
                                if (j14 < j15) {
                                    j16 = -j16;
                                }
                            }
                        } else {
                            j16 = 0;
                        }
                        this.zzl = j16;
                        j8 = j16;
                        if (j14 + j8 >= j15) {
                            j12 = j7;
                        }
                        return j12 - ((j11 * 80) / 100);
                    }
                    j8 = this.zzk;
                    this.zzl = j8;
                    if (j14 + j8 >= j15) {
                    }
                    return j12 - ((j11 * 80) / 100);
                }
            }
            return j6;
        }
        j6 = j2;
        this.zzn = this.zzm;
        this.zzo = j6;
        this.zzp = j5;
        zzacvVar = this.zzc;
        if (zzacvVar != null) {
        }
        return j6;
    }
}
