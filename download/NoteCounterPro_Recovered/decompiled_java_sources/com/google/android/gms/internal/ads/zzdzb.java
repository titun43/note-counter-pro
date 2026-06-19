package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzdzb extends zzdzf {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdzb(long j2, int i5, byte[] bArr) {
        this.zza = j2;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdzf) {
            zzdzf zzdzfVar = (zzdzf) obj;
            if (this.zza == zzdzfVar.zza() && this.zzb == zzdzfVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.zza;
        return ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i5).length() + 1);
        u.t(sb, "OnDeviceStorageKey{id=", j2, ", eventType=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final int zzb() {
        return this.zzb;
    }
}
