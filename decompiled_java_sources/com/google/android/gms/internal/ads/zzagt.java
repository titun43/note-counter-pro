package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzagt implements zzaeu {
    private final zzer zza;
    private final zzags zzb;
    private final boolean zzc;
    private final zzamd zzd;
    private int zze;
    private zzaex zzf;
    private zzagu zzg;
    private long zzh;
    private zzagw[] zzi;
    private long zzj;
    private zzagw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzagt() {
        this(1, zzamd.zza);
    }

    private final zzagw zzi(int i5) {
        for (zzagw zzagwVar : this.zzi) {
            if (zzagwVar.zzc(i5)) {
                return zzagwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzer zzerVar = this.zza;
        zzaevVar.zzi(zzerVar.zzi(), 0, 12);
        zzerVar.zzh(0);
        if (zzerVar.zzC() != 1179011410) {
            return false;
        }
        zzerVar.zzk(4);
        return zzerVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaexVar = new zzamg(zzaexVar, this.zzd);
        }
        this.zzf = zzaexVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        boolean z4;
        ?? r20;
        long j2;
        long j5 = this.zzj;
        if (j5 != -1) {
            long zzn = zzaevVar.zzn();
            if (j5 < zzn || j5 > 262144 + zzn) {
                zzafvVar.zza = j5;
                z4 = true;
                this.zzj = -1L;
                if (!z4) {
                    return 1;
                }
                int i5 = this.zze;
                zzagw zzagwVar = null;
                if (i5 == 0) {
                    if (!zza(zzaevVar)) {
                        throw zzat.zzb("AVI Header List not found", null);
                    }
                    zzaevVar.zzf(12);
                    this.zze = 1;
                    return 0;
                }
                if (i5 == 1) {
                    zzer zzerVar = this.zza;
                    zzaevVar.zzc(zzerVar.zzi(), 0, 12);
                    zzerVar.zzh(0);
                    zzags zzagsVar = this.zzb;
                    zzagsVar.zza(zzerVar);
                    int i6 = zzagsVar.zza;
                    if (i6 != 1414744396) {
                        StringBuilder sb = new StringBuilder(u.b(i6, 22));
                        sb.append("LIST expected, found: ");
                        sb.append(i6);
                        throw zzat.zzb(sb.toString(), null);
                    }
                    int zzC = zzerVar.zzC();
                    if (zzC == 1819436136) {
                        this.zzl = zzagsVar.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(u.b(zzC, 22));
                    sb2.append("hdrl expected, found: ");
                    sb2.append(zzC);
                    throw zzat.zzb(sb2.toString(), null);
                }
                if (i5 == 2) {
                    int i7 = this.zzl - 4;
                    zzer zzerVar2 = new zzer(i7);
                    zzaevVar.zzc(zzerVar2.zzi(), 0, i7);
                    zzagx zzb = zzagx.zzb(1819436136, zzerVar2);
                    if (zzb.zza() != 1819436136) {
                        int zza = zzb.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(zza);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    zzagu zzaguVar = (zzagu) zzb.zzc(zzagu.class);
                    if (zzaguVar == null) {
                        throw zzat.zzb("AviHeader not found", null);
                    }
                    this.zzg = zzaguVar;
                    this.zzh = zzaguVar.zzc * zzaguVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzguf zzgufVar = zzb.zza;
                    int size = zzgufVar.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size) {
                        zzagq zzagqVar = (zzagq) zzgufVar.get(i8);
                        if (zzagqVar.zza() == 1819440243) {
                            zzagx zzagxVar = (zzagx) zzagqVar;
                            int i10 = i9 + 1;
                            zzagv zzagvVar = (zzagv) zzagxVar.zzc(zzagv.class);
                            zzagy zzagyVar = (zzagy) zzagxVar.zzc(zzagy.class);
                            if (zzagvVar == null) {
                                zzee.zzc("AviExtractor", "Missing Stream Header");
                            } else if (zzagyVar == null) {
                                zzee.zzc("AviExtractor", "Missing Stream Format");
                            } else {
                                long zzd = zzagvVar.zzd();
                                zzv zzvVar = zzagyVar.zza;
                                zzt zza2 = zzvVar.zza();
                                zza2.zzb(i9);
                                int i11 = zzagvVar.zze;
                                if (i11 != 0) {
                                    zza2.zzn(i11);
                                }
                                zzagz zzagzVar = (zzagz) zzagxVar.zzc(zzagz.class);
                                if (zzagzVar != null) {
                                    zza2.zzc(zzagzVar.zza);
                                }
                                int zzf = zzas.zzf(zzvVar.zzo);
                                if (zzf != 1) {
                                    if (zzf == 2) {
                                        zzf = 2;
                                    } else {
                                        zzagwVar = null;
                                    }
                                }
                                zzagh zzu = this.zzf.zzu(i9, zzf);
                                zzu.zzz(zza2.zzM());
                                zzu.zzN(zzd);
                                this.zzh = Math.max(this.zzh, zzd);
                                zzagwVar = new zzagw(i9, zzagvVar, zzu);
                            }
                            if (zzagwVar != null) {
                                arrayList.add(zzagwVar);
                            }
                            i9 = i10;
                        }
                        i8++;
                        zzagwVar = null;
                    }
                    this.zzi = (zzagw[]) arrayList.toArray(new zzagw[0]);
                    this.zzf.zzv();
                    this.zze = 3;
                    return 0;
                }
                if (i5 == 3) {
                    long j6 = this.zzm;
                    if (j6 != -1 && zzaevVar.zzn() != j6) {
                        this.zzj = j6;
                        return 0;
                    }
                    zzer zzerVar3 = this.zza;
                    zzaevVar.zzi(zzerVar3.zzi(), 0, 12);
                    zzaevVar.zzl();
                    zzerVar3.zzh(0);
                    zzags zzagsVar2 = this.zzb;
                    zzagsVar2.zza(zzerVar3);
                    int zzC2 = zzerVar3.zzC();
                    int i12 = zzagsVar2.zza;
                    if (i12 == 1179011410) {
                        zzaevVar.zzf(12);
                        return 0;
                    }
                    if (i12 != 1414744396 || zzC2 != 1769369453) {
                        this.zzj = zzaevVar.zzn() + zzagsVar2.zzb + 8;
                        return 0;
                    }
                    long zzn2 = zzaevVar.zzn();
                    this.zzm = zzn2;
                    long j7 = zzn2 + zzagsVar2.zzb + 8;
                    this.zzn = j7;
                    if (!this.zzp) {
                        zzagu zzaguVar2 = this.zzg;
                        zzaguVar2.getClass();
                        if ((zzaguVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j7;
                            return 0;
                        }
                        this.zzf.zzw(new zzafx(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzaevVar.zzn() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i5 == 4) {
                    zzer zzerVar4 = this.zza;
                    zzaevVar.zzc(zzerVar4.zzi(), 0, 8);
                    zzerVar4.zzh(0);
                    int zzC3 = zzerVar4.zzC();
                    int zzC4 = zzerVar4.zzC();
                    if (zzC3 != 829973609) {
                        this.zzj = zzaevVar.zzn() + zzC4;
                        return 0;
                    }
                    this.zze = 5;
                    this.zzo = zzC4;
                    return 0;
                }
                if (i5 != 5) {
                    if (zzaevVar.zzn() >= this.zzn) {
                        return -1;
                    }
                    zzagw zzagwVar2 = this.zzk;
                    if (zzagwVar2 != null) {
                        if (!zzagwVar2.zze(zzaevVar)) {
                            return 0;
                        }
                        this.zzk = null;
                        return 0;
                    }
                    if ((zzaevVar.zzn() & 1) == 1) {
                        zzaevVar.zzf(1);
                    }
                    zzer zzerVar5 = this.zza;
                    zzaevVar.zzi(zzerVar5.zzi(), 0, 12);
                    zzerVar5.zzh(0);
                    int zzC5 = zzerVar5.zzC();
                    if (zzC5 == 1414744396) {
                        zzerVar5.zzh(8);
                        zzaevVar.zzf(zzerVar5.zzC() != 1769369453 ? 8 : 12);
                        zzaevVar.zzl();
                        return 0;
                    }
                    int zzC6 = zzerVar5.zzC();
                    if (zzC5 == 1263424842) {
                        this.zzj = zzaevVar.zzn() + zzC6 + 8;
                        return 0;
                    }
                    zzaevVar.zzf(8);
                    zzaevVar.zzl();
                    zzagw zzi = zzi(zzC5);
                    if (zzi == null) {
                        this.zzj = zzaevVar.zzn() + zzC6;
                        return 0;
                    }
                    zzi.zzd(zzC6);
                    this.zzk = zzi;
                    return 0;
                }
                zzer zzerVar6 = new zzer(this.zzo);
                zzaevVar.zzc(zzerVar6.zzi(), 0, this.zzo);
                if (zzerVar6.zzd() < 16) {
                    r20 = 0;
                    j2 = 0;
                } else {
                    int zzg = zzerVar6.zzg();
                    zzerVar6.zzk(8);
                    long zzC7 = zzerVar6.zzC();
                    r20 = 0;
                    long j8 = this.zzm;
                    j2 = zzC7 > j8 ? 0L : j8 + 8;
                    zzerVar6.zzh(zzg);
                }
                while (zzerVar6.zzd() >= 16) {
                    int zzC8 = zzerVar6.zzC();
                    int zzC9 = zzerVar6.zzC();
                    long zzC10 = zzerVar6.zzC() + j2;
                    zzerVar6.zzk(4);
                    zzagw zzi2 = zzi(zzC8);
                    if (zzi2 != null) {
                        zzi2.zza(zzC10, (zzC9 & 16) == 16 ? true : r20);
                    }
                }
                zzagw[] zzagwVarArr = this.zzi;
                int length = zzagwVarArr.length;
                for (int i13 = r20; i13 < length; i13++) {
                    zzagwVarArr[i13].zzb();
                }
                this.zzp = true;
                if (this.zzi.length == 0) {
                    this.zzf.zzw(new zzafx(this.zzh, 0L));
                } else {
                    this.zzf.zzw(new zzagr(this, this.zzh));
                }
                this.zze = 6;
                this.zzj = this.zzm;
                return r20;
            }
            zzaevVar.zzf((int) (j5 - zzn));
        }
        z4 = false;
        this.zzj = -1L;
        if (!z4) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzagw zzagwVar : this.zzi) {
            zzagwVar.zzf(j2);
        }
        if (j2 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ zzagw[] zzh() {
        return this.zzi;
    }

    public zzagt(int i5, zzamd zzamdVar) {
        this.zzd = zzamdVar;
        this.zzc = 1 == (i5 ^ 1);
        this.zza = new zzer(12);
        this.zzb = new zzags(null);
        this.zzf = new zzaft();
        this.zzi = new zzagw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
