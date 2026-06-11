package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzalq extends zzalt {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzer zzerVar) {
        return zzk(zzerVar, zza);
    }

    private static boolean zzk(zzer zzerVar, byte[] bArr) {
        if (zzerVar.zzd() < 8) {
            return false;
        }
        int zzg = zzerVar.zzg();
        byte[] bArr2 = new byte[8];
        zzerVar.zzm(bArr2, 0, 8);
        zzerVar.zzh(zzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z4) {
        super.zza(z4);
        if (z4) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        return zzi(zzafu.zzd(zzerVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar) {
        if (zzk(zzerVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze());
            int i5 = copyOf[9] & 255;
            List zza2 = zzafu.zza(copyOf);
            if (zzalrVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/opus");
            zztVar.zzE(i5);
            zztVar.zzF(48000);
            zztVar.zzp(zza2);
            zzalrVar.zza = zztVar.zzM();
            return true;
        }
        if (!zzk(zzerVar, zzb)) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzalrVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzerVar.zzk(8);
        zzap zzc = zzagn.zzc(zzguf.zzr(zzagn.zzb(zzerVar, false, false).zza));
        if (zzc == null) {
            return true;
        }
        zzt zza3 = zzalrVar.zza.zza();
        zza3.zzk(zzc.zzf(zzalrVar.zza.zzl));
        zzalrVar.zza = zza3.zzM();
        return true;
    }
}
