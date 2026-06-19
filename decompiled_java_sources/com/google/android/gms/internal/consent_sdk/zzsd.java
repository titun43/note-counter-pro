package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzsd extends zzsi {
    public zzsd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsi
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzc(); i5++) {
                Map.Entry zzg = zzg(i5);
                if (((zzqe) ((zzse) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzqe) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
