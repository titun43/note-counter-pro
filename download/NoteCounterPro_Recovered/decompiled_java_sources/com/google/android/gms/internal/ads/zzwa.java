package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class zzwa implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvz zzc;
    private final byte[] zzd;
    private int zze;

    public zzwa(zzhb zzhbVar, int i5, zzvz zzvzVar) {
        zzgrc.zza(i5 > 0);
        this.zza = zzhbVar;
        this.zzb = i5;
        this.zzc = zzvzVar;
        this.zzd = new byte[1];
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        int i7 = this.zze;
        if (i7 == 0) {
            zzhb zzhbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i8 = 0;
            if (zzhbVar.zza(bArr2, 0, 1) != -1) {
                int i9 = (bArr2[0] & 255) << 4;
                if (i9 != 0) {
                    byte[] bArr3 = new byte[i9];
                    int i10 = i9;
                    while (i10 > 0) {
                        int zza = zzhbVar.zza(bArr3, i8, i10);
                        if (zza != -1) {
                            i8 += zza;
                            i10 -= zza;
                        }
                    }
                    while (i9 > 0) {
                        int i11 = i9 - 1;
                        if (bArr3[i11] != 0) {
                            break;
                        }
                        i9 = i11;
                    }
                    if (i9 > 0) {
                        this.zzc.zza(new zzer(bArr3, i9));
                    }
                }
                i7 = this.zzb;
                this.zze = i7;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i5, Math.min(i7, i6));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return this.zza.zzj();
    }
}
