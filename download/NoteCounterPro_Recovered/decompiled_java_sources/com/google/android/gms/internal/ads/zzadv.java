package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbgj;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzadv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) {
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int i5 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(8);
        int i6 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i6++;
        }
        int i7 = zzf[zzeqVar.zzj(5)] * zzbgj.zzq.zzf;
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm("audio/ac3");
        zztVar.zzE(i6);
        zztVar.zzF(i5);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzh(i7);
        zztVar.zzi(i7);
        return zztVar.zzM();
    }

    public static zzv zzb(zzer zzerVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int zzj = zzeqVar.zzj(13) * zzbgj.zzq.zzf;
        zzeqVar.zzh(3);
        int i5 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(10);
        int i6 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i6++;
        }
        zzeqVar.zzh(3);
        int zzj2 = zzeqVar.zzj(4);
        zzeqVar.zzh(1);
        if (zzj2 > 0) {
            zzeqVar.zzh(6);
            if (zzeqVar.zzj(1) != 0) {
                i6 += 2;
            }
            zzeqVar.zzh(1);
        }
        if (zzeqVar.zzc() > 7) {
            zzeqVar.zzh(7);
            if (zzeqVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
                zzeqVar.zzm();
                zzerVar.zzh(zzeqVar.zze());
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzm(str3);
                zztVar.zzE(i6);
                zztVar.zzF(i5);
                zztVar.zzq(zzqVar);
                zztVar.zze(str2);
                zztVar.zzi(zzj);
                return zztVar.zzM();
            }
        }
        str3 = "audio/eac3";
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar2 = new zzt();
        zztVar2.zza(str);
        zztVar2.zzm(str3);
        zztVar2.zzE(i6);
        zztVar2.zzF(i5);
        zztVar2.zzq(zzqVar);
        zztVar2.zze(str2);
        zztVar2.zzi(zzj);
        return zztVar2.zzM();
    }

    public static zzadu zzc(zzeq zzeqVar) {
        int zzf2;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int zzd2 = zzeqVar.zzd();
        zzeqVar.zzh(40);
        int zzj = zzeqVar.zzj(5);
        zzeqVar.zzf(zzd2);
        int i13 = -1;
        if (zzj > 10) {
            zzeqVar.zzh(16);
            int zzj2 = zzeqVar.zzj(2);
            if (zzj2 == 0) {
                i13 = 0;
            } else if (zzj2 == 1) {
                i13 = 1;
            } else if (zzj2 == 2) {
                i13 = 2;
            }
            zzeqVar.zzh(3);
            int zzj3 = zzeqVar.zzj(11) + 1;
            int zzj4 = zzeqVar.zzj(2);
            if (zzj4 == 3) {
                i5 = zzd[zzeqVar.zzj(2)];
                i10 = 6;
                i9 = 3;
            } else {
                int zzj5 = zzeqVar.zzj(2);
                int i14 = zzb[zzj5];
                i9 = zzj5;
                i5 = zzc[zzj4];
                i10 = i14;
            }
            zzf2 = zzj3 + zzj3;
            int i15 = (zzf2 * i5) / (i10 * 32);
            int zzj6 = zzeqVar.zzj(3);
            boolean zzi = zzeqVar.zzi();
            i6 = zze[zzj6] + (zzi ? 1 : 0);
            zzeqVar.zzh(10);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(8);
            }
            if (zzj6 == 0) {
                zzeqVar.zzh(5);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                i11 = 0;
                zzj6 = 0;
            } else {
                i11 = zzj6;
            }
            if (i13 == 1) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(16);
                }
                i12 = 1;
            } else {
                i12 = i13;
            }
            if (zzeqVar.zzi()) {
                if (i11 > 2) {
                    zzeqVar.zzh(2);
                }
                if ((i11 & 1) != 0 && i11 > 2) {
                    zzeqVar.zzh(6);
                }
                if ((i11 & 4) != 0) {
                    zzeqVar.zzh(6);
                }
                if (zzi && zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                if (i12 == 0) {
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (i11 == 0 && zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    int zzj7 = zzeqVar.zzj(2);
                    if (zzj7 == 1) {
                        zzeqVar.zzh(5);
                    } else if (zzj7 == 2) {
                        zzeqVar.zzh(12);
                    } else if (zzj7 == 3) {
                        int zzj8 = zzeqVar.zzj(5);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                            }
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(7);
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(8);
                                }
                            }
                        }
                        zzeqVar.zzh((zzj8 + 2) * 8);
                        zzeqVar.zzm();
                    }
                    if (i11 < 2) {
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                        if (zzj6 == 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                    }
                    if (zzeqVar.zzi()) {
                        if (i9 == 0) {
                            zzeqVar.zzh(5);
                            i12 = 0;
                            i9 = 0;
                        } else {
                            for (int i16 = 0; i16 < i10; i16++) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(5);
                                }
                            }
                        }
                    }
                    i12 = 0;
                }
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
                if (i11 == 2) {
                    zzeqVar.zzh(4);
                    i11 = 2;
                }
                if (i11 >= 6) {
                    zzeqVar.zzh(2);
                }
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (i11 == 0 && zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (zzj4 < 3) {
                    zzeqVar.zzg();
                }
            }
            if (i12 == 0 && i9 != 3) {
                zzeqVar.zzg();
            }
            if (i12 == 2 && (i9 == 3 || zzeqVar.zzi())) {
                zzeqVar.zzh(6);
            }
            i7 = i10 * 256;
            str = (zzeqVar.zzi() && zzeqVar.zzj(6) == 1 && zzeqVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i8 = i15;
        } else {
            zzeqVar.zzh(32);
            int zzj9 = zzeqVar.zzj(2);
            String str2 = zzj9 == 3 ? null : "audio/ac3";
            int zzj10 = zzeqVar.zzj(6);
            int i17 = zzf[zzj10 / 2] * zzbgj.zzq.zzf;
            zzf2 = zzf(zzj9, zzj10);
            zzeqVar.zzh(8);
            int zzj11 = zzeqVar.zzj(3);
            if ((zzj11 & 1) != 0 && zzj11 != 1) {
                zzeqVar.zzh(2);
            }
            if ((zzj11 & 4) != 0) {
                zzeqVar.zzh(2);
            }
            if (zzj11 == 2) {
                zzeqVar.zzh(2);
            }
            i5 = zzj9 < 3 ? zzc[zzj9] : -1;
            i6 = zze[zzj11] + (zzeqVar.zzi() ? 1 : 0);
            i7 = 1536;
            str = str2;
            i8 = i17;
        }
        return new zzadu(str, i13, i6, i5, zzf2, i7, i8, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return zzf((b2 & 192) >> 6, b2 & 63);
        }
        int i5 = bArr[2] & 7;
        int i6 = ((bArr[3] & 255) | (i5 << 8)) + 1;
        return i6 + i6;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 >= 3 || i6 < 0 || (i7 = i6 >> 1) >= 19) {
            return -1;
        }
        int i8 = zzc[i5];
        if (i8 == 44100) {
            int i9 = zzg[i7] + (i6 & 1);
            return i9 + i9;
        }
        int i10 = zzf[i7];
        return i8 == 32000 ? i10 * 6 : i10 * 4;
    }
}
