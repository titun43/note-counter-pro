package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzba {
    public final Object zza;
    public final int zzb;
    public final zzak zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i5, zzak zzakVar, Object obj2, int i6, long j2, long j5, int i7, int i8) {
        zzgrc.zza(i5 >= 0);
        zzgrc.zza(i6 >= 0);
        this.zza = obj;
        this.zzb = i5;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i6;
        this.zzf = j2;
        this.zzg = j5;
        this.zzh = i7;
        this.zzi = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i6 = this.zze;
        int length2 = String.valueOf(i6).length();
        long j2 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j2).length());
        u.s(sb, "mediaItem=", i5, ", period=", i6);
        sb.append(", pos=");
        sb.append(j2);
        String sb2 = sb.toString();
        int i7 = this.zzh;
        if (i7 == -1) {
            return sb2;
        }
        long j5 = this.zzg;
        int i8 = this.zzi;
        int length3 = sb2.length();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + length3 + 13 + String.valueOf(j5).length() + 10 + 5 + String.valueOf(i8).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j5);
        return s.c.c(sb3, ", adGroup=", i7, ", ad=", i8);
    }
}
