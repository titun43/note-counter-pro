package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaov {
    private final zzagh zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaov(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    private final void zze(int i5) {
        long j2 = this.zzl;
        if (j2 != -9223372036854775807L) {
            long j5 = this.zzb;
            long j6 = this.zzk;
            if (j5 == j6) {
                return;
            }
            int i6 = (int) (j5 - j6);
            this.zza.zze(j2, this.zzm ? 1 : 0, i6, i5, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j2, int i5, int i6, long j5, boolean z4) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j5;
        this.zzd = 0;
        this.zzb = j2;
        if (i6 >= 32 && i6 != 40) {
            if (this.zzi && !this.zzj) {
                if (z4) {
                    zze(i5);
                }
                this.zzi = false;
            }
            if (i6 <= 35 || i6 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z5 = i6 >= 16 && i6 <= 21;
        this.zzc = z5;
        this.zzf = z5 || i6 <= 9;
    }

    public final void zzc(byte[] bArr, int i5, int i6) {
        if (this.zzf) {
            int i7 = this.zzd;
            int i8 = (i5 + 2) - i7;
            if (i8 >= i6) {
                this.zzd = (i6 - i5) + i7;
            } else {
                this.zzg = (bArr[i8] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j2, int i5, boolean z4) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z4 && this.zzi) {
                zze(i5 + ((int) (j2 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
