package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n.h;
import n.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbij {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdye zzd;
    private Runnable zze;
    private zzbig zzf;
    private o zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbij(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdye zzdyeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdyeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r7.zzi) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r1 = r7.zzg;
        r2 = android.net.Uri.parse(r7.zzh);
        r1.getClass();
        r3 = new android.os.Bundle();
        r4 = r1.f2638c;
        r1 = r1.f2637b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r5 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r5.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r3.putAll(r5);
        ((b.b) r1).d(r4, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        ((b.b) r1).c(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzlo)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        ScheduledExecutorService scheduledExecutorService;
        zzbig zzbigVar = this.zzf;
        if (zzbigVar == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        } else {
            if (zzbigVar.zza().booleanValue()) {
                return;
            }
            if (this.zzh != null && this.zzg != null && (scheduledExecutorService = this.zza) != null) {
                if (this.zzi != 0) {
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
            return;
        }
        scheduledExecutorService.schedule(this.zze, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlp)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlr));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e4);
        }
    }

    public final void zza(Context context, h hVar, String str, n.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdye zzdyeVar = this.zzd;
        zzbig zzbigVar = new zzbig(this, aVar, zzdyeVar);
        this.zzf = zzbigVar;
        o b2 = hVar.b(zzbigVar);
        this.zzg = b2;
        if (b2 == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(zzdyeVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final o zzb() {
        return this.zzg;
    }

    public final void zzc() {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zzi = SystemClock.elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzln)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbii
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbij.this.zzh();
                }
            };
        }
        zzh();
    }

    public final void zzd(String str) {
        try {
            o oVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            oVar.a(jSONObject.toString());
            zzbih zzbihVar = new zzbih(this, str);
            if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbihVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbihVar);
        } catch (JSONException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e4);
        }
    }

    public final JSONObject zze(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbjj.zze.zze()).booleanValue() ? ((Long) zzbjj.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final JSONObject zzf(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbjj.zze.zze()).booleanValue() ? ((Long) zzbjj.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final void zzg(long j2) {
        this.zzj = j2;
    }

    public final /* synthetic */ o zzi() {
        return this.zzg;
    }
}
