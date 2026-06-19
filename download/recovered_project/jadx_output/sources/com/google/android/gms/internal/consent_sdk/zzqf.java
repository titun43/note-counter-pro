package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzqf {
    private static final zzqf zzd = new zzqf(true);
    final zzsi zza = new zzsd();
    boolean zzb;
    boolean zzc;

    private zzqf() {
    }

    public static int zza(zzsz zzszVar, int i5, Object obj) {
        int zzC = zzpv.zzC(i5 << 3);
        if (zzszVar == zzsz.zzj) {
            zzC += zzC;
        }
        return zzC + zzb(zzszVar, obj);
    }

    public static int zzb(zzsz zzszVar, Object obj) {
        int zzd2;
        int zzC;
        zzsz zzszVar2 = zzsz.zza;
        zzta zztaVar = zzta.INT;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i5 = zzpv.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i6 = zzpv.zzf;
                return 4;
            case 2:
                return zzpv.zzD(((Long) obj).longValue());
            case 3:
                return zzpv.zzD(((Long) obj).longValue());
            case 4:
                return zzpv.zzD(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i7 = zzpv.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i8 = zzpv.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i9 = zzpv.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzpm)) {
                    return zzpv.zzB((String) obj);
                }
                int i10 = zzpv.zzf;
                zzd2 = ((zzpm) obj).zzd();
                zzC = zzpv.zzC(zzd2);
                break;
            case 9:
                return ((zzrq) obj).zzn();
            case 10:
                if (!(obj instanceof zzqz)) {
                    return zzpv.zzA((zzrq) obj);
                }
                zzd2 = ((zzqz) obj).zza();
                zzC = zzpv.zzC(zzd2);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    int i11 = zzpv.zzf;
                    zzd2 = ((byte[]) obj).length;
                    zzC = zzpv.zzC(zzd2);
                    break;
                } else {
                    int i12 = zzpv.zzf;
                    zzd2 = ((zzpm) obj).zzd();
                    zzC = zzpv.zzC(zzd2);
                    break;
                }
            case 12:
                return zzpv.zzC(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzqo ? zzpv.zzD(((zzqo) obj).zza()) : zzpv.zzD(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i13 = zzpv.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i14 = zzpv.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzC + zzd2;
    }

    public static int zzc(zzqe zzqeVar, Object obj) {
        zzsz zzb = zzqeVar.zzb();
        int zza = zzqeVar.zza();
        if (!zzqeVar.zze()) {
            return zza(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i5 = 0;
        if (!zzqeVar.zzd()) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zza(zzb, zza, list.get(i5));
                i5++;
            }
            return i6;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i7 = 0;
        while (i5 < size) {
            i7 += zzb(zzb, list.get(i5));
            i5++;
        }
        return zzpv.zzC(i7) + zzpv.zzC(zza << 3) + i7;
    }

    public static zzqf zze() {
        return zzd;
    }

    public static void zzi(zzpv zzpvVar, zzsz zzszVar, int i5, Object obj) {
        if (zzszVar == zzsz.zzj) {
            zzpvVar.zzu(i5, 3);
            ((zzrq) obj).zzB(zzpvVar);
            zzpvVar.zzu(i5, 4);
            return;
        }
        zzpvVar.zzu(i5, zzszVar.zza());
        zzta zztaVar = zzta.INT;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.zzo(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.zzJ(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.zzt((String) obj);
                    break;
                } else {
                    zzpvVar.zzi((zzpm) obj);
                    break;
                }
            case 9:
                ((zzrq) obj).zzB(zzpvVar);
                break;
            case 10:
                zzpvVar.zzp((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.zzL(bArr, 0, bArr.length);
                    break;
                } else {
                    zzpvVar.zzi((zzpm) obj);
                    break;
                }
            case 12:
                zzpvVar.zzw(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.zzo(((Integer) obj).intValue());
                    break;
                } else {
                    zzpvVar.zzo(((zzqo) obj).zza());
                    break;
                }
            case 14:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzpvVar.zzw((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzpvVar.zzy((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzqe zzqeVar = (zzqe) entry.getKey();
        if (zzqeVar.zzc() != zzta.MESSAGE) {
            return true;
        }
        if (!zzqeVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!zzl(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzrr) {
            return ((zzrr) obj).zzo();
        }
        if (obj instanceof zzqz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i5;
        int zzC;
        int zzA;
        zzqe zzqeVar = (zzqe) entry.getKey();
        Object value = entry.getValue();
        if (zzqeVar.zzc() != zzta.MESSAGE || zzqeVar.zze() || zzqeVar.zzd()) {
            return zzc(zzqeVar, value);
        }
        if (value instanceof zzqz) {
            int zza = ((zzqe) entry.getKey()).zza();
            int zzC2 = zzpv.zzC(8);
            i5 = zzC2 + zzC2;
            zzC = zzpv.zzC(zza) + zzpv.zzC(16);
            int zzC3 = zzpv.zzC(24);
            int zza2 = ((zzqz) value).zza();
            zzA = u.v(zza2, zza2, zzC3);
        } else {
            int zza3 = ((zzqe) entry.getKey()).zza();
            int zzC4 = zzpv.zzC(8);
            i5 = zzC4 + zzC4;
            zzC = zzpv.zzC(zza3) + zzpv.zzC(16);
            zzA = zzpv.zzA((zzrq) value) + zzpv.zzC(24);
        }
        return i5 + zzC + zzA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzqe zzqeVar, Object obj) {
        boolean z4;
        zzqeVar.zzb();
        byte[] bArr = zzqs.zzb;
        obj.getClass();
        zzsz zzszVar = zzsz.zza;
        zzta zztaVar = zzta.INT;
        switch (r0.zzb()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzpm) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzqo)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzrq) || (obj instanceof zzqz)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzqf zzqfVar = new zzqf();
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Map.Entry zzg = zzsiVar.zzg(i5);
            zzqfVar.zzh((zzqe) ((zzse) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzsiVar.zzd()) {
            zzqfVar.zzh((zzqe) entry.getKey(), entry.getValue());
        }
        zzqfVar.zzc = this.zzc;
        return zzqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqf) {
            return this.zza.equals(((zzqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        int i5 = 0;
        for (int i6 = 0; i6 < zzc; i6++) {
            i5 += zzm(zzsiVar.zzg(i6));
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            i5 += zzm((Map.Entry) it.next());
        }
        return i5;
    }

    public final Iterator zzf() {
        zzsi zzsiVar = this.zza;
        return zzsiVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzqx(zzsiVar.entrySet().iterator()) : zzsiVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Object value = zzsiVar.zzg(i5).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).zzx();
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzqm) {
                ((zzqm) value2).zzx();
            }
        }
        zzsiVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzqe zzqeVar, Object obj) {
        if (!zzqeVar.zze()) {
            zzn(zzqeVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = list.get(i5);
                zzn(zzqeVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzqz) {
            this.zzc = true;
        }
        this.zza.put(zzqeVar, obj);
    }

    public final boolean zzj() {
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            if (!zzk(zzsiVar.zzg(i5))) {
                return false;
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzqf(boolean z4) {
        zzg();
        zzg();
    }
}
