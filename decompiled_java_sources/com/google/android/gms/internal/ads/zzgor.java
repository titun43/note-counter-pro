package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzgor extends zzgps {
    private final int zza;
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzgor(int i5, String str, int i6, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = i6;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgps) {
            zzgps zzgpsVar = (zzgps) obj;
            if (this.zza == zzgpsVar.zza() && ((str = this.zzb) != null ? str.equals(zzgpsVar.zzb()) : zzgpsVar.zzb() == null) && this.zzc == zzgpsVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i6 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i6).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i5);
        sb.append(", sessionToken=");
        sb.append(str);
        return u.m(sb, ", uiMode=", i6, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zzc() {
        return this.zzc;
    }
}
