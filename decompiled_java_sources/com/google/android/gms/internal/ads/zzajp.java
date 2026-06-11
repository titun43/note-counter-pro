package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.io.EOFException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    public zzajp() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.google.android.gms.internal.ads.zzafy] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(zzaev zzaevVar) {
        int i5;
        long j2;
        Throwable th;
        int i6;
        zzafn zzafnVar;
        long j5;
        int i7;
        Object zzajkVar;
        int i8;
        int i9;
        zzap zzapVar;
        long zzn;
        zzaiq zzaiqVar;
        Object zzd;
        zzajq zzajqVar;
        Object obj;
        if (this.zzj == 0) {
            try {
                zzk(zzaevVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzafr zzafrVar = this.zzc;
            zzer zzerVar = new zzer(zzafrVar.zzc);
            zzaevVar.zzi(zzerVar.zzi(), 0, zzafrVar.zzc);
            int i10 = 21;
            if ((zzafrVar.zza & 1) != 0) {
                if (zzafrVar.zze != 1) {
                    i10 = 36;
                }
            } else if (zzafrVar.zze == 1) {
                i10 = 13;
            }
            j2 = -9223372036854775807L;
            if (zzerVar.zze() >= i10 + 4) {
                zzerVar.zzh(i10);
                i6 = zzerVar.zzB();
                if (i6 != 1483304551) {
                    if (i6 == 1231971951) {
                        i6 = 1231971951;
                    }
                }
                if (i6 != 1231971951) {
                    if (i6 == 1447187017) {
                        Object zzd2 = zzajs.zzd(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar, zzerVar);
                        zzaevVar.zzf(zzafrVar.zzc);
                        i5 = -1;
                        obj = zzd2;
                    } else if (i6 != 1483304551) {
                        zzaevVar.zzl();
                        i5 = -1;
                        obj = null;
                    }
                    th = null;
                    zzajkVar = obj;
                    zzapVar = this.zzk;
                    zzn = zzaevVar.zzn();
                    if (zzapVar == null || (zzaiqVar = (zzaiq) zzapVar.zzc(zzaiq.class, zzgrg.zza())) == null) {
                        zzd = th;
                    } else {
                        zzais zzaisVar = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                        zzd = zzajm.zzd(zzn, zzaiqVar, zzaisVar != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar.zzb.get(0))));
                    }
                    ?? r2 = zzajkVar;
                    if (this.zzr) {
                        if (zzd != null) {
                            r2 = zzd;
                        } else if (zzajkVar == null) {
                            r2 = th;
                        }
                        if (r2 == 0) {
                            zzer zzerVar2 = this.zzb;
                            zzaevVar.zzi(zzerVar2.zzi(), 0, 4);
                            zzerVar2.zzh(0);
                            zzafrVar.zza(zzerVar2.zzB());
                            r2 = new zzajk(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar.zzf, zzafrVar.zzc, false);
                        }
                        this.zzh.zzN(r2.zza());
                        zzajqVar = r2;
                    } else {
                        zzajqVar = new zzajq();
                    }
                    this.zzq = zzajqVar;
                    this.zzg.zzw(zzajqVar);
                    zzt zztVar = new zzt();
                    zztVar.zzl("audio/mpeg");
                    zztVar.zzm(zzafrVar.zzb);
                    zztVar.zzn(4096);
                    zztVar.zzE(zzafrVar.zze);
                    zztVar.zzF(zzafrVar.zzd);
                    zzafn zzafnVar2 = this.zzd;
                    zztVar.zzH(zzafnVar2.zza);
                    zztVar.zzI(zzafnVar2.zzb);
                    zztVar.zzk(this.zzk);
                    if (this.zzq.zzg() != -2147483647) {
                        zztVar.zzh(this.zzq.zzg());
                    }
                    this.zzi.zzz(zztVar.zzM());
                    this.zzn = zzaevVar.zzn();
                }
                zzajt zza2 = zzajt.zza(zzafrVar, zzerVar);
                zzafnVar = this.zzd;
                if (!zzafnVar.zzb() && (i8 = zza2.zzd) != -1 && (i9 = zza2.zze) != -1) {
                    zzafnVar.zza = i8;
                    zzafnVar.zzb = i9;
                }
                long zzn2 = zzaevVar.zzn();
                if (zzaevVar.zzo() != -1) {
                    long j6 = zza2.zzc;
                    if (j6 != -1) {
                        long j7 = j6 + zzn2;
                        if (zzaevVar.zzo() != j7) {
                            j5 = -1;
                            long zzo = zzaevVar.zzo();
                            th = null;
                            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + String.valueOf(zzo).length() + 53 + 20);
                            i5 = -1;
                            u.t(sb, "Data size mismatch between stream (", zzo, ") and Xing frame (");
                            sb.append(j7);
                            sb.append("), using Xing value.");
                            zzee.zzb("Mp3Extractor", sb.toString());
                            zzaevVar.zzf(zzafrVar.zzc);
                            if (i6 != 1483304551) {
                                zzajkVar = zzaju.zzd(zza2, zzn2);
                            } else {
                                long zzo2 = zzaevVar.zzo();
                                long zzb = zza2.zzb();
                                if (zzb != -9223372036854775807L) {
                                    long j8 = zza2.zzc;
                                    if (j8 != j5) {
                                        zzo2 = zzn2 + j8;
                                        i7 = zza2.zza.zzc;
                                    } else if (zzo2 != j5) {
                                        j8 = zzo2 - zzn2;
                                        i7 = zza2.zza.zzc;
                                    }
                                    long j9 = j8 - i7;
                                    long j10 = zzo2;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    zzajkVar = new zzajk(j10, zzn2 + zza2.zza.zzc, zzgxz.zza(zzfj.zzt(j9, 8000000L, zzb, roundingMode)), zzgxz.zza(zzgxu.zza(j9, zza2.zzb, roundingMode)), false);
                                }
                                zzajkVar = th;
                            }
                            zzapVar = this.zzk;
                            zzn = zzaevVar.zzn();
                            if (zzapVar == null) {
                                zzais zzaisVar2 = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                                zzd = zzajm.zzd(zzn, zzaiqVar, zzaisVar2 != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar2.zzb.get(0))));
                                ?? r22 = zzajkVar;
                                if (this.zzr) {
                                }
                                this.zzq = zzajqVar;
                                this.zzg.zzw(zzajqVar);
                                zzt zztVar2 = new zzt();
                                zztVar2.zzl("audio/mpeg");
                                zztVar2.zzm(zzafrVar.zzb);
                                zztVar2.zzn(4096);
                                zztVar2.zzE(zzafrVar.zze);
                                zztVar2.zzF(zzafrVar.zzd);
                                zzafn zzafnVar22 = this.zzd;
                                zztVar2.zzH(zzafnVar22.zza);
                                zztVar2.zzI(zzafnVar22.zzb);
                                zztVar2.zzk(this.zzk);
                                if (this.zzq.zzg() != -2147483647) {
                                }
                                this.zzi.zzz(zztVar2.zzM());
                                this.zzn = zzaevVar.zzn();
                            }
                            zzd = th;
                            ?? r222 = zzajkVar;
                            if (this.zzr) {
                            }
                            this.zzq = zzajqVar;
                            this.zzg.zzw(zzajqVar);
                            zzt zztVar22 = new zzt();
                            zztVar22.zzl("audio/mpeg");
                            zztVar22.zzm(zzafrVar.zzb);
                            zztVar22.zzn(4096);
                            zztVar22.zzE(zzafrVar.zze);
                            zztVar22.zzF(zzafrVar.zzd);
                            zzafn zzafnVar222 = this.zzd;
                            zztVar22.zzH(zzafnVar222.zza);
                            zztVar22.zzI(zzafnVar222.zzb);
                            zztVar22.zzk(this.zzk);
                            if (this.zzq.zzg() != -2147483647) {
                            }
                            this.zzi.zzz(zztVar22.zzM());
                            this.zzn = zzaevVar.zzn();
                        }
                    }
                }
                i5 = -1;
                j5 = -1;
                th = null;
                zzaevVar.zzf(zzafrVar.zzc);
                if (i6 != 1483304551) {
                }
                zzapVar = this.zzk;
                zzn = zzaevVar.zzn();
                if (zzapVar == null) {
                }
                zzd = th;
                ?? r2222 = zzajkVar;
                if (this.zzr) {
                }
                this.zzq = zzajqVar;
                this.zzg.zzw(zzajqVar);
                zzt zztVar222 = new zzt();
                zztVar222.zzl("audio/mpeg");
                zztVar222.zzm(zzafrVar.zzb);
                zztVar222.zzn(4096);
                zztVar222.zzE(zzafrVar.zze);
                zztVar222.zzF(zzafrVar.zzd);
                zzafn zzafnVar2222 = this.zzd;
                zztVar222.zzH(zzafnVar2222.zza);
                zztVar222.zzI(zzafnVar2222.zzb);
                zztVar222.zzk(this.zzk);
                if (this.zzq.zzg() != -2147483647) {
                }
                this.zzi.zzz(zztVar222.zzM());
                this.zzn = zzaevVar.zzn();
            }
            if (zzerVar.zze() >= 40) {
                zzerVar.zzh(36);
                if (zzerVar.zzB() == 1447187017) {
                    i6 = 1447187017;
                    if (i6 != 1231971951) {
                    }
                    zzajt zza22 = zzajt.zza(zzafrVar, zzerVar);
                    zzafnVar = this.zzd;
                    if (!zzafnVar.zzb()) {
                        zzafnVar.zza = i8;
                        zzafnVar.zzb = i9;
                    }
                    long zzn22 = zzaevVar.zzn();
                    if (zzaevVar.zzo() != -1) {
                    }
                    i5 = -1;
                    j5 = -1;
                    th = null;
                    zzaevVar.zzf(zzafrVar.zzc);
                    if (i6 != 1483304551) {
                    }
                    zzapVar = this.zzk;
                    zzn = zzaevVar.zzn();
                    if (zzapVar == null) {
                    }
                    zzd = th;
                    ?? r22222 = zzajkVar;
                    if (this.zzr) {
                    }
                    this.zzq = zzajqVar;
                    this.zzg.zzw(zzajqVar);
                    zzt zztVar2222 = new zzt();
                    zztVar2222.zzl("audio/mpeg");
                    zztVar2222.zzm(zzafrVar.zzb);
                    zztVar2222.zzn(4096);
                    zztVar2222.zzE(zzafrVar.zze);
                    zztVar2222.zzF(zzafrVar.zzd);
                    zzafn zzafnVar22222 = this.zzd;
                    zztVar2222.zzH(zzafnVar22222.zza);
                    zztVar2222.zzI(zzafnVar22222.zzb);
                    zztVar2222.zzk(this.zzk);
                    if (this.zzq.zzg() != -2147483647) {
                    }
                    this.zzi.zzz(zztVar2222.zzM());
                    this.zzn = zzaevVar.zzn();
                }
            }
            i6 = 0;
            if (i6 != 1231971951) {
            }
            zzajt zza222 = zzajt.zza(zzafrVar, zzerVar);
            zzafnVar = this.zzd;
            if (!zzafnVar.zzb()) {
            }
            long zzn222 = zzaevVar.zzn();
            if (zzaevVar.zzo() != -1) {
            }
            i5 = -1;
            j5 = -1;
            th = null;
            zzaevVar.zzf(zzafrVar.zzc);
            if (i6 != 1483304551) {
            }
            zzapVar = this.zzk;
            zzn = zzaevVar.zzn();
            if (zzapVar == null) {
            }
            zzd = th;
            ?? r222222 = zzajkVar;
            if (this.zzr) {
            }
            this.zzq = zzajqVar;
            this.zzg.zzw(zzajqVar);
            zzt zztVar22222 = new zzt();
            zztVar22222.zzl("audio/mpeg");
            zztVar22222.zzm(zzafrVar.zzb);
            zztVar22222.zzn(4096);
            zztVar22222.zzE(zzafrVar.zze);
            zztVar22222.zzF(zzafrVar.zzd);
            zzafn zzafnVar222222 = this.zzd;
            zztVar22222.zzH(zzafnVar222222.zza);
            zztVar22222.zzI(zzafnVar222222.zzb);
            zztVar22222.zzk(this.zzk);
            if (this.zzq.zzg() != -2147483647) {
            }
            this.zzi.zzz(zztVar22222.zzM());
            this.zzn = zzaevVar.zzn();
        } else {
            i5 = -1;
            j2 = -9223372036854775807L;
            th = null;
            long j11 = this.zzn;
            if (j11 != 0) {
                long zzn3 = zzaevVar.zzn();
                if (zzn3 < j11) {
                    zzaevVar.zzf((int) (j11 - zzn3));
                }
            }
        }
        int i11 = this.zzp;
        if (i11 == 0) {
            zzaevVar.zzl();
            if (zzl(zzaevVar)) {
                return i5;
            }
            zzer zzerVar3 = this.zzb;
            zzerVar3.zzh(0);
            int zzB = zzerVar3.zzB();
            if (!zzn(zzB, this.zzj) || zzafs.zza(zzB) == i5) {
                zzaevVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzafr zzafrVar2 = this.zzc;
            zzafrVar2.zza(zzB);
            if (this.zzl == j2) {
                this.zzl = this.zzq.zze(zzaevVar.zzn());
            }
            i11 = zzafrVar2.zzc;
            this.zzp = i11;
            this.zzo = zzaevVar.zzn() + i11;
            if (this.zzq instanceof zzajl) {
                zzj(this.zzm + zzafrVar2.zzg);
                throw th;
            }
        }
        int zza3 = this.zzi.zza(zzaevVar, i11, true);
        if (zza3 == -1) {
            return -1;
        }
        int i12 = this.zzp - zza3;
        this.zzp = i12;
        if (i12 > 0) {
            return 0;
        }
        this.zzi.zze(zzj(this.zzm), 1, this.zzc.zzc, 0, null);
        this.zzm += r1.zzg;
        this.zzp = 0;
        return 0;
    }

    private final long zzj(long j2) {
        zzafr zzafrVar = this.zzc;
        return ((j2 * 1000000) / zzafrVar.zzd) + this.zzl;
    }

    private final boolean zzk(zzaev zzaevVar, boolean z4) {
        int i5;
        int i6;
        int zza2;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zza3 = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i5 = (int) zzaevVar.zzm();
            if (!z4) {
                zzaevVar.zzf(i5);
            }
            i6 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i7 = i6;
        int i8 = i7;
        while (true) {
            if (!zzl(zzaevVar)) {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int zzB = zzerVar.zzB();
                if ((i6 == 0 || zzn(zzB, i6)) && (zza2 = zzafs.zza(zzB)) != -1) {
                    i7++;
                    if (i7 != 1) {
                        if (i7 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i6 = zzB;
                    }
                    zzaevVar.zzk(zza2 - 4);
                } else {
                    int i9 = i8 + 1;
                    if (i8 == 131072) {
                        if (z4) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z4) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(i5 + i9);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i7 = 0;
                    i8 = i9;
                    i6 = 0;
                }
            } else if (i7 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z4) {
            zzaevVar.zzf(i5 + i8);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i6;
        return true;
    }

    private final boolean zzl(zzaev zzaevVar) {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long zzf = zzajrVar.zzf();
            if (zzf != -1 && zzaevVar.zzm() > zzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j2 = this.zzo;
            if (j2 == -1 || j2 == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajk) this.zzq).zzh(this.zzo);
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i5, long j2) {
        return ((long) (i5 & (-128000))) == (j2 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzu = zzaexVar.zzu(0, 1);
        this.zzh = zzu;
        this.zzi = zzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        this.zzh.getClass();
        String str = zzfj.zza;
        int zzi = zzi(zzaevVar);
        if (zzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        if (this.zzq instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }

    public zzajp(int i5) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }
}
