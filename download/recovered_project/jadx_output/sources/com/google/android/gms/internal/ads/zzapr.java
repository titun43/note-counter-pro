package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapr(int i5, zzfg zzfgVar, int i6) {
        this.zzc = i5;
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j2) {
        int zza;
        int zza2;
        long zzn = zzaevVar.zzn();
        int min = (int) Math.min(112800L, zzaevVar.zzo() - zzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(min);
        zzaevVar.zzi(zzerVar.zzi(), 0, min);
        int zze = zzerVar.zze();
        long j5 = -1;
        long j6 = -9223372036854775807L;
        long j7 = -1;
        while (zzerVar.zzd() >= 188 && (zza2 = (zza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzaqd.zzb(zzerVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j2) {
                    return j6 == -9223372036854775807L ? zzaee.zza(zze2, zzn) : zzaee.zzc(zzn + j7);
                }
                j7 = zza;
                if (100000 + zze2 > j2) {
                    return zzaee.zzc(zzn + j7);
                }
                j6 = zze2;
            }
            zzerVar.zzh(zza2);
            j5 = zza2;
        }
        return j6 != -9223372036854775807L ? zzaee.zzb(j6, zzn + j5) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
