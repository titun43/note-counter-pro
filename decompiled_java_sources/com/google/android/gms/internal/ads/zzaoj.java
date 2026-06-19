package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaoj(boolean z4, String str, int i5, String str2) {
        this.zzb = z4;
        this.zze = str;
        this.zzf = i5;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i5) {
        return (i5 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i5) {
        int min = Math.min(zzerVar.zzd(), i5 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, min);
        int i6 = this.zzl + min;
        this.zzl = i6;
        return i6 == i5;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j2, int i5, int i6) {
        this.zzk = 4;
        this.zzl = i5;
        this.zzw = zzaghVar;
        this.zzx = j2;
        this.zzu = i6;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b2, byte b5) {
        return zzf((b5 & 255) | 65280);
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i5) {
        if (zzerVar.zzd() < i5) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i5);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzu;
        this.zzw = zzu;
        if (!this.zzb) {
            this.zzj = new zzaer();
            return;
        }
        zzaqbVar.zza();
        zzagh zzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzj = zzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaqbVar.zzc());
        zztVar.zzl(this.zzg);
        zztVar.zzm("application/id3");
        zzu2.zzz(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzv = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        int i5;
        byte b2;
        char c5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        this.zzi.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int i9 = this.zzk;
            char c6 = 7;
            int i10 = 3;
            int i11 = 2;
            if (i9 == 0) {
                byte[] zzi = zzerVar.zzi();
                int zzg = zzerVar.zzg();
                int zze = zzerVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzerVar.zzh(zzg);
                        break;
                    }
                    i5 = zzg + 1;
                    b2 = zzi[zzg];
                    int i12 = b2 & 255;
                    int i13 = i10;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i12)) {
                        c5 = c6;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i14 = zzg - 1;
                        zzerVar.zzh(zzg);
                        zzeq zzeqVar = this.zzc;
                        if (zzm(zzerVar, zzeqVar.zza, 1)) {
                            zzeqVar.zzf(4);
                            int zzj = zzeqVar.zzj(1);
                            int i15 = this.zzp;
                            if (i15 == -1 || zzj == i15) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzerVar, zzeqVar.zza, 1)) {
                                        break;
                                    }
                                    zzeqVar.zzf(i11);
                                    if (zzeqVar.zzj(4) == this.zzq) {
                                        zzerVar.zzh(zzg + 1);
                                    }
                                }
                                if (!zzm(zzerVar, zzeqVar.zza, 4)) {
                                    break;
                                }
                                zzeqVar.zzf(14);
                                int zzj2 = zzeqVar.zzj(13);
                                c5 = 7;
                                if (zzj2 >= 7) {
                                    byte[] zzi2 = zzerVar.zzi();
                                    int zze2 = zzerVar.zze();
                                    int i16 = i14 + zzj2;
                                    if (i16 < zze2) {
                                        byte b5 = zzi2[i16];
                                        if (b5 != -1) {
                                            if (b5 == 73) {
                                                int i17 = i16 + 1;
                                                if (i17 == zze2) {
                                                    break;
                                                }
                                                if (zzi2[i17] == 68) {
                                                    int i18 = i16 + 2;
                                                    if (i18 == zze2) {
                                                        break;
                                                    } else if (zzi2[i18] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i19 = i16 + 1;
                                            if (i19 == zze2) {
                                                break;
                                            }
                                            byte b6 = zzi2[i19];
                                            if (zzl((byte) -1, b6) && ((b6 & 8) >> 3) == zzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c5 = 7;
                    }
                    int i20 = this.zzm;
                    int i21 = i20 | i12;
                    if (i21 == 329) {
                        i6 = i13;
                        i7 = 2;
                        z4 = false;
                        i8 = 768;
                    } else if (i21 == 511) {
                        i6 = i13;
                        i7 = 2;
                        z4 = false;
                        i8 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (i21 == 836) {
                        i6 = i13;
                        i7 = 2;
                        z4 = false;
                        i8 = 1024;
                    } else {
                        if (i21 == 1075) {
                            this.zzk = 2;
                            this.zzl = i13;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzerVar.zzh(i5);
                            break;
                        }
                        if (i20 != 256) {
                            this.zzm = 256;
                            c6 = c5;
                            i10 = i13;
                            i11 = 2;
                        } else {
                            i6 = i13;
                            i7 = 2;
                            z4 = false;
                            zzg = i5;
                            i10 = i6;
                            c6 = c5;
                            i11 = i7;
                        }
                    }
                    this.zzm = i8;
                    zzg = i5;
                    i10 = i6;
                    c6 = c5;
                    i11 = i7;
                }
                this.zzr = (b2 & 8) >> 3;
                this.zzn = 1 == ((b2 & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzerVar.zzh(i5);
            } else if (i9 != 1) {
                if (i9 == 2) {
                    zzer zzerVar2 = this.zzd;
                    if (zzh(zzerVar, zzerVar2.zzi(), 10)) {
                        this.zzj.zzc(zzerVar2, 10);
                        zzerVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzerVar2.zzG() + 10);
                    }
                } else if (i9 != 3) {
                    int min = Math.min(zzerVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzerVar, min);
                    int i22 = this.zzl + min;
                    this.zzl = i22;
                    if (i22 == this.zzu) {
                        zzgrc.zzi(this.zzv != -9223372036854775807L);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i23 = true != this.zzn ? 5 : 7;
                    zzeq zzeqVar2 = this.zzc;
                    if (zzh(zzerVar, zzeqVar2.zza, i23)) {
                        zzeqVar2.zzf(0);
                        if (this.zzs) {
                            zzeqVar2.zzh(10);
                        } else {
                            int zzj3 = zzeqVar2.zzj(2) + 1;
                            if (zzj3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                zzee.zzc("AdtsReader", sb.toString());
                            }
                            zzeqVar2.zzh(5);
                            int zzj4 = zzeqVar2.zzj(3);
                            int i24 = this.zzq;
                            byte[] bArr = {(byte) (((i24 >> 1) & 7) | 16), (byte) (((zzj4 << 3) & 120) | ((i24 << 7) & 128))};
                            zzads zza2 = zzadt.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzl(this.zzg);
                            zztVar.zzm("audio/mp4a-latm");
                            zztVar.zzj(zza2.zzc);
                            zztVar.zzE(zza2.zzb);
                            zztVar.zzF(zza2.zza);
                            zztVar.zzp(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzM = zztVar.zzM();
                            this.zzt = 1024000000 / zzM.zzH;
                            this.zzi.zzz(zzM);
                            this.zzs = true;
                        }
                        zzeqVar2.zzh(4);
                        int zzj5 = zzeqVar2.zzj(13);
                        int i25 = zzj5 - 7;
                        if (this.zzn) {
                            i25 = zzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i25);
                    }
                }
            } else if (zzerVar.zzd() != 0) {
                zzeq zzeqVar3 = this.zzc;
                zzeqVar3.zza[0] = zzerVar.zzi()[zzerVar.zzg()];
                zzeqVar3.zzf(2);
                int zzj6 = zzeqVar3.zzj(4);
                int i26 = this.zzq;
                if (i26 == -1 || zzj6 == i26) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
    }
}
