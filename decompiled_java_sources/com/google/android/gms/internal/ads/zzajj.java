package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzajj {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i5) {
        int i6 = 0;
        while (i6 < 8) {
            int i7 = i6 + 1;
            if ((zza[i6] & i5) != 0) {
                return i7;
            }
            i6 = i7;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i5, boolean z4) {
        long j2 = bArr[0] & 255;
        if (z4) {
            j2 &= ~zza[i5 - 1];
        }
        for (int i6 = 1; i6 < i5; i6++) {
            j2 = (j2 << 8) | (bArr[i6] & 255);
        }
        return j2;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzaev zzaevVar, boolean z4, boolean z5, int i5) {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzaevVar.zzb(bArr, 0, 1, z4)) {
                return -1L;
            }
            int zzd = zzd(bArr[0] & 255);
            this.zzd = zzd;
            if (zzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i6 = this.zzd;
        if (i6 > i5) {
            this.zzc = 0;
            return -2L;
        }
        if (i6 != 1) {
            zzaevVar.zzc(this.zzb, 1, i6 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z5);
    }

    public final int zzc() {
        return this.zzd;
    }
}
