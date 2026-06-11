package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdxh;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbj {
    public final String zza;
    public String zzb;
    public zzbzu zzd;
    public Bundle zze;
    private long zzg;
    private long zzh;
    public String zzc = null;
    public Bundle zzf = new Bundle();

    public zzbj(JsonReader jsonReader, zzbzu zzbzuVar) {
        Bundle bundle;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbzuVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        this.zzg = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (nextName.equals("params")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        this.zzh = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() || zzbzuVar == null || (bundle = zzbzuVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdxh.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
        zzbzuVar.zzm.putLong(zzdxh.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
    }
}
