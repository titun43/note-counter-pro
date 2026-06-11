package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzagw {
    private final zzagv zza;
    private final zzagh zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzagw(int i5, zzagv zzagvVar, zzagh zzaghVar) {
        this.zza = zzagvVar;
        int zzc = zzagvVar.zzc();
        boolean z4 = true;
        if (zzc != 1) {
            if (zzc == 2) {
                zzc = 2;
            } else {
                z4 = false;
            }
        }
        zzgrc.zza(z4);
        this.zzc = zzj(i5, zzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzagvVar.zzd();
        this.zzb = zzaghVar;
        this.zzd = zzc == 2 ? zzj(i5, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzn = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzf = zzagvVar.zzd;
    }

    private final long zzh(int i5) {
        return (this.zze * i5) / this.zzf;
    }

    private final zzafz zzi(int i5) {
        return new zzafz(this.zzn[i5] * zzh(1), this.zzm[i5]);
    }

    private static int zzj(int i5, int i6) {
        return (((i5 % 10) + 48) << 8) | ((i5 / 10) + 48) | i6;
    }

    public final void zza(long j2, boolean z4) {
        if (this.zzl == -1) {
            this.zzl = j2;
        }
        if (z4) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i5 = this.zzk;
            jArr2[i5] = j2;
            this.zzn[i5] = this.zzj;
            this.zzk = i5 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i5;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i5 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i5;
    }

    public final boolean zzc(int i5) {
        return this.zzc == i5 || this.zzd == i5;
    }

    public final void zzd(int i5) {
        this.zzg = i5;
        this.zzh = i5;
    }

    public final boolean zze(zzaev zzaevVar) {
        int i5 = this.zzh;
        zzagh zzaghVar = this.zzb;
        int zza = i5 - zzaghVar.zza(zzaevVar, i5, false);
        this.zzh = zza;
        boolean z4 = zza == 0;
        if (z4) {
            if (this.zzg > 0) {
                zzaghVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z4;
    }

    public final void zzf(long j2) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfj.zzm(this.zzm, j2, true, true)];
        }
    }

    public final zzafw zzg(long j2) {
        if (this.zzk == 0) {
            zzafz zzafzVar = new zzafz(0L, this.zzl);
            return new zzafw(zzafzVar, zzafzVar);
        }
        int zzh = (int) (j2 / zzh(1));
        int zzl = zzfj.zzl(this.zzn, zzh, true, true);
        if (this.zzn[zzl] == zzh) {
            zzafz zzi = zzi(zzl);
            return new zzafw(zzi, zzi);
        }
        zzafz zzi2 = zzi(zzl);
        int i5 = zzl + 1;
        return i5 < this.zzm.length ? new zzafw(zzi2, zzi(i5)) : new zzafw(zzi2, zzi2);
    }
}
