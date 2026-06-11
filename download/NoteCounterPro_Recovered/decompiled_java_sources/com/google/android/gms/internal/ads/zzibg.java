package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzibg {
    private static final zzibg zzd = new zzibg(true);
    final zzieb zza = new zzidx();
    boolean zzb;
    boolean zzc;

    private zzibg() {
    }

    public static zzibg zza() {
        return zzd;
    }

    public static void zzf(zziaw zziawVar, zzies zziesVar, int i5, Object obj) {
        if (zziesVar == zzies.zzj) {
            zziawVar.zzH(i5, 3);
            ((zzidc) obj).zzcX(zziawVar);
            zziawVar.zzH(i5, 4);
            return;
        }
        zziawVar.zzH(i5, zziesVar.zzb());
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziawVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zziawVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zziawVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzian)) {
                    zziawVar.zzx((String) obj);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case 9:
                ((zzidc) obj).zzcX(zziawVar);
                break;
            case 10:
                zziawVar.zzp((zzidc) obj);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    zziawVar.zzm(bArr, 0, bArr.length);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case 12:
                zziawVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzibv)) {
                    zziawVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zziawVar.zzr(((zzibv) obj).zza());
                    break;
                }
            case 14:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zziawVar.zzs((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zziawVar.zzu((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int zzh(zzies zziesVar, int i5, Object obj) {
        int zzA = zziaw.zzA(i5 << 3);
        if (zziesVar == zzies.zzj) {
            zzA += zzA;
        }
        return zzA + zzi(zziesVar, obj);
    }

    public static int zzi(zzies zziesVar, Object obj) {
        int zzc;
        int zzA;
        zzies zziesVar2 = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i5 = zziaw.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i6 = zziaw.zzf;
                return 4;
            case 2:
                return zziaw.zzB(((Long) obj).longValue());
            case 3:
                return zziaw.zzB(((Long) obj).longValue());
            case 4:
                return zziaw.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i7 = zziaw.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i8 = zziaw.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i9 = zziaw.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzian)) {
                    int i10 = zziaw.zzf;
                    zzc = zzier.zzc((String) obj);
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i11 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case 9:
                return ((zzidc) obj).zzbr();
            case 10:
                if (!(obj instanceof zzicl)) {
                    return zziaw.zzC((zzidc) obj);
                }
                zzc = ((zzicl) obj).zzb();
                zzA = zziaw.zzA(zzc);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    int i12 = zziaw.zzf;
                    zzc = ((byte[]) obj).length;
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i13 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case 12:
                return zziaw.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzibv ? zziaw.zzB(((zzibv) obj).zza()) : zziaw.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i14 = zziaw.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i15 = zziaw.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzA + zzc;
    }

    public static int zzj(zzibf zzibfVar, Object obj) {
        zzies zzb = zzibfVar.zzb();
        int zza = zzibfVar.zza();
        if (!zzibfVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i5 = 0;
        if (!zzibfVar.zze()) {
            int i6 = 0;
            while (i5 < size) {
                i6 += zzh(zzb, zza, list.get(i5));
                i5++;
            }
            return i6;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i7 = 0;
        while (i5 < size) {
            i7 += zzi(zzb, list.get(i5));
            i5++;
        }
        return zziaw.zzA(i7) + zziaw.zzA(zza << 3) + i7;
    }

    private static boolean zzk(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() != zziet.MESSAGE) {
            return true;
        }
        if (!zzibfVar.zzd()) {
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
        if (obj instanceof zzidd) {
            return ((zzidd) obj).zzbi();
        }
        if (obj instanceof zzicl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i5;
        int zzA;
        int zzC;
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() != zziet.MESSAGE || zzibfVar.zzd() || zzibfVar.zze()) {
            return zzj(zzibfVar, value);
        }
        if (value instanceof zzicl) {
            int zza = ((zzibf) entry.getKey()).zza();
            int zzA2 = zziaw.zzA(8);
            i5 = zzA2 + zzA2;
            zzA = zziaw.zzA(zza) + zziaw.zzA(16);
            int zzA3 = zziaw.zzA(24);
            int zzb = ((zzicl) value).zzb();
            zzC = u.c(zzb, zzb, zzA3);
        } else {
            int zza2 = ((zzibf) entry.getKey()).zza();
            int zzA4 = zziaw.zzA(8);
            i5 = zzA4 + zzA4;
            zzA = zziaw.zzA(zza2) + zziaw.zzA(16);
            zzC = zziaw.zzC((zzidc) value) + zziaw.zzA(24);
        }
        return i5 + zzA + zzC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzibf zzibfVar, Object obj) {
        boolean z4;
        zzibfVar.zzb();
        byte[] bArr = zzice.zzb;
        obj.getClass();
        zzies zziesVar = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzian) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzibv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzidc) || (obj instanceof zzicl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzibg zzibgVar = new zzibg();
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Map.Entry zzd2 = zziebVar.zzd(i5);
            zzibgVar.zzd((zzibf) ((zzidy) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zziebVar.zze()) {
            zzibgVar.zzd((zzibf) entry.getKey(), entry.getValue());
        }
        zzibgVar.zzc = this.zzc;
        return zzibgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibg) {
            return this.zza.equals(((zzibg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Object value = zziebVar.zzd(i5).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).zzbm();
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzibr) {
                ((zzibr) value2).zzbm();
            }
        }
        zziebVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzieb zziebVar = this.zza;
        return zziebVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzick(zziebVar.entrySet().iterator()) : zziebVar.entrySet().iterator();
    }

    public final void zzd(zzibf zzibfVar, Object obj) {
        if (!zzibfVar.zzd()) {
            zzn(zzibfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = list.get(i5);
                zzn(zzibfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzicl) {
            this.zzc = true;
        }
        this.zza.put(zzibfVar, obj);
    }

    public final boolean zze() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            if (!zzk(zziebVar.zzd(i5))) {
                return false;
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        int i5 = 0;
        for (int i6 = 0; i6 < zzc; i6++) {
            i5 += zzm(zziebVar.zzd(i6));
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            i5 += zzm((Map.Entry) it.next());
        }
        return i5;
    }

    private zzibg(boolean z4) {
        zzb();
        zzb();
    }
}
