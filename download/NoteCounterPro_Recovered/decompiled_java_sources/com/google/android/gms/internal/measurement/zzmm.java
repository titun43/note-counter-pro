package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm(int i5, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzmm zzc() {
        return zza;
    }

    public static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i5 = zzmmVar.zzb + zzmmVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmmVar.zzc, i5);
        System.arraycopy(zzmmVar2.zzc, 0, copyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmmVar.zzd, i5);
        System.arraycopy(zzmmVar2.zzd, 0, copyOf2, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i5, copyOf, copyOf2, true);
    }

    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmmVar = (zzmm) obj;
        int i5 = this.zzb;
        if (i5 == zzmmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmmVar.zzc;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmmVar.zzd;
                    int i7 = this.zzb;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (objArr[i8].equals(objArr2[i8])) {
                        }
                    }
                    return true;
                }
                if (iArr[i6] != iArr2[i6]) {
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        int i6 = (i5 + 527) * 31;
        int[] iArr = this.zzc;
        int i7 = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i5; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i6 + i8) * 31;
        Object[] objArr = this.zzd;
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            i7 = (i7 * 31) + objArr[i12].hashCode();
        }
        return i10 + i7;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.zzd[i7]).getClass();
                    i6 = u.x(i9 << 3, 8, i6);
                } else if (i10 == 2) {
                    zzjb zzjbVar = (zzjb) this.zzd[i7];
                    int zzA2 = zzjj.zzA(i9 << 3);
                    int zzd = zzjbVar.zzd();
                    i6 = u.y(zzd, zzd, zzA2, i6);
                } else if (i10 == 3) {
                    int zzz = zzjj.zzz(i9);
                    zzA = zzz + zzz;
                    zzB = ((zzmm) this.zzd[i7]).zza();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    ((Integer) this.zzd[i7]).getClass();
                    i6 = u.x(i9 << 3, 4, i6);
                }
            } else {
                long longValue = ((Long) this.zzd[i7]).longValue();
                zzA = zzjj.zzA(i9 << 3);
                zzB = zzjj.zzB(longValue);
            }
            i6 = zzB + zzA + i6;
        }
        this.zze = i6;
        return i6;
    }

    public final int zzb() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7];
            zzjb zzjbVar = (zzjb) this.zzd[i7];
            int zzA = zzjj.zzA(8);
            int zzd = zzjbVar.zzd();
            i6 += zzjj.zzA(zzd) + zzd + zzjj.zzA(24) + u.x(i8 >>> 3, zzjj.zzA(16), zzA + zzA);
        }
        this.zze = i6;
        return i6;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < this.zzb; i6++) {
            zzll.zzb(sb, i5, String.valueOf(this.zzc[i6] >>> 3), this.zzd[i6]);
        }
    }

    public final void zzh(int i5, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i6 = this.zzb;
        int[] iArr = this.zzc;
        if (i6 == iArr.length) {
            int i7 = i6 + (i6 < 4 ? 8 : i6 >> 1);
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
        int[] iArr2 = this.zzc;
        int i8 = this.zzb;
        iArr2[i8] = i5;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zzi(zznd zzndVar) {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i6 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    zzndVar.zzt(i7, ((Long) obj).longValue());
                } else if (i8 == 1) {
                    zzndVar.zzm(i7, ((Long) obj).longValue());
                } else if (i8 == 2) {
                    zzndVar.zzd(i7, (zzjb) obj);
                } else if (i8 == 3) {
                    zzndVar.zzE(i7);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i7);
                } else {
                    if (i8 != 5) {
                        throw new RuntimeException(zzkm.zza());
                    }
                    zzndVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }
}
