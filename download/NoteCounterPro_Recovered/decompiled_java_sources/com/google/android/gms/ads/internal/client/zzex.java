package com.google.android.gms.ads.internal.client;

import a3.b;
import android.content.Context;
import android.os.RemoteException;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zze;
    private zzep zzb;
    private zzfb zzc;
    private zzeo zzd;
    private zzdb zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();
    private OnAdInspectorClosedListener zzm = null;
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzB(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqg zzbqgVar = (zzbqg) it.next();
            hashMap.put(zzbqgVar.zza, new zzbqo(zzbqgVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqgVar.zzd, zzbqgVar.zzc));
        }
        return new zzbqp(hashMap);
    }

    private final void zzC(RequestConfiguration requestConfiguration) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zzr(new zzfv(requestConfiguration));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e4);
        }
    }

    private final void zzD(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(String str) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zze();
            this.zzl.zzj(null, new b(null));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e4);
        }
    }

    public static zzex zzb() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (zze == null) {
                    zze = new zzex();
                }
                zzexVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzexVar;
    }

    public final /* synthetic */ OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return this.zzb;
        }
        if (ordinal == 2) {
            return this.zzc;
        }
        if (ordinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            try {
                if (this.zzi) {
                    if (onInitializationCompleteListener != null) {
                        this.zzh.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zzj) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zzl());
                    }
                    return;
                }
                this.zzi = true;
                if (onInitializationCompleteListener != null) {
                    this.zzh.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzk) {
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        zzD(context);
                        zzdb zzdbVar = this.zzl;
                        if (zzdbVar != null) {
                            zzdbVar.zzp(new zzew(this, bArr));
                            this.zzl.zzo(new zzbtp());
                        }
                        if (this.zzn.getTagForChildDirectedTreatment() != -1 || this.zzn.getTagForUnderAgeOfConsent() != -1) {
                            zzC(this.zzn);
                        }
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e4);
                    } finally {
                    }
                    zzbhe.zza(context);
                    if (((Boolean) zzbjc.zza.zze()).booleanValue()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmE)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                            ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                            final Object[] objArr3 = objArr2 == true ? 1 : 0;
                            threadPoolExecutor.execute(new Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.zzeu
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzex.this.zzt(null);
                                }
                            });
                            this.zzb = new zzep(context);
                            this.zzc = new zzfb(context);
                            this.zzd = new zzeo(context);
                        }
                    }
                    if (((Boolean) zzbjc.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmE)).booleanValue()) {
                            ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                            final Object[] objArr4 = objArr == true ? 1 : 0;
                            executorService.execute(new Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.zzes
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzex.this.zzu(null);
                                }
                            });
                            this.zzb = new zzep(context);
                            this.zzc = new zzfb(context);
                            this.zzd = new zzeo(context);
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                    zzE(null);
                    this.zzb = new zzep(context);
                    this.zzc = new zzfb(context);
                    this.zzd = new zzeo(context);
                }
            } finally {
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzf) {
            this.zzj = false;
            this.zzi = false;
            this.zzh.clear();
        }
        synchronized (this.zzk) {
            try {
                zzdb zzdbVar = this.zzl;
                if (zzdbVar != null) {
                    zzdbVar.zzw();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e4);
            }
            this.zzl = null;
            zzep zzepVar = this.zzb;
            if (zzepVar != null) {
                zzepVar.zzg();
                this.zzb = null;
            }
            zzfb zzfbVar = this.zzc;
            if (zzfbVar != null) {
                zzfbVar.zzg();
                this.zzc = null;
            }
            zzeo zzeoVar = this.zzd;
            if (zzeoVar != null) {
                zzeoVar.zzg();
                this.zzd = null;
            }
        }
    }

    public final Status zze(Context context, List list, PreloadCallback preloadCallback) {
        boolean z4;
        Status status;
        zzbhe.zza(context);
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String valueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            String b2 = h1.b(new StringBuilder(valueOf.length() + 1 + String.valueOf(adUnitId).length()), valueOf, "#", adUnitId);
            hashMap.put(b2, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap, b2, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z4 = true;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                hashMap2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z4 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) zzbd.zzc().zzd(zzbhe.zzfu));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) zzbd.zzc().zzd(zzbhe.zzfs));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) zzbd.zzc().zzd(zzbhe.zzft));
        for (Map.Entry entry : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (intValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            status = new Status(13, sb2, null, null);
        } else {
            status = Status.f924k;
        }
        String str = status.h;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        b0.a(str, status.f929g <= 0);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzt(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzeq(this, preloadCallback));
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e4);
                return Status.f926m;
            }
        }
        return Status.f924k;
    }

    public final void zzf(float f5) {
        boolean z4 = true;
        b0.a("The app volume must be a value between 0 and 1 inclusive.", f5 >= 0.0f && f5 <= 1.0f);
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z4 = false;
            }
            b0.i("MobileAds.initialize() must be called prior to setting the app volume.", z4);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzf(f5);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e4);
            }
        }
    }

    public final float zzg() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            float f5 = 1.0f;
            if (zzdbVar == null) {
                return 1.0f;
            }
            try {
                f5 = zzdbVar.zzk();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e4);
            }
            return f5;
        }
    }

    public final void zzh(boolean z4) {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to setting app muted state.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzh(z4);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e4);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            boolean z4 = false;
            if (zzdbVar == null) {
                return false;
            }
            try {
                z4 = zzdbVar.zzl();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e4);
            }
            return z4;
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to opening debug menu.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzi(new b(context), str);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e4);
            }
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e4);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to getting initialization status.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzer(zzex.this));
                        return hashMap;
                    }
                };
            }
            try {
                return zzB(zzdbVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzer(zzex.this));
                        return hashMap;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.zzk) {
            zzD(context);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            try {
                zzD(context);
                zzdb zzdbVar = this.zzl;
                if (zzdbVar == null) {
                    return;
                }
                this.zzm = onAdInspectorClosedListener;
                try {
                    zzdbVar.zzt(new zzev(null));
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzo() {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to getting version string.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            try {
                return zzgrt.zza(zzdbVar.zzm());
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e4);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
    }

    public final RequestConfiguration zzp() {
        return this.zzn;
    }

    public final void zzq(RequestConfiguration requestConfiguration) {
        b0.a("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.zzk) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzn;
                this.zzn = requestConfiguration;
                if (this.zzl == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzC(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzr(boolean z4) {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zzdbVar.zzu(z4);
                return true;
            } catch (RemoteException e4) {
                String str = z4 ? "enable" : "disable";
                StringBuilder sb = new StringBuilder(str.length() + 40);
                sb.append("Unable to ");
                sb.append(str);
                sb.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb.toString(), e4);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.zzk) {
            b0.i("MobileAds.initialize() must be called prior to setting the plugin.", this.zzl != null);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzv(str);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e4);
            }
        }
    }

    public final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    public final /* synthetic */ void zzu(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    public final /* synthetic */ Object zzw() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzx() {
        return this.zzh;
    }

    public final /* synthetic */ void zzy(boolean z4) {
        this.zzi = false;
    }

    public final /* synthetic */ void zzz(boolean z4) {
        this.zzj = true;
    }
}
