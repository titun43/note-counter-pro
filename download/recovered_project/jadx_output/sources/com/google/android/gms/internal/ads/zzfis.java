package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfis {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfis(int i5, int i6, boolean z4) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = z4;
    }

    public static List zza(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i5 = 0;
            int i6 = 0;
            boolean z4 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i5 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i6 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z4 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfis(i5, i6, z4));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
