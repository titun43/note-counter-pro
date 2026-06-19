package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b3.e;
import com.google.android.gms.common.internal.b0;
import com.lokhnathtechnical.notecounterpro.R;
import d3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x2.b;
import x2.c;

/* loaded from: classes.dex */
public final class zzee {
    private static volatile zzee zzc;
    protected final b zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final a zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcc zzj;

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        String packageName;
        Application application;
        Resources resources;
        String packageName2;
        int identifier;
        String string;
        if (str == null || !zzV(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = c.f3703a;
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new a();
        this.zzf = new ArrayList();
        try {
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            resources = context.getResources();
            if (TextUtils.isEmpty(packageName)) {
                try {
                    packageName2 = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                } catch (Resources.NotFoundException unused2) {
                    packageName2 = context.getPackageName();
                }
                packageName = packageName2;
            }
            identifier = resources.getIdentifier("google_app_id", "string", packageName);
        } catch (IllegalStateException unused3) {
        }
        if (identifier != 0) {
            try {
                string = resources.getString(identifier);
            } catch (Resources.NotFoundException unused4) {
            }
            if (string != null && !zzR()) {
                this.zzi = null;
                this.zzh = true;
                Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
            if (zzV(str2, str3)) {
                this.zzi = "fa";
                if (str2 == null || str3 == null) {
                    if ((str3 == null) ^ (str2 == null)) {
                        Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                } else {
                    Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                }
            } else {
                this.zzi = str2;
            }
            zzU(new zzcx(this, str2, str3, context, bundle));
            application = (Application) context.getApplicationContext();
            if (application != null) {
                Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
                return;
            } else {
                application.registerActivityLifecycleCallbacks(new zzed(this));
                return;
            }
        }
        string = null;
        if (string != null) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (zzV(str2, str3)) {
        }
        zzU(new zzcx(this, str2, str3, context, bundle));
        application = (Application) context.getApplicationContext();
        if (application != null) {
        }
    }

    public static final boolean zzR() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS(Exception exc, boolean z4, boolean z5) {
        zzee zzeeVar;
        Exception exc2;
        this.zzh |= z4;
        if (z4) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z5) {
            zzeeVar = this;
            exc2 = exc;
            zzeeVar.zzA(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            zzeeVar = this;
            exc2 = exc;
        }
        Log.w(zzeeVar.zzd, "Error with data collection. Data lost.", exc2);
    }

    private final void zzT(String str, String str2, Bundle bundle, boolean z4, boolean z5, Long l5) {
        zzU(new zzdr(this, l5, str, str2, bundle, z4, z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(zzdt zzdtVar) {
        this.zzb.execute(zzdtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzV(String str, String str2) {
        return (str2 == null || str == null || zzR()) ? false : true;
    }

    public static zzee zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        b0.g(context);
        if (zzc == null) {
            synchronized (zzee.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzee(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public final void zzA(int i5, String str, Object obj, Object obj2, Object obj3) {
        zzU(new zzdg(this, false, 5, str, obj, null, null));
    }

    public final void zzB(e3.b bVar) {
        b0.g(bVar);
        synchronized (this.zzf) {
            for (int i5 = 0; i5 < this.zzf.size(); i5++) {
                try {
                    if (bVar.equals(((Pair) this.zzf.get(i5)).first)) {
                        Log.w(this.zzd, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdv zzdvVar = new zzdv(bVar);
            this.zzf.add(new Pair(bVar, zzdvVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdp(this, zzdvVar));
        }
    }

    public final void zzC() {
        zzU(new zzcv(this));
    }

    public final void zzD(Bundle bundle) {
        zzU(new zzcn(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        zzU(new zzct(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        zzU(new zzcu(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        zzU(new zzcr(this, activity, str, str2));
    }

    public final void zzH(boolean z4) {
        zzU(new zzdm(this, z4));
    }

    public final void zzI(Bundle bundle) {
        zzU(new zzdn(this, bundle));
    }

    public final void zzJ(e3.a aVar) {
        zzdu zzduVar = new zzdu(aVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzduVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzU(new zzdo(this, zzduVar));
    }

    public final void zzK(Boolean bool) {
        zzU(new zzcs(this, bool));
    }

    public final void zzL(long j2) {
        zzU(new zzcw(this, j2));
    }

    public final void zzM(String str) {
        zzU(new zzcq(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z4) {
        zzU(new zzds(this, str, str2, obj, z4));
    }

    public final void zzO(e3.b bVar) {
        Pair pair;
        b0.g(bVar);
        synchronized (this.zzf) {
            int i5 = 0;
            while (true) {
                try {
                    if (i5 >= this.zzf.size()) {
                        pair = null;
                        break;
                    } else {
                        if (bVar.equals(((Pair) this.zzf.get(i5)).first)) {
                            pair = (Pair) this.zzf.get(i5);
                            break;
                        }
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzdv zzdvVar = (zzdv) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdq(this, zzdvVar));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdj(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zze(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdc(this, zzbzVar));
        Long l5 = (Long) zzbz.zze(zzbzVar.zzb(500L), Long.class);
        if (l5 != null) {
            return l5.longValue();
        }
        long nanoTime = System.nanoTime();
        ((c) this.zza).getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i5 = this.zzg + 1;
        this.zzg = i5;
        return nextLong + i5;
    }

    public final Bundle zzc(Bundle bundle, boolean z4) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdh(this, bundle, zzbzVar));
        if (z4) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final a zzd() {
        return this.zze;
    }

    public final zzcc zzf(Context context, boolean z4) {
        try {
            return zzcb.asInterface(e.c(context, e.f718c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (b3.b e4) {
            zzS(e4, true, false);
            return null;
        }
    }

    public final Object zzh(int i5) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdl(this, zzbzVar, i5));
        return zzbz.zze(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdk(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdb(this, zzbzVar));
        return zzbzVar.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzde(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdd(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzda(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzcp(this, str, str2, zzbzVar));
        List list = (List) zzbz.zze(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map zzq(String str, String str2, boolean z4) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdf(this, str, str2, z4, zzbzVar));
        Bundle zzb = zzbzVar.zzb(5000L);
        if (zzb == null || zzb.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(zzb.size());
        for (String str3 : zzb.keySet()) {
            Object obj = zzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzu(String str) {
        zzU(new zzcy(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        zzU(new zzco(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        zzU(new zzcz(this, str));
    }

    public final void zzx(String str, Bundle bundle) {
        zzT(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        zzT(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j2) {
        zzT(str, str2, bundle, true, false, Long.valueOf(j2));
    }
}
