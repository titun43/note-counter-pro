package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzpr extends zzpv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzpr(byte[] bArr, int i5, int i6) {
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

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b2) {
        int i5 = this.zzc;
        try {
            int i6 = i5 + 1;
            try {
                this.zza[i5] = b2;
                this.zzc = i6;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                i5 = i6;
                throw new zzps(i5, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i5, boolean z4) {
        zzw(i5 << 3);
        zzJ(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i5, int i6) {
        zzw(i6);
        zze(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i5, int i6) {
        zze(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i5, int i6) {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i6);
            this.zzc += i6;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzps(this.zzc, this.zzb, i6, e4);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i5, zzpm zzpmVar) {
        zzw((i5 << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(zzpm zzpmVar) {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i5, int i6) {
        zzw((i5 << 3) | 5);
        zzk(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i5) {
        int i6 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i6] = (byte) i5;
            bArr[i6 + 1] = (byte) (i5 >> 8);
            bArr[i6 + 2] = (byte) (i5 >> 16);
            bArr[i6 + 3] = (byte) (i5 >> 24);
            this.zzc = i6 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzps(i6, this.zzb, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i5, long j2) {
        zzw((i5 << 3) | 1);
        zzm(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j2) {
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
            throw new zzps(i5, this.zzb, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i5, int i6) {
        zzw(i5 << 3);
        zzo(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i5) {
        if (i5 >= 0) {
            zzw(i5);
        } else {
            zzy(i5);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(zzrq zzrqVar) {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i5, zzrq zzrqVar) {
        zzw(11);
        zzv(2, i5);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i5, zzpm zzpmVar) {
        zzw(11);
        zzv(2, i5);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i5, String str) {
        zzw((i5 << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(String str) {
        int i5 = this.zzc;
        try {
            int zzC = zzpv.zzC(str.length() * 3);
            int zzC2 = zzpv.zzC(str.length());
            if (zzC2 != zzC) {
                zzw(zzsy.zzb(str));
                byte[] bArr = this.zza;
                int i6 = this.zzc;
                this.zzc = zzsy.zza(str, bArr, i6, this.zzb - i6);
                return;
            }
            int i7 = i5 + zzC2;
            this.zzc = i7;
            int zza = zzsy.zza(str, this.zza, i7, this.zzb - i7);
            this.zzc = i5;
            zzw((zza - i5) - zzC2);
            this.zzc = zza;
        } catch (zzsx e4) {
            this.zzc = i5;
            zzE(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzps(e5);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i5, int i6) {
        zzw((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i5, int i6) {
        zzw(i5 << 3);
        zzw(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i5) {
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
                    throw new zzps(i7, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e5) {
                indexOutOfBoundsException = e5;
                throw new zzps(i7, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i6 = i7 + 1;
        this.zza[i7] = (byte) i5;
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i5, long j2) {
        zzw(i5 << 3);
        zzy(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j2) {
        boolean z4;
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.zzc;
        z4 = zzpv.zzb;
        if (!z4 || this.zzb - i6 < 10) {
            int i7 = i6;
            while ((j2 & (-128)) != 0) {
                try {
                    int i8 = i7 + 1;
                    try {
                        this.zza[i7] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i7 = i8;
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i7 = i8;
                        throw new zzps(i7, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                }
            }
            i5 = i7 + 1;
            try {
                this.zza[i7] = (byte) j2;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i7 = i5;
                throw new zzps(i7, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j2 & (-128)) != 0) {
                zzsw.zzn(this.zza, i6, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i6++;
            }
            i5 = i6 + 1;
            zzsw.zzn(this.zza, i6, (byte) j2);
        }
        this.zzc = i5;
    }
}
