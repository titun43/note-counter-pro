package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    public zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z4;
        ConditionVariable conditionVariable2;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        conditionVariable = zzazb.zzd;
        synchronized (conditionVariable) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z5 = false;
            try {
                z4 = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
            if (z4) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z5 = z4;
            this.zza.zzb = Boolean.valueOf(z5);
            conditionVariable2 = zzazb.zzd;
            conditionVariable2.open();
        }
    }
}
