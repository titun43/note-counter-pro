package com.google.android.gms.internal.ads;

import g4.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfza {
    private final zzfyw zza;

    public final /* synthetic */ zzfyy zza() {
        zzibr zzbu = this.zza.zzbu();
        i.d(zzbu, "build(...)");
        return (zzfyy) zzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map zzb = this.zza.zzb();
        i.d(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(zzb);
    }

    public final void zzc(zziev zzievVar, String str, zzfyu zzfyuVar) {
        i.e(zzievVar, "<this>");
        i.e(str, "key");
        i.e(zzfyuVar, "value");
        this.zza.zzc(str, zzfyuVar);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String str) {
        i.e(zzievVar, "<this>");
        i.e(str, "key");
        this.zza.zza(str);
    }
}
