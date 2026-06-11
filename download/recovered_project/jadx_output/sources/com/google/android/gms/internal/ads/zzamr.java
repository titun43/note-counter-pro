package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int zzt = zzerVar.zzt();
        int zzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(zzt, zzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i5) {
        int zzj;
        int zzj2;
        int i6;
        int i7;
        int i8 = 8;
        int zzj3 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i9 = i5 - 2;
        while (i9 > 0) {
            int zzj4 = zzeqVar.zzj(i8);
            int zzj5 = zzeqVar.zzj(i8);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i6 = zzeqVar.zzj(i8);
                i7 = zzeqVar.zzj(i8);
                zzj = zzeqVar.zzj(i8);
                zzj2 = zzeqVar.zzj(i8);
                i9 -= 6;
            } else {
                int zzj6 = zzeqVar.zzj(6) << 2;
                int zzj7 = zzeqVar.zzj(4) << 4;
                i9 -= 4;
                zzj = zzeqVar.zzj(4) << 4;
                zzj2 = zzeqVar.zzj(2) << 6;
                i6 = zzj6;
                i7 = zzj7;
            }
            if (i6 == 0) {
                zzj2 = 255;
            }
            if (i6 == 0) {
                zzj = 0;
            }
            if (i6 == 0) {
                i7 = 0;
            }
            double d5 = i6;
            String str = zzfj.zza;
            double d6 = i7 - 128;
            double d7 = zzj - 128;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d6) + d5), 255)), Math.max(0, Math.min((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d7 * 1.772d) + d5), 255)));
            zzj3 = zzj3;
            i8 = 8;
        }
        return new zzamj(zzj3, zzd, zze, zzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int zzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int zzj2 = zzeqVar.zzj(2);
        boolean zzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (zzj2 == 1) {
            zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        } else if (zzj2 == 0) {
            int zzj3 = zzeqVar.zzj(16);
            int zzj4 = zzeqVar.zzj(16);
            if (zzj3 > 0) {
                bArr2 = new byte[zzj3];
                zzeqVar.zzn(bArr2, 0, zzj3);
            }
            if (zzj4 > 0) {
                bArr = new byte[zzj4];
                zzeqVar.zzn(bArr, 0, zzj4);
                return new zzaml(zzj, zzi, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzaml(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i5 = 1; i5 < 16; i5++) {
            int i6 = i5 & 4;
            int i7 = i5 & 2;
            int i8 = i5 & 1;
            if (i5 < 8) {
                iArr[i5] = zzg(255, 1 != i8 ? 0 : 255, i7 != 0 ? 255 : 0, i6 != 0 ? 255 : 0);
            } else {
                iArr[i5] = zzg(255, 1 != i8 ? 0 : 127, i7 != 0 ? 127 : 0, i6 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            if (i5 < 8) {
                iArr[i5] = zzg(63, 1 != (i5 & 1) ? 0 : 255, (i5 & 2) != 0 ? 255 : 0, (i5 & 4) == 0 ? 0 : 255);
            } else {
                int i6 = i5 & 136;
                if (i6 == 0) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 85) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i5] = zzg(127, (1 != (i5 & 1) ? 0 : 85) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 43) + 127 + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + 127 + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + 127 + ((i5 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 43) + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + ((i5 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i5, int i6, int i7, int i8) {
        return (i5 << 24) | (i6 << 16) | (i7 << 8) | i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201 A[LOOP:3: B:85:0x0163->B:98:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i5, int i6, int i7, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i8;
        int zzj;
        char c5;
        int i9;
        int i10;
        int i11;
        int zzj2;
        int i12;
        int i13;
        boolean z4;
        int zzj3;
        int zzj4;
        int i14;
        int i15;
        int i16;
        int zzj5;
        int i17;
        Paint paint2 = paint;
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        int i18 = i6;
        int i19 = i7;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzeqVar.zzc() != 0) {
            int zzj6 = zzeqVar.zzj(8);
            if (zzj6 != 240) {
                int i20 = 4;
                int i21 = 1;
                int i22 = 2;
                switch (zzj6) {
                    case 16:
                        int i23 = 1;
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i8 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i9 = i8;
                                c5 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i18;
                                i18 = i12 + i11;
                                if (i9 != 0) {
                                }
                                paint2 = paint;
                                i8 = i9;
                                i23 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i8 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                    i11 = i23;
                                    i10 = zzj;
                                } else {
                                    if (zzeqVar.zzi()) {
                                        zzj2 = zzeqVar.zzj(3) + 3;
                                        i10 = zzeqVar.zzj(2);
                                    } else {
                                        if (zzeqVar.zzi()) {
                                            i11 = i23;
                                            i9 = i8;
                                            i10 = 0;
                                        } else {
                                            int zzj7 = zzeqVar.zzj(2);
                                            if (zzj7 == 0) {
                                                c5 = 4;
                                                i9 = i23;
                                                i10 = 0;
                                                i11 = 0;
                                            } else if (zzj7 == i23) {
                                                c5 = 4;
                                                i9 = i8;
                                                i11 = 2;
                                                i10 = 0;
                                            } else if (zzj7 == 2) {
                                                c5 = 4;
                                                i9 = i8;
                                                i11 = zzeqVar.zzj(4) + 12;
                                                i10 = zzeqVar.zzj(2);
                                            } else if (zzj7 != 3) {
                                                i9 = i8;
                                                i10 = 0;
                                                i11 = 0;
                                            } else {
                                                zzj2 = zzeqVar.zzj(8) + 29;
                                                i10 = zzeqVar.zzj(2);
                                            }
                                            if (i11 != 0 || paint2 == null) {
                                                i12 = i18;
                                            } else {
                                                int i24 = i19 + 1;
                                                float f5 = i19;
                                                if (bArr2 != 0) {
                                                    i10 = bArr2[i10];
                                                }
                                                paint2.setColor(iArr[i10]);
                                                i12 = i18;
                                                canvas.drawRect(i18, f5, i18 + i11, i24, paint2);
                                            }
                                            i18 = i12 + i11;
                                            if (i9 != 0) {
                                                zzeqVar.zzm();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                i8 = i9;
                                                i23 = 1;
                                            }
                                        }
                                        c5 = 4;
                                        if (i11 != 0) {
                                        }
                                        i12 = i18;
                                        i18 = i12 + i11;
                                        if (i9 != 0) {
                                        }
                                    }
                                    i11 = zzj2;
                                }
                                i9 = i8;
                                c5 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i18;
                                i18 = i12 + i11;
                                if (i9 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i8 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i9 = i8;
                                c5 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i18;
                                i18 = i12 + i11;
                                if (i9 != 0) {
                                }
                                paint2 = paint;
                                i8 = i9;
                                i23 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i5 == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        boolean z5 = false;
                        while (true) {
                            int zzj8 = zzeqVar.zzj(i20);
                            if (zzj8 != 0) {
                                i13 = 1;
                                z4 = z5;
                            } else if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    int zzj9 = zzeqVar.zzj(i22);
                                    if (zzj9 == 0) {
                                        i13 = 1;
                                        z4 = z5;
                                        zzj8 = 0;
                                    } else if (zzj9 == 1) {
                                        z4 = z5;
                                        i13 = i22;
                                        zzj8 = 0;
                                    } else if (zzj9 == i22) {
                                        zzj3 = zzeqVar.zzj(i20) + 9;
                                        zzj4 = zzeqVar.zzj(i20);
                                    } else if (zzj9 != 3) {
                                        z4 = z5;
                                        zzj8 = 0;
                                        i13 = 0;
                                    } else {
                                        zzj3 = zzeqVar.zzj(8) + 25;
                                        zzj4 = zzeqVar.zzj(i20);
                                    }
                                } else {
                                    zzj3 = zzeqVar.zzj(i22) + i20;
                                    zzj4 = zzeqVar.zzj(i20);
                                }
                                i13 = zzj3;
                                z4 = z5;
                                zzj8 = zzj4;
                            } else {
                                int zzj10 = zzeqVar.zzj(3);
                                if (zzj10 != 0) {
                                    i13 = zzj10 + 2;
                                    z4 = z5;
                                    zzj8 = 0;
                                } else {
                                    z4 = true;
                                    zzj8 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i18;
                                i15 = i22;
                            } else {
                                int i25 = i19 + 1;
                                float f6 = i19;
                                if (bArr7 != 0) {
                                    zzj8 = bArr7[zzj8];
                                }
                                paint2.setColor(iArr[zzj8]);
                                i14 = i18;
                                i15 = 2;
                                canvas.drawRect(i18, f6, i18 + i13, i25, paint2);
                            }
                            i18 = i14 + i13;
                            if (z4) {
                                zzeqVar.zzm();
                                continue;
                            } else {
                                i22 = i15;
                                z5 = z4;
                                i20 = 4;
                            }
                        }
                    case 18:
                        int i26 = i18;
                        int i27 = 0;
                        while (true) {
                            int zzj11 = zzeqVar.zzj(8);
                            if (zzj11 != 0) {
                                i16 = i27;
                                zzj5 = i21;
                            } else if (zzeqVar.zzi()) {
                                i16 = i27;
                                zzj5 = zzeqVar.zzj(7);
                                zzj11 = zzeqVar.zzj(8);
                            } else {
                                int zzj12 = zzeqVar.zzj(7);
                                if (zzj12 != 0) {
                                    i16 = i27;
                                    zzj5 = zzj12;
                                    zzj11 = 0;
                                } else {
                                    i16 = i21;
                                    zzj11 = 0;
                                    zzj5 = 0;
                                }
                            }
                            if (zzj5 == 0 || paint2 == null) {
                                i17 = i21;
                            } else {
                                paint2.setColor(iArr[zzj11]);
                                i17 = i21;
                                canvas.drawRect(i26, i19, i26 + zzj5, i19 + 1, paint2);
                            }
                            i26 += zzj5;
                            if (i16 == 0) {
                                i21 = i17;
                                i27 = i16;
                            } else {
                                i18 = i26;
                                continue;
                            }
                        }
                    default:
                        switch (zzj6) {
                            case 32:
                                bArr6 = zzi(4, 4, zzeqVar);
                                break;
                            case 33:
                                bArr4 = zzi(4, 8, zzeqVar);
                                break;
                            case 34:
                                bArr5 = zzi(16, 8, zzeqVar);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i19 += 2;
                i18 = i6;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i5, int i6, zzeq zzeqVar) {
        byte[] bArr = new byte[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            bArr[i7] = (byte) zzeqVar.zzj(i6);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        boolean z4;
        zzalx zzalxVar;
        Canvas canvas;
        char c5;
        char c6;
        char c7;
        int i7;
        zzamq zzamqVar;
        Canvas canvas2;
        int i8;
        int i9;
        int i10;
        zzamo zzamoVar;
        int zzj;
        int zzj2;
        int i11;
        int i12;
        int i13;
        int i14;
        zzeq zzeqVar = new zzeq(bArr, i5 + i6);
        zzeqVar.zzf(i5);
        while (true) {
            z4 = true;
            if (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
                zzamq zzamqVar2 = this.zzi;
                int zzj3 = zzeqVar.zzj(8);
                int zzj4 = zzeqVar.zzj(16);
                int zzj5 = zzeqVar.zzj(16);
                int zze = zzeqVar.zze() + zzj5;
                if (zzj5 * 8 > zzeqVar.zzc()) {
                    zzee.zzc("DvbParser", "Data field length exceeds limit");
                    zzeqVar.zzh(zzeqVar.zzc());
                } else {
                    switch (zzj3) {
                        case 16:
                            if (zzj4 == zzamqVar2.zza) {
                                zzamm zzammVar = zzamqVar2.zzi;
                                int zzj6 = zzeqVar.zzj(8);
                                int zzj7 = zzeqVar.zzj(4);
                                int zzj8 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i15 = zzj5 - 2; i15 > 0; i15 -= 6) {
                                    int zzj9 = zzeqVar.zzj(8);
                                    zzeqVar.zzh(8);
                                    sparseArray.put(zzj9, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                                }
                                zzamm zzammVar2 = new zzamm(zzj6, zzj7, zzj8, sparseArray);
                                if (zzammVar2.zzb != 0) {
                                    zzamqVar2.zzi = zzammVar2;
                                    zzamqVar2.zzc.clear();
                                    zzamqVar2.zzd.clear();
                                    zzamqVar2.zze.clear();
                                    break;
                                } else if (zzammVar != null) {
                                    if (zzammVar.zza != zzammVar2.zza) {
                                        zzamqVar2.zzi = zzammVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzamm zzammVar3 = zzamqVar2.zzi;
                            if (zzj4 == zzamqVar2.zza && zzammVar3 != null) {
                                int zzj10 = zzeqVar.zzj(8);
                                zzeqVar.zzh(4);
                                boolean zzi = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int zzj11 = zzeqVar.zzj(16);
                                int zzj12 = zzeqVar.zzj(16);
                                int zzj13 = zzeqVar.zzj(3);
                                int zzj14 = zzeqVar.zzj(3);
                                zzeqVar.zzh(2);
                                int zzj15 = zzeqVar.zzj(8);
                                int zzj16 = zzeqVar.zzj(8);
                                int zzj17 = zzeqVar.zzj(4);
                                int zzj18 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                int i16 = zzj5 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i16 > 0) {
                                    int zzj19 = zzeqVar.zzj(16);
                                    int zzj20 = zzeqVar.zzj(2);
                                    int zzj21 = zzeqVar.zzj(2);
                                    int zzj22 = zzeqVar.zzj(12);
                                    zzeqVar.zzh(4);
                                    int zzj23 = zzeqVar.zzj(12);
                                    int i17 = i16 - 6;
                                    if (zzj20 != 1) {
                                        if (zzj20 == 2) {
                                            zzj20 = 2;
                                        } else {
                                            i16 = i17;
                                            zzj = 0;
                                            zzj2 = 0;
                                            sparseArray2.put(zzj19, new zzamp(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                        }
                                    }
                                    i16 -= 8;
                                    zzj = zzeqVar.zzj(8);
                                    zzj2 = zzeqVar.zzj(8);
                                    sparseArray2.put(zzj19, new zzamp(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                }
                                zzamo zzamoVar2 = new zzamo(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                                if (zzammVar3.zzb == 0 && (zzamoVar = (zzamo) zzamqVar2.zzc.get(zzamoVar2.zza)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzamoVar.zzj;
                                        if (i18 < sparseArray3.size()) {
                                            zzamoVar2.zzj.put(sparseArray3.keyAt(i18), (zzamp) sparseArray3.valueAt(i18));
                                            i18++;
                                        }
                                    }
                                }
                                zzamqVar2.zzc.put(zzamoVar2.zza, zzamoVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (zzj4 == zzamqVar2.zza) {
                                zzamj zzb2 = zzb(zzeqVar, zzj5);
                                zzamqVar2.zzd.put(zzb2.zza, zzb2);
                                break;
                            } else if (zzj4 == zzamqVar2.zzb) {
                                zzamj zzb3 = zzb(zzeqVar, zzj5);
                                zzamqVar2.zzf.put(zzb3.zza, zzb3);
                                break;
                            }
                            break;
                        case 19:
                            if (zzj4 == zzamqVar2.zza) {
                                zzaml zzc2 = zzc(zzeqVar);
                                zzamqVar2.zze.put(zzc2.zza, zzc2);
                                break;
                            } else if (zzj4 == zzamqVar2.zzb) {
                                zzaml zzc3 = zzc(zzeqVar);
                                zzamqVar2.zzg.put(zzc3.zza, zzc3);
                                break;
                            }
                            break;
                        case 20:
                            if (zzj4 == zzamqVar2.zza) {
                                zzeqVar.zzh(4);
                                boolean zzi2 = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int zzj24 = zzeqVar.zzj(16);
                                int zzj25 = zzeqVar.zzj(16);
                                if (zzi2) {
                                    int zzj26 = zzeqVar.zzj(16);
                                    i11 = zzeqVar.zzj(16);
                                    i14 = zzeqVar.zzj(16);
                                    i12 = zzeqVar.zzj(16);
                                    i13 = zzj26;
                                } else {
                                    i11 = zzj24;
                                    i12 = zzj25;
                                    i13 = 0;
                                    i14 = 0;
                                }
                                zzamqVar2.zzh = new zzamk(zzj24, zzj25, i13, i11, i14, i12);
                                break;
                            }
                            break;
                    }
                    zzeqVar.zzo(zze - zzeqVar.zze());
                }
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar = zzamqVar3.zzh;
            if (zzamkVar == null) {
                zzamkVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar.zza + 1 != bitmap.getWidth() || zzamkVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzamkVar.zza + 1, zzamkVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i19 = 0;
            while (i19 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i19);
                zzamo zzamoVar3 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i19));
                int i20 = zzamnVar.zza + zzamkVar.zzc;
                int i21 = zzamnVar.zzb + zzamkVar.zze;
                int i22 = zzamoVar3.zzc;
                int i23 = i20 + i22;
                boolean z5 = z4;
                int min = Math.min(i23, zzamkVar.zzd);
                int i24 = zzamoVar3.zzd;
                int i25 = i21 + i24;
                canvas3.clipRect(i20, i21, min, Math.min(i25, zzamkVar.zzf));
                int i26 = zzamoVar3.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i26);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i26)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i27 = i19;
                int i28 = 0;
                while (i28 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i28);
                    int i29 = i28;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i28);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(keyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(keyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        i9 = i22;
                        int i30 = zzamoVar3.zze;
                        zzamqVar = zzamqVar3;
                        int i31 = zzampVar.zza + i20;
                        int i32 = i21 + zzampVar.zzb;
                        canvas2 = canvas3;
                        i8 = i20;
                        int[] iArr = i30 == 3 ? zzamjVar.zzd : i30 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i10 = i23;
                        zzh(zzamlVar.zzc, iArr, i30, i31, i32, paint, canvas2);
                        zzh(zzamlVar.zzd, iArr, i30, i31, i32 + 1, paint, canvas2);
                    } else {
                        zzamqVar = zzamqVar3;
                        canvas2 = canvas3;
                        i8 = i20;
                        i9 = i22;
                        i10 = i23;
                    }
                    i20 = i8;
                    i23 = i10;
                    i28 = i29 + 1;
                    i22 = i9;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                }
                zzamq zzamqVar4 = zzamqVar3;
                Canvas canvas4 = canvas3;
                int i33 = i20;
                int i34 = i22;
                int i35 = i23;
                float f5 = i21;
                float f6 = i33;
                if (zzamoVar3.zzb) {
                    int i36 = zzamoVar3.zze;
                    if (i36 == 3) {
                        i7 = zzamjVar.zzd[zzamoVar3.zzg];
                        c7 = 2;
                    } else {
                        c7 = 2;
                        i7 = i36 == 2 ? zzamjVar.zzc[zzamoVar3.zzh] : zzamjVar.zzb[zzamoVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i7);
                    float f7 = i35;
                    c6 = c7;
                    c5 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f6, f5, f7, i25, paint2);
                } else {
                    canvas = canvas4;
                    c5 = 3;
                    c6 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i33, i21, i34, i24));
                float f8 = zzamkVar.zza;
                zzcwVar.zzi(f6 / f8);
                zzcwVar.zzj(0);
                float f9 = zzamkVar.zzb;
                zzcwVar.zzf(f5 / f9, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i34 / f8);
                zzcwVar.zzn(i24 / f9);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i19 = i27 + 1;
                z4 = z5;
                zzamqVar3 = zzamqVar4;
                sparseArray4 = sparseArray6;
            }
            zzalxVar = new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
