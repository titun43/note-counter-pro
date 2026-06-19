package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Locale;

/* loaded from: classes.dex */
final class zziat extends zziaw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zziat(byte[] bArr, int i5, int i6) {
        super(null);
        int length = bArr.length;
        if (((length - i6) | i6) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(u.g(length, i6, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i6;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i5, int i6) {
        zzs((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i5, int i6) {
        zzs(i5 << 3);
        zzr(i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i5, int i6) {
        zzs(i5 << 3);
        zzs(i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i5, int i6) {
        zzs((i5 << 3) | 5);
        zzt(i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i5, long j2) {
        zzs(i5 << 3);
        zzu(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i5, int i6) {
        zzw(bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i5, long j2) {
        zzs((i5 << 3) | 1);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i5, boolean z4) {
        zzs(i5 << 3);
        zzq(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzj(int i5, String str) {
        zzs((i5 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzk(int i5, zzian zzianVar) {
        zzs((i5 << 3) | 2);
        zzl(zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzl(zzian zzianVar) {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzm(byte[] bArr, int i5, int i6) {
        zzs(i6);
        zzw(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzn(int i5, zzidc zzidcVar) {
        zzs(11);
        zzJ(2, i5);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzo(int i5, zzian zzianVar) {
        zzs(11);
        zzJ(2, i5);
        zzk(3, zzianVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzp(zzidc zzidcVar) {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzq(byte b2) {
        int i5 = this.zzc;
        try {
            int i6 = i5 + 1;
            try {
                this.zza[i5] = b2;
                this.zzc = i6;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                i5 = i6;
                throw new zziau(i5, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzr(int i5) {
        if (i5 >= 0) {
            zzs(i5);
        } else {
            zzu(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i5) {
        int i6;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zzc;
        while ((i5 & (-128)) != 0) {
            try {
                i6 = i7 + 1;
                try {
                    this.zza[i7] = (byte) (i5 | 128);
                    i5 >>>= 7;
                    i7 = i6;
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                    i7 = i6;
                    throw new zziau(i7, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e5) {
                indexOutOfBoundsException = e5;
                throw new zziau(i7, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i6 = i7 + 1;
        this.zza[i7] = (byte) i5;
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i5) {
        int i6 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i6] = (byte) i5;
            bArr[i6 + 1] = (byte) (i5 >> 8);
            bArr[i6 + 2] = (byte) (i5 >> 16);
            bArr[i6 + 3] = (byte) (i5 >> 24);
            this.zzc = i6 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zziau(i6, this.zzb, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j2) {
        boolean z4;
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        z4 = zziaw.zza;
        int i6 = this.zzc;
        if (!z4 || this.zzb - i6 < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    int i7 = i6 + 1;
                    try {
                        this.zza[i6] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i6 = i7;
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i6 = i7;
                        throw new zziau(i6, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                }
            }
            i5 = i6 + 1;
            try {
                this.zza[i6] = (byte) j2;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i5;
                throw new zziau(i6, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j2 & (-128)) != 0) {
                zziem.zzp(this.zza, i6, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i6++;
            }
            i5 = i6 + 1;
            zziem.zzp(this.zza, i6, (byte) j2);
        }
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j2) {
        int i5 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i5] = (byte) j2;
            bArr[i5 + 1] = (byte) (j2 >> 8);
            bArr[i5 + 2] = (byte) (j2 >> 16);
            bArr[i5 + 3] = (byte) (j2 >> 24);
            bArr[i5 + 4] = (byte) (j2 >> 32);
            bArr[i5 + 5] = (byte) (j2 >> 40);
            bArr[i5 + 6] = (byte) (j2 >> 48);
            bArr[i5 + 7] = (byte) (j2 >> 56);
            this.zzc = i5 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new zziau(i5, this.zzb, 8, e4);
        }
    }

    public final void zzw(byte[] bArr, int i5, int i6) {
        try {
            System.arraycopy(bArr, i5, this.zza, this.zzc, i6);
            this.zzc += i6;
        } catch (IndexOutOfBoundsException e4) {
            throw new zziau(this.zzc, this.zzb, i6, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) {
        int i5 = this.zzc;
        try {
            int zzA = zziaw.zzA(str.length() * 3);
            int zzA2 = zziaw.zzA(str.length());
            if (zzA2 != zzA) {
                zzs(zzier.zzc(str));
                byte[] bArr = this.zza;
                int i6 = this.zzc;
                this.zzc = zzier.zzd(str, bArr, i6, this.zzb - i6);
                return;
            }
            int i7 = i5 + zzA2;
            this.zzc = i7;
            int zzd = zzier.zzd(str, this.zza, i7, this.zzb - i7);
            this.zzc = i5;
            zzs((zzd - i5) - zzA2);
            this.zzc = zzd;
        } catch (IndexOutOfBoundsException e4) {
            throw new zziau(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
    }
}
