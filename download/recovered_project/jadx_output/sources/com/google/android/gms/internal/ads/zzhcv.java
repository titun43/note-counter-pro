package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhcv extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhcu zze;
    private final zzhct zzf;

    public /* synthetic */ zzhcv(int i5, int i6, int i7, int i8, zzhcu zzhcuVar, zzhct zzhctVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = zzhcuVar;
        this.zzf = zzhctVar;
    }

    public static zzhcs zzb() {
        return new zzhcs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhcv)) {
            return false;
        }
        zzhcv zzhcvVar = (zzhcv) obj;
        return zzhcvVar.zza == this.zza && zzhcvVar.zzb == this.zzb && zzhcvVar.zzc == this.zzc && zzhcvVar.zzd == this.zzd && zzhcvVar.zze == this.zze && zzhcvVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhcv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhct zzhctVar = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzhctVar);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i5 = this.zzc;
        int length3 = String.valueOf(i5).length();
        int i6 = this.zzd;
        int length4 = String.valueOf(i6).length();
        int i7 = this.zza;
        int length5 = String.valueOf(i7).length();
        int i8 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i8).length() + 15);
        s.c.e(sb, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        u.s(sb, ", ", i5, "-byte IV, and ", i6);
        u.s(sb, "-byte tags, and ", i7, "-byte AES key, and ", i8);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zze != zzhcu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhcu zzg() {
        return this.zze;
    }

    public final zzhct zzh() {
        return this.zzf;
    }
}
