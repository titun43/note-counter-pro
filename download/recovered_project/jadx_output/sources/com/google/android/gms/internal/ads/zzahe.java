package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzahe extends zzaeg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzahe(final zzafh zzafhVar, int i5, long j2, long j5) {
        super(r1, r2, r3, 0L, r7, j2, j5, r5, Math.max(6, zzafhVar.zzc));
        long j6;
        Objects.requireNonNull(zzafhVar);
        zzaed zzaedVar = new zzaed() { // from class: com.google.android.gms.internal.ads.zzahc
            @Override // com.google.android.gms.internal.ads.zzaed
            public final /* synthetic */ long zza(long j7) {
                return zzafh.this.zzb(j7);
            }
        };
        zzahd zzahdVar = new zzahd(zzafhVar, i5, null);
        long zza = zzafhVar.zza();
        long j7 = zzafhVar.zzj;
        int i6 = zzafhVar.zzd;
        if (i6 > 0) {
            j6 = ((i6 + zzafhVar.zzc) / 2) + 1;
        } else {
            int i7 = zzafhVar.zza;
            long j8 = 4096;
            if (i7 == zzafhVar.zzb && i7 > 0) {
                j8 = i7;
            }
            j6 = 64 + (((j8 * zzafhVar.zzg) * zzafhVar.zzh) / 8);
        }
    }
}
