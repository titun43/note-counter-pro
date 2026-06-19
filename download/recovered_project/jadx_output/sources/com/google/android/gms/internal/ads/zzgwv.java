package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgwv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgwv(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c5 = cArr[i5];
            boolean z4 = true;
            zzgrc.zzc(c5 < 128, "Non-ASCII character: %s", c5);
            if (bArr[c5] != -1) {
                z4 = false;
            }
            zzgrc.zzc(z4, "Duplicate character: %s", c5);
            bArr[c5] = (byte) i5;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwv) {
            zzgwv zzgwvVar = (zzgwv) obj;
            if (this.zzi == zzgwvVar.zzi && Arrays.equals(this.zzf, zzgwvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i5) {
        return this.zzf[i5];
    }

    public final boolean zzb(int i5) {
        return this.zzh[i5 % this.zzc];
    }

    public final int zzc(char c5) {
        if (c5 > 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        byte b2 = this.zzg[c5];
        if (b2 != -1) {
            return b2;
        }
        if (c5 <= ' ' || c5 == 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c5).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c5);
        throw new zzgwy(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzgwv zzd() {
        boolean z4;
        int i5 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i5 >= length) {
                return this;
            }
            if (zzgql.zzd(cArr[i5])) {
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z4 = false;
                        break;
                    }
                    if (zzgql.zzc(cArr[i6])) {
                        z4 = true;
                        break;
                    }
                    i6++;
                }
                zzgrc.zzj(!z4, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i7 = 0; i7 < cArr.length; i7++) {
                    char c5 = cArr[i7];
                    if (zzgql.zzd(c5)) {
                        c5 ^= 32;
                    }
                    cArr2[i7] = (char) c5;
                }
                zzgwv zzgwvVar = new zzgwv(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgwvVar.zzi) {
                    return zzgwvVar;
                }
                byte[] bArr = zzgwvVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i8 = 65; i8 <= 90; i8++) {
                    int i9 = i8 | 32;
                    byte b2 = bArr[i8];
                    byte b5 = bArr[i9];
                    if (b2 == -1) {
                        copyOf[i8] = b5;
                    } else {
                        char c6 = (char) i8;
                        char c7 = (char) i9;
                        if (b5 != -1) {
                            throw new IllegalStateException(zzgrt.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c6), Character.valueOf(c7)));
                        }
                        copyOf[i9] = b2;
                    }
                }
                return new zzgwv(zzgwvVar.zze.concat(".ignoreCase()"), zzgwvVar.zzf, copyOf, true);
            }
            i5++;
        }
    }

    public final boolean zze(char c5) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgwv(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zza = zzgxs.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = zza;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zza);
            int i5 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i5;
            this.zzd = zza >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i5];
            for (int i6 = 0; i6 < this.zzd; i6++) {
                zArr[zzgxs.zzb(i6 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z4;
        } catch (ArithmeticException e4) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(length2).length() + 24), "Illegal alphabet length ", length2), e4);
        }
    }
}
