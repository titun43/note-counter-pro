package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfx implements zzao {
    public final float zza;
    public final float zzb;

    public zzfx(float f5, float f6) {
        boolean z4 = false;
        if (f5 >= -90.0f && f5 <= 90.0f && f6 >= -180.0f && f6 <= 180.0f) {
            z4 = true;
        }
        zzgrc.zzb(z4, "Invalid latitude or longitude");
        this.zza = f5;
        this.zzb = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfx.class == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zza == zzfxVar.zza && this.zzb == zzfxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.zza) + 527;
        return Float.hashCode(this.zzb) + (hashCode * 31);
    }

    public final String toString() {
        float f5 = this.zza;
        int length = String.valueOf(f5).length();
        float f6 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f6).length());
        sb.append("xyz: latitude=");
        sb.append(f5);
        sb.append(", longitude=");
        sb.append(f6);
        return sb.toString();
    }
}
