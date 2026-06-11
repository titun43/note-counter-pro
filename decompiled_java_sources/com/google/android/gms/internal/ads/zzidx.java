package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzidx extends zzieb {
    public zzidx() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzieb
    public final void zza() {
        if (!zzb()) {
            for (int i5 = 0; i5 < zzc(); i5++) {
                Map.Entry zzd = zzd(i5);
                if (((zzibf) ((zzidy) zzd).zza()).zzd()) {
                    zzd.setValue(Collections.unmodifiableList((List) zzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzibf) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
