package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class zzant {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzant(String str, int i5, String str2, Set set) {
        this.zzb = i5;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzant zza(String str, int i5) {
        String str2;
        String trim = str.trim();
        zzgrc.zza(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String str3 = zzfj.zza;
        String[] split = trim.split("\\.", -1);
        String str4 = split[0];
        HashSet hashSet = new HashSet();
        for (int i6 = 1; i6 < split.length; i6++) {
            hashSet.add(split[i6]);
        }
        return new zzant(str4, i5, str2, hashSet);
    }

    public static zzant zzb() {
        return new zzant(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Collections.EMPTY_SET);
    }
}
