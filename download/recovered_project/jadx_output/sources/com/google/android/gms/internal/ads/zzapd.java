package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
final class zzapd {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzeq zzeqVar, zzapb zzapbVar) {
        long zzk;
        zzeqVar.zze();
        int zzf = zzf(zzeqVar, 3, 8, 8);
        zzapbVar.zza = zzf;
        if (zzf == -1) {
            return false;
        }
        zzgrc.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzeqVar.zzc() >= 2) {
            zzk = zzeqVar.zzk(2);
            if (zzk == 3) {
                if (zzeqVar.zzc() >= 8) {
                    long zzk2 = zzeqVar.zzk(8);
                    long j2 = zzk2 + 3;
                    if (zzk2 != 255) {
                        zzk = j2;
                    } else if (zzeqVar.zzc() >= 32) {
                        zzk = zzeqVar.zzk(32) + j2;
                    }
                }
            }
            zzapbVar.zzb = zzk;
            if (zzk != -1) {
                return false;
            }
            if (zzk > 16) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzk).length() + 49);
                sb.append("Contains sub-stream with an invalid packet label ");
                sb.append(zzk);
                throw zzat.zzc(sb.toString());
            }
            if (zzk == 0) {
                int i5 = zzapbVar.zza;
                if (i5 == 1) {
                    throw zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i5 == 2) {
                    throw zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i5 == 17) {
                    throw zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzf2 = zzf(zzeqVar, 11, 24, 24);
            zzapbVar.zzc = zzf2;
            return zzf2 != -1;
        }
        zzk = -1;
        zzapbVar.zzb = zzk;
        if (zzk != -1) {
        }
    }

    public static zzapc zzb(zzeq zzeqVar) {
        int i5;
        int i6;
        char c5;
        int i7;
        int i8;
        int i9;
        char c6;
        int zzj = zzeqVar.zzj(8);
        int i10 = 5;
        int zzj2 = zzeqVar.zzj(5);
        if (zzj2 != 31) {
            switch (zzj2) {
                case 0:
                    i5 = 96000;
                    break;
                case 1:
                    i5 = 88200;
                    break;
                case 2:
                    i5 = 64000;
                    break;
                case 3:
                    i5 = 48000;
                    break;
                case 4:
                    i5 = 44100;
                    break;
                case 5:
                    i5 = 32000;
                    break;
                case 6:
                    i5 = 24000;
                    break;
                case 7:
                    i5 = 22050;
                    break;
                case 8:
                    i5 = 16000;
                    break;
                case 9:
                    i5 = 12000;
                    break;
                case 10:
                    i5 = 11025;
                    break;
                case 11:
                    i5 = 8000;
                    break;
                case 12:
                    i5 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(zzj2);
                    throw zzat.zzc(sb.toString());
                case 15:
                    i5 = 57600;
                    break;
                case 16:
                    i5 = 51200;
                    break;
                case 17:
                    i5 = 40000;
                    break;
                case 18:
                    i5 = 38400;
                    break;
                case 19:
                    i5 = 34150;
                    break;
                case 20:
                    i5 = 28800;
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    i5 = 25600;
                    break;
                case 22:
                    i5 = 20000;
                    break;
                case 23:
                    i5 = 19200;
                    break;
                case 24:
                    i5 = 17075;
                    break;
                case 25:
                    i5 = 14400;
                    break;
                case 26:
                    i5 = 12800;
                    break;
                case 27:
                    i5 = 9600;
                    break;
            }
        } else {
            i5 = zzeqVar.zzj(24);
        }
        int zzj3 = zzeqVar.zzj(3);
        int i11 = 1;
        if (zzj3 == 0) {
            i6 = 768;
        } else if (zzj3 == 1) {
            i6 = 1024;
        } else if (zzj3 == 2 || zzj3 == 3) {
            i6 = 2048;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb2 = new StringBuilder(u.b(zzj3, 36));
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(zzj3);
                throw zzat.zzc(sb2.toString());
            }
            i6 = 4096;
        }
        if (zzj3 == 0 || zzj3 == 1) {
            c5 = 0;
        } else if (zzj3 == 2) {
            c5 = 2;
        } else if (zzj3 == 3) {
            c5 = 3;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb3 = new StringBuilder(u.b(zzj3, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(zzj3);
                throw zzat.zzc(sb3.toString());
            }
            c5 = 1;
        }
        zzeqVar.zzh(2);
        zzc(zzeqVar);
        int zzj4 = zzeqVar.zzj(5);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 16;
            if (i12 < zzj4 + 1) {
                int zzj5 = zzeqVar.zzj(3);
                i13 += zzf(zzeqVar, 5, 8, 16) + 1;
                if ((zzj5 == 0 || zzj5 == 2) && zzeqVar.zzi()) {
                    zzc(zzeqVar);
                }
                i12++;
            } else {
                int zzf = zzf(zzeqVar, 4, 8, 16) + 1;
                zzeqVar.zzg();
                int i15 = 0;
                while (true) {
                    double d5 = 2.0d;
                    if (i15 >= zzf) {
                        int i16 = zzj;
                        byte[] bArr = null;
                        if (zzeqVar.zzi()) {
                            int zzf2 = zzf(zzeqVar, 2, 4, 8) + 1;
                            for (int i17 = 0; i17 < zzf2; i17++) {
                                int zzf3 = zzf(zzeqVar, 4, 8, 16);
                                int zzf4 = zzf(zzeqVar, 4, 8, 16);
                                if (zzf3 == 7) {
                                    int zzj6 = zzeqVar.zzj(4) + 1;
                                    zzeqVar.zzh(4);
                                    byte[] bArr2 = new byte[zzj6];
                                    for (int i18 = 0; i18 < zzj6; i18++) {
                                        bArr2[i18] = (byte) zzeqVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeqVar.zzh(zzf4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i5) {
                            case 14700:
                            case 16000:
                                d5 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d5 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d5 = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i5).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i5);
                                throw zzat.zzc(sb4.toString());
                        }
                        return new zzapc(i16, (int) (i5 * d5), (int) (i6 * d5), bArr3, null);
                    }
                    int zzj7 = zzeqVar.zzj(2);
                    if (zzj7 == 0) {
                        i7 = zzj;
                        i8 = i11;
                        zzd(zzeqVar);
                        if (c5 > 0) {
                            zze(zzeqVar);
                        }
                    } else if (zzj7 == i11) {
                        i8 = i11;
                        if (zzd(zzeqVar)) {
                            zzeqVar.zzg();
                        }
                        if (c5 > 0) {
                            zze(zzeqVar);
                            i9 = zzeqVar.zzj(2);
                            c6 = c5;
                        } else {
                            i9 = 0;
                            c6 = 0;
                        }
                        if (i9 > 0) {
                            zzeqVar.zzh(6);
                            int zzj8 = zzeqVar.zzj(2);
                            zzeqVar.zzh(4);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(i10);
                            }
                            if (i9 == 2 || i9 == 3) {
                                zzeqVar.zzh(6);
                            }
                            if (zzj8 == 2) {
                                zzeqVar.zzg();
                            }
                        }
                        i7 = zzj;
                        int floor = ((int) Math.floor(Math.log(i13 - 1) / Math.log(2.0d))) + 1;
                        int zzj9 = zzeqVar.zzj(2);
                        if (zzj9 > 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(floor);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(floor);
                        }
                        if (c6 == 0 && zzj9 == 0) {
                            zzeqVar.zzg();
                        }
                    } else if (zzj7 != 3) {
                        i7 = zzj;
                        i8 = i11;
                    } else {
                        zzf(zzeqVar, 4, 8, i14);
                        int zzf5 = zzf(zzeqVar, 4, 8, i14);
                        i8 = i11;
                        if (zzeqVar.zzi()) {
                            zzf(zzeqVar, 8, i14, 0);
                        }
                        zzeqVar.zzg();
                        if (zzf5 > 0) {
                            zzeqVar.zzh(zzf5 * 8);
                        }
                        i7 = zzj;
                    }
                    i15++;
                    zzj = i7;
                    i11 = i8;
                    i10 = 5;
                    i14 = 16;
                }
            }
        }
    }

    private static void zzc(zzeq zzeqVar) {
        int zzj;
        int zzj2 = zzeqVar.zzj(2);
        if (zzj2 == 0) {
            zzeqVar.zzh(6);
            return;
        }
        int zzf = zzf(zzeqVar, 5, 8, 16) + 1;
        if (zzj2 == 1) {
            zzeqVar.zzh(zzf * 7);
            return;
        }
        if (zzj2 == 2) {
            boolean zzi = zzeqVar.zzi();
            int i5 = true != zzi ? 5 : 1;
            int i6 = true == zzi ? 7 : 5;
            int i7 = true == zzi ? 8 : 6;
            int i8 = 0;
            while (i8 < zzf) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                    zzj = 0;
                } else {
                    if (zzeqVar.zzj(2) == 3 && zzeqVar.zzj(i6) * i5 != 0) {
                        zzeqVar.zzg();
                    }
                    zzj = zzeqVar.zzj(i7) * i5;
                    if (zzj != 0 && zzj != 180) {
                        zzeqVar.zzg();
                    }
                    zzeqVar.zzg();
                }
                if (zzj != 0 && zzj != 180 && zzeqVar.zzi()) {
                    i8++;
                }
                i8++;
            }
        }
    }

    private static boolean zzd(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        boolean zzi = zzeqVar.zzi();
        if (zzi) {
            zzeqVar.zzh(13);
        }
        return zzi;
    }

    private static void zze(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        zzeqVar.zzh(8);
        boolean zzi = zzeqVar.zzi();
        boolean zzi2 = zzeqVar.zzi();
        if (zzi) {
            zzeqVar.zzh(5);
        }
        if (zzi2) {
            zzeqVar.zzh(6);
        }
    }

    private static int zzf(zzeq zzeqVar, int i5, int i6, int i7) {
        zzgrc.zza(Math.max(Math.max(i5, i6), i7) <= 31);
        int i8 = (1 << i5) - 1;
        int i9 = (1 << i6) - 1;
        Math.addExact(Math.addExact(i8, i9), 1 << i7);
        if (zzeqVar.zzc() < i5) {
            return -1;
        }
        int zzj = zzeqVar.zzj(i5);
        if (zzj == i8) {
            if (zzeqVar.zzc() < i6) {
                return -1;
            }
            int zzj2 = zzeqVar.zzj(i6);
            zzj += zzj2;
            if (zzj2 == i9) {
                if (zzeqVar.zzc() < i7) {
                    return -1;
                }
                return zzeqVar.zzj(i7) + zzj;
            }
        }
        return zzj;
    }
}
