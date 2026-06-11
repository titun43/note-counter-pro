package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeak {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdvp zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdyk zzl;
    private final VersionInfoParcel zzm;
    private final zzdil zzo;
    private final zzfor zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcen zze = new zzcen();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzeak(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvp zzdvpVar, ScheduledExecutorService scheduledExecutorService, zzdyk zzdykVar, VersionInfoParcel versionInfoParcel, zzdil zzdilVar, zzfor zzforVar) {
        this.zzh = zzdvpVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdykVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdilVar;
        this.zzp = zzforVar;
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzm("com.google.android.gms.ads.MobileAds", false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
    }

    private final synchronized j3.a zzu() {
        String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(zzd)) {
            return zzgzo.zza(zzd);
        }
        final zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeak.this.zzg(zzcenVar);
            }
        });
        return zzcenVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z4, String str2, int i5) {
        this.zzn.put(str, new zzbqg(str, z4, i5, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzbqn zzbqnVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbqnVar.zzb(zzeak.this.zzd());
                } catch (RemoteException e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbjk.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzct)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzcen zzcenVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeac
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzeak.this.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzcenVar.addListener(runnable, executor);
                        this.zza = true;
                        j3.a zzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeae
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzeak.this.zzh();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcv)).longValue(), TimeUnit.SECONDS);
                        zzgzo.zzr(zzu, new zzeaa(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbqg zzbqgVar = (zzbqg) map.get(str);
            arrayList.add(new zzbqg(str, zzbqgVar.zzb, zzbqgVar.zzc, zzbqgVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(final zzcen zzcenVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean isEmpty = TextUtils.isEmpty(zzd);
                zzcen zzcenVar2 = zzcenVar;
                if (isEmpty) {
                    zzcenVar2.zzd(new Exception());
                } else {
                    zzcenVar2.zzc(zzd);
                }
            }
        });
    }

    public final void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(Object obj, zzcen zzcenVar, String str, long j2, zzfoe zzfoeVar) {
        synchronized (obj) {
            try {
                if (!zzcenVar.isDone()) {
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    zzm(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j2));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfor zzforVar = this.zzp;
                    zzfoeVar.zzk("Timeout");
                    zzfoeVar.zzd(false);
                    zzforVar.zzb(zzfoeVar.zzm());
                    zzcenVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzj(zzfoe zzfoeVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfoeVar.zzd(true);
        this.zzp.zzb(zzfoeVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzbqk zzbqkVar, zzfki zzfkiVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbqkVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfkiVar.zzA(context, zzbqkVar, list);
            } catch (RemoteException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            }
        } catch (RemoteException e5) {
            throw new zzgsa(e5);
        } catch (zzfjr unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbqkVar.zzf(sb.toString());
        }
    }

    public final void zzl(String str) {
        final zzeak zzeakVar = this;
        Context context = zzeakVar.zzf;
        int i5 = 5;
        final zzfoe zzn = zzfoe.zzn(context, 5);
        zzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfoe zzn2 = zzfoe.zzn(context, i5);
                zzn2.zza();
                zzn2.zzi(next);
                final Object obj = new Object();
                final zzcen zzcenVar = new zzcen();
                j3.a zzi = zzgzo.zzi(zzcenVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcu)).longValue(), TimeUnit.SECONDS, zzeakVar.zzk);
                zzeakVar.zzl.zza(next);
                zzeakVar.zzo.zza(next);
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeak.this.zzi(obj, zzcenVar, next, elapsedRealtime, zzn2);
                    }
                }, zzeakVar.zzi);
                arrayList.add(zzi);
                try {
                } catch (JSONException e4) {
                    e = e4;
                    zzeakVar = this;
                }
                try {
                    final zzeab zzeabVar = new zzeab(this, obj, next, elapsedRealtime, zzn2, zzcenVar);
                    zzeakVar = this;
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    final ArrayList arrayList2 = new ArrayList();
                    if (optJSONObject != null) {
                        try {
                            JSONArray jSONArray = optJSONObject.getJSONArray("data");
                            int i6 = 0;
                            while (i6 < jSONArray.length()) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                                String optString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                Bundle bundle = new Bundle();
                                if (optJSONObject2 != null) {
                                    Iterator<String> keys2 = optJSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        String next2 = keys2.next();
                                        bundle.putString(next2, optJSONObject2.optString(next2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                                        jSONArray = jSONArray;
                                    }
                                }
                                JSONArray jSONArray2 = jSONArray;
                                arrayList2.add(new zzbqq(optString, bundle));
                                i6++;
                                jSONArray = jSONArray2;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    zzeakVar.zzm(next, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
                    try {
                        final zzfki zza = zzeakVar.zzh.zza(next, new JSONObject());
                        zzeakVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeah
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzeak.this.zzk(next, zzeabVar, zza, arrayList2);
                            }
                        });
                    } catch (zzfjr e5) {
                        try {
                            String str2 = "Failed to create Adapter.";
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzox)).booleanValue()) {
                                String message = e5.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                sb.append("Failed to create Adapter.");
                                sb.append(" ");
                                sb.append(message);
                                str2 = sb.toString();
                            }
                            zzeabVar.zzf(str2);
                        } catch (RemoteException e6) {
                            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                        }
                    }
                    i5 = 5;
                } catch (JSONException e7) {
                    e = e7;
                    zzeakVar = this;
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                    zzeakVar.zzo.zzd("MalformedJson");
                    zzeakVar.zzl.zzd("MalformedJson");
                    zzeakVar.zze.zzd(e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                    zzfor zzforVar = zzeakVar.zzp;
                    zzn.zzj(e);
                    zzn.zzd(false);
                    zzforVar.zzb(zzn.zzm());
                    return;
                }
            }
            zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeag
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeak.this.zzj(zzn);
                    return null;
                }
            }, zzeakVar.zzi);
        } catch (JSONException e8) {
            e = e8;
        }
    }

    public final /* synthetic */ void zzn(boolean z4) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzcen zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzdyk zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdil zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfor zzt() {
        return this.zzp;
    }
}
