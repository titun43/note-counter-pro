package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzbg {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzv[] zzd;
    private int zze;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i5 = 1;
        zzgrc.zza(length > 0);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        int zzf = zzas.zzf(zzvVarArr[0].zzo);
        this.zzc = zzf == -1 ? zzas.zzf(zzvVarArr[0].zzn) : zzf;
        zzv zzvVar = zzvVarArr[0];
        String zzc = zzc(zzvVar.zzd);
        int i6 = zzvVar.zzf | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.zzd;
            if (i5 >= zzvVarArr2.length) {
                return;
            }
            zzv zzvVar2 = zzvVarArr2[i5];
            String str2 = zzvVar2.zzd;
            if (!zzc.equals(zzc(str2))) {
                zzd("languages", zzvVarArr2[0].zzd, str2, i5);
                return;
            } else {
                if (i6 != (zzvVar2.zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzvVarArr2[0].zzf), Integer.toBinaryString(this.zzd[i5].zzf), i5);
                    return;
                }
                i5++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }

    private static void zzd(String str, String str2, String str3, int i5) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i5).length() + 1);
        s.c.e(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i5);
        sb.append(")");
        zzee.zzf("TrackGroup", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zze;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = this.zzb.hashCode() + 527;
        int hashCode2 = Arrays.hashCode(this.zzd) + (hashCode * 31);
        this.zze = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        String str = this.zzb;
        return h1.b(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), str, ": ", arrays);
    }

    public final zzv zza(int i5) {
        return this.zzd[i5];
    }

    public final int zzb(zzv zzvVar) {
        int i5 = 0;
        while (true) {
            zzv[] zzvVarArr = this.zzd;
            if (i5 >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i5]) {
                return i5;
            }
            i5++;
        }
    }
}
