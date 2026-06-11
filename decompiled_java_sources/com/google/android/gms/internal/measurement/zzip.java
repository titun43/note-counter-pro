package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
final class zzip {
    public static int zza(byte[] bArr, int i5, zzio zzioVar) {
        int zzj = zzj(bArr, i5, zzioVar);
        int i6 = zzioVar.zza;
        if (i6 < 0) {
            throw zzkm.zzd();
        }
        if (i6 > bArr.length - zzj) {
            throw zzkm.zzf();
        }
        if (i6 == 0) {
            zzioVar.zzc = zzjb.zzb;
            return zzj;
        }
        zzioVar.zzc = zzjb.zzl(bArr, zzj, i6);
        return zzj + i6;
    }

    public static int zzb(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public static int zzc(zzlu zzluVar, byte[] bArr, int i5, int i6, int i7, zzio zzioVar) {
        zzlm zzlmVar = (zzlm) zzluVar;
        Object zze = zzlmVar.zze();
        int zzc = zzlmVar.zzc(zze, bArr, i5, i6, i7, zzioVar);
        zzlmVar.zzf(zze);
        zzioVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzlu zzluVar, byte[] bArr, int i5, int i6, zzio zzioVar) {
        int i7 = i5 + 1;
        int i8 = bArr[i5];
        if (i8 < 0) {
            i7 = zzk(i8, bArr, i7, zzioVar);
            i8 = zzioVar.zza;
        }
        int i9 = i7;
        if (i8 < 0 || i8 > i6 - i9) {
            throw zzkm.zzf();
        }
        Object zze = zzluVar.zze();
        int i10 = i9 + i8;
        zzluVar.zzh(zze, bArr, i9, i10, zzioVar);
        zzluVar.zzf(zze);
        zzioVar.zzc = zze;
        return i10;
    }

    public static int zze(zzlu zzluVar, int i5, byte[] bArr, int i6, int i7, zzkj zzkjVar, zzio zzioVar) {
        int zzd = zzd(zzluVar, bArr, i6, i7, zzioVar);
        zzkjVar.add(zzioVar.zzc);
        while (zzd < i7) {
            int zzj = zzj(bArr, zzd, zzioVar);
            if (i5 != zzioVar.zza) {
                break;
            }
            zzd = zzd(zzluVar, bArr, zzj, i7, zzioVar);
            zzkjVar.add(zzioVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i5, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i5, zzioVar);
        int i6 = zzioVar.zza + zzj;
        while (zzj < i6) {
            zzj = zzj(bArr, zzj, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        if (zzj == i6) {
            return zzj;
        }
        throw zzkm.zzf();
    }

    public static int zzg(byte[] bArr, int i5, zzio zzioVar) {
        int zzj = zzj(bArr, i5, zzioVar);
        int i6 = zzioVar.zza;
        if (i6 < 0) {
            throw zzkm.zzd();
        }
        if (i6 == 0) {
            zzioVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            return zzj;
        }
        zzioVar.zzc = new String(bArr, zzj, i6, zzkk.zzb);
        return zzj + i6;
    }

    public static int zzh(byte[] bArr, int i5, zzio zzioVar) {
        int zzj = zzj(bArr, i5, zzioVar);
        int i6 = zzioVar.zza;
        if (i6 < 0) {
            throw zzkm.zzd();
        }
        if (i6 == 0) {
            zzioVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            return zzj;
        }
        zzioVar.zzc = zzna.zzd(bArr, zzj, i6);
        return zzj + i6;
    }

    public static int zzi(int i5, byte[] bArr, int i6, int i7, zzmm zzmmVar, zzio zzioVar) {
        if ((i5 >>> 3) == 0) {
            throw zzkm.zzb();
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int zzm = zzm(bArr, i6, zzioVar);
            zzmmVar.zzh(i5, Long.valueOf(zzioVar.zzb));
            return zzm;
        }
        if (i8 == 1) {
            zzmmVar.zzh(i5, Long.valueOf(zzn(bArr, i6)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int zzj = zzj(bArr, i6, zzioVar);
            int i9 = zzioVar.zza;
            if (i9 < 0) {
                throw zzkm.zzd();
            }
            if (i9 > bArr.length - zzj) {
                throw zzkm.zzf();
            }
            if (i9 == 0) {
                zzmmVar.zzh(i5, zzjb.zzb);
            } else {
                zzmmVar.zzh(i5, zzjb.zzl(bArr, zzj, i9));
            }
            return zzj + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw zzkm.zzb();
            }
            zzmmVar.zzh(i5, Integer.valueOf(zzb(bArr, i6)));
            return i6 + 4;
        }
        int i10 = (i5 & (-8)) | 4;
        zzmm zze = zzmm.zze();
        int i11 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int zzj2 = zzj(bArr, i6, zzioVar);
            i11 = zzioVar.zza;
            if (i11 == i10) {
                i6 = zzj2;
                break;
            }
            i6 = zzi(i11, bArr, zzj2, i7, zze, zzioVar);
        }
        if (i6 > i7 || i11 != i10) {
            throw zzkm.zze();
        }
        zzmmVar.zzh(i5, zze);
        return i6;
    }

    public static int zzj(byte[] bArr, int i5, zzio zzioVar) {
        int i6 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 < 0) {
            return zzk(b2, bArr, i6, zzioVar);
        }
        zzioVar.zza = b2;
        return i6;
    }

    public static int zzk(int i5, byte[] bArr, int i6, zzio zzioVar) {
        int i7 = i5 & 127;
        int i8 = i6 + 1;
        byte b2 = bArr[i6];
        if (b2 >= 0) {
            zzioVar.zza = i7 | (b2 << 7);
            return i8;
        }
        int i9 = i7 | ((b2 & Byte.MAX_VALUE) << 7);
        int i10 = i6 + 2;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzioVar.zza = i9 | (b5 << 14);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 14);
        int i12 = i6 + 3;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            zzioVar.zza = i11 | (b6 << 21);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 21);
        int i14 = i6 + 4;
        byte b7 = bArr[i12];
        if (b7 >= 0) {
            zzioVar.zza = i13 | (b7 << 28);
            return i14;
        }
        int i15 = i13 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                zzioVar.zza = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    public static int zzl(int i5, byte[] bArr, int i6, int i7, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i6, zzioVar);
        zzkdVar.zzh(zzioVar.zza);
        while (zzj < i7) {
            int zzj2 = zzj(bArr, zzj, zzioVar);
            if (i5 != zzioVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i5, zzio zzioVar) {
        int i6 = i5 + 1;
        long j2 = bArr[i5];
        if (j2 >= 0) {
            zzioVar.zzb = j2;
            return i6;
        }
        int i7 = i5 + 2;
        byte b2 = bArr[i6];
        long j5 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i8 = 7;
        while (b2 < 0) {
            int i9 = i7 + 1;
            i8 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i8;
            b2 = bArr[i7];
            i7 = i9;
        }
        zzioVar.zzb = j5;
        return i7;
    }

    public static long zzn(byte[] bArr, int i5) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }
}
