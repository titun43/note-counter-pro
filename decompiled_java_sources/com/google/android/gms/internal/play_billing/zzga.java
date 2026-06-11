package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i5, zzfz zzfzVar) {
        int zzh = zzh(bArr, i5, zzfzVar);
        int i6 = zzfzVar.zza;
        if (i6 < 0) {
            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 > bArr.length - zzh) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i6 == 0) {
            zzfzVar.zzc = zzgk.zzb;
            return zzh;
        }
        zzfzVar.zzc = zzgk.zzj(bArr, zzh, i6);
        return zzh + i6;
    }

    public static int zzb(byte[] bArr, int i5) {
        int i6 = bArr[i5] & 255;
        int i7 = bArr[i5 + 1] & 255;
        int i8 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i7 << 8) | i6 | (i8 << 16);
    }

    public static int zzc(zzix zzixVar, byte[] bArr, int i5, int i6, int i7, zzfz zzfzVar) {
        Object zze = zzixVar.zze();
        int zzl = zzl(zze, zzixVar, bArr, i5, i6, i7, zzfzVar);
        zzixVar.zzf(zze);
        zzfzVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzix zzixVar, byte[] bArr, int i5, int i6, zzfz zzfzVar) {
        Object zze = zzixVar.zze();
        int zzm = zzm(zze, zzixVar, bArr, i5, i6, zzfzVar);
        zzixVar.zzf(zze);
        zzfzVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzix zzixVar, int i5, byte[] bArr, int i6, int i7, zzho zzhoVar, zzfz zzfzVar) {
        int zzd = zzd(zzixVar, bArr, i6, i7, zzfzVar);
        zzhoVar.add(zzfzVar.zzc);
        while (zzd < i7) {
            int zzh = zzh(bArr, zzd, zzfzVar);
            if (i5 != zzfzVar.zza) {
                break;
            }
            zzd = zzd(zzixVar, bArr, zzh, i7, zzfzVar);
            zzhoVar.add(zzfzVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i5, zzho zzhoVar, zzfz zzfzVar) {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int zzh = zzh(bArr, i5, zzfzVar);
        int i6 = zzfzVar.zza + zzh;
        while (zzh < i6) {
            zzh = zzh(bArr, zzh, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        if (zzh == i6) {
            return zzh;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i5, byte[] bArr, int i6, int i7, zzjk zzjkVar, zzfz zzfzVar) {
        if ((i5 >>> 3) == 0) {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int zzk = zzk(bArr, i6, zzfzVar);
            zzjkVar.zzj(i5, Long.valueOf(zzfzVar.zzb));
            return zzk;
        }
        if (i8 == 1) {
            zzjkVar.zzj(i5, Long.valueOf(zzn(bArr, i6)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int zzh = zzh(bArr, i6, zzfzVar);
            int i9 = zzfzVar.zza;
            if (i9 < 0) {
                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i9 > bArr.length - zzh) {
                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i9 == 0) {
                zzjkVar.zzj(i5, zzgk.zzb);
            } else {
                zzjkVar.zzj(i5, zzgk.zzj(bArr, zzh, i9));
            }
            return zzh + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
            zzjkVar.zzj(i5, Integer.valueOf(zzb(bArr, i6)));
            return i6 + 4;
        }
        int i10 = (i5 & (-8)) | 4;
        zzjk zzf = zzjk.zzf();
        int i11 = zzfzVar.zze + 1;
        zzfzVar.zze = i11;
        zzo(i11);
        int i12 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int zzh2 = zzh(bArr, i6, zzfzVar);
            int i13 = zzfzVar.zza;
            if (i13 == i10) {
                i12 = i13;
                i6 = zzh2;
                break;
            }
            i6 = zzg(i13, bArr, zzh2, i7, zzf, zzfzVar);
            i12 = i13;
        }
        zzfzVar.zze--;
        if (i6 > i7 || i12 != i10) {
            throw new zzhr("Failed to parse the message.");
        }
        zzjkVar.zzj(i5, zzf);
        return i6;
    }

    public static int zzh(byte[] bArr, int i5, zzfz zzfzVar) {
        int i6 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 < 0) {
            return zzi(b2, bArr, i6, zzfzVar);
        }
        zzfzVar.zza = b2;
        return i6;
    }

    public static int zzi(int i5, byte[] bArr, int i6, zzfz zzfzVar) {
        byte b2 = bArr[i6];
        int i7 = i6 + 1;
        int i8 = i5 & 127;
        if (b2 >= 0) {
            zzfzVar.zza = i8 | (b2 << 7);
            return i7;
        }
        int i9 = i8 | ((b2 & Byte.MAX_VALUE) << 7);
        int i10 = i6 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzfzVar.zza = i9 | (b5 << 14);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 14);
        int i12 = i6 + 3;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            zzfzVar.zza = i11 | (b6 << 21);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 21);
        int i14 = i6 + 4;
        byte b7 = bArr[i12];
        if (b7 >= 0) {
            zzfzVar.zza = i13 | (b7 << 28);
            return i14;
        }
        int i15 = i13 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                zzfzVar.zza = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    public static int zzj(int i5, byte[] bArr, int i6, int i7, zzho zzhoVar, zzfz zzfzVar) {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int zzh = zzh(bArr, i6, zzfzVar);
        zzhlVar.zzg(zzfzVar.zza);
        while (zzh < i7) {
            int zzh2 = zzh(bArr, zzh, zzfzVar);
            if (i5 != zzfzVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i5, zzfz zzfzVar) {
        long j2 = bArr[i5];
        int i6 = i5 + 1;
        if (j2 >= 0) {
            zzfzVar.zzb = j2;
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
        zzfzVar.zzb = j5;
        return i7;
    }

    public static int zzl(Object obj, zzix zzixVar, byte[] bArr, int i5, int i6, int i7, zzfz zzfzVar) {
        int i8 = zzfzVar.zze + 1;
        zzfzVar.zze = i8;
        zzo(i8);
        int zzc = ((zzip) zzixVar).zzc(obj, bArr, i5, i6, i7, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzix zzixVar, byte[] bArr, int i5, int i6, zzfz zzfzVar) {
        int i7 = i5 + 1;
        int i8 = bArr[i5];
        if (i8 < 0) {
            i7 = zzi(i8, bArr, i7, zzfzVar);
            i8 = zzfzVar.zza;
        }
        int i9 = i7;
        if (i8 < 0 || i8 > i6 - i9) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i10 = zzfzVar.zze + 1;
        zzfzVar.zze = i10;
        zzo(i10);
        int i11 = i9 + i8;
        zzixVar.zzh(obj, bArr, i9, i11, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return i11;
    }

    public static long zzn(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    private static void zzo(int i5) {
        if (i5 >= zzb) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
