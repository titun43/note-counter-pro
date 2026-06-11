package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zziao extends zziaq {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zziao(byte[] bArr, int i5, int i6, boolean z4, byte[] bArr2) {
        super(null);
        this.zzl = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.zzf = bArr;
        this.zzg = i6 + i5;
        this.zzi = i5;
        this.zzj = i5;
    }

    private final void zzN() {
        int i5 = this.zzg + this.zzh;
        this.zzg = i5;
        int i6 = i5 - this.zzj;
        int i7 = this.zzl;
        if (i6 <= i7) {
            this.zzh = 0;
            return;
        }
        int i8 = i6 - i7;
        this.zzh = i8;
        this.zzg = i5 - i8;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzA(int i5) {
        this.zzl = i5;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzB() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzC() {
        return this.zzi - this.zzj;
    }

    public final byte zzD() {
        int i5 = this.zzi;
        if (i5 == this.zzg) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 1;
        return bArr[i5];
    }

    public final void zzE(int i5) {
        if (i5 >= 0) {
            int i6 = this.zzg;
            int i7 = this.zzi;
            if (i5 <= i6 - i7) {
                this.zzi = i7 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
            if (this.zzg - this.zzi < 10) {
                while (i7 < 10) {
                    if (zzD() < 0) {
                        i7++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i7 < 10) {
                byte[] bArr = this.zzf;
                int i8 = this.zzi;
                this.zzi = i8 + 1;
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
            int i5 = this.zzg;
            int i6 = this.zzi;
            if (zzu <= i5 - i6) {
                String str = new String(this.zzf, i6, zzu, zzice.zza);
                this.zzi += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzm() {
        int zzu = zzu();
        if (zzu > 0) {
            int i5 = this.zzg;
            int i6 = this.zzi;
            if (zzu <= i5 - i6) {
                String zze = zzier.zze(this.zzf, i6, zzu);
                this.zzi += zzu;
                return zze;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final zzian zzn() {
        int zzu = zzu();
        if (zzu > 0) {
            int i5 = this.zzg;
            int i6 = this.zzi;
            if (zzu <= i5 - i6) {
                zzian zzt = zzian.zzt(this.zzf, i6, zzu, false);
                this.zzi += zzu;
                return zzt;
            }
        }
        if (zzu == 0) {
            return zzian.zza;
        }
        if (zzu > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (zzu <= i7 - i8) {
                int i9 = zzu + i8;
                this.zzi = i9;
                byte[] copyOfRange = Arrays.copyOfRange(this.zzf, i8, i9);
                zzian zzianVar = zzian.zza;
                return new zzial(copyOfRange);
            }
        }
        if (zzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        int i6 = this.zzi;
        int i7 = this.zzg;
        if (i7 != i6) {
            byte[] bArr = this.zzf;
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                this.zzi = i8;
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
                this.zzi = i9;
                return i5;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j2;
        long j5;
        long j6;
        int i5 = this.zzi;
        int i6 = this.zzg;
        if (i6 != i5) {
            byte[] bArr = this.zzf;
            int i7 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.zzi = i7;
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
                this.zzi = i8;
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
        int i5 = this.zzi;
        if (this.zzg - i5 < 4) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 4;
        int i6 = bArr[i5] & 255;
        int i7 = bArr[i5 + 1] & 255;
        int i8 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i7 << 8) | i6 | (i8 << 16);
    }

    public final long zzy() {
        int i5 = this.zzi;
        if (this.zzg - i5 < 8) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 8;
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
        int i6 = (this.zzi - this.zzj) + i5;
        if (i6 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i7 = this.zzl;
        if (i6 > i7) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i6;
        zzN();
        return i7;
    }
}
