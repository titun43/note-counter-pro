package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaln {
    private final zzalo zza = new zzalo();
    private final zzer zzb = new zzer(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i5) {
        int i6;
        int i7 = 0;
        this.zzd = 0;
        do {
            int i8 = this.zzd;
            int i9 = i5 + i8;
            zzalo zzaloVar = this.zza;
            if (i9 >= zzaloVar.zzc) {
                break;
            }
            this.zzd = i8 + 1;
            i6 = zzaloVar.zzf[i9];
            i7 += i6;
        } while (i6 == 255);
        return i7;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzaev zzaevVar) {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i5 = this.zzc;
            if (i5 < 0) {
                zzalo zzaloVar = this.zza;
                if (!zzaloVar.zzb(zzaevVar, -1L) || !zzaloVar.zzc(zzaevVar, true)) {
                    break;
                }
                int i6 = zzaloVar.zzd;
                if ((zzaloVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i6 += zzf(0);
                    i5 = this.zzd;
                } else {
                    i5 = 0;
                }
                if (!zzaey.zzd(zzaevVar, i6)) {
                    return false;
                }
                this.zzc = i5;
            }
            int zzf = zzf(i5);
            int i7 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzer zzerVar = this.zzb;
                zzerVar.zzc(zzerVar.zze() + zzf);
                if (!zzaey.zzc(zzaevVar, zzerVar.zzi(), zzerVar.zze(), zzf)) {
                    return false;
                }
                zzerVar.zzf(zzerVar.zze() + zzf);
                this.zze = this.zza.zzf[i7 + (-1)] != 255;
            }
            if (i7 == this.zza.zzc) {
                i7 = -1;
            }
            this.zzc = i7;
        }
    }

    public final zzalo zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(65025, zzerVar.zze())), zzerVar.zze());
    }
}
