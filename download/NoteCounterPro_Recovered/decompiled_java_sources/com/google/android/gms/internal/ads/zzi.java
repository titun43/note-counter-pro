package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i5, int i6, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
        this.zze = bArr;
        this.zzf = i8;
        this.zzg = i9;
    }

    public static boolean zza(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i5 = zziVar.zzb;
        if (i5 != -1 && i5 != 1 && i5 != 2) {
            return false;
        }
        int i6 = zziVar.zzc;
        if (i6 != -1 && i6 != 2) {
            return false;
        }
        int i7 = zziVar.zzd;
        if ((i7 != -1 && i7 != 3) || zziVar.zze != null) {
            return false;
        }
        int i8 = zziVar.zzg;
        if (i8 != -1 && i8 != 8) {
            return false;
        }
        int i9 = zziVar.zzf;
        return i9 == -1 || i9 == 8;
    }

    public static int zzb(int i5) {
        if (i5 == 1) {
            return 1;
        }
        if (i5 != 9) {
            return (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i5) {
        if (i5 == 1) {
            return 3;
        }
        if (i5 == 4) {
            return 10;
        }
        if (i5 == 13) {
            return 2;
        }
        if (i5 == 16) {
            return 6;
        }
        if (i5 != 18) {
            return (i5 == 6 || i5 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i5) {
        return i5 != -1 ? i5 != 6 ? i5 != 1 ? i5 != 2 ? u.l(new StringBuilder(String.valueOf(i5).length() + 22), "Undefined color space ", i5) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i5) {
        return i5 != -1 ? i5 != 10 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 6 ? i5 != 7 ? u.l(new StringBuilder(String.valueOf(i5).length() + 25), "Undefined color transfer ", i5) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i5) {
        return i5 != -1 ? i5 != 1 ? i5 != 2 ? u.l(new StringBuilder(String.valueOf(i5).length() + 22), "Undefined color range ", i5) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzh;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i5 = this.zzf;
        int i6 = this.zzd;
        int i7 = this.zzc;
        String zzh = zzh(this.zzb);
        String zzj = zzj(i7);
        String zzi = zzi(i6);
        String str2 = "NA";
        if (i5 != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 8);
            sb.append(i5);
            sb.append("bit Luma");
            str = sb.toString();
        } else {
            str = "NA";
        }
        int i8 = this.zzg;
        if (i8 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 10);
            sb2.append(i8);
            sb2.append("bit Chroma");
            str2 = sb2.toString();
        }
        boolean z4 = this.zze != null;
        StringBuilder sb3 = new StringBuilder(u.e(str2, u.e(str, u.e(String.valueOf(z4), u.e(zzj, zzh.length() + 12, 2) + zzi.length() + 2, 2), 2), 1));
        sb3.append("ColorInfo(");
        sb3.append(zzh);
        sb3.append(", ");
        sb3.append(zzj);
        sb3.append(", ");
        sb3.append(zzi);
        sb3.append(", ");
        sb3.append(z4);
        s.c.e(sb3, ", ", str, ", ", str2);
        sb3.append(")");
        return sb3.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String str2;
        if (zzf()) {
            String zzh = zzh(this.zzb);
            String zzj = zzj(this.zzc);
            String zzi = zzi(this.zzd);
            String str3 = zzfj.zza;
            Locale locale = Locale.US;
            str = zzh + "/" + zzj + "/" + zzi;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i5 = this.zzf;
            int i6 = this.zzg;
            StringBuilder sb = new StringBuilder(u.b(i5, 1) + String.valueOf(i6).length());
            sb.append(i5);
            sb.append("/");
            sb.append(i6);
            str2 = sb.toString();
        } else {
            str2 = "NA/NA";
        }
        return h1.b(new StringBuilder(str2.length() + str.length() + 1), str, "/", str2);
    }
}
