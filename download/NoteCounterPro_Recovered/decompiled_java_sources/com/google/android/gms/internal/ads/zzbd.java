package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzbd {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzc zzg = zzc.zza;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zza, zzbdVar.zza) && Objects.equals(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd && this.zzf == zzbdVar.zzf && Objects.equals(this.zzg, zzbdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j2 = this.zzd;
        return this.zzg.hashCode() + (((((hashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final zzbd zza(Object obj, Object obj2, int i5, long j2, long j5, zzc zzcVar, boolean z4) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i5;
        this.zzd = j2;
        this.zze = 0L;
        this.zzg = zzcVar;
        this.zzf = z4;
        return this;
    }

    public final int zzb() {
        int i5 = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i5) {
        long j2 = this.zzg.zza(i5).zza;
        return 0L;
    }

    public final int zzd(int i5) {
        return this.zzg.zza(i5).zza(-1);
    }

    public final int zze(long j2) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j2) {
        return -1;
    }

    public final int zzg(int i5) {
        return this.zzg.zza(i5).zzb;
    }

    public final long zzh(int i5, int i6) {
        zza zza = this.zzg.zza(i5);
        if (zza.zzb != -1) {
            return zza.zzf[i6];
        }
        return -9223372036854775807L;
    }

    public final boolean zzi(int i5) {
        zzb();
        if (i5 != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j2 = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i5) {
        boolean z4 = this.zzg.zza(i5).zzj;
        return false;
    }
}
