package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdRequest;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c9, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfj.zzt(r41, 1000000, r11, r47) + com.google.android.gms.internal.ads.zzfj.zzt(r2[0], 1000000, r5.zzc, r47)) < r5.zze) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0753, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0756, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j2) {
        zzap zzapVar;
        int i5;
        List list;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z7;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j2) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque.pop();
            int i27 = zzfuVar.zzd;
            int i28 = 12;
            int i29 = 8;
            if (i27 == 1836019574) {
                zzq zzn = zzn(zzfuVar.zzb);
                zzfu zzd = zzfuVar.zzd(1836475768);
                zzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzd.zzb;
                int size = list2.size();
                int i30 = 0;
                long j5 = -9223372036854775807L;
                while (i30 < size) {
                    zzfv zzfvVar = (zzfv) list2.get(i30);
                    int i31 = zzfvVar.zzd;
                    if (i31 == 1953654136) {
                        zzer zzerVar = zzfvVar.zza;
                        zzerVar.zzh(i28);
                        Pair create = Pair.create(Integer.valueOf(zzerVar.zzB()), new zzaki(zzerVar.zzB() - 1, zzerVar.zzB(), zzerVar.zzB(), zzerVar.zzB()));
                        sparseArray.put(((Integer) create.first).intValue(), (zzaki) create.second);
                    } else if (i31 == 1835362404) {
                        zzer zzerVar2 = zzfvVar.zza;
                        zzerVar2.zzh(8);
                        j5 = zzakh.zza(zzerVar2.zzB()) == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                    }
                    i30++;
                    i28 = 12;
                }
                zzfu zzd2 = zzfuVar.zzd(1835365473);
                zzap zze = zzd2 != null ? zzakh.zze(zzd2) : null;
                zzafn zzafnVar = new zzafn();
                zzfv zzc = zzfuVar.zzc(1969517665);
                if (zzc != null) {
                    zzap zzc2 = zzakh.zzc(zzc);
                    zzafnVar.zza(zzc2);
                    zzapVar = zzc2;
                } else {
                    zzapVar = null;
                }
                zzfv zzc3 = zzfuVar.zzc(1836476516);
                zzc3.getClass();
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzakh.zzd(zzc3.zza));
                List zzb2 = zzakh.zzb(zzfuVar, zzafnVar, j5, zzn, (this.zzd & 16) != 0, false, new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzakj
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzalc) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String zza2 = zzakr.zza(zzb2);
                    int i32 = 0;
                    while (i32 < size2) {
                        zzalf zzalfVar = (zzalf) zzb2.get(i32);
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzI;
                        int i33 = zzalcVar.zzb;
                        zzagh zzu = zzaexVar.zzu(i32, i33);
                        int i34 = size2;
                        SparseArray sparseArray3 = sparseArray2;
                        long j6 = zzalcVar.zze;
                        zzu.zzN(j6);
                        int i35 = i32;
                        zzv zzvVar = zzalcVar.zzg;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzl(zza2);
                        zzakq.zzb(i33, zzafnVar, zza3);
                        zzafn zzafnVar2 = zzafnVar;
                        zzakq.zza(i33, zze, zza3, zzvVar.zzl, zzapVar, zzapVar2);
                        int i36 = zzalcVar.zza;
                        sparseArray3.put(i36, new zzakn(zzu, zzalfVar, zzo(sparseArray, i36), zza3.zzM()));
                        this.zzA = Math.max(this.zzA, j6);
                        i32 = i35 + 1;
                        sparseArray2 = sparseArray3;
                        size2 = i34;
                        zzafnVar = zzafnVar2;
                    }
                    this.zzI.zzv();
                } else {
                    zzgrc.zzi(sparseArray2.size() == size2);
                    for (int i37 = 0; i37 < size2; i37++) {
                        zzalf zzalfVar2 = (zzalf) zzb2.get(i37);
                        int i38 = zzalfVar2.zza.zza;
                        ((zzakn) sparseArray2.get(i38)).zza(zzalfVar2, zzo(sparseArray, i38));
                    }
                }
            } else {
                int i39 = 16;
                int i40 = 0;
                if (i27 == 1836019558) {
                    SparseArray sparseArray4 = this.zzf;
                    int i41 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list3 = zzfuVar.zzc;
                    int size3 = list3.size();
                    int i42 = 0;
                    while (i42 < size3) {
                        zzfu zzfuVar2 = (zzfu) list3.get(i42);
                        if (zzfuVar2.zzd == 1953653094) {
                            zzfv zzc4 = zzfuVar2.zzc(1952868452);
                            zzc4.getClass();
                            zzer zzerVar3 = zzc4.zza;
                            zzerVar3.zzh(i29);
                            int zzB = zzerVar3.zzB();
                            int i43 = zzakh.zza;
                            zzakn zzaknVar = (zzakn) sparseArray4.get(zzerVar3.zzB());
                            if (zzaknVar == null) {
                                zzaknVar = null;
                            } else {
                                if ((zzB & 1) != 0) {
                                    long zzJ = zzerVar3.zzJ();
                                    zzale zzaleVar = zzaknVar.zzb;
                                    zzaleVar.zzb = zzJ;
                                    zzaleVar.zzc = zzJ;
                                }
                                zzaki zzakiVar = zzaknVar.zze;
                                zzaknVar.zzb.zza = new zzaki((zzB & 2) != 0 ? zzerVar3.zzB() - 1 : zzakiVar.zza, (zzB & 8) != 0 ? zzerVar3.zzB() : zzakiVar.zzb, (zzB & 16) != 0 ? zzerVar3.zzB() : zzakiVar.zzc, (zzB & 32) != 0 ? zzerVar3.zzB() : zzakiVar.zzd);
                            }
                            if (zzaknVar == null) {
                                i5 = i41;
                                list = list3;
                                i6 = size3;
                                i7 = i42;
                                i9 = i39;
                                i10 = i40;
                                i8 = 8;
                                z4 = true;
                            } else {
                                zzale zzaleVar2 = zzaknVar.zzb;
                                long j7 = zzaleVar2.zzp;
                                boolean z8 = zzaleVar2.zzq;
                                zzaknVar.zzc();
                                zzaknVar.zzl(true);
                                zzfv zzc5 = zzfuVar2.zzc(1952867444);
                                if (zzc5 == null || (i41 & 2) != 0) {
                                    zzaleVar2.zzp = j7;
                                    zzaleVar2.zzq = z8;
                                } else {
                                    zzer zzerVar4 = zzc5.zza;
                                    zzerVar4.zzh(8);
                                    zzaleVar2.zzp = zzakh.zza(zzerVar4.zzB()) == 1 ? zzerVar4.zzJ() : zzerVar4.zzz();
                                    zzaleVar2.zzq = true;
                                }
                                List list4 = zzfuVar2.zzb;
                                int size4 = list4.size();
                                i5 = i41;
                                int i44 = i40;
                                int i45 = i44;
                                int i46 = i45;
                                while (true) {
                                    i11 = 1953658222;
                                    if (i44 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzfv zzfvVar2 = (zzfv) list4.get(i44);
                                    int i47 = size3;
                                    if (zzfvVar2.zzd == 1953658222) {
                                        zzer zzerVar5 = zzfvVar2.zza;
                                        zzerVar5.zzh(12);
                                        int zzH = zzerVar5.zzH();
                                        if (zzH > 0) {
                                            i46 += zzH;
                                            i45++;
                                        }
                                    }
                                    i44++;
                                    size3 = i47;
                                    list3 = list5;
                                }
                                list = list3;
                                i6 = size3;
                                int i48 = i40;
                                zzaknVar.zzh = i48;
                                zzaknVar.zzg = i48;
                                zzaknVar.zzf = i48;
                                zzaleVar2.zzd = i45;
                                zzaleVar2.zze = i46;
                                if (zzaleVar2.zzg.length < i45) {
                                    zzaleVar2.zzf = new long[i45];
                                    zzaleVar2.zzg = new int[i45];
                                }
                                if (zzaleVar2.zzh.length < i46) {
                                    int i49 = (i46 * 125) / 100;
                                    zzaleVar2.zzh = new int[i49];
                                    zzaleVar2.zzi = new long[i49];
                                    zzaleVar2.zzj = new boolean[i49];
                                    zzaleVar2.zzl = new boolean[i49];
                                }
                                int i50 = 0;
                                int i51 = 0;
                                int i52 = 0;
                                while (true) {
                                    long j8 = 0;
                                    if (i50 >= size4) {
                                        break;
                                    }
                                    zzfv zzfvVar3 = (zzfv) list4.get(i50);
                                    if (zzfvVar3.zzd == i11) {
                                        int i53 = i51 + 1;
                                        zzer zzerVar6 = zzfvVar3.zza;
                                        zzerVar6.zzh(8);
                                        int zzB2 = zzerVar6.zzB();
                                        i13 = i50;
                                        zzalc zzalcVar2 = zzaknVar.zzd.zza;
                                        int i54 = i51;
                                        zzaki zzakiVar2 = zzaleVar2.zza;
                                        String str = zzfj.zza;
                                        i14 = i42;
                                        zzaleVar2.zzg[i54] = zzerVar6.zzH();
                                        long[] jArr2 = zzaleVar2.zzf;
                                        i15 = size4;
                                        int i55 = i52;
                                        long j9 = zzaleVar2.zzb;
                                        jArr2[i54] = j9;
                                        if ((zzB2 & 1) != 0) {
                                            jArr2[i54] = j9 + zzerVar6.zzB();
                                        }
                                        boolean z9 = (zzB2 & 4) != 0;
                                        int i56 = zzakiVar2.zzd;
                                        int zzB3 = z9 ? zzerVar6.zzB() : i56;
                                        boolean z10 = z9;
                                        int i57 = zzB2 & 256;
                                        int i58 = zzB2 & AdRequest.MAX_CONTENT_URL_LENGTH;
                                        int i59 = zzB2 & 1024;
                                        int i60 = zzB2 & 2048;
                                        long[] jArr3 = zzalcVar2.zzi;
                                        if (jArr3 != null) {
                                            i16 = i59;
                                            if (jArr3.length == 1 && (jArr = zzalcVar2.zzj) != null) {
                                                long j10 = jArr3[0];
                                                if (j10 == 0) {
                                                    i17 = i56;
                                                    i18 = zzB3;
                                                } else {
                                                    i17 = i56;
                                                    i18 = zzB3;
                                                    long j11 = zzalcVar2.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                }
                                                j8 = jArr[0];
                                                int[] iArr = zzaleVar2.zzh;
                                                long[] jArr4 = zzaleVar2.zzi;
                                                boolean[] zArr = zzaleVar2.zzj;
                                                int i61 = i17;
                                                boolean z11 = (zzalcVar2.zzb == 2 || (i5 & 1) == 0) ? false : true;
                                                i19 = i55 + zzaleVar2.zzg[i54];
                                                long j12 = zzalcVar2.zzc;
                                                long j13 = zzaleVar2.zzp;
                                                i20 = i55;
                                                while (i20 < i19) {
                                                    if (i57 != 0) {
                                                        z6 = z11;
                                                        i21 = zzerVar6.zzB();
                                                    } else {
                                                        z6 = z11;
                                                        i21 = zzakiVar2.zzb;
                                                    }
                                                    zzk(i21);
                                                    if (i58 != 0) {
                                                        i22 = i20;
                                                        i23 = zzerVar6.zzB();
                                                    } else {
                                                        i22 = i20;
                                                        i23 = zzakiVar2.zzc;
                                                    }
                                                    zzk(i23);
                                                    if (i16 != 0) {
                                                        i24 = zzerVar6.zzB();
                                                    } else {
                                                        if (i22 == 0) {
                                                            if (z10) {
                                                                i24 = i18;
                                                                i22 = 0;
                                                            } else {
                                                                i22 = 0;
                                                            }
                                                        }
                                                        i24 = i61;
                                                    }
                                                    if (i60 != 0) {
                                                        i25 = i23;
                                                        i26 = zzerVar6.zzB();
                                                    } else {
                                                        i25 = i23;
                                                        i26 = 0;
                                                    }
                                                    zzaki zzakiVar3 = zzakiVar2;
                                                    long zzt = zzfj.zzt((i26 + j13) - j8, 1000000L, j12, RoundingMode.DOWN);
                                                    jArr4[i22] = zzt;
                                                    if (!zzaleVar2.zzq) {
                                                        jArr4[i22] = zzt + zzaknVar.zzd.zzi;
                                                    }
                                                    iArr[i22] = i25;
                                                    if (((i24 >> 16) & 1) == 0) {
                                                        if (!z6) {
                                                            z7 = true;
                                                        } else if (i22 == 0) {
                                                            z7 = true;
                                                            i22 = 0;
                                                        }
                                                        zArr[i22] = z7;
                                                        j13 += i21;
                                                        i20 = i22 + 1;
                                                        z11 = z6;
                                                        zzakiVar2 = zzakiVar3;
                                                    }
                                                    z7 = false;
                                                    zArr[i22] = z7;
                                                    j13 += i21;
                                                    i20 = i22 + 1;
                                                    z11 = z6;
                                                    zzakiVar2 = zzakiVar3;
                                                }
                                                zzaleVar2.zzp = j13;
                                                i52 = i19;
                                                i51 = i53;
                                            }
                                        } else {
                                            i16 = i59;
                                        }
                                        i17 = i56;
                                        i18 = zzB3;
                                        int[] iArr2 = zzaleVar2.zzh;
                                        long[] jArr42 = zzaleVar2.zzi;
                                        boolean[] zArr2 = zzaleVar2.zzj;
                                        int i612 = i17;
                                        if (zzalcVar2.zzb == 2) {
                                        }
                                        i19 = i55 + zzaleVar2.zzg[i54];
                                        long j122 = zzalcVar2.zzc;
                                        long j132 = zzaleVar2.zzp;
                                        i20 = i55;
                                        while (i20 < i19) {
                                        }
                                        zzaleVar2.zzp = j132;
                                        i52 = i19;
                                        i51 = i53;
                                    } else {
                                        i13 = i50;
                                        i14 = i42;
                                        i15 = size4;
                                    }
                                    i50 = i13 + 1;
                                    i42 = i14;
                                    size4 = i15;
                                    i11 = 1953658222;
                                }
                                i7 = i42;
                                zzalc zzalcVar3 = zzaknVar.zzd.zza;
                                zzaki zzakiVar4 = zzaleVar2.zza;
                                zzakiVar4.getClass();
                                zzald zza4 = zzalcVar3.zza(zzakiVar4.zza);
                                zzfv zzc6 = zzfuVar2.zzc(1935763834);
                                if (zzc6 != null) {
                                    zza4.getClass();
                                    int i62 = zza4.zzd;
                                    zzer zzerVar7 = zzc6.zza;
                                    zzerVar7.zzh(8);
                                    if ((zzerVar7.zzB() & 1) == 1) {
                                        zzerVar7.zzk(8);
                                    }
                                    int zzs = zzerVar7.zzs();
                                    int zzH2 = zzerVar7.zzH();
                                    int i63 = zzaleVar2.zze;
                                    if (zzH2 > i63) {
                                        throw zzat.zzb(s.c.c(new StringBuilder(String.valueOf(zzH2).length() + 56 + String.valueOf(i63).length()), "Saiz sample count ", zzH2, " is greater than fragment sample count", i63), null);
                                    }
                                    if (zzs == 0) {
                                        boolean[] zArr3 = zzaleVar2.zzl;
                                        i12 = 0;
                                        for (int i64 = 0; i64 < zzH2; i64++) {
                                            int zzs2 = zzerVar7.zzs();
                                            i12 += zzs2;
                                            zArr3[i64] = zzs2 > i62;
                                        }
                                        z5 = false;
                                    } else {
                                        boolean z12 = zzs > i62;
                                        i12 = zzs * zzH2;
                                        z5 = false;
                                        Arrays.fill(zzaleVar2.zzl, 0, zzH2, z12);
                                    }
                                    Arrays.fill(zzaleVar2.zzl, zzH2, zzaleVar2.zze, z5);
                                    if (i12 > 0) {
                                        zzaleVar2.zza(i12);
                                    }
                                }
                                zzfv zzc7 = zzfuVar2.zzc(1935763823);
                                if (zzc7 != null) {
                                    zzer zzerVar8 = zzc7.zza;
                                    zzerVar8.zzh(8);
                                    int zzB4 = zzerVar8.zzB();
                                    if ((zzB4 & 1) == 1) {
                                        zzerVar8.zzk(8);
                                    }
                                    int zzH3 = zzerVar8.zzH();
                                    if (zzH3 != 1) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzH3).length() + 29);
                                        sb.append("Unexpected saio entry count: ");
                                        sb.append(zzH3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    zzaleVar2.zzc += zzakh.zza(zzB4) == 0 ? zzerVar8.zzz() : zzerVar8.zzJ();
                                }
                                zzfv zzc8 = zzfuVar2.zzc(1936027235);
                                if (zzc8 != null) {
                                    zzl(zzc8.zza, 0, zzaleVar2);
                                }
                                String str2 = zza4 != null ? zza4.zzb : null;
                                zzer zzerVar9 = null;
                                zzer zzerVar10 = null;
                                for (int i65 = 0; i65 < list4.size(); i65++) {
                                    zzfv zzfvVar4 = (zzfv) list4.get(i65);
                                    zzer zzerVar11 = zzfvVar4.zza;
                                    int i66 = zzfvVar4.zzd;
                                    if (i66 == 1935828848) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar9 = zzerVar11;
                                        }
                                    } else if (i66 == 1936158820) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar10 = zzerVar11;
                                        }
                                    }
                                }
                                if (zzerVar9 == null || zzerVar10 == null) {
                                    z4 = true;
                                } else {
                                    zzerVar9.zzh(8);
                                    int zza5 = zzakh.zza(zzerVar9.zzB());
                                    zzerVar9.zzk(4);
                                    if (zza5 == 1) {
                                        zzerVar9.zzk(4);
                                    }
                                    if (zzerVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzerVar10.zzh(8);
                                    int zza6 = zzakh.zza(zzerVar10.zzB());
                                    zzerVar10.zzk(4);
                                    if (zza6 == 1) {
                                        if (zzerVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zza6 >= 2) {
                                        zzerVar10.zzk(4);
                                    }
                                    if (zzerVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z4 = true;
                                    zzerVar10.zzk(1);
                                    int zzs3 = zzerVar10.zzs();
                                    int i67 = (zzs3 & 240) >> 4;
                                    int i68 = zzs3 & 15;
                                    if (zzerVar10.zzs() == 1) {
                                        int zzs4 = zzerVar10.zzs();
                                        int i69 = i39;
                                        byte[] bArr3 = new byte[i69];
                                        zzerVar10.zzm(bArr3, 0, i69);
                                        if (zzs4 == 0) {
                                            int zzs5 = zzerVar10.zzs();
                                            byte[] bArr4 = new byte[zzs5];
                                            zzerVar10.zzm(bArr4, 0, zzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzaleVar2.zzk = true;
                                        zzaleVar2.zzm = new zzald(true, str2, zzs4, bArr3, i67, i68, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i70 = 0; i70 < size5; i70++) {
                                    zzfv zzfvVar5 = (zzfv) list4.get(i70);
                                    if (zzfvVar5.zzd == 1970628964) {
                                        zzer zzerVar12 = zzfvVar5.zza;
                                        zzerVar12.zzh(8);
                                        zzerVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzerVar12, 16, zzaleVar2);
                                        }
                                    }
                                }
                                i10 = 0;
                                i8 = 8;
                                i9 = 16;
                            }
                        } else {
                            i5 = i41;
                            list = list3;
                            i6 = size3;
                            i7 = i42;
                            i8 = i29;
                            z4 = r12;
                            i9 = i39;
                            i10 = i40;
                        }
                        i42 = i7 + 1;
                        i40 = i10;
                        i29 = i8;
                        i39 = i9;
                        r12 = z4;
                        i41 = i5;
                        size3 = i6;
                        list3 = list;
                    }
                    int i71 = i40;
                    zzq zzn2 = zzn(zzfuVar.zzb);
                    if (zzn2 != null) {
                        int size6 = sparseArray4.size();
                        for (int i72 = i71; i72 < size6; i72++) {
                            ((zzakn) sparseArray4.valueAt(i72)).zzb(zzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray4.size();
                        for (int i73 = i71; i73 < size7; i73++) {
                            zzakn zzaknVar2 = (zzakn) sparseArray4.valueAt(i73);
                            long j14 = this.zzz;
                            int i74 = zzaknVar2.zzf;
                            while (true) {
                                zzale zzaleVar3 = zzaknVar2.zzb;
                                if (i74 < zzaleVar3.zze && zzaleVar3.zzi[i74] <= j14) {
                                    if (zzaleVar3.zzj[i74]) {
                                        zzaknVar2.zzi = i74;
                                    }
                                    i74++;
                                }
                            }
                        }
                        this.zzz = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfu) arrayDeque.peek()).zzb(zzfuVar);
                }
            }
        }
    }

    private static int zzk(int i5) {
        if (i5 >= 0) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i5);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i5, zzale zzaleVar) {
        zzerVar.zzh(i5 + 8);
        int zzB = zzerVar.zzB();
        int i6 = zzakh.zza;
        if ((zzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (zzB & 2) != 0;
        int zzH = zzerVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i7 = zzaleVar.zze;
        if (zzH != i7) {
            throw zzat.zzb(s.c.c(new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i7).length()), "Senc sample count ", zzH, " is different from fragment sample count", i7), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, zzH, z4);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j2) {
        long zzJ;
        long zzJ2;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzh(8);
        int zza2 = zzakh.zza(zzerVar2.zzB());
        zzerVar2.zzk(4);
        long zzz = zzerVar2.zzz();
        if (zza2 == 0) {
            zzJ = zzerVar2.zzz();
            zzJ2 = zzerVar2.zzz();
        } else {
            zzJ = zzerVar2.zzJ();
            zzJ2 = zzerVar2.zzJ();
        }
        long j5 = zzJ2 + j2;
        long zzt = zzfj.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
        zzerVar2.zzk(2);
        int zzt2 = zzerVar2.zzt();
        int[] iArr = new int[zzt2];
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        long[] jArr3 = new long[zzt2];
        long j6 = j5;
        long j7 = zzt;
        int i5 = 0;
        while (i5 < zzt2) {
            int zzB = zzerVar2.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzerVar2.zzz();
            iArr[i5] = zzB & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            jArr[i5] = j6;
            jArr3[i5] = j7;
            zzJ += zzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long zzt3 = zzfj.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
            jArr4[i5] = zzt3 - jArr5[i5];
            zzerVar2.zzk(4);
            j6 += iArr[i5];
            i5++;
            zzerVar2 = zzerVar;
            zzt2 = zzt2;
            j7 = zzt3;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(zzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzq zzn(List list) {
        int i5;
        UUID[] uuidArr;
        zzaky zzakyVar;
        UUID uuid;
        int size = list.size();
        int i6 = 0;
        ArrayList arrayList = null;
        while (i6 < size) {
            zzfv zzfvVar = (zzfv) list.get(i6);
            if (zzfvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzi = zzfvVar.zza.zzi();
                zzer zzerVar = new zzer(zzi);
                if (zzerVar.zze() >= 32) {
                    zzerVar.zzh(0);
                    int zzd = zzerVar.zzd();
                    int zzB = zzerVar.zzB();
                    if (zzB != zzd) {
                        zzee.zzc("PsshAtomUtil", s.c.c(new StringBuilder(String.valueOf(zzB).length() + 52 + String.valueOf(zzd).length()), "Advertised atom size (", zzB, ") does not match buffer size: ", zzd));
                    } else {
                        int zzB2 = zzerVar.zzB();
                        if (zzB2 != 1886614376) {
                            u.r(new StringBuilder(String.valueOf(zzB2).length() + 23), "Atom type is not pssh: ", zzB2, "PsshAtomUtil");
                        } else {
                            int zza2 = zzakh.zza(zzerVar.zzB());
                            if (zza2 > 1) {
                                u.r(new StringBuilder(String.valueOf(zza2).length() + 26), "Unsupported pssh version: ", zza2, "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzerVar.zzH();
                                    uuidArr = new UUID[zzH];
                                    int i7 = 0;
                                    while (i7 < zzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i8 = i7;
                                        uuidArr2[i8] = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                        i7 = i8 + 1;
                                        i6 = i6;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i5 = i6;
                                int zzH2 = zzerVar.zzH();
                                int zzd2 = zzerVar.zzd();
                                if (zzH2 != zzd2) {
                                    zzee.zzc("PsshAtomUtil", s.c.c(new StringBuilder(String.valueOf(zzH2).length() + 49 + String.valueOf(zzd2).length()), "Atom data size (", zzH2, ") does not match the bytes left: ", zzd2));
                                    zzakyVar = null;
                                    uuid = zzakyVar == null ? null : zzakyVar.zza;
                                    if (uuid == null) {
                                        zzee.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new zzp(uuid, null, "video/mp4", zzi));
                                        i6 = i5 + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzerVar.zzm(bArr, 0, zzH2);
                                    zzakyVar = new zzaky(uuid2, zza2, bArr, uuidArr);
                                    if (zzakyVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i5 = i6;
                zzakyVar = null;
                if (zzakyVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i5 = i6;
            }
            i6 = i5 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzaki zzo(SparseArray sparseArray, int i5) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i5);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzagc zza2 = zzalb.zza(zzaevVar);
        this.zzr = zza2 != null ? zzguf.zzj(zza2) : zzguf.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i5;
        int i6 = this.zzd;
        if ((i6 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i7 = 100;
        int i8 = 0;
        if ((i6 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i5 = 1;
            i7 = 101;
        } else {
            i5 = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i5);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i8 < this.zzK.length) {
            zzagh zzu = this.zzI.zzu(i7, 3);
            zzu.zzz((zzv) list.get(i8));
            this.zzK[i8] = zzu;
            i8++;
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x009c, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x009f, code lost:
    
        if (r30.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00a1, code lost:
    
        r30.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x00b5, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00b7, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00bc, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00c2, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00c4, code lost:
    
        r31.zzf(r30.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00cd, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00d0, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00d6, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00d8, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00e1, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00e3, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00f2, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x02d1, code lost:
    
        r30.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x02d5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00ff, code lost:
    
        r30.zzD -= 8;
        r31.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0118, code lost:
    
        r30.zzE = r2.zzi(r30.zzD, 7);
        r3 = r30.zzD;
        r8 = r30.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r30.zzE + 7;
        r30.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x013d, code lost:
    
        r30.zzD += r3;
        r30.zzs = 4;
        r30.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0134, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r30.zzD, 0);
        r30.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0146, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0152, code lost:
    
        if (r8 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0154, code lost:
    
        r3 = r30.zzE;
        r5 = r30.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0158, code lost:
    
        if (r3 >= r5) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x015a, code lost:
    
        r30.zzE += r6.zza(r31, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0270, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0276, code lost:
    
        if (r30.zzG != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0278, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x027b, code lost:
    
        r22 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0281, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0283, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x028a, code lost:
    
        r6.zze(r10, r22, r30.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0297, code lost:
    
        r1 = r30.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x029d, code lost:
    
        if (r1.isEmpty() != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x029f, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r30.zzy;
        r8 = r1.zzc;
        r30.zzy = r3 - r8;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x02b0, code lost:
    
        if (r1.zzb == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x02b2, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x02b4, code lost:
    
        r5 = r3;
        r1 = r30.zzJ;
        r3 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x02b9, code lost:
    
        if (r11 >= r3) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x02bb, code lost:
    
        r1[r11].zze(r5, 1, r8, r30.zzy, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x02cb, code lost:
    
        if (r2.zzh() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x02cd, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x02d0, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0288, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0166, code lost:
    
        r13 = r30.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[r17] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0179, code lost:
    
        if (r30.zzE >= r30.zzD) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x017b, code lost:
    
        r4 = r30.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x017d, code lost:
    
        if (r4 != 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0182, code lost:
    
        if (r30.zzK.length > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0186, code lost:
    
        if (r30.zzG != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0189, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x019b, code lost:
    
        r31.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01a8, code lost:
    
        if (r9 < 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01aa, code lost:
    
        r30.zzF = r9 - r4;
        r9 = r30.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r30.zzE += r5;
        r30.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01c2, code lost:
    
        if (r30.zzK.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01c4, code lost:
    
        if (r4 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01ce, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r3.zzg, r14[r5]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01d0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01d3, code lost:
    
        r30.zzH = r7;
        r6.zzc(r13, r4);
        r30.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01dd, code lost:
    
        if (r4 <= 0) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01e1, code lost:
    
        if (r30.zzG != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01e9, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r4, r3.zzg) == false) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01eb, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01d2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01fe, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x018b, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0198, code lost:
    
        if ((r8 + r4) <= (r30.zzD - r30.zzE)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0201, code lost:
    
        if (r30.zzH == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0203, code lost:
    
        r7 = r30.zzi;
        r7.zza(r4);
        r31.zzc(r7.zzi(), 0, r30.zzF);
        r6.zzc(r7, r30.zzF);
        r4 = r30.zzF;
        r32 = r5;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0232, code lost:
    
        if (r5 != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0234, code lost:
    
        r5 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x023a, code lost:
    
        if (r5.zzb() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x023c, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x024b, code lost:
    
        r5 = r30.zzp;
        r5.zzc(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0256, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0258, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0263, code lost:
    
        r30.zzE += r4;
        r30.zzF -= r4;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0240, code lost:
    
        r9 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0246, code lost:
    
        if (r9.zzb() == r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0248, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x025c, code lost:
    
        r32 = r5;
        r4 = r6.zza(r31, r4, false);
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        char c5;
        String zzM;
        String zzM2;
        long zzt;
        long zzz;
        long j2;
        long j5;
        while (true) {
            int i5 = this.zzs;
            char c6 = 2;
            if (i5 == 0) {
                if (this.zzv == 0) {
                    zzer zzerVar = this.zzm;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzafvVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzerVar.zzh(0);
                    this.zzu = zzerVar.zzz();
                    this.zzt = zzerVar.zzB();
                }
                long j6 = this.zzu;
                if (j6 == 1) {
                    zzer zzerVar2 = this.zzm;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzerVar2.zzJ();
                } else if (j6 == 0) {
                    long zzo = zzaevVar.zzo();
                    if (zzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((zzfu) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzu = (zzo - zzaevVar.zzn()) + this.zzv;
                    }
                }
                long j7 = this.zzu;
                int i6 = this.zzv;
                long j8 = i6;
                if (j7 < j8) {
                    if (this.zzt != 1718773093 || i6 != 8) {
                        break;
                    }
                    this.zzu = j8;
                    j7 = j8;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzer zzerVar3 = this.zzk;
                        zzerVar3.zza((int) j7);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar3.zzi(), 0, 8);
                        zzaevVar.zzc(zzerVar3.zzi(), 8, (int) (this.zzu - this.zzv));
                        this.zzq.zza((zzaei) zzm(new zzfv(1936286840, zzerVar3).zza, zzaevVar.zzm()).second);
                    } else {
                        zzaevVar.zze((int) (j7 - j8), true);
                    }
                    zzi();
                } else {
                    long zzn = zzaevVar.zzn() - j8;
                    int i7 = this.zzt;
                    if ((i7 == 1836019558 || i7 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzafx(this.zzA, zzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            zzale zzaleVar = ((zzakn) sparseArray.valueAt(i8)).zzb;
                            zzaleVar.zzc = zzn;
                            zzaleVar.zzb = zzn;
                        }
                    }
                    int i9 = this.zzt;
                    if (i9 == 1835295092) {
                        this.zzC = null;
                        this.zzx = zzn + this.zzu;
                        this.zzs = 2;
                    } else if (i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1836019558 || i9 == 1953653094 || i9 == 1836475768 || i9 == 1701082227 || i9 == 1835365473) {
                        long zzn2 = zzaevVar.zzn();
                        long j9 = this.zzu;
                        long j10 = zzn2 + j9;
                        if (j9 != this.zzv && i9 == 1835365473) {
                            zzer zzerVar4 = this.zzk;
                            zzerVar4.zza(8);
                            zzaevVar.zzi(zzerVar4.zzi(), 0, 8);
                            zzakh.zzf(zzerVar4);
                            zzaevVar.zzf(zzerVar4.zzg());
                            zzaevVar.zzl();
                        }
                        long j11 = j10 - 8;
                        this.zzn.push(new zzfu(this.zzt, j11));
                        if (this.zzu == this.zzv) {
                            zzj(j11);
                        } else {
                            zzi();
                        }
                    } else if (i9 == 1751411826 || i9 == 1835296868 || i9 == 1836476516 || i9 == 1936286840 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1668576371 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1937011571 || i9 == 1952867444 || i9 == 1952868452 || i9 == 1953196132 || i9 == 1953654136 || i9 == 1953658222 || i9 == 1886614376 || i9 == 1935763834 || i9 == 1935763823 || i9 == 1936027235 || i9 == 1970628964 || i9 == 1935828848 || i9 == 1936158820 || i9 == 1701606260 || i9 == 1835362404 || i9 == 1701671783 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzer zzerVar5 = new zzer((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar5.zzi(), 0, 8);
                        this.zzw = zzerVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i5 != 1) {
                long j12 = Long.MAX_VALUE;
                if (i5 != 2) {
                    zzakn zzaknVar = this.zzC;
                    if (zzaknVar != null) {
                        c5 = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j13 = Long.MAX_VALUE;
                    int i10 = 0;
                    zzakn zzaknVar2 = null;
                    while (i10 < size2) {
                        char c7 = c6;
                        zzakn zzaknVar3 = (zzakn) sparseArray2.valueAt(i10);
                        if ((zzaknVar3.zzk() || zzaknVar3.zzf != zzaknVar3.zzd.zzb) && (!zzaknVar3.zzk() || zzaknVar3.zzh != zzaknVar3.zzb.zzd)) {
                            long zze = zzaknVar3.zze();
                            if (zze < j13) {
                                zzaknVar2 = zzaknVar3;
                                j13 = zze;
                            }
                        }
                        i10++;
                        c6 = c7;
                    }
                    c5 = c6;
                    if (zzaknVar2 == null) {
                        int zzn3 = (int) (this.zzx - zzaevVar.zzn());
                        if (zzn3 < 0) {
                            throw zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzaevVar.zzf(zzn3);
                        zzi();
                    } else {
                        int zze2 = (int) (zzaknVar2.zze() - zzaevVar.zzn());
                        if (zze2 < 0) {
                            zzee.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzaevVar.zzf(zze2);
                        this.zzC = zzaknVar2;
                        zzaknVar = zzaknVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzakn zzaknVar4 = null;
                    for (int i11 = 0; i11 < size3; i11++) {
                        zzale zzaleVar2 = ((zzakn) sparseArray3.valueAt(i11)).zzb;
                        if (zzaleVar2.zzo) {
                            long j14 = zzaleVar2.zzc;
                            if (j14 < j12) {
                                zzaknVar4 = (zzakn) sparseArray3.valueAt(i11);
                                j12 = j14;
                            }
                        }
                    }
                    if (zzaknVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int zzn4 = (int) (j12 - zzaevVar.zzn());
                        if (zzn4 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzaevVar.zzf(zzn4);
                        zzale zzaleVar3 = zzaknVar4.zzb;
                        zzer zzerVar6 = zzaleVar3.zzn;
                        zzaevVar.zzc(zzerVar6.zzi(), 0, zzerVar6.zze());
                        zzerVar6.zzh(0);
                        zzaleVar3.zzo = false;
                    }
                }
            } else {
                long j15 = this.zzu - this.zzv;
                zzer zzerVar7 = this.zzw;
                int i12 = (int) j15;
                if (zzerVar7 != null) {
                    zzaevVar.zzc(zzerVar7.zzi(), 8, i12);
                    zzfv zzfvVar = new zzfv(this.zzt, zzerVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i13 = zzfvVar.zzd;
                        if (i13 == 1936286840) {
                            Pair zzm = zzm(zzfvVar.zza, zzaevVar.zzn());
                            this.zzq.zza((zzaei) zzm.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) zzm.first).longValue();
                                this.zzI.zzw((zzafy) zzm.second);
                                this.zzL = true;
                            }
                        } else if (i13 == 1701671783) {
                            zzer zzerVar8 = zzfvVar.zza;
                            if (this.zzJ.length != 0) {
                                zzerVar8.zzh(8);
                                int zza2 = zzakh.zza(zzerVar8.zzB());
                                if (zza2 == 0) {
                                    zzM = zzerVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzerVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz2 = zzerVar8.zzz();
                                    long zzz3 = zzerVar8.zzz();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long zzt2 = zzfj.zzt(zzz3, 1000000L, zzz2, roundingMode);
                                    long j16 = this.zzB;
                                    long j17 = j16 != -9223372036854775807L ? j16 + zzt2 : -9223372036854775807L;
                                    zzt = zzfj.zzt(zzerVar8.zzz(), 1000L, zzz2, roundingMode);
                                    zzz = zzerVar8.zzz();
                                    j2 = zzt2;
                                    j5 = j17;
                                } else if (zza2 != 1) {
                                    u.r(new StringBuilder(String.valueOf(zza2).length() + 35), "Skipping unsupported emsg version: ", zza2, "FragmentedMp4Extractor");
                                } else {
                                    long zzz4 = zzerVar8.zzz();
                                    long zzJ = zzerVar8.zzJ();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long zzt3 = zzfj.zzt(zzJ, 1000000L, zzz4, roundingMode2);
                                    long zzt4 = zzfj.zzt(zzerVar8.zzz(), 1000L, zzz4, roundingMode2);
                                    long zzz5 = zzerVar8.zzz();
                                    zzM = zzerVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzerVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    zzt = zzt4;
                                    zzz = zzz5;
                                    j2 = -9223372036854775807L;
                                    j5 = zzt3;
                                }
                                String str = zzM;
                                String str2 = zzM2;
                                byte[] bArr = new byte[zzerVar8.zzd()];
                                zzerVar8.zzm(bArr, 0, zzerVar8.zzd());
                                zzer zzerVar9 = new zzer(this.zzl.zza(new zzahy(str, str2, zzt, zzz, bArr)));
                                int zzd = zzerVar9.zzd();
                                for (zzagh zzaghVar : this.zzJ) {
                                    zzerVar9.zzh(0);
                                    zzaghVar.zzc(zzerVar9, zzd);
                                }
                                if (j5 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakm(j2, true, zzd));
                                    this.zzy += zzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzagh zzaghVar2 : this.zzJ) {
                                            zzaghVar2.zze(j5, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzakm(j5, false, zzd));
                                        this.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfu) arrayDeque2.peek()).zza(zzfvVar);
                    }
                } else {
                    zzaevVar.zzf(i12);
                }
                zzj(zzaevVar.zzn());
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzakn) sparseArray.valueAt(i5)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j5;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ void zzh(long j2, zzer zzerVar) {
        zzaeh.zza(j2, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i5, zzfg zzfgVar, zzalc zzalcVar, List list, zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i5;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j2, zzer zzerVar) {
                zzako.this.zzh(j2, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }
}
