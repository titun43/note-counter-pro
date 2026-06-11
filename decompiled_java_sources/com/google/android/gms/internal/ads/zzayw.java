package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzayw implements zzfwf {
    final /* synthetic */ zzfvh zza;

    public zzayw(zzfvh zzfvhVar) {
        this.zza = zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i5, long j2) {
        this.zza.zzb(i5, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i5, long j2, String str) {
        this.zza.zzf(i5, System.currentTimeMillis() - j2, str);
    }
}
