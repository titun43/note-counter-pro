package com.google.android.gms.ads.internal.util.client;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzn extends zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    public zzn(int i5, int i6, double d5, boolean z4) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = d5;
        this.zzd = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza == zzxVar.zza() && this.zzb == zzxVar.zzb() && Double.doubleToLongBits(this.zzc) == Double.doubleToLongBits(zzxVar.zzc()) && this.zzd == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d5 = this.zzc;
        return ((((int) (Double.doubleToLongBits(d5) ^ (Double.doubleToLongBits(d5) >>> 32))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int i6 = this.zzb;
        int length2 = String.valueOf(i6).length();
        double d5 = this.zzc;
        int length3 = String.valueOf(d5).length();
        boolean z4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z4).length() + 1);
        u.s(sb, "PingStrategy{maxAttempts=", i5, ", initialBackoffMs=", i6);
        sb.append(", backoffMultiplier=");
        sb.append(d5);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}
