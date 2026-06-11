package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzahx implements zzao {
    public final long zza;

    public zzahx(long j2) {
        this.zza = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahx.class == obj.getClass() && this.zza == ((zzahx) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + 527;
    }

    public final String toString() {
        long j2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j2);
        return sb.toString();
    }
}
