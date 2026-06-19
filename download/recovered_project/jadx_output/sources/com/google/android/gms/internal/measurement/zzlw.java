package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmn();
    }

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    public static Object zzC(int i5, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzkgVar.zza(intValue)) {
                    obj = zzD(i5, intValue, obj, zzmlVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Integer num = (Integer) list.get(i7);
            int intValue2 = num.intValue();
            if (zzkgVar.zza(intValue2)) {
                if (i7 != i6) {
                    list.set(i6, num);
                }
                i6++;
            } else {
                obj = zzD(i5, intValue2, obj, zzmlVar);
            }
        }
        if (i6 == size) {
            return obj;
        }
        list.subList(i6, size).clear();
        return obj;
    }

    public static Object zzD(int i5, int i6, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i5, i6);
        return obj;
    }

    public static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i5, list, z4);
    }

    public static void zzI(int i5, List list, zznd zzndVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i5, list);
    }

    public static void zzJ(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i5, list, z4);
    }

    public static void zzK(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i5, list, z4);
    }

    public static void zzL(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i5, list, z4);
    }

    public static void zzM(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i5, list, z4);
    }

    public static void zzN(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i5, list, z4);
    }

    public static void zzO(int i5, List list, zznd zzndVar, zzlu zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zzjk) zzndVar).zzq(i5, list.get(i6), zzluVar);
        }
    }

    public static void zzP(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i5, list, z4);
    }

    public static void zzQ(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i5, list, z4);
    }

    public static void zzR(int i5, List list, zznd zzndVar, zzlu zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zzjk) zzndVar).zzv(i5, list.get(i6), zzluVar);
        }
    }

    public static void zzS(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i5, list, z4);
    }

    public static void zzT(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i5, list, z4);
    }

    public static void zzU(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i5, list, z4);
    }

    public static void zzV(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i5, list, z4);
    }

    public static void zzW(int i5, List list, zznd zzndVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i5, list);
    }

    public static void zzX(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i5, list, z4);
    }

    public static void zzY(int i5, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i5, list, z4);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i5 << 3) + 1) * size;
    }

    public static void zzaa(zzle zzleVar, Object obj, Object obj2, long j2) {
        zzmv.zzs(obj, j2, zzle.zzb(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2)));
    }

    private static zzml zzab(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i5) * size;
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzz += zzjj.zzt((zzjb) list.get(i6));
        }
        return zzz;
    }

    public static int zzd(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zze(list);
    }

    public static int zze(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzjj.zzv(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzkd zzkdVar = (zzkd) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzjj.zzv(zzkdVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzf(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i5 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i5 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i5, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += zzjj.zzu(i5, (zzlj) list.get(i7), zzluVar);
        }
        return i6;
    }

    public static int zzk(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzjj.zzv(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzkd zzkdVar = (zzkd) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzjj.zzv(zzkdVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzm(int i5, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzjj.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzky zzkyVar = (zzky) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzjj.zzB(zzkyVar.zza(i5));
            i5++;
        }
        return i7;
    }

    public static int zzo(int i5, Object obj, zzlu zzluVar) {
        if (!(obj instanceof zzkp)) {
            return zzjj.zzx((zzlj) obj, zzluVar) + zzjj.zzA(i5 << 3);
        }
        int zzA = zzjj.zzA(i5 << 3);
        int zza2 = ((zzkp) obj).zza();
        return u.x(zza2, zza2, zzA);
    }

    public static int zzp(int i5, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i5) * size;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            zzz = (obj instanceof zzkp ? zzjj.zzw((zzkp) obj) : zzjj.zzx((zzlj) obj, zzluVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i6;
        }
        zzkd zzkdVar = (zzkd) list;
        int i7 = 0;
        while (i5 < size) {
            int zze = zzkdVar.zze(i5);
            i7 += zzjj.zzA((zze >> 31) ^ (zze + zze));
            i5++;
        }
        return i7;
    }

    public static int zzs(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return i6;
        }
        zzky zzkyVar = (zzky) list;
        int i7 = 0;
        while (i5 < size) {
            long zza2 = zzkyVar.zza(i5);
            i7 += zzjj.zzB((zza2 >> 63) ^ (zza2 + zza2));
            i5++;
        }
        return i7;
    }

    public static int zzu(int i5, List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i5) * size;
        if (!(list instanceof zzkr)) {
            while (i6 < size) {
                Object obj = list.get(i6);
                zzz = (obj instanceof zzjb ? zzjj.zzt((zzjb) obj) : zzjj.zzy((String) obj)) + zzz;
                i6++;
            }
            return zzz;
        }
        zzkr zzkrVar = (zzkr) list;
        while (i6 < size) {
            Object zzf = zzkrVar.zzf(i6);
            zzz = (zzf instanceof zzjb ? zzjj.zzt((zzjb) zzf) : zzjj.zzy((String) zzf)) + zzz;
            i6++;
        }
        return zzz;
    }

    public static int zzv(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzjj.zzA(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzkd zzkdVar = (zzkd) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzjj.zzA(zzkdVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzx(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i5) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzjj.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzky zzkyVar = (zzky) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzjj.zzB(zzkyVar.zza(i5));
            i5++;
        }
        return i7;
    }

    public static zzml zzz() {
        return zzb;
    }
}
