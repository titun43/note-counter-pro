package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzxw {
    private final zzaan zza;
    private final zzer zzb = new zzer(32);
    private zzxv zzc;
    private zzxv zzd;
    private zzxv zze;
    private long zzf;

    public zzxw(zzaan zzaanVar) {
        this.zza = zzaanVar;
        zzxv zzxvVar = new zzxv(0L, 65536);
        this.zzc = zzxvVar;
        this.zzd = zzxvVar;
        this.zze = zzxvVar;
    }

    private final int zzi(int i5) {
        zzxv zzxvVar = this.zze;
        if (zzxvVar.zzc == null) {
            zzaal zza = this.zza.zza();
            zzxv zzxvVar2 = new zzxv(this.zze.zzb, 65536);
            zzxvVar.zzc = zza;
            zzxvVar.zzd = zzxvVar2;
        }
        return Math.min(i5, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i5) {
        long j2 = this.zzf + i5;
        this.zzf = j2;
        zzxv zzxvVar = this.zze;
        if (j2 == zzxvVar.zzb) {
            this.zze = zzxvVar.zzd;
        }
    }

    private static zzxv zzk(zzxv zzxvVar, zzih zzihVar, zzxx zzxxVar, zzer zzerVar) {
        zzxv zzxvVar2;
        if (zzihVar.zzk()) {
            long j2 = zzxxVar.zzb;
            int i5 = 1;
            zzerVar.zza(1);
            zzxv zzm = zzm(zzxvVar, j2, zzerVar.zzi(), 1);
            long j5 = j2 + 1;
            byte b2 = zzerVar.zzi()[0];
            int i6 = b2 & 128;
            int i7 = b2 & Byte.MAX_VALUE;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i6 != 0;
            zzxvVar2 = zzm(zzm, j5, zzieVar.zza, i7);
            long j6 = j5 + i7;
            if (z4) {
                zzerVar.zza(2);
                zzxvVar2 = zzm(zzxvVar2, j6, zzerVar.zzi(), 2);
                j6 += 2;
                i5 = zzerVar.zzt();
            }
            int i8 = i5;
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < i8) {
                iArr = new int[i8];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < i8) {
                iArr3 = new int[i8];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i9 = i8 * 6;
                zzerVar.zza(i9);
                zzxvVar2 = zzm(zzxvVar2, j6, zzerVar.zzi(), i9);
                j6 += i9;
                zzerVar.zzh(0);
                for (int i10 = 0; i10 < i8; i10++) {
                    iArr2[i10] = zzerVar.zzt();
                    iArr4[i10] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxxVar.zza - ((int) (j6 - zzxxVar.zzb));
            }
            zzagg zzaggVar = zzxxVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(i8, iArr2, iArr4, zzaggVar.zzb, zzieVar.zza, zzaggVar.zza, zzaggVar.zzc, zzaggVar.zzd);
            long j7 = zzxxVar.zzb;
            int i11 = (int) (j6 - j7);
            zzxxVar.zzb = j7 + i11;
            zzxxVar.zza -= i11;
        } else {
            zzxvVar2 = zzxvVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxxVar.zza);
            return zzl(zzxvVar2, zzxxVar.zzb, zzihVar.zzc, zzxxVar.zza);
        }
        zzerVar.zza(4);
        zzxv zzm2 = zzm(zzxvVar2, zzxxVar.zzb, zzerVar.zzi(), 4);
        int zzH = zzerVar.zzH();
        zzxxVar.zzb += 4;
        zzxxVar.zza -= 4;
        zzihVar.zzj(zzH);
        zzxv zzl = zzl(zzm2, zzxxVar.zzb, zzihVar.zzc, zzH);
        zzxxVar.zzb += zzH;
        int i12 = zzxxVar.zza - zzH;
        zzxxVar.zza = i12;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            zzihVar.zzf = ByteBuffer.allocate(i12);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzl, zzxxVar.zzb, zzihVar.zzf, zzxxVar.zza);
    }

    private static zzxv zzl(zzxv zzxvVar, long j2, ByteBuffer byteBuffer, int i5) {
        zzxv zzn = zzn(zzxvVar, j2);
        while (i5 > 0) {
            int min = Math.min(i5, (int) (zzn.zzb - j2));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j2), min);
            i5 -= min;
            j2 += min;
            if (j2 == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzxv zzm(zzxv zzxvVar, long j2, byte[] bArr, int i5) {
        zzxv zzn = zzn(zzxvVar, j2);
        int i6 = i5;
        while (i6 > 0) {
            int min = Math.min(i6, (int) (zzn.zzb - j2));
            System.arraycopy(zzn.zzc.zza, zzn.zzb(j2), bArr, i5 - i6, min);
            i6 -= min;
            j2 += min;
            if (j2 == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzxv zzn(zzxv zzxvVar, long j2) {
        while (j2 >= zzxvVar.zzb) {
            zzxvVar = zzxvVar.zzd;
        }
        return zzxvVar;
    }

    public final void zza() {
        zzxv zzxvVar = this.zzc;
        if (zzxvVar.zzc != null) {
            this.zza.zzc(zzxvVar);
            zzxvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxv zzxvVar2 = this.zzc;
        this.zzd = zzxvVar2;
        this.zze = zzxvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzih zzihVar, zzxx zzxxVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxx zzxxVar) {
        zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zze(long j2) {
        zzxv zzxvVar;
        if (j2 != -1) {
            while (true) {
                zzxvVar = this.zzc;
                if (j2 < zzxvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxvVar.zza) {
                this.zzd = zzxvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i5, boolean z4) {
        int zzi = zzi(i5);
        zzxv zzxvVar = this.zze;
        int zza = zzjVar.zza(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzer zzerVar, int i5) {
        while (i5 > 0) {
            int zzi = zzi(i5);
            zzxv zzxvVar = this.zze;
            zzerVar.zzm(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), zzi);
            i5 -= zzi;
            zzj(zzi);
        }
    }
}
