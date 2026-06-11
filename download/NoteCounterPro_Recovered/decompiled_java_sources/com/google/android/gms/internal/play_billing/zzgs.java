package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
final class zzgs implements zzjw {
    private final zzgr zza;

    private zzgs(zzgr zzgrVar) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgrVar;
        zzgrVar.zza = this;
    }

    public static zzgs zza(zzgr zzgrVar) {
        zzgs zzgsVar = zzgrVar.zza;
        return zzgsVar != null ? zzgsVar : new zzgs(zzgrVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzA(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzib)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzi(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z4) {
            while (i6 < zzibVar.size()) {
                this.zza.zzh(i5, zzibVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibVar.size(); i10++) {
            zzibVar.zze(i10);
            i9 += 8;
        }
        this.zza.zzt(i9);
        while (i6 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzB(int i5, int i6) {
        this.zza.zzs(i5, (i6 >> 31) ^ (i6 + i6));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzC(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    int intValue = ((Integer) list.get(i6)).intValue();
                    zzgrVar.zzs(i5, (intValue >> 31) ^ (intValue + intValue));
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue2 = ((Integer) list.get(i8)).intValue();
                i7 += zzgr.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i6)).intValue();
                zzgrVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                zzgr zzgrVar3 = this.zza;
                int zze = zzhlVar.zze(i6);
                zzgrVar3.zzs(i5, (zze >> 31) ^ (zze + zze));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            int zze2 = zzhlVar.zze(i10);
            i9 += zzgr.zzz((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            zzgr zzgrVar4 = this.zza;
            int zze3 = zzhlVar.zze(i6);
            zzgrVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzD(int i5, long j2) {
        this.zza.zzu(i5, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzE(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzib)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    long longValue = ((Long) list.get(i6)).longValue();
                    zzgrVar.zzu(i5, (longValue >> 63) ^ (longValue + longValue));
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long longValue2 = ((Long) list.get(i8)).longValue();
                i7 += zzgr.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                long longValue3 = ((Long) list.get(i6)).longValue();
                zzgrVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i6++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z4) {
            while (i6 < zzibVar.size()) {
                zzgr zzgrVar3 = this.zza;
                long zze = zzibVar.zze(i6);
                zzgrVar3.zzu(i5, (zze >> 63) ^ (zze + zze));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibVar.size(); i10++) {
            long zze2 = zzibVar.zze(i10);
            i9 += zzgr.zzA((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzt(i9);
        while (i6 < zzibVar.size()) {
            zzgr zzgrVar4 = this.zza;
            long zze3 = zzibVar.zze(i6);
            zzgrVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzF(int i5) {
        this.zza.zzr(i5, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzG(int i5, String str) {
        this.zza.zzp(i5, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzH(int i5, List list) {
        int i6 = 0;
        if (!(list instanceof zzhy)) {
            while (i6 < list.size()) {
                this.zza.zzp(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        while (i6 < list.size()) {
            Object zzc = zzhyVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i5, (String) zzc);
            } else {
                this.zza.zze(i5, (zzgk) zzc);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzI(int i5, int i6) {
        this.zza.zzs(i5, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzJ(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzs(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzgr.zzz(((Integer) list.get(i8)).intValue());
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzt(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                this.zza.zzs(i5, zzhlVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            i9 += zzgr.zzz(zzhlVar.zze(i10));
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            this.zza.zzt(zzhlVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzK(int i5, long j2) {
        this.zza.zzu(i5, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzL(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzib)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzu(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzgr.zzA(((Long) list.get(i8)).longValue());
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzv(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z4) {
            while (i6 < zzibVar.size()) {
                this.zza.zzu(i5, zzibVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibVar.size(); i10++) {
            i9 += zzgr.zzA(zzibVar.zze(i10));
        }
        this.zza.zzt(i9);
        while (i6 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzb(int i5, boolean z4) {
        this.zza.zzd(i5, z4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzc(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzgb)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzd(i5, ((Boolean) list.get(i6)).booleanValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Boolean) list.get(i8)).getClass();
                i7++;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
                i6++;
            }
            return;
        }
        zzgb zzgbVar = (zzgb) list;
        if (!z4) {
            while (i6 < zzgbVar.size()) {
                this.zza.zzd(i5, zzgbVar.zzf(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzgbVar.size(); i10++) {
            zzgbVar.zzf(i10);
            i9++;
        }
        this.zza.zzt(i9);
        while (i6 < zzgbVar.size()) {
            this.zza.zzb(zzgbVar.zzf(i6) ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzd(int i5, zzgk zzgkVar) {
        this.zza.zze(i5, zzgkVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zze(int i5, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zze(i5, (zzgk) list.get(i6));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzf(int i5, double d5) {
        this.zza.zzh(i5, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzg(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzgt)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Double) list.get(i8)).getClass();
                i7 += 8;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        zzgt zzgtVar = (zzgt) list;
        if (!z4) {
            while (i6 < zzgtVar.size()) {
                this.zza.zzh(i5, Double.doubleToRawLongBits(zzgtVar.zze(i6)));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzgtVar.size(); i10++) {
            zzgtVar.zze(i10);
            i9 += 8;
        }
        this.zza.zzt(i9);
        while (i6 < zzgtVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzgtVar.zze(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzh(int i5) {
        this.zza.zzr(i5, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzi(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzj(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzgr.zzA(((Integer) list.get(i8)).intValue());
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzk(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                this.zza.zzj(i5, zzhlVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            i9 += zzgr.zzA(zzhlVar.zze(i10));
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzk(int i5, int i6) {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzl(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzg(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                this.zza.zzf(i5, zzhlVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            zzhlVar.zze(i10);
            i9 += 4;
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzm(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzn(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzib)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzi(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z4) {
            while (i6 < zzibVar.size()) {
                this.zza.zzh(i5, zzibVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibVar.size(); i10++) {
            zzibVar.zze(i10);
            i9 += 8;
        }
        this.zza.zzt(i9);
        while (i6 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzo(int i5, float f5) {
        this.zza.zzf(i5, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzp(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhd)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzf(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Float) list.get(i8)).getClass();
                i7 += 4;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        zzhd zzhdVar = (zzhd) list;
        if (!z4) {
            while (i6 < zzhdVar.size()) {
                this.zza.zzf(i5, Float.floatToRawIntBits(zzhdVar.zze(i6)));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhdVar.size(); i10++) {
            zzhdVar.zze(i10);
            i9 += 4;
        }
        this.zza.zzt(i9);
        while (i6 < zzhdVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzhdVar.zze(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzq(int i5, Object obj, zzix zzixVar) {
        zzgr zzgrVar = this.zza;
        zzgrVar.zzr(i5, 3);
        zzixVar.zzi((zzim) obj, zzgrVar.zza);
        zzgrVar.zzr(i5, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzr(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzs(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzgr.zzA(((Integer) list.get(i8)).intValue());
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzk(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                this.zza.zzj(i5, zzhlVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            i9 += zzgr.zzA(zzhlVar.zze(i10));
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzt(int i5, long j2) {
        this.zza.zzu(i5, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzu(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzib)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzu(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzgr.zzA(((Long) list.get(i8)).longValue());
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzv(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z4) {
            while (i6 < zzibVar.size()) {
                this.zza.zzu(i5, zzibVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibVar.size(); i10++) {
            i9 += zzgr.zzA(zzibVar.zze(i10));
        }
        this.zza.zzt(i9);
        while (i6 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzv(int i5, Object obj, zzix zzixVar) {
        this.zza.zzm(i5, (zzim) obj, zzixVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzw(int i5, Object obj) {
        if (obj instanceof zzgk) {
            this.zza.zzo(i5, (zzgk) obj);
        } else {
            this.zza.zzn(i5, (zzim) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzx(int i5, int i6) {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzy(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzhl)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            this.zza.zzr(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            this.zza.zzt(i7);
            while (i6 < list.size()) {
                this.zza.zzg(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z4) {
            while (i6 < zzhlVar.size()) {
                this.zza.zzf(i5, zzhlVar.zze(i6));
                i6++;
            }
            return;
        }
        this.zza.zzr(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzhlVar.size(); i10++) {
            zzhlVar.zze(i10);
            i9 += 4;
        }
        this.zza.zzt(i9);
        while (i6 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzz(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }
}
