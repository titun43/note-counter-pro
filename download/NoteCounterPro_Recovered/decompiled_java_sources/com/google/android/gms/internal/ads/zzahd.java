package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahd implements zzaef {
    private final zzafh zza;
    private final int zzb;
    private final zzafb zzc = new zzafb();

    public /* synthetic */ zzahd(zzafh zzafhVar, int i5, byte[] bArr) {
        this.zza = zzafhVar;
        this.zzb = i5;
    }

    private final long zzc(zzaev zzaevVar) {
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            zzafh zzafhVar = this.zza;
            int i5 = this.zzb;
            zzafb zzafbVar = this.zzc;
            long zzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i5) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (zzm - zzaevVar.zzn()));
            } else {
                zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 2, 15) + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (zzm - zzaevVar.zzn()));
                if (zzafc.zza(zzerVar, zzafhVar, i5, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j2) {
        long zzn = zzaevVar.zzn();
        long zzc = zzc(zzaevVar);
        long zzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzaevVar);
        return (zzc > j2 || zzc2 <= j2) ? zzc2 <= j2 ? zzaee.zzb(zzc2, zzaevVar.zzm()) : zzaee.zza(zzc, zzn) : zzaee.zzc(zzm);
    }
}
