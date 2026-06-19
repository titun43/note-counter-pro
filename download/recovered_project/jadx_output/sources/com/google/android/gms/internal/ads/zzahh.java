package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzahh extends zzahm {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzahh(zzagh zzaghVar) {
        super(zzaghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zza(zzer zzerVar) {
        if (this.zzc) {
            zzerVar.zzk(1);
        } else {
            int zzs = zzerVar.zzs();
            int i5 = zzs >> 4;
            this.zze = i5;
            if (i5 == 2) {
                int i6 = zzb[(zzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("audio/mpeg");
                zztVar.zzE(1);
                zztVar.zzF(i6);
                this.zza.zzz(zztVar.zzM());
                this.zzd = true;
            } else if (i5 == 7 || i5 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzl("video/x-flv");
                zztVar2.zzm(i5 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzE(1);
                zztVar2.zzF(8000);
                this.zza.zzz(zztVar2.zzM());
                this.zzd = true;
            } else if (i5 != 10) {
                throw new zzahl(u.l(new StringBuilder(String.valueOf(i5).length() + 28), "Audio format not supported: ", i5));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zzb(zzer zzerVar, long j2) {
        if (this.zze == 2) {
            int zzd = zzerVar.zzd();
            zzagh zzaghVar = this.zza;
            zzaghVar.zzc(zzerVar, zzd);
            zzaghVar.zze(j2, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzerVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzerVar.zzd();
            zzagh zzaghVar2 = this.zza;
            zzaghVar2.zzc(zzerVar, zzd2);
            zzaghVar2.zze(j2, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzerVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzerVar.zzm(bArr, 0, zzd3);
        zzads zza = zzadt.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzl("video/x-flv");
        zztVar.zzm("audio/mp4a-latm");
        zztVar.zzj(zza.zzc);
        zztVar.zzE(zza.zzb);
        zztVar.zzF(zza.zza);
        zztVar.zzp(Collections.singletonList(bArr));
        this.zza.zzz(zztVar.zzM());
        this.zzd = true;
        return false;
    }
}
