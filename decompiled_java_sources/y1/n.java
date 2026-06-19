package y1;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.d f3859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3860b;

    public n(b bVar, a2.d dVar) {
        this.f3859a = dVar;
        this.f3860b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004c, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0042, code lost:
    
        r0 = r2.p(y1.b0.f3818i, 119, "Service has been reset to null", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0210  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Exception exc;
        androidx.emoji2.text.p p5;
        List list;
        zzan zzanVar;
        Bundle zzi;
        c0.j jVar;
        b bVar = this.f3860b;
        bVar.getClass();
        zze.zzk("BillingClient", "Querying owned items, item type: ".concat("inapp"));
        ArrayList arrayList = new ArrayList();
        boolean z4 = bVar.f3799m;
        boolean z5 = bVar.f3804r;
        bVar.f3807u.getClass();
        bVar.f3807u.getClass();
        Bundle zzd = zze.zzd(z4, z5, true, false, bVar.f3790c, bVar.f3810y.longValue());
        Exception exc2 = null;
        String str = null;
        while (true) {
            try {
                synchronized (bVar.f3788a) {
                    try {
                        zzanVar = bVar.h;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e4) {
                                    e = e4;
                                    p5 = bVar.p(b0.f3818i, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) p5.h;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e5) {
                                    e = e5;
                                    p5 = bVar.p(b0.f3817g, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) p5.h;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (zzanVar == null) {
                    break;
                }
                if (bVar.f3799m) {
                    zzi = zzanVar.zzj(true != bVar.f3804r ? 9 : 19, bVar.f3793f.getPackageName(), "inapp", str, zzd);
                } else {
                    zzi = zzanVar.zzi(3, bVar.f3793f.getPackageName(), "inapp", str);
                }
                e eVar = b0.f3817g;
                if (zzi == null) {
                    zze.zzl("BillingClient", "getPurchase() got null owned items list");
                    jVar = new c0.j(eVar, 54);
                } else {
                    int zzb = zze.zzb(zzi, "BillingClient");
                    String zzh = zze.zzh(zzi, "BillingClient");
                    c0.j a5 = e.a();
                    a5.f763a = zzb;
                    a5.f764b = zzh;
                    e b2 = a5.b();
                    if (zzb != 0) {
                        zze.zzl("BillingClient", "getPurchase() failed. Response code: " + zzb);
                        jVar = new c0.j(b2, 23);
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            jVar = new c0.j(eVar, 56);
                        } else if (stringArrayList2 == null) {
                            zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            jVar = new c0.j(eVar, 57);
                        } else if (stringArrayList3 == null) {
                            zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            jVar = new c0.j(eVar, 58);
                        } else {
                            jVar = new c0.j(b0.h, 1);
                        }
                    } else {
                        zze.zzl("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        jVar = new c0.j(eVar, 55);
                    }
                }
                e eVar2 = (e) jVar.f764b;
                if (eVar2 != b0.h) {
                    p5 = bVar.p(eVar2, jVar.f763a, "Purchase bundle invalid", exc2);
                    break;
                }
                ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i5 = 0;
                boolean z6 = false;
                while (i5 < stringArrayList5.size()) {
                    String str2 = stringArrayList5.get(i5);
                    String str3 = stringArrayList6.get(i5);
                    exc = exc2;
                    zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i5))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        JSONObject jSONObject = purchase.f839c;
                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z6 = true;
                        }
                        arrayList.add(purchase);
                        i5++;
                        exc2 = exc;
                    } catch (JSONException e6) {
                        p5 = bVar.p(b0.f3817g, 51, "Got an exception trying to decode the purchase!", e6);
                    }
                }
                exc = exc2;
                if (z6) {
                    bVar.t(26, 9, b0.f3817g);
                }
                str = zzi.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str)));
                if (TextUtils.isEmpty(str)) {
                    p5 = new androidx.emoji2.text.p(b0.h, arrayList, 25, false);
                    break;
                }
                exc2 = exc;
            } catch (DeadObjectException e7) {
                e = e7;
                exc = exc2;
            } catch (Exception e8) {
                e = e8;
                exc = exc2;
            }
        }
        list = (List) p5.h;
        if (list != null) {
            this.f3859a.a((e) p5.f274i, list);
        } else {
            this.f3859a.a((e) p5.f274i, zzco.zzl());
        }
        return exc;
    }
}
