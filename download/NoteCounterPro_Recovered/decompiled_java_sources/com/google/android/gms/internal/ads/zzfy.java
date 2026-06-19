package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzfy implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfy(long j2, long j5, long j6) {
        this.zza = j2;
        this.zzb = j5;
        this.zzc = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb && this.zzc == zzfyVar.zzc;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.zza) + 527;
        return Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (hashCode * 31)) * 31);
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        long j5 = this.zzb;
        int length2 = String.valueOf(j5).length();
        long j6 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j6).length());
        u.t(sb, "Mp4Timestamp: creation time=", j2, ", modification time=");
        sb.append(j5);
        sb.append(", timescale=");
        sb.append(j6);
        return sb.toString();
    }
}
