package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcq implements zzcr {
    final /* synthetic */ zzct zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    public zzcq(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new float[zzctVar.zzh()];
        this.zzc = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new float[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(float[] fArr, int i5, int i6, int i7) {
        int i8 = 255;
        int i9 = 0;
        double d5 = 0.0d;
        double d6 = 1.0d;
        int i10 = i6;
        while (true) {
            double d7 = i8;
            double d8 = i9;
            if (i10 > i7) {
                this.zzf = d6 / d8;
                this.zzg = d5 / d7;
                return i9;
            }
            int i11 = 0;
            double d9 = 0.0d;
            while (i11 < i10) {
                int zzg = this.zza.zzg() * i5;
                d9 += Math.abs(fArr[zzg + i11] - fArr[(zzg + i10) + i11]);
                i11++;
                i8 = i8;
            }
            int i12 = i8;
            double d10 = d8 * d9;
            double d11 = i10;
            double d12 = d6 * d11;
            if (d10 < d12) {
                d6 = d9;
            }
            if (d10 < d12) {
                i9 = i10;
            }
            double d13 = d7 * d9;
            double d14 = d11 * d5;
            if (d13 > d14) {
                d5 = d9;
            }
            i8 = d13 > d14 ? i10 : i12;
            i10++;
        }
    }

    private final float[] zzt(float[] fArr, int i5, int i6) {
        zzct zzctVar = this.zza;
        int length = fArr.length / zzctVar.zzg();
        return i5 + i6 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i6) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i5, long j2, long j5) {
        int i6 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i6 >= zzctVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int zzg = zzctVar.zzg();
            int zzj = zzctVar.zzj();
            float[] fArr2 = this.zze;
            int zzg2 = (zzctVar.zzg() * i5) + i6;
            long zzl = (zzctVar.zzl() + 1) * j5;
            long zzm = zzl - (zzctVar.zzm() * j2);
            long zzl2 = zzl - (zzctVar.zzl() * j5);
            fArr[(zzj * zzg) + i6] = ((zzm * fArr2[zzg2]) + ((zzl2 - zzm) * fArr2[zzg2 + zzctVar.zzg()])) / zzl2;
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        double d5 = this.zzf;
        return d5 != 0.0d && this.zza.zzn() != 0 && this.zzg <= d5 * 3.0d && d5 + d5 > this.zzh * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i5, int i6) {
        int zzg;
        int i7 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i7 >= zzctVar.zzh() / i6) {
                return;
            }
            double d5 = 0.0d;
            int i8 = 0;
            while (true) {
                zzg = zzctVar.zzg() * i6;
                if (i8 < zzg) {
                    d5 += this.zzc[(zzg * i7) + (zzctVar.zzg() * i5) + i8];
                    i8++;
                }
            }
            this.zzb[i7] = (float) (d5 / zzg);
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
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i5, int i6, int i7, int i8, int i9) {
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i8 * i6) + i10;
            int i12 = (i9 * i6) + i10;
            int i13 = (i7 * i6) + i10;
            for (int i14 = 0; i14 < i5; i14++) {
                fArr[i13] = ((fArr2[i12] * i14) + (fArr2[i11] * (i5 - i14))) / i5;
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
            this.zzc[i5 + i7] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i5) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i5 / 4);
        byteBuffer.position(byteBuffer.position() + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i5) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzctVar.zzg() * i5);
        byteBuffer.position((i5 * 4 * zzctVar.zzg()) + byteBuffer.position());
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
