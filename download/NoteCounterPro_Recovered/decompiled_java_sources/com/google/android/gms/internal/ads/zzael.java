package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzael implements zzaev {
    private final zzj zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzal.zzb("media3.extractor");
    }

    public zzael(zzj zzjVar, long j2, long j5) {
        this.zzb = zzjVar;
        this.zzd = j2;
        this.zzc = j5;
    }

    private final void zzp(int i5) {
        int i6 = this.zzf + i5;
        int length = this.zze.length;
        if (i6 > length) {
            String str = zzfj.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i6, Math.min(length + length, i6 + 524288)));
        }
    }

    private final int zzq(int i5) {
        int min = Math.min(this.zzg, i5);
        zzs(min);
        return min;
    }

    private final int zzr(byte[] bArr, int i5, int i6) {
        int i7 = this.zzg;
        if (i7 == 0) {
            return 0;
        }
        int min = Math.min(i7, i6);
        System.arraycopy(this.zze, 0, bArr, i5, min);
        zzs(min);
        return min;
    }

    private final void zzs(int i5) {
        int i6 = this.zzg - i5;
        this.zzg = i6;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i6 < bArr.length + (-524288) ? new byte[65536 + i6] : bArr;
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i5, int i6, int i7, boolean z4) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int zza = this.zzb.zza(bArr, i5 + i7, i6 - i7);
        if (zza != -1) {
            return i7 + zza;
        }
        if (i7 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i5) {
        if (i5 != -1) {
            this.zzd += i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        int zzr = zzr(bArr, i5, i6);
        if (zzr == 0) {
            zzr = zzt(bArr, i5, i6, 0, true);
        }
        zzu(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zzb(byte[] bArr, int i5, int i6, boolean z4) {
        int zzr = zzr(bArr, i5, i6);
        while (zzr < i6 && zzr != -1) {
            zzr = zzt(bArr, i5, i6, zzr, z4);
        }
        zzu(zzr);
        return zzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzc(byte[] bArr, int i5, int i6) {
        zzb(bArr, i5, i6, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zzd(int i5) {
        int zzq = zzq(1);
        if (zzq == 0) {
            zzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(zzq);
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zze(int i5, boolean z4) {
        int zzq = zzq(i5);
        while (zzq < i5 && zzq != -1) {
            zzq = zzt(this.zza, -zzq, Math.min(i5, zzq + 4096), zzq, z4);
        }
        zzu(zzq);
        return zzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzf(int i5) {
        zze(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zzg(byte[] bArr, int i5, int i6) {
        zzael zzaelVar;
        int min;
        zzp(i6);
        int i7 = this.zzg;
        int i8 = this.zzf;
        int i9 = i7 - i8;
        if (i9 == 0) {
            zzaelVar = this;
            min = zzaelVar.zzt(this.zze, i8, i6, 0, true);
            if (min == -1) {
                return -1;
            }
            zzaelVar.zzg += min;
        } else {
            zzaelVar = this;
            min = Math.min(i6, i9);
        }
        System.arraycopy(zzaelVar.zze, zzaelVar.zzf, bArr, i5, min);
        zzaelVar.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zzh(byte[] bArr, int i5, int i6, boolean z4) {
        if (!zzj(i6, z4)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i6, bArr, i5, i6);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzi(byte[] bArr, int i5, int i6) {
        zzh(bArr, i5, i6, false);
    }

    public final boolean zzj(int i5, boolean z4) {
        zzp(i5);
        int i6 = this.zzg - this.zzf;
        while (i6 < i5) {
            int i7 = i5;
            boolean z5 = z4;
            i6 = zzt(this.zze, this.zzf, i7, i6, z5);
            if (i6 == -1) {
                return false;
            }
            this.zzg = this.zzf + i6;
            i5 = i7;
            z4 = z5;
        }
        this.zzf += i5;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzk(int i5) {
        zzj(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return this.zzc;
    }
}
