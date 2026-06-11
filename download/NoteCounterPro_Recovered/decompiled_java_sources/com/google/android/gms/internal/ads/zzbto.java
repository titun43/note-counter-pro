package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbto {
    public static final List zza(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
            arrayList.add(optJSONArray.getString(i5));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
