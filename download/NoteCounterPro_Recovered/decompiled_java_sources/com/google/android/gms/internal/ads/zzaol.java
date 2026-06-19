package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzaol implements zzaon {
    private final zzer zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzagh zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzaol(String str, int i5, int i6, String str2) {
        this.zza = new zzer(new byte[i6]);
        this.zzc = str;
        this.zzd = i5;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i5) {
        int min = Math.min(zzerVar.zzd(), i5 - this.zzi);
        zzerVar.zzm(bArr, this.zzi, min);
        int i6 = this.zzi + min;
        this.zzi = i6;
        return i6 == i5;
    }

    private final void zzg(zzaes zzaesVar) {
        int i5;
        int i6 = zzaesVar.zzb;
        if (i6 == -2147483647 || (i5 = zzaesVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i5 == zzvVar.zzG && i6 == zzvVar.zzH && Objects.equals(zzaesVar.zza, zzvVar.zzo)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzl(this.zze);
        zztVar.zzm(zzaesVar.zza);
        zztVar.zzE(i5);
        zztVar.zzF(i6);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzM = zztVar.zzM();
        this.zzl = zzM;
        this.zzg.zzz(zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzq = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        int i5;
        byte b2;
        int i6;
        byte b5;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                while (true) {
                    if (zzerVar.zzd() > 0) {
                        int i8 = this.zzj << 8;
                        this.zzj = i8;
                        int zzs = i8 | zzerVar.zzs();
                        this.zzj = zzs;
                        int zza = zzaet.zza(zzs);
                        this.zzn = zza;
                        if (zza != 0) {
                            byte[] zzi = this.zza.zzi();
                            int i9 = this.zzj;
                            zzi[0] = (byte) ((i9 >> 24) & 255);
                            zzi[1] = (byte) ((i9 >> 16) & 255);
                            zzi[2] = (byte) ((i9 >> 8) & 255);
                            zzi[3] = (byte) (i9 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (zza == 3 || zza == 4) {
                                this.zzh = 4;
                            } else if (zza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i7 == 1) {
                zzer zzerVar2 = this.zza;
                if (zzf(zzerVar, zzerVar2.zzi(), 18)) {
                    byte[] zzi2 = zzerVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzb = zzaet.zzb(zzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzb;
                        this.zzg.zzz(zzb);
                    }
                    this.zzm = zzaet.zzc(zzi2);
                    byte b6 = zzi2[0];
                    if (b6 != -2) {
                        if (b6 == -1) {
                            i5 = (zzi2[4] & 7) << 4;
                            b5 = zzi2[7];
                        } else if (b6 != 31) {
                            i5 = (zzi2[4] & 1) << 6;
                            b2 = zzi2[5];
                        } else {
                            i5 = (zzi2[5] & 7) << 4;
                            b5 = zzi2[6];
                        }
                        i6 = b5 & 60;
                        this.zzk = zzgxz.zza(zzfj.zzr(((i5 | (i6 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, 18);
                        this.zzh = 6;
                    } else {
                        i5 = (zzi2[5] & 1) << 6;
                        b2 = zzi2[4];
                    }
                    i6 = b2 & 252;
                    this.zzk = zzgxz.zza(zzfj.zzr(((i5 | (i6 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzerVar2.zzh(0);
                    this.zzg.zzc(zzerVar2, 18);
                    this.zzh = 6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    zzer zzerVar3 = this.zza;
                    if (zzf(zzerVar, zzerVar3.zzi(), this.zzo)) {
                        zzaes zzd = zzaet.zzd(zzerVar3.zzi());
                        zzg(zzd);
                        this.zzm = zzd.zzd;
                        long j2 = zzd.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzerVar3.zzh(0);
                        this.zzg.zzc(zzerVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i7 == 4) {
                    zzer zzerVar4 = this.zza;
                    if (zzf(zzerVar, zzerVar4.zzi(), 6)) {
                        int zzg = zzaet.zzg(zzerVar4.zzi());
                        this.zzp = zzg;
                        int i10 = this.zzi;
                        if (i10 > zzg) {
                            int i11 = i10 - zzg;
                            this.zzi = i10 - i11;
                            zzerVar.zzh(zzerVar.zzg() - i11);
                        }
                        this.zzh = 5;
                    }
                } else if (i7 != 5) {
                    int min = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzerVar, min);
                    int i12 = this.zzi + min;
                    this.zzi = i12;
                    if (i12 == this.zzm) {
                        zzgrc.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzer zzerVar5 = this.zza;
                    if (zzf(zzerVar, zzerVar5.zzi(), this.zzp)) {
                        zzaes zzf = zzaet.zzf(zzerVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzf);
                        }
                        this.zzm = zzf.zzd;
                        long j5 = zzf.zze;
                        this.zzk = j5 != -9223372036854775807L ? j5 : 0L;
                        zzerVar5.zzh(0);
                        this.zzg.zzc(zzerVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzer zzerVar6 = this.zza;
                if (zzf(zzerVar, zzerVar6.zzi(), 7)) {
                    this.zzo = zzaet.zze(zzerVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
    }
}
