package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class zzbht {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbht(boolean z4, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbhq zzf() {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return new zzbhq(SystemClock.elapsedRealtime(), null, null);
    }

    public final void zza(zzbht zzbhtVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbhq zzbhqVar, long j2, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbhq(j2, strArr[0], zzbhqVar));
        }
        return true;
    }

    public final zzbhs zzc() {
        zzbhs zzbhsVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbhq> list = this.zza;
                for (zzbhq zzbhqVar : list) {
                    long zza = zzbhqVar.zza();
                    String zzb = zzbhqVar.zzb();
                    zzbhq zzc = zzbhqVar.zzc();
                    if (zzc != null && zza > 0) {
                        long zza2 = zza - zzc.zza();
                        sb.append(zzb);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                                sb2.append('+');
                                sb2.append(zzb);
                            } else {
                                hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                            }
                        }
                    }
                }
                list.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                        sb3.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbhsVar = new zzbhs(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbhsVar;
    }

    public final void zzd(String str, String str2) {
        zzbhj zza;
        if (TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbhp zzd = zza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
