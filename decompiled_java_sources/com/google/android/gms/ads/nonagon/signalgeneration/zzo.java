package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdye;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import x2.c;

/* loaded from: classes.dex */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdye zzd;
    private final ExecutorService zze;

    public zzo(Context context, zzdye zzdyeVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdyeVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z4) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z4);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzo.this.zzf(z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z4, boolean z5) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z4);
                Map map = this.zza;
                Boolean valueOf = Boolean.valueOf(z4);
                zzq zzqVar = (zzq) map.get(valueOf);
                int i5 = 0;
                if (z5 && zzqVar != null) {
                    try {
                        i5 = zzqVar.zzd() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                zzq zzqVar2 = (zzq) map.get(valueOf);
                final zzp zzpVar = new zzp(this, z4, i5, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zze()), this.zzd);
                final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
                    this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzo.this.zzg(build, zzpVar);
                        }
                    });
                } else {
                    QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzpVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void zzj(zzq zzqVar, Pair pair, boolean z4) {
        zzqVar.zzf();
        QueryInfo zza = zzqVar.zza();
        if (zza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzb());
        }
        zzdye zzdyeVar = this.zzd;
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zzaa.zze(zzdyeVar, null, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z4)), new Pair("sgpc_rs", Boolean.toString(zzqVar.zza() != null)));
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzo.this.zzd(obj, pair);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(final boolean z4, zzq zzqVar) {
        List list;
        try {
            Map map = this.zza;
            Boolean valueOf = Boolean.valueOf(z4);
            zzq zzqVar2 = (zzq) map.get(valueOf);
            if (zzqVar2 != null) {
                if (!zzqVar2.zzc()) {
                    if (zzqVar2.zza() != null) {
                        if (zzqVar.zza() != null) {
                        }
                        long longValue = (zzqVar.zza() == null ? (Long) zzbjj.zzf.zze() : (Long) zzbjj.zzg.zze()).longValue();
                        final boolean z5 = zzqVar.zza() != null;
                        zzcei.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzo.this.zze(z4, z5);
                            }
                        }, longValue, TimeUnit.SECONDS);
                        Map map2 = this.zzb;
                        list = (List) map2.get(valueOf);
                        map2.put(valueOf, new ArrayList());
                        if (list == null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                zzj(zzqVar, (Pair) it.next(), false);
                            }
                        }
                    }
                }
            }
            map.put(valueOf, zzqVar);
            long longValue2 = (zzqVar.zza() == null ? (Long) zzbjj.zzf.zze() : (Long) zzbjj.zzg.zze()).longValue();
            if (zzqVar.zza() != null) {
            }
            zzcei.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzo.this.zze(z4, z5);
                }
            }, longValue2, TimeUnit.SECONDS);
            Map map22 = this.zzb;
            list = (List) map22.get(valueOf);
            map22.put(valueOf, new ArrayList());
            if (list == null) {
            }
        } finally {
        }
    }

    public final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean z4 = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (zza != null) {
                z4 = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z4);
        zzq zzqVar = (zzq) map.get(valueOf);
        if (zzqVar != null && !zzqVar.zzc()) {
            zzj(zzqVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List list = (List) map2.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    public final /* synthetic */ void zzf(boolean z4) {
        zze(z4, false);
    }

    public final /* synthetic */ Object zzg(AdRequest adRequest, zzp zzpVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }
}
