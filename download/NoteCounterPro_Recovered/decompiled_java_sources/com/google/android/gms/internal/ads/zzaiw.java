package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzaiw implements zzao {
    public final List zza;

    public zzaiw(List list) {
        this.zza = list;
        boolean z4 = false;
        if (!list.isEmpty()) {
            long j2 = ((zzaiv) list.get(0)).zzb;
            int i5 = 1;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                if (((zzaiv) list.get(i5)).zza < j2) {
                    z4 = true;
                    break;
                } else {
                    j2 = ((zzaiv) list.get(i5)).zzb;
                    i5++;
                }
            }
        }
        zzgrc.zza(!z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaiw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
