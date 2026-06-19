package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zziap extends zziaq {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zziap(InputStream inputStream, int i5, byte[] bArr) {
        super(null);
        this.zzm = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        byte[] bArr2 = zzice.zzb;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i5 = this.zzh + this.zzi;
        this.zzh = i5;
        int i6 = this.zzl + i5;
        int i7 = this.zzm;
        if (i6 <= i7) {
            this.zzi = 0;
            return;
        }
        int i8 = i6 - i7;
        this.zzi = i8;
        this.zzh = i5 - i8;
    }

    private final void zzO(int i5) {
        if (zzP(i5)) {
            return;
        }
        if (i5 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.zzl) - this.zzj) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i5) {
        int i6 = this.zzj;
        int i7 = i6 + i5;
        int i8 = this.zzh;
        if (i7 <= i8) {
            throw new IllegalStateException(u.m(new StringBuilder(String.valueOf(i5).length() + 66), "refillBuffer() called when ", i5, " bytes were already available in buffer"));
        }
        int i9 = this.zzl;
        if (i5 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i9) - i6 || i9 + i6 + i5 > this.zzm) {
            return false;
        }
        if (i6 > 0) {
            if (i8 > i6) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i6, bArr, 0, i8 - i6);
            }
            i9 = this.zzl + i6;
            this.zzl = i9;
            i8 = this.zzh - i6;
            this.zzh = i8;
            this.zzj = 0;
        }
        try {
            int read = this.zzf.read(this.zzg, i8, Math.min(4096 - i8, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i9) - i8));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.zzh += read;
                zzN();
                return this.zzh >= i5 || zzP(i5);
            }
            String valueOf = String.valueOf(this.zzf.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
            sb.append(valueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(read);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (zzicg e4) {
            e4.zza();
            throw e4;
        }
    }

    private final byte[] zzQ(int i5, boolean z4) {
        byte[] zzR = zzR(i5);
        if (zzR != null) {
            return zzR;
        }
        int i6 = this.zzj;
        int i7 = this.zzh;
        int i8 = i7 - i6;
        this.zzl += i7;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzS = zzS(i5 - i8);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzg, i6, bArr, 0, i8);
        for (byte[] bArr2 : zzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i8, length);
            i8 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i5) {
        if (i5 == 0) {
            return zzice.zzb;
        }
        int i6 = this.zzl;
        int i7 = this.zzj;
        int i8 = i6 + i7 + i5;
        if ((-2147483647) + i8 > 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.zzm;
        if (i8 > i9) {
            zzE((i9 - i6) - i7);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i10 = this.zzh - i7;
        int i11 = i5 - i10;
        if (i11 >= 4096) {
            try {
                if (i11 > this.zzf.available()) {
                    return null;
                }
            } catch (zzicg e4) {
                e4.zza();
                throw e4;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i10);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i10 < i5) {
            try {
                int read = this.zzf.read(bArr, i10, i5 - i10);
                if (read == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i10 += read;
            } catch (zzicg e5) {
                e5.zza();
                throw e5;
            }
        }
        return bArr;
    }

    private final List zzS(int i5) {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int min = Math.min(i5, 4096);
            byte[] bArr = new byte[min];
            int i6 = 0;
            while (i6 < min) {
                int read = this.zzf.read(bArr, i6, min - i6);
                if (read == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i6 += read;
            }
            i5 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzA(int i5) {
        this.zzm = i5;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzB() {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    public final byte zzD() {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i5 = this.zzj;
        this.zzj = i5 + 1;
        return bArr[i5];
    }

    public final void zzE(int i5) {
        int i6 = this.zzh;
        int i7 = this.zzj;
        int i8 = i6 - i7;
        if (i5 <= i8 && i5 >= 0) {
            this.zzj = i7 + i5;
            return;
        }
        if (i5 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = this.zzl;
        int i10 = i9 + i7;
        int i11 = this.zzm;
        if (i10 + i5 > i11) {
            zzE((i11 - i9) - i7);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i10;
        this.zzh = 0;
        this.zzj = 0;
        while (i8 < i5) {
            try {
                long j2 = i5 - i8;
                try {
                    long skip = this.zzf.skip(j2);
                    if (skip < 0 || skip > j2) {
                        String valueOf = String.valueOf(this.zzf.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (zzicg e4) {
                    e4.zza();
                    throw e4;
                }
            } catch (Throwable th) {
                this.zzl += i8;
                zzN();
                throw th;
            }
        }
        this.zzl += i8;
        zzN();
        if (i8 >= i5) {
            return;
        }
        int i12 = this.zzh;
        int i13 = i12 - this.zzj;
        this.zzj = i12;
        zzO(1);
        while (true) {
            int i14 = i5 - i13;
            int i15 = this.zzh;
            if (i14 <= i15) {
                this.zzj = i14;
                return;
            } else {
                i13 += i15;
                this.zzj = i15;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zza() {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new zzicg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzb(int i5) {
        if (this.zzk != i5) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzc(int i5) {
        int i6 = i5 & 7;
        int i7 = 0;
        if (i6 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i7 < 10) {
                    if (zzD() < 0) {
                        i7++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i7 < 10) {
                byte[] bArr = this.zzg;
                int i8 = this.zzj;
                this.zzj = i8 + 1;
                if (bArr[i8] < 0) {
                    i7++;
                }
            }
            throw new zzicg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i6 == 1) {
            zzE(8);
            return true;
        }
        if (i6 == 2) {
            zzE(zzu());
            return true;
        }
        if (i6 == 3) {
            zzJ();
            zzb(((i5 >>> 3) << 3) | 4);
            return true;
        }
        if (i6 == 4) {
            zzI();
            return false;
        }
        if (i6 != 5) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final double zzd() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final float zze() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzf() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzg() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzh() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzi() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzk() {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzl() {
        int zzu = zzu();
        if (zzu > 0) {
            int i5 = this.zzh;
            int i6 = this.zzj;
            if (zzu <= i5 - i6) {
                String str = new String(this.zzg, i6, zzu, zzice.zza);
                this.zzj += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzu > this.zzh) {
            return new String(zzQ(zzu, false), zzice.zza);
        }
        zzO(zzu);
        String str2 = new String(this.zzg, this.zzj, zzu, zzice.zza);
        this.zzj += zzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzm() {
        byte[] zzQ;
        int zzu = zzu();
        int i5 = this.zzj;
        int i6 = this.zzh;
        if (zzu <= i6 - i5 && zzu > 0) {
            zzQ = this.zzg;
            this.zzj = i5 + zzu;
        } else {
            if (zzu == 0) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (zzu < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i5 = 0;
            if (zzu <= i6) {
                zzO(zzu);
                zzQ = this.zzg;
                this.zzj = zzu;
            } else {
                zzQ = zzQ(zzu, false);
            }
        }
        return zzier.zze(zzQ, i5, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final zzian zzn() {
        int zzu = zzu();
        int i5 = this.zzh;
        int i6 = this.zzj;
        if (zzu <= i5 - i6 && zzu > 0) {
            zzian zzt = zzian.zzt(this.zzg, i6, zzu, false);
            this.zzj += zzu;
            return zzt;
        }
        if (zzu == 0) {
            return zzian.zza;
        }
        if (zzu < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzR = zzR(zzu);
        if (zzR != null) {
            return zzian.zzt(zzR, 0, zzR.length, false);
        }
        int i7 = this.zzj;
        int i8 = this.zzh;
        int i9 = i8 - i7;
        this.zzl += i8;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzS = zzS(zzu - i9);
        byte[] bArr = new byte[zzu];
        System.arraycopy(this.zzg, i7, bArr, 0, i9);
        for (byte[] bArr2 : zzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i9, length);
            i9 += length;
        }
        return zzian.zzu(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzo() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzp() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzq() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzr() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzs() {
        return zziaq.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzt() {
        return zziaq.zzL(zzv());
    }

    public final int zzu() {
        int i5;
        int i6 = this.zzj;
        int i7 = this.zzh;
        if (i7 != i6) {
            byte[] bArr = this.zzg;
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                this.zzj = i8;
                return b2;
            }
            if (i7 - i8 >= 9) {
                int i9 = i6 + 2;
                int i10 = (bArr[i8] << 7) ^ b2;
                if (i10 < 0) {
                    i5 = i10 ^ (-128);
                } else {
                    int i11 = i6 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        i5 = i12 ^ 16256;
                    } else {
                        int i13 = i6 + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            i5 = (-2080896) ^ i14;
                        } else {
                            i11 = i6 + 5;
                            byte b5 = bArr[i13];
                            int i15 = (i14 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i13 = i6 + 6;
                                if (bArr[i11] < 0) {
                                    i11 = i6 + 7;
                                    if (bArr[i13] < 0) {
                                        i13 = i6 + 8;
                                        if (bArr[i11] < 0) {
                                            i11 = i6 + 9;
                                            if (bArr[i13] < 0) {
                                                int i16 = i6 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i9 = i16;
                                                    i5 = i15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i15;
                            }
                            i5 = i15;
                        }
                        i9 = i13;
                    }
                    i9 = i11;
                }
                this.zzj = i9;
                return i5;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j2;
        long j5;
        long j6;
        int i5 = this.zzj;
        int i6 = this.zzh;
        if (i6 != i5) {
            byte[] bArr = this.zzg;
            int i7 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.zzj = i7;
                return b2;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b2;
                if (i9 < 0) {
                    j2 = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        j2 = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            long j7 = (-2080896) ^ i13;
                            i8 = i12;
                            j2 = j7;
                        } else {
                            i10 = i5 + 5;
                            long j8 = (bArr[i12] << 28) ^ i13;
                            if (j8 >= 0) {
                                j2 = j8 ^ 266354560;
                            } else {
                                i8 = i5 + 6;
                                long j9 = (bArr[i10] << 35) ^ j8;
                                if (j9 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    int i14 = i5 + 7;
                                    long j10 = j9 ^ (bArr[i8] << 42);
                                    if (j10 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i8 = i5 + 8;
                                        j9 = j10 ^ (bArr[i14] << 49);
                                        if (j9 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i14 = i5 + 9;
                                            j10 = j9 ^ (bArr[i8] << 56);
                                            if (j10 >= 0) {
                                                j5 = 71499008037633920L;
                                            } else {
                                                i8 = i5 + 10;
                                                long j11 = j10 ^ (bArr[i14] << 63);
                                                if (j11 >= 0) {
                                                    j2 = j11 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j2 = j10 ^ j5;
                                    i8 = i14;
                                }
                                j2 = j9 ^ j6;
                            }
                        }
                    }
                    i8 = i10;
                }
                this.zzj = i8;
                return j2;
            }
        }
        return zzw();
    }

    public final long zzw() {
        long j2 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i5;
            if ((zzD() & 128) == 0) {
                return j2;
            }
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() {
        int i5 = this.zzj;
        if (this.zzh - i5 < 4) {
            zzO(4);
            i5 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 4;
        int i6 = bArr[i5] & 255;
        int i7 = bArr[i5 + 1] & 255;
        int i8 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i7 << 8) | i6 | (i8 << 16);
    }

    public final long zzy() {
        int i5 = this.zzj;
        if (this.zzh - i5 < 8) {
            zzO(8);
            i5 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 8;
        long j2 = bArr[i5];
        long j5 = bArr[i5 + 2];
        long j6 = bArr[i5 + 3];
        return ((bArr[i5 + 6] & 255) << 48) | (j2 & 255) | ((bArr[i5 + 1] & 255) << 8) | ((j5 & 255) << 16) | ((j6 & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzz(int i5) {
        if (i5 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.zzl + this.zzj + i5;
        if (i6 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i7 = this.zzm;
        if (i6 > i7) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i6;
        zzN();
        return i7;
    }
}
