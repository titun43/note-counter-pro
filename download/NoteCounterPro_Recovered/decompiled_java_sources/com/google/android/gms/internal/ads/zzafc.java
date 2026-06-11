package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzafc {
    public static boolean zza(zzer zzerVar, zzafh zzafhVar, int i5, zzafb zzafbVar) {
        int zzg = zzerVar.zzg();
        long zzz = zzerVar.zzz();
        long j2 = zzz >>> 16;
        if (j2 != i5) {
            return false;
        }
        boolean z4 = (j2 & 1) == 1;
        long j5 = zzz >> 12;
        long j6 = zzz >> 8;
        long j7 = zzz >> 4;
        long j8 = zzz >> 1;
        long j9 = zzz & 1;
        int i6 = (int) (j7 & 15);
        if (i6 <= 7) {
            if (i6 != zzafhVar.zzg - 1) {
                return false;
            }
        } else if (i6 > 10 || zzafhVar.zzg != 2) {
            return false;
        }
        int i7 = (int) (j8 & 7);
        if ((i7 != 0 && i7 != zzafhVar.zzi) || j9 == 1 || !zzd(zzerVar, zzafhVar, z4, zzafbVar)) {
            return false;
        }
        long j10 = zzafbVar.zza;
        int zzc = zzc(zzerVar, (int) (j5 & 15));
        long j11 = zzafhVar.zzj;
        boolean z5 = j11 == 0 || j10 + ((long) zzc) >= j11;
        if (zzc == -1) {
            return false;
        }
        if ((!z5 && zzc < zzafhVar.zza) || zzc > zzafhVar.zzb) {
            return false;
        }
        int i8 = zzafhVar.zze;
        int i9 = (int) (j6 & 15);
        if (i9 != 0) {
            if (i9 <= 11) {
                if (i9 != zzafhVar.zzf) {
                    return false;
                }
            } else if (i9 == 12) {
                if (zzerVar.zzs() * zzbgj.zzq.zzf != i8) {
                    return false;
                }
            } else {
                if (i9 > 14) {
                    return false;
                }
                int zzt = zzerVar.zzt();
                if (i9 == 14) {
                    zzt *= 10;
                }
                if (zzt != i8) {
                    return false;
                }
            }
        }
        if (zzerVar.zzs() != zzfj.zzI(zzerVar.zzi(), zzg, zzerVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzerVar.zzd() != 0) {
            int zzn = zzerVar.zzn();
            if ((zzn & 128) != 0) {
                return false;
            }
            int i10 = (zzn & 126) >> 1;
            if ((i10 >= 2 && i10 <= 7) || (i10 >= 13 && i10 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i10);
                zzee.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzaev zzaevVar, zzafh zzafhVar) {
        zzaevVar.zzl();
        zzaevVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaevVar.zzi(bArr, 0, 1);
        int i5 = bArr[0] & 1;
        boolean z4 = 1 == i5;
        zzaevVar.zzk(2);
        int i6 = 1 != i5 ? 6 : 7;
        zzer zzerVar = new zzer(i6);
        zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 0, i6));
        zzaevVar.zzl();
        zzafb zzafbVar = new zzafb();
        if (zzd(zzerVar, zzafhVar, z4, zzafbVar)) {
            return zzafbVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i5) {
        switch (i5) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i5 - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i5 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzer zzerVar, zzafh zzafhVar, boolean z4, zzafb zzafbVar) {
        try {
            long zzO = zzerVar.zzO();
            if (!z4) {
                zzO *= zzafhVar.zzb;
            }
            long j2 = zzafhVar.zzj;
            if (j2 != 0 && zzO > j2) {
                return false;
            }
            zzafbVar.zza = zzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
