package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import f0.r0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;
    private zzdxz zzA;
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcjl zza;
    protected zzcce zzb;
    private final zzbgd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbww zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzr = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgG)).split(",")));

    public zzcjw(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z4, zzbww zzbwwVar, zzbwr zzbwrVar, zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z4;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(final View view, final zzcce zzcceVar, final int i5) {
        if (!zzcceVar.zzc() || i5 <= 0) {
            return;
        }
        zzcceVar.zzd(view);
        if (zzcceVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjw.this.zzU(view, zzcceVar, i5);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r13.getContentType();
        r1 = android.text.TextUtils.isEmpty(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        r4 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r15 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
    
        r0 = r13.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0187, code lost:
    
        if (r0.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0189, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0193, code lost:
    
        if (r2.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0199, code lost:
    
        if (r2.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a7, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bd, code lost:
    
        r9 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r15, r16, r13.getResponseCode(), r13.getResponseMessage(), r1, r13.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0143, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (r1 >= r0.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0162, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0120, code lost:
    
        r15 = r0.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse zzaf(String str, Map map) {
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i5 = 0;
            while (true) {
                i5++;
                if (i5 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcjl zzcjlVar = this.zza;
                    zzc2.zzb(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzae();
                        break;
                    }
                    if (!protocol.equals(Bridge.CAPACITOR_HTTP_SCHEME) && !protocol.equals(Bridge.CAPACITOR_HTTPS_SCHEME)) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzae();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z4, long j2) {
        this.zza.zzu(z4, j2);
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        return zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z4, zzcjl zzcjlVar) {
        return (!z4 || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcjlVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcli zzcliVar = this.zzj;
                if (zzcliVar != null) {
                    zzcliVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcjl zzcjlVar2 = this.zza;
                if (zzcjlVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue()) {
                        zzcjlVar2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        this.zzo = true;
        this.zzp = i5;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if (Bridge.CAPACITOR_HTTP_SCHEME.equalsIgnoreCase(scheme) || Bridge.CAPACITOR_HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzazh zzS = zzcjlVar.zzS();
                    zzfjo zzT = zzcjlVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                    }
                } catch (zzazi unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcjlVar2 != null ? zzcjlVar2.zzn() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                HashMap hashMap = this.zze;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, x2.e eVar) {
        synchronized (this.zzf) {
            try {
                List<zzboh> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzboh zzbohVar : list) {
                    if (eVar.apply(zzbohVar)) {
                        arrayList.add(zzbohVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbwr zzbwrVar = this.zzz;
                if (zzbwrVar != null) {
                    zzbwrVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzdxz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzczz zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01d2, B:48:0x0186, B:51:0x02e7, B:53:0x02f7, B:55:0x02fd, B:57:0x030b, B:72:0x0260, B:73:0x0298, B:66:0x0229, B:68:0x0150, B:89:0x00db, B:90:0x0299, B:92:0x02a3, B:94:0x02a9, B:96:0x02dc), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02e7 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01d2, B:48:0x0186, B:51:0x02e7, B:53:0x02f7, B:55:0x02fd, B:57:0x030b, B:72:0x0260, B:73:0x0298, B:66:0x0229, B:68:0x0150, B:89:0x00db, B:90:0x0299, B:92:0x02a3, B:94:0x02a9, B:96:0x02dc), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01d2, B:48:0x0186, B:51:0x02e7, B:53:0x02f7, B:55:0x02fd, B:57:0x030b, B:72:0x0260, B:73:0x0298, B:66:0x0229, B:68:0x0150, B:89:0x00db, B:90:0x0299, B:92:0x02a3, B:94:0x02a9, B:96:0x02dc), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e A[Catch: all -> 0x01c5, TryCatch #0 {all -> 0x01c5, blocks: (B:42:0x01aa, B:44:0x01bc, B:46:0x01c8, B:62:0x020c, B:64:0x021e, B:65:0x0225), top: B:28:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0299 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01d2, B:48:0x0186, B:51:0x02e7, B:53:0x02f7, B:55:0x02fd, B:57:0x030b, B:72:0x0260, B:73:0x0298, B:66:0x0229, B:68:0x0150, B:89:0x00db, B:90:0x0299, B:92:0x02a3, B:94:0x02a9, B:96:0x02dc), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse zzL(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i5;
        InputStream inputStream;
        InputStream zzb;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            String zza = zzccs.zza(str, zzcjlVar.getContext(), this.zzF, hashMap);
            if (!zza.equals(str)) {
                return zzaf(zza, map);
            }
            Parcelable.Creator<zzbfp> creator = zzbfp.CREATOR;
            zzbfp zza2 = zzbfp.zza(Uri.parse(str));
            if (zza2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zze = zzgrr.zza(zzgqq.zzc('-')).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = Integer.parseInt((String) zze.get(0));
                        int parseInt2 = Integer.parseInt((String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i5 = parseInt2 - parseInt;
                        String str2 = "X-Afma-Gcache-CachedBytes";
                        webResourceResponse = null;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                            zzbfm zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                                if (inputStream != null) {
                                    return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 200, "OK", hashMap2, inputStream);
                                }
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i5 != -1) {
                                    zzb = zzgxf.zzb(zzb, i5);
                                }
                            }
                        } else {
                            zza2.zzi = zzgrt.zza(zzcjlVar.zzn());
                            zza2.zzj = zzcjlVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl) : (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk)).longValue();
                                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                Future zza3 = zzbga.zza(zzcjlVar.getContext(), zza2);
                                try {
                                    zzbgb zzbgbVar = (zzbgb) zza3.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbgbVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbgbVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbgbVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbgbVar.zze()));
                                            zzb = zzbgbVar.zzb();
                                            if (i5 != -1) {
                                                try {
                                                    zzb = zzgxf.zzb(zzb, i5);
                                                } catch (InterruptedException e4) {
                                                    e = e4;
                                                    z6 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzX(z6, elapsedRealtime2);
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (ExecutionException e5) {
                                                    e = e5;
                                                    z5 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                                    final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzW(z5, elapsedRealtime3);
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    sb = sb3.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (TimeoutException e6) {
                                                    e = e6;
                                                    z5 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                                    final long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzW(z5, elapsedRealtime32);
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    sb = sb32.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                            final long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            final boolean z7 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z7, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzcjo
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcjw.this.zzV(true, this.zzb);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z4 = 1;
                                            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                            final long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcjw.this.zzY(z4, elapsedRealtime5);
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(elapsedRealtime5);
                                            sb5.append("ms");
                                            com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                            throw th;
                                        }
                                    } catch (InterruptedException e7) {
                                        e = e7;
                                        zzb = null;
                                    } catch (ExecutionException e8) {
                                        e = e8;
                                        zzb = null;
                                        z5 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                        final long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcjw.this.zzW(z5, elapsedRealtime322);
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        sb = sb322.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e9) {
                                        e = e9;
                                        zzb = null;
                                        z5 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                        final long elapsedRealtime3222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcjw.this.zzW(z5, elapsedRealtime3222);
                                            }
                                        });
                                        StringBuilder sb3222 = new StringBuilder(String.valueOf(elapsedRealtime3222).length() + 24);
                                        sb3222.append("Cache connection took ");
                                        sb3222.append(elapsedRealtime3222);
                                        sb3222.append("ms");
                                        sb = sb3222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (InterruptedException e10) {
                                    e = e10;
                                    zzb = null;
                                    z6 = false;
                                } catch (ExecutionException e11) {
                                    e = e11;
                                    zzb = null;
                                    z5 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                    final long elapsedRealtime32222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcjw.this.zzW(z5, elapsedRealtime32222);
                                        }
                                    });
                                    StringBuilder sb32222 = new StringBuilder(String.valueOf(elapsedRealtime32222).length() + 24);
                                    sb32222.append("Cache connection took ");
                                    sb32222.append(elapsedRealtime32222);
                                    sb32222.append("ms");
                                    sb = sb32222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e12) {
                                    e = e12;
                                    zzb = null;
                                    z5 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                    final long elapsedRealtime322222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcjw.this.zzW(z5, elapsedRealtime322222);
                                        }
                                    });
                                    StringBuilder sb322222 = new StringBuilder(String.valueOf(elapsedRealtime322222).length() + 24);
                                    sb322222.append("Cache connection took ");
                                    sb322222.append(elapsedRealtime322222);
                                    sb322222.append("ms");
                                    sb = sb322222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z4 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (Throwable th3) {
                                th = th3;
                                z4 = str2;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i5 = -1;
                String str22 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbja.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception e13) {
            e = e13;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        } catch (NoClassDefFoundError e14) {
            e = e14;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z4) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl zzcjlVar = zzcjw.this.zza;
                    zzcjlVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzL = zzcjlVar.zzL();
                    if (zzL != null) {
                        zzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z4) {
        this.zzF = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzP(int i5, int i6) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i5, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzQ(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhF)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i5 = zzcjw.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgH)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgzo.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzR(boolean z4) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzS(boolean z4) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzT(boolean z4) {
        synchronized (this.zzf) {
            this.zzv = z4;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i5) {
        zzac(view, zzcceVar, i5 - 1);
    }

    public final /* synthetic */ void zzV(boolean z4, long j2) {
        zzY(true, j2);
    }

    public final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i5) {
        zzac(view, zzcceVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zza(int i5, int i6, boolean z4) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i5, i6);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i5, i6, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmx zzbmxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmz zzbmzVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z4, zzbok zzbokVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwy zzbwyVar, zzcce zzcceVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzbpc zzbpcVar, zzdjm zzdjmVar, zzbpb zzbpbVar, zzbov zzbovVar, zzboi zzboiVar, zzcrv zzcrvVar, zzdzc zzdzcVar, zzdae zzdaeVar, zzczz zzczzVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcceVar, null) : zzbVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(zzbVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbou(zzbVar3, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), hashMap));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzd(zzcrv zzcrvVar, zzeiu zzeiuVar, zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zze(zzcrv zzcrvVar, zzeiu zzeiuVar, zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final boolean zzk() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzs;
        }
        return z4;
    }

    public final boolean zzl() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzt;
        }
        return z4;
    }

    public final boolean zzm() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzu;
        }
        return z4;
    }

    public final boolean zzn() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzv;
        }
        return z4;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcjl zzcjlVar = this.zza;
            WebView zzD = zzcjlVar.zzD();
            WeakHashMap weakHashMap = r0.f1407a;
            if (zzD.isAttachedToWindow()) {
                zzac(zzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            ((View) zzcjlVar).addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            zzclh zzclhVar = this.zzi;
            boolean z4 = false;
            if (!this.zzD && !this.zzo) {
                z4 = true;
            }
            zzclhVar.zza(z4, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z5, String str) {
        boolean z6;
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean z7 = false;
        boolean z8 = zzaj(zzW, zzcjlVar) || z5;
        if (z8 || !z4) {
            z6 = zzW;
            z7 = true;
        } else {
            z6 = zzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z8 ? null : this.zzg, z6 ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z7 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i5) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbxl] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z4, int i5, boolean z5) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdjm zzdjmVar;
        ?? r9;
        int i6;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z6;
        zzcjl zzcjlVar = this.zza;
        boolean zzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z7 = true;
        if (!zzaj && z5) {
            z7 = false;
        }
        if (zzaj) {
            zzaVar = null;
            zzdjmVar = null;
        } else {
            zzaVar = this.zzg;
            zzdjmVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzdjm zzdjmVar2 = zzdjmVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar3 = z7 ? zzdjmVar2 : this.zzm;
        if (zzai(zzcjlVar)) {
            r9 = this.zzH;
            z6 = z4;
            i6 = i5;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzdjmVar2;
            i6 = i5;
            zzaVar2 = zzaVar;
            z6 = z4;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcjlVar, z6, i6, zzs, zzdjmVar3, r9));
    }

    public final void zzy(boolean z4, int i5, String str, boolean z5, boolean z6) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z7 = true;
        if (!zzaj && z5) {
            z7 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcjv zzcjvVar = zzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z8 = z7;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z8 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z4, i5, str, zzs, zzdjmVar, zzejfVar, z6));
    }

    public final void zzz(boolean z4, int i5, String str, String str2, boolean z5) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z6 = true;
        if (!zzaj && z5) {
            z6 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcjv zzcjvVar = zzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z7 = z6;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z7 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z4, i5, str, str2, zzs, zzdjmVar, zzejfVar));
    }
}
