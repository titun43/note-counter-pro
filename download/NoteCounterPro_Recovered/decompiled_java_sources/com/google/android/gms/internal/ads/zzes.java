package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzes {
    public static final zzes zza = new zzes(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzes(0, 0);
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzes(int i5, int i6) {
        boolean z4 = false;
        if ((i5 == -1 || i5 >= 0) && (i6 == -1 || i6 >= 0)) {
            z4 = true;
        }
        zzgrc.zza(z4);
        this.zzb = i5;
        this.zzc = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzes) {
            zzes zzesVar = (zzes) obj;
            if (this.zzb == zzesVar.zzb && this.zzc == zzesVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        return ((i5 >>> 16) | (i5 << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i6 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i6).length());
        sb.append(i5);
        sb.append("x");
        sb.append(i6);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
