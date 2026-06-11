package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzacs {
    private final zzacr zza;
    private final zzacz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdn zzk = zzdn.zza;

    public zzacs(Context context, zzacr zzacrVar, long j2) {
        this.zza = zzacrVar;
        this.zzb = new zzacz(context);
    }

    private final void zzo(int i5) {
        this.zzd = Math.min(this.zzd, i5);
    }

    public final void zza(int i5) {
        if (i5 == 0) {
            this.zzd = 1;
        } else if (i5 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f5) {
        this.zzb.zzf(f5);
    }

    public final boolean zzf() {
        int i5 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        return i5 != 3;
    }

    public final void zzg(zzdn zzdnVar) {
        this.zzk = zzdnVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z4) {
        if (z4 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z4) {
        this.zzi = z4;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
    
        if (r17 > 100000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzk(long j2, long j5, long j6, long j7, boolean z4, boolean z5, zzacq zzacqVar) {
        long j8;
        zzacqVar.zzc();
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j5;
        }
        if (this.zzg != j2) {
            this.zzb.zzg(j2);
            this.zzg = j2;
        }
        long j9 = (long) ((j2 - j5) / this.zzj);
        if (this.zzc) {
            j9 -= zzfj.zzq(this.zzk.zzb()) - j6;
        }
        zzacqVar.zze(j9);
        if (z4 && !z5) {
            return 3;
        }
        if (!this.zzl) {
            if (this.zza.zzao(zzacqVar.zzd(), j5, j6, z5, true)) {
                return 4;
            }
            if (this.zzc && zzacqVar.zzd() < 30000) {
                return 3;
            }
            this.zzm = true;
            return 5;
        }
        long zzd = zzacqVar.zzd();
        boolean z6 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i5 = this.zzd;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        j8 = -9223372036854775807L;
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException();
                        }
                        j8 = -9223372036854775807L;
                        long zzq = zzfj.zzq(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            long j10 = this.zze;
                            if (j10 != -9223372036854775807L) {
                                if (j10 != j5) {
                                    if (zzd < -30000) {
                                    }
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            j8 = -9223372036854775807L;
        } else {
            j8 = -9223372036854775807L;
        }
        if (!this.zzc || j5 == this.zze) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzacqVar.zzg(this.zzb.zzi((zzacqVar.zzd() * 1000) + zzc, j2));
        zzacqVar.zze((zzacqVar.zzf() - zzc) / 1000);
        if (this.zzh != j8 && !this.zzi) {
            z6 = true;
        }
        if (this.zza.zzao(zzacqVar.zzd(), j5, j6, z5, z6)) {
            return 4;
        }
        return (zzacqVar.zzd() >= -30000 || z5) ? zzacqVar.zzd() > 50000 ? 5 : 1 : z6 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i5) {
        this.zzb.zza(i5);
    }

    public final void zzn(float f5) {
        zzgrc.zza(f5 > 0.0f);
        if (f5 == this.zzj) {
            return;
        }
        this.zzj = f5;
        this.zzb.zze(f5);
    }
}
