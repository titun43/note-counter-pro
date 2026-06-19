package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i5) {
        this.zza = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i5 = this.zza;
        return u.l(new StringBuilder(String.valueOf(i5).length() + 19), "Mp4AlternateGroup: ", i5);
    }
}
