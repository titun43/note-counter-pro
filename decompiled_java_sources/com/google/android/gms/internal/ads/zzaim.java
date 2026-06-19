package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzaim {
    public static final zzaij zza = zzaik.zza;

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzap zza(byte[] bArr, int i5, zzaij zzaijVar, zzahw zzahwVar) {
        zzail zzailVar;
        ArrayList arrayList = new ArrayList();
        zzer zzerVar = new zzer(bArr, i5);
        boolean z4 = false;
        if (zzerVar.zzd() < 10) {
            zzee.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzx = zzerVar.zzx();
            if (zzx == 4801587) {
                int zzs = zzerVar.zzs();
                zzerVar.zzk(1);
                int zzs2 = zzerVar.zzs();
                int zzG = zzerVar.zzG();
                if (zzs == 2) {
                    if ((zzs2 & 64) != 0) {
                        zzee.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzailVar = new zzail(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                } else {
                    if (zzs == 3) {
                        if ((zzs2 & 64) != 0) {
                            int zzB = zzerVar.zzB();
                            zzerVar.zzk(zzB);
                            zzG -= zzB + 4;
                        }
                    } else if (zzs == 4) {
                        if ((zzs2 & 64) != 0) {
                            int zzG2 = zzerVar.zzG();
                            zzerVar.zzk(zzG2 - 4);
                            zzG -= zzG2;
                        }
                        if ((zzs2 & 16) != 0) {
                            zzG -= 10;
                        }
                    } else {
                        u.r(new StringBuilder(String.valueOf(zzs).length() + 46), "Skipped ID3 tag with unsupported majorVersion=", zzs, "Id3Decoder");
                    }
                    zzailVar = new zzail(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                }
                if (zzailVar != null) {
                    return null;
                }
                int zzg = zzerVar.zzg();
                int i6 = zzailVar.zza() == 2 ? 6 : 10;
                boolean zzb = zzailVar.zzb();
                int zzc = zzailVar.zzc();
                if (zzb) {
                    zzc = zze(zzerVar, zzailVar.zzc());
                }
                zzerVar.zzf(zzg + zzc);
                if (!zzb(zzerVar, zzailVar.zza(), i6, false)) {
                    if (zzailVar.zza() != 4 || !zzb(zzerVar, 4, i6, true)) {
                        int zza2 = zzailVar.zza();
                        u.r(new StringBuilder(String.valueOf(zza2).length() + 45), "Failed to validate ID3 tag with majorVersion=", zza2, "Id3Decoder");
                        return null;
                    }
                    z4 = true;
                }
                while (zzerVar.zzd() >= i6) {
                    zzain zzc2 = zzc(zzailVar.zza(), zzerVar, z4, i6, zzaijVar);
                    if (zzc2 != null) {
                        arrayList.add(zzc2);
                    }
                }
                return new zzap(arrayList);
            }
            zzee.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(zzx))));
        }
        zzailVar = null;
        if (zzailVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzb(zzer zzerVar, int i5, int i6, boolean z4) {
        boolean z5;
        int zzx;
        long zzx2;
        int i7;
        int i8;
        int zzg = zzerVar.zzg();
        while (true) {
            try {
                z5 = true;
                z5 = true;
                int i9 = 1;
                int i10 = 1;
                if (zzerVar.zzd() < i6) {
                    break;
                }
                if (i5 >= 3) {
                    zzx = zzerVar.zzB();
                    zzx2 = zzerVar.zzz();
                    i7 = zzerVar.zzt();
                } else {
                    zzx = zzerVar.zzx();
                    zzx2 = zzerVar.zzx();
                    i7 = 0;
                }
                if (zzx != 0 || zzx2 != 0 || i7 != 0) {
                    if (i5 == 4 && !z4) {
                        if ((8421504 & zzx2) != 0) {
                            break;
                        }
                        zzx2 = ((zzx2 >> 24) << 21) | (((zzx2 >> 16) & 255) << 14) | (zzx2 & 255) | (((zzx2 >> 8) & 255) << 7);
                    }
                    if (i5 == 4) {
                        if ((i7 & 64) == 0) {
                            i9 = 0;
                        }
                        int i11 = i9;
                        i10 = i7 & 1;
                        i8 = i11;
                    } else if (i5 == 3) {
                        i8 = (i7 & 32) != 0 ? 1 : 0;
                        if ((i7 & 128) == 0) {
                            i10 = 0;
                        }
                    } else {
                        i8 = 0;
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        i8 += 4;
                    }
                    if (zzx2 >= i8 && zzerVar.zzd() >= zzx2) {
                        zzerVar.zzk((int) zzx2);
                    }
                }
            } finally {
                zzerVar.zzh(zzg);
            }
        }
        return z5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:80|(2:82|(1:88)(1:87))|89|90|(2:92|(4:110|111|112|(8:114|(8:119|120|(5:122|123|124|(1:126)|127)(2:130|(1:132)(1:133))|128|129|54|(0)|57)|134|135|(2:(1:(1:(2:214|129)(4:209|(1:211)|212|213))(11:178|(1:180)(1:201)|181|(1:183)|184|185|(4:188|(3:190|191|192)(1:194)|193|186)|195|196|(1:198)(1:200)|199))(8:153|(1:155)|156|(1:158)|159|(4:162|(3:164|165|166)(1:168)|167|160)|169|170)|171)(2:143|(2:145|75)(1:146))|54|(0)|57)(13:215|(1:(1:(0)))|134|135|(1:137)|(1:148)|(1:173)|(1:203)|214|129|54|(0)|57))(2:95|(7:99|100|101|102|54|(0)|57)(1:98)))|224|111|112|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0291, code lost:
    
        if (r9 == 67) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017e, code lost:
    
        r20 = r4;
        r22 = "Id3Decoder";
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0506  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzain zzc(int i5, zzer zzerVar, boolean z4, int i6, zzaij zzaijVar) {
        int zzH;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        int i9;
        String str;
        zzain zzainVar;
        int i10;
        zzain zzaieVar;
        zzain zzaiqVar;
        zzain zzainVar2;
        int zzi;
        String concat;
        int zzs = zzerVar.zzs();
        int zzs2 = zzerVar.zzs();
        int zzs3 = zzerVar.zzs();
        int zzs4 = i5 >= 3 ? zzerVar.zzs() : 0;
        if (i5 == 4) {
            zzH = zzerVar.zzH();
            if (!z4) {
                zzH = ((zzH >> 24) << 21) | (zzH & 255) | (((zzH >> 8) & 255) << 7) | (((zzH >> 16) & 255) << 14);
            }
        } else {
            zzH = i5 == 3 ? zzerVar.zzH() : zzerVar.zzx();
        }
        int zzt = i5 >= 3 ? zzerVar.zzt() : 0;
        if (zzs == 0 && zzs2 == 0 && zzs3 == 0 && zzs4 == 0 && zzH == 0 && zzt == 0) {
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        int zzg = zzerVar.zzg() + zzH;
        if (zzg > zzerVar.zze()) {
            zzee.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        if (zzaijVar != null) {
            zzerVar.zzh(zzg);
            return null;
        }
        if (i5 == 3) {
            int i11 = zzt & 64;
            i7 = (zzt & 128) != 0 ? 1 : 0;
            i9 = 0;
            z6 = i11 != 0;
            z5 = (zzt & 32) != 0;
            i8 = i7;
        } else if (i5 == 4) {
            boolean z7 = (zzt & 64) != 0;
            int i12 = (zzt & 8) != 0 ? 1 : 0;
            z6 = (zzt & 4) != 0;
            i9 = (zzt & 2) != 0 ? 1 : 0;
            i8 = zzt & 1;
            int i13 = i12;
            z5 = z7;
            i7 = i13;
        } else {
            i7 = 0;
            i8 = 0;
            z5 = false;
            z6 = false;
            i9 = 0;
        }
        if (i7 != 0 || z6) {
            zzee.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzerVar.zzh(zzg);
            return null;
        }
        if (z5) {
            zzerVar.zzk(1);
            zzH--;
        }
        if (i8 != 0) {
            zzerVar.zzk(4);
            zzH -= 4;
        }
        if (i9 != 0) {
            zzH = zze(zzerVar, zzH);
        }
        try {
            try {
            } catch (Throwable th) {
                zzerVar.zzh(zzg);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            i9 = zzs;
            str = "Id3Decoder";
            zzerVar.zzh(zzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        } catch (OutOfMemoryError e5) {
            e = e5;
            i9 = zzs;
            str = "Id3Decoder";
            zzerVar.zzh(zzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        }
        if (zzs == 84 && zzs2 == 88 && zzs3 == 88 && (i5 == 2 || zzs4 == 88)) {
            if (zzH > 0) {
                int zzs5 = zzerVar.zzs();
                int i14 = zzH - 1;
                byte[] bArr = new byte[i14];
                zzerVar.zzm(bArr, 0, i14);
                int zzh = zzh(bArr, 0, zzs5);
                zzainVar2 = new zzais("TXXX", new String(bArr, 0, zzh, zzf(zzs5)), zzd(bArr, zzs5, zzh + zzj(zzs5)));
                i9 = zzs;
                str = "Id3Decoder";
                zzerVar.zzh(zzg);
                zzainVar = zzainVar2;
                e = null;
                if (zzainVar == null) {
                }
                return zzainVar;
            }
            i9 = zzs;
            str = "Id3Decoder";
            zzainVar2 = null;
            zzerVar.zzh(zzg);
            zzainVar = zzainVar2;
            e = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        }
        if (zzs == 84) {
            String zzg2 = zzg(i5, 84, zzs2, zzs3, zzs4);
            if (zzH > 0) {
                int zzs6 = zzerVar.zzs();
                int i15 = zzH - 1;
                byte[] bArr2 = new byte[i15];
                zzerVar.zzm(bArr2, 0, i15);
                i9 = zzs;
                zzainVar2 = new zzais(zzg2, null, zzd(bArr2, zzs6, 0));
                str = "Id3Decoder";
                zzerVar.zzh(zzg);
                zzainVar = zzainVar2;
                e = null;
                if (zzainVar == null) {
                }
                return zzainVar;
            }
            i9 = zzs;
            str = "Id3Decoder";
            zzainVar2 = null;
            zzerVar.zzh(zzg);
            zzainVar = zzainVar2;
            e = null;
            if (zzainVar == null) {
                String zzg3 = zzg(i5, i9, zzs2, zzs3, zzs4);
                StringBuilder sb = new StringBuilder(String.valueOf(zzg3).length() + 39 + String.valueOf(zzH).length());
                sb.append("Failed to decode frame: id=");
                sb.append(zzg3);
                sb.append(", frameSize=");
                sb.append(zzH);
                zzee.zzd(str, sb.toString(), e);
            }
            return zzainVar;
        }
        if (zzs == 87) {
            if (zzs2 != 88 || zzs3 != 88 || (i5 != 2 && zzs4 != 88)) {
                i10 = 87;
            }
            int zzs7 = zzerVar.zzs();
            int i16 = zzH - 1;
            byte[] bArr3 = new byte[i16];
            zzerVar.zzm(bArr3, 0, i16);
            int zzh2 = zzh(bArr3, 0, zzs7);
            String str2 = new String(bArr3, 0, zzh2, zzf(zzs7));
            int zzj = zzh2 + zzj(zzs7);
            zzainVar2 = new zzait("WXXX", str2, zzl(bArr3, zzj, zzi(bArr3, zzj), StandardCharsets.ISO_8859_1));
            i9 = zzs;
            str = "Id3Decoder";
            zzerVar.zzh(zzg);
            zzainVar = zzainVar2;
            e = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        }
        i10 = zzs;
        if (i10 == 87) {
            String zzg4 = zzg(i5, 87, zzs2, zzs3, zzs4);
            byte[] bArr4 = new byte[zzH];
            zzerVar.zzm(bArr4, 0, zzH);
            zzainVar2 = new zzait(zzg4, null, new String(bArr4, 0, zzi(bArr4, 0), StandardCharsets.ISO_8859_1));
        } else {
            if (i10 == 80) {
                if (zzs2 == 82 && zzs3 == 73 && zzs4 == 86) {
                    byte[] bArr5 = new byte[zzH];
                    zzerVar.zzm(bArr5, 0, zzH);
                    int zzi2 = zzi(bArr5, 0);
                    zzainVar2 = new zzair(new String(bArr5, 0, zzi2, StandardCharsets.ISO_8859_1), zzk(bArr5, zzi2 + 1, zzH));
                } else {
                    i10 = 80;
                }
            }
            try {
            } catch (Exception e6) {
                e = e6;
            } catch (OutOfMemoryError e7) {
                e = e7;
            }
            if (i10 == 71) {
                if (zzs2 != 69 || zzs3 != 79) {
                    str = "Id3Decoder";
                    i10 = 71;
                    if (i5 == 2) {
                        if (i10 == 65) {
                            if (zzs2 == 80) {
                                if (zzs3 == 73) {
                                }
                            }
                        }
                        i9 = zzs;
                        if (i10 == 67) {
                        }
                        if (i10 != 67) {
                        }
                        if (i10 != 67) {
                        }
                        if (i10 != 77) {
                        }
                        String zzg5 = zzg(i5, i10, zzs2, zzs3, zzs4);
                        byte[] bArr6 = new byte[zzH];
                        zzerVar.zzm(bArr6, 0, zzH);
                        zzaieVar = new zzaie(zzg5, bArr6);
                        zzainVar2 = zzaieVar;
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                        if (zzainVar == null) {
                        }
                        return zzainVar;
                    }
                    if (i10 == 80 && zzs2 == 73 && zzs3 == 67) {
                        int zzs8 = zzerVar.zzs();
                        Charset zzf = zzf(zzs8);
                        int i17 = zzH - 1;
                        byte[] bArr7 = new byte[i17];
                        zzerVar.zzm(bArr7, 0, i17);
                        if (i5 == 2) {
                            i9 = zzs;
                            concat = "image/".concat(String.valueOf(zzgql.zza(new String(bArr7, 0, 3, StandardCharsets.ISO_8859_1))));
                            if ("image/jpg".equals(concat)) {
                                concat = "image/jpeg";
                            }
                            zzi = 2;
                        } else {
                            i9 = zzs;
                            zzi = zzi(bArr7, 0);
                            String zza2 = zzgql.zza(new String(bArr7, 0, zzi, StandardCharsets.ISO_8859_1));
                            concat = zza2.indexOf(47) == -1 ? "image/".concat(zza2) : zza2;
                        }
                        int i18 = bArr7[zzi + 1] & 255;
                        int i19 = zzi + 2;
                        int zzh3 = zzh(bArr7, i19, zzs8);
                        zzaieVar = new zzaid(concat, new String(bArr7, i19, zzh3 - i19, zzf), i18, zzk(bArr7, zzh3 + zzj(zzs8), i17));
                        zzainVar2 = zzaieVar;
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                        if (zzainVar == null) {
                        }
                        return zzainVar;
                    }
                    i9 = zzs;
                    if (i10 == 67 || zzs2 != 79 || zzs3 != 77 || (zzs4 != 77 && i5 != 2)) {
                        if (i10 != 67 && zzs2 == 72 && zzs3 == 65 && zzs4 == 80) {
                            int zzg6 = zzerVar.zzg();
                            int zzi3 = zzi(zzerVar.zzi(), zzg6);
                            String str3 = new String(zzerVar.zzi(), zzg6, zzi3 - zzg6, StandardCharsets.ISO_8859_1);
                            zzerVar.zzh(zzi3 + 1);
                            int zzB = zzerVar.zzB();
                            int zzB2 = zzerVar.zzB();
                            long zzz = zzerVar.zzz();
                            if (zzz == 4294967295L) {
                                zzz = -1;
                            }
                            long j2 = zzz;
                            long zzz2 = zzerVar.zzz();
                            if (zzz2 == 4294967295L) {
                                zzz2 = -1;
                            }
                            long j5 = zzz2;
                            ArrayList arrayList = new ArrayList();
                            int i20 = zzg6 + zzH;
                            while (zzerVar.zzg() < i20) {
                                zzain zzc = zzc(i5, zzerVar, z4, i6, null);
                                if (zzc != null) {
                                    arrayList.add(zzc);
                                }
                            }
                            zzaiqVar = new zzaif(str3, zzB, zzB2, j2, j5, (zzain[]) arrayList.toArray(new zzain[0]));
                        } else if (i10 != 67 && zzs2 == 84 && zzs3 == 79 && zzs4 == 67) {
                            int zzg7 = zzerVar.zzg();
                            int zzi4 = zzi(zzerVar.zzi(), zzg7);
                            String str4 = new String(zzerVar.zzi(), zzg7, zzi4 - zzg7, StandardCharsets.ISO_8859_1);
                            zzerVar.zzh(zzi4 + 1);
                            int zzs9 = zzerVar.zzs();
                            boolean z8 = (zzs9 & 2) != 0;
                            int i21 = zzs9 & 1;
                            int zzs10 = zzerVar.zzs();
                            String[] strArr = new String[zzs10];
                            int i22 = 0;
                            while (i22 < zzs10) {
                                int zzg8 = zzerVar.zzg();
                                int i23 = zzg7;
                                int zzi5 = zzi(zzerVar.zzi(), zzg8);
                                String[] strArr2 = strArr;
                                strArr2[i22] = new String(zzerVar.zzi(), zzg8, zzi5 - zzg8, StandardCharsets.ISO_8859_1);
                                zzerVar.zzh(zzi5 + 1);
                                i22++;
                                zzg7 = i23;
                                zzs10 = zzs10;
                                str4 = str4;
                                strArr = strArr2;
                            }
                            int i24 = zzg7;
                            String str5 = str4;
                            String[] strArr3 = strArr;
                            ArrayList arrayList2 = new ArrayList();
                            int i25 = i24 + zzH;
                            while (zzerVar.zzg() < i25) {
                                zzain zzc2 = zzc(i5, zzerVar, z4, i6, null);
                                if (zzc2 != null) {
                                    arrayList2.add(zzc2);
                                }
                            }
                            zzaiqVar = new zzaig(str5, z8, 1 == i21, strArr3, (zzain[]) arrayList2.toArray(new zzain[0]));
                        } else if (i10 != 77 && zzs2 == 76 && zzs3 == 76 && zzs4 == 84) {
                            int zzt2 = zzerVar.zzt();
                            int zzx = zzerVar.zzx();
                            int zzx2 = zzerVar.zzx();
                            int zzs11 = zzerVar.zzs();
                            int zzs12 = zzerVar.zzs();
                            zzeq zzeqVar = new zzeq();
                            zzeqVar.zza(zzerVar);
                            int i26 = ((zzH - 10) * 8) / (zzs11 + zzs12);
                            int[] iArr = new int[i26];
                            int[] iArr2 = new int[i26];
                            for (int i27 = 0; i27 < i26; i27++) {
                                int zzj2 = zzeqVar.zzj(zzs11);
                                int zzj3 = zzeqVar.zzj(zzs12);
                                iArr[i27] = zzj2;
                                iArr2[i27] = zzj3;
                            }
                            zzaiqVar = new zzaiq(zzt2, zzx, zzx2, iArr, iArr2);
                        } else {
                            String zzg52 = zzg(i5, i10, zzs2, zzs3, zzs4);
                            byte[] bArr62 = new byte[zzH];
                            zzerVar.zzm(bArr62, 0, zzH);
                            zzaieVar = new zzaie(zzg52, bArr62);
                            zzainVar2 = zzaieVar;
                        }
                        zzainVar2 = zzaiqVar;
                    } else if (zzH < 4) {
                        zzainVar2 = null;
                    } else {
                        int zzs13 = zzerVar.zzs();
                        Charset zzf2 = zzf(zzs13);
                        byte[] bArr8 = new byte[3];
                        zzerVar.zzm(bArr8, 0, 3);
                        String str6 = new String(bArr8, 0, 3);
                        int i28 = zzH - 4;
                        byte[] bArr9 = new byte[i28];
                        zzerVar.zzm(bArr9, 0, i28);
                        int zzh4 = zzh(bArr9, 0, zzs13);
                        String str7 = new String(bArr9, 0, zzh4, zzf2);
                        int zzj4 = zzh4 + zzj(zzs13);
                        zzainVar2 = new zzaih(str6, str7, zzl(bArr9, zzj4, zzh(bArr9, zzj4, zzs13), zzf2));
                    }
                    zzerVar.zzh(zzg);
                    zzainVar = zzainVar2;
                    e = null;
                    if (zzainVar == null) {
                    }
                    return zzainVar;
                }
                if (zzs4 == 66 || i5 == 2) {
                    try {
                        int zzs14 = zzerVar.zzs();
                        Charset zzf3 = zzf(zzs14);
                        int i29 = zzH - 1;
                        byte[] bArr10 = new byte[i29];
                        zzerVar.zzm(bArr10, 0, i29);
                        int zzi6 = zzi(bArr10, 0);
                        str = "Id3Decoder";
                        String zzh5 = zzas.zzh(new String(bArr10, 0, zzi6, StandardCharsets.ISO_8859_1));
                        int i30 = zzi6 + 1;
                        int zzh6 = zzh(bArr10, i30, zzs14);
                        String zzl = zzl(bArr10, i30, zzh6, zzf3);
                        int zzj5 = zzh6 + zzj(zzs14);
                        int zzh7 = zzh(bArr10, zzj5, zzs14);
                        i9 = zzs;
                        zzainVar2 = new zzaii(zzh5, zzl, zzl(bArr10, zzj5, zzh7, zzf3), zzk(bArr10, zzh7 + zzj(zzs14), i29));
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                    } catch (Exception e8) {
                        e = e8;
                        str = "Id3Decoder";
                        i9 = zzs;
                        zzerVar.zzh(zzg);
                        zzainVar = null;
                        if (zzainVar == null) {
                        }
                        return zzainVar;
                    } catch (OutOfMemoryError e9) {
                        e = e9;
                        str = "Id3Decoder";
                        i9 = zzs;
                        zzerVar.zzh(zzg);
                        zzainVar = null;
                        if (zzainVar == null) {
                        }
                        return zzainVar;
                    }
                    if (zzainVar == null) {
                    }
                    return zzainVar;
                }
                i10 = 71;
            }
            str = "Id3Decoder";
            if (i5 == 2) {
            }
        }
        i9 = zzs;
        str = "Id3Decoder";
        zzerVar.zzh(zzg);
        zzainVar = zzainVar2;
        e = null;
        if (zzainVar == null) {
        }
        return zzainVar;
    }

    private static zzguf zzd(byte[] bArr, int i5, int i6) {
        if (i6 >= bArr.length) {
            return zzguf.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        int i7 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int zzh = zzh(bArr, i6, i5);
        while (i6 < zzh) {
            zzgucVar.zzf(new String(bArr, i6, zzh - i6, zzf(i5)));
            i6 = zzj(i5) + zzh;
            zzh = zzh(bArr, i6, i5);
        }
        zzguf zzi = zzgucVar.zzi();
        return zzi.isEmpty() ? zzguf.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : zzi;
    }

    private static int zze(zzer zzerVar, int i5) {
        byte[] zzi = zzerVar.zzi();
        int zzg = zzerVar.zzg();
        int i6 = zzg;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= zzg + i5) {
                return i5;
            }
            if ((zzi[i6] & 255) == 255 && zzi[i7] == 0) {
                System.arraycopy(zzi, i6 + 2, zzi, i7, (i5 - (i6 - zzg)) - 2);
                i5--;
            }
            i6 = i7;
        }
    }

    private static Charset zzf(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String zzg(int i5, int i6, int i7, int i8, int i9) {
        return i5 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    private static int zzh(byte[] bArr, int i5, int i6) {
        int zzi = zzi(bArr, i5);
        if (i6 == 0 || i6 == 3) {
            return zzi;
        }
        while (true) {
            int length = bArr.length;
            if (zzi >= length - 1) {
                return length;
            }
            int i7 = zzi + 1;
            if ((zzi - i5) % 2 == 0 && bArr[i7] == 0) {
                return zzi;
            }
            zzi = zzi(bArr, i7);
        }
    }

    private static int zzi(byte[] bArr, int i5) {
        while (true) {
            int length = bArr.length;
            if (i5 >= length) {
                return length;
            }
            if (bArr[i5] == 0) {
                return i5;
            }
            i5++;
        }
    }

    private static int zzj(int i5) {
        return (i5 == 0 || i5 == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i5, int i6) {
        return i6 <= i5 ? zzfj.zzb : Arrays.copyOfRange(bArr, i5, i6);
    }

    private static String zzl(byte[] bArr, int i5, int i6, Charset charset) {
        return (i6 <= i5 || i6 > bArr.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : new String(bArr, i5, i6 - i5, charset);
    }
}
