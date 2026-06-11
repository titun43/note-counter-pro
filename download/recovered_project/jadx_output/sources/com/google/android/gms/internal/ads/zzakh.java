package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzakh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i5) {
        return (i5 >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r26 == 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0efe  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e6a  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzfu zzfuVar, zzafn zzafnVar, long j2, zzq zzqVar, boolean z4, boolean z5, zzgqt zzgqtVar, boolean z6) {
        int i5;
        long j5;
        int i6;
        int i7;
        int i8;
        boolean z7;
        int i9;
        long j6;
        long j7;
        long zzt;
        int zza2;
        int i10;
        char c5;
        int i11;
        ArrayList arrayList;
        int i12;
        long j8;
        long j9;
        int i13;
        String str;
        zzfv zzc;
        zzfu zzfuVar2;
        long[] jArr;
        long[] jArr2;
        zzv zzvVar;
        zzgqt zzgqtVar2;
        zzalc zzalcVar;
        Pair zzn;
        zzer zzerVar;
        short s5;
        short s6;
        long j10;
        long j11;
        int i14;
        String str2;
        int i15;
        int i16;
        zzq zzqVar2;
        String str3;
        zzfu zzfuVar3;
        int i17;
        int i18;
        byte b2;
        String str4;
        char c6;
        int i19;
        int i20;
        String str5;
        int i21;
        int i22;
        int i23;
        boolean z8;
        String str6;
        zzakd zzakdVar;
        int i24;
        int i25;
        int i26;
        int i27;
        zzgj zzgjVar;
        int i28;
        byte b5;
        String str7;
        boolean z9;
        int i29;
        int i30;
        boolean z10;
        String str8;
        int i31;
        boolean z11;
        zzguf zzgufVar;
        boolean z12;
        boolean z13;
        zzq zzqVar3;
        int i32;
        int i33;
        Object obj;
        zzguf zzgufVar2;
        int i34;
        long j12;
        boolean z14;
        zzalc zzalcVar2;
        ArrayList arrayList2;
        zzfu zzfuVar4 = zzfuVar;
        ArrayList arrayList3 = new ArrayList();
        int i35 = 0;
        while (true) {
            List list = zzfuVar4.zzc;
            if (i35 >= list.size()) {
                return arrayList3;
            }
            zzfu zzfuVar5 = (zzfu) list.get(i35);
            if (zzfuVar5.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i5 = i35;
            } else {
                zzfv zzc2 = zzfuVar4.zzc(1836476516);
                zzc2.getClass();
                zzfu zzd = zzfuVar5.zzd(1835297121);
                zzd.getClass();
                zzfv zzc3 = zzd.zzc(1751411826);
                zzc3.getClass();
                int zzi = zzi(zzc3.zza);
                char c7 = 2;
                int i36 = zzi == 1936684398 ? 1 : zzi == 1986618469 ? 2 : (zzi == 1952807028 || zzi == 1935832172 || zzi == 1937072756 || zzi == 1668047728 || zzi == 1937072752) ? 3 : zzi == 1835365473 ? 5 : -1;
                if (i36 == -1) {
                    zzgqtVar2 = zzgqtVar;
                    arrayList = arrayList3;
                    i5 = i35;
                } else {
                    zzfv zzc4 = zzfuVar5.zzc(1953196132);
                    zzc4.getClass();
                    zzer zzerVar2 = zzc4.zza;
                    zzerVar2.zzh(8);
                    int zza3 = zza(zzerVar2.zzB());
                    char c8 = 0;
                    zzerVar2.zzk(zza3 == 0 ? 8 : 16);
                    int zzB = zzerVar2.zzB();
                    zzerVar2.zzk(4);
                    int zzg = zzerVar2.zzg();
                    int i37 = 0;
                    while (true) {
                        int i38 = zza3 == 0 ? 4 : 8;
                        i5 = i35;
                        if (i37 >= i38) {
                            zzerVar2.zzk(i38);
                            break;
                        }
                        if (zzerVar2.zzi()[zzg + i37] != -1) {
                            j5 = zza3 == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                        } else {
                            i37++;
                            i35 = i5;
                        }
                    }
                    j5 = -9223372036854775807L;
                    zzerVar2.zzk(10);
                    int zzt2 = zzerVar2.zzt();
                    zzerVar2.zzk(4);
                    int zzB2 = zzerVar2.zzB();
                    int zzB3 = zzerVar2.zzB();
                    zzerVar2.zzk(4);
                    int zzB4 = zzerVar2.zzB();
                    int zzB5 = zzerVar2.zzB();
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z14 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z14 = zzB5 != 0;
                            }
                            if (true != z14) {
                                i9 = 90;
                                i8 = i9;
                                i6 = 1;
                                zzerVar2.zzk(16);
                                short zzv = zzerVar2.zzv();
                                zzerVar2.zzk(2);
                                short zzv2 = zzerVar2.zzv();
                                j6 = j2 == -9223372036854775807L ? j5 : j2;
                                long j13 = zzd(zzc2.zza).zzc;
                                if (j6 == -9223372036854775807L) {
                                    j7 = j13;
                                    zzt = -9223372036854775807L;
                                } else {
                                    j7 = j13;
                                    zzt = zzfj.zzt(j6, 1000000L, j7, RoundingMode.DOWN);
                                }
                                zzfu zzd2 = zzd.zzd(1835626086);
                                zzd2.getClass();
                                zzfu zzd3 = zzd2.zzd(1937007212);
                                zzd3.getClass();
                                zzfv zzc5 = zzd.zzc(1835296868);
                                zzc5.getClass();
                                zzer zzerVar3 = zzc5.zza;
                                zzerVar3.zzh(8);
                                zza2 = zza(zzerVar3.zzB());
                                zzerVar3.zzk(zza2 == 0 ? 8 : 16);
                                long zzz = zzerVar3.zzz();
                                int zzg2 = zzerVar3.zzg();
                                i10 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                        c5 = c7;
                                        i11 = 4;
                                    } else {
                                        c5 = c7;
                                        i11 = 8;
                                    }
                                    if (i10 >= i11) {
                                        arrayList = arrayList3;
                                        i12 = i8;
                                        j8 = zzz;
                                        zzerVar3.zzk(i11);
                                        j9 = -9223372036854775807L;
                                        break;
                                    }
                                    if (zzerVar3.zzi()[zzg2 + i10] != -1) {
                                        long zzz2 = zza2 == 0 ? zzerVar3.zzz() : zzerVar3.zzJ();
                                        if (zzz2 == 0) {
                                            arrayList = arrayList3;
                                            i12 = i8;
                                            j9 = -9223372036854775807L;
                                            j8 = zzz;
                                        } else {
                                            arrayList = arrayList3;
                                            i12 = i8;
                                            j8 = zzz;
                                            j9 = zzfj.zzt(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                                        }
                                    } else {
                                        i10++;
                                        c7 = c5;
                                        i8 = i8;
                                        arrayList3 = arrayList3;
                                    }
                                }
                                int zzt3 = zzerVar3.zzt();
                                char[] cArr = new char[3];
                                cArr[0] = (char) (((zzt3 >> 10) & 31) + 96);
                                cArr[i6] = (char) (((zzt3 >> 5) & 31) + 96);
                                cArr[c5] = (char) ((zzt3 & 31) + 96);
                                for (i13 = 0; i13 < 3; i13++) {
                                    char c9 = cArr[i13];
                                    if (c9 < 'a' || c9 > 'z') {
                                        str = null;
                                        break;
                                    }
                                }
                                str = new String(cArr);
                                zzc = zzd3.zzc(1937011556);
                                if (zzc == null) {
                                    zzee.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    zzgqtVar2 = zzgqtVar;
                                } else {
                                    String str9 = "BoxParsers";
                                    String zzc6 = zzaka.zzc(j8, j9, str);
                                    zzer zzerVar4 = zzc.zza;
                                    zzerVar4.zzh(12);
                                    long j14 = j9;
                                    int zzB6 = zzerVar4.zzB();
                                    int i39 = zzt2;
                                    zzakd zzakdVar2 = new zzakd(zzB6);
                                    byte b6 = 3;
                                    int i40 = 0;
                                    while (i40 < zzB6) {
                                        int i41 = i36;
                                        int zzg3 = zzerVar4.zzg();
                                        int zzB7 = zzerVar4.zzB();
                                        int i42 = zzB6;
                                        String str10 = "childAtomSize must be positive";
                                        zzaey.zza(zzB7 > 0 ? i6 : c8, "childAtomSize must be positive");
                                        String str11 = str;
                                        int zzB8 = zzerVar4.zzB();
                                        int i43 = i39;
                                        if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241) {
                                            zzerVar = zzerVar4;
                                            s5 = zzv;
                                            s6 = zzv2;
                                            byte b7 = b6;
                                            j10 = j14;
                                            int i44 = zzB7;
                                            j11 = j8;
                                            String str12 = str9;
                                            zzerVar.zzh(zzg3 + 16);
                                            zzerVar.zzk(16);
                                            int zzt4 = zzerVar.zzt();
                                            int zzt5 = zzerVar.zzt();
                                            i14 = i40;
                                            zzerVar.zzk(50);
                                            int zzg4 = zzerVar.zzg();
                                            str2 = str11;
                                            int i45 = 1701733238;
                                            if (zzB8 == 1701733238) {
                                                Pair zzr = zzr(zzerVar, zzg3, i44);
                                                if (zzr != null) {
                                                    i45 = ((Integer) zzr.first).intValue();
                                                    if (zzqVar == null) {
                                                        i15 = zzg3;
                                                        zzqVar3 = null;
                                                    } else {
                                                        i15 = zzg3;
                                                        zzqVar3 = zzqVar.zzb(((zzald) zzr.second).zzb);
                                                    }
                                                    zzakdVar2.zza[i14] = (zzald) zzr.second;
                                                } else {
                                                    i15 = zzg3;
                                                    zzqVar3 = zzqVar;
                                                }
                                                int i46 = i45;
                                                zzerVar.zzh(zzg4);
                                                i16 = i46;
                                                zzqVar2 = zzqVar3;
                                            } else {
                                                i15 = zzg3;
                                                i16 = zzB8;
                                                zzqVar2 = zzqVar;
                                            }
                                            if (i16 == 1831958048) {
                                                str3 = "video/mpeg";
                                            } else if (i16 == 1211250227) {
                                                str3 = "video/3gpp";
                                                i16 = 1211250227;
                                            } else {
                                                str3 = null;
                                            }
                                            zzq zzqVar4 = zzqVar2;
                                            int i47 = zzB;
                                            String str13 = zzc6;
                                            String str14 = str12;
                                            zzfuVar3 = zzfuVar5;
                                            String str15 = str3;
                                            float f5 = 1.0f;
                                            int i48 = -1;
                                            int i49 = -1;
                                            List list2 = null;
                                            int i50 = -1;
                                            zzgj zzgjVar2 = null;
                                            int i51 = 8;
                                            int i52 = 8;
                                            int i53 = -1;
                                            int i54 = -1;
                                            int i55 = -1;
                                            boolean z15 = false;
                                            int i56 = -1;
                                            byte[] bArr = null;
                                            ByteBuffer byteBuffer = null;
                                            zzajw zzajwVar = null;
                                            zzajy zzajyVar = null;
                                            String str16 = null;
                                            i17 = i43;
                                            int i57 = zzg4;
                                            int i58 = -1;
                                            while (i57 - i15 < i44) {
                                                zzerVar.zzh(i57);
                                                int zzg5 = zzerVar.zzg();
                                                int zzB9 = zzerVar.zzB();
                                                if (zzB9 == 0) {
                                                    i21 = i57;
                                                    if (zzerVar.zzg() - i15 == i44) {
                                                        break;
                                                    }
                                                    i22 = 0;
                                                } else {
                                                    i21 = i57;
                                                    i22 = zzB9;
                                                }
                                                if (i22 > 0) {
                                                    i23 = i44;
                                                    z8 = true;
                                                } else {
                                                    i23 = i44;
                                                    z8 = false;
                                                }
                                                zzaey.zza(z8, str10);
                                                int zzB10 = zzerVar.zzB();
                                                if (zzB10 == 1635148611) {
                                                    int i59 = zzg5 + 8;
                                                    zzaey.zza(str15 == null, null);
                                                    zzerVar.zzh(i59);
                                                    zzadz zza4 = zzadz.zza(zzerVar);
                                                    List list3 = zza4.zza;
                                                    zzakdVar2.zzc = zza4.zzb;
                                                    if (z15) {
                                                        z13 = true;
                                                    } else {
                                                        f5 = zza4.zzk;
                                                        z13 = false;
                                                    }
                                                    String str17 = zza4.zzl;
                                                    int i60 = zza4.zzj;
                                                    int i61 = zza4.zzg;
                                                    int i62 = zza4.zzh;
                                                    int i63 = zza4.zzi;
                                                    i52 = zza4.zze;
                                                    str6 = str10;
                                                    i24 = zza4.zzf;
                                                    i26 = i16;
                                                    str16 = str17;
                                                    z15 = z13;
                                                    zzakdVar = zzakdVar2;
                                                    i27 = i58;
                                                    i25 = i62;
                                                    i50 = i63;
                                                    b5 = b7;
                                                    str15 = "video/avc";
                                                    i54 = i60;
                                                    i49 = i61;
                                                    list2 = list3;
                                                } else {
                                                    if (zzB10 == 1752589123) {
                                                        int i64 = zzg5 + 8;
                                                        zzaey.zza(str15 == null, null);
                                                        zzerVar.zzh(i64);
                                                        zzafo zza5 = zzafo.zza(zzerVar);
                                                        List list4 = zza5.zza;
                                                        zzakdVar2.zzc = zza5.zzb;
                                                        if (z15) {
                                                            z12 = true;
                                                        } else {
                                                            f5 = zza5.zzl;
                                                            z12 = false;
                                                        }
                                                        int i65 = zza5.zzm;
                                                        int i66 = zza5.zzc;
                                                        String str18 = zza5.zzn;
                                                        int i67 = zza5.zzk;
                                                        if (i67 != -1) {
                                                            i58 = i67;
                                                        }
                                                        int i68 = zza5.zzd;
                                                        int i69 = zza5.zze;
                                                        int i70 = zza5.zzh;
                                                        int i71 = zza5.zzi;
                                                        int i72 = zza5.zzj;
                                                        int i73 = zza5.zzf;
                                                        i54 = i65;
                                                        str15 = "video/hevc";
                                                        z15 = z12;
                                                        i50 = i72;
                                                        str6 = str10;
                                                        i26 = i16;
                                                        i24 = zza5.zzg;
                                                        str16 = str18;
                                                        zzakdVar = zzakdVar2;
                                                        i27 = i58;
                                                        i56 = i68;
                                                        i25 = i71;
                                                        b5 = b7;
                                                        list2 = list4;
                                                        i52 = i73;
                                                        str7 = str14;
                                                        i53 = i66;
                                                        i55 = i69;
                                                        i49 = i70;
                                                        zzgjVar2 = zza5.zzo;
                                                    } else {
                                                        if (zzB10 == 1818785347) {
                                                            int i74 = zzg5 + 8;
                                                            zzaey.zza("video/hevc".equals(str15), "lhvC must follow hvcC atom");
                                                            if (zzgjVar2 != null) {
                                                                z11 = zzgjVar2.zza.size() >= 2;
                                                            } else {
                                                                z11 = false;
                                                                zzgjVar2 = null;
                                                            }
                                                            zzaey.zza(z11, "must have at least two layers");
                                                            zzerVar.zzh(i74);
                                                            zzgjVar2.getClass();
                                                            zzafo zzb2 = zzafo.zzb(zzerVar, zzgjVar2);
                                                            zzaey.zza(zzakdVar2.zzc == zzb2.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                            int i75 = zzb2.zzh;
                                                            if (i75 != -1) {
                                                                zzaey.zza(i49 == i75, "colorSpace must be the same for both views");
                                                            }
                                                            int i76 = zzb2.zzi;
                                                            if (i76 != -1) {
                                                                zzaey.zza(i48 == i76, "colorRange must be the same for both views");
                                                            }
                                                            int i77 = zzb2.zzj;
                                                            if (i77 != -1) {
                                                                zzaey.zza(i50 == i77, "colorTransfer must be the same for both views");
                                                            }
                                                            zzaey.zza(i52 == zzb2.zzf, "bitdepthLuma must be the same for both views");
                                                            zzaey.zza(i51 == zzb2.zzg, "bitdepthChroma must be the same for both views");
                                                            if (list2 != null) {
                                                                int i78 = zzguf.zzd;
                                                                zzguc zzgucVar = new zzguc();
                                                                zzgucVar.zzh(list2);
                                                                zzgucVar.zzh(zzb2.zza);
                                                                zzgufVar = zzgucVar.zzi();
                                                            } else {
                                                                zzaey.zza(false, "initializationData must be already set from hvcC atom");
                                                                zzgufVar = null;
                                                            }
                                                            list2 = zzgufVar;
                                                            str15 = "video/mv-hevc";
                                                            str6 = str10;
                                                            i25 = i48;
                                                            i26 = i16;
                                                            str16 = zzb2.zzn;
                                                            zzakdVar = zzakdVar2;
                                                            i27 = i58;
                                                            i24 = i51;
                                                        } else {
                                                            if (zzB10 == 1986361461) {
                                                                zzerVar.zzh(zzg5 + 8);
                                                                int zzg6 = zzerVar.zzg();
                                                                zzakdVar = zzakdVar2;
                                                                zzajz zzajzVar = null;
                                                                while (zzg6 - zzg5 < i22) {
                                                                    zzerVar.zzh(zzg6);
                                                                    int zzB11 = zzerVar.zzB();
                                                                    if (zzB11 > 0) {
                                                                        i30 = zzg6;
                                                                        z10 = true;
                                                                    } else {
                                                                        i30 = zzg6;
                                                                        z10 = false;
                                                                    }
                                                                    zzaey.zza(z10, str10);
                                                                    int i79 = i51;
                                                                    if (zzerVar.zzB() == 1702454643) {
                                                                        zzerVar.zzh(i30 + 8);
                                                                        int zzg7 = zzerVar.zzg();
                                                                        while (true) {
                                                                            if (zzg7 - i30 >= zzB11) {
                                                                                str8 = str10;
                                                                                i31 = zzB11;
                                                                                zzajzVar = null;
                                                                                break;
                                                                            }
                                                                            zzerVar.zzh(zzg7);
                                                                            int zzB12 = zzerVar.zzB();
                                                                            zzaey.zza(zzB12 > 0, str10);
                                                                            str8 = str10;
                                                                            if (zzerVar.zzB() == 1937011305) {
                                                                                zzerVar.zzk(4);
                                                                                int zzs = zzerVar.zzs();
                                                                                i31 = zzB11;
                                                                                zzajzVar = new zzajz(new zzakc(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                                            } else {
                                                                                zzg7 += zzB12;
                                                                                str10 = str8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str8 = str10;
                                                                        i31 = zzB11;
                                                                    }
                                                                    zzg6 = i30 + i31;
                                                                    i51 = i79;
                                                                    str10 = str8;
                                                                }
                                                                str6 = str10;
                                                                i24 = i51;
                                                                zzakg zzakgVar = zzajzVar == null ? null : new zzakg(zzajzVar);
                                                                if (zzakgVar != null) {
                                                                    if (zzgjVar2 == null) {
                                                                        zzgjVar2 = null;
                                                                    } else if (zzgjVar2.zza.size() >= 2) {
                                                                        zzaey.zza(zzakgVar.zza(), "both eye views must be marked as available");
                                                                        zzaey.zza(!zzakgVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                                    }
                                                                    if (i58 == -1) {
                                                                        i25 = i48;
                                                                        i26 = i16;
                                                                        if (true != zzakgVar.zzb().zza().zzc()) {
                                                                            b5 = b7;
                                                                            str7 = str14;
                                                                            i27 = 4;
                                                                        } else {
                                                                            i27 = 5;
                                                                        }
                                                                    } else {
                                                                        i25 = i48;
                                                                        i26 = i16;
                                                                        i27 = i58;
                                                                        b5 = b7;
                                                                        str7 = str14;
                                                                    }
                                                                }
                                                                i25 = i48;
                                                                i26 = i16;
                                                                i27 = i58;
                                                                zzgjVar = zzgjVar2;
                                                                i28 = i52;
                                                                b5 = b7;
                                                                str7 = str14;
                                                                zzgjVar2 = zzgjVar;
                                                                i52 = i28;
                                                            } else {
                                                                str6 = str10;
                                                                zzakdVar = zzakdVar2;
                                                                i24 = i51;
                                                                if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                                    i25 = i48;
                                                                    i26 = i16;
                                                                    i27 = i58;
                                                                    zzgjVar = zzgjVar2;
                                                                    i28 = i52;
                                                                    b5 = b7;
                                                                    str7 = str14;
                                                                    int i80 = i22 - 8;
                                                                    int i81 = zzg5 + 8;
                                                                    byte[] bArr2 = new byte[i80];
                                                                    zzerVar.zzm(bArr2, 0, i80);
                                                                    if (list2 != null) {
                                                                        int i82 = zzguf.zzd;
                                                                        zzguc zzgucVar2 = new zzguc();
                                                                        zzgucVar2.zzh(list2);
                                                                        zzgucVar2.zzf(bArr2);
                                                                        list2 = zzgucVar2.zzi();
                                                                    } else {
                                                                        zzaey.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                                        list2 = null;
                                                                    }
                                                                    zzerVar.zzh(i81);
                                                                    zzfr zza6 = zzfr.zza(zzerVar);
                                                                    if (zza6 != null) {
                                                                        str15 = "video/dolby-vision";
                                                                        str16 = zza6.zza;
                                                                    }
                                                                } else if (zzB10 == 1987076931) {
                                                                    int i83 = zzg5 + 12;
                                                                    zzaey.zza(str15 == null, null);
                                                                    zzerVar.zzh(i83);
                                                                    byte zzs2 = (byte) zzerVar.zzs();
                                                                    byte zzs3 = (byte) zzerVar.zzs();
                                                                    int zzs4 = zzerVar.zzs();
                                                                    int i84 = zzs4 >> 4;
                                                                    int i85 = zzs4 >> 1;
                                                                    String str19 = i16 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                                    if (str19.equals("video/x-vnd.on2.vp9")) {
                                                                        int i86 = zzdo.zza;
                                                                        byte[] bArr3 = new byte[12];
                                                                        i29 = 1;
                                                                        bArr3[0] = 1;
                                                                        bArr3[1] = 1;
                                                                        bArr3[2] = zzs2;
                                                                        bArr3[b7] = 2;
                                                                        bArr3[4] = 1;
                                                                        bArr3[5] = zzs3;
                                                                        bArr3[6] = b7;
                                                                        bArr3[7] = 1;
                                                                        bArr3[8] = (byte) i84;
                                                                        bArr3[9] = 4;
                                                                        bArr3[10] = 1;
                                                                        bArr3[11] = (byte) (i85 & 7);
                                                                        list2 = zzguf.zzj(bArr3);
                                                                    } else {
                                                                        i29 = 1;
                                                                    }
                                                                    int i87 = zzs4 & 1;
                                                                    int zzs5 = zzerVar.zzs();
                                                                    int zzs6 = zzerVar.zzs();
                                                                    int zzb3 = zzi.zzb(zzs5);
                                                                    int i88 = i29 != i87 ? 2 : 1;
                                                                    int zzc7 = zzi.zzc(zzs6);
                                                                    i26 = i16;
                                                                    i52 = i84;
                                                                    i24 = i52;
                                                                    i25 = i88;
                                                                    str15 = str19;
                                                                    i27 = i58;
                                                                    b5 = b7;
                                                                    str7 = str14;
                                                                    i50 = zzc7;
                                                                    i49 = zzb3;
                                                                } else if (zzB10 == 1635135811) {
                                                                    int i89 = i22 - 8;
                                                                    byte[] bArr4 = new byte[i89];
                                                                    zzerVar.zzm(bArr4, 0, i89);
                                                                    zzguf zzj = zzguf.zzj(bArr4);
                                                                    zzerVar.zzh(zzg5 + 8);
                                                                    zzi zzk = zzk(zzerVar);
                                                                    int i90 = zzk.zzf;
                                                                    int i91 = zzk.zzg;
                                                                    i49 = zzk.zzb;
                                                                    i26 = i16;
                                                                    i52 = i90;
                                                                    i24 = i91;
                                                                    i25 = zzk.zzc;
                                                                    str15 = "video/av01";
                                                                    i27 = i58;
                                                                    b5 = b7;
                                                                    str7 = str14;
                                                                    list2 = zzj;
                                                                    i50 = zzk.zzd;
                                                                } else if (zzB10 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzm();
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(zzerVar.zzv());
                                                                    byteBuffer2.putShort(zzerVar.zzv());
                                                                    byteBuffer = byteBuffer2;
                                                                    i25 = i48;
                                                                    i26 = i16;
                                                                    i27 = i58;
                                                                    b5 = b7;
                                                                    str7 = str14;
                                                                } else if (zzB10 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzm();
                                                                    }
                                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                                    short zzv3 = zzerVar.zzv();
                                                                    short zzv4 = zzerVar.zzv();
                                                                    short zzv5 = zzerVar.zzv();
                                                                    short zzv6 = zzerVar.zzv();
                                                                    i26 = i16;
                                                                    short zzv7 = zzerVar.zzv();
                                                                    zzgj zzgjVar3 = zzgjVar2;
                                                                    short zzv8 = zzerVar.zzv();
                                                                    int i92 = i52;
                                                                    short zzv9 = zzerVar.zzv();
                                                                    i25 = i48;
                                                                    short zzv10 = zzerVar.zzv();
                                                                    long zzz3 = zzerVar.zzz();
                                                                    long zzz4 = zzerVar.zzz();
                                                                    i27 = i58;
                                                                    byteBuffer3.position(1);
                                                                    byteBuffer3.putShort(zzv7);
                                                                    byteBuffer3.putShort(zzv8);
                                                                    byteBuffer3.putShort(zzv3);
                                                                    byteBuffer3.putShort(zzv4);
                                                                    byteBuffer3.putShort(zzv5);
                                                                    byteBuffer3.putShort(zzv6);
                                                                    byteBuffer3.putShort(zzv9);
                                                                    byteBuffer3.putShort(zzv10);
                                                                    byteBuffer3.putShort((short) (zzz3 / 10000));
                                                                    byteBuffer3.putShort((short) (zzz4 / 10000));
                                                                    byteBuffer = byteBuffer3;
                                                                    b5 = b7;
                                                                    str7 = str14;
                                                                    zzgjVar2 = zzgjVar3;
                                                                    i52 = i92;
                                                                } else {
                                                                    i25 = i48;
                                                                    i26 = i16;
                                                                    i27 = i58;
                                                                    zzgjVar = zzgjVar2;
                                                                    i28 = i52;
                                                                    if (zzB10 == 1681012275) {
                                                                        zzaey.zza(str15 == null, null);
                                                                        str15 = "video/3gpp";
                                                                        b5 = b7;
                                                                        str7 = str14;
                                                                        zzgjVar2 = zzgjVar;
                                                                        i52 = i28;
                                                                    } else {
                                                                        if (zzB10 == 1702061171) {
                                                                            zzaey.zza(str15 == null, null);
                                                                            zzajy zzp = zzp(zzerVar, zzg5);
                                                                            String zza7 = zzp.zza();
                                                                            byte[] zzb4 = zzp.zzb();
                                                                            if (zzb4 != null) {
                                                                                zzajyVar = zzp;
                                                                                list2 = zzguf.zzj(zzb4);
                                                                                b5 = b7;
                                                                                zzgjVar2 = zzgjVar;
                                                                                i52 = i28;
                                                                                str15 = zza7;
                                                                            } else {
                                                                                zzajyVar = zzp;
                                                                                str15 = zza7;
                                                                            }
                                                                        } else if (zzB10 == 1651798644) {
                                                                            zzajwVar = zzq(zzerVar, zzg5);
                                                                        } else if (zzB10 == 1885434736) {
                                                                            zzerVar.zzh(zzg5 + 8);
                                                                            f5 = zzerVar.zzH() / zzerVar.zzH();
                                                                            b5 = b7;
                                                                            str7 = str14;
                                                                            zzgjVar2 = zzgjVar;
                                                                            i52 = i28;
                                                                            z15 = true;
                                                                        } else if (zzB10 == 1937126244) {
                                                                            int i93 = zzg5 + 8;
                                                                            while (true) {
                                                                                if (i93 - zzg5 >= i22) {
                                                                                    bArr = null;
                                                                                    break;
                                                                                }
                                                                                zzerVar.zzh(i93);
                                                                                int zzB13 = zzerVar.zzB() + i93;
                                                                                if (zzerVar.zzB() == 1886547818) {
                                                                                    bArr = Arrays.copyOfRange(zzerVar.zzi(), i93, zzB13);
                                                                                    break;
                                                                                }
                                                                                i93 = zzB13;
                                                                            }
                                                                        } else if (zzB10 == 1936995172) {
                                                                            int zzs7 = zzerVar.zzs();
                                                                            b5 = b7;
                                                                            zzerVar.zzk(b5);
                                                                            if (zzs7 == 0) {
                                                                                int zzs8 = zzerVar.zzs();
                                                                                if (zzs8 == 0) {
                                                                                    str7 = str14;
                                                                                    zzgjVar2 = zzgjVar;
                                                                                    i52 = i28;
                                                                                    i27 = 0;
                                                                                } else if (zzs8 == 1) {
                                                                                    str7 = str14;
                                                                                    zzgjVar2 = zzgjVar;
                                                                                    i52 = i28;
                                                                                    i27 = 1;
                                                                                } else if (zzs8 == 2) {
                                                                                    str7 = str14;
                                                                                    zzgjVar2 = zzgjVar;
                                                                                    i52 = i28;
                                                                                    i27 = 2;
                                                                                } else if (zzs8 == b5) {
                                                                                    i27 = b5;
                                                                                    str7 = str14;
                                                                                    zzgjVar2 = zzgjVar;
                                                                                    i52 = i28;
                                                                                }
                                                                            }
                                                                            str7 = str14;
                                                                        } else {
                                                                            b5 = b7;
                                                                            if (zzB10 == 1634760259) {
                                                                                int i94 = i22 - 12;
                                                                                byte[] bArr5 = new byte[i94];
                                                                                zzerVar.zzh(zzg5 + 12);
                                                                                zzerVar.zzm(bArr5, 0, i94);
                                                                                String zzc8 = zzdo.zzc(bArr5);
                                                                                zzguf zzj2 = zzguf.zzj(bArr5);
                                                                                zzi zzl = zzl(new zzer(bArr5));
                                                                                str16 = zzc8;
                                                                                i52 = zzl.zzf;
                                                                                i24 = zzl.zzg;
                                                                                i49 = zzl.zzb;
                                                                                i25 = zzl.zzc;
                                                                                zzgjVar2 = zzgjVar;
                                                                                i50 = zzl.zzd;
                                                                                list2 = zzj2;
                                                                                str15 = "video/apv";
                                                                                str7 = str14;
                                                                            } else {
                                                                                if (zzB10 == 1668246642) {
                                                                                    if (i49 != -1) {
                                                                                        str7 = str14;
                                                                                    } else if (i50 == -1) {
                                                                                        int zzB14 = zzerVar.zzB();
                                                                                        if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                                            str7 = str14;
                                                                                            int zzt6 = zzerVar.zzt();
                                                                                            int zzt7 = zzerVar.zzt();
                                                                                            zzerVar.zzk(2);
                                                                                            if (i22 == 19) {
                                                                                                if ((zzerVar.zzs() & 128) != 0) {
                                                                                                    i22 = 19;
                                                                                                    z9 = true;
                                                                                                    int zzb5 = zzi.zzb(zzt6);
                                                                                                    i25 = true == z9 ? 2 : 1;
                                                                                                    zzgjVar2 = zzgjVar;
                                                                                                    i52 = i28;
                                                                                                    i50 = zzi.zzc(zzt7);
                                                                                                    i49 = zzb5;
                                                                                                } else {
                                                                                                    i22 = 19;
                                                                                                }
                                                                                            }
                                                                                            z9 = false;
                                                                                            int zzb52 = zzi.zzb(zzt6);
                                                                                            i25 = true == z9 ? 2 : 1;
                                                                                            zzgjVar2 = zzgjVar;
                                                                                            i52 = i28;
                                                                                            i50 = zzi.zzc(zzt7);
                                                                                            i49 = zzb52;
                                                                                        } else {
                                                                                            str7 = str14;
                                                                                            zzee.zzc(str7, "Unsupported color type: ".concat(zzfw.zze(zzB14)));
                                                                                            i49 = -1;
                                                                                            i50 = -1;
                                                                                            zzgjVar2 = zzgjVar;
                                                                                            i52 = i28;
                                                                                        }
                                                                                    } else {
                                                                                        str7 = str14;
                                                                                        i49 = -1;
                                                                                    }
                                                                                }
                                                                                str7 = str14;
                                                                            }
                                                                        }
                                                                        b5 = b7;
                                                                        str7 = str14;
                                                                        zzgjVar2 = zzgjVar;
                                                                        i52 = i28;
                                                                    }
                                                                }
                                                                zzgjVar2 = zzgjVar;
                                                                i52 = i28;
                                                            }
                                                            i57 = i21 + i22;
                                                            str14 = str7;
                                                            b7 = b5;
                                                            i44 = i23;
                                                            zzakdVar2 = zzakdVar;
                                                            i16 = i26;
                                                            i51 = i24;
                                                            str10 = str6;
                                                            i48 = i25;
                                                            i58 = i27;
                                                        }
                                                        b5 = b7;
                                                        str7 = str14;
                                                        i57 = i21 + i22;
                                                        str14 = str7;
                                                        b7 = b5;
                                                        i44 = i23;
                                                        zzakdVar2 = zzakdVar;
                                                        i16 = i26;
                                                        i51 = i24;
                                                        str10 = str6;
                                                        i48 = i25;
                                                        i58 = i27;
                                                    }
                                                    i57 = i21 + i22;
                                                    str14 = str7;
                                                    b7 = b5;
                                                    i44 = i23;
                                                    zzakdVar2 = zzakdVar;
                                                    i16 = i26;
                                                    i51 = i24;
                                                    str10 = str6;
                                                    i48 = i25;
                                                    i58 = i27;
                                                }
                                                str7 = str14;
                                                i57 = i21 + i22;
                                                str14 = str7;
                                                b7 = b5;
                                                i44 = i23;
                                                zzakdVar2 = zzakdVar;
                                                i16 = i26;
                                                i51 = i24;
                                                str10 = str6;
                                                i48 = i25;
                                                i58 = i27;
                                            }
                                            int i95 = i48;
                                            i18 = i44;
                                            zzakd zzakdVar3 = zzakdVar2;
                                            int i96 = i58;
                                            int i97 = i51;
                                            int i98 = i52;
                                            b2 = b7;
                                            str4 = str14;
                                            c6 = 2;
                                            if (str15 == null) {
                                                i20 = i12;
                                                str5 = str13;
                                                i19 = i47;
                                                zzakdVar2 = zzakdVar3;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i19 = i47;
                                                zztVar.zzb(i19);
                                                zztVar.zzm(str15);
                                                zztVar.zzj(str16);
                                                zztVar.zzt(zzt4);
                                                zztVar.zzu(zzt5);
                                                zztVar.zzv(i56);
                                                zztVar.zzw(i55);
                                                zztVar.zzz(f5);
                                                i20 = i12;
                                                zztVar.zzy(i20);
                                                zztVar.zzA(bArr);
                                                zztVar.zzB(i96);
                                                zztVar.zzp(list2);
                                                zztVar.zzo(i54);
                                                zztVar.zzD(i53);
                                                zztVar.zzq(zzqVar4);
                                                str5 = str13;
                                                zztVar.zze(str5);
                                                zzh zzhVar = new zzh();
                                                zzhVar.zza(i49);
                                                zzhVar.zzb(i95);
                                                zzhVar.zzc(i50);
                                                zzhVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                                zzhVar.zze(i98);
                                                zzhVar.zzf(i97);
                                                zztVar.zzC(zzhVar.zzg());
                                                if (zzajwVar != null) {
                                                    zztVar.zzh(zzgxz.zzb(zzajwVar.zza()));
                                                    zztVar.zzi(zzgxz.zzb(zzajwVar.zzb()));
                                                } else if (zzajyVar != null) {
                                                    zztVar.zzh(zzgxz.zzb(zzajyVar.zzc()));
                                                    zztVar.zzi(zzgxz.zzb(zzajyVar.zzd()));
                                                }
                                                zzakdVar2 = zzakdVar3;
                                                zzakdVar2.zzb = zztVar.zzM();
                                            }
                                        } else {
                                            if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165) {
                                                zzerVar = zzerVar4;
                                                s5 = zzv;
                                                s6 = zzv2;
                                                j10 = j14;
                                                i32 = zzB7;
                                                i33 = i43;
                                                obj = null;
                                            } else if (zzB8 == 1718641517) {
                                                zzerVar = zzerVar4;
                                                s5 = zzv;
                                                s6 = zzv2;
                                                j10 = j14;
                                                i32 = zzB7;
                                                i33 = i43;
                                                obj = null;
                                            } else {
                                                if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003) {
                                                    zzerVar4.zzh(zzg3 + 16);
                                                    String str20 = "application/ttml+xml";
                                                    if (zzB8 != 1414810956) {
                                                        if (zzB8 == 1954034535) {
                                                            int i99 = zzB7 - 16;
                                                            byte[] bArr6 = new byte[i99];
                                                            zzerVar4.zzm(bArr6, 0, i99);
                                                            zzgufVar2 = zzguf.zzj(bArr6);
                                                            str20 = "application/x-quicktime-tx3g";
                                                        } else if (zzB8 == 2004251764) {
                                                            str20 = "application/x-mp4-vtt";
                                                        } else if (zzB8 == 1937010800) {
                                                            i34 = zzg3;
                                                            j12 = 0;
                                                            zzgufVar2 = null;
                                                            if (str20 != null) {
                                                                zzer zzerVar5 = zzerVar4;
                                                                zzt zztVar2 = new zzt();
                                                                zztVar2.zzb(zzB);
                                                                zztVar2.zzm(str20);
                                                                zztVar2.zze(zzc6);
                                                                zztVar2.zzr(j12);
                                                                zztVar2.zzp(zzgufVar2);
                                                                zzakdVar2.zzb = zztVar2.zzM();
                                                                i19 = zzB;
                                                                str4 = str9;
                                                                s5 = zzv;
                                                                zzfuVar3 = zzfuVar5;
                                                                s6 = zzv2;
                                                                c6 = c5;
                                                                i20 = i12;
                                                                j10 = j14;
                                                                i18 = zzB7;
                                                                i17 = i43;
                                                                i15 = i34;
                                                                zzerVar = zzerVar5;
                                                            } else {
                                                                zzerVar = zzerVar4;
                                                                i19 = zzB;
                                                                str4 = str9;
                                                                s5 = zzv;
                                                                zzfuVar3 = zzfuVar5;
                                                                s6 = zzv2;
                                                                c6 = c5;
                                                                i20 = i12;
                                                                j10 = j14;
                                                                i18 = zzB7;
                                                                i17 = i43;
                                                                i15 = i34;
                                                            }
                                                            str5 = zzc6;
                                                            str2 = str11;
                                                            i14 = i40;
                                                            j11 = j8;
                                                            b2 = b6;
                                                        } else {
                                                            int i100 = i6;
                                                            if (zzB8 == 1664495672) {
                                                                zzakdVar2.zzd = i100;
                                                                str20 = "application/x-mp4-cea-608";
                                                            } else {
                                                                int zzg8 = zzerVar4.zzg();
                                                                zzerVar4.zzk(4);
                                                                if (zzerVar4.zzB() == 1702061171) {
                                                                    zzajy zzp2 = zzp(zzerVar4, zzg8);
                                                                    if (zzp2.zzb() != null && zzp2.zzb().length == 64) {
                                                                        String zzj3 = zzj(zzp2.zzb(), zzv, zzv2);
                                                                        String str21 = zzfj.zza;
                                                                        zzgufVar2 = zzguf.zzj(zzj3.getBytes(StandardCharsets.UTF_8));
                                                                        str20 = "application/vobsub";
                                                                    }
                                                                } else {
                                                                    zzgufVar2 = null;
                                                                    str20 = null;
                                                                }
                                                            }
                                                        }
                                                        i34 = zzg3;
                                                        j12 = Long.MAX_VALUE;
                                                        if (str20 != null) {
                                                        }
                                                        str5 = zzc6;
                                                        str2 = str11;
                                                        i14 = i40;
                                                        j11 = j8;
                                                        b2 = b6;
                                                    }
                                                    i34 = zzg3;
                                                    j12 = Long.MAX_VALUE;
                                                    zzgufVar2 = null;
                                                    if (str20 != null) {
                                                    }
                                                    str5 = zzc6;
                                                    str2 = str11;
                                                    i14 = i40;
                                                    j11 = j8;
                                                    b2 = b6;
                                                } else if (zzB8 == 1835365492) {
                                                    zzerVar4.zzh(zzg3 + 16);
                                                    char c10 = c8;
                                                    zzerVar4.zzM(c10);
                                                    String zzM = zzerVar4.zzM(c10);
                                                    if (zzM != null) {
                                                        zzt zztVar3 = new zzt();
                                                        zztVar3.zzb(zzB);
                                                        zztVar3.zzm(zzM);
                                                        zzakdVar2.zzb = zztVar3.zzM();
                                                    }
                                                } else if (zzB8 == 1667329389) {
                                                    zzt zztVar4 = new zzt();
                                                    zztVar4.zzb(zzB);
                                                    zztVar4.zzm("application/x-camera-motion");
                                                    zzakdVar2.zzb = zztVar4.zzM();
                                                }
                                                i15 = zzg3;
                                                zzerVar = zzerVar4;
                                                i19 = zzB;
                                                str4 = str9;
                                                str2 = str11;
                                                s5 = zzv;
                                                zzfuVar3 = zzfuVar5;
                                                s6 = zzv2;
                                                c6 = c5;
                                                i20 = i12;
                                                j10 = j14;
                                                i18 = zzB7;
                                                i17 = i43;
                                                str5 = zzc6;
                                                i14 = i40;
                                                j11 = j8;
                                                b2 = b6;
                                            }
                                            j11 = j8;
                                            String str22 = str9;
                                            zzo(zzerVar, zzB8, zzg3, i32, zzB, zzc6, z5, zzqVar, zzakdVar2, i40);
                                            i15 = zzg3;
                                            i18 = i32;
                                            i19 = zzB;
                                            str5 = zzc6;
                                            i14 = i40;
                                            str4 = str22;
                                            i17 = i33;
                                            zzfuVar3 = zzfuVar5;
                                            str2 = str11;
                                            c6 = c5;
                                            i20 = i12;
                                            b2 = b6;
                                        }
                                        zzerVar.zzh(i15 + i18);
                                        zzv = s5;
                                        i12 = i20;
                                        zzc6 = str5;
                                        b6 = b2;
                                        c5 = c6;
                                        zzv2 = s6;
                                        j8 = j11;
                                        str = str2;
                                        zzfuVar5 = zzfuVar3;
                                        j14 = j10;
                                        i6 = 1;
                                        c8 = 0;
                                        i40 = i14 + 1;
                                        zzB = i19;
                                        str9 = str4;
                                        i36 = i41;
                                        zzB6 = i42;
                                        zzerVar4 = zzerVar;
                                        i39 = i17;
                                    }
                                    int i101 = i39;
                                    String str23 = str;
                                    int i102 = i36;
                                    int i103 = zzB;
                                    zzfu zzfuVar6 = zzfuVar5;
                                    long j15 = j14;
                                    long j16 = j8;
                                    if (z4) {
                                        zzfuVar2 = zzfuVar6;
                                    } else {
                                        zzfuVar2 = zzfuVar6;
                                        zzfu zzd4 = zzfuVar2.zzd(1701082227);
                                        if (zzd4 != null && (zzn = zzn(zzd4)) != null) {
                                            long[] jArr3 = (long[]) zzn.first;
                                            jArr2 = (long[]) zzn.second;
                                            jArr = jArr3;
                                            zzvVar = zzakdVar2.zzb;
                                            if (zzvVar != null) {
                                                zzgqtVar2 = zzgqtVar;
                                                zzalcVar = null;
                                            } else {
                                                if (i101 != 0) {
                                                    zzft zzftVar = new zzft(i101);
                                                    zzt zza8 = zzvVar.zza();
                                                    zzap zzapVar = zzvVar.zzl;
                                                    zza8.zzk(zzapVar != null ? zzapVar.zzg(zzftVar) : new zzap(-9223372036854775807L, zzftVar));
                                                    zzvVar = zza8.zzM();
                                                }
                                                zzalc zzalcVar3 = new zzalc(i103, i102, zzaka.zza(j16, j15, str23), j7, zzt, zzaka.zzb(j16, j15, str23), zzvVar, zzakdVar2.zzd, zzakdVar2.zza, zzakdVar2.zzc, jArr, jArr2);
                                                zzgqtVar2 = zzgqtVar;
                                                zzalcVar = zzalcVar3;
                                            }
                                            zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                                            if (zzalcVar2 != null) {
                                                zzfu zzd5 = zzfuVar2.zzd(1835297121);
                                                zzd5.getClass();
                                                zzfu zzd6 = zzd5.zzd(1835626086);
                                                zzd6.getClass();
                                                zzfu zzd7 = zzd6.zzd(1937007212);
                                                zzd7.getClass();
                                                zzalf zzg9 = zzg(zzalcVar2, zzd7, zzafnVar, false);
                                                arrayList2 = arrayList;
                                                arrayList2.add(zzg9);
                                                i35 = i5 + 1;
                                                zzfuVar4 = zzfuVar;
                                                arrayList3 = arrayList2;
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    zzvVar = zzakdVar2.zzb;
                                    if (zzvVar != null) {
                                    }
                                    zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                                    if (zzalcVar2 != null) {
                                    }
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 == 0) {
                        if (zzB3 == -65536) {
                            if (zzB4 != 65536) {
                                if (zzB4 == -65536) {
                                    z7 = zzB5 != 0;
                                    zzB4 = -65536;
                                }
                                zzB3 = -65536;
                            } else {
                                z7 = zzB5 != 0;
                            }
                            if (true != z7) {
                                i9 = 270;
                                i8 = i9;
                                i6 = 1;
                                zzerVar2.zzk(16);
                                short zzv11 = zzerVar2.zzv();
                                zzerVar2.zzk(2);
                                short zzv22 = zzerVar2.zzv();
                                if (j2 == -9223372036854775807L) {
                                }
                                long j132 = zzd(zzc2.zza).zzc;
                                if (j6 == -9223372036854775807L) {
                                }
                                zzfu zzd22 = zzd.zzd(1835626086);
                                zzd22.getClass();
                                zzfu zzd32 = zzd22.zzd(1937007212);
                                zzd32.getClass();
                                zzfv zzc52 = zzd.zzc(1835296868);
                                zzc52.getClass();
                                zzer zzerVar32 = zzc52.zza;
                                zzerVar32.zzh(8);
                                zza2 = zza(zzerVar32.zzB());
                                zzerVar32.zzk(zza2 == 0 ? 8 : 16);
                                long zzz5 = zzerVar32.zzz();
                                int zzg22 = zzerVar32.zzg();
                                i10 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                    }
                                    if (i10 >= i11) {
                                    }
                                    i10++;
                                    c7 = c5;
                                    i8 = i8;
                                    arrayList3 = arrayList3;
                                }
                                int zzt32 = zzerVar32.zzt();
                                char[] cArr2 = new char[3];
                                cArr2[0] = (char) (((zzt32 >> 10) & 31) + 96);
                                cArr2[i6] = (char) (((zzt32 >> 5) & 31) + 96);
                                cArr2[c5] = (char) ((zzt32 & 31) + 96);
                                while (i13 < 3) {
                                }
                                str = new String(cArr2);
                                zzc = zzd32.zzc(1937011556);
                                if (zzc == null) {
                                }
                            }
                            zzB3 = -65536;
                        }
                        i6 = 1;
                        i7 = 0;
                    } else {
                        int i104 = zzB2;
                        i6 = 1;
                        i7 = i104;
                    }
                    i8 = ((i7 == -65536 || i7 == 65536) && zzB3 == 0 && zzB4 == 0 && zzB5 == -65536) ? 180 : 0;
                    zzerVar2.zzk(16);
                    short zzv112 = zzerVar2.zzv();
                    zzerVar2.zzk(2);
                    short zzv222 = zzerVar2.zzv();
                    if (j2 == -9223372036854775807L) {
                    }
                    long j1322 = zzd(zzc2.zza).zzc;
                    if (j6 == -9223372036854775807L) {
                    }
                    zzfu zzd222 = zzd.zzd(1835626086);
                    zzd222.getClass();
                    zzfu zzd322 = zzd222.zzd(1937007212);
                    zzd322.getClass();
                    zzfv zzc522 = zzd.zzc(1835296868);
                    zzc522.getClass();
                    zzer zzerVar322 = zzc522.zza;
                    zzerVar322.zzh(8);
                    zza2 = zza(zzerVar322.zzB());
                    zzerVar322.zzk(zza2 == 0 ? 8 : 16);
                    long zzz52 = zzerVar322.zzz();
                    int zzg222 = zzerVar322.zzg();
                    i10 = 0;
                    while (true) {
                        if (zza2 == 0) {
                        }
                        if (i10 >= i11) {
                        }
                        i10++;
                        c7 = c5;
                        i8 = i8;
                        arrayList3 = arrayList3;
                    }
                    int zzt322 = zzerVar322.zzt();
                    char[] cArr22 = new char[3];
                    cArr22[0] = (char) (((zzt322 >> 10) & 31) + 96);
                    cArr22[i6] = (char) (((zzt322 >> 5) & 31) + 96);
                    cArr22[c5] = (char) ((zzt322 & 31) + 96);
                    while (i13 < 3) {
                    }
                    str = new String(cArr22);
                    zzc = zzd322.zzc(1937011556);
                    if (zzc == null) {
                    }
                }
                zzfuVar2 = zzfuVar5;
                zzalcVar = null;
                zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                if (zzalcVar2 != null) {
                }
            }
            i35 = i5 + 1;
            zzfuVar4 = zzfuVar;
            arrayList3 = arrayList2;
        }
    }

    public static zzap zzc(zzfv zzfvVar) {
        int zzF;
        zzer zzerVar = zzfvVar.zza;
        zzerVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzerVar.zzd() >= 8) {
            int zzg = zzerVar.zzg();
            int zzB = zzerVar.zzB() + zzg;
            int zzB2 = zzerVar.zzB();
            zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzerVar.zzh(zzg);
                zzerVar.zzk(8);
                zzf(zzerVar);
                while (true) {
                    if (zzerVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzerVar.zzg();
                    int zzB3 = zzerVar.zzB() + zzg2;
                    if (zzerVar.zzB() == 1768715124) {
                        zzerVar.zzh(zzg2);
                        zzerVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzerVar.zzg() < zzB3) {
                            zzao zzc = zzakq.zzc(zzerVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                        }
                    } else {
                        zzerVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzerVar.zzh(zzg);
                zzerVar.zzk(12);
                while (true) {
                    if (zzerVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzerVar.zzg();
                    int zzB4 = zzerVar.zzB();
                    if (zzerVar.zzB() != 1935766900) {
                        zzerVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzerVar.zzk(4);
                        int i5 = -1;
                        int i6 = 0;
                        for (int i7 = 0; i7 < 2; i7++) {
                            int zzs = zzerVar.zzs();
                            int zzs2 = zzerVar.zzs();
                            if (zzs == 0) {
                                i5 = zzs2;
                            } else if (zzs == 1) {
                                i6 = zzs2;
                            }
                        }
                        if (i5 == 12) {
                            zzF = 240;
                        } else if (i5 == 13) {
                            zzF = 120;
                        } else {
                            if (i5 == 21 && zzerVar.zzd() >= 8 && zzerVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzerVar.zzB();
                                int zzB6 = zzerVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzerVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new zzap(-9223372036854775807L, new zzaix(zzF, i6));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzerVar));
            }
            zzerVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static zzfy zzd(zzer zzerVar) {
        long zzD;
        long zzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            zzD = zzerVar.zzz();
            zzD2 = zzerVar.zzz();
        } else {
            zzD = zzerVar.zzD();
            zzD2 = zzerVar.zzD();
        }
        return new zzfy(zzD, zzD2, zzerVar.zzz());
    }

    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzc = zzfuVar.zzc(1751411826);
        zzfv zzc2 = zzfuVar.zzc(1801812339);
        zzfv zzc3 = zzfuVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzi(zzc.zza) == 1835299937) {
            zzer zzerVar = zzc2.zza;
            zzerVar.zzh(12);
            int zzB = zzerVar.zzB();
            String[] strArr = new String[zzB];
            for (int i5 = 0; i5 < zzB; i5++) {
                int zzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i5] = zzerVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int zzB3 = zzerVar2.zzB() + zzerVar2.zzg();
                int zzB4 = zzerVar2.zzB() - 1;
                if (zzB4 < 0 || zzB4 >= zzB) {
                    u.r(new StringBuilder(String.valueOf(zzB4).length() + 41), "Skipped metadata with unknown key index: ", zzB4, "BoxParsers");
                } else {
                    String str = strArr[zzB4];
                    while (true) {
                        int zzg = zzerVar2.zzg();
                        if (zzg >= zzB3) {
                            zzfsVar = null;
                            break;
                        }
                        int zzB5 = zzerVar2.zzB();
                        if (zzerVar2.zzB() == 1684108385) {
                            int zzB6 = zzerVar2.zzB();
                            int zzB7 = zzerVar2.zzB();
                            int i6 = zzB5 - 16;
                            byte[] bArr = new byte[i6];
                            zzerVar2.zzm(bArr, 0, i6);
                            zzfsVar = new zzfs(str, bArr, zzB7, zzB6);
                            break;
                        }
                        zzerVar2.zzh(zzg + zzB5);
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                }
                zzerVar2.zzh(zzB3);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int zzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzerVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0430  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzalf zzg(zzalc zzalcVar, zzfu zzfuVar, zzafn zzafnVar, boolean z4) {
        zzakb zzakfVar;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzv zzvVar;
        long[] jArr;
        int[] iArr;
        int i11;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long[] jArr3;
        long j2;
        long[] jArr4;
        int i19;
        long[] jArr5;
        int[] iArr2;
        long j5;
        long j6;
        int i20;
        int i21;
        int i22;
        long j7;
        long[] jArr6;
        long j8;
        int i23;
        boolean z6;
        int[] iArr3;
        int i24;
        int i25;
        boolean z7;
        int length;
        zzalc zzalcVar2 = zzalcVar;
        zzfv zzc = zzfuVar.zzc(1937011578);
        if (zzc != null) {
            zzakfVar = new zzake(zzc, zzalcVar2.zzg);
        } else {
            zzfv zzc2 = zzfuVar.zzc(1937013298);
            if (zzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzakfVar = new zzakf(zzc2);
        }
        int zza2 = zzakfVar.zza();
        if (zza2 == 0) {
            return new zzalf(zzalcVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzalcVar2.zzb == 2) {
            long j9 = zzalcVar2.zzf;
            if (j9 > 0) {
                zzt zza3 = zzalcVar2.zzg.zza();
                zza3.zzx(zza2 / (j9 / 1000000.0f));
                zzalcVar2 = zzalcVar2.zzb(zza3.zzM());
            }
        }
        zzfv zzc3 = zzfuVar.zzc(1937007471);
        if (zzc3 == null) {
            zzc3 = zzfuVar.zzc(1668232756);
            zzc3.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        zzfv zzc4 = zzfuVar.zzc(1937011555);
        zzc4.getClass();
        zzer zzerVar = zzc4.zza;
        zzfv zzc5 = zzfuVar.zzc(1937011827);
        zzc5.getClass();
        zzer zzerVar2 = zzc5.zza;
        zzfv zzc6 = zzfuVar.zzc(1937011571);
        zzer zzerVar3 = zzc6 != null ? zzc6.zza : null;
        zzfv zzc7 = zzfuVar.zzc(1668576371);
        zzer zzerVar4 = zzc7 != null ? zzc7.zza : null;
        zzajx zzajxVar = new zzajx(zzerVar, zzc3.zza, z5);
        zzerVar2.zzh(12);
        int zzH = zzerVar2.zzH() - 1;
        int zzH2 = zzerVar2.zzH();
        int zzH3 = zzerVar2.zzH();
        if (zzerVar4 != null) {
            zzerVar4.zzh(12);
            i5 = zzerVar4.zzH();
        } else {
            i5 = 0;
        }
        if (zzerVar3 != null) {
            zzerVar3.zzh(12);
            i6 = zzerVar3.zzH();
            if (i6 > 0) {
                i8 = zzerVar3.zzH() - 1;
                i7 = 0;
            } else {
                i7 = 0;
                i8 = -1;
                zzerVar3 = null;
            }
        } else {
            i6 = 0;
            i7 = 0;
            i8 = -1;
        }
        int zzb2 = zzakfVar.zzb();
        zzv zzvVar2 = zzalcVar2.zzg;
        if (zzb2 != -1) {
            String str = zzvVar2.zzo;
            i9 = 1;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzH == 0) {
                if (i5 == 0 && i6 == 0) {
                    zzH = i7;
                    i10 = 1;
                } else {
                    i10 = i7;
                    zzH = i10;
                }
                ArrayList arrayList = new ArrayList();
                ?? r31 = zzerVar3 != null ? i9 : i7;
                if (i10 == 0) {
                    int i26 = zzajxVar.zza;
                    long[] jArr7 = new long[i26];
                    int[] iArr4 = new int[i26];
                    while (zzajxVar.zza()) {
                        int i27 = zzajxVar.zzb;
                        jArr7[i27] = zzajxVar.zzd;
                        iArr4[i27] = zzajxVar.zzc;
                    }
                    long j10 = zzH3;
                    int i28 = 8192 / zzb2;
                    int i29 = i7;
                    int i30 = i29;
                    while (i29 < i26) {
                        int i31 = iArr4[i29];
                        String str2 = zzfj.zza;
                        i30 += ((i31 + i28) - 1) / i28;
                        i29++;
                    }
                    long[] jArr8 = new long[i30];
                    int[] iArr5 = new int[i30];
                    jArr4 = new long[i30];
                    iArr = new int[i30];
                    int i32 = i7;
                    int i33 = i32;
                    int i34 = i33;
                    int i35 = i34;
                    int i36 = i35;
                    while (i32 < i26) {
                        int i37 = iArr4[i32];
                        long j11 = jArr7[i32];
                        int i38 = i36;
                        int i39 = i26;
                        int i40 = i35;
                        int i41 = i38;
                        int i42 = i32;
                        int i43 = i37;
                        while (i43 > 0) {
                            int min = Math.min(i28, i43);
                            jArr8[i41] = j11;
                            int i44 = i43;
                            int i45 = zzb2 * min;
                            iArr5[i41] = i45;
                            int i46 = i34 + i45;
                            i40 = Math.max(i40, i45);
                            long j12 = j10;
                            jArr4[i41] = j12 * i33;
                            iArr[i41] = i9;
                            j11 += iArr5[i41];
                            i33 += min;
                            i43 = i44 - min;
                            i41++;
                            i34 = i46;
                            j10 = j12;
                        }
                        long j13 = j10;
                        i32 = i42 + 1;
                        int i47 = i41;
                        i35 = i40;
                        i26 = i39;
                        i36 = i47;
                        j10 = j13;
                    }
                    j6 = i34;
                    j5 = j10 * i33;
                    zzvVar = zzvVar2;
                    jArr5 = jArr8;
                    i19 = i30;
                    iArr2 = iArr5;
                    i20 = i35;
                } else {
                    long[] jArr9 = new long[zza2];
                    int[] iArr6 = new int[zza2];
                    zzer zzerVar5 = zzerVar4;
                    long[] jArr10 = new long[zza2];
                    int i48 = i6;
                    int[] iArr7 = new int[zza2];
                    int i49 = i8;
                    zzakb zzakbVar = zzakfVar;
                    int i50 = i49;
                    zzvVar = zzvVar2;
                    int i51 = i5;
                    int i52 = zzH;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    int i53 = i7;
                    int i54 = i53;
                    int i55 = i54;
                    int i56 = i55;
                    int i57 = zzH3;
                    int i58 = i56;
                    while (true) {
                        if (i53 >= zza2) {
                            jArr = jArr9;
                            iArr = iArr7;
                            break;
                        }
                        long j17 = j14;
                        int i59 = i9;
                        while (true) {
                            if (i55 != 0) {
                                i21 = i55;
                                i22 = i59;
                                break;
                            }
                            boolean zza4 = zzajxVar.zza();
                            if (zza4 == 0) {
                                i21 = i7;
                                i22 = zza4;
                                break;
                            }
                            j17 = zzajxVar.zzd;
                            i55 = zzajxVar.zzc;
                            zza2 = zza2;
                            i59 = zza4;
                        }
                        int i60 = zza2;
                        if (i22 == 0) {
                            zzee.zzc("BoxParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr9, i53);
                            int[] copyOf2 = Arrays.copyOf(iArr6, i53);
                            jArr10 = Arrays.copyOf(jArr10, i53);
                            jArr = copyOf;
                            iArr6 = copyOf2;
                            iArr = Arrays.copyOf(iArr7, i53);
                            zza2 = i53;
                            break;
                        }
                        if (zzerVar5 != null) {
                            while (true) {
                                if (i56 != 0) {
                                    break;
                                }
                                if (i51 <= 0) {
                                    i56 = i7;
                                    break;
                                }
                                i51--;
                                i56 = zzerVar5.zzH();
                                i58 = zzerVar5.zzB();
                            }
                            i56--;
                        }
                        int zzc8 = zzakbVar.zzc();
                        int[] iArr8 = iArr7;
                        long[] jArr11 = jArr9;
                        long j18 = zzc8;
                        j16 += j18;
                        if (zzc8 > i54) {
                            i54 = zzc8;
                        }
                        jArr11[i53] = j17;
                        iArr6[i53] = zzc8;
                        int i61 = i21;
                        jArr10[i53] = j15 + i58;
                        iArr8[i53] = r31;
                        if (i53 == i50) {
                            iArr8[i53] = i9;
                            arrayList.add(Integer.valueOf(i53));
                        }
                        if (zzerVar3 != null && i53 == i50) {
                            int i62 = i48 - 1;
                            if (i62 > 0) {
                                i48 = i62;
                                i50 = zzerVar3.zzH() - 1;
                            } else {
                                i48 = i62;
                            }
                        }
                        j15 += i57;
                        zzH2--;
                        if (zzH2 == 0) {
                            if (i52 > 0) {
                                i52--;
                                zzH2 = zzerVar2.zzH();
                                i57 = zzerVar2.zzB();
                            } else {
                                zzH2 = i7;
                            }
                        }
                        long j19 = j17 + j18;
                        i55 = i61 - 1;
                        i53++;
                        jArr9 = jArr11;
                        iArr7 = iArr8;
                        zza2 = i60;
                        j14 = j19;
                    }
                    long j20 = j15 + i58;
                    if (zzerVar5 != null) {
                        while (i51 > 0) {
                            if (zzerVar5.zzH() != 0) {
                                i11 = i7;
                                break;
                            }
                            zzerVar5.zzB();
                            i51--;
                        }
                    }
                    i11 = i9;
                    if (i48 == 0) {
                        if (zzH2 != 0) {
                            jArr2 = jArr10;
                            i12 = i11;
                            i13 = zza2;
                            i14 = zzH2;
                            i18 = i7;
                        } else if (i55 != 0) {
                            jArr2 = jArr10;
                            i12 = i11;
                            i13 = zza2;
                            i18 = i7;
                            i14 = i18;
                        } else if (i52 != 0) {
                            jArr2 = jArr10;
                            i12 = i11;
                            i13 = zza2;
                            i18 = i7;
                            i14 = i18;
                            i15 = i14;
                            i16 = i52;
                            i17 = i56;
                        } else if (i56 != 0) {
                            jArr2 = jArr10;
                            i12 = i11;
                            i13 = zza2;
                            i18 = i7;
                            i14 = i18;
                            i15 = i14;
                            i16 = i15;
                            i17 = i56;
                        } else if (i11 == 0) {
                            jArr2 = jArr10;
                            i13 = zza2;
                            i12 = i7;
                            i18 = i12;
                            i14 = i18;
                            i15 = i14;
                            i16 = i15;
                            i17 = i16;
                        } else {
                            jArr2 = jArr10;
                            i13 = zza2;
                            j2 = j20;
                            jArr3 = jArr;
                            jArr4 = jArr2;
                            i19 = i13;
                            jArr5 = jArr3;
                            iArr2 = iArr6;
                            j5 = j2;
                            j6 = j16;
                            i20 = i54;
                        }
                        i15 = i55;
                        i16 = i52;
                        i17 = i56;
                    } else {
                        jArr2 = jArr10;
                        i12 = i11;
                        i13 = zza2;
                        i14 = zzH2;
                        i15 = i55;
                        i16 = i52;
                        i17 = i56;
                        i18 = i48;
                    }
                    int i63 = zzalcVar2.zza;
                    int length2 = String.valueOf(i16).length() + String.valueOf(i15).length() + String.valueOf(i14).length() + String.valueOf(i18).length() + String.valueOf(i63).length() + 66 + 35 + 26 + 33 + 36;
                    int length3 = String.valueOf(i17).length();
                    j2 = j20;
                    String str3 = i9 != i12 ? ", ctts invalid" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    StringBuilder sb = new StringBuilder(str3.length() + length2 + length3);
                    jArr3 = jArr;
                    u.s(sb, "Inconsistent stbl box for track ", i63, ": remainingSynchronizationSamples ", i18);
                    u.s(sb, ", remainingSamplesAtTimestampDelta ", i14, ", remainingSamplesInChunk ", i15);
                    u.s(sb, ", remainingTimestampDeltaChanges ", i16, ", remainingSamplesAtTimestampOffset ", i17);
                    sb.append(str3);
                    zzee.zzc("BoxParsers", sb.toString());
                    jArr4 = jArr2;
                    i19 = i13;
                    jArr5 = jArr3;
                    iArr2 = iArr6;
                    j5 = j2;
                    j6 = j16;
                    i20 = i54;
                }
                j7 = zzalcVar2.zzf;
                if (j7 > 0) {
                    long zzt = zzfj.zzt(j6 * 8, 1000000L, j7, RoundingMode.HALF_DOWN);
                    if (zzt > 0 && zzt < 2147483647L) {
                        zzt zza5 = zzvVar.zza();
                        zza5.zzh((int) zzt);
                        zzalcVar2 = zzalcVar2.zzb(zza5.zzM());
                    }
                }
                long j21 = zzalcVar2.zzc;
                RoundingMode roundingMode = RoundingMode.DOWN;
                long zzt2 = zzfj.zzt(j5, 1000000L, j21, roundingMode);
                int[] zzf = zzgxz.zzf(arrayList);
                jArr6 = zzalcVar2.zzi;
                if (jArr6 != null) {
                    zzfj.zzu(jArr4, 1000000L, j21);
                    return new zzalf(zzalcVar2, jArr5, iArr2, i20, jArr4, iArr, zzf, r31, zzt2, i19);
                }
                int[] iArr9 = iArr;
                int length4 = jArr6.length;
                if (length4 == 1) {
                    if (zzalcVar2.zzb != 1 || (length = jArr4.length) < 2) {
                        j8 = j21;
                    } else {
                        long[] jArr12 = zzalcVar2.zzj;
                        jArr12.getClass();
                        long j22 = jArr12[i7];
                        long j23 = jArr6[i7];
                        long j24 = zzalcVar2.zzd;
                        long zzt3 = zzfj.zzt(j23, j21, j24, roundingMode) + j22;
                        int i64 = length - 1;
                        int i65 = i7;
                        int max = Math.max(i65, Math.min(4, i64));
                        int max2 = Math.max(i65, Math.min(length - 4, i64));
                        if (jArr4[i65] > j22 || j22 >= jArr4[max] || jArr4[max2] >= zzt3 || zzt3 > 2 + j5) {
                            j8 = j21;
                        } else {
                            long max3 = Math.max(0L, j5 - zzt3);
                            long j25 = j22 - jArr4[0];
                            long j26 = zzalcVar2.zzg.zzH;
                            long zzt4 = zzfj.zzt(j25, j26, j21, roundingMode);
                            long zzt5 = zzfj.zzt(max3, j26, j21, roundingMode);
                            j8 = j21;
                            if (zzt4 == 0) {
                                if (zzt5 != 0) {
                                    zzt4 = 0;
                                }
                            }
                            if (zzt4 <= 2147483647L && zzt5 <= 2147483647L) {
                                zzafnVar.zza = (int) zzt4;
                                zzafnVar.zzb = (int) zzt5;
                                zzfj.zzu(jArr4, 1000000L, j8);
                                return new zzalf(zzalcVar2, jArr5, iArr2, i20, jArr4, iArr9, zzf, r31, zzfj.zzt(jArr6[0], 1000000L, j24, roundingMode), i19);
                            }
                        }
                    }
                    i23 = 1;
                    length4 = 1;
                } else {
                    j8 = j21;
                    i23 = 1;
                }
                if (length4 == i23 && jArr6[0] == 0) {
                    long[] jArr13 = zzalcVar2.zzj;
                    jArr13.getClass();
                    long j27 = jArr13[0];
                    int i66 = 0;
                    while (i66 < jArr4.length) {
                        long j28 = j8;
                        jArr4[i66] = zzfj.zzt(jArr4[i66] - j27, 1000000L, j28, RoundingMode.DOWN);
                        i66++;
                        j8 = j28;
                    }
                    return new zzalf(zzalcVar2, jArr5, iArr2, i20, jArr4, iArr9, zzf, r31, zzfj.zzt(j5 - j27, 1000000L, j8, RoundingMode.DOWN), i19);
                }
                long j29 = j8;
                long[] jArr14 = jArr5;
                int[] iArr10 = iArr2;
                int i67 = i19;
                boolean z8 = zzalcVar2.zzb == 1;
                long[] jArr15 = zzalcVar2.zzj;
                int[] iArr11 = new int[length4];
                int[] iArr12 = new int[length4];
                jArr15.getClass();
                int i68 = 0;
                int i69 = 0;
                boolean z9 = false;
                int i70 = 0;
                while (i68 < jArr6.length) {
                    int[] iArr13 = iArr12;
                    long j30 = jArr15[i68];
                    if (j30 != -1) {
                        iArr3 = iArr11;
                        i24 = i68;
                        long j31 = j29;
                        j29 = j31;
                        long zzt6 = zzfj.zzt(jArr6[i68], j31, zzalcVar2.zzd, RoundingMode.DOWN) + j30;
                        boolean z10 = z9;
                        iArr3[i24] = zzfj.zzm(jArr4, j30, true, true);
                        int zzo = zzfj.zzo(jArr4, zzt6, z8, false);
                        z6 = z8;
                        int i71 = zzo - 1;
                        int i72 = 0;
                        for (int i73 = zzo; i73 < jArr4.length; i73++) {
                            if (jArr4[i73] >= zzt6) {
                                i72++;
                                if (i72 > zzalcVar2.zzg.zzq) {
                                    break;
                                }
                            } else {
                                i71 = i73;
                            }
                        }
                        iArr13[i24] = i71 + 1;
                        int i74 = iArr3[i24];
                        while (true) {
                            i25 = iArr3[i24];
                            if (i25 <= 0 || (iArr9[i25] & 1) != 0) {
                                break;
                            }
                            iArr3[i24] = i25 - 1;
                        }
                        if (i25 == 0) {
                            z7 = false;
                            if ((iArr9[0] & 1) == 0) {
                                iArr3[i24] = i74;
                                while (true) {
                                    i25 = iArr3[i24];
                                    if (i25 >= iArr13[i24] || (iArr9[i25] & 1) != 0) {
                                        break;
                                    }
                                    iArr3[i24] = i25 + 1;
                                }
                            }
                        } else {
                            z7 = false;
                        }
                        int i75 = iArr13[i24];
                        int i76 = (i75 - i25) + i69;
                        boolean z11 = i70 != i25 ? true : z7;
                        i70 = i75;
                        z9 = z10 | z11;
                        i69 = i76;
                    } else {
                        z6 = z8;
                        iArr3 = iArr11;
                        i24 = i68;
                    }
                    i68 = i24 + 1;
                    iArr12 = iArr13;
                    iArr11 = iArr3;
                    z8 = z6;
                }
                int[] iArr14 = iArr12;
                int[] iArr15 = iArr11;
                boolean z12 = z9 | (i69 != i67);
                long[] jArr16 = z12 ? new long[i69] : jArr14;
                int[] iArr16 = z12 ? new int[i69] : iArr10;
                if (true == z12) {
                    i20 = 0;
                }
                int[] iArr17 = z12 ? new int[i69] : iArr9;
                if (z12) {
                    arrayList = new ArrayList();
                }
                long[] jArr17 = new long[i69];
                int i77 = 0;
                boolean z13 = false;
                int i78 = 0;
                int i79 = i20;
                long j32 = 0;
                while (i77 < jArr6.length) {
                    long j33 = jArr15[i77];
                    int i80 = iArr15[i77];
                    long[] jArr18 = jArr6;
                    int i81 = iArr14[i77];
                    long[] jArr19 = jArr17;
                    if (z12) {
                        int i82 = i81 - i80;
                        System.arraycopy(jArr14, i80, jArr16, i78, i82);
                        System.arraycopy(iArr10, i80, iArr16, i78, i82);
                        System.arraycopy(iArr9, i80, iArr17, i78, i82);
                    }
                    while (i80 < i81) {
                        int[] iArr18 = iArr16;
                        int[] iArr19 = iArr17;
                        long j34 = zzalcVar2.zzd;
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long zzt7 = zzfj.zzt(j32, 1000000L, j34, roundingMode2);
                        long zzt8 = zzfj.zzt(jArr4[i80] - j33, 1000000L, j29, roundingMode2);
                        z13 = (!(zzt8 >= 0)) | z13;
                        jArr19[i78] = zzt7 + zzt8;
                        if (z12 && iArr18[i78] > i79) {
                            i79 = iArr10[i80];
                        }
                        if (z12 && r31 == 0 && (iArr19[i78] & 1) != 0) {
                            arrayList.add(Integer.valueOf(i78));
                        }
                        i78++;
                        i80++;
                        iArr17 = iArr19;
                        iArr16 = iArr18;
                    }
                    j32 += jArr18[i77];
                    i77++;
                    iArr17 = iArr17;
                    iArr16 = iArr16;
                    jArr6 = jArr18;
                    jArr17 = jArr19;
                }
                int[] iArr20 = iArr17;
                long[] jArr20 = jArr17;
                int[] iArr21 = iArr16;
                long zzt9 = zzfj.zzt(j32, 1000000L, zzalcVar2.zzd, RoundingMode.DOWN);
                if (z13) {
                    zzt zza6 = zzalcVar2.zzg.zza();
                    zza6.zzs(true);
                    zzalcVar2 = zzalcVar2.zzb(zza6.zzM());
                }
                return new zzalf(zzalcVar2, jArr16, iArr21, i79, jArr20, iArr20, zzgxz.zzf(arrayList), r31, zzt9, jArr16.length);
            }
        } else {
            i9 = 1;
        }
        i10 = i7;
        ArrayList arrayList2 = new ArrayList();
        if (zzerVar3 != null) {
        }
        if (i10 == 0) {
        }
        j7 = zzalcVar2.zzf;
        if (j7 > 0) {
        }
        long j212 = zzalcVar2.zzc;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        long zzt22 = zzfj.zzt(j5, 1000000L, j212, roundingMode3);
        int[] zzf2 = zzgxz.zzf(arrayList2);
        jArr6 = zzalcVar2.zzi;
        if (jArr6 != null) {
        }
    }

    private static zzap zzh(zzer zzerVar) {
        short zzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String zzK = zzerVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    private static String zzj(byte[] bArr, int i5, int i6) {
        zzgrc.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i7 = 0; i7 < bArr.length - 3; i7 += 4) {
            int zze = zzgxz.zze(bArr[i7], bArr[i7 + 1], bArr[i7 + 2], bArr[i7 + 3]);
            String str = zzfj.zza;
            int i8 = ((zze >> 8) & 255) - 128;
            int i9 = (zze >> 16) & 255;
            int i10 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i10 * 17790) / 10000) + i9, 255)) | (Math.max(0, Math.min(((i8 * 14075) / 10000) + i9, 255)) << 16) | (Math.max(0, Math.min((i9 - ((i10 * 3455) / 10000)) - ((i8 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzgqw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(u.e(zzd, u.e(String.valueOf(i6), String.valueOf(i5).length() + 7, 10), 1));
        sb.append("size: ");
        sb.append(i5);
        sb.append("x");
        sb.append(i6);
        return h1.b(sb, "\npalette: ", zzd, "\n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014e, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzi zzk(zzer zzerVar) {
        int i5;
        int zzj;
        int zzj2;
        zzh zzhVar = new zzh();
        byte[] zzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(zzi, zzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int zzj3 = zzeqVar.zzj(3);
        zzeqVar.zzh(6);
        boolean zzi2 = zzeqVar.zzi();
        boolean zzi3 = zzeqVar.zzi();
        boolean z4 = false;
        if (zzj3 == 2) {
            if (zzi2) {
                i5 = true == zzi3 ? 12 : 10;
                zzhVar.zze(i5);
                zzhVar.zzf(i5);
                int i6 = 13;
                zzeqVar.zzh(13);
                zzeqVar.zzg();
                zzj = zzeqVar.zzj(4);
                if (zzj == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj).length() + 22);
                    sb.append("Unsupported obu_type: ");
                    sb.append(zzj);
                    zzee.zzb("BoxParsers", sb.toString());
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported obu_extension_flag");
                    return zzhVar.zzg();
                }
                boolean zzi4 = zzeqVar.zzi();
                zzeqVar.zzg();
                if (zzi4 && zzeqVar.zzj(8) > 127) {
                    zzee.zzb("BoxParsers", "Excessive obu_size");
                    return zzhVar.zzg();
                }
                int zzj4 = zzeqVar.zzj(3);
                zzeqVar.zzg();
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported timing_info_present_flag");
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return zzhVar.zzg();
                }
                int zzj5 = zzeqVar.zzj(5);
                for (int i7 = 0; i7 <= zzj5; i7++) {
                    zzeqVar.zzh(12);
                    if (zzeqVar.zzj(5) > 7) {
                        zzeqVar.zzg();
                    }
                }
                int zzj6 = zzeqVar.zzj(4);
                int zzj7 = zzeqVar.zzj(4);
                zzeqVar.zzh(zzj6 + 1);
                zzeqVar.zzh(zzj7 + 1);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                }
                zzeqVar.zzh(7);
                boolean zzi5 = zzeqVar.zzi();
                if (zzi5) {
                    zzeqVar.zzh(2);
                }
                if ((zzeqVar.zzi() || zzeqVar.zzj(1) > 0) && !zzeqVar.zzi()) {
                    zzeqVar.zzh(1);
                }
                if (zzi5) {
                    zzeqVar.zzh(3);
                }
                zzeqVar.zzh(3);
                boolean zzi6 = zzeqVar.zzi();
                if (zzj4 == 2) {
                    if (zzi6) {
                        zzeqVar.zzg();
                    }
                }
                if (zzeqVar.zzi()) {
                    z4 = true;
                }
                if (zzeqVar.zzi()) {
                    int zzj8 = zzeqVar.zzj(8);
                    int zzj9 = zzeqVar.zzj(8);
                    int zzj10 = zzeqVar.zzj(8);
                    if (!z4 && zzj8 == 1) {
                        if (zzj9 != 13) {
                            zzj8 = 1;
                        } else if (zzj10 == 0) {
                            zzj2 = 1;
                            zzj8 = 1;
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i6));
                        } else {
                            zzj8 = 1;
                            zzj2 = zzeqVar.zzj(1);
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i6));
                        }
                    }
                    i6 = zzj9;
                    zzj2 = zzeqVar.zzj(1);
                    zzhVar.zza(zzi.zzb(zzj8));
                    zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(i6));
                }
                return zzhVar.zzg();
            }
            zzi2 = false;
            zzj3 = 2;
        }
        if (zzj3 <= 2) {
            i5 = true != zzi2 ? 8 : 10;
            zzhVar.zze(i5);
            zzhVar.zzf(i5);
        }
        int i62 = 13;
        zzeqVar.zzh(13);
        zzeqVar.zzg();
        zzj = zzeqVar.zzj(4);
        if (zzj == 1) {
        }
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(zzi, zzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int zzj = zzeqVar.zzj(8);
        for (int i5 = 0; i5 < zzj; i5++) {
            zzeqVar.zzo(1);
            int zzj2 = zzeqVar.zzj(8);
            for (int i6 = 0; i6 < zzj2; i6++) {
                zzeqVar.zzh(6);
                boolean zzi2 = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int zzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzeqVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzeqVar.zzj(8);
                    int zzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zzi3 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfu zzfuVar) {
        zzfv zzc = zzfuVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        zzer zzerVar = zzc.zza;
        zzerVar.zzh(8);
        int zza2 = zza(zzerVar.zzB());
        int zzH = zzerVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i5 = 0; i5 < zzH; i5++) {
            jArr[i5] = zza2 == 1 ? zzerVar.zzJ() : zzerVar.zzz();
            jArr2[i5] = zza2 == 1 ? zzerVar.zzD() : zzerVar.zzB();
            if (zzerVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzerVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x04c7, code lost:
    
        r2.zzk(com.google.android.gms.internal.ads.zzgxz.zza(r2.zzP()));
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzo(zzer zzerVar, int i5, int i6, int i7, int i8, String str, boolean z4, zzq zzqVar, zzakd zzakdVar, int i9) {
        int i10;
        int i11;
        int zzt;
        int zzF;
        int zzB;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str3;
        int i20;
        int i21;
        int i22;
        boolean z5;
        int i23 = i5;
        int i24 = i7;
        zzq zzqVar2 = zzqVar;
        zzerVar.zzh(i6 + 16);
        if (z4) {
            i10 = zzerVar.zzt();
            zzerVar.zzk(6);
        } else {
            zzerVar.zzk(8);
            i10 = 0;
        }
        if (i10 == 0 || i10 == 1) {
            i11 = 2;
            zzt = zzerVar.zzt();
            zzerVar.zzk(6);
            zzF = zzerVar.zzF();
            zzerVar.zzh(zzerVar.zzg() - 4);
            zzB = zzerVar.zzB();
            i12 = 32;
            if (i10 == 1) {
                zzerVar.zzk(16);
            }
            i13 = -1;
        } else {
            if (i10 != 2) {
                return;
            }
            zzerVar.zzk(16);
            zzF = (int) Math.round(Double.longBitsToDouble(zzerVar.zzD()));
            int zzH = zzerVar.zzH();
            zzerVar.zzk(4);
            i11 = 2;
            int zzH2 = zzerVar.zzH();
            int zzH3 = zzerVar.zzH();
            int i25 = zzH3 & 1;
            int i26 = zzH3 & 2;
            if (i25 == 0) {
                if (zzH2 == 8) {
                    i13 = 3;
                } else if (zzH2 == 16) {
                    i13 = i26 != 0 ? 268435456 : 2;
                } else if (zzH2 == 24) {
                    i13 = i26 != 0 ? 1342177280 : 21;
                } else {
                    if (zzH2 == 32) {
                        i13 = i26 != 0 ? 1610612736 : 22;
                    }
                    i13 = -1;
                }
                zzerVar.zzk(8);
                zzt = zzH;
                i12 = 32;
                zzB = 0;
            } else {
                if (zzH2 == 32) {
                    i13 = 4;
                    zzerVar.zzk(8);
                    zzt = zzH;
                    i12 = 32;
                    zzB = 0;
                }
                i13 = -1;
                zzerVar.zzk(8);
                zzt = zzH;
                i12 = 32;
                zzB = 0;
            }
        }
        if (i23 == 1767992678) {
            zzt = -1;
            zzF = -1;
        } else {
            if (i23 == 1935764850) {
                zzF = 8000;
            } else if (i23 == 1935767394) {
                zzF = 16000;
                i23 = 1935767394;
            }
            zzt = 1;
        }
        int zzg = zzerVar.zzg();
        int i27 = 1701733217;
        if (i23 == 1701733217) {
            Pair zzr = zzr(zzerVar, i6, i24);
            if (zzr != null) {
                i27 = ((Integer) zzr.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((zzald) zzr.second).zzb);
                zzakdVar.zza[i9] = (zzald) zzr.second;
            }
            i23 = i27;
            zzerVar.zzh(zzg);
        }
        if (i23 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i23 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i23 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i23 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i23 == 1685353320 || i23 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i23 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i23 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i23 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i23 != 1935767394) {
                if (i23 != 1936684916) {
                    if (i23 == 1953984371) {
                        i14 = i23;
                        str2 = "audio/raw";
                        i13 = 268435456;
                    } else if (i23 == 1819304813) {
                        if (i13 != -1) {
                            i14 = i23;
                            str2 = "audio/raw";
                        }
                    } else if (i23 == 778924082 || i23 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i23 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i23 == 1835560241) {
                        i14 = i23;
                        str2 = "audio/mhm1";
                    } else if (i23 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i23 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i23 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i23 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i23 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i23 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i23 == 1767992678) {
                        i14 = 1767992678;
                        str2 = "audio/iamf";
                    } else {
                        i14 = i23;
                        str2 = null;
                    }
                    int i28 = i13;
                    String str4 = null;
                    List list = null;
                    zzajy zzajyVar = null;
                    zzajw zzajwVar = null;
                    while (zzg - i6 < i24) {
                        zzerVar.zzh(zzg);
                        int zzB2 = zzerVar.zzB();
                        String str5 = str4;
                        String str6 = "childAtomSize must be positive";
                        zzaey.zza(zzB2 > 0, "childAtomSize must be positive");
                        int zzB3 = zzerVar.zzB();
                        int i29 = zzF;
                        if (zzB3 == 1835557187) {
                            zzerVar.zzh(zzg + 8);
                            zzerVar.zzk(1);
                            int zzs = zzerVar.zzs();
                            zzerVar.zzk(1);
                            String format = Objects.equals(str2, "audio/mhm1") ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                            int zzt2 = zzerVar.zzt();
                            byte[] bArr = new byte[zzt2];
                            str5 = format;
                            zzerVar.zzm(bArr, 0, zzt2);
                            if (list == null) {
                                list = zzguf.zzj(bArr);
                                i15 = zzB2;
                                i16 = zzg;
                                i17 = zzB;
                                zzF = i29;
                                str4 = str5;
                                zzg = i16 + i15;
                                i24 = i7;
                                zzB = i17;
                                i11 = 2;
                                i12 = 32;
                            } else {
                                list = zzguf.zzk(bArr, (byte[]) list.get(0));
                                str4 = str5;
                                i15 = zzB2;
                                i16 = zzg;
                                i17 = zzB;
                                zzF = i29;
                            }
                        } else {
                            if (zzB3 == 1835557200) {
                                zzerVar.zzh(zzg + 8);
                                int zzs2 = zzerVar.zzs();
                                if (zzs2 > 0) {
                                    byte[] bArr2 = new byte[zzs2];
                                    zzerVar.zzm(bArr2, 0, zzs2);
                                    if (list == null) {
                                        list = zzguf.zzj(bArr2);
                                        str4 = str5;
                                        i15 = zzB2;
                                        i16 = zzg;
                                        i17 = zzB;
                                        zzF = i29;
                                    } else {
                                        list = zzguf.zzk((byte[]) list.get(0), bArr2);
                                        str4 = str5;
                                        i15 = zzB2;
                                        i16 = zzg;
                                        i17 = zzB;
                                        zzF = i29;
                                    }
                                }
                                i15 = zzB2;
                                i16 = zzg;
                                i17 = zzB;
                                zzF = i29;
                                str4 = str5;
                            } else {
                                if (zzB3 == 1702061171) {
                                    i15 = zzB2;
                                    i16 = zzg;
                                    i17 = zzB;
                                    zzF = i29;
                                    i18 = i16;
                                    i19 = -1;
                                } else if (z4 && zzB3 == 2002876005) {
                                    int zzg2 = zzerVar.zzg();
                                    zzaey.zza(zzg2 >= zzg, null);
                                    int i30 = zzg2;
                                    while (true) {
                                        if (i30 - zzg >= zzB2) {
                                            i15 = zzB2;
                                            i16 = zzg;
                                            i17 = zzB;
                                            zzF = i29;
                                            i18 = -1;
                                            i19 = -1;
                                            break;
                                        }
                                        zzerVar.zzh(i30);
                                        int zzB4 = zzerVar.zzB();
                                        if (zzB4 > 0) {
                                            i22 = i30;
                                            z5 = true;
                                        } else {
                                            i22 = i30;
                                            z5 = false;
                                        }
                                        zzaey.zza(z5, str6);
                                        String str7 = str6;
                                        if (zzerVar.zzB() == 1702061171) {
                                            i15 = zzB2;
                                            i17 = zzB;
                                            zzF = i29;
                                            i18 = i22;
                                            i19 = -1;
                                            i16 = zzg;
                                            break;
                                        }
                                        i30 = i22 + zzB4;
                                        str6 = str7;
                                    }
                                } else if (zzB3 == 1651798644) {
                                    zzajwVar = zzq(zzerVar, zzg);
                                    str4 = str5;
                                    i15 = zzB2;
                                    i16 = zzg;
                                    i17 = zzB;
                                    zzF = i29;
                                } else {
                                    if (zzB3 == 1684103987) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzadv.zza(zzerVar, Integer.toString(i8), str, zzqVar2);
                                    } else if (zzB3 == 1684366131) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzadv.zzb(zzerVar, Integer.toString(i8), str, zzqVar2);
                                    } else if (zzB3 == 1684103988) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzady.zza(zzerVar, Integer.toString(i8), str, zzqVar2);
                                    } else if (zzB3 != 1684892784) {
                                        if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                            i15 = zzB2;
                                            i16 = zzg;
                                            i17 = zzB;
                                            zzt zztVar = new zzt();
                                            zztVar.zzb(i8);
                                            zztVar.zzm(str2);
                                            zztVar.zzE(zzt);
                                            zzF = i29;
                                            zztVar.zzF(zzF);
                                            zztVar.zzq(zzqVar2);
                                            zztVar.zze(str);
                                            zzakdVar.zzb = zztVar.zzM();
                                        } else {
                                            if (zzB3 == 1682927731) {
                                                int i31 = zzB2 - 8;
                                                byte[] bArr3 = zzb;
                                                int length = bArr3.length;
                                                i15 = zzB2;
                                                byte[] copyOf = Arrays.copyOf(bArr3, length + i31);
                                                zzerVar.zzh(zzg + 8);
                                                zzerVar.zzm(copyOf, length, i31);
                                                list = zzafu.zza(copyOf);
                                            } else {
                                                i15 = zzB2;
                                                if (zzB3 == 1684425825) {
                                                    byte[] bArr4 = new byte[i15 - 8];
                                                    bArr4[0] = 102;
                                                    bArr4[1] = 76;
                                                    bArr4[i11] = 97;
                                                    bArr4[3] = 67;
                                                    zzerVar.zzh(zzg + 12);
                                                    zzerVar.zzm(bArr4, 4, i15 - 12);
                                                    list = zzguf.zzj(bArr4);
                                                } else if (zzB3 == 1634492771) {
                                                    int i32 = i15 - 12;
                                                    byte[] bArr5 = new byte[i32];
                                                    zzerVar.zzh(zzg + 12);
                                                    zzerVar.zzm(bArr5, 0, i32);
                                                    int i33 = zzdo.zza;
                                                    zzer zzerVar2 = new zzer(bArr5);
                                                    zzerVar2.zzh(5);
                                                    int zzs3 = zzerVar2.zzs();
                                                    zzerVar2.zzh(9);
                                                    int zzs4 = zzerVar2.zzs();
                                                    zzerVar2.zzh(20);
                                                    int[] iArr = {zzerVar2.zzH(), zzs4, zzs3};
                                                    int i34 = iArr[0];
                                                    int i35 = iArr[1];
                                                    int zzz = zzfj.zzz(zzs3, ByteOrder.LITTLE_ENDIAN);
                                                    zzguf zzj = zzguf.zzj(bArr5);
                                                    zzt = i35;
                                                    list = zzj;
                                                    i28 = zzz;
                                                    zzF = i34;
                                                    i16 = zzg;
                                                    i17 = zzB;
                                                    str4 = str5;
                                                } else if (zzB3 == 1767990114) {
                                                    zzerVar.zzh(zzg + 9);
                                                    int zza2 = zzgxz.zza(zzerVar.zzP());
                                                    byte[] bArr6 = new byte[zza2];
                                                    zzerVar.zzm(bArr6, 0, zza2);
                                                    int i36 = zzdo.zza;
                                                    zzer zzerVar3 = new zzer(bArr6);
                                                    String str8 = null;
                                                    String str9 = null;
                                                    while (zzerVar3.zzd() > 0 && (str9 == null || str8 == null)) {
                                                        int zzs5 = zzerVar3.zzs();
                                                        int i37 = zzs5 >> 3;
                                                        int i38 = zzs5 & 2;
                                                        int i39 = zzs5 & 1;
                                                        int zza3 = zzgxz.zza(zzerVar3.zzP());
                                                        byte[] bArr7 = bArr6;
                                                        if (i37 > 4 && i37 < 24 && i38 != 0) {
                                                            zzerVar3.zzQ();
                                                            zzerVar3.zzQ();
                                                        }
                                                        int zzg3 = zzerVar3.zzg() + zza3;
                                                        int i40 = zzg;
                                                        if (i37 == 31) {
                                                            zzerVar3.zzk(4);
                                                            Object[] objArr = {Integer.valueOf(zzerVar3.zzs()), Integer.valueOf(zzerVar3.zzs())};
                                                            String str10 = zzfj.zza;
                                                            str9 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                                        } else if (i37 == 0) {
                                                            zzerVar3.zzQ();
                                                            String zzK = zzerVar3.zzK(4, StandardCharsets.UTF_8);
                                                            if (zzK.equals("mp4a")) {
                                                                zzerVar3.zzQ();
                                                                zzerVar3.zzk(i11);
                                                                zzeq zzeqVar = new zzeq();
                                                                zzeqVar.zza(zzerVar3);
                                                                i21 = zzB;
                                                                int zzj2 = zzeqVar.zzj(5);
                                                                if (zzj2 == 31) {
                                                                    zzj2 = zzeqVar.zzj(6) + 32;
                                                                }
                                                                StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj2).length());
                                                                sb.append(zzK);
                                                                sb.append(".40.");
                                                                sb.append(zzj2);
                                                                zzK = sb.toString();
                                                            } else {
                                                                i21 = zzB;
                                                            }
                                                            str8 = zzK;
                                                            zzerVar3.zzh(zzg3);
                                                            zzg = i40;
                                                            zzB = i21;
                                                            bArr6 = bArr7;
                                                            i11 = 2;
                                                        }
                                                        i21 = zzB;
                                                        zzerVar3.zzh(zzg3);
                                                        zzg = i40;
                                                        zzB = i21;
                                                        bArr6 = bArr7;
                                                        i11 = 2;
                                                    }
                                                    byte[] bArr8 = bArr6;
                                                    i16 = zzg;
                                                    i17 = zzB;
                                                    str4 = (str9 == null || str8 == null) ? null : h1.b(new StringBuilder(str9.length() + 1 + str8.length()), str9, ".", str8);
                                                    list = zzguf.zzj(bArr8);
                                                    zzF = i29;
                                                } else {
                                                    i16 = zzg;
                                                    i17 = zzB;
                                                    if (zzB3 == 1885564227) {
                                                        zzerVar.zzh(i16 + 12);
                                                        ByteOrder byteOrder = (zzerVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                        int zzs6 = zzerVar.zzs();
                                                        if (i14 == 1768973165) {
                                                            i20 = zzfj.zzz(zzs6, byteOrder);
                                                        } else {
                                                            if (i14 == 1718641517 && zzs6 == i12 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                                i20 = 4;
                                                            }
                                                            i20 = i28;
                                                        }
                                                        i28 = i20;
                                                        if (i20 != -1) {
                                                            str2 = "audio/raw";
                                                        }
                                                        zzF = i29;
                                                    } else {
                                                        zzF = i29;
                                                    }
                                                }
                                            }
                                            str4 = str5;
                                            i16 = zzg;
                                            i17 = zzB;
                                            zzF = i29;
                                        }
                                        str4 = str5;
                                    } else {
                                        if (zzB <= 0) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB).length() + 49);
                                            sb2.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                            sb2.append(zzB);
                                            throw zzat.zzb(sb2.toString(), null);
                                        }
                                        str4 = str5;
                                        i15 = zzB2;
                                        i16 = zzg;
                                        zzF = zzB;
                                        i17 = zzF;
                                        zzt = i11;
                                    }
                                    i15 = zzB2;
                                    i16 = zzg;
                                    i17 = zzB;
                                    zzF = i29;
                                    str4 = str5;
                                }
                                if (i18 != i19) {
                                    zzajyVar = zzp(zzerVar, i18);
                                    String zza4 = zzajyVar.zza();
                                    byte[] zzb2 = zzajyVar.zzb();
                                    if (zzb2 != null) {
                                        if ("audio/vorbis".equals(zza4)) {
                                            zzer zzerVar4 = new zzer(zzb2);
                                            int i41 = 1;
                                            zzerVar4.zzk(1);
                                            int i42 = 0;
                                            while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                                zzerVar4.zzk(i41);
                                                i42 += 255;
                                                i41 = 1;
                                            }
                                            int zzs7 = zzerVar4.zzs() + i42;
                                            int i43 = 0;
                                            while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                                zzerVar4.zzk(1);
                                                i43 += 255;
                                            }
                                            int zzs8 = zzerVar4.zzs() + i43;
                                            byte[] bArr9 = new byte[zzs7];
                                            int zzg4 = zzerVar4.zzg();
                                            System.arraycopy(zzb2, zzg4, bArr9, 0, zzs7);
                                            int i44 = zzg4 + zzs7 + zzs8;
                                            int length2 = zzb2.length - i44;
                                            byte[] bArr10 = new byte[length2];
                                            System.arraycopy(zzb2, i44, bArr10, 0, length2);
                                            list = zzguf.zzk(bArr9, bArr10);
                                        } else {
                                            if ("audio/mp4a-latm".equals(zza4)) {
                                                zzads zza5 = zzadt.zza(zzb2);
                                                zzF = zza5.zza;
                                                zzt = zza5.zzb;
                                                str3 = zza5.zzc;
                                            } else {
                                                str3 = str5;
                                            }
                                            zzguf zzj3 = zzguf.zzj(zzb2);
                                            str2 = zza4;
                                            str4 = str3;
                                            list = zzj3;
                                        }
                                    }
                                    str2 = zza4;
                                    str4 = str5;
                                }
                                str4 = str5;
                            }
                            zzg = i16 + i15;
                            i24 = i7;
                            zzB = i17;
                            i11 = 2;
                            i12 = 32;
                        }
                        zzg = i16 + i15;
                        i24 = i7;
                        zzB = i17;
                        i11 = 2;
                        i12 = 32;
                    }
                    String str11 = str4;
                    if (zzakdVar.zzb != null || str2 == null) {
                        return;
                    }
                    zzt zztVar2 = new zzt();
                    zztVar2.zzb(i8);
                    zztVar2.zzm(str2);
                    zztVar2.zzj(str11);
                    zztVar2.zzE(zzt);
                    zztVar2.zzF(zzF);
                    zztVar2.zzG(i28);
                    zztVar2.zzp(list);
                    zztVar2.zzq(zzqVar2);
                    zztVar2.zze(str);
                    if (zzajyVar != null) {
                        zztVar2.zzh(zzgxz.zzb(zzajyVar.zzc()));
                        zztVar2.zzi(zzgxz.zzb(zzajyVar.zzd()));
                    } else if (zzajwVar != null) {
                        zztVar2.zzh(zzgxz.zzb(zzajwVar.zza()));
                        zztVar2.zzi(zzgxz.zzb(zzajwVar.zzb()));
                    }
                    zzakdVar.zzb = zztVar2.zzM();
                    return;
                }
                i14 = i23;
                i13 = i11;
                str2 = "audio/raw";
                int i282 = i13;
                String str42 = null;
                List list2 = null;
                zzajy zzajyVar2 = null;
                zzajw zzajwVar2 = null;
                while (zzg - i6 < i24) {
                }
                String str112 = str42;
                if (zzakdVar.zzb != null) {
                    return;
                } else {
                    return;
                }
            }
            str2 = "audio/amr-wb";
        }
        i14 = i23;
        int i2822 = i13;
        String str422 = null;
        List list22 = null;
        zzajy zzajyVar22 = null;
        zzajw zzajwVar22 = null;
        while (zzg - i6 < i24) {
        }
        String str1122 = str422;
        if (zzakdVar.zzb != null) {
        }
    }

    private static zzajy zzp(zzer zzerVar, int i5) {
        zzerVar.zzh(i5 + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int zzs = zzerVar.zzs();
        if ((zzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String zze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new zzajy(zze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long zzz = zzerVar.zzz();
        long zzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int zzs2 = zzs(zzerVar);
        long j2 = zzz2;
        byte[] bArr = new byte[zzs2];
        zzerVar.zzm(bArr, 0, zzs2);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new zzajy(zze, bArr, j2, zzz > 0 ? zzz : -1L);
    }

    private static zzajw zzq(zzer zzerVar, int i5) {
        zzerVar.zzh(i5 + 8);
        zzerVar.zzk(4);
        return new zzajw(zzerVar.zzz(), zzerVar.zzz());
    }

    private static Pair zzr(zzer zzerVar, int i5, int i6) {
        Integer num;
        zzald zzaldVar;
        Pair create;
        int i7;
        int i8;
        Integer num2;
        boolean z4;
        int zzg = zzerVar.zzg();
        while (zzg - i5 < i6) {
            zzerVar.zzh(zzg);
            int zzB = zzerVar.zzB();
            zzaey.zza(zzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i9 = zzg + 8;
                int i10 = 0;
                int i11 = -1;
                Integer num3 = null;
                String str = null;
                while (i9 - zzg < zzB) {
                    zzerVar.zzh(i9);
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    if (zzB3 == 1718775137) {
                        num3 = Integer.valueOf(zzerVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        str = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i11 = i9;
                        i10 = zzB2;
                    }
                    i9 += zzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaey.zza(num3 != null, "frma atom is mandatory");
                    zzaey.zza(i11 != -1, "schi atom is mandatory");
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num3;
                            zzaldVar = null;
                            break;
                        }
                        zzerVar.zzh(i12);
                        int zzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int zza2 = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (zza2 == 0) {
                                zzerVar.zzk(1);
                                i8 = 0;
                                i7 = 0;
                            } else {
                                int zzs = zzerVar.zzs();
                                i7 = zzs & 15;
                                i8 = (zzs & 240) >> 4;
                            }
                            if (zzerVar.zzs() == 1) {
                                num2 = num3;
                                z4 = true;
                            } else {
                                num2 = num3;
                                z4 = false;
                            }
                            int zzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z4 && zzs2 == 0) {
                                int zzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzerVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzaldVar = new zzald(z4, str, zzs2, bArr2, i8, i7, bArr);
                        } else {
                            i12 += zzB4;
                        }
                    }
                    zzaey.zza(zzaldVar != null, "tenc atom is mandatory");
                    String str2 = zzfj.zza;
                    create = Pair.create(num, zzaldVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzs(zzer zzerVar) {
        int zzs = zzerVar.zzs();
        int i5 = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzerVar.zzs();
            i5 = (i5 << 7) | (zzs & 127);
        }
        return i5;
    }
}
