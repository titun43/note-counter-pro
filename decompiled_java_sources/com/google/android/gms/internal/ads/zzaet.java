package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbgj;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i5) {
        if (i5 == 2147385345 || i5 == -25230976 || i5 == 536864768 || i5 == -14745368) {
            return 1;
        }
        if (i5 == 1683496997 || i5 == 622876772) {
            return 2;
        }
        if (i5 == 1078008818 || i5 == -233094848) {
            return 3;
        }
        return (i5 == 1908687592 || i5 == -398277519) ? 4 : 0;
    }

    public static zzv zzb(byte[] bArr, String str, String str2, int i5, String str3, zzq zzqVar) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(60);
        int i6 = zzb[zzi2.zzj(6)];
        int i7 = zzc[zzi2.zzj(4)];
        int zzj2 = zzi2.zzj(5);
        int i8 = zzj2 >= 29 ? -1 : (zzd[zzj2] * zzbgj.zzq.zzf) / 2;
        zzi2.zzh(10);
        int i9 = i6 + (zzi2.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i8);
        zztVar.zzE(i9);
        zztVar.zzF(i7);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i5);
        return zztVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(byte[] bArr) {
        int i5;
        int i6;
        byte b2;
        int i7;
        int i8;
        int i9;
        byte b5;
        boolean z4 = false;
        byte b6 = bArr[0];
        if (b6 != -2) {
            if (b6 == -1) {
                i8 = (bArr[7] & 3) << 12;
                i9 = (bArr[6] & 255) << 4;
                b5 = bArr[9];
            } else if (b6 != 31) {
                i5 = (bArr[5] & 3) << 12;
                i6 = (bArr[6] & 255) << 4;
                b2 = bArr[7];
            } else {
                i8 = (bArr[6] & 3) << 12;
                i9 = (bArr[7] & 255) << 4;
                b5 = bArr[8];
            }
            i7 = (((b5 & 60) >> 2) | i8 | i9) + 1;
            z4 = true;
            return !z4 ? (i7 * 16) / 14 : i7;
        }
        i5 = (bArr[4] & 3) << 12;
        i6 = (bArr[7] & 255) << 4;
        b2 = bArr[6];
        i7 = (((b2 & 240) >> 4) | i5 | i6) + 1;
        if (!z4) {
        }
    }

    public static zzaes zzd(byte[] bArr) {
        int i5;
        int i6;
        long j2;
        int i7;
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(40);
        int zzj2 = zzi2.zzj(2);
        boolean zzi3 = zzi2.zzi();
        int i8 = true != zzi3 ? 16 : 20;
        zzi2.zzh(true != zzi3 ? 8 : 12);
        int zzj3 = zzi2.zzj(i8) + 1;
        boolean zzi4 = zzi2.zzi();
        int i9 = -1;
        int i10 = 0;
        if (zzi4) {
            i5 = zzi2.zzj(2);
            int zzj4 = zzi2.zzj(3) + 1;
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            int zzj5 = zzi2.zzj(3) + 1;
            int zzj6 = zzi2.zzj(3) + 1;
            if (zzj5 != 1 || zzj6 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i11 = zzj2 + 1;
            int zzj7 = zzi2.zzj(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                if (((zzj7 >> i12) & 1) == 1) {
                    zzi2.zzh(8);
                }
            }
            int i13 = zzj4 * AdRequest.MAX_CONTENT_URL_LENGTH;
            if (zzi2.zzi()) {
                zzi2.zzh(2);
                int zzj8 = (zzi2.zzj(2) + 1) << 2;
                int zzj9 = zzi2.zzj(2) + 1;
                while (i10 < zzj9) {
                    zzi2.zzh(zzj8);
                    i10++;
                }
            }
            i10 = i13;
        } else {
            i5 = -1;
        }
        zzi2.zzh(i8);
        zzi2.zzh(12);
        if (zzi4) {
            if (zzi2.zzi()) {
                zzi2.zzh(4);
            }
            if (zzi2.zzi()) {
                zzi2.zzh(24);
            }
            if (zzi2.zzi()) {
                zzi2.zzo(zzi2.zzj(10) + 1);
            }
            zzi2.zzh(5);
            i6 = zze[zzi2.zzj(4)];
            i9 = zzi2.zzj(8) + 1;
        } else {
            i6 = -2147483647;
        }
        int i14 = i6;
        if (zzi4) {
            if (i5 == 0) {
                i7 = 32000;
            } else if (i5 == 1) {
                i7 = 44100;
            } else {
                if (i5 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(i5);
                    throw zzat.zzb(sb.toString(), null);
                }
                i7 = 48000;
            }
            j2 = zzfj.zzt(i10, 1000000L, i7, RoundingMode.DOWN);
        } else {
            j2 = -9223372036854775807L;
        }
        return new zzaes("audio/vnd.dts.hd;profile=lbr", i9, i14, zzj3, j2, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(42);
        return zzi2.zzj(true != zzi2.zzi() ? 8 : 12) + 1;
    }

    public static zzaes zzf(byte[] bArr, AtomicInteger atomicInteger) {
        long j2;
        int i5;
        AtomicInteger atomicInteger2;
        int i6;
        int i7;
        zzeq zzi2 = zzi(bArr);
        int zzj2 = zzi2.zzj(32);
        int zzh2 = zzh(zzi2, zzf, true);
        int i8 = zzh2 + 1;
        char c5 = zzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c5 == 0) {
            j2 = -9223372036854775807L;
            i5 = -2147483647;
        } else {
            if (!zzi2.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i9 = zzh2 - 1;
            if (((bArr[zzh2] & 255) | ((char) (bArr[i9] << 8))) != zzfj.zzH(bArr, 0, i9, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int zzj3 = zzi2.zzj(2);
            if (zzj3 == 0) {
                i6 = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (zzj3 == 1) {
                i6 = 480;
            } else {
                if (zzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(zzj3);
                    throw zzat.zzb(sb.toString(), null);
                }
                i6 = 384;
            }
            int zzj4 = zzi2.zzj(3) + 1;
            int zzj5 = zzi2.zzj(2);
            if (zzj5 == 0) {
                i7 = 32000;
            } else if (zzj5 == 1) {
                i7 = 44100;
            } else {
                if (zzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(zzj5);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i7 = 48000;
            }
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            i5 = (1 << zzi2.zzj(2)) * i7;
            j2 = zzfj.zzt(i6 * zzj4, 1000000L, i7, RoundingMode.DOWN);
        }
        int i10 = i5;
        long j5 = j2;
        int i11 = 0;
        for (char c6 = 0; c6 < c5; c6 = 1) {
            i11 += zzh(zzi2, zzg, true);
        }
        for (int i12 = 0; i12 <= 0; i12++) {
            if (c5 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzi2, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            i11 += atomicInteger2.get() != 0 ? zzh(zzi2, zzi, true) : 0;
        }
        return new zzaes("audio/vnd.dts.uhd;profile=p2", 2, i10, i8 + i11, j5, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(32);
        return zzh(zzi2, zzj, true) + 1;
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z4) {
        int i5 = 0;
        for (int i6 = 0; i6 < 3 && zzeqVar.zzi(); i6++) {
            i5++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            i7 += 1 << iArr[i8];
        }
        return zzeqVar.zzj(iArr[i5]) + i7;
    }

    private static zzeq zzi(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b5 = copyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i5 = 0; i5 < copyOf.length - 1; i5 += 2) {
                byte b6 = copyOf[i5];
                int i6 = i5 + 1;
                copyOf[i5] = copyOf[i6];
                copyOf[i6] = b6;
            }
        }
        int length = copyOf.length;
        zzeq zzeqVar = new zzeq(copyOf, length);
        if (copyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(copyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(copyOf, copyOf.length);
        return zzeqVar;
    }
}
