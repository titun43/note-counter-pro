package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzgo extends zzgr {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzgo(byte[] bArr, int i5, int i6) {
        super(null);
        int length = bArr.length;
        if (((length - i6) | i6) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(u.g(length, i6, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzb(byte b2) {
        int i5 = this.zzd;
        try {
            int i6 = i5 + 1;
            try {
                this.zzb[i5] = b2;
                this.zzd = i6;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                i5 = i6;
                throw new zzgp(i5, this.zzc, 1, e);
            }
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
        }
    }

    public final void zzc(byte[] bArr, int i5, int i6) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i6);
            this.zzd += i6;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgp(this.zzd, this.zzc, i6, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzd(int i5, boolean z4) {
        zzt(i5 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zze(int i5, zzgk zzgkVar) {
        zzt((i5 << 3) | 2);
        zzt(zzgkVar.zzd());
        zzgkVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzf(int i5, int i6) {
        zzt((i5 << 3) | 5);
        zzg(i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzg(int i5) {
        int i6 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i6] = (byte) (i5 & 255);
            bArr[i6 + 1] = (byte) ((i5 >> 8) & 255);
            bArr[i6 + 2] = (byte) ((i5 >> 16) & 255);
            bArr[i6 + 3] = (byte) ((i5 >> 24) & 255);
            this.zzd = i6 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgp(i6, this.zzc, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzh(int i5, long j2) {
        zzt((i5 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzi(long j2) {
        int i5 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i5] = (byte) (((int) j2) & 255);
            bArr[i5 + 1] = (byte) (((int) (j2 >> 8)) & 255);
            bArr[i5 + 2] = (byte) (((int) (j2 >> 16)) & 255);
            bArr[i5 + 3] = (byte) (((int) (j2 >> 24)) & 255);
            bArr[i5 + 4] = (byte) (((int) (j2 >> 32)) & 255);
            bArr[i5 + 5] = (byte) (((int) (j2 >> 40)) & 255);
            bArr[i5 + 6] = (byte) (((int) (j2 >> 48)) & 255);
            bArr[i5 + 7] = (byte) (((int) (j2 >> 56)) & 255);
            this.zzd = i5 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgp(i5, this.zzc, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzj(int i5, int i6) {
        zzt(i5 << 3);
        zzk(i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzk(int i5) {
        if (i5 >= 0) {
            zzt(i5);
        } else {
            zzv(i5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzl(byte[] bArr, int i5, int i6) {
        zzc(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzm(int i5, zzim zzimVar, zzix zzixVar) {
        zzt((i5 << 3) | 2);
        zzt(((zzfv) zzimVar).zze(zzixVar));
        zzixVar.zzi(zzimVar, this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzn(int i5, zzim zzimVar) {
        zzt(11);
        zzs(2, i5);
        zzt(26);
        zzt(zzimVar.zzk());
        zzimVar.zzJ(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzo(int i5, zzgk zzgkVar) {
        zzt(11);
        zzs(2, i5);
        zze(3, zzgkVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzp(int i5, String str) {
        zzt((i5 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i5 = this.zzd;
        try {
            int zzz = zzgr.zzz(str.length() * 3);
            int zzz2 = zzgr.zzz(str.length());
            if (zzz2 != zzz) {
                zzt(zzjt.zzc(str));
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = zzjt.zzb(str, bArr, i6, this.zzc - i6);
                return;
            }
            int i7 = i5 + zzz2;
            this.zzd = i7;
            int zzb = zzjt.zzb(str, this.zzb, i7, this.zzc - i7);
            this.zzd = i5;
            zzt((zzb - i5) - zzz2);
            this.zzd = zzb;
        } catch (zzjs e4) {
            this.zzd = i5;
            zzC(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzgp(e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzr(int i5, int i6) {
        zzt((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzs(int i5, int i6) {
        zzt(i5 << 3);
        zzt(i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzt(int i5) {
        while ((i5 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr[i6] = (byte) ((i5 | 128) & 255);
                i5 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzgp(this.zzd, this.zzc, 1, e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        bArr2[i7] = (byte) i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzu(int i5, long j2) {
        zzt(i5 << 3);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzv(long j2) {
        boolean z4;
        z4 = zzgr.zzc;
        if (!z4 || this.zzc - this.zzd < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    bArr[i5] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzgp(this.zzd, this.zzc, 1, e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            bArr2[i6] = (byte) j2;
            return;
        }
        while (true) {
            int i7 = (int) j2;
            if ((j2 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                zzjq.zzn(bArr3, i8, (byte) i7);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i9 = this.zzd;
            this.zzd = i9 + 1;
            zzjq.zzn(bArr4, i9, (byte) ((i7 | 128) & 255));
            j2 >>>= 7;
        }
    }
}
