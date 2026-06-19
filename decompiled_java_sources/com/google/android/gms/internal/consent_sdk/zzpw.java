package com.google.android.gms.internal.consent_sdk;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzpw implements zztb {
    private final zzpv zza;

    private zzpw(zzpv zzpvVar) {
        byte[] bArr = zzqs.zzb;
        this.zza = zzpvVar;
        zzpvVar.zze = this;
    }

    public static zzpw zza(zzpv zzpvVar) {
        Object obj = zzpvVar.zze;
        return obj != null ? (zzpw) obj : new zzpw(zzpvVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzA(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzre)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzl(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z4) {
            while (i6 < zzreVar.size()) {
                this.zza.zzl(i5, zzreVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzreVar.size(); i10++) {
            zzreVar.zze(i10);
            i9 += 8;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzB(int i5, int i6) {
        this.zza.zzv(i5, (i6 >> 31) ^ (i6 + i6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzC(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    int intValue = ((Integer) list.get(i6)).intValue();
                    zzpvVar.zzv(i5, (intValue >> 31) ^ (intValue + intValue));
                    i6++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue2 = ((Integer) list.get(i8)).intValue();
                i7 += zzpv.zzC((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzpvVar2.zzw(i7);
            while (i6 < list.size()) {
                int intValue3 = ((Integer) list.get(i6)).intValue();
                zzpvVar2.zzw((intValue3 >> 31) ^ (intValue3 + intValue3));
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                zzpv zzpvVar3 = this.zza;
                int zze = zzqnVar.zze(i6);
                zzpvVar3.zzv(i5, (zze >> 31) ^ (zze + zze));
                i6++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            int zze2 = zzqnVar.zze(i10);
            i9 += zzpv.zzC((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i9);
        while (i6 < zzqnVar.size()) {
            int zze3 = zzqnVar.zze(i6);
            zzpvVar4.zzw((zze3 >> 31) ^ (zze3 + zze3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzD(int i5, long j2) {
        this.zza.zzx(i5, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzE(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzre)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    long longValue = ((Long) list.get(i6)).longValue();
                    zzpvVar.zzx(i5, (longValue >> 63) ^ (longValue + longValue));
                    i6++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long longValue2 = ((Long) list.get(i8)).longValue();
                i7 += zzpv.zzD((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzpvVar2.zzw(i7);
            while (i6 < list.size()) {
                long longValue3 = ((Long) list.get(i6)).longValue();
                zzpvVar2.zzy((longValue3 >> 63) ^ (longValue3 + longValue3));
                i6++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z4) {
            while (i6 < zzreVar.size()) {
                zzpv zzpvVar3 = this.zza;
                long zze = zzreVar.zze(i6);
                zzpvVar3.zzx(i5, (zze >> 63) ^ (zze + zze));
                i6++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzreVar.size(); i10++) {
            long zze2 = zzreVar.zze(i10);
            i9 += zzpv.zzD((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i9);
        while (i6 < zzreVar.size()) {
            long zze3 = zzreVar.zze(i6);
            zzpvVar4.zzy((zze3 >> 63) ^ (zze3 + zze3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzF(int i5, String str) {
        this.zza.zzs(i5, str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzG(int i5, List list) {
        int i6 = 0;
        if (!(list instanceof zzrb)) {
            while (i6 < list.size()) {
                this.zza.zzs(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        zzrb zzrbVar = (zzrb) list;
        while (i6 < list.size()) {
            Object zza = zzrbVar.zza();
            if (zza instanceof String) {
                this.zza.zzs(i5, (String) zza);
            } else {
                this.zza.zzh(i5, (zzpm) zza);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzH(int i5, int i6) {
        this.zza.zzv(i5, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzI(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzv(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzpv.zzC(((Integer) list.get(i8)).intValue());
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzw(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                this.zza.zzv(i5, zzqnVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            i9 += zzpv.zzC(zzqnVar.zze(i10));
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqnVar.size()) {
            zzpvVar2.zzw(zzqnVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzJ(int i5, long j2) {
        this.zza.zzx(i5, j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzK(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzre)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzx(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzpv.zzD(((Long) list.get(i8)).longValue());
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z4) {
            while (i6 < zzreVar.size()) {
                this.zza.zzx(i5, zzreVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzreVar.size(); i10++) {
            i9 += zzpv.zzD(zzreVar.zze(i10));
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzb(int i5, boolean z4) {
        this.zza.zzK(i5, z4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzc(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzpd)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzK(i5, ((Boolean) list.get(i6)).booleanValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Boolean) list.get(i8)).getClass();
                i7++;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzJ(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
                i6++;
            }
            return;
        }
        zzpd zzpdVar = (zzpd) list;
        if (!z4) {
            while (i6 < zzpdVar.size()) {
                this.zza.zzK(i5, zzpdVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzpdVar.size(); i10++) {
            zzpdVar.zze(i10);
            i9++;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzpdVar.size()) {
            zzpvVar2.zzJ(zzpdVar.zze(i6) ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzd(int i5, zzpm zzpmVar) {
        this.zza.zzh(i5, zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zze(int i5, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzh(i5, (zzpm) list.get(i6));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzf(int i5, double d5) {
        this.zza.zzl(i5, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzg(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzpx)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzl(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Double) list.get(i8)).getClass();
                i7 += 8;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        zzpx zzpxVar = (zzpx) list;
        if (!z4) {
            while (i6 < zzpxVar.size()) {
                this.zza.zzl(i5, Double.doubleToRawLongBits(zzpxVar.zze(i6)));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzpxVar.size(); i10++) {
            zzpxVar.zze(i10);
            i9 += 8;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzpxVar.size()) {
            zzpvVar2.zzm(Double.doubleToRawLongBits(zzpxVar.zze(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzh(int i5, int i6) {
        this.zza.zzn(i5, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzi(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzn(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzpv.zzD(((Integer) list.get(i8)).intValue());
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                this.zza.zzn(i5, zzqnVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            i9 += zzpv.zzD(zzqnVar.zze(i10));
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzj(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzk(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                this.zza.zzj(i5, zzqnVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            zzqnVar.zze(i10);
            i9 += 4;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzl(int i5, long j2) {
        this.zza.zzl(i5, j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzm(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzre)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzl(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z4) {
            while (i6 < zzreVar.size()) {
                this.zza.zzl(i5, zzreVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzreVar.size(); i10++) {
            zzreVar.zze(i10);
            i9 += 8;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzn(int i5, float f5) {
        this.zza.zzj(i5, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzo(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqh)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzj(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Float) list.get(i8)).getClass();
                i7 += 4;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        zzqh zzqhVar = (zzqh) list;
        if (!z4) {
            while (i6 < zzqhVar.size()) {
                this.zza.zzj(i5, Float.floatToRawIntBits(zzqhVar.zze(i6)));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqhVar.size(); i10++) {
            zzqhVar.zze(i10);
            i9 += 4;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqhVar.size()) {
            zzpvVar2.zzk(Float.floatToRawIntBits(zzqhVar.zze(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzp(int i5, Object obj, zzsa zzsaVar) {
        zzpv zzpvVar = this.zza;
        zzpvVar.zzu(i5, 3);
        zzsaVar.zzf((zzpa) obj, this);
        zzpvVar.zzu(i5, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzq(int i5, int i6) {
        this.zza.zzn(i5, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzr(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzn(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzpv.zzD(((Integer) list.get(i8)).intValue());
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                this.zza.zzn(i5, zzqnVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            i9 += zzpv.zzD(zzqnVar.zze(i10));
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzs(int i5, long j2) {
        this.zza.zzx(i5, j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzt(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzre)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzx(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zzpv.zzD(((Long) list.get(i8)).longValue());
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z4) {
            while (i6 < zzreVar.size()) {
                this.zza.zzx(i5, zzreVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzreVar.size(); i10++) {
            i9 += zzpv.zzD(zzreVar.zze(i10));
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzu(int i5, zzri zzriVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            zzpvVar.zzw(zzrj.zzb(zzriVar, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzqf.zzi(zzpvVar, zzriVar.zza, 1, key);
            zzqf.zzi(zzpvVar, zzriVar.zzb, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzv(int i5, Object obj, zzsa zzsaVar) {
        zzpv zzpvVar = this.zza;
        zzpa zzpaVar = (zzpa) obj;
        zzpvVar.zzu(i5, 2);
        zzpvVar.zzw(zzpaVar.zzj(zzsaVar));
        zzsaVar.zzf(zzpaVar, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzw(int i5, Object obj) {
        if (obj instanceof zzpm) {
            this.zza.zzr(i5, (zzpm) obj);
        } else {
            this.zza.zzq(i5, (zzrq) obj);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzx(int i5, int i6) {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzy(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzqn)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            zzpvVar.zzw(i7);
            while (i6 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z4) {
            while (i6 < zzqnVar.size()) {
                this.zza.zzj(i5, zzqnVar.zze(i6));
                i6++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzqnVar.size(); i10++) {
            zzqnVar.zze(i10);
            i9 += 4;
        }
        zzpvVar2.zzw(i9);
        while (i6 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzz(int i5, long j2) {
        this.zza.zzl(i5, j2);
    }
}
