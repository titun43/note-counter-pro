package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class zzii extends zzbf {
    private final int zzb;
    private final zzyf zzc;

    public zzii(boolean z4, zzyf zzyfVar) {
        this.zzc = zzyfVar;
        this.zzb = zzyfVar.zza();
    }

    private final int zzw(int i5, boolean z4) {
        if (z4) {
            return this.zzc.zzb(i5);
        }
        if (i5 >= this.zzb - 1) {
            return -1;
        }
        return i5 + 1;
    }

    private final int zzx(int i5, boolean z4) {
        if (z4) {
            return this.zzc.zzc(i5);
        }
        if (i5 <= 0) {
            return -1;
        }
        return i5 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j2) {
        int zzq = zzq(i5);
        int zzu = zzu(zzq);
        int zzt = zzt(zzq);
        zzs(zzq).zzb(i5 - zzu, zzbeVar, j2);
        Object zzv = zzv(zzq);
        if (!zzbe.zza.equals(zzbeVar.zzb)) {
            zzv = Pair.create(zzv, zzbeVar.zzb);
        }
        zzbeVar.zzb = zzv;
        zzbeVar.zzn += zzt;
        zzbeVar.zzo += zzt;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z4) {
        int zzp = zzp(i5);
        int zzu = zzu(zzp);
        zzs(zzp).zzd(i5 - zzt(zzp), zzbdVar, z4);
        zzbdVar.zzc += zzu;
        if (z4) {
            Object zzv = zzv(zzp);
            Object obj = zzbdVar.zzb;
            obj.getClass();
            zzbdVar.zzb = Pair.create(zzv, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        int zze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzr = zzr(obj2);
            if (zzr != -1 && (zze = zzs(zzr).zze(obj3)) != -1) {
                return zzt(zzr) + zze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i5) {
        int zzp = zzp(i5);
        return Pair.create(zzv(zzp), zzs(zzp).zzf(i5 - zzt(zzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzh(int i5, int i6, boolean z4) {
        int zzq = zzq(i5);
        int zzu = zzu(zzq);
        int zzh = zzs(zzq).zzh(i5 - zzu, i6 == 2 ? 0 : i6, z4);
        if (zzh != -1) {
            return zzu + zzh;
        }
        int zzw = zzw(zzq, z4);
        while (zzw != -1 && zzs(zzw).zzg()) {
            zzw = zzw(zzw, z4);
        }
        if (zzw != -1) {
            return zzs(zzw).zzk(z4) + zzu(zzw);
        }
        if (i6 == 2) {
            return zzk(z4);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzi(int i5, int i6, boolean z4) {
        int zzq = zzq(i5);
        int zzu = zzu(zzq);
        int zzi = zzs(zzq).zzi(i5 - zzu, 0, false);
        if (zzi != -1) {
            return zzu + zzi;
        }
        int zzx = zzx(zzq, false);
        while (zzx != -1 && zzs(zzx).zzg()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzs(zzx).zzj(false) + zzu(zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzj(boolean z4) {
        int i5 = this.zzb;
        if (i5 != 0) {
            int zzd = z4 ? this.zzc.zzd() : i5 - 1;
            while (zzs(zzd).zzg()) {
                zzd = zzx(zzd, z4);
                if (zzd == -1) {
                }
            }
            return zzs(zzd).zzj(z4) + zzu(zzd);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzk(boolean z4) {
        if (this.zzb != 0) {
            int zze = z4 ? this.zzc.zze() : 0;
            while (zzs(zze).zzg()) {
                zze = zzw(zze, z4);
                if (zze == -1) {
                }
            }
            return zzs(zze).zzk(z4) + zzu(zze);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzo(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzr = zzr(obj2);
        int zzu = zzu(zzr);
        zzs(zzr).zzo(obj3, zzbdVar);
        zzbdVar.zzc += zzu;
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    public abstract int zzp(int i5);

    public abstract int zzq(int i5);

    public abstract int zzr(Object obj);

    public abstract zzbf zzs(int i5);

    public abstract int zzt(int i5);

    public abstract int zzu(int i5);

    public abstract Object zzv(int i5);
}
