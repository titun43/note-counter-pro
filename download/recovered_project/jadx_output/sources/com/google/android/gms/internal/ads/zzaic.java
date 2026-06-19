package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaic implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaic(int i5, String str, String str2, String str3, boolean z4, int i6) {
        boolean z5 = true;
        if (i6 != -1 && i6 <= 0) {
            z5 = false;
        }
        zzgrc.zza(z5);
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z4;
        this.zzf = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaic.class == obj.getClass()) {
            zzaic zzaicVar = (zzaic) obj;
            if (this.zza == zzaicVar.zza && Objects.equals(this.zzb, zzaicVar.zzb) && Objects.equals(this.zzc, zzaicVar.zzc) && Objects.equals(this.zzd, zzaicVar.zzd) && this.zze == zzaicVar.zze && this.zzf == zzaicVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        int i5 = this.zza;
        String str2 = this.zzc;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = ((i5 + 527) * 31) + hashCode;
        String str3 = this.zzd;
        return (((((((i6 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i5 = this.zza;
        int length3 = String.valueOf(i5).length();
        int i6 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i6).length());
        s.c.e(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return s.c.c(sb, "\", bitrate=", i5, ", metadataInterval=", i6);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        String str = this.zzc;
        if (str != null) {
            zzamVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzamVar.zzt(str2);
        }
    }
}
