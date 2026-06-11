package com.google.android.gms.internal.consent_sdk;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class zzpt extends zzpq {
    private final OutputStream zzg;

    public zzpt(OutputStream outputStream, int i5) {
        super(i5);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzG() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i5) {
        if (this.zzb - this.zzc < i5) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b2) {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i5, boolean z4) {
        zzH(11);
        zzf(i5 << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i5, int i6) {
        zzw(i6);
        zzz(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i5, int i6) {
        zzz(bArr, 0, i6);
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
        zzH(14);
        zzf((i5 << 3) | 5);
        zzd(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i5) {
        zzH(4);
        zzd(i5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i5, long j2) {
        zzH(18);
        zzf((i5 << 3) | 1);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j2) {
        zzH(8);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i5, int i6) {
        zzH(20);
        zzf(i5 << 3);
        if (i6 >= 0) {
            zzf(i6);
        } else {
            zzg(i6);
        }
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
        int zzb;
        try {
            int length = str.length() * 3;
            int zzC = zzpv.zzC(length);
            int i5 = zzC + length;
            int i6 = this.zzb;
            if (i5 > i6) {
                byte[] bArr = new byte[length];
                int zza = zzsy.zza(str, bArr, 0, length);
                zzw(zza);
                zzz(bArr, 0, zza);
                return;
            }
            if (i5 > i6 - this.zzc) {
                zzG();
            }
            int zzC2 = zzpv.zzC(str.length());
            int i7 = this.zzc;
            try {
                if (zzC2 == zzC) {
                    int i8 = i7 + zzC2;
                    this.zzc = i8;
                    int zza2 = zzsy.zza(str, this.zza, i8, i6 - i8);
                    this.zzc = i7;
                    zzb = (zza2 - i7) - zzC2;
                    zzf(zzb);
                    this.zzc = zza2;
                } else {
                    zzb = zzsy.zzb(str);
                    zzf(zzb);
                    this.zzc = zzsy.zza(str, this.zza, this.zzc, zzb);
                }
                this.zzd += zzb;
            } catch (zzsx e4) {
                this.zzd -= this.zzc - i7;
                this.zzc = i7;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new zzps(e5);
            }
        } catch (zzsx e6) {
            zzE(str, e6);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i5, int i6) {
        zzw((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i5, int i6) {
        zzH(20);
        zzf(i5 << 3);
        zzf(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i5) {
        zzH(5);
        zzf(i5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i5, long j2) {
        zzH(20);
        zzf(i5 << 3);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j2) {
        zzH(10);
        zzg(j2);
    }

    public final void zzz(byte[] bArr, int i5, int i6) {
        int i7 = this.zzb;
        int i8 = this.zzc;
        int i9 = i7 - i8;
        if (i9 >= i6) {
            System.arraycopy(bArr, 0, this.zza, i8, i6);
            this.zzc += i6;
            this.zzd += i6;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i8, i9);
        this.zzc = i7;
        this.zzd += i9;
        zzG();
        int i10 = i6 - i9;
        if (i10 <= i7) {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.zzc = i10;
        } else {
            this.zzg.write(bArr, i9, i10);
        }
        this.zzd += i10;
    }
}
