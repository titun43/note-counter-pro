package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgxx implements Serializable {
    private static final zzgxx zza = new zzgxx(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgxx(int[] iArr, int i5, int i6) {
        this.zzb = iArr;
        this.zzc = i6;
    }

    public static zzgxx zza() {
        return zza;
    }

    public static zzgxx zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgxx(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxx)) {
            return false;
        }
        zzgxx zzgxxVar = (zzgxx) obj;
        int i5 = this.zzc;
        if (i5 != zzgxxVar.zzc) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (zzd(i6) != zzgxxVar.zzd(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            i5 = (i5 * 31) + Integer.hashCode(this.zzb[i6]);
        }
        return i5;
    }

    public final String toString() {
        int i5 = this.zzc;
        if (i5 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i5 * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i6 = 1; i6 < i5; i6++) {
            sb.append(", ");
            sb.append(iArr[i6]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i5) {
        zzgrc.zzm(i5, this.zzc, "index");
        return this.zzb[i5];
    }
}
