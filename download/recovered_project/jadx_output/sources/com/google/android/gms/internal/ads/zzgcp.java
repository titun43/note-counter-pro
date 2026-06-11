package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgcp implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgcp(Runnable runnable, long j2) {
        this.zza = runnable;
        this.zzb = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgcp) obj).zzb);
    }
}
