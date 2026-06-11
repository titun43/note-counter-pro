package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzahn extends zzahm {
    private final zzer zzb;
    private final zzer zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzahn(zzagh zzaghVar) {
        super(zzaghVar);
        this.zzb = new zzer(zzgm.zza);
        this.zzc = new zzer(4);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zza(zzer zzerVar) {
        int zzs = zzerVar.zzs();
        int i5 = zzs >> 4;
        int i6 = zzs & 15;
        if (i6 != 7) {
            throw new zzahl(u.l(new StringBuilder(String.valueOf(i6).length() + 28), "Video format not supported: ", i6));
        }
        this.zzg = i5;
        return i5 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zzb(zzer zzerVar, long j2) {
        int i5;
        int zzs = zzerVar.zzs();
        long zzy = zzerVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                zzer zzerVar2 = new zzer(new byte[zzerVar.zzd()]);
                zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar.zzd());
                zzadz zza = zzadz.zza(zzerVar2);
                this.zzd = zza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zza.zzl);
                zztVar.zzt(zza.zzc);
                zztVar.zzu(zza.zzd);
                zztVar.zzz(zza.zzk);
                zztVar.zzp(zza.zza);
                this.zza.zzz(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (zzs == 1 && this.zze) {
            int i6 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i5 = i6;
            } else if (i6 != 0) {
                i5 = 1;
            }
            zzer zzerVar3 = this.zzc;
            byte[] zzi = zzerVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i7 = 4 - this.zzd;
            int i8 = 0;
            while (zzerVar.zzd() > 0) {
                zzerVar.zzm(zzerVar3.zzi(), i7, this.zzd);
                zzerVar3.zzh(0);
                zzer zzerVar4 = this.zzb;
                int zzH = zzerVar3.zzH();
                zzerVar4.zzh(0);
                zzagh zzaghVar = this.zza;
                zzaghVar.zzc(zzerVar4, 4);
                zzaghVar.zzc(zzerVar, zzH);
                i8 = i8 + 4 + zzH;
            }
            this.zza.zze((zzy * 1000) + j2, i5, i8, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
