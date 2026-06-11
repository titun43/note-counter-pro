package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzafp {
    private final zzer zza = new zzer(10);

    private final boolean zzb(zzaev zzaevVar, int i5) {
        int i6;
        int i7 = 0;
        do {
            int i8 = i7 % 10;
            if (i8 == 0) {
                if (i7 != 0) {
                    zzer zzerVar = this.zza;
                    System.arraycopy(zzerVar.zzi(), 10, zzerVar.zzi(), 0, 9);
                }
                i6 = 0;
            } else {
                i6 = i8;
            }
            int i9 = i7 != 0 ? 1 : 10;
            try {
                zzer zzerVar2 = this.zza;
                int i10 = i8 + 10;
                zzaevVar.zzi(zzerVar2.zzi(), i10 - i9, i9);
                zzerVar2.zzh(i6);
                zzerVar2.zzf(i10);
                if (zzerVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzafs.zza(zzerVar2.zzr()) != -1) {
                    return false;
                }
                if (i7 == 0) {
                    zzerVar2.zzc(20);
                }
                i7++;
            } catch (EOFException unused) {
            }
        } while (i7 <= i5);
        return false;
    }

    public final zzap zza(zzaev zzaevVar, zzaij zzaijVar, int i5) {
        zzap zzapVar = null;
        int i6 = 0;
        while (zzb(zzaevVar, i5)) {
            zzer zzerVar = this.zza;
            int zzg = zzerVar.zzg();
            zzerVar.zzk(6);
            int zzG = zzerVar.zzG();
            int i7 = zzG + 10;
            if (zzapVar == null) {
                byte[] bArr = new byte[i7];
                System.arraycopy(zzerVar.zzi(), zzg, bArr, 0, 10);
                zzaevVar.zzi(bArr, 10, zzG);
                zzapVar = zzaim.zza(bArr, i7, zzaijVar, new zzahw());
            } else {
                zzaevVar.zzk(zzG);
            }
            i6 += i7;
        }
        zzaevVar.zzl();
        zzaevVar.zzk(i6);
        return zzapVar;
    }
}
