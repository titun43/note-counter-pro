package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.util.List;

/* loaded from: classes.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i5 = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i5, list, z4);
    }

    public static void zzB(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i5, list, z4);
    }

    public static void zzC(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i5, list, z4);
    }

    public static void zzD(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i5, list, z4);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i5, zzrq zzrqVar, zzsa zzsaVar) {
        int zzC = zzpv.zzC(i5 << 3);
        return ((zzpa) zzrqVar).zzj(zzsaVar) + zzC + zzC;
    }

    public static int zzb(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzpv.zzD(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzqn zzqnVar = (zzqn) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzpv.zzD(zzqnVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzc(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.zzC(i5 << 3) + 4) * size;
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i5, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.zzC(i5 << 3) + 8) * size;
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzpv.zzD(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzqn zzqnVar = (zzqn) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzpv.zzD(zzqnVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzh(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzpv.zzD(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzre zzreVar = (zzre) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzpv.zzD(zzreVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzi(int i5, Object obj, zzsa zzsaVar) {
        int i6 = i5 << 3;
        if (obj instanceof zzra) {
            int zzC = zzpv.zzC(i6);
            int zza2 = ((zzra) obj).zza();
            return u.v(zza2, zza2, zzC);
        }
        int zzC2 = zzpv.zzC(i6);
        int zzj = ((zzpa) obj).zzj(zzsaVar);
        return u.v(zzj, zzj, zzC2);
    }

    public static int zzj(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 += zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i6;
        }
        zzqn zzqnVar = (zzqn) list;
        int i7 = 0;
        while (i5 < size) {
            int zze = zzqnVar.zze(i5);
            i7 += zzpv.zzC((zze >> 31) ^ (zze + zze));
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
        if (!(list instanceof zzre)) {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 += zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return i6;
        }
        zzre zzreVar = (zzre) list;
        int i7 = 0;
        while (i5 < size) {
            long zze = zzreVar.zze(i5);
            i7 += zzpv.zzD((zze >> 63) ^ (zze + zze));
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
        if (!(list instanceof zzqn)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzpv.zzC(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i6;
        }
        zzqn zzqnVar = (zzqn) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzpv.zzC(zzqnVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static int zzm(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzpv.zzD(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i6;
        }
        zzre zzreVar = (zzre) list;
        int i7 = 0;
        while (i5 < size) {
            i7 += zzpv.zzD(zzreVar.zze(i5));
            i5++;
        }
        return i7;
    }

    public static zzsp zzn() {
        return zzb;
    }

    public static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVar = zzqmVar.zzc;
        zzsq zzsqVar2 = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar2)) {
            if (zzsq.zzc().equals(zzsqVar)) {
                zzsqVar = zzsq.zze(zzsqVar, zzsqVar2);
            } else {
                zzsqVar.zzd(zzsqVar2);
            }
        }
        zzqmVar.zzc = zzsqVar;
    }

    public static void zzq(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i5, list, z4);
    }

    public static void zzr(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i5, list, z4);
    }

    public static void zzs(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i5, list, z4);
    }

    public static void zzt(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i5, list, z4);
    }

    public static void zzu(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i5, list, z4);
    }

    public static void zzv(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i5, list, z4);
    }

    public static void zzw(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i5, list, z4);
    }

    public static void zzx(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i5, list, z4);
    }

    public static void zzy(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i5, list, z4);
    }

    public static void zzz(int i5, List list, zztb zztbVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i5, list, z4);
    }
}
