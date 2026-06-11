package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzams {
    private final zzer zza = new zzer();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i5;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzer zzerVar = this.zza;
        if (zzerVar.zze() == 0 || zzerVar.zzg() != zzerVar.zze() || !this.zzc) {
            return null;
        }
        zzerVar.zzh(0);
        int i6 = this.zzh * this.zzi;
        int[] iArr = new int[i6];
        int i7 = 0;
        while (i7 < i6) {
            int zzs = zzerVar.zzs();
            if (zzs != 0) {
                i5 = i7 + 1;
                iArr[i7] = this.zzb[zzs];
            } else {
                int zzs2 = zzerVar.zzs();
                if (zzs2 != 0) {
                    int i8 = zzs2 & 63;
                    if ((zzs2 & 64) != 0) {
                        i8 = (i8 << 8) | zzerVar.zzs();
                    }
                    i5 = i8 + i7;
                    Arrays.fill(iArr, i7, i5, (zzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzerVar.zzs()]);
                }
            }
            i7 = i5;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzer zzerVar, int i5) {
        if (i5 % 5 != 2) {
            return;
        }
        zzerVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i6 = 0;
        for (int i7 = i5 / 5; i6 < i7; i7 = i7) {
            int zzs = zzerVar.zzs();
            int zzs2 = zzerVar.zzs();
            int zzs3 = zzerVar.zzs();
            int zzs4 = zzerVar.zzs();
            double d5 = zzs2;
            int zzs5 = zzerVar.zzs() << 24;
            String str = zzfj.zza;
            double d6 = zzs3 - 128;
            double d7 = zzs4 - 128;
            iArr[zzs] = (Math.max(0, Math.min((int) ((1.402d * d6) + d5), 255)) << 16) | zzs5 | (Math.max(0, Math.min((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d7 * 1.772d) + d5), 255));
            i6++;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzer zzerVar, int i5) {
        int zzx;
        if (i5 < 4) {
            return;
        }
        zzerVar.zzk(3);
        int i6 = i5 - 4;
        if ((zzerVar.zzs() & 128) != 0) {
            if (i6 < 7 || (zzx = zzerVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzerVar.zzt();
            this.zzi = zzerVar.zzt();
            this.zza.zza(zzx - 4);
            i6 = i5 - 11;
        }
        zzer zzerVar2 = this.zza;
        int zzg = zzerVar2.zzg();
        int zze = zzerVar2.zze();
        if (zzg >= zze || i6 <= 0) {
            return;
        }
        int min = Math.min(i6, zze - zzg);
        zzerVar.zzm(zzerVar2.zzi(), zzg, min);
        zzerVar2.zzh(zzg + min);
    }

    public final /* synthetic */ void zze(zzer zzerVar, int i5) {
        if (i5 < 19) {
            return;
        }
        this.zzd = zzerVar.zzt();
        this.zze = zzerVar.zzt();
        zzerVar.zzk(11);
        this.zzf = zzerVar.zzt();
        this.zzg = zzerVar.zzt();
    }
}
