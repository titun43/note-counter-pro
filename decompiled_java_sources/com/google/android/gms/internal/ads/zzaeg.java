package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzaeg {
    protected final zzaea zza;
    protected final zzaef zzb;
    protected zzaec zzc;
    private final int zzd;

    public zzaeg(zzaed zzaedVar, zzaef zzaefVar, long j2, long j5, long j6, long j7, long j8, long j9, int i5) {
        this.zzb = zzaefVar;
        this.zzd = i5;
        this.zza = new zzaea(zzaedVar, j2, 0L, j6, j7, j8, j9);
    }

    public static final int zzf(zzaev zzaevVar, long j2, zzafv zzafvVar) {
        if (j2 == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.zza = j2;
        return 1;
    }

    public static final boolean zzg(zzaev zzaevVar, long j2) {
        long zzn = j2 - zzaevVar.zzn();
        if (zzn < 0 || zzn > 262144) {
            return false;
        }
        zzaevVar.zzf((int) zzn);
        return true;
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final void zzb(long j2) {
        zzaec zzaecVar = this.zzc;
        if (zzaecVar == null || zzaecVar.zze() != j2) {
            zzaea zzaeaVar = this.zza;
            this.zzc = new zzaec(j2, zzaeaVar.zzd(j2), 0L, zzaeaVar.zze(), zzaeaVar.zzf(), zzaeaVar.zzg(), zzaeaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        while (true) {
            zzaec zzaecVar = this.zzc;
            zzaecVar.getClass();
            long zzb = zzaecVar.zzb();
            long zzc = zzaecVar.zzc();
            long zzh = zzaecVar.zzh();
            if (zzc - zzb <= this.zzd) {
                zze(false, zzb);
                return zzf(zzaevVar, zzb, zzafvVar);
            }
            if (!zzg(zzaevVar, zzh)) {
                return zzf(zzaevVar, zzh, zzafvVar);
            }
            zzaevVar.zzl();
            zzaee zza = this.zzb.zza(zzaevVar, zzaecVar.zzd());
            int zzd = zza.zzd();
            if (zzd == -3) {
                zze(false, zzh);
                return zzf(zzaevVar, zzh, zzafvVar);
            }
            if (zzd == -2) {
                zzaecVar.zzf(zza.zze(), zza.zzf());
            } else {
                if (zzd != -1) {
                    zzg(zzaevVar, zza.zzf());
                    zze(true, zza.zzf());
                    return zzf(zzaevVar, zza.zzf(), zzafvVar);
                }
                zzaecVar.zzg(zza.zze(), zza.zzf());
            }
        }
    }

    public final void zze(boolean z4, long j2) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
