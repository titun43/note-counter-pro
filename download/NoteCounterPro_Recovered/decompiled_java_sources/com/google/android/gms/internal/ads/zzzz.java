package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzzz extends zzzs {
    private final boolean zze;
    private final zzzl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fb A[EDGE_INSN: B:121:0x00fb->B:68:0x00fb BREAK  A[LOOP:1: B:60:0x00dc->B:119:0x00f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzz(int i5, zzbg zzbgVar, int i6, zzzl zzzlVar, int i7, String str, int i8, boolean z4) {
        super(i5, zzbgVar, i6);
        boolean z5;
        boolean z6;
        int i9;
        int size;
        int i10;
        int i11;
        int i12;
        zzv zzvVar;
        String str2;
        int i13;
        boolean z7;
        zzv zzvVar2;
        int i14;
        int i15;
        float f5;
        int i16;
        zzv zzvVar3;
        int i17;
        int i18;
        int i19;
        this.zzf = zzzlVar;
        int i20 = 1;
        int i21 = true != zzzlVar.zzM ? 16 : 24;
        if (z4 && (((i17 = (zzvVar3 = this.zzd).zzv) == -1 || i17 <= zzzlVar.zza) && ((i18 = zzvVar3.zzw) == -1 || i18 <= zzzlVar.zzb))) {
            float f6 = zzvVar3.zzz;
            if ((f6 == -1.0f || f6 <= zzzlVar.zzc) && ((i19 = zzvVar3.zzj) == -1 || i19 <= zzzlVar.zzd)) {
                z5 = true;
                this.zze = z5;
                if (z4 && (((i14 = (zzvVar2 = this.zzd).zzv) == -1 || i14 >= 0) && ((i15 = zzvVar2.zzw) == -1 || i15 >= 0))) {
                    f5 = zzvVar2.zzz;
                    if ((f5 != -1.0f || f5 >= 0.0f) && ((i16 = zzvVar2.zzj) == -1 || i16 >= 0)) {
                        z6 = true;
                        this.zzg = z6;
                        this.zzh = zzmn.zzaa(i7, false);
                        zzv zzvVar4 = this.zzd;
                        float f7 = zzvVar4.zzz;
                        this.zzi = f7 == -1.0f && f7 >= 10.0f;
                        this.zzj = zzvVar4.zzj;
                        this.zzk = zzvVar4.zzc();
                        i9 = 0;
                        while (true) {
                            size = zzzlVar.zzo.size();
                            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            if (i9 < size) {
                                i11 = 0;
                                i9 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i11 = zzaaa.zzj(this.zzd, (String) zzzlVar.zzo.get(i9), false);
                                if (i11 > 0) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        this.zzm = i9;
                        this.zzn = i11;
                        this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
                        int i22 = this.zzd.zzf;
                        this.zzq = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                        this.zzr = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) != null);
                        i12 = 0;
                        while (true) {
                            if (i12 < zzzlVar.zzm.size()) {
                                String str3 = this.zzd.zzo;
                                if (str3 != null && str3.equals(zzzlVar.zzm.get(i12))) {
                                    i10 = i12;
                                    break;
                                }
                                i12++;
                            } else {
                                break;
                            }
                        }
                        this.zzl = i10;
                        this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
                        this.zzt = (i7 & 384) != 128;
                        this.zzu = (i7 & 64) != 64;
                        zzvVar = this.zzd;
                        str2 = zzvVar.zzo;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        i13 = 5;
                                        break;
                                    }
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        i13 = 4;
                                        break;
                                    }
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        i13 = 3;
                                        break;
                                    }
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        i13 = 1;
                                        break;
                                    }
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        i13 = 2;
                                        break;
                                    }
                                    break;
                            }
                            this.zzv = i13;
                            if ((zzvVar.zzf & 16384) == 0) {
                                zzzl zzzlVar2 = this.zzf;
                                if (zzmn.zzaa(i7, zzzlVar2.zzV) && ((z7 = this.zze) || zzzlVar2.zzK)) {
                                    if (zzmn.zzaa(i7, false) && this.zzg && z7 && zzvVar.zzj != -1 && (i21 & i7) != 0) {
                                        i20 = 2;
                                    }
                                    this.zzs = i20;
                                }
                            }
                            i20 = 0;
                            this.zzs = i20;
                        }
                        i13 = 0;
                        this.zzv = i13;
                        if ((zzvVar.zzf & 16384) == 0) {
                        }
                        i20 = 0;
                        this.zzs = i20;
                    }
                }
                z6 = false;
                this.zzg = z6;
                this.zzh = zzmn.zzaa(i7, false);
                zzv zzvVar42 = this.zzd;
                float f72 = zzvVar42.zzz;
                this.zzi = f72 == -1.0f && f72 >= 10.0f;
                this.zzj = zzvVar42.zzj;
                this.zzk = zzvVar42.zzc();
                i9 = 0;
                while (true) {
                    size = zzzlVar.zzo.size();
                    i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    if (i9 < size) {
                    }
                    i9++;
                }
                this.zzm = i9;
                this.zzn = i11;
                this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
                int i222 = this.zzd.zzf;
                this.zzq = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                this.zzr = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) != null);
                i12 = 0;
                while (true) {
                    if (i12 < zzzlVar.zzm.size()) {
                    }
                    i12++;
                }
                this.zzl = i10;
                this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
                this.zzt = (i7 & 384) != 128;
                this.zzu = (i7 & 64) != 64;
                zzvVar = this.zzd;
                str2 = zzvVar.zzo;
                if (str2 != null) {
                }
                i13 = 0;
                this.zzv = i13;
                if ((zzvVar.zzf & 16384) == 0) {
                }
                i20 = 0;
                this.zzs = i20;
            }
        }
        z5 = false;
        this.zze = z5;
        if (z4) {
            f5 = zzvVar2.zzz;
            if (f5 != -1.0f) {
            }
            z6 = true;
            this.zzg = z6;
            this.zzh = zzmn.zzaa(i7, false);
            zzv zzvVar422 = this.zzd;
            float f722 = zzvVar422.zzz;
            this.zzi = f722 == -1.0f && f722 >= 10.0f;
            this.zzj = zzvVar422.zzj;
            this.zzk = zzvVar422.zzc();
            i9 = 0;
            while (true) {
                size = zzzlVar.zzo.size();
                i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                if (i9 < size) {
                }
                i9++;
            }
            this.zzm = i9;
            this.zzn = i11;
            this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
            int i2222 = this.zzd.zzf;
            this.zzq = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
            this.zzr = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) != null);
            i12 = 0;
            while (true) {
                if (i12 < zzzlVar.zzm.size()) {
                }
                i12++;
            }
            this.zzl = i10;
            this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
            this.zzt = (i7 & 384) != 128;
            this.zzu = (i7 & 64) != 64;
            zzvVar = this.zzd;
            str2 = zzvVar.zzo;
            if (str2 != null) {
            }
            i13 = 0;
            this.zzv = i13;
            if ((zzvVar.zzf & 16384) == 0) {
            }
            i20 = 0;
            this.zzs = i20;
        }
        z6 = false;
        this.zzg = z6;
        this.zzh = zzmn.zzaa(i7, false);
        zzv zzvVar4222 = this.zzd;
        float f7222 = zzvVar4222.zzz;
        this.zzi = f7222 == -1.0f && f7222 >= 10.0f;
        this.zzj = zzvVar4222.zzj;
        this.zzk = zzvVar4222.zzc();
        i9 = 0;
        while (true) {
            size = zzzlVar.zzo.size();
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i9 < size) {
            }
            i9++;
        }
        this.zzm = i9;
        this.zzn = i11;
        this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
        int i22222 = this.zzd.zzf;
        this.zzq = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
        this.zzr = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) != null);
        i12 = 0;
        while (true) {
            if (i12 < zzzlVar.zzm.size()) {
            }
            i12++;
        }
        this.zzl = i10;
        this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
        this.zzt = (i7 & 384) != 128;
        this.zzu = (i7 & 64) != 64;
        zzvVar = this.zzd;
        str2 = zzvVar.zzo;
        if (str2 != null) {
        }
        i13 = 0;
        this.zzv = i13;
        if ((zzvVar.zzf & 16384) == 0) {
        }
        i20 = 0;
        this.zzs = i20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgts zza = zzgts.zzg().zzd(zzzzVar.zzh, zzzzVar2.zzh).zza(Integer.valueOf(zzzzVar.zzm), Integer.valueOf(zzzzVar2.zzm), zzgvz.zzb().zza()).zzb(zzzzVar.zzn, zzzzVar2.zzn).zzb(zzzzVar.zzo, zzzzVar2.zzo).zza(Integer.valueOf(zzzzVar.zzp), Integer.valueOf(zzzzVar2.zzp), zzgvz.zzb().zza()).zzd(zzzzVar.zzq, zzzzVar2.zzq).zzb(zzzzVar.zzr, zzzzVar2.zzr).zzd(zzzzVar.zzi, zzzzVar2.zzi).zzd(zzzzVar.zze, zzzzVar2.zze).zzd(zzzzVar.zzg, zzzzVar2.zzg).zza(Integer.valueOf(zzzzVar.zzl), Integer.valueOf(zzzzVar2.zzl), zzgvz.zzb().zza());
        boolean z4 = zzzzVar.zzt;
        zzgts zzd = zza.zzd(z4, zzzzVar2.zzt);
        boolean z5 = zzzzVar.zzu;
        zzgts zzd2 = zzd.zzd(z5, zzzzVar2.zzu);
        if (z4 && z5) {
            zzd2 = zzd2.zzb(zzzzVar.zzv, zzzzVar2.zzv);
        }
        return zzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgvz zzgvzVar;
        zzgvz zza;
        if (zzzzVar.zze && zzzzVar.zzh) {
            zza = zzaaa.zzc;
        } else {
            zzgvzVar = zzaaa.zzc;
            zza = zzgvzVar.zza();
        }
        zzgts zzg = zzgts.zzg();
        boolean z4 = zzzzVar.zzf.zzF;
        return zzg.zza(Integer.valueOf(zzzzVar.zzk), Integer.valueOf(zzzzVar2.zzk), zza).zza(Integer.valueOf(zzzzVar.zzj), Integer.valueOf(zzzzVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        zzzz zzzzVar = (zzzz) zzzsVar;
        if (!Objects.equals(this.zzd.zzo, zzzzVar.zzd.zzo)) {
            return false;
        }
        boolean z4 = this.zzf.zzN;
        return this.zzt == zzzzVar.zzt && this.zzu == zzzzVar.zzu;
    }
}
