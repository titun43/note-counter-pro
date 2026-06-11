package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfit {
    private String zza;

    public zzfit(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    jsonReader.nextInt();
                }
                jsonReader.skipValue();
            } else if (nextName.equals("description")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
