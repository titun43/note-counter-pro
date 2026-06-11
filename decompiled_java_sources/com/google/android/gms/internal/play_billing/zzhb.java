package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzhb {
    private static final zzhb zzb = new zzhb(true);
    final zzjf zza = new zzja();
    private boolean zzc;
    private boolean zzd;

    private zzhb() {
    }

    public static int zza(zzju zzjuVar, int i5, Object obj) {
        zzgr.zzz(i5 << 3);
        if (zzju.zzj == null) {
            byte[] bArr = zzhp.zzb;
            if (((zzim) obj) instanceof zzfw) {
                throw null;
            }
        }
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    public static int zzb(zzha zzhaVar, Object obj) {
        zzju zzb2 = zzhaVar.zzb();
        int zza = zzhaVar.zza();
        if (!zzhaVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zzhaVar.zzd()) {
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                i5 += zza(zzb2, zza, list.get(i6));
            }
            return i5;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return zzgr.zzz(0) + zzgr.zzz(zza << 3);
        }
        list.get(0);
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    public static zzhb zzd() {
        return zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzha zzhaVar = (zzha) entry.getKey();
        if (zzhaVar.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!zzhaVar.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!zzj(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzin) {
            return ((zzin) obj).zzl();
        }
        if (obj instanceof zzhw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i5;
        int zzz;
        int z4;
        zzha zzhaVar = (zzha) entry.getKey();
        Object value = entry.getValue();
        if (zzhaVar.zzc() != zzjv.MESSAGE || zzhaVar.zze() || zzhaVar.zzd()) {
            return zzb(zzhaVar, value);
        }
        if (value instanceof zzhw) {
            int zza = ((zzha) entry.getKey()).zza();
            int zzz2 = zzgr.zzz(8);
            i5 = zzz2 + zzz2;
            zzz = zzgr.zzz(zza) + zzgr.zzz(16);
            int zzz3 = zzgr.zzz(24);
            int zza2 = ((zzhw) value).zza();
            z4 = u.z(zza2, zza2, zzz3);
        } else {
            int zza3 = ((zzha) entry.getKey()).zza();
            int zzz4 = zzgr.zzz(8);
            i5 = zzz4 + zzz4;
            zzz = zzgr.zzz(zza3) + zzgr.zzz(16);
            int zzz5 = zzgr.zzz(24);
            int zzk = ((zzim) value).zzk();
            z4 = u.z(zzk, zzk, zzz5);
        }
        return i5 + zzz + z4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzl(zzha zzhaVar, Object obj) {
        boolean z4;
        zzhaVar.zzb();
        byte[] bArr = zzhp.zzb;
        obj.getClass();
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzim) || (obj instanceof zzhw)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzhb zzhbVar = new zzhb();
        int zzc = this.zza.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Map.Entry zzg = this.zza.zzg(i5);
            zzhbVar.zzg((zzha) ((zzjb) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhbVar.zzg((zzha) entry.getKey(), entry.getValue());
        }
        zzhbVar.zzd = this.zzd;
        return zzhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhb) {
            return this.zza.equals(((zzhb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int zzc = this.zza.zzc();
        int i5 = 0;
        for (int i6 = 0; i6 < zzc; i6++) {
            i5 += zzk(this.zza.zzg(i6));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i5 += zzk((Map.Entry) it.next());
        }
        return i5;
    }

    public final Iterator zze() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzhu(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            Object value = this.zza.zzg(i5).getValue();
            if (value instanceof zzhk) {
                ((zzhk) value).zzv();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhk) {
                ((zzhk) value2).zzv();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzg(zzha zzhaVar, Object obj) {
        if (!zzhaVar.zze()) {
            zzl(zzhaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = list.get(i5);
                zzl(zzhaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhw) {
            this.zzd = true;
        }
        this.zza.put(zzhaVar, obj);
    }

    public final boolean zzh() {
        int zzc = this.zza.zzc();
        for (int i5 = 0; i5 < zzc; i5++) {
            if (!zzi(this.zza.zzg(i5))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzhb(boolean z4) {
        zzf();
        zzf();
    }
}
