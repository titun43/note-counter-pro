package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcid implements zzlj {
    private final zzaat zza = new zzaat(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        int i5;
        this.zzf = 0;
        for (zzaac zzaacVar : zzaacVarArr) {
            if (zzaacVar != null) {
                int i6 = this.zzf;
                int i7 = zzaacVar.zza().zzc;
                if (i7 == 0) {
                    i5 = 144310272;
                } else if (i7 == 1) {
                    i5 = 13107200;
                } else if (i7 != 2) {
                    i5 = 131072;
                    if (i7 != 3 && i7 != 5 && i7 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i5 = 131072000;
                }
                this.zzf = i6 + i5;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        long j2 = zzliVar.zze;
        boolean z4 = true;
        char c5 = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i5 = this.zzf;
        if (c5 != 2 && (c5 != 1 || !this.zzg || zzg >= i5)) {
            z4 = false;
        }
        this.zzg = z4;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long j2 = zzliVar.zzg ? this.zze : this.zzd;
        return j2 <= 0 || zzliVar.zze >= j2;
    }

    public final synchronized void zzk(int i5) {
        this.zzb = i5 * 1000;
    }

    public final synchronized void zzl(int i5) {
        this.zzc = i5 * 1000;
    }

    public final synchronized void zzm(int i5) {
        this.zzd = i5 * 1000;
    }

    public final synchronized void zzn(int i5) {
        this.zze = i5 * 1000;
    }

    public final void zzo(boolean z4) {
        this.zzf = 0;
        this.zzg = false;
        if (z4) {
            this.zza.zze();
        }
    }
}
