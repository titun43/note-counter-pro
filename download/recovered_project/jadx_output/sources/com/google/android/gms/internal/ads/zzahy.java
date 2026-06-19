package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzahy implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/id3");
        zztVar.zzM();
        zzt zztVar2 = new zzt();
        zztVar2.zzm("application/x-scte35");
        zztVar2.zzM();
    }

    public zzahy(String str, String str2, long j2, long j5, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j5;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahy.class == obj.getClass()) {
            zzahy zzahyVar = (zzahy) obj;
            if (this.zzc == zzahyVar.zzc && this.zzd == zzahyVar.zzd && Objects.equals(this.zza, zzahyVar.zza) && Objects.equals(this.zzb, zzahyVar.zzb) && Arrays.equals(this.zze, zzahyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzf;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = this.zza.hashCode() + 527;
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        long j2 = this.zzc;
        long j5 = this.zzd;
        int hashCode3 = Arrays.hashCode(this.zze) + (((((hashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) j5)) * 31);
        this.zzf = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        long j2 = this.zzd;
        int length = String.valueOf(j2).length();
        long j5 = this.zzc;
        int length2 = String.valueOf(j5).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + length3 + 8);
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        u.t(sb, ", durationMs=", j5, ", value=");
        sb.append(str2);
        return sb.toString();
    }
}
