package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zziax implements zzieu {
    private final zziaw zza;

    private zziax(zziaw zziawVar) {
        zzice.zza(zziawVar, "output");
        this.zza = zziawVar;
        zziawVar.zze = this;
    }

    public static zziax zza(zziaw zziawVar) {
        Object obj = zziawVar.zze;
        return obj != null ? (zziax) obj : new zziax(zziawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzA(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzicq)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzv(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z4) {
            while (i6 < zzicqVar.size()) {
                this.zza.zzh(i5, zzicqVar.zzc(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzicqVar.size(); i10++) {
            zzicqVar.zzc(i10);
            i9 += 8;
        }
        zziawVar2.zzs(i9);
        while (i6 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzB(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibi)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzK(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Float) list.get(i8)).getClass();
                i7 += 4;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzt(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        zzibi zzibiVar = (zzibi) list;
        if (!z4) {
            while (i6 < zzibiVar.size()) {
                this.zza.zzK(i5, Float.floatToRawIntBits(zzibiVar.zzf(i6)));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibiVar.size(); i10++) {
            zzibiVar.zzf(i10);
            i9 += 4;
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibiVar.size()) {
            zziawVar2.zzt(Float.floatToRawIntBits(zzibiVar.zzf(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzC(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zziay)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Double) list.get(i8)).getClass();
                i7 += 8;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        zziay zziayVar = (zziay) list;
        if (!z4) {
            while (i6 < zziayVar.size()) {
                this.zza.zzh(i5, Double.doubleToRawLongBits(zziayVar.zzf(i6)));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zziayVar.size(); i10++) {
            zziayVar.zzf(i10);
            i9 += 8;
        }
        zziawVar2.zzs(i9);
        while (i6 < zziayVar.size()) {
            zziawVar2.zzv(Double.doubleToRawLongBits(zziayVar.zzf(i6)));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzD(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzI(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zziaw.zzB(((Integer) list.get(i8)).intValue());
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                this.zza.zzI(i5, zzibsVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            i9 += zziaw.zzB(zzibsVar.zzf(i10));
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzE(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zziad)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzi(i5, ((Boolean) list.get(i6)).booleanValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Boolean) list.get(i8)).getClass();
                i7++;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzq(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
                i6++;
            }
            return;
        }
        zziad zziadVar = (zziad) list;
        if (!z4) {
            while (i6 < zziadVar.size()) {
                this.zza.zzi(i5, zziadVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zziadVar.size(); i10++) {
            zziadVar.zzf(i10);
            i9++;
        }
        zziawVar2.zzs(i9);
        while (i6 < zziadVar.size()) {
            zziawVar2.zzq(zziadVar.zzf(i6) ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzF(int i5, List list) {
        int i6 = 0;
        if (!(list instanceof zzicn)) {
            while (i6 < list.size()) {
                this.zza.zzj(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        zzicn zzicnVar = (zzicn) list;
        while (i6 < list.size()) {
            Object zzc = zzicnVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzj(i5, (String) zzc);
            } else {
                this.zza.zzk(i5, (zzian) zzc);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzG(int i5, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzk(i5, (zzian) list.get(i6));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzH(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzJ(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zziaw.zzA(((Integer) list.get(i8)).intValue());
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzs(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                this.zza.zzJ(i5, zzibsVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            i9 += zziaw.zzA(zzibsVar.zzf(i10));
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibsVar.size()) {
            zziawVar2.zzs(zzibsVar.zzf(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzI(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzK(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                this.zza.zzK(i5, zzibsVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            zzibsVar.zzf(i10);
            i9 += 4;
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzJ(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzicq)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Long) list.get(i8)).getClass();
                i7 += 8;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzv(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z4) {
            while (i6 < zzicqVar.size()) {
                this.zza.zzh(i5, zzicqVar.zzc(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzicqVar.size(); i10++) {
            zzicqVar.zzc(i10);
            i9 += 8;
        }
        zziawVar2.zzs(i9);
        while (i6 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzK(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zziaw zziawVar = this.zza;
                    int intValue = ((Integer) list.get(i6)).intValue();
                    zziawVar.zzJ(i5, (intValue >> 31) ^ (intValue + intValue));
                    i6++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue2 = ((Integer) list.get(i8)).intValue();
                i7 += zziaw.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zziawVar2.zzs(i7);
            while (i6 < list.size()) {
                int intValue3 = ((Integer) list.get(i6)).intValue();
                zziawVar2.zzs((intValue3 >> 31) ^ (intValue3 + intValue3));
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                zziaw zziawVar3 = this.zza;
                int zzf = zzibsVar.zzf(i6);
                zziawVar3.zzJ(i5, (zzf >> 31) ^ (zzf + zzf));
                i6++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            int zzf2 = zzibsVar.zzf(i10);
            i9 += zziaw.zzA((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zziawVar4.zzs(i9);
        while (i6 < zzibsVar.size()) {
            int zzf3 = zzibsVar.zzf(i6);
            zziawVar4.zzs((zzf3 >> 31) ^ (zzf3 + zzf3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzL(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzicq)) {
            if (!z4) {
                while (i6 < list.size()) {
                    zziaw zziawVar = this.zza;
                    long longValue = ((Long) list.get(i6)).longValue();
                    zziawVar.zzL(i5, (longValue >> 63) ^ (longValue + longValue));
                    i6++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long longValue2 = ((Long) list.get(i8)).longValue();
                i7 += zziaw.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zziawVar2.zzs(i7);
            while (i6 < list.size()) {
                long longValue3 = ((Long) list.get(i6)).longValue();
                zziawVar2.zzu((longValue3 >> 63) ^ (longValue3 + longValue3));
                i6++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z4) {
            while (i6 < zzicqVar.size()) {
                zziaw zziawVar3 = this.zza;
                long zzc = zzicqVar.zzc(i6);
                zziawVar3.zzL(i5, (zzc >> 63) ^ (zzc + zzc));
                i6++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzicqVar.size(); i10++) {
            long zzc2 = zzicqVar.zzc(i10);
            i9 += zziaw.zzB((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zziawVar4.zzs(i9);
        while (i6 < zzicqVar.size()) {
            long zzc3 = zzicqVar.zzc(i6);
            zziawVar4.zzu((zzc3 >> 63) ^ (zzc3 + zzc3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzM(int i5, zzicu zzicuVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            zziawVar.zzs(zzicv.zzc(zzicuVar, entry.getKey(), entry.getValue()));
            zzicv.zzb(zziawVar, zzicuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzb(int i5, int i6) {
        this.zza.zzK(i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzc(int i5, long j2) {
        this.zza.zzL(i5, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzd(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zze(int i5, float f5) {
        this.zza.zzK(i5, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzf(int i5, double d5) {
        this.zza.zzh(i5, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzg(int i5, int i6) {
        this.zza.zzI(i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzh(int i5, long j2) {
        this.zza.zzL(i5, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzi(int i5, int i6) {
        this.zza.zzI(i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzj(int i5, long j2) {
        this.zza.zzh(i5, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzk(int i5, int i6) {
        this.zza.zzK(i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzl(int i5, boolean z4) {
        this.zza.zzi(i5, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzm(int i5, String str) {
        this.zza.zzj(i5, str);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzn(int i5, zzian zzianVar) {
        this.zza.zzk(i5, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzo(int i5, int i6) {
        this.zza.zzJ(i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzp(int i5, int i6) {
        this.zza.zzJ(i5, (i6 >> 31) ^ (i6 + i6));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzq(int i5, long j2) {
        this.zza.zzL(i5, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzr(int i5, Object obj, zzidu zziduVar) {
        zziaw zziawVar = this.zza;
        zzhzw zzhzwVar = (zzhzw) obj;
        zziawVar.zzH(i5, 2);
        zziawVar.zzs(zzhzwVar.zzaT(zziduVar));
        zziduVar.zzf(zzhzwVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzs(int i5, Object obj, zzidu zziduVar) {
        zziaw zziawVar = this.zza;
        zziawVar.zzH(i5, 3);
        zziduVar.zzf((zzhzw) obj, this);
        zziawVar.zzH(i5, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzt(int i5) {
        this.zza.zzH(i5, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzu(int i5) {
        this.zza.zzH(i5, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzv(int i5, Object obj) {
        if (obj instanceof zzian) {
            this.zza.zzo(i5, (zzian) obj);
        } else {
            this.zza.zzn(i5, (zzidc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzw(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzI(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zziaw.zzB(((Integer) list.get(i8)).intValue());
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                this.zza.zzI(i5, zzibsVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            i9 += zziaw.zzB(zzibsVar.zzf(i10));
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzx(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzibs)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzK(i5, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((Integer) list.get(i8)).getClass();
                i7 += 4;
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z4) {
            while (i6 < zzibsVar.size()) {
                this.zza.zzK(i5, zzibsVar.zzf(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzibsVar.size(); i10++) {
            zzibsVar.zzf(i10);
            i9 += 4;
        }
        zziawVar2.zzs(i9);
        while (i6 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzy(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzicq)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzL(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zziaw.zzB(((Long) list.get(i8)).longValue());
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzu(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z4) {
            while (i6 < zzicqVar.size()) {
                this.zza.zzL(i5, zzicqVar.zzc(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzicqVar.size(); i10++) {
            i9 += zziaw.zzB(zzicqVar.zzc(i10));
        }
        zziawVar2.zzs(i9);
        while (i6 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzz(int i5, List list, boolean z4) {
        int i6 = 0;
        if (!(list instanceof zzicq)) {
            if (!z4) {
                while (i6 < list.size()) {
                    this.zza.zzL(i5, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i5, 2);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                i7 += zziaw.zzB(((Long) list.get(i8)).longValue());
            }
            zziawVar.zzs(i7);
            while (i6 < list.size()) {
                zziawVar.zzu(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z4) {
            while (i6 < zzicqVar.size()) {
                this.zza.zzL(i5, zzicqVar.zzc(i6));
                i6++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i5, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < zzicqVar.size(); i10++) {
            i9 += zziaw.zzB(zzicqVar.zzc(i10));
        }
        zziawVar2.zzs(i9);
        while (i6 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i6));
            i6++;
        }
    }
}
