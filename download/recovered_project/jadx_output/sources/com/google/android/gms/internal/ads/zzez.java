package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzez {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzez(zzfa zzfaVar, int i5) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i5;
    }

    public final void zza() {
        zzfa zzfaVar = this.zza;
        int zzi = zzfaVar.zzd().zzi();
        if (!zzfaVar.zzd().zzk() || zzfaVar.zzd().zzh() == 1 || zzfaVar.zzd().zzh() == 4 || zzi == 0 || zzi == 1) {
            if (this.zzd) {
                zzfaVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == zzi) {
            long j2 = elapsedRealtime - this.zze;
            int i5 = this.zzb;
            if (j2 >= i5) {
                zzfaVar.zze().zza(new zzfb(4, i5));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = elapsedRealtime;
        this.zzc = zzi;
        zzfaVar.zzg().zzk(4);
        zzfaVar.zzg().zzi(4, this.zzb);
    }
}
