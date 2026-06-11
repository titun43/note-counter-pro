package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzekl {
    private final String zzc;
    private zzfiu zzd = null;
    private zzfir zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzekl(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfir zzfirVar, int i5) {
        Map map = this.zzb;
        String zzl = zzl(zzfirVar);
        if (map.containsKey(zzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfirVar.zzv;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfirVar.zzE, 0L, null, bundle, zzfirVar.zzF, zzfirVar.zzG, zzfirVar.zzH, zzfirVar.zzI);
        try {
            this.zza.add(i5, zzvVar);
        } catch (IndexOutOfBoundsException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzl, zzvVar);
    }

    private final void zzk(zzfir zzfirVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z4) {
        Map map = this.zzb;
        String zzl = zzl(zzfirVar);
        if (map.containsKey(zzl)) {
            if (this.zze == null) {
                this.zze = zzfirVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(zzl);
            zzvVar.zzb = j2;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhH)).booleanValue() && z4) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfir zzfirVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() ? zzfirVar.zzap : zzfirVar.zzw;
    }

    public final void zza(zzfiu zzfiuVar) {
        this.zzd = zzfiuVar;
    }

    public final void zzb(zzfir zzfirVar) {
        zzj(zzfirVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int indexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfir) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzd(zzfir zzfirVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfirVar, j2, null, true);
    }

    public final void zze(zzfir zzfirVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfirVar, j2, zzeVar, false);
    }

    public final zzday zzf() {
        return new zzday(this.zze, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfir zzfirVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfirVar));
        List list = this.zza;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
