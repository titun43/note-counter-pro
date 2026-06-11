package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzccq {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi = new Object();

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean zzr(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaT)).booleanValue()) {
            return false;
        }
        if (b3.e.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaU)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaV)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzs(Context context, String str, String str2, Bundle bundle) {
        if (zza(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e4) {
                String valueOf = String.valueOf(str2);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid event ID: ".concat(valueOf), e4);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                ConcurrentMap concurrentMap = this.zzh;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzt(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzh;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    zzw(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final Object zzv(String str, Context context) {
        AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final void zzw(String str, boolean z4) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        String b2 = h1.b(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(b2);
        if (z4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z4) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            zzw("getInstance", z4);
            return false;
        }
    }

    public final boolean zza(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaL)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaW)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.zze;
            if (atomicInteger.get() == -1) {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                if (!com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 12451000)) {
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void zzb(Context context, com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        zzccr.zzb(context).zza().zzc(zzfvVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaY)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzc(Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaY)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzd(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zze(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final String zzf(Context context) {
        if (zza(context)) {
            AtomicReference atomicReference = this.zzf;
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzt(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) zzt(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    return str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
                } catch (Exception unused) {
                    zzw("getCurrentScreenName", false);
                }
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Deprecated
    public final void zzg(Context context, String str) {
        if (zza(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final String zzh(Context context) {
        if (!zza(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzv("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzi(final Context context) {
        if (!zza(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaR)).longValue();
        if (longValue < 0) {
            return (String) zzv("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            zzbgv zzbgvVar = zzbhe.zzaS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcco(this));
            while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
            }
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzccp
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzccq.this.zzp(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzj(Context context) {
        Object zzv;
        if (zza(context) && (zzv = zzv("generateEventId", context)) != null) {
            return zzv.toString();
        }
        return null;
    }

    public final void zzk(Context context, String str, Map map) {
        zzs(context, "_ac", str, zzq(map));
    }

    public final void zzl(Context context, String str, Map map) {
        zzs(context, "_ai", str, zzq(map));
    }

    public final void zzm(Context context, String str) {
        zzs(context, "_aq", str, null);
    }

    public final void zzn(Context context, String str) {
        zzs(context, "_aa", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i5) {
        if (zza(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i5);
            zzs(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i5).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i5);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    public final /* synthetic */ String zzp(Context context) {
        return (String) zzv("getAppInstanceId", context);
    }
}
