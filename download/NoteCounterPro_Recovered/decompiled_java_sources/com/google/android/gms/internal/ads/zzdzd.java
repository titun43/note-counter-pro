package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdzd {
    public final long zza;
    public final int[] zzb;

    private zzdzd(long j2, int[] iArr) {
        this.zza = j2;
        this.zzb = iArr;
    }

    public static zzguf zza(JsonReader jsonReader) {
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzguf zzi = zzguf.zzi();
            jsonReader.beginObject();
            zzdzd zzdzdVar = null;
            Long l5 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l5 = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzguc zzgucVar2 = new zzguc();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgucVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgucVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l5 != null && !zzi.isEmpty()) {
                long longValue = l5.longValue();
                int[] iArr = new int[zzi.size()];
                for (int i6 = 0; i6 < zzi.size(); i6++) {
                    iArr[i6] = ((Integer) zzi.get(i6)).intValue();
                }
                zzdzdVar = new zzdzd(longValue, iArr);
            }
            if (zzdzdVar != null) {
                zzgucVar.zzf(zzdzdVar);
            }
        }
        jsonReader.endArray();
        return zzgucVar.zzi();
    }
}
