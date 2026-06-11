package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaor {
    private final zzagh zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaor(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(int i5, long j2) {
        boolean z4;
        this.zze = i5;
        this.zzd = false;
        if (i5 != 182) {
            if (i5 != 179) {
                z4 = false;
                this.zzb = z4;
                this.zzc = i5 == 182;
                this.zzf = 0;
                this.zzh = j2;
            }
            i5 = 179;
        }
        z4 = true;
        this.zzb = z4;
        this.zzc = i5 == 182;
        this.zzf = 0;
        this.zzh = j2;
    }

    public final void zzc(byte[] bArr, int i5, int i6) {
        if (this.zzc) {
            int i7 = this.zzf;
            int i8 = (i5 + 1) - i7;
            if (i8 >= i6) {
                this.zzf = (i6 - i5) + i7;
            } else {
                this.zzd = ((bArr[i8] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzd(long j2, int i5, boolean z4) {
        zzgrc.zzi(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z4 && this.zzb) {
            this.zza.zze(this.zzh, this.zzd ? 1 : 0, (int) (j2 - this.zzg), i5, null);
        }
        if (this.zze != 179) {
            this.zzg = j2;
        }
    }
}
