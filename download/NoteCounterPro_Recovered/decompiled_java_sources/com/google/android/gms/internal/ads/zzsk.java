package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzsk {
    private boolean zzA;
    private long zzB;
    private final zzsj zza;
    private final zzdn zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzrl zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsk(zzsj zzsjVar, zzdn zzdnVar, AudioTrack audioTrack, int i5, int i6, int i7) {
        this.zza = zzsjVar;
        this.zzb = zzdnVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzrl(audioTrack, zzsjVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zzA = zzfj.zzA(i5);
        this.zzg = zzA;
        this.zzf = zzA ? zzfj.zzr(i7 / i6, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j2) {
        long j5 = this.zzj;
        if (j5 == -9223372036854775807L || j2 < j5) {
            return;
        }
        long zzw = zzfj.zzw(j2 - j5, this.zzi);
        zzdn zzdnVar = this.zzb;
        long zza = zzdnVar.zza() - zzfj.zzp(zzw);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(zza);
    }

    private final long zzh(long j2) {
        long max = Math.max(0L, (this.zzt == 0 ? this.zzu != -9223372036854775807L ? zzfj.zzr(zzl(), this.zze) : zzj() : zzfj.zzv(j2 + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfj.zzr(this.zzx, this.zze), max) : max;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfj.zzr(zzk(), this.zze);
    }

    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long zzb = this.zzb.zzb();
        if (zzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                        this.zzv = -9223372036854775807L;
                    } else if (this.zzv == -9223372036854775807L) {
                        this.zzv = zzb;
                    }
                }
                if (this.zzq > playbackHeadPosition) {
                    this.zzr++;
                }
                this.zzq = playbackHeadPosition;
            }
            this.zzp = zzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfj.zzs(zzfj.zzv(zzfj.zzq(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    public final long zza() {
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzb.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzj = zzj();
                if (zzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfj.zzw(zzj, this.zzi) - zzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i5 = this.zzt;
                    if (i5 < 10) {
                        this.zzt = i5 + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i6 = 0;
                    while (true) {
                        int i7 = this.zzt;
                        if (i6 >= i7) {
                            break;
                        }
                        this.zzk = (jArr[i6] / i7) + this.zzk;
                        i6++;
                    }
                }
            }
            if (this.zzg && (method = this.zzm) != null && zzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = zzfj.zza;
                    long intValue = (num.intValue() * 1000) - this.zzf;
                    this.zzn = intValue;
                    long max = Math.max(intValue, 0L);
                    this.zzn = max;
                    if (max > 5000000) {
                        this.zza.zza(max);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = zzc;
            }
            this.zzh.zza(zzc, this.zzi, zzh(zzc));
        }
        long zzc2 = this.zzb.zzc() / 1000;
        zzrl zzrlVar = this.zzh;
        boolean zzb = zzrlVar.zzb();
        long zze = zzb ? zzrlVar.zze(zzc2, this.zzi) : zzh(zzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zzb || !zzrlVar.zzc()) {
                zzg(zze);
            }
            long j2 = this.zzz;
            if (j2 != -9223372036854775807L) {
                long j5 = zze - this.zzy;
                long zzv = zzfj.zzv(zzc2 - j2, this.zzi);
                long j6 = this.zzy + zzv;
                long abs = Math.abs(j6 - zze);
                if (j5 != 0 && abs < 1000000) {
                    long j7 = (zzv * 10) / 100;
                    zze = Math.max(j6 - j7, Math.min(zze, j6 + j7));
                }
            }
            this.zzz = zzc2;
            this.zzy = zze;
        } else if (playState == 1) {
            zzg(zze);
            return zze;
        }
        return zze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfj.zzq(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j2) {
        return this.zzv != -9223372036854775807L && j2 > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j2) {
        this.zzw = zzk();
        this.zzu = zzfj.zzq(this.zzb.zzb());
        this.zzx = j2;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
