package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzer {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgup zzc = zzgup.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzer(byte[] bArr, int i5) {
        this.zze = bArr;
        this.zzg = i5;
    }

    private final char zzS(ByteOrder byteOrder, int i5) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i6 = this.zzf + i5;
            return zzgxw.zza(bArr[i6], bArr[i6 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i7 = this.zzf + i5;
        return zzgxw.zza(bArr2[i7 + 1], bArr2[i7]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int zzU;
        if (zzd() >= zzV(charset) && (zzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j2 = r0;
                char c5 = (char) j2;
                zzgrc.zze(((long) c5) == j2, "Out of range: %s", j2);
                for (char c6 : cArr) {
                    if (c6 == c5) {
                        this.zzf = zzgxz.zza(zzU & 255) + this.zzf;
                        return c5;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int i5;
        int i6;
        int i7;
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i8 = this.zzf;
            int i9 = this.zzg;
            throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i8).length() + 17 + String.valueOf(i9).length()), "position=", i8, ", limit=", i9));
        }
        int i10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.zze[this.zzf];
            if ((b2 & 128) == 0) {
                i5 = b2 & 255;
                return (i5 << 8) | i10;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b5 = this.zze[this.zzf];
            if ((b5 & 128) == 0) {
                i6 = 1;
            } else if ((b5 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i6 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i11 = this.zzf;
                    if (zzX(bArr[i11 + 1]) && zzX(bArr[i11 + 2])) {
                        i6 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i12 = this.zzf;
                    if (zzX(bArr2[i12 + 1]) && zzX(bArr2[i12 + 2]) && zzX(bArr2[i12 + 3])) {
                        i6 = 4;
                    }
                }
                i6 = 0;
            }
            if (i6 == 1) {
                i7 = this.zze[this.zzf] & 255;
            } else if (i6 == 2) {
                byte[] bArr3 = this.zze;
                int i13 = this.zzf;
                i7 = zzY(0, 0, bArr3[i13], bArr3[i13 + 1]);
            } else {
                if (i6 != 3) {
                    if (i6 == 4) {
                        byte[] bArr4 = this.zze;
                        int i14 = this.zzf;
                        i7 = zzY(bArr4[i14], bArr4[i14 + 1], bArr4[i14 + 2], bArr4[i14 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i15 = this.zzf;
                i7 = zzY(0, bArr5[i15] & 15, bArr5[i15 + 1], bArr5[i15 + 2]);
            }
            i10 = i6;
            i5 = i7;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char zzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(zzS) || zzd() < 4) {
                i5 = zzS;
                i10 = 2;
            } else {
                i5 = Character.toCodePoint(zzS, zzS(byteOrder, 2));
                i10 = 4;
            }
        }
        return (i5 << 8) | i10;
    }

    private static int zzV(Charset charset) {
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i5) {
        if (!zzd.get() || zzd() >= i5) {
            return;
        }
        int zzd2 = zzd();
        throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 25 + String.valueOf(zzd2).length()), "bytesNeeded= ", i5, ", bytesLeft=", zzd2));
    }

    private static boolean zzX(byte b2) {
        return (b2 & 192) == 128;
    }

    private static int zzY(int i5, int i6, int i7, int i8) {
        return zzgxz.zze((byte) 0, zzgyd.zza(((i5 & 7) << 2) | ((i6 & 48) >> 4)), zzgyd.zza(((i7 & 60) >> 2) | ((i6 & 15) << 4)), zzgyd.zza((i8 & 63) | ((i7 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        long j2 = bArr[i5];
        int i7 = i5 + 2;
        this.zzf = i7;
        long j5 = bArr[i6];
        this.zzf = i5 + 3;
        long j6 = bArr[i7];
        this.zzf = i5 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j2) | ((j5 & 255) << 8) | ((j6 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        int i8 = i5 + 2;
        this.zzf = i8;
        int i9 = bArr[i6] & 255;
        int i10 = i5 + 3;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        this.zzf = i5 + 4;
        return (bArr[i10] & 255) | (i7 << 24) | (i9 << 16) | (i11 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        int i8 = i5 + 2;
        this.zzf = i8;
        int i9 = bArr[i6] & 255;
        int i10 = i5 + 3;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        this.zzf = i5 + 4;
        return ((bArr[i10] & 255) << 24) | (i9 << 8) | i7 | (i11 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        long j2 = bArr[i5];
        int i7 = i5 + 2;
        this.zzf = i7;
        long j5 = bArr[i6];
        int i8 = i5 + 3;
        this.zzf = i8;
        long j6 = bArr[i7];
        int i9 = i5 + 4;
        this.zzf = i9;
        long j7 = bArr[i8];
        int i10 = i5 + 5;
        this.zzf = i10;
        long j8 = bArr[i9];
        int i11 = i5 + 6;
        this.zzf = i11;
        long j9 = bArr[i10];
        this.zzf = i5 + 7;
        long j10 = bArr[i11];
        this.zzf = i5 + 8;
        return ((j10 & 255) << 8) | ((j2 & 255) << 56) | ((j5 & 255) << 48) | ((j6 & 255) << 40) | ((j7 & 255) << 32) | ((j8 & 255) << 24) | ((j9 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        long j2 = bArr[i5];
        int i7 = i5 + 2;
        this.zzf = i7;
        long j5 = bArr[i6];
        int i8 = i5 + 3;
        this.zzf = i8;
        long j6 = bArr[i7];
        int i9 = i5 + 4;
        this.zzf = i9;
        long j7 = bArr[i8];
        int i10 = i5 + 5;
        this.zzf = i10;
        long j8 = bArr[i9];
        int i11 = i5 + 6;
        this.zzf = i11;
        long j9 = bArr[i10];
        this.zzf = i5 + 7;
        long j10 = bArr[i11];
        this.zzf = i5 + 8;
        return ((j10 & 255) << 48) | (j2 & 255) | ((j5 & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24) | ((j8 & 255) << 32) | ((j9 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        this.zzf = i5 + 2;
        int i8 = bArr[i6] & 255;
        this.zzf = i5 + 4;
        return (i7 << 8) | i8;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int zzB = zzB();
        if (zzB >= 0) {
            return zzB;
        }
        throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(zzB).length() + 18), "Top bit not zero: ", zzB));
    }

    public final int zzI() {
        int zzC = zzC();
        if (zzC >= 0) {
            return zzC;
        }
        throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(zzC).length() + 18), "Top bit not zero: ", zzC));
    }

    public final long zzJ() {
        long zzD = zzD();
        if (zzD >= 0) {
            return zzD;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(zzD);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzK(int i5, Charset charset) {
        zzW(i5);
        byte[] bArr = this.zze;
        int i6 = this.zzf;
        String str = new String(bArr, i6, i5, charset);
        this.zzf = i6 + i5;
        return str;
    }

    public final String zzL(int i5) {
        zzW(i5);
        if (i5 == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int i6 = this.zzf;
        int i7 = (i6 + i5) - 1;
        String zzj = zzfj.zzj(this.zze, i6, (i7 >= this.zzg || this.zze[i7] != 0) ? i5 : i5 - 1);
        this.zzf += i5;
        return zzj;
    }

    public final String zzM(char c5) {
        if (zzd() == 0) {
            return null;
        }
        int i5 = this.zzf;
        while (i5 < this.zzg && this.zze[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.zze;
        int i6 = this.zzf;
        String zzj = zzfj.zzj(bArr, i6, i5 - i6);
        this.zzf = i5;
        if (i5 < this.zzg) {
            this.zzf = i5 + 1;
        }
        return zzj;
    }

    public final String zzN(Charset charset) {
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzR();
        }
        int i5 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i5 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i6 = this.zzf;
        while (true) {
            int i7 = this.zzg;
            if (i6 >= i7 - (i5 - 1)) {
                i6 = i7;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzfj.zzk(this.zze[i6])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.zze;
                if (bArr[i6] == 0 && zzfj.zzk(bArr[i6 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.zze;
                if (bArr2[i6 + 1] == 0 && zzfj.zzk(bArr2[i6])) {
                    break;
                }
            }
            i6 += i5;
        }
        String zzK = zzK(i6 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return zzK;
    }

    public final long zzO() {
        int i5;
        zzW(1);
        long j2 = this.zze[this.zzf];
        int i6 = 7;
        while (true) {
            i5 = 0;
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j2) != 0) {
                i6--;
            } else if (i6 < 6) {
                j2 &= r7 - 1;
                i5 = 7 - i6;
            } else if (i6 == 7) {
                i5 = 1;
            }
        }
        if (i5 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        zzW(i5);
        for (int i7 = 1; i7 < i5; i7++) {
            if ((this.zze[this.zzf + i7] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | (r3 & 63);
        }
        this.zzf += i5;
        return j2;
    }

    public final long zzP() {
        long j2 = 0;
        for (int i5 = 0; i5 < 9; i5++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long zzs = zzs();
            j2 |= (127 & zzs) << (i5 * 7);
            if ((zzs & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i5 = this.zzf;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.zzf = i5 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i6 = this.zzf;
        byte b2 = bArr2[i6];
        if (b2 == -2) {
            if (bArr2[i6 + 1] != -1) {
                return null;
            }
            this.zzf = i6 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i6 + 1] != -2) {
            return null;
        }
        this.zzf = i6 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i5) {
        byte[] bArr = this.zze;
        if (bArr.length < i5) {
            bArr = new byte[i5];
        }
        zzb(bArr, i5);
    }

    public final void zzb(byte[] bArr, int i5) {
        this.zze = bArr;
        this.zzg = i5;
        this.zzf = 0;
    }

    public final void zzc(int i5) {
        byte[] bArr = this.zze;
        if (i5 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i5);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= this.zze.length) {
            z4 = true;
        }
        zzgrc.zza(z4);
        this.zzg = i5;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= this.zzg) {
            z4 = true;
        }
        zzgrc.zza(z4);
        this.zzf = i5;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i5) {
        zzh(this.zzf + i5);
    }

    public final void zzl(zzeq zzeqVar, int i5) {
        zzm(zzeqVar.zza, 0, i5);
        zzeqVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i5, int i6) {
        zzW(i6);
        System.arraycopy(this.zze, this.zzf, bArr, i5, i6);
        this.zzf += i6;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgxz.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i5 = this.zzf;
        int i6 = this.zzg;
        throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 17 + String.valueOf(i6).length()), "position=", i5, ", limit=", i6));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i5 = this.zzf;
        int i6 = this.zzg;
        throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 17 + String.valueOf(i6).length()), "position=", i5, ", limit=", i6));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        return bArr[i5] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        this.zzf = i5 + 2;
        return (bArr[i6] & 255) | (i7 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        this.zzf = i5 + 2;
        return ((bArr[i6] & 255) << 8) | i7;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        this.zzf = i5 + 2;
        return (short) ((bArr[i6] & 255) | (i7 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        this.zzf = i5 + 2;
        return (short) (((bArr[i6] & 255) << 8) | i7);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        int i8 = i5 + 2;
        this.zzf = i8;
        int i9 = bArr[i6] & 255;
        this.zzf = i5 + 3;
        return (bArr[i8] & 255) | (i7 << 16) | (i9 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        int i7 = bArr[i5] & 255;
        int i8 = i5 + 2;
        this.zzf = i8;
        int i9 = bArr[i6] & 255;
        this.zzf = i5 + 3;
        return (bArr[i8] & 255) | ((i7 << 24) >> 8) | (i9 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i5 = this.zzf;
        int i6 = i5 + 1;
        this.zzf = i6;
        long j2 = bArr[i5];
        int i7 = i5 + 2;
        this.zzf = i7;
        long j5 = bArr[i6];
        this.zzf = i5 + 3;
        long j6 = bArr[i7];
        this.zzf = i5 + 4;
        return (bArr[r3] & 255) | ((j2 & 255) << 24) | ((j5 & 255) << 16) | ((j6 & 255) << 8);
    }

    public zzer() {
        this.zze = zzfj.zzb;
    }

    public zzer(int i5) {
        this.zze = new byte[i5];
        this.zzg = i5;
    }

    public zzer(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
