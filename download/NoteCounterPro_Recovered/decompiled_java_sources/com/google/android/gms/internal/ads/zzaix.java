package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaix implements zzao {
    public final float zza;
    public final int zzb;

    public zzaix(float f5, int i5) {
        this.zza = f5;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaix.class == obj.getClass()) {
            zzaix zzaixVar = (zzaix) obj;
            if (this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f5 = this.zza;
        int length = String.valueOf(f5).length();
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i5).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f5);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i5);
        return sb.toString();
    }
}
