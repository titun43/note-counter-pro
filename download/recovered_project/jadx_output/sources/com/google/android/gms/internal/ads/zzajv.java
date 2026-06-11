package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzajv implements zzagc {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzajv(int i5, long j2, int i6) {
        this.zza = i5;
        this.zzb = j2;
        this.zzc = i6;
    }

    public final String toString() {
        String zzx = zzfj.zzx(this.zza);
        int length = zzx.length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        int i5 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i5).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(zzx);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", minHeaderSize=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
