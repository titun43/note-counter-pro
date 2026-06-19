package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfad implements zzfax {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfae zzc = new zzfae(new JSONArray().toString(), new Bundle(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    final String zza;
    private final zzgzy zzd;
    private final ScheduledExecutorService zze;
    private final zzeqk zzf;
    private final Context zzg;
    private final zzfjk zzh;
    private final zzeqf zzi;
    private final zzdvp zzj;
    private final zzeam zzk;
    private final int zzl;

    public zzfad(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeqk zzeqkVar, Context context, zzfjk zzfjkVar, zzeqf zzeqfVar, zzdvp zzdvpVar, zzeam zzeamVar, int i5) {
        this.zzd = zzgzyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeqkVar;
        this.zzg = context;
        this.zzh = zzfjkVar;
        this.zzi = zzeqfVar;
        this.zzj = zzdvpVar;
        this.zzk = zzeamVar;
        this.zzl = i5;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeqoVar.zze), zzg(str), zzeqoVar.zzb, zzeqoVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgzg zzh(final String str, final List list, final Bundle bundle, final boolean z4, final boolean z5) {
        zzgyv zzgyvVar = new zzgyv() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ j3.a zza() {
                return zzfad.this.zzd(str, list, bundle, z4, z5);
            }
        };
        zzgzy zzgzyVar = this.zzd;
        zzgzg zzw = zzgzg.zzw(zzgzo.zzf(zzgyvVar, zzgzyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
            zzw = (zzgzg) zzgzo.zzi(zzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgzg) zzgzo.zzg(zzw, Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i5 = zzfad.zzb;
                String str2 = str;
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoz)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgzyVar);
    }

    private final void zzi(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar) {
        zzbvsVar.zze(new a3.b(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        if (this.zzl == 2) {
            return zzgzo.zza(zzc);
        }
        zzfjk zzfjkVar = this.zzh;
        if (zzfjkVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcl)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)))) {
                return zzgzo.zza(zzc);
            }
        }
        return zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ j3.a zza() {
                return zzfad.this.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ j3.a zzc() {
        final String str;
        zzfad zzfadVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcj)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = zzk != 1 ? zzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcs)).booleanValue()) {
            zzfadVar = this;
            zzf(arrayList, zzfadVar.zzf.zzd(zzfadVar.zza, lowerCase));
        } else {
            zzeqk zzeqkVar = this.zzf;
            for (Map.Entry entry : zzeqkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzfadVar = this;
            zzf(arrayList, zzeqkVar.zzb());
        }
        return zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i5 = zzfad.zzb;
                JSONArray jSONArray = new JSONArray();
                for (j3.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle = zzg;
                if (jSONArray.length() != 0) {
                    return new zzfae(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
                    return new zzfae(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzfadVar.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|6|(2:8|(2:10|11)(1:13))(3:14|(1:16)|(2:18|(2:20|21)(2:22|23))(2:24|25))))|26|27|6|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r0);
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j3.a zzd(String str, final List list, final Bundle bundle, boolean z4, boolean z5) {
        final zzbvs zzbvsVar;
        zzbvs zzb2;
        final zzcen zzcenVar = new zzcen();
        if (z5) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
                zzeqf zzeqfVar = this.zzi;
                zzeqfVar.zza(str);
                zzb2 = zzeqfVar.zzb(str);
                zzbvsVar = zzb2;
                if (zzbvsVar != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzca)).booleanValue()) {
                        throw null;
                    }
                    zzeqn.zzd(str, zzcenVar);
                    return zzcenVar;
                }
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                final zzeqn zzeqnVar = new zzeqn(str, zzbvsVar, zzcenVar, SystemClock.elapsedRealtime());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
                    this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfac
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzeqn.this.zzc();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (!z4) {
                    zzeqnVar.zzb();
                    return zzcenVar;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcm)).booleanValue()) {
                    this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaa
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfad.this.zze(zzbvsVar, bundle, list, zzeqnVar, zzcenVar);
                        }
                    });
                    return zzcenVar;
                }
                zzi(zzbvsVar, bundle, list, zzeqnVar);
                return zzcenVar;
            }
        }
        zzb2 = this.zzj.zzb(str);
        zzbvsVar = zzb2;
        if (zzbvsVar != null) {
        }
    }

    public final /* synthetic */ void zze(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        try {
            zzi(zzbvsVar, bundle, list, zzeqnVar);
        } catch (RemoteException e4) {
            zzcenVar.zzd(e4);
        }
    }
}
