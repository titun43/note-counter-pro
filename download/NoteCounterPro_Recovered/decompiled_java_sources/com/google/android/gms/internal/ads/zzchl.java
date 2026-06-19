package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzchl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzchr zze;

    public zzchl(zzchr zzchrVar, String str, String str2, int i5, int i6, boolean z4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        this.zzd = i6;
        Objects.requireNonNull(zzchrVar);
        this.zze = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", hashMap);
    }
}
