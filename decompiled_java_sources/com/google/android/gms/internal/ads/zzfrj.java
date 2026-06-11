package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzfrj {
    private final zzfsb zzc;
    private final zzfrf zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final x2.b zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfrj(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, x2.b bVar) {
        this.zzc = zzfsbVar;
        this.zzd = zzfrfVar;
        this.zze = context;
        this.zzh = bVar;
    }

    public static String zzh(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return h1.b(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()), str, "#", name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzj(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z4) {
        try {
            if (z4) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfsa) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfsa) it2.next()).zzi();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzB)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
                String zzh = zzh(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
                hashSet.add(zzh);
                ConcurrentMap concurrentMap = this.zza;
                zzfsa zzfsaVar = (zzfsa) concurrentMap.get(zzh);
                if (zzfsaVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(zzh)) {
                        zzfsa zzfsaVar2 = (zzfsa) concurrentMap2.get(zzh);
                        if (zzfsaVar2.zze.equals(zzftVar)) {
                            zzfsaVar2.zzw(zzftVar.zzd);
                            zzfsaVar2.zzj();
                            concurrentMap.put(zzh, zzfsaVar2);
                            concurrentMap2.remove(zzh);
                        } else {
                            arrayList.add(zzftVar);
                        }
                    } else {
                        arrayList.add(zzftVar);
                    }
                } else if (zzfsaVar.zze.equals(zzftVar)) {
                    zzfsaVar.zzw(zzftVar.zzd);
                } else {
                    this.zzb.put(zzh, zzfsaVar);
                    concurrentMap.remove(zzh);
                    arrayList.add(zzftVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfsa) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfsa zzfsaVar3 = (zzfsa) ((Map.Entry) it3.next()).getValue();
                zzfsaVar3.zzh();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzA)).booleanValue()) {
                }
                zzfsaVar3.zzr();
                if (!zzfsaVar3.zzf()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzfsa zzfsaVar) {
        zzfsaVar.zzd();
        this.zza.put(str, zzfsaVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z4;
        try {
            ((x2.c) this.zzh).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzfsa zzq = zzq(str, adFormat);
            z4 = zzq != null && zzq.zzf();
            Long valueOf = z4 ? Long.valueOf(System.currentTimeMillis()) : null;
            zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
            int i5 = 0;
            zzfrf zzfrfVar = this.zzd;
            int i6 = zzq == null ? 0 : zzq.zze.zzd;
            if (zzq != null) {
                i5 = zzq.zzp();
            }
            zzfrfVar.zzd(i6, i5, currentTimeMillis, valueOf, zzq != null ? zzq.zzk() : null, zzfrmVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z4;
    }

    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
        zzfrf zzfrfVar = this.zzd;
        ((x2.c) this.zzh).getClass();
        zzfrfVar.zzf(System.currentTimeMillis(), zzfrmVar, -1, -1, "1");
        zzfsa zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            String zzk = zzq.zzk();
            Object zzg = zzq.zzg();
            Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzfrfVar.zzh(System.currentTimeMillis(), zzq.zze.zzd, zzq.zzp(), zzk, zzfrmVar, "1");
            }
            return cast;
        } catch (ClassCastException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e4);
            return null;
        }
    }

    private final synchronized zzfsa zzq(String str, AdFormat adFormat) {
        return (zzfsa) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e4) {
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e4);
                            }
                        }
                    }
                }
                if (!x2.d.f() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfri(this));
                    } catch (RuntimeException e5) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e5);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfrh(this));
            }
            List<com.google.android.gms.ads.internal.client.zzft> zzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : zzm) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzfsa zza = this.zzc.zza(zzftVar, zzceVar);
                if (adFormat != null && zza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zza.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzd;
                    zza.zzl(zzfrfVar);
                    zzn(zzh(str, adFormat), zza);
                    enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
                    int i7 = zzftVar.zzd;
                    ((x2.c) this.zzh).getClass();
                    zzfrfVar.zza(i7, System.currentTimeMillis(), zzfrmVar, "1");
                }
            }
            zzfrf zzfrfVar2 = this.zzd;
            ((x2.c) this.zzh).getClass();
            zzfrfVar2.zzb(enumMap, System.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzp(zzcaz.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbex zze(String str) {
        return (zzbex) zzp(zzbex.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
