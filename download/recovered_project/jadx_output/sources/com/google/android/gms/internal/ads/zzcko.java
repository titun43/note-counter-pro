package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzcko extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjl {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzckr zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbkf zzE;
    private zzbkc zzF;
    private zzber zzG;
    private int zzH;
    private int zzI;
    private zzbhq zzJ;
    private final zzbhq zzK;
    private zzbhq zzL;
    private final zzbhr zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbgd zzY;
    private boolean zzZ;
    private final zzcln zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final zzbil zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfir zzk;
    private zzfiu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzekb zzq;
    private zzejz zzr;
    private zzclv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcko(zzcln zzclnVar, zzclv zzclvVar, String str, boolean z4, boolean z5, zzazh zzazhVar, zzbil zzbilVar, VersionInfoParcel versionInfoParcel, zzbht zzbhtVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar) {
        super(zzclnVar);
        zzfiu zzfiuVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzclnVar;
        this.zzs = zzclvVar;
        this.zzt = str;
        this.zzw = z4;
        this.zzc = zzazhVar;
        this.zzd = zzfjoVar;
        this.zze = zzbilVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = zzx;
        this.zzj = zzx.density;
        this.zzY = zzbgdVar;
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzclnVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzna)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e4);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoG)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzclnVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzckw(this, new zzckv() { // from class: com.google.android.gms.internal.ads.zzcku
            @Override // com.google.android.gms.internal.ads.zzckv
            public final /* synthetic */ void zza(Uri uri) {
                zzcjw zzaS = ((zzcko) zzcjl.this).zzaS();
                if (zzaS != null) {
                    zzaS.zzQ(uri);
                } else {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbhr zzbhrVar = new zzbhr(new zzbht(true, "make_wv", this.zzt));
        this.zzM = zzbhrVar;
        zzbhrVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && (zzfiuVar2 = this.zzl) != null && zzfiuVar2.zzb != null) {
            zzbhrVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbhrVar.zzc();
        zzbhq zzf = zzbht.zzf();
        this.zzK = zzf;
        zzbhrVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzclnVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzckl
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean zzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbhl.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfir zzfirVar = this.zzk;
        if (zzfirVar != null && zzfirVar.zzam) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzchr) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbhr zzbhrVar = this.zzM;
        if (zzbhrVar == null) {
            return;
        }
        zzbht zzc = zzbhrVar.zzc();
        zzbhj zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z4 ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmk)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity zzb = this.zzb.zzb();
            if (zzb != null && zzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzml)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z4 = this.zzC;
            zzcjw zzcjwVar = this.zzo;
            if (zzcjwVar != null && zzcjwVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z4 = true;
            }
            zzbi(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcjw zzcjwVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcjwVar = this.zzo) != null && zzcjwVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(getContext(), intent);
        } catch (ActivityNotFoundException e4) {
            String n5 = u.n(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(n5);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaM) {
            return;
        }
        zzL.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i5, int i6) {
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i5, i6);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue()) {
                    super.onMeasure(i5, i6);
                    return;
                }
                zzckr zzh = zzh();
                float zzm = zzh != null ? zzh.zzm() : 0.0f;
                if (zzm == 0.0f) {
                    super.onMeasure(i5, i6);
                    return;
                }
                int size = View.MeasureSpec.getSize(i5);
                int size2 = View.MeasureSpec.getSize(i6);
                float f5 = size2 * zzm;
                int i11 = (int) (size / zzm);
                if (size2 == 0) {
                    if (i11 != 0) {
                        i9 = (int) (i11 * zzm);
                        i10 = size;
                        i8 = i11;
                        setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                        return;
                    }
                    size2 = 0;
                }
                int i12 = (int) f5;
                if (size != 0) {
                    i10 = size;
                } else if (i12 != 0) {
                    i11 = (int) (i12 / zzm);
                    i8 = size2;
                    i9 = i12;
                    i10 = i9;
                    setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                    return;
                }
                i8 = size2;
                i9 = i12;
                setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeR)).booleanValue()) {
                    super.onMeasure(i5, i6);
                    return;
                }
                zzab("/contentHeight", new zzcki(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f6 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i5);
                int i13 = this.zzI;
                setMeasuredDimension(size3, i13 != -1 ? (int) (i13 * f6) : View.MeasureSpec.getSize(i6));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i5);
            int size4 = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            int size5 = View.MeasureSpec.getSize(i6);
            int i14 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i7 = Integer.MAX_VALUE;
                if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                    i14 = size5;
                }
                zzclv zzclvVar = this.zzs;
                z4 = zzclvVar.zzb <= i7 || zzclvVar.zza > i14;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
                    zzclv zzclvVar2 = this.zzs;
                    float f7 = zzclvVar2.zzb;
                    float f8 = this.zzj;
                    z4 &= f7 / f8 <= ((float) i7) / f8 && ((float) zzclvVar2.zza) / f8 <= ((float) i14) / f8;
                }
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.zzn) {
                        this.zzY.zzc(10002);
                        this.zzn = true;
                    }
                    zzclv zzclvVar3 = this.zzs;
                    setMeasuredDimension(zzclvVar3.zzb, zzclvVar3.zza);
                    return;
                }
                float f9 = this.zzs.zzb;
                float f10 = this.zzj;
                int i15 = (int) (f9 / f10);
                int i16 = (int) (r2.zza / f10);
                int i17 = (int) (size4 / f10);
                int i18 = (int) (size5 / f10);
                StringBuilder sb = new StringBuilder(String.valueOf(i15).length() + 36 + String.valueOf(i16).length() + 18 + String.valueOf(i17).length() + 1 + String.valueOf(i18).length() + 4);
                sb.append("Not enough space to show ad. Needs ");
                sb.append(i15);
                sb.append("x");
                sb.append(i16);
                sb.append(" dp, but only has ");
                sb.append(i17);
                sb.append("x");
                sb.append(i18);
                sb.append(" dp.");
                String sb2 = sb.toString();
                int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.zzm) {
                    return;
                }
                this.zzY.zzc(10001);
                this.zzm = true;
                return;
            }
            i7 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i14 = size5;
            zzclv zzclvVar4 = this.zzs;
            if (zzclvVar4.zzb <= i7) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
            }
            if (z4) {
            }
        }
        super.onMeasure(i5, i6);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && a.a.q("MUTE_AUDIO")) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                boolean z4 = j1.f.f2020a;
                if (!m.h.b()) {
                    throw m.a();
                }
                j1.f.d(this).f2425a.setAudioMuted(true);
            }
        } catch (Exception e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && a.a.q("MUTE_AUDIO")) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                boolean z4 = j1.f.f2020a;
                if (!m.h.b()) {
                    throw m.a();
                }
                j1.f.d(this).f2425a.setAudioMuted(false);
            }
        } catch (Exception e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzer)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z4) {
            zzazh zzazhVar = this.zzc;
            if (zzazhVar != null) {
                zzazhVar.zzc(motionEvent);
            }
            zzbil zzbilVar = this.zze;
            if (zzbilVar != null) {
                zzbilVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbkf zzbkfVar = this.zzE;
                    if (zzbkfVar != null) {
                        zzbkfVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjw) {
            this.zzo = (zzcjw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzA(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzB(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcjc
    public final zzfir zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclg
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzG() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzH(int i5) {
        if (i5 == 0) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbhr zzbhrVar2 = this.zzM;
        zzbhrVar2.zzc();
        zzbhrVar2.zzc().zzd("close_type", String.valueOf(i5));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i5));
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzI() {
        if (this.zzJ == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aes2");
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzJ = zzf;
            zzbhrVar.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcld
    public final synchronized zzclv zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final /* synthetic */ zzclj zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcle
    public final zzazh zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzfjo zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzekb zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzejz zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzckj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaA(final boolean z4, final int i5) {
        destroy();
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzckm
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                int i6 = zzcko.zza;
                zzbgj.zzbl.zza zzq = zzbgj.zzbl.zzq();
                boolean zzb = zzq.zzb();
                boolean z5 = z4;
                if (zzb != z5) {
                    zzq.zzc(z5);
                }
                zzq.zzg(i5);
                zzaVar.zzal(zzq.zzbu());
            }
        };
        zzbgd zzbgdVar = this.zzY;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcks
    public final zzfiu zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaE(boolean z4) {
        if (z4) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final j3.a zzaF() {
        zzbil zzbilVar = this.zze;
        return zzbilVar == null ? zzgzo.zza(null) : zzbilVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaG(boolean z4) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z5, String str) {
        this.zzo.zzv(zzcVar, z4, z5, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaI(boolean z4, int i5, boolean z5) {
        this.zzo.zzx(z4, i5, z5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaJ(boolean z4, int i5, String str, boolean z5, boolean z6) {
        this.zzo.zzy(z4, i5, str, z5, z6);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaK(boolean z4, int i5, String str, String str2, boolean z5) {
        this.zzo.zzz(z4, i5, str, str2, z5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaL(String str, String str2, int i5) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10.zzV != r9) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int i5;
        int i6;
        boolean z4 = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            DisplayMetrics displayMetrics = this.zzi;
            int zzA = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            int zzA2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.heightPixels);
            Activity zzb = this.zzb.zzb();
            if (zzb == null || zzb.getWindow() == null) {
                i5 = zzA;
                i6 = zzA2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzX = com.google.android.gms.ads.internal.util.zzs.zzX(zzb);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzX[0]);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzX[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == zzA && this.zzR == zzA2 && this.zzT == i5 && this.zzU == i6) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue()) {
                }
            }
            if (this.zzS == zzA && this.zzR == zzA2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue()) {
                }
                this.zzS = zzA;
                this.zzR = zzA2;
                this.zzT = i5;
                this.zzU = i6;
                this.zzV = rotation;
                new zzbwx(this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).zzl(zzA, zzA2, i5, i6, displayMetrics.density, rotation);
                return z4;
            }
            z4 = true;
            this.zzS = zzA;
            this.zzR = zzA2;
            this.zzT = i5;
            this.zzU = i6;
            this.zzV = rotation;
            new zzbwx(this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).zzl(zzA, zzA2, i5, i6, displayMetrics.density, rotation);
            return z4;
        }
        return false;
    }

    public final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    public final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjw zzaS() {
        return this.zzo;
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    public final /* synthetic */ void zzaY(int i5) {
        this.zzI = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzab(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzB(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzac(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzC(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzad(String str, x2.e eVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzE(str, eVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaf(zzclv zzclvVar) {
        this.zzs = zzclvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzag(boolean z4) {
        try {
            boolean z5 = this.zzw;
            this.zzw = z4;
            zzbc();
            if (z4 != z5) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaz)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbwx(this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).zzk(true != z4 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzai(Context context) {
        zzcln zzclnVar = this.zzb;
        zzclnVar.setBaseContext(context);
        this.zzQ.zza(zzclnVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaj(boolean z4) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z4);
        } else {
            this.zzu = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzak(zzekb zzekbVar) {
        this.zzq = zzekbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzal(zzejz zzejzVar) {
        this.zzr = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzam(int i5) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzao(boolean z4) {
        this.zzz = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzap() {
        if (this.zzL == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzL = zzf;
            zzbhrVar.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaq(zzbkf zzbkfVar) {
        this.zzE = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzbkf zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzas(boolean z4) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i5 = this.zzH + (true != z4 ? -1 : 1);
        this.zzH = i5;
        if (i5 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzau(String str, String str2, String str3) {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzay);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e4) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e4);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzclc.zza(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaw(boolean z4) {
        this.zzo.zzO(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzax(zzbkc zzbkcVar) {
        this.zzF = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzay(zzber zzberVar) {
        this.zzG = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzber zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzc(String str, String str2) {
        zzaP(u.n(new StringBuilder(u.e(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(sb2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z4;
        synchronized (this) {
            z4 = zzbddVar.zzj;
            this.zzC = z4;
        }
        zzbi(z4);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcft zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzdn(boolean z4) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized zzckr zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzbhq zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzn() {
        zzfiu zzfiuVar = this.zzl;
        if (zzfiuVar == null) {
            return null;
        }
        return zzfiuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzo(int i5) {
        this.zzN = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzbhr zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized zzchr zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzchr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzt(String str, zzchr zzchrVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzchrVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzu(boolean z4, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z4 ? "0" : "1");
        hashMap.put("duration", Long.toString(j2));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzv(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzw(zzckr zzckrVar) {
        if (this.zzB == null) {
            this.zzB = zzckrVar;
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzz() {
        zzbkc zzbkcVar = this.zzF;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
        }
    }
}
