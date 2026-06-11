package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.emoji2.text.u;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzaqk implements zzaeu {
    private zzaex zza;
    private zzagh zzb;
    private zzaqh zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        return zzaqn.zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
        this.zzb = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        if (r2 == 32) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        int i5;
        this.zzb.getClass();
        String str = zzfj.zza;
        int i6 = this.zzc;
        int i7 = 4;
        if (i6 == 0) {
            zzgrc.zzi(zzaevVar.zzn() == 0);
            int i8 = this.zzf;
            if (i8 != -1) {
                zzaevVar.zzf(i8);
                this.zzc = 4;
                return 0;
            }
            if (!zzaqn.zza(zzaevVar)) {
                throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
            }
            zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
            this.zzc = 1;
            return 0;
        }
        long j2 = -1;
        if (i6 == 1) {
            zzer zzerVar = new zzer(8);
            zzaqm zza = zzaqm.zza(zzaevVar, zzerVar);
            if (zza.zza != 1685272116) {
                zzaevVar.zzl();
            } else {
                zzaevVar.zzk(8);
                zzerVar.zzh(0);
                zzaevVar.zzi(zzerVar.zzi(), 0, 8);
                j2 = zzerVar.zzE();
                zzaevVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j2;
            this.zzc = 2;
            return 0;
        }
        if (i6 == 2) {
            zzaql zzb = zzaqn.zzb(zzaevVar);
            int i9 = zzb.zza;
            if (i9 == 17) {
                this.zze = new zzaqg(this.zza, this.zzb, zzb);
            } else if (i9 == 6) {
                this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i9 == 7) {
                this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i10 = zzb.zze;
                if (i9 != 1) {
                    if (i9 != 3) {
                    }
                    i5 = 0;
                    if (i5 != 0) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 29);
                        sb.append("Unsupported WAV format type: ");
                        sb.append(i9);
                        throw zzat.zzc(sb.toString());
                    }
                    this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/raw", i5);
                }
                i7 = zzfj.zzz(i10, ByteOrder.LITTLE_ENDIAN);
                i5 = i7;
                if (i5 != 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i6 != 3) {
            zzgrc.zzi(this.zzg != -1);
            long zzn = this.zzg - zzaevVar.zzn();
            zzaqh zzaqhVar = this.zze;
            zzaqhVar.getClass();
            return zzaqhVar.zzc(zzaevVar, zzn) ? -1 : 0;
        }
        Pair zzc = zzaqn.zzc(zzaevVar);
        this.zzf = ((Long) zzc.first).intValue();
        long longValue = ((Long) zzc.second).longValue();
        long j5 = this.zzd;
        if (j5 != -1 && longValue == 4294967295L) {
            longValue = j5;
        }
        long j6 = this.zzf + longValue;
        this.zzg = j6;
        long zzo = zzaevVar.zzo();
        if (zzo != -1 && j6 > zzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 29 + String.valueOf(zzo).length());
            u.t(sb2, "Data exceeds input length: ", j6, ", ");
            sb2.append(zzo);
            zzee.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j6 = zzo;
        }
        zzaqh zzaqhVar2 = this.zze;
        zzaqhVar2.getClass();
        zzaqhVar2.zzb(this.zzf, j6);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzc = j2 == 0 ? 0 : 4;
        zzaqh zzaqhVar = this.zze;
        if (zzaqhVar != null) {
            zzaqhVar.zza(j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
