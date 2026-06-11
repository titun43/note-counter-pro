package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.List;

/* loaded from: classes.dex */
final class zziz {
    public static final /* synthetic */ int zza = 0;
    private static final zzjj zzb;

    static {
        int i5 = zziu.zza;
        zzb = new zzjl();
    }

    public static void zzA(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzC(i5, list, z4);
    }

    public static void zzB(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzE(i5, list, z4);
    }

    public static void zzC(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzJ(i5, list, z4);
    }

    public static void zzD(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzL(i5, list, z4);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzgr.zzA(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzhl zzhlVar = (zzhl) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzgr.zzA(zzhlVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzb(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgr.zzz(i5 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgr.zzz(i5 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzgr.zzA(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzhl zzhlVar = (zzhl) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzgr.zzA(zzhlVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzgr.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzib zzibVar = (zzib) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzgr.zzA(zzibVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzh(int i5, Object obj, zzix zzixVar) {
        int i6 = i5 << 3;
        if (!(obj instanceof zzhx)) {
            return zzgr.zzx((zzim) obj, zzixVar) + zzgr.zzz(i6);
        }
        int zzz = zzgr.zzz(i6);
        int zza2 = ((zzhx) obj).zza();
        return u.z(zza2, zza2, zzz);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 += zzgr.zzz((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i6;
        }
        zzhl zzhlVar = (zzhl) list;
        int i7 = 0;
        while (i5 < size) {
            int zze = zzhlVar.zze(i5);
            i7 += zzgr.zzz((zze >> 31) ^ (zze + zze));
            i5++;
        }
        return i7;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 += zzgr.zzA((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return i6;
        }
        zzib zzibVar = (zzib) list;
        int i7 = 0;
        while (i5 < size) {
            long zze = zzibVar.zze(i5);
            i7 += zzgr.zzA((zze >> 63) ^ (zze + zze));
            i5++;
        }
        return i7;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzgr.zzz(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzhl zzhlVar = (zzhl) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzgr.zzz(zzhlVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzgr.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzib zzibVar = (zzib) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzgr.zzA(zzibVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static zzjj zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i5, int i6, Object obj2, zzjj zzjjVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzhk zzhkVar = (zzhk) obj;
            zzjk zzjkVar = zzhkVar.zzc;
            obj3 = zzjkVar;
            if (zzjkVar == zzjk.zzc()) {
                zzjk zzf = zzjk.zzf();
                zzhkVar.zzc = zzf;
                obj3 = zzf;
            }
        }
        ((zzjk) obj3).zzj(i5 << 3, Long.valueOf(i6));
        return obj3;
    }

    public static void zzo(zzgx zzgxVar, Object obj, Object obj2) {
        if (((zzhh) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzjj zzjjVar, Object obj, Object obj2) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        zzjk zzjkVar2 = ((zzhk) obj2).zzc;
        if (!zzjk.zzc().equals(zzjkVar2)) {
            if (zzjk.zzc().equals(zzjkVar)) {
                zzjkVar = zzjk.zze(zzjkVar, zzjkVar2);
            } else {
                zzjkVar.zzd(zzjkVar2);
            }
        }
        zzhkVar.zzc = zzjkVar;
    }

    public static void zzq(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzc(i5, list, z4);
    }

    public static void zzr(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzg(i5, list, z4);
    }

    public static void zzs(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzj(i5, list, z4);
    }

    public static void zzt(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzl(i5, list, z4);
    }

    public static void zzu(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzn(i5, list, z4);
    }

    public static void zzv(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzp(i5, list, z4);
    }

    public static void zzw(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzs(i5, list, z4);
    }

    public static void zzx(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzu(i5, list, z4);
    }

    public static void zzy(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzy(i5, list, z4);
    }

    public static void zzz(int i5, List list, zzjw zzjwVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzA(i5, list, z4);
    }
}
