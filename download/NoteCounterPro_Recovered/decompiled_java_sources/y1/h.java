package y1;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3839a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3840b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3841c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3842d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3843e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3844f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3845g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3846i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3847j;

    public h(String str) {
        this.f3839a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3840b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f3841c = optString;
        String optString2 = jSONObject.optString("type");
        this.f3842d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f3843e = jSONObject.optString("title");
        jSONObject.optString("name");
        this.f3844f = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f3845g = jSONObject.optString("skuDetailsToken");
        this.h = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                y0.c cVar = new y0.c();
                jSONObject2.optString("basePlanId");
                jSONObject2.optString("offerId").getClass();
                jSONObject2.getString("offerIdToken");
                JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                        if (optJSONObject != null) {
                            arrayList2.add(new y0.c(optJSONObject));
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                if (optJSONObject2 != null) {
                    optJSONObject2.getInt("commitmentPaymentsCount");
                    optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                }
                JSONObject optJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                if (optJSONObject3 != null) {
                    optJSONObject3.getString("productId");
                    optJSONObject3.optString("title");
                    optJSONObject3.optString("name");
                    optJSONObject3.optString("description");
                    optJSONObject3.optString("basePlanId");
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
                    if (optJSONObject4 != null) {
                        optJSONObject4.optString("billingPeriod");
                        optJSONObject4.optString("priceCurrencyCode");
                        optJSONObject4.optString("formattedPrice");
                        optJSONObject4.optLong("priceAmountMicros");
                        optJSONObject4.optInt("recurrenceMode");
                        optJSONObject4.optInt("billingCycleCount");
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("offerTags");
                if (optJSONArray2 != null) {
                    for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                        arrayList3.add(optJSONArray2.getString(i7));
                    }
                }
                arrayList.add(cVar);
            }
            this.f3846i = arrayList;
        } else {
            this.f3846i = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject5 = this.f3840b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray3 = this.f3840b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList4 = new ArrayList();
        if (optJSONArray3 != null) {
            for (int i8 = 0; i8 < optJSONArray3.length(); i8++) {
                arrayList4.add(new g(optJSONArray3.getJSONObject(i8)));
            }
            this.f3847j = arrayList4;
            return;
        }
        if (optJSONObject5 == null) {
            this.f3847j = null;
        } else {
            arrayList4.add(new g(optJSONObject5));
            this.f3847j = arrayList4;
        }
    }

    public final g a() {
        ArrayList arrayList = this.f3847j;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (g) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return TextUtils.equals(this.f3839a, ((h) obj).f3839a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3839a.hashCode();
    }

    public final String toString() {
        String obj = this.f3840b.toString();
        String valueOf = String.valueOf(this.f3846i);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        s.c.e(sb, this.f3839a, "', parsedJson=", obj, ", productId='");
        sb.append(this.f3841c);
        sb.append("', productType='");
        sb.append(this.f3842d);
        sb.append("', title='");
        sb.append(this.f3843e);
        sb.append("', productDetailsToken='");
        return androidx.emoji2.text.u.n(sb, this.f3845g, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
