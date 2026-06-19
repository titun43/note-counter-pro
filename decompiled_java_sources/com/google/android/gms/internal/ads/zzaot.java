package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzaot {
    private final zzagh zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzaot(zzagh zzaghVar, boolean z4, boolean z5) {
        this.zza = zzaghVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzgn(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j2, int i5, long j5, boolean z4) {
        this.zze = i5;
        this.zzg = j5;
        this.zzf = j2;
        this.zzl = z4;
    }

    public final boolean zze(long j2, int i5, boolean z4) {
        boolean z5 = false;
        if (this.zze == 9) {
            if (z4 && this.zzh) {
                long j5 = this.zzf;
                int i6 = i5 + ((int) (j2 - j5));
                long j6 = this.zzj;
                if (j6 != -9223372036854775807L) {
                    long j7 = this.zzi;
                    if (j5 != j7) {
                        this.zza.zze(j6, this.zzk ? 1 : 0, (int) (j5 - j7), i6, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z6 = this.zzl;
        boolean z7 = this.zzk;
        int i7 = this.zze;
        if (i7 == 5 || (z6 && i7 == 1)) {
            z5 = true;
        }
        boolean z8 = z7 | z5;
        this.zzk = z8;
        this.zze = 24;
        return z8;
    }
}
