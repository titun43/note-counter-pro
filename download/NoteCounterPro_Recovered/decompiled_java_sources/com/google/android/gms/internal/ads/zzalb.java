package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzagc zza(zzaev zzaevVar) {
        return zzc(zzaevVar, true, false);
    }

    public static zzagc zzb(zzaev zzaevVar, boolean z4) {
        return zzc(zzaevVar, false, z4);
    }

    private static zzagc zzc(zzaev zzaevVar, boolean z4, boolean z5) {
        zzagc zzagcVar;
        long j2;
        zzer zzerVar;
        int i5;
        int i6;
        long j5;
        int i7;
        int i8;
        int[] iArr;
        long zzo = zzaevVar.zzo();
        long j6 = -1;
        long j7 = 4096;
        if (zzo != -1 && zzo <= 4096) {
            j7 = zzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i9 = (int) j7;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            zzerVar2.zza(8);
            if (!zzaevVar.zzh(zzerVar2.zzi(), i10, 8, true)) {
                break;
            }
            long zzz = zzerVar2.zzz();
            int zzB = zzerVar2.zzB();
            if (zzz == 1) {
                j2 = j6;
                zzaevVar.zzi(zzerVar2.zzi(), 8, 8);
                i5 = 16;
                zzerVar2.zzf(16);
                zzz = zzerVar2.zzD();
                zzerVar = zzerVar2;
            } else {
                j2 = j6;
                if (zzz == 0) {
                    long zzo2 = zzaevVar.zzo();
                    if (zzo2 != j2) {
                        zzz = (zzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar2;
                i5 = 8;
            }
            long j8 = zzz;
            zzagcVar = null;
            long j9 = i5;
            if (j8 < j9) {
                i6 = 1;
                if (zzB == 1718773093) {
                    if (i5 == 8) {
                        j8 = 8;
                        zzB = 1718773093;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new zzajv(zzB, j8, i5);
            }
            i6 = 1;
            i11 += i5;
            if (zzB == 1836019574) {
                i9 += (int) j8;
                if (zzo != -1 && i9 > zzo) {
                    i9 = (int) zzo;
                }
                zzerVar2 = zzerVar;
                j6 = j2;
                i10 = 0;
            } else {
                if (zzB == 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                    j5 = zzo;
                    i7 = 0;
                } else {
                    if (zzB == 1836019558 || zzB == 1836475768) {
                        i10 = i6;
                        break;
                    }
                    i12 |= (zzB == 1835295092 ? 0 : i6) ^ 1;
                    if (zzB == 1937007212) {
                        if (j8 > 1000000) {
                            i10 = 0;
                            break;
                        }
                        zzB = 1937007212;
                    }
                    j5 = zzo;
                    if ((i11 + j8) - j9 >= i9) {
                        i10 = 0;
                        break;
                    }
                    int i13 = (int) (j8 - j9);
                    i11 += i13;
                    if (zzB != 1718909296) {
                        i7 = 0;
                        if (i13 != 0) {
                            zzaevVar.zzk(i13);
                        }
                    } else {
                        if (i13 < 8) {
                            return new zzajv(1718909296, i13, 8);
                        }
                        zzerVar.zza(i13);
                        i7 = 0;
                        zzaevVar.zzi(zzerVar.zzi(), 0, i13);
                        int zzB2 = zzerVar.zzB();
                        int i14 = (zzd(zzB2, z5) ? 1 : 0) | i12;
                        zzerVar.zzk(4);
                        int zzd = zzerVar.zzd() / 4;
                        if (i14 == 0 && zzd > 0) {
                            iArr = new int[zzd];
                            int i15 = 0;
                            while (true) {
                                if (i15 >= zzd) {
                                    i8 = i14;
                                    break;
                                }
                                int zzB3 = zzerVar.zzB();
                                iArr[i15] = zzB3;
                                if (zzd(zzB3, z5)) {
                                    i8 = i6;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i8 = i14;
                            iArr = null;
                        }
                        if (i8 == 0) {
                            return new zzalg(zzB2, iArr);
                        }
                        i12 = i8;
                    }
                }
                i10 = i7;
                zzerVar2 = zzerVar;
                zzo = j5;
                j6 = j2;
            }
        }
        zzagcVar = null;
        return i12 == 0 ? zzakx.zza : z4 != i10 ? i10 != 0 ? zzakp.zza : zzakp.zzb : zzagcVar;
    }

    private static boolean zzd(int i5, boolean z4) {
        if ((i5 >>> 8) == 3368816) {
            return true;
        }
        if (i5 == 1751476579) {
            if (z4) {
                return true;
            }
            i5 = 1751476579;
        }
        int[] iArr = zza;
        for (int i6 = 0; i6 < 29; i6++) {
            if (iArr[i6] == i5) {
                return true;
            }
        }
        return false;
    }
}
