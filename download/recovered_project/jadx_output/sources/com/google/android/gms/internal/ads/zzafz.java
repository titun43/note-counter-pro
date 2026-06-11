package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzafz {
    public static final zzafz zza = new zzafz(0, 0);
    public final long zzb;
    public final long zzc;

    public zzafz(long j2, long j5) {
        this.zzb = j2;
        this.zzc = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j2 = this.zzb;
        int length = String.valueOf(j2).length();
        long j5 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j5).length() + 1);
        u.t(sb, "[timeUs=", j2, ", position=");
        sb.append(j5);
        sb.append("]");
        return sb.toString();
    }
}
