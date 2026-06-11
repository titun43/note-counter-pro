package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.h1;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzbyp implements zzbyr {
    public static zzbyr zza;
    static zzbyr zzb;
    static zzbyr zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbyp(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        zzbgv zzbgvVar;
        String str;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfym.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String str2 = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziZ)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = z2.c.a(context).c(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.zzk = packageInfo;
                zzbgvVar = zzbhe.zziN;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    str = Locale.getDefault().getCountry();
                }
                this.zzl = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    Context context2 = this.zzg;
                    Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    if (context2 != null) {
                        try {
                            PackageInfo c5 = z2.c.a(context2).c(128, "com.android.vending");
                            if (c5 != null) {
                                str2 = Integer.toString(c5.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.zzm = str2;
                if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziJ)).intValue() <= 0) {
                    this.zzp = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.zzk = packageInfo;
        zzbgvVar = zzbhe.zziN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
        }
        this.zzl = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
        }
        this.zzm = str2;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziJ)).intValue() <= 0) {
        }
    }

    public static zzbyr zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbyp(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbyq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbyr zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z4 = false;
                    if (((Boolean) zzbiw.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziH)).booleanValue() || ((Boolean) zzbiw.zza.zze()).booleanValue()) {
                            z4 = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbyp zzbypVar = new zzbyp(context, versionInfoParcel);
                        zzbypVar.zzl();
                        zzbypVar.zzk();
                        zzc = zzbypVar;
                    } else if (!z4 || context == null) {
                        zzc = new zzbyq();
                    } else {
                        zzbyp zzbypVar2 = new zzbyp(context, versionInfoParcel, true);
                        zzbypVar2.zzl();
                        zzbypVar2.zzk();
                        zzc = zzbypVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public static zzbyr zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziI)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziH)).booleanValue() && context != null) {
                            zzb = new zzbyp(context, VersionInfoParcel.forPackage());
                        }
                    }
                    zzb = new zzbyq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static zzbyr zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziI)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziH)).booleanValue()) {
                            zzb = new zzbyp(context, versionInfoParcel);
                        }
                    }
                    zzb = new zzbyq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzgrt.zza(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoh)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziH)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbym(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbyn(this, thread.getUncaughtExceptionHandler()));
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z4 |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    z5 |= zzbyp.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziJ)).intValue();
            if (intValue > 0) {
                if (this.zzp.size() >= intValue) {
                    return;
                }
                String zzf = zzf(th);
                if (this.zzp.contains(zzf)) {
                    return;
                } else {
                    this.zzp.add(zzf);
                }
            }
            if (!z4 || z5) {
                return;
            }
            if (!this.zzo) {
                zzh(th, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbiw.zzc.zze()).booleanValue()) {
                return;
            }
            zzbgp.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(Throwable th, String str, float f5) {
        Throwable th2;
        boolean z4;
        String str2;
        PackageInfo c5;
        ActivityManager.MemoryInfo zze2;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        int i5 = 0;
        if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcW)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z5 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z5) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze3 = zze(th);
            String zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkf)).booleanValue() ? zzf(th) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            double d5 = f5;
            double random = Math.random();
            int i6 = f5 > 0.0f ? (int) (1.0f / f5) : 1;
            if (random < d5) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z4 = z2.c.a(this.zzg).d();
                } catch (Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th5);
                    z4 = false;
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Bridge.CAPACITOR_HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z4)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i7 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i7));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = h1.b(new StringBuilder(String.valueOf(str3).length() + 1 + str4.length()), str3, " ", str4);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str4);
                VersionInfoParcel versionInfoParcel = this.zzj;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze3).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i6)).appendQueryParameter("pb_tm", String.valueOf(zzbjn.zzc.zze()));
                Context context = this.zzg;
                t2.f.f3374b.getClass();
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(t2.f.a(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter5.appendQueryParameter("hash", zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziO)).booleanValue() && (zze2 = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    appendQueryParameter5.appendQueryParameter("available_memory", Long.toString(zze2.availMem));
                    appendQueryParameter5.appendQueryParameter("total_memory", Long.toString(zze2.totalMem));
                    appendQueryParameter5.appendQueryParameter("is_low_memory", true != zze2.lowMemory ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziN)).booleanValue()) {
                    String str5 = this.zzl;
                    if (!TextUtils.isEmpty(str5)) {
                        appendQueryParameter5.appendQueryParameter("countrycode", str5);
                    }
                    String str6 = this.zzm;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter5.appendQueryParameter("psv", str6);
                    }
                    if (i7 >= 26) {
                        c5 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                c5 = z2.c.a(context).c(128, "com.android.webview");
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        c5 = null;
                    }
                    if (c5 != null) {
                        appendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(c5.versionCode));
                        appendQueryParameter5.appendQueryParameter("wvvn", c5.versionName);
                        appendQueryParameter5.appendQueryParameter("wvpn", c5.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    appendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(appendQueryParameter5.toString());
                int size = arrayList2.size();
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    final String str7 = (String) obj;
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.client.zzu.this.zzc(str7, null);
                        }
                    });
                }
            }
        }
    }

    public zzbyp(Context context, VersionInfoParcel versionInfoParcel, boolean z4) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
