package y1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zzcx;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfn;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import y1.d;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3788a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f3789b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3790c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3791d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.google.android.gms.common.api.internal.c0 f3792e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f3793f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.emoji2.text.p f3794g;
    public volatile zzan h;

    /* renamed from: i, reason: collision with root package name */
    public volatile p f3795i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3796j;

    /* renamed from: k, reason: collision with root package name */
    public int f3797k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3798l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3799m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3800n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3801o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3802p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3803q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3804r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3805s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3806t;

    /* renamed from: u, reason: collision with root package name */
    public final y0.c f3807u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3808v;
    public ExecutorService w;

    /* renamed from: x, reason: collision with root package name */
    public volatile zzev f3809x;

    /* renamed from: y, reason: collision with root package name */
    public final Long f3810y;

    public b(y0.c cVar, Context context) {
        this.f3788a = new Object();
        this.f3789b = 0;
        this.f3791d = new Handler(Looper.getMainLooper());
        this.f3797k = 0;
        long nextLong = new Random().nextLong();
        this.f3810y = Long.valueOf(nextLong);
        this.f3790c = i();
        this.f3793f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(i());
        zzc.zzn(this.f3793f.getPackageName());
        zzc.zzm(nextLong);
        this.f3794g = new androidx.emoji2.text.p(this.f3793f, (zzku) zzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3792e = new com.google.android.gms.common.api.internal.c0(this.f3793f, (i) null, this.f3794g);
        this.f3807u = cVar;
        this.f3793f.getPackageName();
    }

    public static Future f(Callable callable, long j2, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new c0.a(24, submit, runnable), (long) (j2 * 0.95d));
            return submit;
        } catch (Exception e4) {
            zze.zzm("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    public static String i() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    @Override // y1.a
    public void a(a2.c cVar, androidx.emoji2.text.r rVar) {
        if (!d()) {
            e eVar = b0.f3818i;
            t(2, 4, eVar);
            cVar.b(eVar, rVar.h);
        } else if (f(new k(this, rVar, cVar, 0), 30000L, new c0.n(this, cVar, rVar, 7, false), r(), j()) == null) {
            e g5 = g();
            t(25, 4, g5);
            cVar.b(g5, rVar.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051e  */
    @Override // y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e b(g.k kVar, final d1.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        e a5;
        String str5;
        String str6;
        Future f5;
        Object obj;
        int zza;
        String string;
        String str7;
        boolean z4;
        String str8;
        String str9;
        d dVar;
        String str10;
        String str11;
        boolean z5;
        String str12;
        int i5;
        final int i6;
        final b bVar = this;
        if (bVar.f3792e == null || ((i) bVar.f3792e.f960c) == null) {
            e eVar = b0.f3825p;
            bVar.t(12, 2, eVar);
            return eVar;
        }
        if (!bVar.d()) {
            e eVar2 = b0.f3818i;
            bVar.t(2, 2, eVar2);
            bVar.v(eVar2);
            return eVar2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) aVar.f1186d);
        zzco zzcoVar = (zzco) aVar.f1185c;
        String str13 = null;
        if (zzcx.zza(arrayList, null) != null) {
            throw new ClassCastException();
        }
        d dVar2 = (d) zzcx.zza(zzcoVar, null);
        h hVar = dVar2.f3830a;
        String str14 = hVar.f3841c;
        String str15 = hVar.f3842d;
        if (str15.equals("subs") && !bVar.f3796j) {
            zze.zzl("BillingClient", "Current client doesn't support subscriptions.");
            e eVar3 = b0.f3820k;
            bVar.t(9, 2, eVar3);
            bVar.v(eVar3);
            return eVar3;
        }
        ((y0.c) aVar.f1184b).getClass();
        if ((((zzco) aVar.f1185c).stream().anyMatch(new x()) || aVar.f1183a) && !bVar.f3798l) {
            zze.zzl("BillingClient", "Current client doesn't support extra params for buy intent.");
            e eVar4 = b0.f3816f;
            bVar.t(18, 2, eVar4);
            bVar.v(eVar4);
            return eVar4;
        }
        if (arrayList.size() > 1 && !bVar.f3802p) {
            zze.zzl("BillingClient", "Current client doesn't support multi-item purchases.");
            e eVar5 = b0.f3821l;
            bVar.t(19, 2, eVar5);
            bVar.v(eVar5);
            return eVar5;
        }
        if (!zzcoVar.isEmpty() && !bVar.f3803q) {
            zze.zzl("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            e eVar6 = b0.f3823n;
            bVar.t(20, 2, eVar6);
            bVar.v(eVar6);
            return eVar6;
        }
        if (((zzco) aVar.f1185c).isEmpty()) {
            a5 = b0.h;
            str2 = str15;
            str4 = "BUY_INTENT";
            str = null;
        } else {
            d dVar3 = (d) ((zzco) aVar.f1185c).get(0);
            int i7 = 1;
            while (true) {
                str = str13;
                if (i7 < ((zzco) aVar.f1185c).size()) {
                    d dVar4 = (d) ((zzco) aVar.f1185c).get(i7);
                    str2 = str15;
                    if (!dVar4.f3830a.f3842d.equals(dVar3.f3830a.f3842d) && !dVar4.f3830a.f3842d.equals("play_pass_subs")) {
                        a5 = b0.a(5, "All products should have same ProductType.");
                        str4 = "BUY_INTENT";
                        break;
                    }
                    i7++;
                    str13 = str;
                    str15 = str2;
                } else {
                    str2 = str15;
                    h hVar2 = dVar3.f3830a;
                    String optString = hVar2.f3840b.optString("packageName");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    str3 = str14;
                    zzco zzcoVar2 = (zzco) aVar.f1185c;
                    int size = zzcoVar2.size();
                    str4 = "BUY_INTENT";
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            int i9 = i8;
                            h hVar3 = ((d) zzcoVar2.get(i8)).f3830a;
                            zzco zzcoVar3 = zzcoVar2;
                            int i10 = size;
                            hVar3.f3842d.equals("subs");
                            String str16 = hVar3.f3841c;
                            String str17 = hVar3.f3841c;
                            if (!hashSet.contains(str16)) {
                                hashSet.add(str17);
                                if (!hVar2.f3842d.equals("play_pass_subs") && !hVar3.f3842d.equals("play_pass_subs") && !optString.equals(hVar3.f3840b.optString("packageName"))) {
                                    a5 = b0.a(5, "All products must have the same package name.");
                                    break;
                                }
                                i8 = i9 + 1;
                                zzcoVar2 = zzcoVar3;
                                size = i10;
                            } else {
                                a5 = b0.a(5, "ProductId can not be duplicated. Invalid product id: " + str17 + ".");
                                break;
                            }
                        } else {
                            Iterator it = hashSet2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str18 = (String) it.next();
                                    if (hashSet.contains(str18)) {
                                        a5 = b0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str18 + ".");
                                        break;
                                    }
                                } else {
                                    g a6 = hVar2.a();
                                    a5 = (a6 == null || a6.f3838e == null) ? b0.h : b0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        str3 = str14;
        if (a5 != b0.h) {
            bVar.t(120, 2, a5);
            bVar.v(a5);
            return a5;
        }
        if (bVar.f3798l) {
            boolean z6 = bVar.f3799m;
            bVar.f3807u.getClass();
            bVar.f3807u.getClass();
            boolean z7 = bVar.f3808v;
            String str19 = bVar.f3790c;
            long longValue = bVar.f3810y.longValue();
            final String packageName = bVar.f3793f.getPackageName();
            final Bundle bundle = new Bundle();
            zze.zzc(bundle, str19, longValue);
            ((y0.c) aVar.f1184b).getClass();
            if (TextUtils.isEmpty(str)) {
                str7 = str;
            } else {
                str7 = str;
                bundle.putString("accountId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("obfuscatedProfileId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str7)));
            }
            ((y0.c) aVar.f1184b).getClass();
            if (!TextUtils.isEmpty(str7)) {
                ((y0.c) aVar.f1184b).getClass();
                bundle.putString("oldSkuPurchaseToken", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("oldSkuPurchaseId", str7);
            }
            ((y0.c) aVar.f1184b).getClass();
            if (!TextUtils.isEmpty(str7)) {
                ((y0.c) aVar.f1184b).getClass();
                bundle.putString("originalExternalTransactionId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("paymentsPurchaseParams", str7);
            }
            if (z6) {
                z4 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z4 = true;
            }
            if (z7) {
                bundle.putBoolean("enableAlternativeBilling", z4);
            }
            if (((zzco) aVar.f1185c).stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zza
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    int i11 = zze.zza;
                    return false;
                }
            })) {
                zzfm zza2 = zzfn.zza();
                zza2.zza((Iterable) ((zzco) aVar.f1185c).stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zzb
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i11 = zze.zza;
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.zzc
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i11 = zze.zza;
                        String str20 = ((d) obj2).f3830a.f3841c;
                        zzfk zza3 = zzfl.zza();
                        zzfp zza4 = zzfq.zza();
                        zza4.zza("subs:" + packageName + ":" + str20);
                        zza3.zza(zza4);
                        zzfq.zza();
                        throw null;
                    }
                }).collect(zzco.zzo()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzfn) zza2.zzf()).zzh());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(zzcoVar.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(zzcoVar.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str8 = "proxyPackageVersion";
                str9 = "BillingClient";
                int i11 = 0;
                while (i11 < zzcoVar.size()) {
                    d dVar5 = (d) zzcoVar.get(i11);
                    d dVar6 = dVar2;
                    h hVar4 = dVar5.f3830a;
                    if (!hVar4.f3845g.isEmpty()) {
                        arrayList4.add(hVar4.f3845g);
                    }
                    arrayList5.add(dVar5.f3831b);
                    String str20 = hVar4.h;
                    ArrayList arrayList8 = hVar4.f3847j;
                    if (arrayList8 == null || arrayList8.isEmpty()) {
                        str10 = str20;
                    } else {
                        ArrayList arrayList9 = hVar4.f3847j;
                        int size2 = arrayList9.size();
                        str10 = str20;
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList9.get(i12);
                            int i13 = i12 + 1;
                            g gVar = (g) obj2;
                            ArrayList arrayList10 = arrayList9;
                            if (!TextUtils.isEmpty(gVar.f3837d)) {
                                str11 = gVar.f3837d;
                                break;
                            }
                            arrayList9 = arrayList10;
                            i12 = i13;
                        }
                    }
                    str11 = str10;
                    if (!TextUtils.isEmpty(str11)) {
                        arrayList6.add(str11);
                    }
                    if (i11 > 0) {
                        arrayList2.add(((d) zzcoVar.get(i11)).f3830a.f3841c);
                        arrayList3.add(((d) zzcoVar.get(i11)).f3830a.f3842d);
                    }
                    i11++;
                    dVar2 = dVar6;
                }
                dVar = dVar2;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList11 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList11.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList11);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        arrayList.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
                str8 = "proxyPackageVersion";
                dVar = dVar2;
                str9 = "BillingClient";
            }
            bVar = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !bVar.f3800n) {
                e eVar7 = b0.f3822m;
                bVar.t(21, 2, eVar7);
                bVar.v(eVar7);
                return eVar7;
            }
            d dVar7 = dVar;
            if (TextUtils.isEmpty(dVar7.f3830a.f3840b.optString("packageName"))) {
                z5 = false;
            } else {
                bundle.putString("skuPackageName", dVar7.f3830a.f3840b.optString("packageName"));
                z5 = true;
            }
            str6 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = kVar.getIntent();
            if (intent == null) {
                str5 = str9;
                zze.zzl(str5, "Activity's intent is null.");
            } else {
                str5 = str9;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str12 = str8;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str12 = str8;
                    }
                    try {
                        bundle.putString(str12, bVar.f3793f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        bundle.putString(str12, "package not found");
                        if (!bVar.f3803q) {
                        }
                        if (!bVar.f3801o) {
                        }
                        if (bVar.f3799m) {
                        }
                    }
                }
            }
            if (!bVar.f3803q && !zzcoVar.isEmpty()) {
                i5 = 17;
            } else if (!bVar.f3801o && z5) {
                i5 = 15;
            } else if (bVar.f3799m) {
                i5 = 6;
            } else {
                i6 = 9;
                final String str21 = str2;
                final String str22 = str3;
                f5 = f(new Callable(i6, str22, str21, aVar, bundle) { // from class: y1.l

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f3853b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f3854c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f3855d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Bundle f3856e;

                    {
                        this.f3856e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzan zzanVar;
                        b bVar2 = b.this;
                        int i14 = this.f3853b;
                        String str23 = this.f3854c;
                        String str24 = this.f3855d;
                        Bundle bundle2 = this.f3856e;
                        try {
                            synchronized (bVar2.f3788a) {
                                zzanVar = bVar2.h;
                            }
                            return zzanVar == null ? zze.zzn(b0.f3818i, 119) : zzanVar.zzg(i14, bVar2.f3793f.getPackageName(), str23, str24, null, bundle2);
                        } catch (DeadObjectException e4) {
                            return zze.zzo(b0.f3818i, 5, z.a(e4));
                        } catch (Exception e5) {
                            return zze.zzo(b0.f3817g, 5, z.a(e5));
                        }
                    }
                }, 5000L, null, bVar.f3791d, bVar.j());
            }
            i6 = i5;
            final String str212 = str2;
            final String str222 = str3;
            f5 = f(new Callable(i6, str222, str212, aVar, bundle) { // from class: y1.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f3853b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f3854c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f3855d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f3856e;

                {
                    this.f3856e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzan zzanVar;
                    b bVar2 = b.this;
                    int i14 = this.f3853b;
                    String str23 = this.f3854c;
                    String str24 = this.f3855d;
                    Bundle bundle2 = this.f3856e;
                    try {
                        synchronized (bVar2.f3788a) {
                            zzanVar = bVar2.h;
                        }
                        return zzanVar == null ? zze.zzn(b0.f3818i, 119) : zzanVar.zzg(i14, bVar2.f3793f.getPackageName(), str23, str24, null, bundle2);
                    } catch (DeadObjectException e4) {
                        return zze.zzo(b0.f3818i, 5, z.a(e4));
                    } catch (Exception e5) {
                        return zze.zzo(b0.f3817g, 5, z.a(e5));
                    }
                }
            }, 5000L, null, bVar.f3791d, bVar.j());
        } else {
            str5 = "BillingClient";
            str6 = str;
            f5 = f(new k(bVar, str3, str2, 2), 5000L, null, bVar.f3791d, bVar.j());
        }
        try {
            if (f5 == null) {
                e eVar8 = b0.f3813c;
                bVar.t(25, 2, eVar8);
                bVar.v(eVar8);
                return eVar8;
            }
            Bundle bundle2 = (Bundle) f5.get(5000L, TimeUnit.MILLISECONDS);
            int zzb = zze.zzb(bundle2, str5);
            String zzh = zze.zzh(bundle2, str5);
            if (zzb == 0) {
                Intent intent2 = new Intent(kVar, (Class<?>) ProxyBillingActivity.class);
                String str23 = str4;
                intent2.putExtra(str23, (PendingIntent) bundle2.getParcelable(str23));
                kVar.startActivity(intent2);
                return b0.h;
            }
            zze.zzl(str5, "Unable to buy item, Error response code: " + zzb);
            e a7 = b0.a(zzb, zzh);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    zze.zzl(str5, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        zza = zzkg.zza(((Integer) obj).intValue());
                        if (zza == 1) {
                            zza = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                zze.zzl(str5, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            bVar.u(zza, 2, a7, string);
                            bVar.v(a7);
                            return a7;
                        }
                        string = str6;
                        bVar.u(zza, 2, a7, string);
                        bVar.v(a7);
                        return a7;
                    }
                    zze.zzl(str5, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            zza = 1;
            if (zza == 1) {
            }
            if (bundle2 != null) {
            }
            string = str6;
            bVar.u(zza, 2, a7, string);
            bVar.v(a7);
            return a7;
        } catch (CancellationException e4) {
            e = e4;
            zze.zzm(str5, "Time out while launching billing flow. Try to reconnect", e);
            e eVar9 = b0.f3819j;
            bVar.u(4, 2, eVar9, z.a(e));
            bVar.v(eVar9);
            return eVar9;
        } catch (TimeoutException e5) {
            e = e5;
            zze.zzm(str5, "Time out while launching billing flow. Try to reconnect", e);
            e eVar92 = b0.f3819j;
            bVar.u(4, 2, eVar92, z.a(e));
            bVar.v(eVar92);
            return eVar92;
        } catch (Exception e6) {
            zze.zzm(str5, "Exception while launching billing flow. Try to reconnect", e6);
            e eVar10 = b0.f3818i;
            bVar.u(5, 2, eVar10, z.a(e6));
            bVar.v(eVar10);
            return eVar10;
        }
    }

    @Override // y1.a
    public void c(u1.f fVar, com.getcapacitor.plugin.c cVar) {
        if (!d()) {
            e eVar = b0.f3818i;
            t(2, 7, eVar);
            cVar.f(eVar, new ArrayList());
        } else {
            if (!this.f3803q) {
                zze.zzl("BillingClient", "Querying product details is not supported.");
                e eVar2 = b0.f3823n;
                t(20, 7, eVar2);
                cVar.f(eVar2, new ArrayList());
                return;
            }
            if (f(new k(this, fVar, cVar, 1), 30000L, new c0.a(25, this, cVar), r(), j()) == null) {
                e g5 = g();
                t(25, 7, g5);
                cVar.f(g5, new ArrayList());
            }
        }
    }

    public final boolean d() {
        boolean z4;
        synchronized (this.f3788a) {
            try {
                z4 = false;
                if (this.f3789b == 2 && this.h != null && this.f3795i != null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public void e(c cVar) {
        e eVar;
        synchronized (this.f3788a) {
            try {
                if (d()) {
                    eVar = s();
                } else if (this.f3789b == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    eVar = b0.f3814d;
                    t(37, 6, eVar);
                } else if (this.f3789b == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    eVar = b0.f3818i;
                    t(38, 6, eVar);
                } else {
                    m(1);
                    n();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f3795i = new p(this, cVar);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f3793f.getPackageManager().queryIntentServices(intent, 0);
                    int i5 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i5 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f3790c);
                                synchronized (this.f3788a) {
                                    try {
                                        if (this.f3789b == 2) {
                                            eVar = s();
                                        } else if (this.f3789b != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            eVar = b0.f3818i;
                                            t(117, 6, eVar);
                                        } else {
                                            p pVar = this.f3795i;
                                            if (this.f3793f.bindService(intent2, pVar, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                eVar = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i5 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    m(0);
                    zze.zzk("BillingClient", "Billing service unavailable on device.");
                    eVar = b0.f3812b;
                    t(i5, 6, eVar);
                }
            } finally {
            }
        }
        if (eVar != null) {
            cVar.onBillingSetupFinished(eVar);
        }
    }

    public final e g() {
        int[] iArr = {0, 3};
        synchronized (this.f3788a) {
            for (int i5 = 0; i5 < 2; i5++) {
                if (this.f3789b == iArr[i5]) {
                    return b0.f3818i;
                }
            }
            return b0.f3817g;
        }
    }

    public final void h() {
        if (TextUtils.isEmpty(null)) {
            this.f3793f.getPackageName();
        }
    }

    public final synchronized ExecutorService j() {
        try {
            if (this.w == null) {
                this.w = Executors.newFixedThreadPool(zze.zza, new m());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.w;
    }

    public final void k(zzjz zzjzVar) {
        try {
            androidx.emoji2.text.p pVar = this.f3794g;
            int i5 = this.f3797k;
            pVar.getClass();
            try {
                zzks zzksVar = (zzks) ((zzku) pVar.h).zzn();
                zzksVar.zza(i5);
                pVar.h = (zzku) zzksVar.zzf();
                pVar.H(zzjzVar);
            } catch (Throwable th) {
                zze.zzm("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void l(zzkd zzkdVar) {
        try {
            androidx.emoji2.text.p pVar = this.f3794g;
            int i5 = this.f3797k;
            pVar.getClass();
            try {
                zzks zzksVar = (zzks) ((zzku) pVar.h).zzn();
                zzksVar.zza(i5);
                pVar.h = (zzku) zzksVar.zzf();
                pVar.I(zzkdVar);
            } catch (Throwable th) {
                zze.zzm("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void m(int i5) {
        synchronized (this.f3788a) {
            try {
                if (this.f3789b == 3) {
                    return;
                }
                int i6 = this.f3789b;
                zze.zzk("BillingClient", "Setting clientState from " + (i6 != 0 ? i6 != 1 ? i6 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i5 != 0 ? i5 != 1 ? i5 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f3789b = i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        synchronized (this.f3788a) {
            if (this.f3795i != null) {
                try {
                    this.f3793f.unbindService(this.f3795i);
                } catch (Throwable th) {
                    try {
                        zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
                        this.h = null;
                        this.f3795i = null;
                    } finally {
                        this.h = null;
                        this.f3795i = null;
                    }
                }
            }
        }
    }

    public final i3.a o(e eVar, int i5, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        u(i5, 7, eVar, z.a(exc));
        return new i3.a(eVar.f3832a, eVar.f3833b, new ArrayList());
    }

    public final androidx.emoji2.text.p p(e eVar, int i5, String str, Exception exc) {
        u(i5, 9, eVar, z.a(exc));
        zze.zzm("BillingClient", str, exc);
        return new androidx.emoji2.text.p(eVar, null, 25, false);
    }

    public final void q(a2.c cVar, String str, e eVar, int i5, String str2, Exception exc) {
        zze.zzm("BillingClient", str2, exc);
        u(i5, 4, eVar, z.a(exc));
        cVar.b(eVar, str);
    }

    public final Handler r() {
        return Looper.myLooper() == null ? this.f3791d : new Handler(Looper.myLooper());
    }

    public final e s() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzc = zzkd.zzc();
        zzc.zzn(6);
        zzlv zzc2 = zzlx.zzc();
        zzc2.zza(true);
        zzc.zzm(zzc2);
        l((zzkd) zzc.zzf());
        return b0.h;
    }

    public final void t(int i5, int i6, e eVar) {
        try {
            k(z.b(i5, i6, eVar));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void u(int i5, int i6, e eVar, String str) {
        try {
            k(z.c(i5, i6, eVar, str));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void v(e eVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f3791d.post(new c0.a(26, this, eVar));
    }

    public b(y0.c cVar, Context context, i iVar) {
        String i5 = i();
        this.f3788a = new Object();
        this.f3789b = 0;
        this.f3791d = new Handler(Looper.getMainLooper());
        this.f3797k = 0;
        long nextLong = new Random().nextLong();
        this.f3810y = Long.valueOf(nextLong);
        this.f3790c = i5;
        this.f3793f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(i5);
        zzc.zzn(this.f3793f.getPackageName());
        zzc.zzm(nextLong);
        this.f3794g = new androidx.emoji2.text.p(this.f3793f, (zzku) zzc.zzf());
        if (iVar == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3792e = new com.google.android.gms.common.api.internal.c0(this.f3793f, iVar, this.f3794g);
        this.f3807u = cVar;
        this.f3808v = false;
        this.f3793f.getPackageName();
    }
}
