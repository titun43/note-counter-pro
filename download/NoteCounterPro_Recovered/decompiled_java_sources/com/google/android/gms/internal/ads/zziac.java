package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i5, zziab zziabVar) {
        int i6 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 < 0) {
            return zzb(b2, bArr, i6, zziabVar);
        }
        zziabVar.zza = b2;
        return i6;
    }

    public static int zzb(int i5, byte[] bArr, int i6, zziab zziabVar) {
        byte b2 = bArr[i6];
        int i7 = i6 + 1;
        int i8 = i5 & 127;
        if (b2 >= 0) {
            zziabVar.zza = i8 | (b2 << 7);
            return i7;
        }
        int i9 = i8 | ((b2 & Byte.MAX_VALUE) << 7);
        int i10 = i6 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zziabVar.zza = i9 | (b5 << 14);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 14);
        int i12 = i6 + 3;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            zziabVar.zza = i11 | (b6 << 21);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 21);
        int i14 = i6 + 4;
        byte b7 = bArr[i12];
        if (b7 >= 0) {
            zziabVar.zza = i13 | (b7 << 28);
            return i14;
        }
        int i15 = i13 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                zziabVar.zza = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    public static int zzc(byte[] bArr, int i5, zziab zziabVar) {
        long j2 = bArr[i5];
        int i6 = i5 + 1;
        if (j2 >= 0) {
            zziabVar.zzb = j2;
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
        zziabVar.zzb = j5;
        return i7;
    }

    public static int zzd(byte[] bArr, int i5) {
        int i6 = bArr[i5] & 255;
        int i7 = bArr[i5 + 1] & 255;
        int i8 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i7 << 8) | i6 | (i8 << 16);
    }

    public static long zze(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i5, zziab zziabVar) {
        int zza2 = zza(bArr, i5, zziabVar);
        int i6 = zziabVar.zza;
        if (i6 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 == 0) {
            zziabVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            return zza2;
        }
        zziabVar.zzc = zzier.zze(bArr, zza2, i6);
        return zza2 + i6;
    }

    public static int zzg(byte[] bArr, int i5, zziab zziabVar) {
        int zza2 = zza(bArr, i5, zziabVar);
        int i6 = zziabVar.zza;
        if (i6 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 > bArr.length - zza2) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i6 == 0) {
            zziabVar.zzc = zzian.zza;
            return zza2;
        }
        zziabVar.zzc = zzian.zzs(bArr, zza2, i6);
        return zza2 + i6;
    }

    public static int zzh(zzidu zziduVar, byte[] bArr, int i5, int i6, zziab zziabVar) {
        Object zza2 = zziduVar.zza();
        int zzj = zzj(zza2, zziduVar, bArr, i5, i6, zziabVar);
        zziduVar.zzk(zza2);
        zziabVar.zzc = zza2;
        return zzj;
    }

    public static int zzi(zzidu zziduVar, byte[] bArr, int i5, int i6, int i7, zziab zziabVar) {
        Object zza2 = zziduVar.zza();
        int zzk = zzk(zza2, zziduVar, bArr, i5, i6, i7, zziabVar);
        zziduVar.zzk(zza2);
        zziabVar.zzc = zza2;
        return zzk;
    }

    public static int zzj(Object obj, zzidu zziduVar, byte[] bArr, int i5, int i6, zziab zziabVar) {
        int i7 = i5 + 1;
        int i8 = bArr[i5];
        if (i8 < 0) {
            i7 = zzb(i8, bArr, i7, zziabVar);
            i8 = zziabVar.zza;
        }
        int i9 = i7;
        if (i8 < 0 || i8 > i6 - i9) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i10 = zziabVar.zze + 1;
        zziabVar.zze = i10;
        zzq(i10);
        int i11 = i9 + i8;
        zziduVar.zzj(obj, bArr, i9, i11, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return i11;
    }

    public static int zzk(Object obj, zzidu zziduVar, byte[] bArr, int i5, int i6, int i7, zziab zziabVar) {
        int i8 = zziabVar.zze + 1;
        zziabVar.zze = i8;
        zzq(i8);
        int zzi = ((zzidf) zziduVar).zzi(obj, bArr, i5, i6, i7, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return zzi;
    }

    public static int zzl(int i5, byte[] bArr, int i6, int i7, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int zza2 = zza(bArr, i6, zziabVar);
        zzibsVar.zzi(zziabVar.zza);
        while (zza2 < i7) {
            int zza3 = zza(bArr, zza2, zziabVar);
            if (i5 != zziabVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        return zza2;
    }

    public static int zzm(byte[] bArr, int i5, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int zza2 = zza(bArr, i5, zziabVar);
        int i6 = zziabVar.zza + zza2;
        while (zza2 < i6) {
            zza2 = zza(bArr, zza2, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        if (zza2 == i6) {
            return zza2;
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzidu zziduVar, int i5, byte[] bArr, int i6, int i7, zzicd zzicdVar, zziab zziabVar) {
        int zzh = zzh(zziduVar, bArr, i6, i7, zziabVar);
        zzicdVar.add(zziabVar.zzc);
        while (zzh < i7) {
            int zza2 = zza(bArr, zzh, zziabVar);
            if (i5 != zziabVar.zza) {
                break;
            }
            zzh = zzh(zziduVar, bArr, zza2, i7, zziabVar);
            zzicdVar.add(zziabVar.zzc);
        }
        return zzh;
    }

    public static int zzo(int i5, byte[] bArr, int i6, int i7, zzieg zziegVar, zziab zziabVar) {
        if ((i5 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int zzc = zzc(bArr, i6, zziabVar);
            zziegVar.zzk(i5, Long.valueOf(zziabVar.zzb));
            return zzc;
        }
        if (i8 == 1) {
            zziegVar.zzk(i5, Long.valueOf(zze(bArr, i6)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int zza2 = zza(bArr, i6, zziabVar);
            int i9 = zziabVar.zza;
            if (i9 < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i9 > bArr.length - zza2) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i9 == 0) {
                zziegVar.zzk(i5, zzian.zza);
            } else {
                zziegVar.zzk(i5, zzian.zzs(bArr, zza2, i9));
            }
            return zza2 + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw new zzicg("Protocol message contained an invalid tag (zero).");
            }
            zziegVar.zzk(i5, Integer.valueOf(zzd(bArr, i6)));
            return i6 + 4;
        }
        int i10 = (i5 & (-8)) | 4;
        zzieg zzb2 = zzieg.zzb();
        int i11 = zziabVar.zze + 1;
        zziabVar.zze = i11;
        zzq(i11);
        int i12 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int zza3 = zza(bArr, i6, zziabVar);
            int i13 = zziabVar.zza;
            if (i13 == i10) {
                i12 = i13;
                i6 = zza3;
                break;
            }
            i6 = zzo(i13, bArr, zza3, i7, zzb2, zziabVar);
            i12 = i13;
        }
        zziabVar.zze--;
        if (i6 > i7 || i12 != i10) {
            throw new zzicg("Failed to parse the message.");
        }
        zziegVar.zzk(i5, zzb2);
        return i6;
    }

    public static int zzp(int i5, byte[] bArr, int i6, int i7, zziab zziabVar) {
        if ((i5 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            return zzc(bArr, i6, zziabVar);
        }
        if (i8 == 1) {
            return i6 + 8;
        }
        if (i8 == 2) {
            return zza(bArr, i6, zziabVar) + zziabVar.zza;
        }
        if (i8 != 3) {
            if (i8 == 5) {
                return i6 + 4;
            }
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i9 = (i5 & (-8)) | 4;
        int i10 = 0;
        while (i6 < i7) {
            i6 = zza(bArr, i6, zziabVar);
            i10 = zziabVar.zza;
            if (i10 == i9) {
                break;
            }
            i6 = zzp(i10, bArr, i6, i7, zziabVar);
        }
        if (i6 > i7 || i10 != i9) {
            throw new zzicg("Failed to parse the message.");
        }
        return i6;
    }

    private static void zzq(int i5) {
        if (i5 >= zzb) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
