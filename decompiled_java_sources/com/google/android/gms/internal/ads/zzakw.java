package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;
    private long[][] zzz;

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    public static /* synthetic */ long zzh(zzalf zzalfVar, long j2, long j5) {
        int zzl = zzl(zzalfVar, j2);
        return zzl == -1 ? j5 : Math.min(zzalfVar.zzc[zzl], j5);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j2) {
        zzap zzapVar;
        int i5;
        boolean z4;
        long j5;
        ArrayDeque arrayDeque;
        int i6;
        List list;
        zzakv zzakvVar;
        zzagh zzaghVar;
        long j6;
        int i7;
        zzakv zzakvVar2;
        long j7;
        zzap zzapVar2;
        zzap zzapVar3;
        zzap zzapVar4;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfu) arrayDeque2.peek()).zza != j2) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque2.pop();
            if (zzfuVar.zzd == 1836019574) {
                zzfu zzd = zzfuVar.zzd(1835365473);
                new ArrayList();
                zzap zze = zzd != null ? zzakh.zze(zzd) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = this.zzA == 1;
                zzafn zzafnVar = new zzafn();
                zzfv zzc = zzfuVar.zzc(1969517665);
                if (zzc != null) {
                    zzapVar = zzakh.zzc(zzc);
                    zzafnVar.zza(zzapVar);
                } else {
                    zzapVar = null;
                }
                zzfv zzc2 = zzfuVar.zzc(1836476516);
                zzc2.getClass();
                ArrayList arrayList3 = arrayList2;
                zzap zzapVar5 = new zzap(-9223372036854775807L, zzakh.zzd(zzc2.zza));
                int i8 = this.zzc;
                if (1 != (i8 & 1)) {
                    i5 = i8;
                    z4 = false;
                } else {
                    i5 = i8;
                    z4 = true;
                }
                int i9 = i5;
                zzap zzapVar6 = zzapVar;
                zzap zzapVar7 = zzapVar5;
                List zzb = zzakh.zzb(zzfuVar, zzafnVar, -9223372036854775807L, null, z4, z5, zzakt.zza, false);
                String zza2 = zzakr.zza(zzb);
                long j8 = -9223372036854775807L;
                long j9 = -9223372036854775807L;
                int i10 = 0;
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    j5 = 0;
                    if (i10 >= zzb.size()) {
                        break;
                    }
                    zzalf zzalfVar = (zzalf) zzb.get(i10);
                    int i13 = zzalfVar.zzb;
                    if (i13 == 0) {
                        arrayDeque = arrayDeque2;
                        list = zzb;
                        i6 = i10;
                        arrayList = arrayList3;
                        j7 = j9;
                        zzapVar3 = zzapVar6;
                        zzapVar4 = zzapVar7;
                    } else {
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzx;
                        int i14 = i11 + 1;
                        arrayDeque = arrayDeque2;
                        int i15 = zzalcVar.zzb;
                        zzakv zzakvVar3 = new zzakv(zzalcVar, zzalfVar, zzaexVar.zzu(i11, i15));
                        List list2 = zzb;
                        long j10 = zzalcVar.zze;
                        if (j10 == j9) {
                            j10 = zzalfVar.zzi;
                        }
                        i6 = i10;
                        zzagh zzaghVar2 = zzakvVar3.zzc;
                        zzaghVar2.zzN(j10);
                        long max = Math.max(j8, j10);
                        zzv zzvVar = zzalcVar.zzg;
                        list = list2;
                        String str = zzvVar.zzo;
                        int i16 = "audio/true-hd".equals(str) ? zzalfVar.zze * 16 : zzalfVar.zze + 30;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzn(i16);
                        if (i15 == 2) {
                            int i17 = zzvVar.zzf;
                            if ((i9 & 8) != 0) {
                                i17 |= i12 == -1 ? 1 : 2;
                            }
                            zza3.zzg(i17);
                            i15 = 2;
                        }
                        if (zzas.zzb(str)) {
                            boolean z6 = zzalfVar.zzj;
                            if (!z6) {
                                i13 = zzalfVar.zzh.length;
                            }
                            int min = Math.min(i13, 20);
                            zzgrc.zzi(j10 != j9);
                            zzakvVar = zzakvVar3;
                            zzaghVar = zzaghVar2;
                            long min2 = Math.min(j10, 10000000L);
                            int i18 = 0;
                            int i19 = -1;
                            for (int i20 = 0; i20 < min; i20++) {
                                int i21 = z6 ? i20 : zzalfVar.zzh[i20];
                                long j11 = zzalfVar.zzf[i21];
                                if (j11 > min2) {
                                    break;
                                }
                                if (j11 >= 0 && (i7 = zzalfVar.zzd[i21]) > i18) {
                                    i18 = i7;
                                    i19 = i21;
                                }
                            }
                            if (i19 != -1) {
                                j6 = zzalfVar.zzf[i19];
                                if (j6 == j9) {
                                    zzakvVar2 = zzakvVar;
                                    j7 = j9;
                                    zzapVar2 = new zzap(j7, new zzahx(j6));
                                } else {
                                    zzakvVar2 = zzakvVar;
                                    j7 = j9;
                                    zzapVar2 = null;
                                }
                                zzakq.zzb(i15, zzafnVar, zza3);
                                zzap zzapVar8 = zzvVar.zzl;
                                List list3 = this.zzj;
                                zzap zzapVar9 = !list3.isEmpty() ? null : new zzap(list3);
                                zzapVar3 = zzapVar6;
                                zzapVar4 = zzapVar7;
                                zzakq.zza(i15, zze, zza3, zzapVar8, zzapVar9, zzapVar3, zzapVar4, zzapVar2);
                                zza3.zzl(zza2);
                                if (Objects.equals(str, "audio/mpeg")) {
                                    zzaghVar.zzz(zza3.zzM());
                                } else {
                                    zzakvVar2.zzf = zza3.zzM();
                                }
                                if (i15 == 2 && i12 == -1) {
                                    i12 = arrayList3.size();
                                }
                                arrayList = arrayList3;
                                arrayList.add(zzakvVar2);
                                i11 = i14;
                                j8 = max;
                            }
                        } else {
                            zzakvVar = zzakvVar3;
                            zzaghVar = zzaghVar2;
                        }
                        j6 = j9;
                        if (j6 == j9) {
                        }
                        zzakq.zzb(i15, zzafnVar, zza3);
                        zzap zzapVar82 = zzvVar.zzl;
                        List list32 = this.zzj;
                        if (!list32.isEmpty()) {
                        }
                        zzapVar3 = zzapVar6;
                        zzapVar4 = zzapVar7;
                        zzakq.zza(i15, zze, zza3, zzapVar82, zzapVar9, zzapVar3, zzapVar4, zzapVar2);
                        zza3.zzl(zza2);
                        if (Objects.equals(str, "audio/mpeg")) {
                        }
                        if (i15 == 2) {
                            i12 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzakvVar2);
                        i11 = i14;
                        j8 = max;
                    }
                    arrayList3 = arrayList;
                    zzapVar6 = zzapVar3;
                    j9 = j7;
                    zzapVar7 = zzapVar4;
                    arrayDeque2 = arrayDeque;
                    i10 = i6 + 1;
                    zzb = list;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i22 = -1;
                zzakv[] zzakvVarArr = (zzakv[]) arrayList3.toArray(new zzakv[0]);
                this.zzy = zzakvVarArr;
                int length = zzakvVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i23 = 0; i23 < zzakvVarArr.length; i23++) {
                    jArr[i23] = new long[zzakvVarArr[i23].zzb.zzb];
                    jArr2[i23] = zzakvVarArr[i23].zzb.zzf[0];
                }
                int i24 = 0;
                while (i24 < zzakvVarArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i25 = i22;
                    for (int i26 = 0; i26 < zzakvVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            long j13 = jArr2[i26];
                            if (j13 <= j12) {
                                i25 = i26;
                                j12 = j13;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j5;
                    zzalf zzalfVar2 = zzakvVarArr[i25].zzb;
                    zzakv[] zzakvVarArr2 = zzakvVarArr;
                    j5 += zzalfVar2.zzd[i27];
                    int i28 = i27 + 1;
                    iArr[i25] = i28;
                    if (i28 < jArr3.length) {
                        jArr2[i25] = zzalfVar2.zzf[i28];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                    zzakvVarArr = zzakvVarArr2;
                    i22 = -1;
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzaku(j8, this.zzy, i12));
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfu) arrayDeque2.peek()).zzb(zzfuVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzalf zzalfVar, long j2) {
        int zza2 = zzalfVar.zza(j2);
        return zza2 == -1 ? zzalfVar.zzb(j2) : zza2;
    }

    private static int zzm(int i5) {
        if (i5 != 1751476579) {
            return i5 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzagc zzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzguf.zzj(zzb) : zzguf.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x04af, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0097 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        long j2;
        long j5;
        zzagh zzaghVar;
        int i5;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        while (true) {
            int i8 = this.zzl;
            long j6 = 0;
            if (i8 == 0) {
                if (this.zzo == 0) {
                    zzer zzerVar = this.zzg;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzagh zzu = this.zzx.zzu(0, 4);
                        zzahv zzahvVar = this.zzB;
                        zzap zzapVar = zzahvVar == null ? null : new zzap(-9223372036854775807L, zzahvVar);
                        zzt zztVar = new zzt();
                        zztVar.zzk(zzapVar);
                        zzu.zzz(zztVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzafx(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzerVar.zzh(0);
                    this.zzn = zzerVar.zzz();
                    this.zzm = zzerVar.zzB();
                }
                long j7 = this.zzn;
                if (j7 == 1) {
                    zzer zzerVar2 = this.zzg;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzerVar2.zzJ();
                } else if (j7 == 0) {
                    long zzo = zzaevVar.zzo();
                    if (zzo == -1) {
                        zzfu zzfuVar = (zzfu) this.zzh.peek();
                        zzo = zzfuVar != null ? zzfuVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzn = (zzo - zzaevVar.zzn()) + this.zzo;
                    }
                }
                long j8 = this.zzn;
                int i9 = this.zzo;
                long j9 = i9;
                if (j8 < j9) {
                    if (this.zzm != 1718773093 || i9 != 8) {
                        break;
                    }
                    this.zzn = j9;
                    i9 = 8;
                }
                int i10 = this.zzm;
                if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069) {
                    long zzn = zzaevVar.zzn();
                    long j10 = this.zzn;
                    long j11 = zzn + j10;
                    long j12 = this.zzo;
                    if (j10 != j12 && this.zzm == 1835365473) {
                        zzer zzerVar3 = this.zzf;
                        zzerVar3.zza(8);
                        zzaevVar.zzi(zzerVar3.zzi(), 0, 8);
                        zzakh.zzf(zzerVar3);
                        zzaevVar.zzf(zzerVar3.zzg());
                        zzaevVar.zzl();
                    }
                    long j13 = j11 - j12;
                    this.zzh.push(new zzfu(this.zzm, j13));
                    if (this.zzn == this.zzo) {
                        zzk(j13);
                    } else {
                        zzj();
                    }
                } else if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                    boolean z6 = false;
                    zzgrc.zzi(z6);
                    zzgrc.zzi(this.zzn <= 2147483647L);
                    zzer zzerVar4 = new zzer((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzerVar4.zzi(), 0, 8);
                    this.zzp = zzerVar4;
                    this.zzl = 1;
                } else {
                    long zzn2 = zzaevVar.zzn();
                    long j14 = this.zzo;
                    long j15 = zzn2 - j14;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzahv(0L, j15, -9223372036854775807L, j15 + j14, this.zzn - j14);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        this.zzi.zzb(zzaevVar, zzafvVar, this.zzj);
                        if (zzafvVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long zzn3 = zzaevVar.zzn();
                    int i11 = this.zzq;
                    if (i11 == -1) {
                        int i12 = -1;
                        int i13 = -1;
                        boolean z7 = true;
                        boolean z8 = true;
                        long j16 = Long.MAX_VALUE;
                        long j17 = Long.MAX_VALUE;
                        long j18 = Long.MAX_VALUE;
                        int i14 = 0;
                        j5 = 262144;
                        while (true) {
                            zzakv[] zzakvVarArr = this.zzy;
                            if (i14 >= zzakvVarArr.length) {
                                break;
                            }
                            zzakv zzakvVar = zzakvVarArr[i14];
                            int i15 = zzakvVar.zze;
                            zzalf zzalfVar = zzakvVar.zzb;
                            long j19 = j6;
                            if (i15 != zzalfVar.zzb) {
                                long j20 = zzalfVar.zzc[i15];
                                long[][] jArr = this.zzz;
                                jArr.getClass();
                                long j21 = jArr[i14][i15];
                                long j22 = j20 - zzn3;
                                boolean z9 = j22 < j19 || j22 >= 262144;
                                if (z9) {
                                    z4 = z8;
                                } else {
                                    if (!z8) {
                                        z4 = false;
                                    }
                                    z8 = z9;
                                    i13 = i14;
                                    j17 = j21;
                                    j18 = j22;
                                    if (j21 < j16) {
                                        z7 = z9;
                                        i12 = i14;
                                        j16 = j21;
                                    }
                                }
                                if (z9 != z4 || j22 >= j18) {
                                    z8 = z4;
                                    if (j21 < j16) {
                                    }
                                }
                                z8 = z9;
                                i13 = i14;
                                j17 = j21;
                                j18 = j22;
                                if (j21 < j16) {
                                }
                            }
                            i14++;
                            j6 = j19;
                        }
                        j2 = j6;
                        i11 = (j16 == Long.MAX_VALUE || !z7 || j17 < j16 + 10485760) ? i13 : i12;
                        this.zzq = i11;
                        if (i11 == -1) {
                            return -1;
                        }
                    } else {
                        j2 = 0;
                        j5 = 262144;
                    }
                    zzakv zzakvVar2 = this.zzy[i11];
                    zzagh zzaghVar2 = zzakvVar2.zzc;
                    int i16 = zzakvVar2.zze;
                    zzalf zzalfVar2 = zzakvVar2.zzb;
                    long j23 = zzalfVar2.zzc[i16] + this.zzw;
                    int[] iArr = zzalfVar2.zzd;
                    int i17 = iArr[i16];
                    zzagi zzagiVar = zzakvVar2.zzd;
                    zzagh zzaghVar3 = zzaghVar2;
                    int i18 = 0;
                    long j24 = (j23 - zzn3) + this.zzr;
                    if (j24 < j2 || j24 >= j5) {
                        zzafvVar.zza = j23;
                        return 1;
                    }
                    zzalc zzalcVar = zzakvVar2.zza;
                    if (zzalcVar.zzh == 1) {
                        j24 += 8;
                        i17 -= 8;
                    }
                    int i19 = i17;
                    zzaevVar.zzf((int) j24);
                    zzv zzvVar = zzalcVar.zzg;
                    String str = zzvVar.zzo;
                    if (!Objects.equals(str, "video/avc")) {
                        Objects.equals(str, "video/hevc");
                    }
                    this.zzu = true;
                    int i20 = zzalcVar.zzk;
                    if (i20 == 0) {
                        zzaghVar = zzaghVar3;
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzer zzerVar5 = this.zzf;
                                zzady.zzc(i19, zzerVar5);
                                zzaghVar.zzc(zzerVar5, 7);
                                this.zzs += 7;
                            }
                            i19 += 7;
                        } else if (zzakvVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVar2 = zzakvVar2.zzf;
                            zzer zzerVar6 = this.zzf;
                            zzerVar6.zza(4);
                            zzaevVar.zzi(zzerVar6.zzi(), 0, 4);
                            zzaevVar.zzl();
                            zzafr zzafrVar = new zzafr();
                            if (zzafrVar.zza(zzerVar6.zzB()) && !Objects.equals(zzvVar2.zzo, zzafrVar.zzb)) {
                                zzt zza2 = zzvVar2.zza();
                                String str2 = zzafrVar.zzb;
                                str2.getClass();
                                zza2.zzm(str2);
                                zzvVar2 = zza2.zzM();
                            }
                            zzaghVar.zzz(zzvVar2);
                            zzakvVar2.zzf = null;
                        } else if (zzagiVar != null) {
                            zzagiVar.zzb(zzaevVar);
                        }
                        while (true) {
                            int i21 = this.zzs;
                            if (i21 >= i19) {
                                break;
                            }
                            int zza3 = zzaghVar.zza(zzaevVar, i19 - i21, false);
                            this.zzr += zza3;
                            this.zzs += zza3;
                            this.zzt -= zza3;
                        }
                    } else {
                        zzer zzerVar7 = this.zze;
                        byte[] zzi = zzerVar7.zzi();
                        zzi[0] = 0;
                        zzi[1] = 0;
                        zzi[2] = 0;
                        int i22 = 4 - i20;
                        i19 += i22;
                        while (this.zzs < i19) {
                            int i23 = this.zzt;
                            if (i23 == 0) {
                                if (this.zzu || zzgm.zzc(zzvVar) + i20 > iArr[i16] - this.zzr) {
                                    i6 = i20;
                                    i7 = i18;
                                } else {
                                    i7 = zzgm.zzc(zzvVar);
                                    i6 = i20 + i7;
                                }
                                zzaevVar.zzc(zzi, i22, i6);
                                this.zzr += i6;
                                int i24 = i18;
                                zzerVar7.zzh(i24);
                                int zzB = zzerVar7.zzB();
                                if (zzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = zzB - i7;
                                zzer zzerVar8 = this.zzd;
                                zzerVar8.zzh(i24);
                                i5 = i20;
                                zzagh zzaghVar4 = zzaghVar3;
                                zzaghVar4.zzc(zzerVar8, 4);
                                this.zzs += 4;
                                if (i7 > 0) {
                                    zzaghVar4.zzc(zzerVar7, i7);
                                    this.zzs += i7;
                                    if (zzgm.zzd(zzi, 4, i7, zzvVar)) {
                                        this.zzu = true;
                                        zzaghVar3 = zzaghVar4;
                                        i20 = i5;
                                        i18 = 0;
                                    }
                                }
                                zzaghVar3 = zzaghVar4;
                            } else {
                                i5 = i20;
                                int zza4 = zzaghVar3.zza(zzaevVar, i23, i18);
                                this.zzr += zza4;
                                this.zzs += zza4;
                                this.zzt -= zza4;
                            }
                            i20 = i5;
                            i18 = 0;
                        }
                        zzaghVar = zzaghVar3;
                    }
                    int i25 = i19;
                    long j25 = zzalfVar2.zzf[i16];
                    int i26 = zzalfVar2.zzg[i16];
                    if (!this.zzu) {
                        i26 |= 67108864;
                    }
                    int i27 = i26;
                    if (zzagiVar != null) {
                        zzagh zzaghVar5 = zzaghVar;
                        zzagiVar.zzc(zzaghVar5, j25, i27, i25, 0, null);
                        if (i16 + 1 == zzalfVar2.zzb) {
                            zzagiVar.zzd(zzaghVar5, null);
                        }
                    } else {
                        zzaghVar.zze(j25, i27, i25, 0, null);
                    }
                    zzakvVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j26 = this.zzn - this.zzo;
                long zzn4 = zzaevVar.zzn() + j26;
                zzer zzerVar9 = this.zzp;
                if (zzerVar9 != null) {
                    zzaevVar.zzc(zzerVar9.zzi(), this.zzo, (int) j26);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzerVar9.zzh(8);
                        int zzm = zzm(zzerVar9.zzB());
                        if (zzm == 0) {
                            zzerVar9.zzk(4);
                            while (true) {
                                if (zzerVar9.zzd() <= 0) {
                                    zzm = 0;
                                    break;
                                }
                                zzm = zzm(zzerVar9.zzB());
                                if (zzm != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzA = zzm;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfu) arrayDeque.peek()).zza(new zzfv(this.zzm, zzerVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j26 < 262144) {
                        zzaevVar.zzf((int) j26);
                    } else {
                        zzafvVar.zza = zzaevVar.zzn() + j26;
                        z5 = true;
                        zzk(zzn4);
                        if (z5 && this.zzl != 2) {
                            return 1;
                        }
                    }
                }
                z5 = false;
                zzk(zzn4);
                if (z5) {
                    return 1;
                }
                continue;
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j2 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int zza2 = zzalfVar.zza(j5);
            if (zza2 == -1) {
                zza2 = zzalfVar.zzb(j5);
            }
            zzakvVar.zze = zza2;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzakw(zzamd zzamdVar, int i5) {
        this.zzb = zzamdVar;
        this.zzc = i5;
        this.zzk = zzguf.zzi();
        this.zzl = (i5 & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }
}
