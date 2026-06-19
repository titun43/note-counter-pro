package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

@Deprecated
/* loaded from: classes.dex */
public class zzaiu implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaiu(long j2, long j5, long j6, long j7, long j8) {
        this.zza = j2;
        this.zzb = j5;
        this.zzc = j6;
        this.zzd = j7;
        this.zze = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaiu zzaiuVar = (zzaiu) obj;
            if (this.zza == zzaiuVar.zza && this.zzb == zzaiuVar.zzb && this.zzc == zzaiuVar.zzc && this.zzd == zzaiuVar.zzd && this.zze == zzaiuVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.zza) + 527;
        int hashCode2 = Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (hashCode * 31)) * 31);
        return Long.hashCode(this.zze) + ((Long.hashCode(this.zzd) + (hashCode2 * 31)) * 31);
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        long j5 = this.zzb;
        int length2 = String.valueOf(j5).length();
        long j6 = this.zzc;
        int length3 = String.valueOf(j6).length();
        long j7 = this.zzd;
        int length4 = String.valueOf(j7).length();
        long j8 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j8).length());
        u.t(sb, "Motion photo metadata: photoStartPosition=", j2, ", photoSize=");
        sb.append(j5);
        u.t(sb, ", photoPresentationTimestampUs=", j6, ", videoStartPosition=");
        sb.append(j7);
        sb.append(", videoSize=");
        sb.append(j8);
        return sb.toString();
    }
}
