package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcs implements zzcr {
    final /* synthetic */ zzct zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzcs(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new short[zzctVar.zzh()];
        this.zzc = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new short[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(short[] sArr, int i5, int i6, int i7) {
        int i8 = 1;
        int i9 = 255;
        int i10 = 0;
        int i11 = 0;
        while (i6 <= i7) {
            int i12 = 0;
            for (int i13 = 0; i13 < i6; i13++) {
                int zzg = this.zza.zzg() * i5;
                i12 += Math.abs(sArr[zzg + i13] - sArr[(zzg + i6) + i13]);
            }
            int i14 = i12 * i10;
            int i15 = i8 * i6;
            if (i14 < i15) {
                i8 = i12;
            }
            if (i14 < i15) {
                i10 = i6;
            }
            int i16 = i12 * i9;
            int i17 = i11 * i6;
            if (i16 > i17) {
                i11 = i12;
            }
            if (i16 > i17) {
                i9 = i6;
            }
            i6++;
        }
        this.zzf = i8 / i10;
        this.zzg = i11 / i9;
        return i10;
    }

    private final short[] zzt(short[] sArr, int i5, int i6) {
        zzct zzctVar = this.zza;
        int length = sArr.length / zzctVar.zzg();
        return i5 + i6 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i6) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i5, long j2, long j5) {
        int i6 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i6 >= zzctVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int zzg = zzctVar.zzg();
            int zzj = zzctVar.zzj();
            short[] sArr2 = this.zze;
            int zzg2 = (zzctVar.zzg() * i5) + i6;
            short s5 = sArr2[zzg2];
            short s6 = sArr2[zzg2 + zzctVar.zzg()];
            long zzm = zzctVar.zzm() * j2;
            long zzl = zzctVar.zzl() * j5;
            long zzl2 = (zzctVar.zzl() + 1) * j5;
            int i7 = i6;
            long j6 = zzl2 - zzl;
            long j7 = zzl2 - zzm;
            sArr[(zzj * zzg) + i7] = (short) ((((j6 - j7) * s6) + (j7 * s5)) / j6);
            i6 = i7 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        int i5 = this.zzf;
        return i5 != 0 && this.zza.zzn() != 0 && this.zzg <= i5 * 3 && i5 + i5 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i5, int i6) {
        int zzg;
        short[] sArr = this.zzc;
        int i7 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i7 >= zzctVar.zzh() / i6) {
                return;
            }
            int i8 = 0;
            int i9 = 0;
            while (true) {
                zzg = zzctVar.zzg() * i6;
                if (i8 < zzg) {
                    i9 += sArr[(zzg * i7) + (zzctVar.zzg() * i5) + i8];
                    i8++;
                }
            }
            this.zzb[i7] = (short) (i9 / zzg);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zze(int i5, int i6, int i7) {
        return zzs(this.zzb, 0, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzf(int i5, int i6, int i7) {
        return zzs(this.zzc, i5, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i5, int i6, int i7, int i8, int i9) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i8 * i6) + i10;
            int i12 = (i9 * i6) + i10;
            int i13 = (i7 * i6) + i10;
            for (int i14 = 0; i14 < i5; i14++) {
                sArr[i13] = (short) (((sArr2[i12] * i14) + ((i5 - i14) * sArr2[i11])) / i5);
                i13 += i6;
                i11 += i6;
                i12 += i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzj(int i5) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzk(int i5) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzl(int i5) {
        this.zze = zzt(this.zze, this.zza.zzk(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzm(int i5, int i6) {
        for (int i7 = 0; i7 < this.zza.zzg() * i6; i7++) {
            this.zzc[i5 + i7] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i5) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i5 / 2);
        byteBuffer.position(byteBuffer.position() + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i5) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzctVar.zzg() * i5);
        byteBuffer.position(((i5 + i5) * zzctVar.zzg()) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
