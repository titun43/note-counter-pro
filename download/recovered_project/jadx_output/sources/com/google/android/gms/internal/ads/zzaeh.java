package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaeh {
    public static void zza(long j2, zzer zzerVar, zzagh[] zzaghVarArr) {
        int i5;
        while (true) {
            if (zzerVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzerVar);
            int zzc2 = zzc(zzerVar);
            int zzg = zzerVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzerVar.zzd()) {
                zzee.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzerVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzerVar.zzs();
                int zzt = zzerVar.zzt();
                if (zzt == 49) {
                    i5 = zzerVar.zzB();
                    zzt = 49;
                } else {
                    i5 = 0;
                }
                int zzs2 = zzerVar.zzs();
                if (zzt == 47) {
                    zzerVar.zzk(1);
                    zzt = 47;
                }
                boolean z4 = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z4 &= i5 == 1195456820;
                }
                if (z4) {
                    zzb(j2, zzerVar, zzaghVarArr);
                }
            }
            zzerVar.zzh(zzg);
        }
    }

    public static void zzb(long j2, zzer zzerVar, zzagh[] zzaghVarArr) {
        int zzs = zzerVar.zzs();
        if ((zzs & 64) != 0) {
            int i5 = zzs & 31;
            zzerVar.zzk(1);
            int zzg = zzerVar.zzg();
            for (zzagh zzaghVar : zzaghVarArr) {
                int i6 = i5 * 3;
                zzerVar.zzh(zzg);
                zzaghVar.zzc(zzerVar, i6);
                zzgrc.zzi(j2 != -9223372036854775807L);
                zzaghVar.zze(j2, 1, i6, 0, null);
            }
        }
    }

    private static int zzc(zzer zzerVar) {
        int i5 = 0;
        while (zzerVar.zzd() != 0) {
            int zzs = zzerVar.zzs();
            i5 += zzs;
            if (zzs != 255) {
                return i5;
            }
        }
        return -1;
    }
}
