package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaph implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();

    public /* synthetic */ zzaph(zzfg zzfgVar, byte[] bArr) {
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j2) {
        int zzh;
        long zzn = zzaevVar.zzn();
        int min = (int) Math.min(20000L, zzaevVar.zzo() - zzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(min);
        zzaevVar.zzi(zzerVar.zzi(), 0, min);
        int i5 = -1;
        int i6 = -1;
        long j5 = -9223372036854775807L;
        while (zzerVar.zzd() >= 4) {
            if (zzapi.zzh(zzerVar.zzi(), zzerVar.zzg()) != 442) {
                zzerVar.zzk(1);
            } else {
                zzerVar.zzk(4);
                long zze = zzapj.zze(zzerVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j2) {
                        return j5 == -9223372036854775807L ? zzaee.zza(zze2, zzn) : zzaee.zzc(zzn + i6);
                    }
                    if (100000 + zze2 > j2) {
                        return zzaee.zzc(zzn + zzerVar.zzg());
                    }
                    i6 = zzerVar.zzg();
                    j5 = zze2;
                }
                int zze3 = zzerVar.zze();
                if (zzerVar.zzd() >= 10) {
                    zzerVar.zzk(9);
                    int zzs = zzerVar.zzs() & 7;
                    if (zzerVar.zzd() >= zzs) {
                        zzerVar.zzk(zzs);
                        if (zzerVar.zzd() >= 4) {
                            if (zzapi.zzh(zzerVar.zzi(), zzerVar.zzg()) == 443) {
                                zzerVar.zzk(4);
                                int zzt = zzerVar.zzt();
                                if (zzerVar.zzd() < zzt) {
                                    zzerVar.zzh(zze3);
                                } else {
                                    zzerVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzerVar.zzd() < 4 || (zzh = zzapi.zzh(zzerVar.zzi(), zzerVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzerVar.zzk(4);
                                if (zzerVar.zzd() < 2) {
                                    zzerVar.zzh(zze3);
                                    break;
                                }
                                zzerVar.zzh(Math.min(zzerVar.zze(), zzerVar.zzg() + zzerVar.zzt()));
                            }
                        } else {
                            zzerVar.zzh(zze3);
                        }
                    } else {
                        zzerVar.zzh(zze3);
                    }
                } else {
                    zzerVar.zzh(zze3);
                }
                i5 = zzerVar.zzg();
            }
        }
        return j5 != -9223372036854775807L ? zzaee.zzb(j5, zzn + i5) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
