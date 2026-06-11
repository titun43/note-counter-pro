package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbgj.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:110:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean zzi;
        int i11;
        int zzj;
        int zzj2;
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int zzc = zzeqVar.zzc();
        int zzj3 = zzeqVar.zzj(3);
        if (zzj3 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(zzj3);
            throw zzat.zzc(sb.toString());
        }
        int zzj4 = zzeqVar.zzj(7);
        int i18 = true != zzeqVar.zzi() ? 44100 : 48000;
        zzeqVar.zzh(4);
        int zzj5 = zzeqVar.zzj(9);
        if (zzj4 > 1) {
            if (zzj3 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(16);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(128);
                }
            }
        }
        if (zzj3 == 1) {
            if (!zzg(zzeqVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeqVar.zzm();
        }
        zzadw zzadwVar = new zzadw(null);
        for (int i19 = 0; i19 < zzj5; i19++) {
            if (zzj3 == 0) {
                zzi = zzeqVar.zzi();
                i11 = 8;
                zzj = zzeqVar.zzj(5);
                zzj2 = zzeqVar.zzj(5);
                i12 = 0;
                i13 = 0;
                z4 = false;
            } else {
                int zzj6 = zzeqVar.zzj(8);
                i12 = zzeqVar.zzj(8);
                i11 = 8;
                if (i12 == 255) {
                    i12 = zzeqVar.zzj(16) + 255;
                }
                if (zzj6 > 2) {
                    zzeqVar.zzh(i12 * 8);
                } else {
                    int zzc2 = (zzc - zzeqVar.zzc()) / 8;
                    zzj = zzeqVar.zzj(5);
                    zzj2 = zzj6;
                    z4 = zzj == 31;
                    i13 = zzc2;
                    zzi = false;
                }
            }
            zzadwVar.zzf = zzj2;
            if (zzi || z4 || zzj != 6) {
                zzadwVar.zzg = zzeqVar.zzj(3);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                zzeqVar.zzh(2);
                if (zzj3 == 1) {
                    if (zzj2 != 1) {
                        if (zzj2 == 2) {
                            zzj2 = 2;
                        }
                    }
                    zzeqVar.zzh(2);
                }
                zzeqVar.zzh(5);
                zzeqVar.zzh(10);
                if (zzj3 == 1) {
                    if (zzj2 > 0) {
                        zzadwVar.zza = zzeqVar.zzi();
                    }
                    if (zzadwVar.zza) {
                        if (zzj2 != 1) {
                            i15 = 2;
                            if (zzj2 == 2) {
                                i17 = 2;
                            } else {
                                i14 = zzc;
                                i17 = zzj2;
                                zzeqVar.zzh(24);
                                i16 = 1;
                            }
                        } else {
                            i17 = 1;
                        }
                        i14 = zzc;
                        int zzj7 = zzeqVar.zzj(5);
                        if (zzj7 >= 0 && zzj7 <= 15) {
                            zzadwVar.zzb = zzj7;
                        }
                        if (zzj7 < 11 || zzj7 > 14) {
                            i15 = 2;
                        } else {
                            zzadwVar.zzd = zzeqVar.zzi();
                            i15 = 2;
                            zzadwVar.zze = zzeqVar.zzj(2);
                        }
                        zzeqVar.zzh(24);
                        i16 = 1;
                    } else {
                        i14 = zzc;
                        i15 = 2;
                        i16 = 1;
                        i17 = zzj2;
                    }
                    if (zzj2 == i16 || zzj2 == i15) {
                        if (zzeqVar.zzi() && zzeqVar.zzi()) {
                            zzeqVar.zzh(i15);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzg();
                            int i20 = i11;
                            int zzj8 = zzeqVar.zzj(i20);
                            int i21 = 0;
                            while (i21 < zzj8) {
                                zzeqVar.zzh(i20);
                                i21++;
                                i20 = 8;
                            }
                        }
                    }
                    zzj2 = i17;
                } else {
                    i14 = zzc;
                }
                if (!zzi && !z4) {
                    zzeqVar.zzg();
                    if (zzj == 0 || zzj == 1 || zzj == 2) {
                        if (zzj2 == 0) {
                            for (int i22 = 0; i22 < 2; i22++) {
                                zzd(zzeqVar, zzadwVar);
                            }
                            zzj2 = 0;
                            zzeqVar.zzg();
                            if (!zzeqVar.zzi()) {
                            }
                        } else {
                            for (int i23 = 0; i23 < 2; i23++) {
                                zze(zzeqVar, zzadwVar);
                            }
                            zzeqVar.zzg();
                            if (!zzeqVar.zzi()) {
                            }
                        }
                    } else if (zzj != 3 && zzj != 4) {
                        if (zzj != 5) {
                            int zzj9 = zzeqVar.zzj(7);
                            for (int i24 = 0; i24 < zzj9; i24++) {
                                zzeqVar.zzh(8);
                            }
                        } else if (zzj2 == 0) {
                            zzd(zzeqVar, zzadwVar);
                            zzj2 = 0;
                        } else {
                            int zzj10 = zzeqVar.zzj(3);
                            for (int i25 = 0; i25 < zzj10 + 2; i25++) {
                                zze(zzeqVar, zzadwVar);
                            }
                        }
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    } else if (zzj2 == 0) {
                        for (int i26 = 0; i26 < 3; i26++) {
                            zzd(zzeqVar, zzadwVar);
                        }
                        zzj2 = 0;
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    } else {
                        for (int i27 = 0; i27 < 3; i27++) {
                            zze(zzeqVar, zzadwVar);
                        }
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    }
                } else if (zzj2 == 0) {
                    zzd(zzeqVar, zzadwVar);
                    zzj2 = 0;
                    zzeqVar.zzg();
                    if (!zzeqVar.zzi()) {
                        i7 = 7;
                        if (zzj2 > 0) {
                            if (zzeqVar.zzi() && !zzg(zzeqVar)) {
                                throw zzat.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzm();
                                zzeqVar.zzo(zzeqVar.zzj(16));
                                i6 = 5;
                                int zzj11 = zzeqVar.zzj(5);
                                for (int i28 = 0; i28 < zzj11; i28++) {
                                    zzeqVar.zzh(3);
                                    zzeqVar.zzh(8);
                                }
                                i5 = 8;
                                zzeqVar.zzm();
                                if (zzj3 == 1) {
                                    int zzc3 = ((i14 - zzeqVar.zzc()) / i5) - i13;
                                    if (i12 < zzc3) {
                                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzeqVar.zzo(i12 - zzc3);
                                }
                                if (zzadwVar.zza) {
                                    i8 = -1;
                                    if (zzadwVar.zzb == -1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 45);
                                        sb2.append("Can't determine channel mode of presentation ");
                                        sb2.append(i19);
                                        throw zzat.zzc(sb2.toString());
                                    }
                                }
                                i8 = -1;
                            }
                        }
                        i5 = 8;
                        i6 = 5;
                        zzeqVar.zzm();
                        if (zzj3 == 1) {
                        }
                        if (zzadwVar.zza) {
                        }
                        i8 = -1;
                    }
                } else {
                    zze(zzeqVar, zzadwVar);
                    zzeqVar.zzg();
                    if (!zzeqVar.zzi()) {
                    }
                }
                if (zzadwVar.zza) {
                    int i29 = zzadwVar.zzb;
                    boolean z5 = zzadwVar.zzd;
                    int i30 = zzadwVar.zze;
                    switch (i29) {
                        case 0:
                            i8 = 1;
                            break;
                        case 1:
                            i8 = 2;
                            break;
                        case 2:
                            i8 = 3;
                            break;
                        case 3:
                            i8 = i6;
                            break;
                        case 4:
                            i8 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i8 = i7;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i8 = i5;
                            break;
                        case 11:
                            i8 = 11;
                            break;
                        case 12:
                            i8 = 12;
                            break;
                        case 13:
                            i8 = 13;
                            break;
                        case 14:
                            i8 = 14;
                            break;
                        case 15:
                            i8 = 24;
                            break;
                    }
                    if (i29 == 11 || i29 == 12 || i29 == 13 || i29 == 14) {
                        if (!z5) {
                            i8 -= 2;
                        }
                        i10 = i8;
                        if (i30 == 0) {
                            i10 -= 4;
                        } else if (i30 == 1) {
                            i10 -= 2;
                        }
                    } else {
                        i10 = i8;
                    }
                } else {
                    int i31 = zzadwVar.zzc;
                    if (i31 > 0) {
                        i10 = i31 + 1;
                        if (zzadwVar.zzg == 4 && i10 == 17) {
                            i10 = 21;
                        }
                    } else {
                        int i32 = zzadwVar.zzg;
                        if (i32 == 0) {
                            i9 = 2;
                        } else if (i32 != 1) {
                            i9 = 2;
                            if (i32 == 2) {
                                i10 = i5;
                            } else if (i32 == 3) {
                                i10 = 10;
                            } else if (i32 != 4) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i32).length() + 33);
                                sb3.append("AC-4 level ");
                                sb3.append(i32);
                                sb3.append(" has not been defined.");
                                zzee.zzc("Ac4Util", sb3.toString());
                            } else {
                                i10 = 12;
                            }
                        } else {
                            i10 = 6;
                        }
                        i10 = i9;
                    }
                }
                if (i10 <= 0) {
                    throw zzat.zzc("Cannot determine channel count of presentation.");
                }
                Object[] objArr = {Integer.valueOf(zzj4), Integer.valueOf(zzadwVar.zzf), Integer.valueOf(zzadwVar.zzg)};
                String str3 = zzfj.zza;
                String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzm("audio/ac4");
                zztVar.zzE(i10);
                zztVar.zzF(i18);
                zztVar.zzq(zzqVar);
                zztVar.zze(str2);
                zztVar.zzj(format);
                return zztVar.zzM();
            }
            i14 = zzc;
            i7 = 7;
            int zzj12 = zzeqVar.zzj(7);
            for (int i33 = 0; i33 < zzj12; i33++) {
                zzeqVar.zzh(15);
            }
            if (zzj2 > 0) {
            }
            i5 = 8;
            i6 = 5;
            zzeqVar.zzm();
            if (zzj3 == 1) {
            }
            if (zzadwVar.zza) {
            }
            i8 = -1;
            if (zzadwVar.zza) {
            }
            if (i10 <= 0) {
            }
        }
        i5 = 8;
        i6 = 5;
        i7 = 7;
        i8 = -1;
        if (zzadwVar.zza) {
        }
        if (i10 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        if (r11 != 11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r11 != 11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r11 != 8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzadx zzb(zzeq zzeqVar) {
        int i5;
        int i6;
        int zzj;
        int zzj2 = zzeqVar.zzj(16);
        int zzj3 = zzeqVar.zzj(16);
        if (zzj3 == 65535) {
            zzj3 = zzeqVar.zzj(24);
            i5 = 7;
        } else {
            i5 = 4;
        }
        int i7 = zzj3 + i5;
        if (zzj2 == 44097) {
            i7 += 2;
        }
        int i8 = i7;
        int zzj4 = zzeqVar.zzj(2);
        int i9 = 0;
        if (zzj4 == 3) {
            int i10 = 0;
            while (true) {
                zzj = zzeqVar.zzj(2) + i10;
                if (!zzeqVar.zzi()) {
                    break;
                }
                i10 = (zzj + 1) << 2;
            }
            zzj4 = zzj + 3;
        }
        int i11 = zzj4;
        int zzj5 = zzeqVar.zzj(10);
        if (zzeqVar.zzi() && zzeqVar.zzj(3) > 0) {
            zzeqVar.zzh(2);
        }
        int i12 = 48000;
        if (true != zzeqVar.zzi()) {
            i6 = 48000;
            i12 = 44100;
        } else {
            i6 = 48000;
        }
        int zzj6 = zzeqVar.zzj(4);
        if (i12 == 44100 && zzj6 == 13) {
            i9 = zzb[13];
        } else if (i12 == i6 && zzj6 < 14) {
            i9 = zzb[zzj6];
            int i13 = zzj5 % 5;
            if (i13 != 1) {
                if (i13 == 2) {
                    if (zzj6 != 8) {
                    }
                    i9++;
                } else if (i13 != 3) {
                    if (i13 == 4) {
                        if (zzj6 != 3) {
                            if (zzj6 != 8) {
                            }
                        }
                        i9++;
                    }
                }
            }
            if (zzj6 != 3) {
            }
            i9++;
        }
        return new zzadx(i11, 2, i12, i8, i9, null);
    }

    public static void zzc(int i5, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] zzi = zzerVar.zzi();
        zzi[0] = -84;
        zzi[1] = 64;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i5 >> 16) & 255);
        zzi[5] = (byte) ((i5 >> 8) & 255);
        zzi[6] = (byte) (i5 & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) {
        int zzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int zzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzadwVar.zzb = zzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) {
        zzeqVar.zzh(2);
        boolean zzi = zzeqVar.zzi();
        int zzj = zzeqVar.zzj(8);
        for (int i5 = 0; i5 < zzj; i5++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) {
        int zzj = zzeqVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzj)));
        }
        zzeqVar.zzh(zzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
