package com.google.android.gms.ads.internal.util.client;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    public zzm(int i5, int i6, boolean z4) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zza() && this.zzb == zzwVar.zzb() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int i6 = this.zzb;
        int length2 = String.valueOf(i6).length();
        boolean z4 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z4).length() + 1);
        u.s(sb, "OfflineAdConfig{impressionPrerequisite=", i5, ", clickPrerequisite=", i6);
        sb.append(", notificationFlowEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}
