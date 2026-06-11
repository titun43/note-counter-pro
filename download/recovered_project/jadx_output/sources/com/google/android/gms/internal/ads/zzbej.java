package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzbej {
    private final int zza;
    private final zzbeg zzb = new zzbel();

    public zzbej(int i5) {
        this.zza = i5;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append(((String) arrayList.get(i5)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzbei zzbeiVar = new zzbei();
        int i6 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i6, new zzbeh(this));
        for (String str : split) {
            String[] zzb = zzbek.zzb(str, false);
            if (zzb.length != 0) {
                zzben.zza(zzb, i6, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zzb.zza(((zzbem) it.next()).zzb));
            } catch (IOException e4) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e4);
            }
        }
        return zzbeiVar.toString();
    }
}
