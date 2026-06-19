package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzyx extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzzl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzyx(int i5, zzbg zzbgVar, int i6, zzzl zzzlVar, int i7, boolean z4, zzgrd zzgrdVar, int i8) {
        super(i5, zzbgVar, i6);
        int i9;
        int i10;
        int hashCode;
        int i11;
        boolean z5;
        this.zzh = zzzlVar;
        int i12 = 1;
        int i13 = true != zzzlVar.zzT ? 16 : 24;
        this.zzg = zzaaa.zzi(this.zzd.zzd);
        this.zzi = zzmn.zzaa(i7, false);
        int i14 = 0;
        while (true) {
            int size = zzzlVar.zzq.size();
            i9 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i14 >= size) {
                i10 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = zzaaa.zzj(this.zzd, (String) zzzlVar.zzq.get(i14), false);
                if (i10 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = i10;
        this.zzl = zzaaa.zzm(this.zzd.zzf, 0);
        this.zzm = zzaaa.zzn(this.zzd, zzzlVar.zzr);
        zzv zzvVar = this.zzd;
        int i15 = zzvVar.zzf;
        this.zzn = i15 == 0 || (i15 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzo;
        this.zzx = str != null && ((hashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(hashCode == 187078297 ? !str.equals("audio/ac4") : !(hashCode == 1504698186 && str.equals("audio/iamf"))));
        int i16 = zzvVar.zzG;
        this.zzr = i16;
        this.zzs = zzvVar.zzH;
        int i17 = zzvVar.zzj;
        this.zzt = i17;
        this.zzf = (i17 == -1 || i17 <= zzzlVar.zzu) && (i16 == -1 || i16 <= zzzlVar.zzt) && zzgrdVar.zza(zzvVar);
        String str2 = zzfj.zza;
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i18 = 0; i18 < split.length; i18++) {
            split[i18] = zzfj.zzh(split[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= split.length) {
                i11 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                i11 = zzaaa.zzj(this.zzd, split[i19], false);
                if (i11 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzo = i19;
        this.zzp = i11;
        int i20 = 0;
        while (true) {
            if (i20 >= zzzlVar.zzv.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzzlVar.zzv.get(i20))) {
                i9 = i20;
                break;
            }
            i20++;
        }
        this.zzu = i9;
        this.zzv = (i7 & 384) == 128;
        this.zzw = (i7 & 64) == 64;
        zzzl zzzlVar2 = this.zzh;
        if (zzmn.zzaa(i7, zzzlVar2.zzV) && ((z5 = this.zzf) || zzzlVar2.zzO)) {
            int i21 = zzzlVar2.zzw.zzb;
            if (zzmn.zzaa(i7, false) && z5 && this.zzd.zzj != -1 && ((zzzlVar2.zzX || !z4) && (i13 & i7) != 0)) {
                i12 = 2;
            }
        } else {
            i12 = 0;
        }
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyx zzyxVar) {
        zzgvz zzgvzVar;
        zzgvz zza;
        boolean z4 = this.zzf;
        if (z4 && this.zzi) {
            zza = zzaaa.zzc;
        } else {
            zzgvzVar = zzaaa.zzc;
            zza = zzgvzVar.zza();
        }
        zzgts zza2 = zzgts.zzg().zzd(this.zzi, zzyxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyxVar.zzk), zzgvz.zzb().zza()).zzb(this.zzj, zzyxVar.zzj).zzb(this.zzl, zzyxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyxVar.zzm), zzgvz.zzb().zza()).zzd(this.zzq, zzyxVar.zzq).zzd(this.zzn, zzyxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyxVar.zzo), zzgvz.zzb().zza()).zzb(this.zzp, zzyxVar.zzp).zzd(z4, zzyxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyxVar.zzu), zzgvz.zzb().zza());
        boolean z5 = this.zzh.zzF;
        zzgts zza3 = zza2.zzd(this.zzv, zzyxVar.zzv).zzd(this.zzw, zzyxVar.zzw).zzd(this.zzx, zzyxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyxVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyxVar.zzs), zza);
        if (Objects.equals(this.zzg, zzyxVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyxVar.zzt), zza);
        }
        return zza3.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        String str;
        int i5;
        zzyx zzyxVar = (zzyx) zzzsVar;
        boolean z4 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i6 = zzvVar.zzG;
        if (i6 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyxVar.zzd;
        return i6 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i5 = zzvVar.zzH) != -1 && i5 == zzvVar2.zzH && this.zzv == zzyxVar.zzv && this.zzw == zzyxVar.zzw;
    }
}
