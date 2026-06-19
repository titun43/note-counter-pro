package com.lokhnathtechnical.notecounterpro.plugins;

import a2.c;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.g;
import androidx.emoji2.text.p;
import androidx.emoji2.text.r;
import com.android.billingclient.api.Purchase;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import g.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import u1.f;
import y1.a;
import y1.b;
import y1.b0;
import y1.d;
import y1.e;
import y1.h;
import y1.i;
import y1.j;
import y1.n;
import y1.w;
import y1.y;

@CapacitorPlugin(name = PremiumPlugin.TAG, permissions = {})
/* loaded from: classes.dex */
public class PremiumPlugin extends Plugin implements i {
    private static final String PREMIUM_PRODUCT_ID = "note_counter_pro_premium";
    private static final String TAG = "PremiumPlugin";
    private a billingClient;
    private boolean isBillingReady = false;
    private PluginCall pendingPurchaseCall = null;
    private h premiumProductDetails = null;

    private void handlePurchase(Purchase purchase) {
        PluginCall pluginCall;
        JSONObject jSONObject = purchase.f839c;
        JSONObject jSONObject2 = purchase.f839c;
        if (jSONObject.optInt("purchaseState", 1) == 4) {
            if (jSONObject2.optInt("purchaseState", 1) == 4 && (pluginCall = this.pendingPurchaseCall) != null) {
                pluginCall.reject("Purchase is pending");
                this.pendingPurchaseCall = null;
                return;
            }
            return;
        }
        String optString = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
        if (optString == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        }
        r rVar = new r();
        rVar.h = optString;
        this.billingClient.a(new c(2, this, purchase), rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handlePurchase$1(Purchase purchase, e eVar, String str) {
        if (eVar.f3832a == 0) {
            if (this.pendingPurchaseCall != null) {
                JSObject jSObject = new JSObject();
                jSObject.put("success", true);
                jSObject.put("productId", (String) purchase.a().get(0));
                this.pendingPurchaseCall.resolve(jSObject);
                this.pendingPurchaseCall = null;
                return;
            }
            return;
        }
        PluginCall pluginCall = this.pendingPurchaseCall;
        if (pluginCall != null) {
            pluginCall.reject("Consume failed: " + eVar.f3833b);
            this.pendingPurchaseCall = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$queryProductDetails$0(e eVar, List list) {
        if (eVar.f3832a != 0 || list.isEmpty()) {
            Log.e(TAG, "Product details query failed: " + eVar.f3833b);
        } else {
            this.premiumProductDetails = (h) list.get(0);
            Log.d(TAG, "Premium product found: " + this.premiumProductDetails.f3843e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$restorePurchases$2(PluginCall pluginCall, e eVar, List list) {
        boolean z4;
        if (eVar.f3832a != 0) {
            pluginCall.reject("Failed to query purchases: " + eVar.f3833b);
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            Purchase purchase = (Purchase) it.next();
            if (purchase.a().contains(PREMIUM_PRODUCT_ID)) {
                z4 = true;
                if (purchase.f839c.optInt("purchaseState", 1) != 4) {
                    break;
                }
            }
        }
        JSObject jSObject = new JSObject();
        jSObject.put("restored", z4);
        pluginCall.resolve(jSObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryProductDetails() {
        if (this.isBillingReady) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new j());
            k1.j jVar = new k1.j(26);
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ((j) obj).getClass();
                hashSet.add("inapp");
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            zzco zzk = zzco.zzk(arrayList);
            jVar.h = zzk;
            if (zzk == null) {
                throw new IllegalArgumentException("Product list must be set to a non empty list.");
            }
            this.billingClient.c(new f(jVar), new com.getcapacitor.plugin.c(this, 2));
        }
    }

    private void setupBillingClient() {
        b wVar;
        Context context = getContext();
        g gVar = new g(context);
        gVar.f258c = this;
        gVar.f256a = new y0.c();
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((PremiumPlugin) gVar.f258c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((y0.c) gVar.f256a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((y0.c) gVar.f256a).getClass();
        if (((PremiumPlugin) gVar.f258c) != null) {
            y0.c cVar = (y0.c) gVar.f256a;
            PremiumPlugin premiumPlugin = (PremiumPlugin) gVar.f258c;
            wVar = gVar.a() ? new w(cVar, context, premiumPlugin) : new b(cVar, context, premiumPlugin);
        } else {
            y0.c cVar2 = (y0.c) gVar.f256a;
            wVar = gVar.a() ? new w(cVar2, context) : new b(cVar2, context);
        }
        this.billingClient = wVar;
        wVar.e(new y1.c() { // from class: com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin.1
            @Override // y1.c
            public void onBillingServiceDisconnected() {
                PremiumPlugin.this.isBillingReady = false;
                Log.d(PremiumPlugin.TAG, "Billing service disconnected");
            }

            @Override // y1.c
            public void onBillingSetupFinished(e eVar) {
                if (eVar.f3832a == 0) {
                    PremiumPlugin.this.isBillingReady = true;
                    Log.d(PremiumPlugin.TAG, "Billing client ready");
                    PremiumPlugin.this.queryProductDetails();
                } else {
                    Log.e(PremiumPlugin.TAG, "Billing setup failed: " + eVar.f3833b);
                }
            }
        });
    }

    @PluginMethod
    public void isPremiumAvailable(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("available", this.premiumProductDetails != null);
        h hVar = this.premiumProductDetails;
        if (hVar != null) {
            jSObject.put("productId", hVar.f3841c);
            jSObject.put("title", this.premiumProductDetails.f3843e);
            jSObject.put("description", this.premiumProductDetails.f3844f);
            if (this.premiumProductDetails.a() != null) {
                jSObject.put("price", this.premiumProductDetails.a().f3834a);
                jSObject.put("currency", this.premiumProductDetails.a().f3835b);
            }
        }
        pluginCall.resolve(jSObject);
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        super.load();
        setupBillingClient();
    }

    @Override // y1.i
    public void onPurchasesUpdated(e eVar, List<Purchase> list) {
        int i5 = eVar.f3832a;
        if (i5 == 0 && list != null) {
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                handlePurchase(it.next());
            }
        } else {
            if (i5 == 1) {
                PluginCall pluginCall = this.pendingPurchaseCall;
                if (pluginCall != null) {
                    pluginCall.reject("Purchase cancelled");
                    this.pendingPurchaseCall = null;
                    return;
                }
                return;
            }
            PluginCall pluginCall2 = this.pendingPurchaseCall;
            if (pluginCall2 != null) {
                pluginCall2.reject("Purchase failed: " + eVar.f3833b);
                this.pendingPurchaseCall = null;
            }
        }
    }

    @PluginMethod
    public void purchasePremium(PluginCall pluginCall) {
        if (!this.isBillingReady) {
            pluginCall.reject("Billing not ready. Please try again.");
            return;
        }
        if (this.premiumProductDetails == null) {
            pluginCall.reject("Premium product not available");
            return;
        }
        this.pendingPurchaseCall = pluginCall;
        k activity = getActivity();
        if (activity == null) {
            pluginCall.reject("Activity not available");
            this.pendingPurchaseCall = null;
            return;
        }
        p pVar = new p(23);
        h hVar = this.premiumProductDetails;
        pVar.h = hVar;
        if (hVar.a() != null) {
            hVar.a().getClass();
            String str = hVar.a().f3836c;
            if (str != null) {
                pVar.f274i = str;
            }
        }
        zzbe.zzc((h) pVar.h, "ProductDetails is required for constructing ProductDetailsParams.");
        if (((h) pVar.h).f3846i != null) {
            zzbe.zzc((String) pVar.f274i, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        Object[] objArr = {new d(pVar)};
        boolean z4 = true;
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(arrayList));
        boolean isEmpty = arrayList2.isEmpty();
        if (isEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        arrayList2.forEach(new y());
        d1.a aVar = new d1.a();
        aVar.f1183a = (isEmpty || ((d) arrayList2.get(0)).f3830a.f3840b.optString("packageName").isEmpty()) ? false : true;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
            z4 = false;
        }
        boolean isEmpty2 = TextUtils.isEmpty(null);
        if (z4 && !isEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        aVar.f1184b = new y0.c();
        aVar.f1186d = new ArrayList();
        aVar.f1185c = zzco.zzk(arrayList2);
        e b2 = this.billingClient.b(activity, aVar);
        if (b2.f3832a != 0) {
            pluginCall.reject("Billing flow failed: " + b2.f3833b);
            this.pendingPurchaseCall = null;
        }
    }

    @PluginMethod
    public void restorePurchases(PluginCall pluginCall) {
        if (!this.isBillingReady) {
            pluginCall.reject("Billing not ready");
            return;
        }
        a aVar = this.billingClient;
        a2.d dVar = new a2.d(pluginCall);
        b bVar = (b) aVar;
        bVar.getClass();
        if (!bVar.d()) {
            e eVar = b0.f3818i;
            bVar.t(2, 9, eVar);
            dVar.a(eVar, zzco.zzl());
        } else {
            if (TextUtils.isEmpty("inapp")) {
                zze.zzl("BillingClient", "Please provide a valid product type.");
                e eVar2 = b0.f3815e;
                bVar.t(50, 9, eVar2);
                dVar.a(eVar2, zzco.zzl());
                return;
            }
            if (b.f(new n(bVar, dVar), 30000L, new c0.a(23, bVar, dVar), bVar.r(), bVar.j()) == null) {
                e g5 = bVar.g();
                bVar.t(25, 9, g5);
                dVar.a(g5, zzco.zzl());
            }
        }
    }
}
