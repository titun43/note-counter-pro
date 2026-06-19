package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzalk extends zzalt {
    private zzafh zza;
    private zzalj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z4) {
        super.zza(z4);
        if (z4) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        if (!zzd(zzerVar.zzi())) {
            return -1L;
        }
        int i5 = (zzerVar.zzi()[2] & 255) >> 4;
        if (i5 != 6) {
            if (i5 == 7) {
                i5 = 7;
            }
            int zzc = zzafc.zzc(zzerVar, i5);
            zzerVar.zzh(0);
            return zzc;
        }
        zzerVar.zzk(4);
        zzerVar.zzO();
        int zzc2 = zzafc.zzc(zzerVar, i5);
        zzerVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar) {
        byte[] zzi = zzerVar.zzi();
        zzafh zzafhVar = this.zza;
        if (zzafhVar == null) {
            zzafh zzafhVar2 = new zzafh(zzi, 17);
            this.zza = zzafhVar2;
            zzt zza = zzafhVar2.zzc(Arrays.copyOfRange(zzi, 9, zzerVar.zze()), null).zza();
            zza.zzl("audio/ogg");
            zzalrVar.zza = zza.zzM();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            zzafg zzc = zzafe.zzc(zzerVar);
            zzafh zze = zzafhVar.zze(zzc);
            this.zza = zze;
            this.zzb = new zzalj(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        zzalj zzaljVar = this.zzb;
        if (zzaljVar != null) {
            zzaljVar.zzd(j2);
            zzalrVar.zzb = this.zzb;
        }
        zzalrVar.zza.getClass();
        return false;
    }
}
