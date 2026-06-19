package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class zziav extends zzias {
    private final OutputStream zzg;

    public zziav(OutputStream outputStream, int i5) {
        super(i5);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzF(int i5) {
        if (this.zzb - this.zzc < i5) {
            zzG();
        }
    }

    private final void zzG() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i5, int i6) {
        zzs((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i5, int i6) {
        zzF(20);
        zzd(i5 << 3);
        if (i6 >= 0) {
            zzd(i6);
        } else {
            zze(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i5, int i6) {
        zzF(20);
        zzd(i5 << 3);
        zzd(i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i5, int i6) {
        zzF(14);
        zzd((i5 << 3) | 5);
        zzf(i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i5, long j2) {
        zzF(20);
        zzd(i5 << 3);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i5, int i6) {
        zzw(bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i5, long j2) {
        zzF(18);
        zzd((i5 << 3) | 1);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i5, boolean z4) {
        zzF(11);
        zzd(i5 << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
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
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b2);
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
        zzF(5);
        zzd(i5);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i5) {
        zzF(4);
        zzf(i5);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j2) {
        zzF(10);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j2) {
        zzF(8);
        zzg(j2);
    }

    public final void zzw(byte[] bArr, int i5, int i6) {
        int i7 = this.zzb;
        int i8 = this.zzc;
        int i9 = i7 - i8;
        if (i9 >= i6) {
            System.arraycopy(bArr, i5, this.zza, i8, i6);
            this.zzc += i6;
            this.zzd += i6;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i5, bArr2, i8, i9);
        int i10 = i5 + i9;
        this.zzc = i7;
        this.zzd += i9;
        zzG();
        int i11 = i6 - i9;
        if (i11 <= i7) {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.zzc = i11;
        } else {
            this.zzg.write(bArr, i10, i11);
        }
        this.zzd += i11;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) {
        int zzc;
        int length = str.length() * 3;
        int zzA = zziaw.zzA(length);
        int i5 = zzA + length;
        int i6 = this.zzb;
        if (i5 > i6) {
            byte[] bArr = new byte[length];
            int zzd = zzier.zzd(str, bArr, 0, length);
            zzs(zzd);
            zzw(bArr, 0, zzd);
            return;
        }
        if (i5 > i6 - this.zzc) {
            zzG();
        }
        int zzA2 = zziaw.zzA(str.length());
        int i7 = this.zzc;
        try {
            if (zzA2 == zzA) {
                int i8 = i7 + zzA2;
                this.zzc = i8;
                int zzd2 = zzier.zzd(str, this.zza, i8, i6 - i8);
                this.zzc = i7;
                zzc = (zzd2 - i7) - zzA2;
                zzd(zzc);
                this.zzc = zzd2;
            } else {
                zzc = zzier.zzc(str);
                zzd(zzc);
                this.zzc = zzier.zzd(str, this.zza, this.zzc, zzc);
            }
            this.zzd += zzc;
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new zziau(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
        if (this.zzc > 0) {
            zzG();
        }
    }
}
