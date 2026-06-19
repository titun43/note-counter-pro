package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdyk {
    private final String zze;
    private final zzdye zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzdyk(String str, zzdye zzdyeVar) {
        this.zze = str;
        this.zzf = zzdyeVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        zza.put("tid", this.zza.zzx() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_started");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            zzg.put("rqe", str2);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "aaia");
            zzg.put("aair", "MalformedJson");
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue() && !this.zzd) {
                Map zzg = zzg();
                zzg.put("action", "init_finished");
                List list = this.zzb;
                list.add(zzg);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzf.zzb((Map) it.next());
                }
                this.zzd = true;
            }
        } finally {
        }
    }
}
