package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzali implements zzalp {
    private final zzalo zza;
    private final long zzb;
    private final long zzc;
    private final zzalt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzali(zzalt zzaltVar, long j2, long j5, long j6, long j7, boolean z4) {
        zzgrc.zza(j2 >= 0 && j5 > j2);
        this.zzd = zzaltVar;
        this.zzb = j2;
        this.zzc = j5;
        if (j6 == j5 - j2 || z4) {
            this.zzf = j7;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzalo();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzalp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzaev zzaevVar) {
        long j2;
        long j5;
        long max;
        int i5 = this.zze;
        if (i5 == 0) {
            long zzn = zzaevVar.zzn();
            this.zzg = zzn;
            this.zze = 1;
            long j6 = this.zzc - 65307;
            if (j6 > zzn) {
                return j6;
            }
        } else if (i5 != 1) {
            if (i5 == 2) {
                long j7 = this.zzi;
                long j8 = this.zzj;
                if (j7 == j8) {
                    max = -1;
                    j5 = -1;
                } else {
                    long zzn2 = zzaevVar.zzn();
                    zzalo zzaloVar = this.zza;
                    if (zzaloVar.zzb(zzaevVar, j8)) {
                        zzaloVar.zzc(zzaevVar, false);
                        zzaevVar.zzl();
                        long j9 = this.zzh;
                        j2 = 2;
                        long j10 = zzaloVar.zzb;
                        long j11 = j9 - j10;
                        int i6 = zzaloVar.zzd + zzaloVar.zze;
                        if (j11 < 0 || j11 >= 72000) {
                            if (j11 < 0) {
                                this.zzj = zzn2;
                                this.zzl = j10;
                            } else {
                                this.zzi = zzaevVar.zzn() + i6;
                                this.zzk = j10;
                            }
                            long j12 = this.zzj;
                            long j13 = this.zzi;
                            long j14 = j12 - j13;
                            if (j14 < 100000) {
                                this.zzj = j13;
                                j5 = -1;
                                max = j13;
                            } else {
                                long zzn3 = zzaevVar.zzn() - (i6 * (j11 <= 0 ? 2L : 1L));
                                j5 = -1;
                                String str = zzfj.zza;
                                max = Math.max(j13, Math.min(((j11 * j14) / (this.zzl - this.zzk)) + zzn3, j12 - 1));
                            }
                        } else {
                            max = -1;
                            j5 = -1;
                        }
                        if (max == j5) {
                            return max;
                        }
                        this.zze = 3;
                    } else {
                        max = this.zzi;
                        if (max == zzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j5 = -1;
                    }
                }
                j2 = 2;
                if (max == j5) {
                }
            } else {
                if (i5 != 3) {
                    return -1L;
                }
                j5 = -1;
                j2 = 2;
            }
            while (true) {
                zzalo zzaloVar2 = this.zza;
                zzaloVar2.zzb(zzaevVar, j5);
                zzaloVar2.zzc(zzaevVar, false);
                if (zzaloVar2.zzb > this.zzh) {
                    zzaevVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j2);
                }
                zzaevVar.zzf(zzaloVar2.zzd + zzaloVar2.zze);
                this.zzi = zzaevVar.zzn();
                this.zzk = zzaloVar2.zzb;
                j5 = -1;
            }
        }
        zzalo zzaloVar3 = this.zza;
        zzaloVar3.zza();
        if (!zzaloVar3.zzb(zzaevVar, -1L)) {
            throw new EOFException();
        }
        zzaloVar3.zzc(zzaevVar, false);
        zzaevVar.zzf(zzaloVar3.zzd + zzaloVar3.zze);
        long j15 = zzaloVar3.zzb;
        while ((zzaloVar3.zza & 4) != 4 && zzaloVar3.zzb(zzaevVar, -1L) && zzaevVar.zzn() < this.zzc && zzaloVar3.zzc(zzaevVar, true) && zzaey.zzd(zzaevVar, zzaloVar3.zzd + zzaloVar3.zze)) {
            j15 = zzaloVar3.zzb;
        }
        this.zzf = j15;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j2) {
        long j5 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j2, j5));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final /* bridge */ /* synthetic */ zzafy zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzalh(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzalt zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
