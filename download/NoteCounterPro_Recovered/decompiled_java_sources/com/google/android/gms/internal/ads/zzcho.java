package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcho implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzchr zzd;

    public zzcho(zzchr zzchrVar, String str, String str2, int i5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        Objects.requireNonNull(zzchrVar);
        this.zzd = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", hashMap);
    }
}
