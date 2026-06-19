package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0032, B:15:0x0038, B:17:0x0041, B:19:0x0049, B:25:0x0068, B:27:0x009c, B:29:0x00a6, B:30:0x00ae, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00d4, B:38:0x00dd, B:40:0x00e3, B:43:0x00f1, B:46:0x00f7, B:47:0x0109, B:49:0x010f, B:52:0x0121, B:55:0x0129, B:67:0x013a, B:70:0x0142, B:73:0x0148, B:76:0x0151, B:85:0x015a, B:88:0x0079, B:89:0x008a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j2, int i5, long j5) {
        int i6;
        ArrayDeque arrayDeque;
        Long l5;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
                if (i5 == 2) {
                    zzdza zzdzaVar = new zzdza();
                    zzdzaVar.zza(j2);
                    zzdzaVar.zzb(1);
                    zzdzf zzc = zzdzaVar.zzc();
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzc);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            map.remove(zzc);
                        }
                    }
                    i5 = 2;
                }
                zzdza zzdzaVar2 = new zzdza();
                zzdzaVar2.zza(j2);
                zzdzaVar2.zzb(i5);
                zzdzf zzc2 = zzdzaVar2.zzc();
                int zzb = zzc2.zzb();
                if (zzb != 0) {
                    if (zzb == 1) {
                        i6 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziV)).intValue();
                    } else if (zzb == 2) {
                        i6 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziW)).intValue();
                    } else if (zzb == 3) {
                        i6 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziX)).intValue();
                    }
                    if (i6 > 0) {
                        Map map2 = this.zza;
                        ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzc2);
                        if (arrayDeque3 == null) {
                            arrayDeque3 = new ArrayDeque();
                            map2.put(zzc2, arrayDeque3);
                        }
                        arrayDeque3.addLast(Long.valueOf(j5));
                        while (arrayDeque3.size() > i6) {
                            arrayDeque3.removeFirst();
                        }
                        zzc();
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziY)).intValue();
                        if (intValue <= 0) {
                            map2.clear();
                            return;
                        }
                        while (true) {
                            Iterator it = map2.values().iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                i7 += ((ArrayDeque) it.next()).size();
                            }
                            if (i7 <= intValue) {
                                break;
                            }
                            if (!map2.isEmpty()) {
                                Long l6 = Long.MAX_VALUE;
                                Map.Entry entry = null;
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                    if (!arrayDeque4.isEmpty() && (l5 = (Long) arrayDeque4.peekFirst()) != null && l5.longValue() < l6.longValue()) {
                                        entry = entry2;
                                        l6 = l5;
                                    }
                                }
                                if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                    arrayDeque.removeFirst();
                                    if (arrayDeque.isEmpty()) {
                                        map2.remove(entry.getKey());
                                    }
                                }
                            }
                        }
                    }
                }
                i6 = 0;
                if (i6 > 0) {
                }
            }
        } finally {
        }
    }

    public final synchronized Map zzb() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        long j2;
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdzf zzdzfVar = (zzdzf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int zzb = zzdzfVar.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    j2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziS)).longValue();
                } else if (zzb == 2) {
                    j2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziT)).longValue();
                } else if (zzb == 3) {
                    j2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziU)).longValue();
                }
                if (j2 == 0) {
                    it.remove();
                    j2 = 0;
                }
                if (j2 <= 0) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && currentTimeMillis - ((Long) it2.next()).longValue() > j2) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j2 = 0;
            if (j2 == 0) {
            }
            if (j2 <= 0) {
            }
        }
    }
}
