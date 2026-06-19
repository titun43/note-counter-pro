package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzxg extends zzafk {
    private final zzyb zza;
    private final zzaer zzb;
    private final AtomicReference zzc;

    public zzxg(zzyb zzybVar) {
        super(zzybVar);
        this.zza = zzybVar;
        this.zzb = new zzaer();
        this.zzc = new AtomicReference(zzxf.PASS_THROUGH);
    }

    private final zzagh zzh() {
        return this.zzc.get() == zzxf.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zza(zzj zzjVar, int i5, boolean z4) {
        return zzh().zza(zzjVar, i5, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i5, boolean z4, int i6) {
        return zzh().zzb(zzjVar, i5, z4, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzer zzerVar, int i5) {
        zzh().zzc(zzerVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i5, int i6) {
        zzh().zzd(zzerVar, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i5, int i6, int i7, zzagg zzaggVar) {
        zzh().zze(j2, i5, i6, i7, zzaggVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxf.DISCARDING);
        }
    }

    public final boolean zzf() {
        return this.zzc.get() == zzxf.PASS_THROUGH;
    }
}
