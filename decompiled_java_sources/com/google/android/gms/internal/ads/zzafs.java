package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzafs {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zza(int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (!zzl(i5) || (i6 = (i5 >>> 19) & 3) == 1 || (i7 = (i5 >>> 17) & 3) == 0 || (i8 = (i5 >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i10 = i8 - 1;
        int i11 = zzb[i9];
        if (i6 == 2) {
            i11 /= 2;
        } else if (i6 == 0) {
            i11 /= 4;
        }
        int i12 = (i5 >>> 9) & 1;
        if (i7 == 3) {
            return ((((i6 == 3 ? zzc[i10] : zzd[i10]) * 12) / i11) + i12) * 4;
        }
        int i13 = i6 == 3 ? i7 == 2 ? zze[i10] : zzf[i10] : zzg[i10];
        if (i6 == 3) {
            return ((i13 * 144) / i11) + i12;
        }
        return (((i7 == 1 ? 72 : 144) * i13) / i11) + i12;
    }

    public static int zzb(int i5) {
        int i6;
        int i7;
        if (!zzl(i5) || (i6 = (i5 >>> 19) & 3) == 1 || (i7 = (i5 >>> 17) & 3) == 0) {
            return -1;
        }
        int i8 = i5 >>> 12;
        int i9 = (i5 >>> 10) & 3;
        int i10 = i8 & 15;
        if (i10 == 0 || i10 == 15 || i9 == 3) {
            return -1;
        }
        return zzm(i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i5) {
        return (i5 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i5, int i6) {
        return i6 != 1 ? i6 != 2 ? 384 : 1152 : i5 == 3 ? 1152 : 576;
    }
}
