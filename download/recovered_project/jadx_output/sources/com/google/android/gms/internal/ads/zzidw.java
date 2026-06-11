package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    static {
        int i5 = zziaa.zza;
        zzb = new zzieh();
    }

    public static int zzA(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zziaw.zzA(i5 << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zziaw.zzA(i5 << 3) + 8) * size;
    }

    public static int zzD(int i5, Object obj, zzidu zziduVar) {
        int i6 = i5 << 3;
        if (obj instanceof zzicm) {
            int zzA = zziaw.zzA(i6);
            int zzb2 = ((zzicm) obj).zzb();
            return u.c(zzb2, zzb2, zzA);
        }
        int zzA2 = zziaw.zzA(i6);
        int zzaT = ((zzhzw) obj).zzaT(zziduVar);
        return u.c(zzaT, zzaT, zzA2);
    }

    @Deprecated
    public static int zzE(int i5, zzidc zzidcVar, zzidu zziduVar) {
        int zzA = zziaw.zzA(i5 << 3);
        return ((zzhzw) zzidcVar).zzaT(zziduVar) + zzA + zzA;
    }

    public static zzief zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        zzieg zziegVar2 = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar2)) {
            if (zzieg.zza().equals(zziegVar)) {
                zziegVar = zzieg.zzc(zziegVar, zziegVar2);
            } else {
                zziegVar.zzm(zziegVar2);
            }
        }
        zzibrVar.zzt = zziegVar;
    }

    public static Object zzJ(Object obj, int i5, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(intValue)) {
                    obj2 = zzK(obj, i5, intValue, obj2, zziefVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Integer num = (Integer) list.get(i7);
            int intValue2 = num.intValue();
            if (zzibxVar.zza(intValue2)) {
                if (i7 != i6) {
                    list.set(i6, num);
                }
                i6++;
            } else {
                obj2 = zzK(obj, i5, intValue2, obj2, zziefVar);
            }
        }
        if (i6 != size) {
            list.subList(i6, size).clear();
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i5, int i6, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i5, i6);
        return obj2;
    }

    public static void zza(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i5, list, z4);
    }

    public static void zzb(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i5, list, z4);
    }

    public static void zzc(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i5, list, z4);
    }

    public static void zzd(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i5, list, z4);
    }

    public static void zze(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i5, list, z4);
    }

    public static void zzf(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i5, list, z4);
    }

    public static void zzg(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i5, list, z4);
    }

    public static void zzh(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i5, list, z4);
    }

    public static void zzi(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i5, list, z4);
    }

    public static void zzj(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i5, list, z4);
    }

    public static void zzk(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i5, list, z4);
    }

    public static void zzl(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i5, list, z4);
    }

    public static void zzm(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i5, list, z4);
    }

    public static void zzn(int i5, List list, zzieu zzieuVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i5, list, z4);
    }

    public static void zzo(int i5, List list, zzieu zzieuVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i5, list);
    }

    public static void zzp(int i5, List list, zzieu zzieuVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i5, list);
    }

    public static void zzq(int i5, List list, zzieu zzieuVar, zzidu zziduVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zziax) zzieuVar).zzr(i5, list.get(i6), zziduVar);
        }
    }

    public static void zzr(int i5, List list, zzieu zzieuVar, zzidu zziduVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zziax) zzieuVar).zzs(i5, list.get(i6), zziduVar);
        }
    }

    public static int zzs(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zziaw.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzicq zzicqVar = (zzicq) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zziaw.zzB(zzicqVar.zzc(i5));
            i5++;
        }
        return i7;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zziaw.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzicq zzicqVar = (zzicq) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zziaw.zzB(zzicqVar.zzc(i5));
            i5++;
        }
        return i7;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 += zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return i6;
        }
        zzicq zzicqVar = (zzicq) list;
        int i7 = 0;
        while (i5 < size) {
            long zzc = zzicqVar.zzc(i5);
            i7 += zziaw.zzB((zzc >> 63) ^ (zzc + zzc));
            i5++;
        }
        return i7;
    }

    public static int zzv(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zziaw.zzB(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzibs zzibsVar = (zzibs) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zziaw.zzB(zzibsVar.zzf(i5));
            i5++;
        }
        return i7;
    }

    public static int zzw(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zziaw.zzB(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzibs zzibsVar = (zzibs) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zziaw.zzB(zzibsVar.zzf(i5));
            i5++;
        }
        return i7;
    }

    public static int zzx(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zziaw.zzA(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzibs zzibsVar = (zzibs) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zziaw.zzA(zzibsVar.zzf(i5));
            i5++;
        }
        return i7;
    }

    public static int zzy(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 += zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i6;
        }
        zzibs zzibsVar = (zzibs) list;
        int i7 = 0;
        while (i5 < size) {
            int zzf = zzibsVar.zzf(i5);
            i7 += zziaw.zzA((zzf >> 31) ^ (zzf + zzf));
            i5++;
        }
        return i7;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
