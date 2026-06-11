package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzjk implements zznd {
    private final zzjj zza;

    private zzjk(zzjj zzjjVar) {
        zzkk.zzf(zzjjVar, "output");
        this.zza = zzjjVar;
        zzjjVar.zza = this;
    }

    public static zzjk zza(zzjj zzjjVar) {
        zzjk zzjkVar = zzjjVar.zza;
        return zzjkVar != null ? zzjkVar : new zzjk(zzjjVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzA(int i5, int i6) {
        this.zza.zzp(i5, (i6 >> 31) ^ (i6 + i6));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzB(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                zzjj zzjjVar = this.zza;
                int intValue = ((Integer) list.get(i6)).intValue();
                zzjjVar.zzp(i5, (intValue >> 31) ^ (intValue + intValue));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue2 = ((Integer) list.get(i8)).intValue();
            i7 += zzjj.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            zzjj zzjjVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i6)).intValue();
            zzjjVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzC(int i5, long j2) {
        this.zza.zzr(i5, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzD(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                zzjj zzjjVar = this.zza;
                long longValue = ((Long) list.get(i6)).longValue();
                zzjjVar.zzr(i5, (longValue >> 63) ^ (longValue + longValue));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            long longValue2 = ((Long) list.get(i8)).longValue();
            i7 += zzjj.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            zzjj zzjjVar2 = this.zza;
            long longValue3 = ((Long) list.get(i6)).longValue();
            zzjjVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    @Deprecated
    public final void zzE(int i5) {
        this.zza.zzo(i5, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzF(int i5, String str) {
        this.zza.zzm(i5, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzG(int i5, List list) {
        int i6 = 0;
        if (!(list instanceof zzkr)) {
            while (i6 < list.size()) {
                this.zza.zzm(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        zzkr zzkrVar = (zzkr) list;
        while (i6 < list.size()) {
            Object zzf = zzkrVar.zzf(i6);
            if (zzf instanceof String) {
                this.zza.zzm(i5, (String) zzf);
            } else {
                this.zza.zze(i5, (zzjb) zzf);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzH(int i5, int i6) {
        this.zza.zzp(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzI(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzp(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzjj.zzA(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzq(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzJ(int i5, long j2) {
        this.zza.zzr(i5, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzK(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzr(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzjj.zzB(((Long) list.get(i8)).longValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzb(int i5, boolean z4) {
        this.zza.zzd(i5, z4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzc(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzd(i5, ((Boolean) list.get(i6)).booleanValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Boolean) list.get(i8)).getClass();
            i7++;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzd(int i5, zzjb zzjbVar) {
        this.zza.zze(i5, zzjbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zze(int i5, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zze(i5, (zzjb) list.get(i6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzf(int i5, double d5) {
        this.zza.zzh(i5, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzg(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Double) list.get(i8)).getClass();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    @Deprecated
    public final void zzh(int i5) {
        this.zza.zzo(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzi(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzj(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzjj.zzv(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzk(int i5, int i6) {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzl(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzm(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzn(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzo(int i5, float f5) {
        this.zza.zzf(i5, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzp(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Float) list.get(i8)).getClass();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzq(int i5, Object obj, zzlu zzluVar) {
        zzjj zzjjVar = this.zza;
        zzjjVar.zzo(i5, 3);
        zzluVar.zzi((zzlj) obj, zzjjVar.zza);
        zzjjVar.zzo(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzr(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzs(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzjj.zzv(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzt(int i5, long j2) {
        this.zza.zzr(i5, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzu(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzr(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzjj.zzB(((Long) list.get(i8)).longValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzv(int i5, Object obj, zzlu zzluVar) {
        Object obj2 = (zzlj) obj;
        zzjg zzjgVar = (zzjg) this.zza;
        zzjgVar.zzq((i5 << 3) | 2);
        zzil zzilVar = (zzil) obj2;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        zzjgVar.zzq(zzbu);
        zzluVar.zzi(obj2, zzjgVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzw(int i5, int i6) {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzx(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzy(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzz(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
            i6++;
        }
    }
}
