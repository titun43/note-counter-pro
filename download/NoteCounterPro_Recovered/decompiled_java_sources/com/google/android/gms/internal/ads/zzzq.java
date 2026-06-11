package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzq(int i5, zzbg zzbgVar, int i6, zzzl zzzlVar, int i7, String str, String str2) {
        super(i5, zzbgVar, i6);
        int i8;
        int i9 = 0;
        this.zzf = zzmn.zzaa(i7, false);
        int i10 = this.zzd.zze;
        int i11 = zzzlVar.zzC;
        this.zzg = 1 == (i10 & 1);
        this.zzh = (i10 & 2) != 0;
        zzguf zzj = str2 != null ? zzguf.zzj(str2) : zzzlVar.zzy.isEmpty() ? zzguf.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : zzzlVar.zzy;
        int i12 = 0;
        while (true) {
            if (i12 >= zzj.size()) {
                i8 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = zzaaa.zzj(this.zzd, (String) zzj.get(i12), false);
                if (i8 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.zzi = i12;
        this.zzj = i8;
        int zzm = zzaaa.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = zzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int zzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) == null);
        this.zzm = zzj2;
        boolean z4 = i8 > 0 || (zzzlVar.zzy.isEmpty() && zzm > 0) || ((zzzlVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0));
        if (zzmn.zzaa(i7, zzzlVar.zzV) && z4) {
            i9 = 1;
        }
        this.zze = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgts zza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i5 = this.zzj;
        zzgts zzb = zza.zzb(i5, zzzqVar.zzj);
        int i6 = this.zzk;
        zzgts zzb2 = zzb.zzb(i6, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzqVar.zzh), i5 == 0 ? zzgvz.zzb() : zzgvz.zzb().zza()).zzb(this.zzm, zzzqVar.zzm);
        if (i6 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
