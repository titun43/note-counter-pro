package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzagi {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzaev zzaevVar) {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaevVar.zzi(bArr, 0, 10);
        zzaevVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzagh zzaghVar, long j2, int i5, int i6, int i7, zzagg zzaggVar) {
        zzgrc.zzj(this.zzg <= i6 + i7, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i8 = this.zzc;
            int i9 = i8 + 1;
            this.zzc = i9;
            if (i8 == 0) {
                this.zzd = j2;
                this.zze = i5;
                this.zzf = 0;
            }
            this.zzf += i6;
            this.zzg = i7;
            if (i9 >= 16) {
                zzd(zzaghVar, zzaggVar);
            }
        }
    }

    public final void zzd(zzagh zzaghVar, zzagg zzaggVar) {
        if (this.zzc > 0) {
            zzaghVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzaggVar);
            this.zzc = 0;
        }
    }
}
