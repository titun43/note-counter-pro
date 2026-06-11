package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcbz implements zzcce {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzifv zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccb zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbz(Context context, VersionInfoParcel versionInfoParcel, zzccb zzccbVar, String str, zzcca zzccaVar) {
        b0.h(zzccbVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzccbVar;
        Iterator it = zzccbVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzifv zzg = zzihz.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        zzifw zzc2 = zzifx.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((zzifx) zzc2.zzbu());
        zzihl zzc3 = zzihm.zzc();
        zzc3.zzc(z2.c.a(this.zzh).d());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        t2.f fVar = t2.f.f3374b;
        Context context2 = this.zzh;
        fVar.getClass();
        long a5 = t2.f.a(context2);
        if (a5 > 0) {
            zzc3.zzb(a5);
        }
        zzg.zzk((zzihm) zzc3.zzbu());
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final zzccb zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzcce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e4) {
                    e = e4;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e5) {
                    e = e5;
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                    } catch (RuntimeException e6) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e6);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzccd.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcbz.this.zzg(bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zze(String str, Map map, int i5) {
        synchronized (this.zzj) {
            if (i5 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i5 == 3) {
                    ((zzihj) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzihj zze = zzihk.zze();
            int zza = zzihi.zza(i5);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            zzigi zzc2 = zzigl.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzigg zzc3 = zzigh.zzc();
                        zzc3.zza(zzian.zzv(str2));
                        zzc3.zzb(zzian.zzv(str3));
                        zzc2.zza((zzigh) zzc3.zzbu());
                    }
                }
            }
            zze.zzc((zzigl) zzc2.zzbu());
            linkedHashMap.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            j3.a zza = zzgzo.zza(Collections.EMPTY_MAP);
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcbv
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ j3.a zza(Object obj) {
                    return zzcbz.this.zzh((Map) obj);
                }
            };
            zzgzy zzgzyVar = zzcei.zzg;
            j3.a zzj = zzgzo.zzj(zza, zzgywVar, zzgzyVar);
            j3.a zzi = zzgzo.zzi(zzj, 10L, TimeUnit.SECONDS, zzcei.zzd);
            zzgzo.zzr(zzj, new zzcbu(this, zzi), zzgzyVar);
            zzc.add(zzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zziam zzA = zzian.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzA);
        synchronized (this.zzj) {
            zzifv zzifvVar = this.zzd;
            zzihd zzc2 = zzihf.zzc();
            zzc2.zzb(zzA.zza());
            zzc2.zza("image/png");
            zzc2.zzc(2);
            zzifvVar.zzj((zzihf) zzc2.zzbu());
        }
    }

    public final /* synthetic */ j3.a zzh(Map map) {
        int length;
        zzihj zzihjVar;
        j3.a zzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = optJSONArray.length();
                                synchronized (obj) {
                                    zzihjVar = (zzihj) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzihjVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzccd.zza(sb.toString());
                        } else {
                            for (int i5 = 0; i5 < length; i5++) {
                                zzihjVar.zzd(optJSONArray.getJSONObject(i5).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e4) {
                if (((Boolean) zzbjm.zza.zze()).booleanValue()) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e4);
                }
                return zzgzo.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z4 = this.zza;
        if (!(z4 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z4 || !this.zzi.zzd))) {
            return zzgzo.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzihk) ((zzihj) it.next()).zzbu());
                }
                zzifv zzifvVar = this.zzd;
                zzifvVar.zzl(this.zzf);
                zzifvVar.zzm(this.zzg);
                if (zzccd.zzb()) {
                    String zza = zzifvVar.zza();
                    String zzg = zzifvVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 38 + String.valueOf(zzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(zza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(zzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzihk zzihkVar : zzifvVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzihkVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzihkVar.zzc());
                    }
                    zzccd.zza(sb3.toString());
                }
                j3.a zzb2 = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzihz) zzifvVar.zzbu()).zzaN());
                if (zzccd.zzb()) {
                    zzb2.addListener(zzcbx.zza, zzcei.zza);
                }
                zzk = zzgzo.zzk(zzb2, zzcbw.zza, zzcei.zzg);
            } finally {
            }
        }
        return zzk;
    }
}
