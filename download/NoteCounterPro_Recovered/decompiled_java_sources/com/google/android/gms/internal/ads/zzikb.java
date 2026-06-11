package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class zzikb {
    final LinkedHashMap zza;

    public zzikb(int i5) {
        this.zza = zzikd.zzc(i5);
    }

    public final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, "key");
        zziko.zza(zzikpVar, "provider");
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
