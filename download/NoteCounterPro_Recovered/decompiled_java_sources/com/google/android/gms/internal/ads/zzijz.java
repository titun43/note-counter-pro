package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzijz {
    public static final zzijz zzj = new zzijz(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzk = new zzijz(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzl = new zzijz(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzm = new zzijz(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzijz(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.zza = d9;
        this.zzb = d10;
        this.zzc = d11;
        this.zzd = d5;
        this.zze = d6;
        this.zzf = d7;
        this.zzg = d8;
        this.zzh = d12;
        this.zzi = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzijz.class != obj.getClass()) {
            return false;
        }
        zzijz zzijzVar = (zzijz) obj;
        return Double.compare(zzijzVar.zzd, this.zzd) == 0 && Double.compare(zzijzVar.zze, this.zze) == 0 && Double.compare(zzijzVar.zzf, this.zzf) == 0 && Double.compare(zzijzVar.zzg, this.zzg) == 0 && Double.compare(zzijzVar.zzh, this.zzh) == 0 && Double.compare(zzijzVar.zzi, this.zzi) == 0 && Double.compare(zzijzVar.zza, this.zza) == 0 && Double.compare(zzijzVar.zzb, this.zzb) == 0 && Double.compare(zzijzVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zza);
        long j2 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long j5 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long j6 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long j7 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long j8 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long j9 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long j10 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j2) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j10)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d5 = this.zza;
        double d6 = this.zzb;
        double d7 = this.zzc;
        double d8 = this.zzd;
        double d9 = this.zze;
        double d10 = this.zzf;
        double d11 = this.zzg;
        double d12 = this.zzh;
        double d13 = this.zzi;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d5);
        sb.append(", v=");
        sb.append(d6);
        sb.append(", w=");
        sb.append(d7);
        sb.append(", a=");
        sb.append(d8);
        sb.append(", b=");
        sb.append(d9);
        sb.append(", c=");
        sb.append(d10);
        sb.append(", d=");
        sb.append(d11);
        sb.append(", tx=");
        sb.append(d12);
        sb.append(", ty=");
        sb.append(d13);
        sb.append("}");
        return sb.toString();
    }
}
