package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i5, int i6, float f5, float f6, int i7, boolean z4) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = f5;
        this.zzd = f6;
        this.zze = i5 / i7;
        this.zzf = i5 / 400;
        int i8 = i5 / 65;
        this.zzg = i8;
        this.zzh = i8 + i8;
        this.zzi = z4 ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i5, int i6) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i6);
        Object zzr = zzcrVar.zzr();
        Object zzq = zzcrVar.zzq();
        int i7 = this.zzk;
        int i8 = this.zzb;
        System.arraycopy(zzr, i5 * i8, zzq, i7 * i8, i6 * i8);
        this.zzk += i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzp() {
        float f5;
        int i5;
        int i6;
        double d5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f6;
        int i12;
        int i13;
        long j2;
        long j5;
        float f7 = this.zzc;
        float f8 = this.zzd;
        double d6 = f7 / f8;
        int i14 = this.zzk;
        int i15 = 0;
        int i16 = 1;
        if (d6 > 1.0000100135803223d || d6 < 0.9999899864196777d) {
            int i17 = this.zzj;
            int i18 = this.zzh;
            if (i17 >= i18) {
                int i19 = 0;
                while (true) {
                    int i20 = this.zzo;
                    if (i20 > 0) {
                        int min = Math.min(i18, i20);
                        zzo(i19, min);
                        this.zzo -= min;
                        i19 += min;
                        f5 = f8;
                        d5 = d6;
                        i7 = i16;
                        i8 = i18;
                        i9 = i14;
                    } else {
                        int i21 = this.zza;
                        int i22 = i21 > 4000 ? i21 / 4000 : i16;
                        int i23 = this.zzb;
                        if (i23 == i16) {
                            if (i22 == i16) {
                                i5 = this.zzi.zzf(i19, this.zzf, this.zzg);
                                f5 = f8;
                                i6 = i16;
                                zzcr zzcrVar = this.zzi;
                                int i24 = !zzcrVar.zzc() ? this.zzp : i5;
                                int i25 = i19 + i24;
                                zzcrVar.zzi();
                                this.zzp = i5;
                                double d7 = i24;
                                if (d6 <= 1.0d) {
                                    double d8 = d6 - 1.0d;
                                    if (d6 >= 2.0d) {
                                        i7 = i16;
                                        i8 = i18;
                                        double d9 = (d7 / d8) + this.zzq;
                                        int round = (int) Math.round(d9);
                                        d5 = d6;
                                        this.zzq = d9 - round;
                                        i11 = round;
                                    } else {
                                        d5 = d6;
                                        i7 = i16;
                                        i8 = i18;
                                        double d10 = ((d7 * (2.0d - d5)) / d8) + this.zzq;
                                        int round2 = (int) Math.round(d10);
                                        this.zzo = round2;
                                        this.zzq = d10 - round2;
                                        i11 = i24;
                                    }
                                    zzcrVar.zzk(i11);
                                    zzcrVar.zzh(i11, i6, this.zzk, i19, i25);
                                    this.zzk += i11;
                                    i9 = i14;
                                    i19 = i24 + i11 + i19;
                                } else {
                                    d5 = d6;
                                    i7 = i16;
                                    i8 = i18;
                                    double d11 = 1.0d - d5;
                                    if (d5 < 0.5d) {
                                        double d12 = ((d7 * d5) / d11) + this.zzq;
                                        int round3 = (int) Math.round(d12);
                                        this.zzq = d12 - round3;
                                        i9 = i14;
                                        i10 = round3;
                                    } else {
                                        i9 = i14;
                                        double d13 = ((d7 * ((d5 + d5) - 1.0d)) / d11) + this.zzq;
                                        int round4 = (int) Math.round(d13);
                                        this.zzo = round4;
                                        this.zzq = d13 - round4;
                                        i10 = i24;
                                    }
                                    int i26 = i24 + i10;
                                    zzcrVar.zzk(i26);
                                    System.arraycopy(zzcrVar.zzr(), i19 * i6, zzcrVar.zzq(), this.zzk * i6, i24 * i6);
                                    int i27 = i19;
                                    zzcrVar.zzh(i10, i6, this.zzk + i24, i25, i27);
                                    this.zzk += i26;
                                    i19 = i27 + i10;
                                }
                            } else {
                                i23 = i16;
                            }
                        }
                        zzcr zzcrVar2 = this.zzi;
                        zzcrVar2.zzd(i19, i22);
                        int i28 = this.zzf;
                        int i29 = this.zzg;
                        f5 = f8;
                        int zze = zzcrVar2.zze(i15, i28 / i22, i29 / i22);
                        if (i22 != i16) {
                            int i30 = zze * i22;
                            int i31 = i22 * 4;
                            int i32 = i30 - i31;
                            if (i32 >= i28) {
                                i28 = i32;
                            }
                            int i33 = i30 + i31;
                            if (i33 <= i29) {
                                i29 = i33;
                            }
                            if (i23 == i16) {
                                i5 = zzcrVar2.zzf(i19, i28, i29);
                            } else {
                                zzcrVar2.zzd(i19, i16);
                                i5 = zzcrVar2.zze(i15, i28, i29);
                            }
                        } else {
                            i5 = zze;
                        }
                        i6 = i23;
                        zzcr zzcrVar3 = this.zzi;
                        if (!zzcrVar3.zzc()) {
                        }
                        int i252 = i19 + i24;
                        zzcrVar3.zzi();
                        this.zzp = i5;
                        double d72 = i24;
                        if (d6 <= 1.0d) {
                        }
                    }
                    if (i19 + i8 > i17) {
                        break;
                    }
                    i14 = i9;
                    f8 = f5;
                    i16 = i7;
                    i18 = i8;
                    d6 = d5;
                    i15 = 0;
                }
                int i34 = this.zzj - i19;
                zzcr zzcrVar4 = this.zzi;
                int i35 = this.zzb;
                System.arraycopy(zzcrVar4.zzr(), i19 * i35, zzcrVar4.zzr(), 0, i35 * i34);
                this.zzj = i34;
                f6 = this.zze * f5;
                if (f6 != 1.0f || this.zzk == i9) {
                }
                int i36 = this.zza;
                long j6 = i36;
                long j7 = (long) (i36 / f6);
                while (j7 != 0 && j6 != 0 && j7 % 2 == 0 && j6 % 2 == 0) {
                    j7 /= 2;
                    j6 /= 2;
                }
                int i37 = this.zzk - i9;
                zzcr zzcrVar5 = this.zzi;
                zzcrVar5.zzl(i37);
                int i38 = this.zzb;
                System.arraycopy(zzcrVar5.zzq(), i9 * i38, zzcrVar5.zzp(), this.zzl * i38, i37 * i38);
                this.zzk = i9;
                this.zzl += i37;
                int i39 = 0;
                while (true) {
                    i12 = this.zzl - 1;
                    if (i39 >= i12) {
                        break;
                    }
                    while (true) {
                        i13 = this.zzm + 1;
                        j2 = i13;
                        long j8 = j2 * j7;
                        j5 = this.zzn;
                        if (j8 <= j5 * j6) {
                            break;
                        }
                        int i40 = i7;
                        zzcrVar5.zzk(i40);
                        zzcrVar5.zzb(i39, j6, j7);
                        this.zzn += i40;
                        this.zzk += i40;
                    }
                    int i41 = i7;
                    this.zzm = i13;
                    if (j2 == j6) {
                        this.zzm = 0;
                        zzgrc.zzi(j5 == j7 ? i41 : 0);
                        this.zzn = 0;
                    }
                    i39++;
                    i7 = i41;
                }
                if (i12 != 0) {
                    System.arraycopy(zzcrVar5.zzp(), i12 * i38, zzcrVar5.zzp(), 0, (this.zzl - i12) * i38);
                    this.zzl -= i12;
                    return;
                }
                return;
            }
        } else {
            zzo(0, this.zzj);
            this.zzj = 0;
        }
        f5 = f8;
        i9 = i14;
        i7 = 1;
        f6 = this.zze * f5;
        if (f6 != 1.0f) {
        }
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int remaining = byteBuffer.remaining();
        int zza = remaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(zza);
        zzcrVar.zzn(byteBuffer, remaining);
        this.zzj += zza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i5 = this.zzb;
        int remaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int min = Math.min(remaining / (zzcrVar.zza() * i5), this.zzk);
        zzcrVar.zzo(byteBuffer, min);
        this.zzk -= min;
        System.arraycopy(zzcrVar.zzq(), min * i5, zzcrVar.zzq(), 0, this.zzk * i5);
    }

    public final void zzd() {
        int i5 = this.zzj;
        int i6 = this.zzo;
        int i7 = this.zzk;
        float f5 = this.zzc;
        float f6 = this.zzd;
        int i8 = i7 + ((int) (((((((i5 - i6) / (f5 / f6)) + i6) + this.zzq) + this.zzl) / (this.zze * f6)) + 0.5d));
        this.zzq = 0.0d;
        int i9 = this.zzh;
        int i10 = i9 + i9;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i5 + i10);
        zzcrVar.zzm(i5 * this.zzb, i10);
        this.zzj += i10;
        zzp();
        if (this.zzk > i8) {
            this.zzk = Math.max(i8, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    public final /* synthetic */ int zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzh;
    }

    public final /* synthetic */ int zzi() {
        return this.zzj;
    }

    public final /* synthetic */ int zzj() {
        return this.zzk;
    }

    public final /* synthetic */ int zzk() {
        return this.zzl;
    }

    public final /* synthetic */ int zzl() {
        return this.zzm;
    }

    public final /* synthetic */ int zzm() {
        return this.zzn;
    }

    public final /* synthetic */ int zzn() {
        return this.zzp;
    }
}
