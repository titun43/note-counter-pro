package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzann implements zzamf {
    private final zzer zza = new zzer();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        zzcx zzr;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i6 + i5);
        zzerVar.zzh(i5);
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() > 0) {
            zzgrc.zzb(zzerVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzerVar.zzB() - 8;
            if (zzerVar.zzB() == 1987343459) {
                CharSequence charSequence = null;
                zzcw zzcwVar = null;
                while (zzB > 0) {
                    zzgrc.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    int i7 = zzB - 8;
                    int i8 = zzB2 - 8;
                    String zzj = zzfj.zzj(zzerVar.zzi(), zzerVar.zzg(), i8);
                    zzerVar.zzk(i8);
                    if (zzB3 == 1937011815) {
                        zzcwVar = zzanw.zzb(zzj);
                    } else if (zzB3 == 1885436268) {
                        charSequence = zzanw.zzc(null, zzj.trim(), Collections.EMPTY_LIST);
                    }
                    zzB = i7 - i8;
                }
                if (charSequence == null) {
                    charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (zzcwVar != null) {
                    zzcwVar.zza(charSequence);
                    zzr = zzcwVar.zzr();
                } else {
                    Pattern pattern = zzanw.zza;
                    zzanv zzanvVar = new zzanv();
                    zzanvVar.zzc = charSequence;
                    zzr = zzanvVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzerVar.zzk(zzB);
            }
        }
        zzdrVar.zza(new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
