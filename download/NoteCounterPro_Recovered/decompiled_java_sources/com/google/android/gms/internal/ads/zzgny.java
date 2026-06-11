package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgny implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgoa zza;

    public zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }

    public final void onOpActiveChanged(String str, int i5, String str2, boolean z4) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            try {
                if (z4) {
                    zzgoaVar.zzg(System.currentTimeMillis());
                    zzgoaVar.zzj(true);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (zzgoaVar.zzh() > 0 && currentTimeMillis >= zzgoaVar.zzh()) {
                        zzgoaVar.zzi(currentTimeMillis - zzgoaVar.zzh());
                    }
                    zzgoaVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
