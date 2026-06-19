package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhdv extends zzhch {
    private final int zza;
    private final zzhdu zzb;

    public /* synthetic */ zzhdv(int i5, zzhdu zzhduVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = zzhduVar;
    }

    public static zzhdt zzb() {
        return new zzhdt(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdv)) {
            return false;
        }
        zzhdv zzhdvVar = (zzhdv) obj;
        return zzhdvVar.zza == this.zza && zzhdvVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhdv.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int length = valueOf.length();
        int i5 = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i5).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i5);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzb != zzhdu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhdu zzd() {
        return this.zzb;
    }
}
