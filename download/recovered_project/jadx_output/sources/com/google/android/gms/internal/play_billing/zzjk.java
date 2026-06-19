package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjk(int i5, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzjk zzc() {
        return zza;
    }

    public static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
        int i5 = zzjkVar.zzb + zzjkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzjkVar.zzc, i5);
        System.arraycopy(zzjkVar2.zzc, 0, copyOf, zzjkVar.zzb, zzjkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjkVar.zzd, i5);
        System.arraycopy(zzjkVar2.zzd, 0, copyOf2, zzjkVar.zzb, zzjkVar2.zzb);
        return new zzjk(i5, copyOf, copyOf2, true);
    }

    public static zzjk zzf() {
        return new zzjk(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i5) {
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
        if (obj == null || !(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        int i5 = this.zzb;
        if (i5 == zzjkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjkVar.zzc;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjkVar.zzd;
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

    public final int zza() {
        int zzz;
        int zzA;
        int zzz2;
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
                    zzz2 = zzgr.zzz(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int i11 = i9 << 3;
                    zzgk zzgkVar = (zzgk) this.zzd[i7];
                    int zzz3 = zzgr.zzz(i11);
                    int zzd = zzgkVar.zzd();
                    i6 = zzgr.zzz(zzd) + zzd + zzz3 + i6;
                } else if (i10 == 3) {
                    int zzz4 = zzgr.zzz(i9 << 3);
                    zzz = zzz4 + zzz4;
                    zzA = ((zzjk) this.zzd[i7]).zza();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i7]).getClass();
                    zzz2 = zzgr.zzz(i9 << 3) + 4;
                }
                i6 = zzz2 + i6;
            } else {
                int i12 = i9 << 3;
                long longValue = ((Long) this.zzd[i7]).longValue();
                zzz = zzgr.zzz(i12);
                zzA = zzgr.zzA(longValue);
            }
            i6 = zzA + zzz + i6;
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
            int i8 = this.zzc[i7] >>> 3;
            zzgk zzgkVar = (zzgk) this.zzd[i7];
            int zzz = zzgr.zzz(8);
            int zzz2 = zzgr.zzz(i8) + zzgr.zzz(16);
            int zzz3 = zzgr.zzz(24);
            int zzd = zzgkVar.zzd();
            i6 += zzz + zzz + zzz2 + u.z(zzd, zzd, zzz3);
        }
        this.zze = i6;
        return i6;
    }

    public final zzjk zzd(zzjk zzjkVar) {
        if (zzjkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i5 = this.zzb + zzjkVar.zzb;
        zzm(i5);
        System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
        System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
        this.zzb = i5;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < this.zzb; i6++) {
            zzio.zzb(sb, i5, String.valueOf(this.zzc[i6] >>> 3), this.zzd[i6]);
        }
    }

    public final void zzj(int i5, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i6 = this.zzb;
        iArr[i6] = i5;
        this.zzd[i6] = obj;
        this.zzb = i6 + 1;
    }

    public final void zzk(zzjw zzjwVar) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzjwVar.zzw(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    public final void zzl(zzjw zzjwVar) {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i6 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i7 = i6 & 7;
                int i8 = i6 >>> 3;
                if (i7 == 0) {
                    zzjwVar.zzt(i8, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    zzjwVar.zzm(i8, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    zzjwVar.zzd(i8, (zzgk) obj);
                } else if (i7 == 3) {
                    zzjwVar.zzF(i8);
                    ((zzjk) obj).zzl(zzjwVar);
                    zzjwVar.zzh(i8);
                } else {
                    if (i7 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    zzjwVar.zzk(i8, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzjk() {
        this(0, new int[8], new Object[8], true);
    }
}
