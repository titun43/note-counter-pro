package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
final class zzgre implements Serializable, zzgrd {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgre) {
            return this.zza.equals(((zzgre) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.zza) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgrd
    public final boolean zza(Object obj) {
        int i5 = 0;
        while (true) {
            List list = this.zza;
            if (i5 >= list.size()) {
                return true;
            }
            if (!((zzgrd) list.get(i5)).zza(obj)) {
                return false;
            }
            i5++;
        }
    }
}
