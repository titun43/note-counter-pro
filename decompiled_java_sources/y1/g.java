package y1;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3835b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3836c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3837d;

    /* renamed from: e, reason: collision with root package name */
    public final y0.c f3838e;

    public g(JSONObject jSONObject) {
        this.f3834a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        this.f3835b = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        y0.c cVar = null;
        this.f3836c = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                arrayList.add(optJSONArray.getString(i5));
            }
        }
        zzco.zzk(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        this.f3837d = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject6 != null) {
            cVar = new y0.c();
            optJSONObject6.getString("type");
            JSONArray optJSONArray2 = optJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    arrayList2.add(Integer.valueOf(optJSONArray2.getInt(i6)));
                }
            }
            JSONArray jSONArray = optJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject optJSONObject7 = jSONArray.optJSONObject(i7);
                    if (optJSONObject7 != null) {
                        arrayList3.add(new y0.c(optJSONObject7));
                    }
                }
            }
        }
        this.f3838e = cVar;
    }
}
