package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzahr implements zzaeu {
    private zzaex zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahv zzg;
    private zzaev zzh;
    private zzagd zzi;
    private zzakw zzj;
    private final zzer zza = new zzer(2);
    private long zzf = -1;

    private final int zzh(zzaev zzaevVar) {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 2, false);
        return zzerVar.zzt();
    }

    private final int zzi(zzaev zzaevVar) {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        return zzerVar.zzt() - 2;
    }

    private final void zzj() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        int zzi;
        if (zzh(zzaevVar) == 65496) {
            while (true) {
                int zzh = zzh(zzaevVar);
                this.zzd = zzh;
                if (zzh == 65498 || (zzi = zzi(zzaevVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzael) zzaevVar).zzj(zzi, false);
                } else {
                    zzer zzerVar = this.zza;
                    zzerVar.zza(zzi);
                    ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, zzi, false);
                    if (Objects.equals(zzerVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzahu.zzb(zzerVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        String zzM;
        zzaht zza;
        zzahv zzahvVar;
        long j2;
        int i5 = this.zzc;
        long j5 = -1;
        if (i5 == 0) {
            zzer zzerVar = this.zza;
            zzerVar.zza(2);
            zzaevVar.zzc(zzerVar.zzi(), 0, 2);
            int zzt = zzerVar.zzt();
            this.zzd = zzt;
            if (zzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((zzt < 65488 || zzt > 65497) && zzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i5 == 1) {
            this.zze = zzi(zzaevVar);
            zzaevVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i5 != 2) {
            if (i5 != 4) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaevVar != this.zzh) {
                    this.zzh = zzaevVar;
                    this.zzi = new zzagd(zzaevVar, this.zzf);
                }
                zzakw zzakwVar = this.zzj;
                zzakwVar.getClass();
                int zzd = zzakwVar.zzd(this.zzi, zzafvVar);
                if (zzd == 1) {
                    zzafvVar.zza += this.zzf;
                }
                return zzd;
            }
            long zzn = zzaevVar.zzn();
            long j6 = this.zzf;
            if (zzn != j6) {
                zzafvVar.zza = j6;
                return 1;
            }
            if (zzaevVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzaevVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzf);
                this.zzi = zzagdVar;
                if (this.zzj.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzj;
                    long j7 = this.zzf;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzakwVar2.zzc(new zzagf(j7, zzaexVar));
                    zzahv zzahvVar2 = this.zzg;
                    zzahvVar2.getClass();
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzagh zzu = zzaexVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/jpeg");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar2));
                    zzu.zzz(zztVar.zzM());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzer zzerVar2 = new zzer(this.zze);
            zzaevVar.zzc(zzerVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzerVar2.zzM((char) 0)) && (zzM = zzerVar2.zzM((char) 0)) != null) {
                long zzo = zzaevVar.zzo();
                if (zzo != -1 && (zza = zzahu.zza(zzM)) != null) {
                    List list = zza.zzb;
                    if (list.size() >= 2) {
                        int size = list.size() - 1;
                        long j8 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        long j11 = -1;
                        while (size >= 0) {
                            zzahs zzahsVar = (zzahs) list.get(size);
                            String str = zzahsVar.zza;
                            long j12 = j5;
                            boolean z4 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                zzo -= zzahsVar.zzc;
                                j2 = 0;
                            } else {
                                j2 = zzo - zzahsVar.zzb;
                            }
                            long j13 = j2;
                            long j14 = zzo;
                            zzo = j13;
                            if (z4 && zzo != j14) {
                                j11 = j14 - zzo;
                                j10 = zzo;
                            }
                            if (size == 0) {
                                j9 = j14;
                            }
                            if (size == 0) {
                                j8 = zzo;
                            }
                            size--;
                            j5 = j12;
                        }
                        long j15 = j5;
                        if (j10 != j15 && j11 != j15 && j8 != j15 && j9 != j15) {
                            zzahvVar = new zzahv(j8, j9, zza.zza, j10, j11);
                            this.zzg = zzahvVar;
                            if (zzahvVar != null) {
                                this.zzf = zzahvVar.zzd;
                            }
                        }
                    }
                }
                zzahvVar = null;
                this.zzg = zzahvVar;
                if (zzahvVar != null) {
                }
            }
        } else {
            zzaevVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        if (j2 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakw zzakwVar = this.zzj;
            zzakwVar.getClass();
            zzakwVar.zze(j2, j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
