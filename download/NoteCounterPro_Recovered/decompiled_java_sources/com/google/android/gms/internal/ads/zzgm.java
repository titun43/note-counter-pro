package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i5) {
        int i6;
        synchronized (zzc) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5) {
                while (true) {
                    try {
                        if (i7 >= i5 - 2) {
                            i7 = i5;
                            break;
                        }
                        int i9 = i7 + 1;
                        if (bArr[i7] == 0 && bArr[i9] == 0 && bArr[i7 + 2] == 3) {
                            break;
                        }
                        i7 = i9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i7 < i5) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i8) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i8] = i7;
                    i7 += 3;
                    i8++;
                }
            }
            i6 = i5 - i8;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = zzd[i12] - i10;
                System.arraycopy(bArr, i10, bArr, i11, i13);
                int i14 = i11 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i11 = i14 + 2;
                bArr[i15] = 0;
                i10 += i13 + 3;
            }
            System.arraycopy(bArr, i10, bArr, i11, i6 - i11);
        }
        return i6;
    }

    public static boolean zzb(zzv zzvVar, byte b2) {
        String zzq = zzq(zzvVar);
        if (Objects.equals(zzq, "video/avc") && (b2 & 31) == 6) {
            return true;
        }
        return Objects.equals(zzq, "video/hevc") && ((b2 & 126) >> 1) == 39;
    }

    public static int zzc(zzv zzvVar) {
        String zzq = zzq(zzvVar);
        if (Objects.equals(zzq, "video/avc")) {
            return 1;
        }
        return Objects.equals(zzq, "video/hevc") ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i5, int i6, zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) != 0) {
                return true;
            }
            int i7 = b2 & 31;
            return (i7 == 1 || i7 == 9 || i7 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzga zzl = zzl(new zzgn(bArr, 4, i6 + 4));
            int i8 = zzl.zza;
            if (i8 == 35) {
                return false;
            }
            return (i8 <= 14 && i8 % 2 == 0 && zzl.zzc == zzvVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgl zze(byte[] bArr, int i5, int i6) {
        int zzg;
        int i7;
        boolean z4;
        int i8;
        int zzg2;
        int i9;
        int zzg3;
        int i10;
        int i11;
        boolean z5;
        boolean zze;
        int i12;
        int i13;
        float f5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zze2;
        boolean zze3;
        int i19;
        zzgn zzgnVar = new zzgn(bArr, i5, i6);
        int zzf = zzgnVar.zzf(8);
        int zzf2 = zzgnVar.zzf(8);
        int zzf3 = zzgnVar.zzf(8);
        int zzg4 = zzgnVar.zzg();
        if (zzf != 100 && zzf != 110 && zzf != 122 && zzf != 244 && zzf != 44 && zzf != 83 && zzf != 86 && zzf != 118 && zzf != 128) {
            if (zzf != 138) {
                zzg = 1;
                i8 = 16;
                i9 = 0;
                z4 = false;
                zzg2 = 0;
                int zzg5 = zzgnVar.zzg() + 4;
                zzg3 = zzgnVar.zzg();
                if (zzg3 != 0) {
                    i11 = zzgnVar.zzg() + 4;
                    i10 = 244;
                } else {
                    if (zzg3 == 1) {
                        boolean zze4 = zzgnVar.zze();
                        zzgnVar.zzh();
                        zzgnVar.zzh();
                        long zzg6 = zzgnVar.zzg();
                        for (int i20 = 0; i20 < zzg6; i20++) {
                            zzgnVar.zzg();
                        }
                        z5 = zze4;
                        zzg3 = 1;
                        i10 = 244;
                        i11 = 0;
                        int zzg7 = zzgnVar.zzg();
                        zzgnVar.zza();
                        int zzg8 = zzgnVar.zzg() + 1;
                        int zzg9 = zzgnVar.zzg() + 1;
                        zze = zzgnVar.zze();
                        int i21 = 2 - (zze ? 1 : 0);
                        if (!zze) {
                            zzgnVar.zza();
                        }
                        zzgnVar.zza();
                        int i22 = zzg8 * 16;
                        int i23 = zzg9 * i21 * 16;
                        if (zzgnVar.zze()) {
                            int zzg10 = zzgnVar.zzg();
                            int zzg11 = zzgnVar.zzg();
                            int zzg12 = zzgnVar.zzg();
                            int zzg13 = zzgnVar.zzg();
                            if (zzg == 0) {
                                i19 = 1;
                            } else {
                                i19 = zzg == 3 ? 1 : 2;
                                i21 *= zzg == 1 ? 2 : 1;
                            }
                            i22 -= (zzg10 + zzg11) * i19;
                            i23 -= (zzg12 + zzg13) * i21;
                        }
                        if (zzf != 44 && zzf != 86 && zzf != 100 && zzf != 110 && zzf != 122) {
                            if (zzf == i10) {
                                zzf = i10;
                            }
                            i12 = i8;
                            float f6 = 1.0f;
                            int i24 = -1;
                            if (zzgnVar.zze()) {
                                i13 = i12;
                                f5 = 1.0f;
                                i14 = -1;
                                i15 = -1;
                            } else {
                                if (zzgnVar.zze()) {
                                    int zzf4 = zzgnVar.zzf(8);
                                    if (zzf4 == 255) {
                                        int i25 = i8;
                                        int zzf5 = zzgnVar.zzf(i25);
                                        int zzf6 = zzgnVar.zzf(i25);
                                        if (zzf5 != 0 && zzf6 != 0) {
                                            f6 = zzf5 / zzf6;
                                        }
                                    } else if (zzf4 < 17) {
                                        f6 = zzb[zzf4];
                                    } else {
                                        i16 = zzg5;
                                        u.r(new StringBuilder(String.valueOf(zzf4).length() + 35), "Unexpected aspect_ratio_idc value: ", zzf4, "NalUnitUtil");
                                        if (zzgnVar.zze()) {
                                            zzgnVar.zza();
                                        }
                                        if (zzgnVar.zze()) {
                                            i17 = -1;
                                            i18 = -1;
                                        } else {
                                            zzgnVar.zzb(3);
                                            int i26 = true != zzgnVar.zze() ? 2 : 1;
                                            if (zzgnVar.zze()) {
                                                int zzf7 = zzgnVar.zzf(8);
                                                int zzf8 = zzgnVar.zzf(8);
                                                zzgnVar.zzb(8);
                                                int zzb2 = zzi.zzb(zzf7);
                                                i18 = zzi.zzc(zzf8);
                                                i17 = zzb2;
                                            } else {
                                                i17 = -1;
                                                i18 = -1;
                                            }
                                            i24 = i26;
                                        }
                                        if (zzgnVar.zze()) {
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                        }
                                        if (zzgnVar.zze()) {
                                            zzgnVar.zzb(65);
                                        }
                                        zze2 = zzgnVar.zze();
                                        if (zze2) {
                                            zzp(zzgnVar);
                                        }
                                        zze3 = zzgnVar.zze();
                                        if (zze3) {
                                            zzp(zzgnVar);
                                        }
                                        if (!zze2 || zze3) {
                                            zzgnVar.zza();
                                        }
                                        zzgnVar.zza();
                                        if (zzgnVar.zze()) {
                                            zzgnVar.zza();
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                            i12 = zzgnVar.zzg();
                                            zzgnVar.zzg();
                                        }
                                        int i27 = i24;
                                        i24 = i17;
                                        zzg5 = i16;
                                        i14 = i27;
                                        i15 = i18;
                                        i13 = i12;
                                        f5 = f6;
                                    }
                                }
                                i16 = zzg5;
                                if (zzgnVar.zze()) {
                                }
                                if (zzgnVar.zze()) {
                                }
                                if (zzgnVar.zze()) {
                                }
                                if (zzgnVar.zze()) {
                                }
                                zze2 = zzgnVar.zze();
                                if (zze2) {
                                }
                                zze3 = zzgnVar.zze();
                                if (zze3) {
                                }
                                if (!zze2) {
                                }
                                zzgnVar.zza();
                                zzgnVar.zza();
                                if (zzgnVar.zze()) {
                                }
                                int i272 = i24;
                                i24 = i17;
                                zzg5 = i16;
                                i14 = i272;
                                i15 = i18;
                                i13 = i12;
                                f5 = f6;
                            }
                            return new zzgl(zzf, zzf2, zzf3, zzg4, zzg7, i22, i23, f5, i9, zzg2, z4, zze, zzg5, zzg3, i11, z5, i24, i14, i15, i13);
                        }
                        if ((zzf2 & 16) != 0) {
                            i12 = 0;
                            float f62 = 1.0f;
                            int i242 = -1;
                            if (zzgnVar.zze()) {
                            }
                            return new zzgl(zzf, zzf2, zzf3, zzg4, zzg7, i22, i23, f5, i9, zzg2, z4, zze, zzg5, zzg3, i11, z5, i242, i14, i15, i13);
                        }
                        i12 = i8;
                        float f622 = 1.0f;
                        int i2422 = -1;
                        if (zzgnVar.zze()) {
                        }
                        return new zzgl(zzf, zzf2, zzf3, zzg4, zzg7, i22, i23, f5, i9, zzg2, z4, zze, zzg5, zzg3, i11, z5, i2422, i14, i15, i13);
                    }
                    i10 = 244;
                    i11 = 0;
                }
                z5 = false;
                int zzg72 = zzgnVar.zzg();
                zzgnVar.zza();
                int zzg82 = zzgnVar.zzg() + 1;
                int zzg92 = zzgnVar.zzg() + 1;
                zze = zzgnVar.zze();
                int i212 = 2 - (zze ? 1 : 0);
                if (!zze) {
                }
                zzgnVar.zza();
                int i222 = zzg82 * 16;
                int i232 = zzg92 * i212 * 16;
                if (zzgnVar.zze()) {
                }
                if (zzf != 44) {
                    if (zzf == i10) {
                    }
                    i12 = i8;
                    float f6222 = 1.0f;
                    int i24222 = -1;
                    if (zzgnVar.zze()) {
                    }
                    return new zzgl(zzf, zzf2, zzf3, zzg4, zzg72, i222, i232, f5, i9, zzg2, z4, zze, zzg5, zzg3, i11, z5, i24222, i14, i15, i13);
                }
                if ((zzf2 & 16) != 0) {
                }
                i12 = i8;
                float f62222 = 1.0f;
                int i242222 = -1;
                if (zzgnVar.zze()) {
                }
                return new zzgl(zzf, zzf2, zzf3, zzg4, zzg72, i222, i232, f5, i9, zzg2, z4, zze, zzg5, zzg3, i11, z5, i242222, i14, i15, i13);
            }
            zzf = 138;
        }
        zzg = zzgnVar.zzg();
        if (zzg == 3) {
            z4 = zzgnVar.zze();
            i7 = 3;
        } else {
            i7 = zzg;
            z4 = false;
        }
        i8 = 16;
        int zzg14 = zzgnVar.zzg();
        zzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        if (zzgnVar.zze()) {
            int i28 = i7 != 3 ? 8 : 12;
            int i29 = 0;
            while (i29 < i28) {
                if (zzgnVar.zze()) {
                    int i30 = i29 < 6 ? 16 : 64;
                    int i31 = 8;
                    int i32 = 8;
                    for (int i33 = 0; i33 < i30; i33++) {
                        if (i31 != 0) {
                            i31 = ((zzgnVar.zzh() + i32) + 256) % 256;
                        }
                        if (i31 != 0) {
                            i32 = i31;
                        }
                    }
                }
                i29++;
            }
        }
        i9 = zzg14;
        int zzg52 = zzgnVar.zzg() + 4;
        zzg3 = zzgnVar.zzg();
        if (zzg3 != 0) {
        }
        z5 = false;
        int zzg722 = zzgnVar.zzg();
        zzgnVar.zza();
        int zzg822 = zzgnVar.zzg() + 1;
        int zzg922 = zzgnVar.zzg() + 1;
        zze = zzgnVar.zze();
        int i2122 = 2 - (zze ? 1 : 0);
        if (!zze) {
        }
        zzgnVar.zza();
        int i2222 = zzg822 * 16;
        int i2322 = zzg922 * i2122 * 16;
        if (zzgnVar.zze()) {
        }
        if (zzf != 44) {
        }
        if ((zzf2 & 16) != 0) {
        }
        i12 = i8;
        float f622222 = 1.0f;
        int i2422222 = -1;
        if (zzgnVar.zze()) {
        }
        return new zzgl(zzf, zzf2, zzf3, zzg4, zzg722, i2222, i2322, f5, i9, zzg2, z4, zze, zzg52, zzg3, i11, z5, i2422222, i14, i15, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgj zzf(byte[] bArr, int i5, int i6) {
        int i7;
        int[] iArr;
        zzgi zzgiVar;
        boolean z4;
        int i8;
        zzga zzgaVar;
        int i9;
        int i10;
        int i11;
        zzguf zzgufVar;
        boolean[][] zArr;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean[][] zArr2;
        int[] iArr2;
        boolean[][] zArr3;
        int[] iArr3;
        int i16;
        int i17;
        int i18;
        boolean zze;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int zzg;
        int i24;
        int i25;
        boolean z5;
        boolean z6;
        zzgn zzgnVar = new zzgn(bArr, i5, i6);
        zzga zzl = zzl(zzgnVar);
        zzgnVar.zzb(4);
        boolean zze2 = zzgnVar.zze();
        boolean zze3 = zzgnVar.zze();
        int zzf = zzgnVar.zzf(6);
        int i26 = zzf + 1;
        int zzf2 = zzgnVar.zzf(3);
        zzgnVar.zzb(17);
        zzgb zzm = zzm(zzgnVar, true, zzf2, null);
        for (int i27 = true != zzgnVar.zze() ? zzf2 : 0; i27 <= zzf2; i27++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zzg();
        }
        int zzf3 = zzgnVar.zzf(6);
        int zzg2 = zzgnVar.zzg() + 1;
        int i28 = 6;
        zzgc zzgcVar = new zzgc(zzguf.zzj(zzm), new int[1]);
        boolean z7 = i26 >= 2 && zzg2 >= 2;
        boolean z8 = zze2 && zze3;
        int i29 = 1;
        int i30 = zzf3 + 1;
        if (!z7 || !z8 || i30 < i26) {
            return new zzgj(zzl, null, zzgcVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, zzg2, i30);
        int[] iArr5 = new int[zzg2];
        int[] iArr6 = new int[zzg2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i31 = 1; i31 < zzg2; i31++) {
            int i32 = 0;
            for (int i33 = 0; i33 <= zzf3; i33++) {
                if (zzgnVar.zze()) {
                    iArr4[i31][i32] = i33;
                    iArr6[i31] = i33;
                    i32++;
                }
                iArr5[i31] = i32;
            }
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzb(64);
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
            }
            int zzg3 = zzgnVar.zzg();
            int i34 = 0;
            while (i34 < zzg3) {
                zzgnVar.zzg();
                if (i34 == 0 || zzgnVar.zze()) {
                    boolean zze4 = zzgnVar.zze();
                    boolean zze5 = zzgnVar.zze();
                    if (zze4 || zze5) {
                        zze = zzgnVar.zze();
                        i19 = zzg3;
                        if (zze) {
                            zzgnVar.zzb(19);
                        }
                        zzgnVar.zzb(8);
                        if (zze) {
                            zzgnVar.zzb(4);
                        }
                        zzgnVar.zzb(15);
                        i21 = zze4;
                        i20 = zze5;
                        i22 = 0;
                        while (i22 <= zzf2) {
                            if (zzgnVar.zze() || zzgnVar.zze()) {
                                zzgnVar.zzg();
                            } else if (zzgnVar.zze()) {
                                i23 = i22;
                                zzg = 0;
                                zzga zzgaVar2 = zzl;
                                i24 = i21 + i20;
                                int[][] iArr7 = iArr4;
                                i25 = 0;
                                while (i25 < i24) {
                                    int i35 = i24;
                                    for (int i36 = 0; i36 <= zzg; i36++) {
                                        zzgnVar.zzg();
                                        zzgnVar.zzg();
                                        if (zze) {
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                        }
                                        zzgnVar.zza();
                                    }
                                    i25++;
                                    i24 = i35;
                                }
                                i22 = i23 + 1;
                                zzl = zzgaVar2;
                                iArr4 = iArr7;
                            }
                            i23 = i22;
                            zzg = zzgnVar.zzg();
                            zzga zzgaVar22 = zzl;
                            i24 = i21 + i20;
                            int[][] iArr72 = iArr4;
                            i25 = 0;
                            while (i25 < i24) {
                            }
                            i22 = i23 + 1;
                            zzl = zzgaVar22;
                            iArr4 = iArr72;
                        }
                        i34++;
                        zzg3 = i19;
                    } else {
                        i19 = zzg3;
                        z6 = zze4;
                        z5 = zze5;
                    }
                } else {
                    i19 = zzg3;
                    z6 = false;
                    z5 = false;
                }
                zze = false;
                i21 = z6;
                i20 = z5;
                i22 = 0;
                while (i22 <= zzf2) {
                }
                i34++;
                zzg3 = i19;
            }
        }
        zzga zzgaVar3 = zzl;
        int[][] iArr8 = iArr4;
        if (!zzgnVar.zze()) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        zzgnVar.zzc();
        zzgb zzm2 = zzm(zzgnVar, false, zzf2, zzm);
        boolean zze6 = zzgnVar.zze();
        boolean[] zArr4 = new boolean[16];
        int i37 = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            boolean zze7 = zzgnVar.zze();
            zArr4[i38] = zze7;
            if (zze7) {
                i37++;
            }
        }
        if (i37 == 0 || !zArr4[1]) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int i39 = i37 + 1;
        int[] iArr9 = new int[i37];
        for (int i40 = 0; i40 < i37 - (zze6 ? 1 : 0); i40++) {
            iArr9[i40] = zzgnVar.zzf(3);
        }
        int[] iArr10 = new int[i39];
        if (zze6) {
            for (int i41 = 1; i41 < i37; i41++) {
                for (int i42 = 0; i42 < i41; i42++) {
                    iArr10[i41] = iArr9[i42] + 1 + iArr10[i41];
                }
            }
            iArr10[i37] = 6;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i26, i37);
        int[] iArr12 = new int[i26];
        iArr12[0] = 0;
        boolean zze8 = zzgnVar.zze();
        int i43 = 1;
        while (i43 < i26) {
            if (zze8) {
                iArr12[i43] = zzgnVar.zzf(i28);
            } else {
                iArr12[i43] = i43;
            }
            if (zze6) {
                i18 = i43;
                for (int i44 = 0; i44 < i37; i44++) {
                    iArr11[i18][i44] = (iArr12[i18] & ((1 << iArr10[r31]) - 1)) >> iArr10[i44];
                }
            } else {
                int i45 = 0;
                while (i45 < i37) {
                    iArr11[i43][i45] = zzgnVar.zzf(iArr9[i45] + 1);
                    i45++;
                    i43 = i43;
                }
                i18 = i43;
            }
            i43 = i18 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i30];
        int i46 = 1;
        int i47 = 0;
        while (i47 < i26) {
            iArr13[iArr12[i47]] = -1;
            int[] iArr14 = iArr13;
            int i48 = 0;
            int i49 = 0;
            while (i48 < 16) {
                if (zArr4[i48]) {
                    i17 = i29;
                    if (i48 == i17) {
                        iArr14[iArr12[i47]] = iArr11[i47][i49];
                        i48 = i17;
                    }
                    i49++;
                } else {
                    i17 = i29;
                }
                i48 += i17;
                i29 = i17;
            }
            if (i47 > 0) {
                int i50 = 0;
                while (true) {
                    if (i50 >= i47) {
                        i46++;
                        break;
                    }
                    if (iArr14[iArr12[i47]] == iArr14[iArr12[i50]]) {
                        break;
                    }
                    i50++;
                }
            }
            i47++;
            iArr13 = iArr14;
            i29 = 1;
        }
        int[] iArr15 = iArr13;
        int zzf4 = zzgnVar.zzf(4);
        if (i46 < 2 || zzf4 == 0) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int[] iArr16 = new int[i46];
        for (int i51 = 0; i51 < i46; i51++) {
            iArr16[i51] = zzgnVar.zzf(zzf4);
        }
        int[] iArr17 = new int[i30];
        for (int i52 = 0; i52 < i26; i52++) {
            iArr17[Math.min(iArr12[i52], zzf3)] = i52;
        }
        zzguc zzgucVar = new zzguc();
        int i53 = 0;
        while (i53 <= zzf3) {
            int[] iArr18 = iArr16;
            int i54 = i46;
            int min = Math.min(iArr15[i53], i54 - 1);
            int[] iArr19 = iArr17;
            zzgucVar.zzf(new zzfz(iArr19[i53], min >= 0 ? iArr18[min] : -1));
            i53++;
            i46 = i54;
            iArr16 = iArr18;
            iArr17 = iArr19;
        }
        zzguf zzi = zzgucVar.zzi();
        if (((zzfz) zzi.get(0)).zzb == -1) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int i55 = 1;
        while (true) {
            zzga zzgaVar4 = zzgaVar3;
            if (i55 > zzf3) {
                zzgaVar3 = zzgaVar4;
                i7 = -1;
                i55 = -1;
                break;
            }
            zzgaVar3 = zzgaVar4;
            i7 = -1;
            if (((zzfz) zzi.get(i55)).zzb != -1) {
                break;
            }
            i55++;
        }
        if (i55 == i7) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i26, i26);
        boolean[][] zArr6 = (boolean[][]) Array.newInstance((Class<?>) cls2, i26, i26);
        int i56 = 1;
        while (i56 < i26) {
            boolean[][] zArr7 = zArr6;
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr8 = zArr5[i56];
                boolean[] zArr9 = zArr7[i56];
                boolean zze9 = zzgnVar.zze();
                zArr9[i57] = zze9;
                zArr8[i57] = zze9;
            }
            i56++;
            zArr6 = zArr7;
        }
        boolean[][] zArr10 = zArr6;
        for (int i58 = 1; i58 < i26; i58++) {
            int i59 = 0;
            while (i59 < zzf) {
                int i60 = i59;
                int i61 = 0;
                while (true) {
                    if (i61 < i58) {
                        boolean[] zArr11 = zArr10[i58];
                        if (zArr11[i61] && zArr10[i61][i60]) {
                            zArr11[i60] = true;
                            break;
                        }
                        i61++;
                    }
                }
                i59 = i60 + 1;
            }
        }
        int[] iArr20 = new int[i30];
        int i62 = 0;
        while (i62 < i26) {
            int[] iArr21 = iArr20;
            int i63 = 0;
            for (int i64 = 0; i64 < i62; i64++) {
                i63 += zArr5[i62][i64] ? 1 : 0;
            }
            iArr21[iArr12[i62]] = i63;
            i62++;
            iArr20 = iArr21;
        }
        int[] iArr22 = iArr20;
        int i65 = 0;
        for (int i66 = 0; i66 < i26; i66++) {
            if (iArr22[iArr12[i66]] == 0) {
                i65++;
            }
        }
        if (i65 > 1) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int[] iArr23 = new int[i26];
        int[] iArr24 = new int[zzg2];
        if (zzgnVar.zze()) {
            iArr = iArr24;
            int i67 = 0;
            while (i67 < i26) {
                int i68 = i67;
                iArr23[i68] = zzgnVar.zzf(3);
                i67 = i68 + 1;
            }
        } else {
            iArr = iArr24;
            Arrays.fill(iArr23, 0, i26, zzf2);
        }
        int i69 = 0;
        while (i69 < zzg2) {
            int[] iArr25 = iArr23;
            int i70 = i69;
            int[] iArr26 = iArr12;
            int i71 = 0;
            for (int i72 = 0; i72 < iArr5[i70]; i72++) {
                i71 = Math.max(i71, iArr25[((zzfz) zzi.get(iArr8[i70][i72])).zza]);
            }
            iArr[i70] = i71 + 1;
            i69 = i70 + 1;
            iArr23 = iArr25;
            iArr12 = iArr26;
        }
        int[] iArr27 = iArr12;
        if (zzgnVar.zze()) {
            int i73 = 0;
            while (i73 < zzf) {
                int i74 = i73 + 1;
                int i75 = i74;
                while (i75 < i26) {
                    if (zArr5[i75][i73]) {
                        i16 = i73;
                        zzgnVar.zzb(3);
                    } else {
                        i16 = i73;
                    }
                    i75++;
                    i73 = i16;
                }
                i73 = i74;
            }
        }
        zzgnVar.zza();
        int zzg4 = zzgnVar.zzg() + 1;
        zzguc zzgucVar2 = new zzguc();
        zzgucVar2.zzf(zzm);
        if (zzg4 > 1) {
            zzgucVar2.zzf(zzm2);
            for (int i76 = 2; i76 < zzg4; i76++) {
                zzm2 = zzm(zzgnVar, zzgnVar.zze(), zzf2, zzm2);
                zzgucVar2.zzf(zzm2);
            }
        }
        zzguf zzi2 = zzgucVar2.zzi();
        int zzg5 = zzgnVar.zzg() + zzg2;
        if (zzg5 > zzg2) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int zzf5 = zzgnVar.zzf(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, zzg5, i30);
        int[] iArr28 = new int[zzg5];
        int i77 = 0;
        int[] iArr29 = new int[zzg5];
        int i78 = 0;
        while (i78 < zzg2) {
            iArr28[i78] = i77;
            int i79 = i78;
            int i80 = iArr6[i79];
            iArr29[i79] = i80;
            if (zzf5 == 0) {
                iArr2 = iArr6;
                zArr3 = zArr12;
                iArr3 = iArr28;
                Arrays.fill(zArr12[i79], i77, iArr5[i79], true);
                iArr3[i79] = iArr5[i79];
            } else {
                iArr2 = iArr6;
                zArr3 = zArr12;
                iArr3 = iArr28;
                if (zzf5 == 1) {
                    for (int i81 = 0; i81 < iArr5[i79]; i81++) {
                        zArr3[i79][i81] = iArr8[i79][i81] == i80;
                    }
                    iArr3[i79] = 1;
                } else {
                    i77 = 0;
                    zArr3[0][0] = true;
                    iArr3[0] = 1;
                    i78 = i79 + 1;
                    iArr6 = iArr2;
                    zArr12 = zArr3;
                    iArr28 = iArr3;
                }
            }
            i77 = 0;
            i78 = i79 + 1;
            iArr6 = iArr2;
            zArr12 = zArr3;
            iArr28 = iArr3;
        }
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i30];
        int i82 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i30;
        iArr32[i77] = zzg5;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i83 = 1;
        int i84 = 0;
        while (i83 < zzg5) {
            if (zzf5 == i82) {
                for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                    zArr13[i83][i85] = zzgnVar.zze();
                    int i86 = iArr30[i83];
                    boolean z9 = zArr13[i83][i85];
                    iArr30[i83] = i86 + (z9 ? 1 : 0);
                    if (z9) {
                        iArr29[i83] = iArr8[i83][i85];
                    }
                }
            }
            if (i84 == 0) {
                i13 = 0;
                if (iArr8[i83][0] == 0 && zArr13[i83][0]) {
                    i84 = 0;
                    for (int i87 = 1; i87 < iArr5[i83]; i87++) {
                        if (iArr8[i83][i87] == i55 && zArr13[i83][i55]) {
                            i84 = i83;
                        }
                    }
                } else {
                    i84 = 0;
                }
            } else {
                i13 = 0;
            }
            int i88 = i13;
            while (i88 < iArr5[i83]) {
                if (zzg4 > 1) {
                    zArr14[i83][i88] = zArr13[i83][i88];
                    zArr2 = zArr5;
                    i14 = zzg4;
                    int zzc2 = zzgxp.zzc(zzg4, RoundingMode.CEILING);
                    if (!zArr14[i83][i88]) {
                        int i89 = ((zzfz) zzi.get(iArr8[i83][i88])).zza;
                        int i90 = i13;
                        while (i90 < i88) {
                            i15 = zzf5;
                            if (zArr10[i89][((zzfz) zzi.get(iArr8[i83][i90])).zza]) {
                                zArr14[i83][i88] = true;
                                break;
                            }
                            i90++;
                            zzf5 = i15;
                        }
                    }
                    i15 = zzf5;
                    if (zArr14[i83][i88]) {
                        if (i84 <= 0 || i83 != i84) {
                            zzgnVar.zzb(zzc2);
                        } else {
                            iArr31[i88] = zzgnVar.zzf(zzc2);
                        }
                    }
                } else {
                    i14 = zzg4;
                    i15 = zzf5;
                    zArr2 = zArr5;
                }
                i88++;
                zArr5 = zArr2;
                zzg4 = i14;
                zzf5 = i15;
            }
            int i91 = zzg4;
            int i92 = zzf5;
            boolean[][] zArr15 = zArr5;
            if (iArr30[i83] == 1 && iArr22[iArr29[i83]] > 0) {
                zzgnVar.zza();
            }
            i83++;
            zArr5 = zArr15;
            zzg4 = i91;
            zzf5 = i92;
            i82 = 2;
        }
        boolean[][] zArr16 = zArr5;
        if (i84 == 0) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        zzga zzgaVar5 = zzgaVar3;
        int zzg6 = zzgnVar.zzg();
        int i93 = zzg6 + 1;
        zzguc zzv = zzguf.zzv(i93);
        int[] iArr33 = new int[i26];
        int i94 = 0;
        while (i94 < i93) {
            int zzf6 = zzgnVar.zzf(16);
            zzguf zzgufVar2 = zzi;
            int zzf7 = zzgnVar.zzf(16);
            if (zzgnVar.zze()) {
                zzgaVar = zzgaVar5;
                i9 = zzgnVar.zzf(2);
                if (i9 == 3) {
                    zzgnVar.zza();
                }
                i10 = zzgnVar.zzf(4);
                i11 = zzgnVar.zzf(4);
            } else {
                zzgaVar = zzgaVar5;
                i9 = 0;
                i10 = 0;
                i11 = 0;
            }
            if (zzgnVar.zze()) {
                int zzg7 = zzgnVar.zzg();
                zArr = zArr14;
                int zzg8 = zzgnVar.zzg();
                i12 = i94;
                int zzg9 = zzgnVar.zzg();
                zzgufVar = zzi2;
                int zzg10 = zzgnVar.zzg();
                zzf6 = zzn(zzf6, i9, zzg7, zzg8);
                zzf7 = zzo(zzf7, i9, zzg9, zzg10);
            } else {
                zzgufVar = zzi2;
                zArr = zArr14;
                i12 = i94;
            }
            zzv.zzf(new zzgd(i9, i10, i11, zzf6, zzf7));
            i94 = i12 + 1;
            zzi = zzgufVar2;
            zArr14 = zArr;
            zzgaVar5 = zzgaVar;
            zzi2 = zzgufVar;
        }
        zzguf zzgufVar3 = zzi;
        zzga zzgaVar6 = zzgaVar5;
        zzguf zzgufVar4 = zzi2;
        boolean[][] zArr17 = zArr14;
        if (i93 <= 1 || !zzgnVar.zze()) {
            for (int i95 = 1; i95 < i26; i95++) {
                iArr33[i95] = Math.min(i95, zzg6);
            }
        } else {
            int zzc3 = zzgxp.zzc(i93, RoundingMode.CEILING);
            for (int i96 = 1; i96 < i26; i96++) {
                iArr33[i96] = zzgnVar.zzf(zzc3);
            }
        }
        zzge zzgeVar = new zzge(zzv.zzi(), iArr33);
        zzgnVar.zzb(2);
        for (int i97 = 1; i97 < i26; i97++) {
            if (iArr22[iArr27[i97]] == 0) {
                zzgnVar.zza();
            }
        }
        for (int i98 = 1; i98 < zzg5; i98++) {
            boolean zze10 = zzgnVar.zze();
            int i99 = 0;
            while (i99 < iArr[i98]) {
                if ((i99 <= 0 || !zze10) ? i99 == 0 : zzgnVar.zze()) {
                    for (int i100 = 0; i100 < iArr5[i98]; i100++) {
                        if (zArr17[i98][i100]) {
                            zzgnVar.zzg();
                        }
                    }
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                i99++;
            }
        }
        int zzg11 = zzgnVar.zzg() + 2;
        if (zzgnVar.zze()) {
            zzgnVar.zzb(zzg11);
        } else {
            for (int i101 = 1; i101 < i26; i101++) {
                for (int i102 = 0; i102 < i101; i102++) {
                    if (zArr16[i101][i102]) {
                        zzgnVar.zzb(zzg11);
                    }
                }
            }
        }
        int zzg12 = zzgnVar.zzg();
        for (int i103 = 1; i103 <= zzg12; i103++) {
            zzgnVar.zzb(8);
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzc();
            if (zzgnVar.zze() || zzgnVar.zze()) {
                zzgnVar.zza();
            }
            boolean zze11 = zzgnVar.zze();
            boolean zze12 = zzgnVar.zze();
            if (zze11 || zze12) {
                for (int i104 = 0; i104 < zzg2; i104++) {
                    for (int i105 = 0; i105 < iArr[i104]; i105++) {
                        boolean zze13 = zze11 ? zzgnVar.zze() : false;
                        boolean zze14 = zze12 ? zzgnVar.zze() : false;
                        if (zze13) {
                            zzgnVar.zzb(32);
                        }
                        if (zze14) {
                            zzgnVar.zzb(18);
                        }
                    }
                }
            }
            boolean zze15 = zzgnVar.zze();
            if (zze15) {
                z4 = true;
                i8 = zzgnVar.zzf(4) + 1;
            } else {
                z4 = true;
                i8 = i26;
            }
            zzguc zzv2 = zzguf.zzv(i8);
            int[] iArr34 = new int[i26];
            int i106 = 0;
            while (i106 < i8) {
                zzgnVar.zzb(3);
                int i107 = z4 != zzgnVar.zze() ? 2 : 1;
                int zzb2 = zzi.zzb(zzgnVar.zzf(8));
                int zzc4 = zzi.zzc(zzgnVar.zzf(8));
                zzgnVar.zzb(8);
                zzv2.zzf(new zzgh(zzb2, i107, zzc4));
                i106++;
                z4 = true;
            }
            if (zze15 && i8 > 1) {
                for (int i108 = 0; i108 < i26; i108++) {
                    iArr34[i108] = zzgnVar.zzf(4);
                }
            }
            zzgiVar = new zzgi(zzv2.zzi(), iArr34);
        } else {
            zzgiVar = null;
        }
        return new zzgj(zzgaVar6, zzgufVar3, new zzgc(zzgufVar4, iArr31), zzgeVar, zzgiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgg zzg(byte[] bArr, int i5, int i6, zzgj zzgjVar) {
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzg;
        int i11;
        int i12;
        int i13;
        int i14;
        int zzg2;
        int i15;
        int i16;
        int i17;
        int i18;
        int zzg3;
        int i19;
        float f5;
        zzgb zzgbVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzgi zzgiVar;
        int i30;
        int i31;
        zzga zzgaVar;
        int i32;
        int i33;
        int i34;
        zzge zzgeVar;
        zzga zzl = zzl(new zzgn(bArr, i5, i6));
        zzgn zzgnVar = new zzgn(bArr, i5 + 2, i6);
        zzgnVar.zzb(4);
        int zzf = zzgnVar.zzf(3);
        int i35 = zzl.zzb;
        if (i35 == 0 || zzf != 7) {
            z4 = false;
        } else {
            zzf = 7;
            z4 = true;
        }
        if (zzgjVar != null) {
            zzguf zzgufVar = zzgjVar.zza;
            if (!zzgufVar.isEmpty()) {
                i7 = ((zzfz) zzgufVar.get(Math.min(i35, zzgufVar.size() - 1))).zza;
                zzgb zzgbVar2 = null;
                if (z4) {
                    zzgnVar.zza();
                    zzgbVar2 = zzm(zzgnVar, true, zzf, null);
                } else if (zzgjVar != null) {
                    zzgc zzgcVar = zzgjVar.zzb;
                    int i36 = zzgcVar.zzb[i7];
                    zzguf zzgufVar2 = zzgcVar.zza;
                    if (zzgufVar2.size() > i36) {
                        zzgbVar2 = (zzgb) zzgufVar2.get(i36);
                    }
                }
                int zzg4 = zzgnVar.zzg();
                if (z4) {
                    int zzg5 = zzgnVar.zzg();
                    if (zzg5 == 3) {
                        zzgnVar.zza();
                        i8 = 3;
                    } else {
                        i8 = zzg5;
                    }
                    int zzg6 = zzgnVar.zzg();
                    int zzg7 = zzgnVar.zzg();
                    if (zzgnVar.zze()) {
                        int zzg8 = zzgnVar.zzg();
                        int zzg9 = zzgnVar.zzg();
                        int zzg10 = zzgnVar.zzg();
                        int zzg11 = zzgnVar.zzg();
                        i10 = zzn(zzg6, i8, zzg8, zzg9);
                        i9 = zzo(zzg7, i8, zzg10, zzg11);
                    } else {
                        i9 = zzg7;
                        i10 = zzg6;
                    }
                    zzg = zzgnVar.zzg();
                    i11 = i9;
                    i12 = zzg7;
                    i13 = i10;
                    i14 = zzg6;
                    zzg2 = zzgnVar.zzg();
                    i15 = zzg5;
                } else {
                    int zzf2 = zzgnVar.zze() ? zzgnVar.zzf(8) : -1;
                    if (zzgjVar != null && (zzgeVar = zzgjVar.zzc) != null) {
                        if (zzf2 == -1) {
                            zzf2 = zzgeVar.zzb[i7];
                        }
                        if (zzf2 != -1) {
                            zzguf zzgufVar3 = zzgeVar.zza;
                            if (zzgufVar3.size() > zzf2) {
                                zzgd zzgdVar = (zzgd) zzgufVar3.get(zzf2);
                                int i37 = zzgdVar.zza;
                                i13 = zzgdVar.zzd;
                                i11 = zzgdVar.zze;
                                zzg = zzgdVar.zzb;
                                zzg2 = zzgdVar.zzc;
                                i15 = i37;
                                i12 = i11;
                                i14 = i13;
                            }
                        }
                    }
                    i12 = 0;
                    i14 = 0;
                    zzg = 0;
                    i15 = 0;
                    zzg2 = 0;
                    i11 = 0;
                    i13 = 0;
                }
                int zzg12 = zzgnVar.zzg();
                if (z4) {
                    i16 = i12;
                    i17 = i14;
                    i18 = -1;
                    for (int i38 = true != zzgnVar.zze() ? zzf : 0; i38 <= zzf; i38++) {
                        zzgnVar.zzg();
                        i18 = Math.max(zzgnVar.zzg(), i18);
                        zzgnVar.zzg();
                    }
                } else {
                    i16 = i12;
                    i17 = i14;
                    i18 = -1;
                }
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                if (zzgnVar.zze()) {
                    if (z4 && zzgnVar.zze()) {
                        zzgnVar.zzb(6);
                    } else if (zzgnVar.zze()) {
                        int i39 = 4;
                        int i40 = 0;
                        while (i40 < i39) {
                            int i41 = i39;
                            int i42 = i18;
                            for (int i43 = 0; i43 < 6; i43 = i34 + (i40 == 3 ? 3 : 1)) {
                                if (zzgnVar.zze()) {
                                    i34 = i43;
                                    int min = Math.min(64, 1 << ((i40 + i40) + 4));
                                    if (i40 > 1) {
                                        zzgnVar.zzh();
                                    }
                                    for (int i44 = 0; i44 < min; i44++) {
                                        zzgnVar.zzh();
                                    }
                                } else {
                                    zzgnVar.zzg();
                                    i34 = i43;
                                }
                            }
                            i40++;
                            i18 = i42;
                            i39 = i41;
                        }
                    }
                }
                int i45 = i18;
                zzgnVar.zzb(2);
                if (zzgnVar.zze()) {
                    zzgnVar.zzb(8);
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    zzgnVar.zza();
                }
                zzg3 = zzgnVar.zzg();
                i19 = 0;
                int[] iArr = new int[0];
                int i46 = zzf;
                int[] iArr2 = new int[0];
                int i47 = zzg;
                int i48 = -1;
                int i49 = -1;
                while (i19 < zzg3) {
                    if (i19 == 0 || !zzgnVar.zze()) {
                        i30 = zzg3;
                        i31 = i19;
                        zzgaVar = zzl;
                        i32 = i7;
                        int zzg13 = zzgnVar.zzg();
                        int zzg14 = zzgnVar.zzg();
                        int[] iArr3 = new int[zzg13];
                        int i50 = 0;
                        while (i50 < zzg13) {
                            iArr3[i50] = (i50 > 0 ? iArr3[i50 - 1] : 0) - (zzgnVar.zzg() + 1);
                            zzgnVar.zza();
                            i50++;
                        }
                        int[] iArr4 = new int[zzg14];
                        int i51 = 0;
                        while (i51 < zzg14) {
                            iArr4[i51] = zzgnVar.zzg() + 1 + (i51 > 0 ? iArr4[i51 - 1] : 0);
                            zzgnVar.zza();
                            i51++;
                        }
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i48 = zzg13;
                        i49 = zzg14;
                    } else {
                        i30 = zzg3;
                        int i52 = i48 + i49;
                        boolean zze = zzgnVar.zze();
                        boolean z5 = true;
                        int zzg15 = zzgnVar.zzg() + 1;
                        int i53 = 1 - ((zze ? 1 : 0) + (zze ? 1 : 0));
                        i31 = i19;
                        int i54 = i52 + 1;
                        zzgaVar = zzl;
                        boolean[] zArr = new boolean[i54];
                        int i55 = 0;
                        while (i55 <= i52) {
                            if (zzgnVar.zze()) {
                                zArr[i55] = z5;
                            } else {
                                zArr[i55] = zzgnVar.zze();
                            }
                            i55++;
                            z5 = true;
                        }
                        int i56 = i49 - 1;
                        int[] iArr5 = new int[i54];
                        int[] iArr6 = new int[i54];
                        int i57 = 0;
                        while (true) {
                            i33 = i53 * zzg15;
                            if (i56 < 0) {
                                break;
                            }
                            int i58 = iArr2[i56] + i33;
                            if (i58 < 0 && zArr[i48 + i56]) {
                                iArr5[i57] = i58;
                                i57++;
                            }
                            i56--;
                        }
                        if (i33 < 0 && zArr[i52]) {
                            iArr5[i57] = i33;
                            i57++;
                        }
                        i32 = i7;
                        int i59 = i57;
                        for (int i60 = 0; i60 < i48; i60++) {
                            int i61 = iArr[i60] + i33;
                            if (i61 < 0 && zArr[i60]) {
                                iArr5[i59] = i61;
                                i59++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i59);
                        int i62 = 0;
                        for (int i63 = i48 - 1; i63 >= 0; i63--) {
                            int i64 = iArr[i63] + i33;
                            if (i64 > 0 && zArr[i63]) {
                                iArr6[i62] = i64;
                                i62++;
                            }
                        }
                        if (i33 > 0 && zArr[i52]) {
                            iArr6[i62] = i33;
                            i62++;
                        }
                        int i65 = i62;
                        for (int i66 = 0; i66 < i49; i66++) {
                            int i67 = iArr2[i66] + i33;
                            if (i67 > 0 && zArr[i48 + i66]) {
                                iArr6[i65] = i67;
                                i65++;
                            }
                        }
                        iArr = copyOf;
                        iArr2 = Arrays.copyOf(iArr6, i65);
                        i48 = i59;
                        i49 = i65;
                    }
                    i19 = i31 + 1;
                    zzg3 = i30;
                    i7 = i32;
                    zzl = zzgaVar;
                }
                zzga zzgaVar2 = zzl;
                int i68 = i7;
                if (zzgnVar.zze()) {
                    int zzg16 = zzgnVar.zzg();
                    for (int i69 = 0; i69 < zzg16; i69++) {
                        zzgnVar.zzb(zzg12 + 5);
                    }
                }
                zzgnVar.zzb(2);
                float f6 = 1.0f;
                if (zzgnVar.zze()) {
                    f5 = 1.0f;
                    zzgbVar = zzgbVar2;
                    i20 = zzg4;
                    i21 = i13;
                    i22 = i16;
                    i23 = i17;
                    i24 = -1;
                    i25 = -1;
                    i26 = -1;
                } else {
                    if (zzgnVar.zze()) {
                        int zzf3 = zzgnVar.zzf(8);
                        if (zzf3 == 255) {
                            int zzf4 = zzgnVar.zzf(16);
                            int zzf5 = zzgnVar.zzf(16);
                            if (zzf4 != 0 && zzf5 != 0) {
                                f6 = zzf4 / zzf5;
                            }
                        } else if (zzf3 < 17) {
                            f6 = zzb[zzf3];
                        } else {
                            u.r(new StringBuilder(String.valueOf(zzf3).length() + 35), "Unexpected aspect_ratio_idc value: ", zzf3, "NalUnitUtil");
                        }
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zza();
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zzb(3);
                        i29 = true != zzgnVar.zze() ? 2 : 1;
                        if (zzgnVar.zze()) {
                            int zzf6 = zzgnVar.zzf(8);
                            int zzf7 = zzgnVar.zzf(8);
                            zzgnVar.zzb(8);
                            i27 = zzi.zzb(zzf6);
                            i28 = zzi.zzc(zzf7);
                        } else {
                            i27 = -1;
                            i28 = -1;
                        }
                    } else {
                        if (zzgjVar != null && (zzgiVar = zzgjVar.zzd) != null) {
                            int i70 = zzgiVar.zzb[i68];
                            zzguf zzgufVar4 = zzgiVar.zza;
                            if (zzgufVar4.size() > i70) {
                                zzgh zzghVar = (zzgh) zzgufVar4.get(i70);
                                int i71 = zzghVar.zza;
                                int i72 = zzghVar.zzb;
                                i28 = zzghVar.zzc;
                                i27 = i71;
                                i29 = i72;
                            }
                        }
                        i27 = -1;
                        i28 = -1;
                        i29 = -1;
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zzg();
                        zzgnVar.zzg();
                    }
                    zzgnVar.zza();
                    if (zzgnVar.zze()) {
                        i11 += i11;
                    }
                    i24 = i27;
                    f5 = f6;
                    zzgbVar = zzgbVar2;
                    i20 = zzg4;
                    i21 = i13;
                    i22 = i16;
                    i23 = i17;
                    i26 = i28;
                    i25 = i29;
                }
                return new zzgg(zzgaVar2, i46, zzgbVar, i15, i47, zzg2, i20, i21, i11, i23, i22, f5, i45, i24, i25, i26);
            }
        }
        i7 = 0;
        zzgb zzgbVar22 = null;
        if (z4) {
        }
        int zzg42 = zzgnVar.zzg();
        if (z4) {
        }
        int zzg122 = zzgnVar.zzg();
        if (z4) {
        }
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        if (zzgnVar.zze()) {
        }
        int i452 = i18;
        zzgnVar.zzb(2);
        if (zzgnVar.zze()) {
        }
        zzg3 = zzgnVar.zzg();
        i19 = 0;
        int[] iArr7 = new int[0];
        int i462 = zzf;
        int[] iArr22 = new int[0];
        int i472 = zzg;
        int i482 = -1;
        int i492 = -1;
        while (i19 < zzg3) {
        }
        zzga zzgaVar22 = zzl;
        int i682 = i7;
        if (zzgnVar.zze()) {
        }
        zzgnVar.zzb(2);
        float f62 = 1.0f;
        if (zzgnVar.zze()) {
        }
        return new zzgg(zzgaVar22, i462, zzgbVar, i15, i472, zzg2, i20, i21, i11, i23, i22, f5, i452, i24, i25, i26);
    }

    public static zzgk zzh(byte[] bArr, int i5, int i6) {
        zzgn zzgnVar = new zzgn(bArr, 4, i6);
        int zzg = zzgnVar.zzg();
        int zzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        return new zzgk(zzg, zzg2, zzgnVar.zze());
    }

    public static int zzi(byte[] bArr, int i5, int i6, boolean[] zArr) {
        int i7 = i6 - i5;
        zzgrc.zzi(i7 >= 0);
        if (i7 == 0) {
            return i6;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i5 - 3;
        }
        if (i7 > 1 && zArr[1] && bArr[i5] == 1) {
            zzj(zArr);
            return i5 - 2;
        }
        if (i7 > 2 && zArr[2] && bArr[i5] == 0 && bArr[i5 + 1] == 1) {
            zzj(zArr);
            return i5 - 1;
        }
        int i8 = i6 - 1;
        int i9 = i5 + 2;
        while (i9 < i8) {
            byte b2 = bArr[i9];
            if ((b2 & 254) == 0) {
                int i10 = i9 - 2;
                if (bArr[i10] == 0 && bArr[i9 - 1] == 0 && b2 == 1) {
                    zzj(zArr);
                    return i10;
                }
                i9 = i10;
            }
            i9 += 3;
        }
        zArr[0] = i7 <= 2 ? !(i7 != 2 ? !(zArr[1] && bArr[i8] == 1) : !(zArr[2] && bArr[i6 + (-2)] == 0 && bArr[i8] == 1)) : bArr[i6 + (-3)] == 0 && bArr[i6 + (-2)] == 0 && bArr[i8] == 1;
        zArr[1] = i7 <= 1 ? zArr[2] && bArr[i8] == 0 : bArr[i6 + (-2)] == 0 && bArr[i8] == 0;
        zArr[2] = bArr[i8] == 0;
        return i6;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            byte[] bArr = (byte[]) list.get(i5);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i6 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i7 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i7 >= length2) {
                        break;
                    }
                    int zzi = zzi(bArr, i7, length2, zArr);
                    if (zzi != length2) {
                        zzgucVar.zzf(Integer.valueOf(zzi));
                    }
                    i7 = zzi + 3;
                }
                zzguf zzi2 = zzgucVar.zzi();
                for (int i8 = 0; i8 < zzi2.size(); i8++) {
                    if (((Integer) zzi2.get(i8)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzi2.get(i8)).intValue() + 3, length);
                        zzga zzl = zzl(zzgnVar);
                        if (zzl.zza == 33 && zzl.zzb == 0) {
                            zzgnVar.zzb(4);
                            int zzf = zzgnVar.zzf(3);
                            zzgnVar.zza();
                            zzgb zzm = zzm(zzgnVar, true, zzf, null);
                            return zzdo.zzb(zzm.zza, zzm.zzb, zzm.zzc, zzm.zzd, zzm.zze, zzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzga zzl(zzgn zzgnVar) {
        zzgnVar.zza();
        return new zzga(zzgnVar.zzf(6), zzgnVar.zzf(6), zzgnVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzgb zzm(zzgn zzgnVar, boolean z4, int i5, zzgb zzgbVar) {
        int[] iArr;
        int i6;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        int[] iArr2 = new int[6];
        if (z4) {
            int zzf = zzgnVar.zzf(2);
            z6 = zzgnVar.zze();
            i9 = zzgnVar.zzf(5);
            i10 = 0;
            for (int i11 = 0; i11 < 32; i11++) {
                if (zzgnVar.zze()) {
                    i10 |= 1 << i11;
                }
            }
            for (int i12 = 0; i12 < 6; i12++) {
                iArr2[i12] = zzgnVar.zzf(8);
            }
            i6 = zzf;
        } else {
            if (zzgbVar == null) {
                iArr = iArr2;
                i6 = 0;
                z5 = false;
                i7 = 0;
                i8 = 0;
                int zzf2 = zzgnVar.zzf(8);
                int i13 = 0;
                for (int i14 = 0; i14 < i5; i14++) {
                    if (zzgnVar.zze()) {
                        i13 += 88;
                    }
                    if (zzgnVar.zze()) {
                        i13 += 8;
                    }
                }
                zzgnVar.zzb(i13);
                if (i5 > 0) {
                    int i15 = 8 - i5;
                    zzgnVar.zzb(i15 + i15);
                }
                return new zzgb(i6, z5, i7, i8, iArr, zzf2);
            }
            int i16 = zzgbVar.zza;
            z6 = zzgbVar.zzb;
            i9 = zzgbVar.zzc;
            i10 = zzgbVar.zzd;
            iArr2 = zzgbVar.zze;
            i6 = i16;
        }
        iArr = iArr2;
        z5 = z6;
        i7 = i9;
        i8 = i10;
        int zzf22 = zzgnVar.zzf(8);
        int i132 = 0;
        while (i14 < i5) {
        }
        zzgnVar.zzb(i132);
        if (i5 > 0) {
        }
        return new zzgb(i6, z5, i7, i8, iArr, zzf22);
    }

    private static int zzn(int i5, int i6, int i7, int i8) {
        int i9 = 2;
        if (i6 != 1 && i6 != 2) {
            i9 = 1;
        }
        return i5 - ((i7 + i8) * i9);
    }

    private static int zzo(int i5, int i6, int i7, int i8) {
        return i5 - ((i7 + i8) * (i6 == 1 ? 2 : 1));
    }

    private static void zzp(zzgn zzgnVar) {
        int zzg = zzgnVar.zzg() + 1;
        zzgnVar.zzb(8);
        for (int i5 = 0; i5 < zzg; i5++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        zzgnVar.zzb(20);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzo;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }
}
