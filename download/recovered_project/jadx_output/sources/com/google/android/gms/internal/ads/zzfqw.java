package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzfqw {
    private final Map zza;
    private final zzfsb zzb;
    private final zzfrf zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final x2.b zzg;
    private AtomicInteger zzh;
    private final zzfqr zzi;

    public zzfqw(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, x2.b bVar, zzfqr zzfqrVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfsbVar;
        this.zzc = zzfrfVar;
        this.zzd = context;
        this.zzg = bVar;
        this.zzi = zzfqrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzl(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z4) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzfsa zzfsaVar : ((Map) it.next()).values()) {
                    if (z4) {
                        zzfsaVar.zzj();
                    } else {
                        zzfsaVar.zzi();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfrf zzfrfVar = this.zzc;
        ((x2.c) this.zzg).getClass();
        zzfrfVar.zze(System.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        if (zzfsaVar != null && adFormat.equals(zzfsaVar.zzo())) {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, zzfsaVar.zzo());
            zzfrlVar.zza(str);
            zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
            zzfrfVar.zzf(System.currentTimeMillis(), zzfrmVar, zzfsaVar.zze.zzd, zzfsaVar.zzp(), "2");
            try {
                String zzk = zzfsaVar.zzk();
                Object zzg = zzfsaVar.zzg();
                Object cast = zzg == null ? null : cls.cast(zzg);
                if (cast != null) {
                    zzfrfVar.zzh(System.currentTimeMillis(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzk, zzfrmVar, "2");
                }
                return cast;
            } catch (ClassCastException e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "PreloadAdManager.pollAd");
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e4);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int ordinal;
        try {
            Map map = this.zza;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            ordinal = adFormat.ordinal();
        } finally {
        }
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfu)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzft)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfs)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfsa zzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e4) {
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e4);
                            }
                        }
                    }
                }
                if (!x2.d.f() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfqu(this));
                    } catch (RuntimeException e5) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e5);
                        this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfqv(this));
            }
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzb.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzc;
                    zzb.zzl(zzfrfVar);
                    zzfqr zzfqrVar = this.zzi;
                    if (zzfqrVar != null) {
                        zzfqrVar.zzd(str, adFormat, zzb);
                    } else {
                        zzb.zzd();
                    }
                    ((Map) map.get(adFormat)).put(str, zzb);
                    zzfrl zzfrlVar = new zzfrl(zzftVar.zza, adFormat);
                    zzfrlVar.zza(str);
                    zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
                    int i7 = zzftVar.zzd;
                    ((x2.c) this.zzg).getClass();
                    zzfrfVar.zza(i7, System.currentTimeMillis(), zzfrmVar, "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfrm zzfrmVar;
        try {
            ((x2.c) this.zzg).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Map map = this.zza;
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            String zzk = zzfsaVar == null ? null : zzfsaVar.zzk();
            boolean z4 = zzk != null && adFormat.equals(zzfsaVar.zzo());
            Long valueOf = z4 ? Long.valueOf(System.currentTimeMillis()) : null;
            if (zzfsaVar == null) {
                zzfrmVar = null;
            } else {
                zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, adFormat);
                zzfrlVar.zza(str);
                zzfrmVar = new zzfrm(zzfrlVar, null);
            }
            this.zzc.zzd(zzfsaVar == null ? 0 : zzfsaVar.zze.zzd, zzfsaVar != null ? zzfsaVar.zzp() : 0, currentTimeMillis, valueOf, zzk, zzfrmVar, "2");
            return z4;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzo(zzcaz.class, AdFormat.REWARDED, str);
    }

    public final synchronized zzbex zzd(String str) {
        return (zzbex) zzo(zzbex.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            zzfrf zzfrfVar = this.zzc;
            ((x2.c) this.zzg).getClass();
            zzfrfVar.zzo(System.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd, zzfsaVar != null ? zzfsaVar.zzp() : -1);
            if (zzfsaVar != null) {
                return zzfsaVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        int zzp = zzfsaVar != null ? zzfsaVar.zzp() : 0;
        zzfrf zzfrfVar = this.zzc;
        ((x2.c) this.zzg).getClass();
        zzfrfVar.zzp(zzp, System.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd);
        return zzp;
    }

    public final synchronized Map zzh(int i5) {
        try {
            HashMap hashMap = new HashMap();
            AdFormat adFormat = AdFormat.getAdFormat(i5);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    for (zzfsa zzfsaVar : ((Map) map.get(adFormat)).values()) {
                        hashMap.put(zzfsaVar.zzn(), zzfsaVar.zze);
                    }
                    zzfrf zzfrfVar = this.zzc;
                    ((x2.c) this.zzg).getClass();
                    zzfrfVar.zzn(adFormat, System.currentTimeMillis(), hashMap.size());
                    return hashMap;
                }
            }
            return hashMap;
        } finally {
        }
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfsa zzfsaVar;
        try {
            Map map = this.zza;
            if (map.containsKey(adFormat) && (zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str)) != null) {
                ((Map) map.get(adFormat)).remove(str);
                zzfsaVar.zzh();
                zzfqr zzfqrVar = this.zzi;
                if (zzfqrVar != null) {
                    zzfqrVar.zze(str, adFormat);
                }
                zzfsaVar.zzr();
                zzfrf zzfrfVar = this.zzc;
                ((x2.c) this.zzg).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                com.google.android.gms.ads.internal.client.zzft zzftVar = zzfsaVar.zze;
                zzfrfVar.zzm(currentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfsaVar.zzp());
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized void zzj(int i5) {
        try {
            AdFormat adFormat = AdFormat.getAdFormat(i5);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfsa zzfsaVar = (zzfsa) map2.get(str);
                        if (zzfsaVar != null) {
                            zzfsaVar.zzh();
                            zzfqr zzfqrVar = this.zzi;
                            if (zzfqrVar != null) {
                                zzfqrVar.zze(str, adFormat);
                            }
                            zzfsaVar.zzr();
                            String valueOf = String.valueOf(str);
                            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    map2.clear();
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
                    zzfrf zzfrfVar = this.zzc;
                    ((x2.c) this.zzg).getClass();
                    zzfrfVar.zzl(System.currentTimeMillis(), adFormat, size);
                }
            }
        } finally {
        }
    }
}
