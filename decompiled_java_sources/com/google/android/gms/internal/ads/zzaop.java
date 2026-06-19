package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzaop implements zzaon {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzagh zzb;
    private final zzaqf zzd;
    private final String zze;
    private final zzer zzf;
    private final zzape zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoo zzi = new zzaoo(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzaop(zzaqf zzaqfVar, String str) {
        zzer zzerVar;
        this.zzd = zzaqfVar;
        this.zze = str;
        if (zzaqfVar != null) {
            this.zzg = new zzape(178, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzape zzapeVar = this.zzg;
        if (zzapeVar != null) {
            zzapeVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zza = zzaqbVar.zzc();
        this.zzb = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        zzaqf zzaqfVar = this.zzd;
        if (zzaqfVar != null) {
            zzaqfVar.zza(zzaexVar, zzaqbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzn = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i5;
        zzape zzapeVar;
        int i6;
        long j2;
        long j5;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        float f5;
        int i10;
        long j6;
        byte b2;
        int i11;
        this.zzb.getClass();
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzj += zzerVar.zzd();
        this.zzb.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i12 = zzi2 + 3;
            int i13 = zzerVar.zzi()[i12] & 255;
            int i14 = zzi2 - zzg;
            if (!this.zzl) {
                if (i14 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                zzaoo zzaooVar = this.zzi;
                if (zzaooVar.zzb(i13, i15)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzaooVar.zzc, zzaooVar.zza);
                    int i16 = copyOf[4] & 255;
                    byte b5 = copyOf[5];
                    i5 = zze;
                    int i17 = copyOf[6] & 255;
                    int i18 = (i16 << 4) | ((b5 & 255) >> 4);
                    int i19 = (copyOf[7] & 240) >> 4;
                    int i20 = ((b5 & 15) << 8) | i17;
                    if (i19 == 2) {
                        i8 = i20 * 4;
                        i9 = i18 * 3;
                    } else if (i19 == 3) {
                        i8 = i20 * 16;
                        i9 = i18 * 9;
                    } else if (i19 != 4) {
                        f5 = 1.0f;
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzl(str2);
                        zztVar.zzm("video/mpeg2");
                        zztVar.zzt(i18);
                        zztVar.zzu(i20);
                        zztVar.zzz(f5);
                        zztVar.zzp(Collections.singletonList(copyOf));
                        zzv zzM = zztVar.zzM();
                        i10 = (copyOf[7] & 15) - 1;
                        j6 = 0;
                        if (i10 >= 0 && i10 < 8) {
                            double d5 = zzc[i10];
                            b2 = copyOf[zzaooVar.zzb + 9];
                            i11 = (b2 & 96) >> 5;
                            if (i11 != (b2 & 31)) {
                                d5 *= (i11 + 1.0d) / (r11 + 1);
                            }
                            j6 = (long) (1000000.0d / d5);
                        }
                        Pair create = Pair.create(zzM, Long.valueOf(j6));
                        this.zzb.zzz((zzv) create.first);
                        this.zzm = ((Long) create.second).longValue();
                        this.zzl = true;
                        zzapeVar = this.zzg;
                        if (zzapeVar != null) {
                            if (i14 > 0) {
                                zzapeVar.zzd(zzi, zzg, zzi2);
                                i7 = 0;
                            } else {
                                i7 = -i14;
                            }
                            if (zzapeVar.zze(i7)) {
                                int zza = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                                zzer zzerVar2 = this.zzf;
                                String str3 = zzfj.zza;
                                zzerVar2.zzb(zzapeVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzerVar2);
                            }
                            if (i13 == 178) {
                                if (zzerVar.zzi()[zzi2 + 2] == 1) {
                                    zzapeVar.zzc(178);
                                }
                                i13 = 178;
                            }
                        }
                        if (i13 != 0 || i13 == 179) {
                            i6 = i5 - zzi2;
                            if (this.zzr || !this.zzl) {
                                j2 = -9223372036854775807L;
                            } else {
                                j2 = -9223372036854775807L;
                                long j7 = this.zzp;
                                if (j7 != -9223372036854775807L) {
                                    j2 = -9223372036854775807L;
                                    this.zzb.zze(j7, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i6, i6, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i6;
                                j5 = this.zzn;
                                if (j5 == j2) {
                                    long j8 = this.zzp;
                                    j5 = j8 != j2 ? j8 + this.zzm : j2;
                                }
                                this.zzp = j5;
                                z4 = false;
                                this.zzq = false;
                                this.zzn = j2;
                                z5 = true;
                                this.zzk = true;
                            } else {
                                z5 = true;
                                z4 = false;
                            }
                            this.zzr = i13 == 0 ? z5 : z4;
                        } else if (i13 == 184) {
                            this.zzq = true;
                        }
                        zzg = i12;
                        zze = i5;
                    } else {
                        i8 = i20 * 121;
                        i9 = i18 * 100;
                    }
                    f5 = i8 / i9;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzl(str2);
                    zztVar2.zzm("video/mpeg2");
                    zztVar2.zzt(i18);
                    zztVar2.zzu(i20);
                    zztVar2.zzz(f5);
                    zztVar2.zzp(Collections.singletonList(copyOf));
                    zzv zzM2 = zztVar2.zzM();
                    i10 = (copyOf[7] & 15) - 1;
                    j6 = 0;
                    if (i10 >= 0) {
                        double d52 = zzc[i10];
                        b2 = copyOf[zzaooVar.zzb + 9];
                        i11 = (b2 & 96) >> 5;
                        if (i11 != (b2 & 31)) {
                        }
                        j6 = (long) (1000000.0d / d52);
                    }
                    Pair create2 = Pair.create(zzM2, Long.valueOf(j6));
                    this.zzb.zzz((zzv) create2.first);
                    this.zzm = ((Long) create2.second).longValue();
                    this.zzl = true;
                    zzapeVar = this.zzg;
                    if (zzapeVar != null) {
                    }
                    if (i13 != 0) {
                    }
                    i6 = i5 - zzi2;
                    if (this.zzr) {
                    }
                    j2 = -9223372036854775807L;
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i6;
                    j5 = this.zzn;
                    if (j5 == j2) {
                    }
                    this.zzp = j5;
                    z4 = false;
                    this.zzq = false;
                    this.zzn = j2;
                    z5 = true;
                    this.zzk = true;
                    this.zzr = i13 == 0 ? z5 : z4;
                    zzg = i12;
                    zze = i5;
                }
            }
            i5 = zze;
            zzapeVar = this.zzg;
            if (zzapeVar != null) {
            }
            if (i13 != 0) {
            }
            i6 = i5 - zzi2;
            if (this.zzr) {
            }
            j2 = -9223372036854775807L;
            if (this.zzk) {
            }
            this.zzo = this.zzj - i6;
            j5 = this.zzn;
            if (j5 == j2) {
            }
            this.zzp = j5;
            z4 = false;
            this.zzq = false;
            this.zzn = j2;
            z5 = true;
            this.zzk = true;
            this.zzr = i13 == 0 ? z5 : z4;
            zzg = i12;
            zze = i5;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzape zzapeVar2 = this.zzg;
        if (zzapeVar2 != null) {
            zzapeVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        if (z4) {
            boolean z5 = this.zzq;
            long j2 = this.zzj - this.zzo;
            zzaghVar.zze(this.zzp, z5 ? 1 : 0, (int) j2, 0, null);
        }
    }
}
