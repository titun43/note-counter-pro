package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i5, boolean z4, int i6) {
        int zza = zzjVar.zza(this.zza, 0, Math.min(4096, i5));
        if (zza != -1) {
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i5, int i6) {
        zzerVar.zzk(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i5, int i6, int i7, zzagg zzaggVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
    }
}
