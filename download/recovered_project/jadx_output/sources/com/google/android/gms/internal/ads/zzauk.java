package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzauk {
    public static final zzauk zzb = new zzauk(new byte[0]);
    public static final Comparator zzc = new zzauj();
    public final byte[] zza;

    public zzauk(byte[] bArr) {
        this.zza = bArr;
    }

    public static zzauk zze(byte[] bArr) {
        return new zzauk(zzh(bArr, 0, bArr.length));
    }

    public static zzauk zzf(String str) {
        return zze(str.getBytes(Charset.forName(zzaui.zza("Hn2H4l0="))));
    }

    public static int zzg(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        return b2 & ((iArr[7] % 837626799) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
    }

    public static byte[] zzh(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzauk) {
            return Arrays.equals(this.zza, ((zzauk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.zza));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        String arrays = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + ((i12 % 981766422) ^ d5));
        sb.append(zzaui.zza("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(arrays);
        sb.append(zzaui.zza("Ng=="));
        return sb.toString();
    }

    public final byte[] zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        return length == 0 ? new byte[0] : zzh(bArr, 0, length);
    }

    public final byte zzb(int i5) {
        int i6 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i7 = 2013725218 % 1633938701;
        int i8 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i9 = 1442767057 % 63299708;
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (((length - (i5 + 1)) | i5) >= 0) {
            return bArr[i5];
        }
        if (i5 < 0) {
            StringBuilder sb = new StringBuilder(u.b(i5, i6 ^ i7));
            sb.append(zzaui.zza("Akelqh1fajntGgo="));
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(u.b(length, u.b(i5, i8 ^ i9)));
        sb2.append(zzaui.zza("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i5);
        sb2.append(zzaui.zza("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String zzc() {
        Charset forName = Charset.forName(zzaui.zza("Hn2H4l0="));
        byte[] bArr = this.zza;
        return new String(bArr, 0, bArr.length, forName);
    }

    public final zzauk zzd(zzauk zzaukVar) {
        byte[] bArr = zzaukVar.zza;
        int length = bArr.length;
        byte[] bArr2 = this.zza;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return zze(bArr3);
    }
}
