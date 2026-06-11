package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzapg implements zzaqc {
    private final zzaon zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzapg(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    private final void zze(int i5) {
        this.zzc = i5;
        this.zzd = 0;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i5) {
        int min = Math.min(zzerVar.zzd(), i5 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(min);
        } else {
            zzerVar.zzm(bArr, this.zzd, min);
        }
        int i6 = this.zzd + min;
        this.zzd = i6;
        return i6 == i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i5) {
        int i6;
        int i7;
        long j2;
        long j5;
        this.zze.getClass();
        int i8 = -1;
        int i9 = 2;
        if ((i5 & 1) != 0) {
            int i10 = this.zzc;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    int i11 = this.zzj;
                    if (i11 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i11);
                        sb.append(" more bytes");
                        zzee.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i12 = i5;
        while (zzerVar.zzd() > 0) {
            int i13 = this.zzc;
            if (i13 == 0) {
                i6 = i9;
                zzerVar.zzk(zzerVar.zzd());
            } else if (i13 != 1) {
                if (i13 != i9) {
                    int zzd = zzerVar.zzd();
                    int i14 = this.zzj;
                    int i15 = i14 == i8 ? 0 : zzd - i14;
                    if (i15 > 0) {
                        zzd -= i15;
                        zzerVar.zzf(zzerVar.zzg() + zzd);
                    }
                    zzaon zzaonVar = this.zza;
                    zzaonVar.zzd(zzerVar);
                    int i16 = this.zzj;
                    if (i16 != i8) {
                        int i17 = i16 - zzd;
                        this.zzj = i17;
                        if (i17 == 0) {
                            zzaonVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int min = Math.min(10, this.zzi);
                    zzeq zzeqVar = this.zzb;
                    if (zzf(zzerVar, zzeqVar.zza, min) && zzf(zzerVar, null, this.zzi)) {
                        zzeqVar.zzf(0);
                        if (this.zzf) {
                            zzeqVar.zzh(4);
                            long zzj = zzeqVar.zzj(3);
                            zzeqVar.zzh(1);
                            int zzj2 = zzeqVar.zzj(15) << 15;
                            zzeqVar.zzh(1);
                            long zzj3 = zzeqVar.zzj(15);
                            zzeqVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j5 = zzj;
                            } else {
                                zzeqVar.zzh(4);
                                j5 = zzj;
                                zzeqVar.zzh(1);
                                int zzj4 = zzeqVar.zzj(15) << 15;
                                zzeqVar.zzh(1);
                                long zzj5 = zzeqVar.zzj(15);
                                zzeqVar.zzh(1);
                                this.zze.zze((zzeqVar.zzj(3) << 30) | zzj4 | zzj5);
                                this.zzh = true;
                            }
                            j2 = this.zze.zze(zzj3 | (j5 << 30) | zzj2);
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        i12 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(j2, i12);
                        zze(3);
                        i8 = -1;
                        i9 = 2;
                    }
                }
                i6 = i9;
            } else {
                zzeq zzeqVar2 = this.zzb;
                if (zzf(zzerVar, zzeqVar2.zza, 9)) {
                    zzeqVar2.zzf(0);
                    int zzj6 = zzeqVar2.zzj(24);
                    if (zzj6 != 1) {
                        u.r(new StringBuilder(String.valueOf(zzj6).length() + 30), "Unexpected start code prefix: ", zzj6, "PesReader");
                        i8 = -1;
                        this.zzj = -1;
                        i7 = 0;
                        i6 = 2;
                    } else {
                        zzeqVar2.zzh(8);
                        int zzj7 = zzeqVar2.zzj(16);
                        zzeqVar2.zzh(5);
                        this.zzk = zzeqVar2.zzi();
                        i6 = 2;
                        zzeqVar2.zzh(2);
                        this.zzf = zzeqVar2.zzi();
                        this.zzg = zzeqVar2.zzi();
                        zzeqVar2.zzh(6);
                        int zzj8 = zzeqVar2.zzj(8);
                        this.zzi = zzj8;
                        if (zzj7 == 0) {
                            this.zzj = -1;
                            i8 = -1;
                        } else {
                            int i18 = (zzj7 - 3) - zzj8;
                            this.zzj = i18;
                            if (i18 < 0) {
                                u.r(new StringBuilder(String.valueOf(i18).length() + 36), "Found negative packet payload size: ", i18, "PesReader");
                                i8 = -1;
                                this.zzj = -1;
                            } else {
                                i8 = -1;
                            }
                        }
                        i7 = 2;
                    }
                    zze(i7);
                } else {
                    i8 = -1;
                    i6 = 2;
                }
            }
            i9 = i6;
        }
    }

    public final boolean zzd(boolean z4) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
