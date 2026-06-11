package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i5 = 0; i5 < zzamaVar.zza(); i5++) {
            long zzb = zzamaVar.zzb(i5);
            List zzc = zzamaVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i5 == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzamaVar.zzb(i5 + 1) - zzamaVar.zzb(i5);
                if (zzb2 > 0) {
                    zzdrVar.zza(new zzalx(zzc, zzb, zzb2));
                }
            }
        }
    }
}
