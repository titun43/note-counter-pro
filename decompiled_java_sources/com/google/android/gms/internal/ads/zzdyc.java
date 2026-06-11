package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdyc implements zzfnv {
    private final zzdxt zzb;
    private final x2.b zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdyc(zzdxt zzdxtVar, Set set, x2.b bVar) {
        this.zzb = zzdxtVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyb zzdybVar = (zzdyb) it.next();
            this.zzd.put(zzdybVar.zzc(), zzdybVar);
        }
        this.zzc = bVar;
    }

    private final void zze(zzfno zzfnoVar, boolean z4) {
        zzdyb zzdybVar = (zzdyb) this.zzd.get(zzfnoVar);
        if (zzdybVar == null) {
            return;
        }
        String str = true != z4 ? "f." : "s.";
        Map map = this.zza;
        zzfno zzb = zzdybVar.zzb();
        if (map.containsKey(zzb)) {
            ((x2.c) this.zzc).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzb)).longValue();
            zzdxt zzdxtVar = this.zzb;
            String zza = zzdybVar.zza();
            Map zzc = zzdxtVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        ((x2.c) this.zzc).getClass();
        this.zza.put(zzfnoVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            ((x2.c) this.zzc).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            ((x2.c) this.zzc).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, true);
        }
    }
}
