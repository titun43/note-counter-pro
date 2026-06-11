package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzafr {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzafr() {
    }

    public final boolean zza(int i5) {
        boolean zzl;
        int i6;
        int i7;
        int i8;
        int i9;
        String[] strArr;
        int[] iArr;
        int zzm;
        int[] iArr2;
        int[] iArr3;
        int i10;
        int[] iArr4;
        int[] iArr5;
        int i11;
        int[] iArr6;
        zzl = zzafs.zzl(i5);
        if (!zzl || (i6 = (i5 >>> 19) & 3) == 1 || (i7 = (i5 >>> 17) & 3) == 0 || (i8 = (i5 >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i5 >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i8 - 1;
        this.zza = i6;
        strArr = zzafs.zza;
        this.zzb = strArr[3 - i7];
        iArr = zzafs.zzb;
        int i13 = iArr[i9];
        this.zzd = i13;
        if (i6 == 2) {
            i13 /= 2;
            this.zzd = i13;
        } else if (i6 == 0) {
            i13 /= 4;
            this.zzd = i13;
        }
        int i14 = (i5 >>> 9) & 1;
        zzm = zzafs.zzm(i6, i7);
        this.zzg = zzm;
        if (i7 == 3) {
            if (i6 == 3) {
                iArr6 = zzafs.zzc;
                i11 = iArr6[i12];
            } else {
                iArr5 = zzafs.zzd;
                i11 = iArr5[i12];
            }
            this.zzf = i11;
            this.zzc = (((i11 * 12) / i13) + i14) * 4;
        } else {
            if (i6 == 3) {
                if (i7 == 2) {
                    iArr4 = zzafs.zze;
                    i10 = iArr4[i12];
                } else {
                    iArr3 = zzafs.zzf;
                    i10 = iArr3[i12];
                }
                this.zzf = i10;
                this.zzc = ((i10 * 144) / i13) + i14;
            } else {
                iArr2 = zzafs.zzg;
                int i15 = iArr2[i12];
                this.zzf = i15;
                this.zzc = (((i7 == 1 ? 72 : 144) * i15) / i13) + i14;
            }
        }
        this.zze = ((i5 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzafr(zzafr zzafrVar) {
        this.zza = zzafrVar.zza;
        this.zzb = zzafrVar.zzb;
        this.zzc = zzafrVar.zzc;
        this.zzd = zzafrVar.zzd;
        this.zze = zzafrVar.zze;
        this.zzf = zzafrVar.zzf;
        this.zzg = zzafrVar.zzg;
    }
}
