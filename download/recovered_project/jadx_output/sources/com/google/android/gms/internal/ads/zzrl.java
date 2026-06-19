package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzrl {
    private final zzrk zza;
    private final int zzb;
    private final zzsj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzrl(AudioTrack audioTrack, zzsj zzsjVar) {
        this.zza = new zzrk(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsjVar;
        zzf(0);
    }

    private final void zzf(int i5) {
        this.zzd = i5;
        long j2 = 10000;
        if (i5 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i5 == 1) {
                this.zzf = 10000L;
                return;
            }
            j2 = (i5 == 2 || i5 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j2;
    }

    private final long zzg(long j2, float f5) {
        zzrk zzrkVar = this.zza;
        return zzh(zzrkVar.zzc(), zzrkVar.zzb(), j2, f5);
    }

    private final long zzh(long j2, long j5, long j6, float f5) {
        long j7 = j6 - j5;
        return zzfj.zzv(j7, f5) + zzfj.zzr(j2, this.zzb);
    }

    public final void zza(long j2, float f5, long j5) {
        boolean z4;
        int i5;
        if (j2 - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j2;
        zzrk zzrkVar = this.zza;
        boolean zza = zzrkVar.zza();
        if (zza) {
            long zzb = zzrkVar.zzb();
            long zzg = zzg(j2, f5);
            i5 = 2;
            if (Math.abs(zzb - j2) > 5000000) {
                zzsj zzsjVar = this.zzc;
                long zzc = zzrkVar.zzc();
                long zzq = ((zzrw) zzsjVar).zza.zzq();
                int length = String.valueOf(zzc).length();
                int length2 = String.valueOf(zzb).length();
                int length3 = String.valueOf(j2).length();
                StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j5).length() + 2 + String.valueOf(zzq).length());
                u.t(sb, "Spurious audio timestamp (system clock mismatch): ", zzc, ", ");
                sb.append(zzb);
                u.t(sb, ", ", j2, ", ");
                sb.append(j5);
                sb.append(", ");
                sb.append(zzq);
                zzee.zzc("AudioTrackAudioOutput", sb.toString());
                zzf(4);
                z4 = zza;
            } else if (Math.abs(zzg - j5) > 5000000) {
                zzsj zzsjVar2 = this.zzc;
                long zzc2 = zzrkVar.zzc();
                long zzq2 = ((zzrw) zzsjVar2).zza.zzq();
                int length4 = String.valueOf(zzc2).length();
                int length5 = String.valueOf(zzb).length();
                int length6 = String.valueOf(j2).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j5).length() + 2;
                z4 = zza;
                StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(zzq2).length());
                u.t(sb2, "Spurious audio timestamp (frame position mismatch): ", zzc2, ", ");
                sb2.append(zzb);
                u.t(sb2, ", ", j2, ", ");
                sb2.append(j5);
                sb2.append(", ");
                sb2.append(zzq2);
                zzee.zzc("AudioTrackAudioOutput", sb2.toString());
                zzf(4);
            } else {
                z4 = zza;
                if (this.zzd == 4) {
                    zzf(0);
                }
            }
        } else {
            z4 = zza;
            i5 = 2;
        }
        int i6 = this.zzd;
        if (i6 == 0) {
            if (!z4) {
                if (j2 - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrkVar.zzb() >= this.zze) {
                    this.zzh = zzrkVar.zzc();
                    this.zzi = zzrkVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i6 != 1) {
            if (i6 == i5) {
                if (z4) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i6 == 3 && z4) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z4) {
            zzf(0);
            return;
        }
        long zzc3 = zzrkVar.zzc();
        long j6 = this.zzh;
        if (zzc3 > j6) {
            if (Math.abs(zzg(j2, f5) - zzh(j6, this.zzi, j2, f5)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j2 - this.zze > 2000000) {
            zzf(3);
        } else {
            this.zzh = zzrkVar.zzc();
            this.zzi = zzrkVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i5 = this.zzd;
        return i5 == 0 || i5 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j2, float f5) {
        return zzg(j2, f5);
    }
}
