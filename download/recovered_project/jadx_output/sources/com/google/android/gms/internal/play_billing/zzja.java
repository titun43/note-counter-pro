package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzja extends zzjf {
    public zzja() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjf
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzc(); i5++) {
                Map.Entry zzg = zzg(i5);
                if (((zzha) ((zzjb) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzha) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
