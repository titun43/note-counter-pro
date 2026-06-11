package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzieg {
    private static final zzieg zza = new zzieg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzieg(int i5, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzieg zza() {
        return zza;
    }

    public static zzieg zzb() {
        return new zzieg();
    }

    public static zzieg zzc(zzieg zziegVar, zzieg zziegVar2) {
        int i5 = zziegVar.zzb + zziegVar2.zzb;
        int[] copyOf = Arrays.copyOf(zziegVar.zzc, i5);
        System.arraycopy(zziegVar2.zzc, 0, copyOf, zziegVar.zzb, zziegVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zziegVar.zzd, i5);
        System.arraycopy(zziegVar2.zzd, 0, copyOf2, zziegVar.zzb, zziegVar2.zzb);
        return new zzieg(i5, copyOf, copyOf2, true);
    }

    private final void zzn(int i5) {
        int[] iArr = this.zzc;
        if (i5 > iArr.length) {
            int i6 = this.zzb;
            int i7 = (i6 / 2) + i6;
            if (i7 >= i5) {
                i5 = i7;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i5);
            this.zzd = Arrays.copyOf(this.zzd, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzieg)) {
            return false;
        }
        zzieg zziegVar = (zzieg) obj;
        int i5 = this.zzb;
        if (i5 == zziegVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziegVar.zzc;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziegVar.zzd;
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
        int i6 = i5 + 527;
        int[] iArr = this.zzc;
        int i7 = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i5; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = ((i6 * 31) + i8) * 31;
        Object[] objArr = this.zzd;
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            i7 = (i7 * 31) + objArr[i12].hashCode();
        }
        return i10 + i7;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzieu zzieuVar) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzieuVar.zzv(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    public final void zzg(zzieu zzieuVar) {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i6 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i7 = i6 & 7;
                int i8 = i6 >>> 3;
                if (i7 == 0) {
                    zzieuVar.zzc(i8, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    zzieuVar.zzj(i8, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    zzieuVar.zzn(i8, (zzian) obj);
                } else if (i7 == 3) {
                    zzieuVar.zzt(i8);
                    ((zzieg) obj).zzg(zzieuVar);
                    zzieuVar.zzu(i8);
                } else {
                    if (i7 != 5) {
                        throw new RuntimeException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    zzieuVar.zzk(i8, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7] >>> 3;
            zzian zzianVar = (zzian) this.zzd[i7];
            int zzA = zziaw.zzA(8);
            int zzA2 = zziaw.zzA(i8) + zziaw.zzA(16);
            int zzA3 = zziaw.zzA(24);
            int zzc = zzianVar.zzc();
            i6 += zzA + zzA + zzA2 + u.c(zzc, zzc, zzA3);
        }
        this.zze = i6;
        return i6;
    }

    public final int zzi() {
        int zzA;
        int zzB;
        int zzA2;
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
                    zzA2 = zziaw.zzA(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int i11 = i9 << 3;
                    zzian zzianVar = (zzian) this.zzd[i7];
                    int zzA3 = zziaw.zzA(i11);
                    int zzc = zzianVar.zzc();
                    i6 = u.w(zzc, zzc, zzA3, i6);
                } else if (i10 == 3) {
                    int zzA4 = zziaw.zzA(i9 << 3);
                    zzA = zzA4 + zzA4;
                    zzB = ((zzieg) this.zzd[i7]).zzi();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i7]).getClass();
                    zzA2 = zziaw.zzA(i9 << 3) + 4;
                }
                i6 = zzA2 + i6;
            } else {
                int i12 = i9 << 3;
                long longValue = ((Long) this.zzd[i7]).longValue();
                zzA = zziaw.zzA(i12);
                zzB = zziaw.zzB(longValue);
            }
            i6 = zzB + zzA + i6;
        }
        this.zze = i6;
        return i6;
    }

    public final void zzj(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < this.zzb; i6++) {
            zzide.zzb(sb, i5, String.valueOf(this.zzc[i6] >>> 3), this.zzd[i6]);
        }
    }

    public final void zzk(int i5, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i6 = this.zzb;
        iArr[i6] = i5;
        this.zzd[i6] = obj;
        this.zzb = i6 + 1;
    }

    public final boolean zzl(int i5, zziaq zziaqVar) {
        int zza2;
        zze();
        int i6 = i5 & 7;
        if (i6 == 0) {
            zzk(i5, Long.valueOf(zziaqVar.zzg()));
            return true;
        }
        if (i6 == 1) {
            zzk(i5, Long.valueOf(zziaqVar.zzi()));
            return true;
        }
        if (i6 == 2) {
            zzk(i5, zziaqVar.zzn());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                zziaqVar.zzI();
                return false;
            }
            if (i6 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzk(i5, Integer.valueOf(zziaqVar.zzj()));
            return true;
        }
        zzieg zziegVar = new zzieg();
        do {
            zza2 = zziaqVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zziegVar.zzl(zza2, zziaqVar));
        zziaqVar.zzb(4 | ((i5 >>> 3) << 3));
        zzk(i5, zziegVar);
        return true;
    }

    public final zzieg zzm(zzieg zziegVar) {
        if (zziegVar.equals(zza)) {
            return this;
        }
        zze();
        int i5 = this.zzb + zziegVar.zzb;
        zzn(i5);
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzb, zziegVar.zzb);
        System.arraycopy(zziegVar.zzd, 0, this.zzd, this.zzb, zziegVar.zzb);
        this.zzb = i5;
        return this;
    }

    private zzieg() {
        this(0, new int[8], new Object[8], true);
    }
}
