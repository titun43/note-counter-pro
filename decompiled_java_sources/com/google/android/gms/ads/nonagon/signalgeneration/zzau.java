package com.google.android.gms.ads.nonagon.signalgeneration;

import a3.a;
import a3.b;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdan;
import com.google.android.gms.internal.ads.zzdhe;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n.h;
import org.json.JSONObject;
import s.c;

/* loaded from: classes.dex */
public final class zzau extends zzcdc {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbij zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcma zzf;
    private Context zzg;
    private final zzazh zzh;
    private final zzfjo zzi;
    private final zzfkj zzj;
    private final zzgzy zzk;
    private final ScheduledExecutorService zzl;
    private zzbyk zzm;
    private final zzdye zzp;
    private final zzfqk zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzii)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzih)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzik)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzim)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzil);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzin);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzio);

    public zzau(zzcma zzcmaVar, Context context, zzazh zzazhVar, zzfkj zzfkjVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzdye zzdyeVar, zzfqk zzfqkVar, VersionInfoParcel versionInfoParcel, zzbij zzbijVar, zzfjo zzfjoVar, zzo zzoVar, zzf zzfVar) {
        List list;
        this.zzf = zzcmaVar;
        this.zzg = context;
        this.zzh = zzazhVar;
        this.zzi = zzfjoVar;
        this.zzj = zzfkjVar;
        this.zzk = zzgzyVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdyeVar;
        this.zzq = zzfqkVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbijVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzip)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziq));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzir));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzis));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzit));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final a aVar, zzbyh zzbyhVar, boolean z4) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                return;
            }
        }
        zzgzy zzgzyVar = this.zzk;
        j3.a submit = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzau.this.zzo(list, aVar);
            }
        });
        if (zzY()) {
            submit = zzgzo.zzj(submit, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ j3.a zza(Object obj) {
                    return zzau.this.zzp((ArrayList) obj);
                }
            }, zzgzyVar);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzgzo.zzr(submit, new zzae(this, zzbyhVar, z4), this.zzf.zzb());
    }

    private final void zzS(List list, final a aVar, zzbyh zzbyhVar, boolean z4) {
        j3.a submit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                return;
            }
        }
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i6++;
            }
        }
        if (i6 > 1) {
            String valueOf = String.valueOf(list);
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzgzy zzgzyVar = this.zzk;
                submit = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzau.this.zzq(uri, aVar);
                    }
                });
                if (zzY()) {
                    submit = zzgzo.zzj(submit, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ j3.a zza(Object obj) {
                            return zzau.this.zzr((Uri) obj);
                        }
                    }, zzgzyVar);
                } else {
                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf2));
                submit = zzgzo.zza(uri);
            }
            arrayList.add(submit);
        }
        zzgzo.zzr(zzgzo.zzm(arrayList), new zzaf(this, zzbyhVar, z4), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkZ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlc)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlg)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzau zzauVar;
        j3.a zza2;
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
            zza2 = zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // com.google.android.gms.internal.ads.zzgyv
                public final /* synthetic */ j3.a zza() {
                    return zzau.this.zzs();
                }
            }, zzcei.zza);
            zzauVar = this;
        } else {
            zzauVar = this;
            zza2 = zzauVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
        }
        zzgzo.zzr(zza2, new zzag(this), zzauVar.zzf.zzb());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r8.equals("REWARDED_INTERSTITIAL") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r9 = com.google.android.gms.ads.internal.client.zzr.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r8.equals("REWARDED") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzac zzW(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i5, String str3, Bundle bundle, zzcdh zzcdhVar) {
        zzfjj zzfjjVar = new zzfjj();
        if ("REWARDED".equals(str2)) {
            zzfjjVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfjjVar.zzj().zza(3);
        }
        zzab zzr = this.zzf.zzr();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfjjVar.zzg(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzfjjVar.zza(zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        zzrVar = com.google.android.gms.ads.internal.client.zzr.zzd();
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                case 543046670:
                    break;
                case 1854800829:
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                default:
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
            }
        }
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zzu(true);
        zzfjjVar.zzv(bundle);
        zzdanVar.zzb(zzfjjVar.zzA());
        zzdanVar.zzh(i5);
        zzr.zzc(zzdanVar.zze());
        zzax zzaxVar = new zzax();
        zzaxVar.zza(str2);
        zzaxVar.zzb(str3);
        zzaxVar.zzc(zzcdhVar);
        zzr.zzb(new zzay(zzaxVar, null));
        new zzdhe();
        return zzr.zza();
    }

    private final j3.a zzX(final String str) {
        final zzdtk[] zzdtkVarArr = new zzdtk[1];
        j3.a zzb2 = this.zzj.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzau.this.zzu(zzdtkVarArr, str, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzk;
        j3.a zzj = zzgzo.zzj(zzb2, zzgywVar, zzgzyVar);
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzau.this.zzv(zzdtkVarArr);
            }
        }, zzgzyVar);
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzi(zzgzg.zzw(zzj), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziG)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzaq.zza, zzgzyVar), Exception.class, zzar.zza, zzgzyVar);
    }

    private final boolean zzY() {
        Map map;
        zzbyk zzbykVar = this.zzm;
        return (zzbykVar == null || (map = zzbykVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i5 = indexOf + 1;
        StringBuilder sb = new StringBuilder(uri2.substring(0, i5));
        c.e(sb, str, "=", str2, "&");
        sb.append(uri2.substring(i5));
        return Uri.parse(sb.toString());
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzgrt.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzfoo zzy(j3.a aVar, zzcdh zzcdhVar) {
        if (!zzfor.zza() || !((Boolean) zzbix.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfoo zzb2 = ((zzac) zzgzo.zzs(aVar)).zzb();
            zzb2.zzb(new ArrayList(Collections.singletonList(zzcdhVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
            zzb2.zzc(zzmVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzmVar.zzp);
            zzb2.zzd(zzmVar.zzm);
            return zzb2;
        } catch (ExecutionException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ zzdye zzA() {
        return this.zzp;
    }

    public final /* synthetic */ zzfqk zzB() {
        return this.zzq;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    public final /* synthetic */ String zzG() {
        return this.zzv;
    }

    public final /* synthetic */ String zzH() {
        return this.zzw;
    }

    public final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    public final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    public final /* synthetic */ String zzK() {
        return this.zzz;
    }

    public final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    public final /* synthetic */ String zzM() {
        return this.zzA;
    }

    public final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    public final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    public final boolean zzc(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    public final boolean zzd(Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze(a aVar, final zzcdh zzcdhVar, zzcda zzcdaVar) {
        zzcdh zzcdhVar2;
        j3.a zza2;
        j3.a zza3;
        j3.a zzj;
        j3.a aVar2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            bundle.putLong(zzdxh.PUBLIC_API_CALL.zza(), zzcdhVar.zzd.zzz);
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), bundle, zzdxh.DYNAMITE_ENTER.zza());
        }
        this.zzg = (Context) b.b(aVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        zzfoe zzn = zzfoe.zzn(this.zzg, 22);
        zzn.zza();
        int i5 = 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
            if (zzmVar.zzc.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.zzc(zzmVar), "requester_type_8")) {
                i5 = 2;
                if (zzcdhVar.zze != 2) {
                    i5 = 1;
                }
            }
        }
        final int i6 = i5;
        String str = zzcdhVar.zzb;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            zzbgv zzbgvVar = zzbhe.zzix;
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
            }
            if (arrayList.contains(zzaa.zzc(zzcdhVar.zzd))) {
                zza2 = zzgzo.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zza3 = zzgzo.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzcdhVar2 = zzcdhVar;
                aVar2 = zza2;
                zzj = zza3;
                zzgzo.zzr(zzj, new zzad(this, aVar2, zzcdhVar2, zzcdaVar, zzn), this.zzf.zzb());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
            zzgzy zzgzyVar = zzcei.zza;
            j3.a submit = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzat
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzau.this.zzn(zzcdhVar, i6, bundle);
                }
            });
            zzj = zzgzo.zzj(submit, zzah.zza, zzgzyVar);
            zzcdhVar2 = zzcdhVar;
            aVar2 = submit;
            zzgzo.zzr(zzj, new zzad(this, aVar2, zzcdhVar2, zzcdaVar, zzn), this.zzf.zzb());
        }
        zzac zzW = zzW(this.zzg, zzcdhVar.zza, str, zzcdhVar.zzc, zzcdhVar.zzd, i6, zzcdhVar.zzf, bundle, zzcdhVar);
        zzcdhVar2 = zzcdhVar;
        zza2 = zzgzo.zza(zzW);
        zza3 = zzW.zza();
        aVar2 = zza2;
        zzj = zza3;
        zzgzo.zzr(zzj, new zzad(this, aVar2, zzcdhVar2, zzcdaVar, zzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.b(aVar);
            zzbyk zzbykVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbykVar == null ? null : zzbykVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation(point.x, point.y);
            this.zzh.zzc(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, a aVar, zzbyh zzbyhVar) {
        zzR(list, aVar, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, a aVar, zzbyh zzbyhVar) {
        zzS(list, aVar, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) {
        this.zzm = zzbykVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj(a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkY)).booleanValue()) {
            zzbgv zzbgvVar = zzbhe.zziw;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) b.b(aVar);
            if (webView == null) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcei.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzli)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                zzfVar.zza(webView);
                if (((Boolean) zzbjj.zzd.zze()).booleanValue()) {
                    zzcei.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzj.this.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlj)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, a aVar, zzbyh zzbyhVar) {
        zzR(list, aVar, zzbyhVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, a aVar, zzbyh zzbyhVar) {
        zzS(list, aVar, zzbyhVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final a zzm(a aVar, a aVar2, String str, a aVar3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlm)).booleanValue()) {
            return new b(null);
        }
        Context context = (Context) b.b(aVar);
        h hVar = (h) b.b(aVar2);
        n.a aVar4 = (n.a) b.b(aVar3);
        zzbij zzbijVar = this.zzI;
        zzbijVar.zza(context, hVar, str, aVar4);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return new b(zzbijVar.zzb());
    }

    public final /* synthetic */ zzac zzn(zzcdh zzcdhVar, int i5, Bundle bundle) {
        return zzW(this.zzg, zzcdhVar.zza, zzcdhVar.zzb, zzcdhVar.zzc, zzcdhVar.zzd, i5, zzcdhVar.zzf, bundle, zzcdhVar);
    }

    public final /* synthetic */ ArrayList zzo(List list, a aVar) {
        zzazh zzazhVar = this.zzh;
        String zzj = zzazhVar.zzb() != null ? zzazhVar.zzb().zzj(this.zzg, (View) b.b(aVar), null) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (TextUtils.isEmpty(zzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", zzj));
            } else {
                String valueOf = String.valueOf(uri);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ j3.a zzp(final ArrayList arrayList) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgqt() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.this.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ Uri zzq(Uri uri, a aVar) {
        zzfjo zzfjoVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) b.b(aVar), null) : zzfjoVar.zza(uri, this.zzg, (View) b.b(aVar), null);
        } catch (zzazi e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ j3.a zzr(final Uri uri) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgqt(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ j3.a zzs() {
        return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    public final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ j3.a zzu(zzdtk[] zzdtkVarArr, String str, zzdtk zzdtkVar) {
        zzdtkVarArr[0] = zzdtkVar;
        Context context = this.zzg;
        zzbyk zzbykVar = this.zzm;
        Map map = zzbykVar.zzb;
        JSONObject zze2 = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbykVar.zza, null);
        JSONObject zzb2 = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject zzc2 = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        JSONObject zzd2 = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zze2);
        jSONObject.put("ad_view_signal", zzb2);
        jSONObject.put("scroll_view_signal", zzc2);
        jSONObject.put("lock_screen_signal", zzd2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdtkVar.zzc(str, jSONObject);
    }

    public final /* synthetic */ void zzv(zzdtk[] zzdtkVarArr) {
        zzdtk zzdtkVar = zzdtkVarArr[0];
        if (zzdtkVar != null) {
            this.zzj.zzc(zzgzo.zza(zzdtkVar));
        }
    }

    public final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    public final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}
