package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhdd extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhdc zzd;

    public /* synthetic */ zzhdd(int i5, int i6, int i7, zzhdc zzhdcVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i6;
        this.zzd = zzhdcVar;
    }

    public static zzhdb zzb() {
        return new zzhdb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdd)) {
            return false;
        }
        zzhdd zzhddVar = (zzhdd) obj;
        return zzhddVar.zza == this.zza && zzhddVar.zzb == this.zzb && zzhddVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhdd.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = valueOf.length();
        int i5 = this.zzb;
        int length2 = String.valueOf(i5).length();
        int length3 = String.valueOf(16).length();
        int i6 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i6).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i5);
        return u.m(sb, "-byte IV, 16-byte tag, and ", i6, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhdc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhdc zze() {
        return this.zzd;
    }
}
