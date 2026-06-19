package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d5, double d6) {
        List list;
        int i5 = 0;
        while (true) {
            list = this.zza;
            if (i5 >= list.size()) {
                break;
            }
            double doubleValue = ((Double) this.zzc.get(i5)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i5)).doubleValue();
            if (d5 < doubleValue || (doubleValue == d5 && d6 < doubleValue2)) {
                break;
            }
            i5++;
        }
        list.add(i5, str);
        this.zzc.add(i5, Double.valueOf(d5));
        this.zzb.add(i5, Double.valueOf(d6));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }

    public final /* synthetic */ List zzc() {
        return this.zza;
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }

    public final /* synthetic */ List zze() {
        return this.zzc;
    }
}
