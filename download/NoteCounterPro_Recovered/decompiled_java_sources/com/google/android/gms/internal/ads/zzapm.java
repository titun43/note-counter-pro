package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzapm implements zzaeu {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzapi zzi;
    private zzaex zzj;
    private boolean zzk;
    private final zzfg zza = new zzfg(0);
    private final zzer zzc = new zzer(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzapj zzd = new zzapj();

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        byte[] bArr = new byte[14];
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaelVar.zzj(bArr[13] & 7, false);
        zzaelVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzj = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        zzaon zzaopVar;
        zzaex zzaexVar = this.zzj;
        zzaexVar.getClass();
        long zzo = zzaevVar.zzo();
        if (zzo != -1) {
            zzapj zzapjVar = this.zzd;
            if (!zzapjVar.zza()) {
                return zzapjVar.zzc(zzaevVar, zzafvVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzapj zzapjVar2 = this.zzd;
            if (zzapjVar2.zzd() != -9223372036854775807L) {
                zzapi zzapiVar = new zzapi(zzapjVar2.zzb(), zzapjVar2.zzd(), zzo);
                this.zzi = zzapiVar;
                this.zzj.zzw(zzapiVar.zza());
            } else {
                zzaexVar.zzw(new zzafx(zzapjVar2.zzd(), 0L));
            }
        }
        zzapi zzapiVar2 = this.zzi;
        if (zzapiVar2 != null && zzapiVar2.zzc()) {
            return zzapiVar2.zzd(zzaevVar, zzafvVar);
        }
        zzaevVar.zzl();
        long zzm = zzo != -1 ? zzo - zzaevVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            return -1;
        }
        zzer zzerVar = this.zzc;
        if (!zzaevVar.zzh(zzerVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzerVar.zzh(0);
        int zzB = zzerVar.zzB();
        if (zzB == 441) {
            return -1;
        }
        if (zzB == 442) {
            zzaevVar.zzi(zzerVar.zzi(), 0, 10);
            zzerVar.zzh(9);
            zzaevVar.zzf((zzerVar.zzs() & 7) + 14);
            return 0;
        }
        if (zzB == 443) {
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            zzerVar.zzh(0);
            zzaevVar.zzf(zzerVar.zzt() + 6);
            return 0;
        }
        if ((zzB >> 8) != 1) {
            zzaevVar.zzf(1);
            return 0;
        }
        int i5 = zzB & 255;
        SparseArray sparseArray = this.zzb;
        zzapk zzapkVar = (zzapk) sparseArray.get(i5);
        if (!this.zze) {
            if (zzapkVar == null) {
                zzaon zzaonVar = null;
                if (i5 == 189) {
                    zzaopVar = new zzaod(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaevVar.zzn();
                } else if ((zzB & 224) == 192) {
                    zzaopVar = new zzaoz(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaevVar.zzn();
                } else {
                    if ((zzB & 240) == 224) {
                        zzaopVar = new zzaop(null, "video/mp2p");
                        this.zzg = true;
                        this.zzh = zzaevVar.zzn();
                    }
                    if (zzaonVar != null) {
                        zzaonVar.zzb(this.zzj, new zzaqb(Integer.MIN_VALUE, i5, 256));
                        zzapkVar = new zzapk(zzaonVar, this.zza);
                        sparseArray.put(i5, zzapkVar);
                    }
                }
                zzaonVar = zzaopVar;
                if (zzaonVar != null) {
                }
            }
            long j2 = 1048576;
            if (this.zzf && this.zzg) {
                j2 = 8192 + this.zzh;
            }
            if (zzaevVar.zzn() > j2) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        zzerVar.zzh(0);
        int zzt = zzerVar.zzt() + 6;
        if (zzapkVar == null) {
            zzaevVar.zzf(zzt);
        } else {
            zzerVar.zza(zzt);
            zzaevVar.zzc(zzerVar.zzi(), 0, zzt);
            zzerVar.zzh(6);
            zzapkVar.zzb(zzerVar);
            zzerVar.zzf(zzerVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j2, long j5) {
        zzapi zzapiVar;
        int i5;
        SparseArray sparseArray;
        zzfg zzfgVar = this.zza;
        if (zzfgVar.zzc() != -9223372036854775807L) {
            long zza = zzfgVar.zza();
            if (zza != -9223372036854775807L) {
                if (zza != 0) {
                }
            }
            zzapiVar = this.zzi;
            i5 = 0;
            if (zzapiVar != null) {
                zzapiVar.zzb(j5);
            }
            while (true) {
                sparseArray = this.zzb;
                if (i5 < sparseArray.size()) {
                    return;
                }
                ((zzapk) sparseArray.valueAt(i5)).zza();
                i5++;
            }
        }
        zzfgVar.zzd(j5);
        zzapiVar = this.zzi;
        i5 = 0;
        if (zzapiVar != null) {
        }
        while (true) {
            sparseArray = this.zzb;
            if (i5 < sparseArray.size()) {
            }
            ((zzapk) sparseArray.valueAt(i5)).zza();
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
