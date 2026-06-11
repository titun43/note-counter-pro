package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbgj;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzajg {
    public byte[] zzO;
    public zzagi zzU;
    public boolean zzW;
    public zzagh zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzagg zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = zzbgj.zzq.zzf;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    private static Pair zzf(zzer zzerVar) {
        try {
            zzerVar.zzk(16);
            long zzA = zzerVar.zzA();
            if (zzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzA != 826496599) {
                zzee.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzg = zzerVar.zzg() + 20;
            byte[] zzi = zzerVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i5 = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i5] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i5;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) {
        int i5;
        int i6;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i7 = 0;
            int i8 = 1;
            while (true) {
                int i9 = bArr[i8];
                i8++;
                i5 = i9 & 255;
                if (i5 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i10 = i7 + i5;
            int i11 = 0;
            while (true) {
                int i12 = bArr[i8];
                i8++;
                i6 = i12 & 255;
                if (i6 != 255) {
                    break;
                }
                i11 += 255;
            }
            int i13 = i11 + i6;
            if (bArr[i8] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i8, bArr2, 0, i10);
            int i14 = i8 + i10;
            if (bArr[i14] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i15 = i14 + i13;
            if (bArr[i15] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i15;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i15, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzer zzerVar) {
        UUID uuid;
        UUID uuid2;
        try {
            int zzu = zzerVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzerVar.zzh(24);
                long zzD = zzerVar.zzD();
                uuid = zzajh.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzerVar.zzD();
                    uuid2 = zzajh.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0598  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i5) {
        char c5;
        ?? r2;
        String str;
        String str2;
        zzguf zzgufVar;
        int i6;
        zzguf zzgufVar2;
        int i7;
        zzguf zzgufVar3;
        int zzz;
        zzguf zzgufVar4;
        byte[] bArr;
        zzguf zzgufVar5;
        String str3;
        int i8;
        zzi zziVar;
        int i9;
        Map map;
        Map map2;
        byte[] bArr2;
        int i10;
        String str4;
        Map map3;
        zzfr zza;
        String str5 = this.zzc;
        int i11 = 4;
        int i12 = 0;
        switch (str5.hashCode()) {
            case -2095576542:
                if (str5.equals("V_MPEG4/ISO/AP")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    c5 = 23;
                    break;
                }
                c5 = 65535;
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    c5 = '!';
                    break;
                }
                c5 = 65535;
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    c5 = 31;
                    break;
                }
                c5 = 65535;
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    c5 = 21;
                    break;
                }
                c5 = 65535;
                break;
            case 62923557:
                if (str5.equals("A_AAC")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 62923603:
                if (str5.equals("A_AC3")) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 82318131:
                if (str5.equals("V_AV1")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    c5 = ' ';
                    break;
                }
                c5 = 65535;
                break;
            case 444813526:
                if (str5.equals("V_THEORA")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            case 635596514:
                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                    c5 = 26;
                    break;
                }
                c5 = 65535;
                break;
            case 725948237:
                if (str5.equals("A_PCM/INT/BIG")) {
                    c5 = 25;
                    break;
                }
                c5 = 65535;
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    c5 = 24;
                    break;
                }
                c5 = 65535;
                break;
            case 738597099:
                if (str5.equals("S_TEXT/ASS")) {
                    c5 = 28;
                    break;
                }
                c5 = 65535;
                break;
            case 738614379:
                if (str5.equals("S_TEXT/SSA")) {
                    c5 = 29;
                    break;
                }
                c5 = 65535;
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 1045209816:
                if (str5.equals("S_TEXT/WEBVTT")) {
                    c5 = 30;
                    break;
                }
                c5 = 65535;
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    c5 = 27;
                    break;
                }
                c5 = 65535;
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    c5 = 22;
                    break;
                }
                c5 = 65535;
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        String str6 = "audio/raw";
        switch (c5) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null && (zza = zzfr.zza(new zzer(this.zzO))) != null) {
                    str2 = zza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                int i13 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i11);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        int i14 = this.zzp;
                        i8 = -1;
                        if (i14 == -1) {
                            i14 = this.zzm;
                        }
                        this.zzp = i14;
                        int i15 = this.zzq;
                        if (i15 == -1) {
                            i15 = this.zzn;
                        }
                        this.zzq = i15;
                    } else {
                        i8 = -1;
                    }
                    float f5 = (this.zzp == i8 || (i10 = this.zzq) == i8) ? -1.0f : (this.zzn * r4) / (this.zzm * i10);
                    if (this.zzy) {
                        if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr2 = null;
                        } else {
                            bArr2 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzM + 0.5f));
                            order.putShort((short) (this.zzN + 0.5f));
                            order.putShort((short) this.zzC);
                            order.putShort((short) this.zzD);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.zza(this.zzz);
                        zzhVar.zzb(this.zzB);
                        zzhVar.zzc(this.zzA);
                        zzhVar.zzd(bArr2);
                        zzhVar.zze(this.zzo);
                        zzhVar.zzf(this.zzo);
                        zziVar = zzhVar.zzg();
                    } else {
                        zziVar = null;
                    }
                    String str7 = this.zzb;
                    if (str7 != null) {
                        map = zzajh.zzg;
                        if (map.containsKey(str7)) {
                            String str8 = this.zzb;
                            map2 = zzajh.zzg;
                            i9 = ((Integer) map2.get(str8)).intValue();
                            if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                                if (Float.compare(this.zzv, 0.0f) != 0) {
                                    if (Float.compare(this.zzv, 90.0f) == 0) {
                                        i12 = 90;
                                    } else {
                                        i12 = 180;
                                        if (Float.compare(this.zzv, -180.0f) != 0 && Float.compare(this.zzv, 180.0f) != 0) {
                                            if (Float.compare(this.zzv, -90.0f) == 0) {
                                                i12 = 270;
                                            }
                                        }
                                    }
                                }
                                zztVar.zzt(this.zzm);
                                zztVar.zzu(this.zzn);
                                zztVar.zzz(f5);
                                zztVar.zzy(i12);
                                zztVar.zzA(this.zzw);
                                zztVar.zzB(this.zzx);
                                zztVar.zzC(zziVar);
                            }
                            i12 = i9;
                            zztVar.zzt(this.zzm);
                            zztVar.zzu(this.zzn);
                            zztVar.zzz(f5);
                            zztVar.zzy(i12);
                            zztVar.zzA(this.zzw);
                            zztVar.zzB(this.zzx);
                            zztVar.zzC(zziVar);
                        }
                    }
                    i9 = i8;
                    if (this.zzs == 0) {
                        if (Float.compare(this.zzv, 0.0f) != 0) {
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f5);
                        zztVar.zzy(i12);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVar);
                    }
                    i12 = i9;
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f5);
                    zztVar.zzy(i12);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVar);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str4 = this.zzb;
                if (str4 != null) {
                    map3 = zzajh.zzg;
                    if (!map3.containsKey(str4)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i5);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i7);
                zztVar.zze(this.zzac);
                zztVar.zzf(i13);
                zztVar.zzp(zzgufVar4);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 1:
                byte[] bArr3 = this.zzk;
                str6 = "video/x-vnd.on2.vp9";
                zzgufVar5 = bArr3 == null ? null : zzguf.zzj(bArr3);
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                    str2 = zza.zza;
                    str6 = "video/dolby-vision";
                    break;
                }
                str3 = str6;
                int i132 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2.zzb(i5);
                zztVar2.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2.zzm(str3);
                zztVar2.zzn(i7);
                zztVar2.zze(this.zzac);
                zztVar2.zzf(i132);
                zztVar2.zzp(zzgufVar4);
                zztVar2.zzj(str2);
                zztVar2.zzq(this.zzl);
                this.zzZ = zztVar2.zzM();
                return;
            case 2:
                byte[] bArr4 = this.zzk;
                str6 = "video/av01";
                zzgufVar5 = bArr4 == null ? null : zzguf.zzj(bArr4);
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22.zzb(i5);
                zztVar22.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22.zzm(str3);
                zztVar22.zzn(i7);
                zztVar22.zze(this.zzac);
                zztVar22.zzf(i1322);
                zztVar22.zzp(zzgufVar4);
                zztVar22.zzj(str2);
                zztVar22.zzq(this.zzl);
                this.zzZ = zztVar22.zzM();
                return;
            case 3:
                str6 = "video/mpeg2";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222.zzb(i5);
                zztVar222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222.zzm(str3);
                zztVar222.zzn(i7);
                zztVar222.zze(this.zzac);
                zztVar222.zzf(i13222);
                zztVar222.zzp(zzgufVar4);
                zztVar222.zzj(str2);
                zztVar222.zzq(this.zzl);
                this.zzZ = zztVar222.zzM();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzk;
                str6 = "video/mp4v-es";
                zzgufVar5 = bArr5 == null ? null : Collections.singletonList(bArr5);
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222.zzb(i5);
                zztVar2222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222.zzm(str3);
                zztVar2222.zzn(i7);
                zztVar2222.zze(this.zzac);
                zztVar2222.zzf(i132222);
                zztVar2222.zzp(zzgufVar4);
                zztVar2222.zzj(str2);
                zztVar2222.zzq(this.zzl);
                this.zzZ = zztVar2222.zzM();
                return;
            case 7:
                zzadz zza2 = zzadz.zza(new zzer(zzi(this.zzc)));
                r2 = zza2.zza;
                this.zzaa = zza2.zzb;
                str = zza2.zzl;
                str6 = "video/avc";
                zzguf zzgufVar6 = r2;
                str2 = str;
                zzgufVar = zzgufVar6;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222.zzb(i5);
                zztVar22222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222.zzm(str3);
                zztVar22222.zzn(i7);
                zztVar22222.zze(this.zzac);
                zztVar22222.zzf(i1322222);
                zztVar22222.zzp(zzgufVar4);
                zztVar22222.zzj(str2);
                zztVar22222.zzq(this.zzl);
                this.zzZ = zztVar22222.zzM();
                return;
            case '\b':
                zzafo zza3 = zzafo.zza(new zzer(zzi(this.zzc)));
                r2 = zza3.zza;
                this.zzaa = zza3.zzb;
                str = zza3.zzn;
                str6 = "video/hevc";
                zzguf zzgufVar62 = r2;
                str2 = str;
                zzgufVar = zzgufVar62;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222.zzb(i5);
                zztVar222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222.zzm(str3);
                zztVar222222.zzn(i7);
                zztVar222222.zze(this.zzac);
                zztVar222222.zzf(i13222222);
                zztVar222222.zzp(zzgufVar4);
                zztVar222222.zzj(str2);
                zztVar222222.zzq(this.zzl);
                this.zzZ = zztVar222222.zzM();
                return;
            case '\t':
                Pair zzf = zzf(new zzer(zzi(this.zzc)));
                str6 = (String) zzf.first;
                zzgufVar5 = (List) zzf.second;
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222.zzb(i5);
                zztVar2222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222.zzm(str3);
                zztVar2222222.zzn(i7);
                zztVar2222222.zze(this.zzac);
                zztVar2222222.zzf(i132222222);
                zztVar2222222.zzp(zzgufVar4);
                zztVar2222222.zzj(str2);
                zztVar2222222.zzq(this.zzl);
                this.zzZ = zztVar2222222.zzM();
                return;
            case '\n':
                str6 = "video/x-unknown";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222.zzb(i5);
                zztVar22222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222.zzm(str3);
                zztVar22222222.zzn(i7);
                zztVar22222222.zze(this.zzac);
                zztVar22222222.zzf(i1322222222);
                zztVar22222222.zzp(zzgufVar4);
                zztVar22222222.zzj(str2);
                zztVar22222222.zzq(this.zzl);
                this.zzZ = zztVar22222222.zzM();
                return;
            case 11:
                i6 = 8192;
                str6 = "audio/vorbis";
                zzgufVar2 = zzg(zzi(str5));
                i7 = i6;
                str2 = null;
                zzgufVar3 = zzgufVar2;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222.zzb(i5);
                zztVar222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222.zzm(str3);
                zztVar222222222.zzn(i7);
                zztVar222222222.zze(this.zzac);
                zztVar222222222.zzf(i13222222222);
                zztVar222222222.zzp(zzgufVar4);
                zztVar222222222.zzj(str2);
                zztVar222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222.zzM();
                return;
            case '\f':
                ?? arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzc));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(allocate.order(byteOrder).putLong(this.zzS).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                i6 = 5760;
                str6 = "audio/opus";
                zzgufVar2 = arrayList;
                i7 = i6;
                str2 = null;
                zzgufVar3 = zzgufVar2;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222.zzb(i5);
                zztVar2222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222.zzm(str3);
                zztVar2222222222.zzn(i7);
                zztVar2222222222.zze(this.zzac);
                zztVar2222222222.zzf(i132222222222);
                zztVar2222222222.zzp(zzgufVar4);
                zztVar2222222222.zzj(str2);
                zztVar2222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222.zzM();
                return;
            case '\r':
                ?? singletonList = Collections.singletonList(zzi(str5));
                zzads zza4 = zzadt.zza(this.zzk);
                this.zzR = zza4.zza;
                this.zzP = zza4.zzb;
                str2 = zza4.zzc;
                str6 = "audio/mp4a-latm";
                zzgufVar = singletonList;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222.zzb(i5);
                zztVar22222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222.zzm(str3);
                zztVar22222222222.zzn(i7);
                zztVar22222222222.zze(this.zzac);
                zztVar22222222222.zzf(i1322222222222);
                zztVar22222222222.zzp(zzgufVar4);
                zztVar22222222222.zzj(str2);
                zztVar22222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222.zzM();
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                zzgufVar3 = null;
                str2 = null;
                i7 = 4096;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222.zzb(i5);
                zztVar222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222.zzm(str3);
                zztVar222222222222.zzn(i7);
                zztVar222222222222.zze(this.zzac);
                zztVar222222222222.zzf(i13222222222222);
                zztVar222222222222.zzp(zzgufVar4);
                zztVar222222222222.zzj(str2);
                zztVar222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222.zzM();
                return;
            case 15:
                str6 = "audio/mpeg";
                zzgufVar3 = null;
                str2 = null;
                i7 = 4096;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222.zzb(i5);
                zztVar2222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222.zzm(str3);
                zztVar2222222222222.zzn(i7);
                zztVar2222222222222.zze(this.zzac);
                zztVar2222222222222.zzf(i132222222222222);
                zztVar2222222222222.zzp(zzgufVar4);
                zztVar2222222222222.zzj(str2);
                zztVar2222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222.zzM();
                return;
            case 16:
                str6 = "audio/ac3";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222.zzb(i5);
                zztVar22222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222.zzm(str3);
                zztVar22222222222222.zzn(i7);
                zztVar22222222222222.zze(this.zzac);
                zztVar22222222222222.zzf(i1322222222222222);
                zztVar22222222222222.zzp(zzgufVar4);
                zztVar22222222222222.zzj(str2);
                zztVar22222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222.zzM();
                return;
            case 17:
                str6 = "audio/eac3";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222222.zzb(i5);
                zztVar222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222.zzm(str3);
                zztVar222222222222222.zzn(i7);
                zztVar222222222222222.zze(this.zzac);
                zztVar222222222222222.zzf(i13222222222222222);
                zztVar222222222222222.zzp(zzgufVar4);
                zztVar222222222222222.zzj(str2);
                zztVar222222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222222.zzM();
                return;
            case 18:
                this.zzU = new zzagi();
                str6 = "audio/true-hd";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222222.zzb(i5);
                zztVar2222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222.zzm(str3);
                zztVar2222222222222222.zzn(i7);
                zztVar2222222222222222.zze(this.zzac);
                zztVar2222222222222222.zzf(i132222222222222222);
                zztVar2222222222222222.zzp(zzgufVar4);
                zztVar2222222222222222.zzj(str2);
                zztVar2222222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222222.zzM();
                return;
            case 19:
            case 20:
                this.zzV = true;
                str6 = "audio/vnd.dts";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222222.zzb(i5);
                zztVar22222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222.zzm(str3);
                zztVar22222222222222222.zzn(i7);
                zztVar22222222222222222.zze(this.zzac);
                zztVar22222222222222222.zzf(i1322222222222222222);
                zztVar22222222222222222.zzp(zzgufVar4);
                zztVar22222222222222222.zzj(str2);
                zztVar22222222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222222.zzM();
                return;
            case zzbgj.zzt.zzm /* 21 */:
                str6 = "audio/vnd.dts.hd";
                zzgufVar = null;
                str2 = null;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222222222.zzb(i5);
                zztVar222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222.zzm(str3);
                zztVar222222222222222222.zzn(i7);
                zztVar222222222222222222.zze(this.zzac);
                zztVar222222222222222222.zzf(i13222222222222222222);
                zztVar222222222222222222.zzp(zzgufVar4);
                zztVar222222222222222222.zzj(str2);
                zztVar222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222222222.zzM();
                return;
            case 22:
                str6 = "audio/flac";
                zzgufVar5 = Collections.singletonList(zzi(str5));
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222222222.zzb(i5);
                zztVar2222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222.zzm(str3);
                zztVar2222222222222222222.zzn(i7);
                zztVar2222222222222222222.zze(this.zzac);
                zztVar2222222222222222222.zzf(i132222222222222222222);
                zztVar2222222222222222222.zzp(zzgufVar4);
                zztVar2222222222222222222.zzj(str2);
                zztVar2222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222222222.zzM();
                return;
            case 23:
                if (zzh(new zzer(zzi(this.zzc)))) {
                    zzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (zzz == 0) {
                        int i16 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i16);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc("MatroskaExtractor", sb.toString());
                    }
                    i11 = zzz;
                    zzgufVar4 = null;
                    str2 = null;
                    i7 = -1;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i1322222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zzt zztVar22222222222222222222 = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar22222222222222222222.zzb(i5);
                    zztVar22222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar22222222222222222222.zzm(str3);
                    zztVar22222222222222222222.zzn(i7);
                    zztVar22222222222222222222.zze(this.zzac);
                    zztVar22222222222222222222.zzf(i1322222222222222222222);
                    zztVar22222222222222222222.zzp(zzgufVar4);
                    zztVar22222222222222222222.zzj(str2);
                    zztVar22222222222222222222.zzq(this.zzl);
                    this.zzZ = zztVar22222222222222222222.zzM();
                    return;
                }
                zzee.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                zzgufVar = null;
                str2 = null;
                str6 = "audio/x-unknown";
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222222222222.zzb(i5);
                zztVar222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222.zzm(str3);
                zztVar222222222222222222222.zzn(i7);
                zztVar222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222.zzf(i13222222222222222222222);
                zztVar222222222222222222222.zzp(zzgufVar4);
                zztVar222222222222222222222.zzj(str2);
                zztVar222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222222222222.zzM();
                return;
            case 24:
                zzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (zzz == 0) {
                    int i17 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i17).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i17);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc("MatroskaExtractor", sb2.toString());
                    zzgufVar = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i7 = -1;
                    zzgufVar3 = zzgufVar;
                    i11 = -1;
                    zzgufVar4 = zzgufVar3;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i132222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zzt zztVar2222222222222222222222 = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar2222222222222222222222.zzb(i5);
                    zztVar2222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar2222222222222222222222.zzm(str3);
                    zztVar2222222222222222222222.zzn(i7);
                    zztVar2222222222222222222222.zze(this.zzac);
                    zztVar2222222222222222222222.zzf(i132222222222222222222222);
                    zztVar2222222222222222222222.zzp(zzgufVar4);
                    zztVar2222222222222222222222.zzj(str2);
                    zztVar2222222222222222222222.zzq(this.zzl);
                    this.zzZ = zztVar2222222222222222222222.zzM();
                    return;
                }
                i11 = zzz;
                zzgufVar4 = null;
                str2 = null;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222222222222.zzb(i5);
                zztVar22222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222.zzm(str3);
                zztVar22222222222222222222222.zzn(i7);
                zztVar22222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222.zzf(i1322222222222222222222222);
                zztVar22222222222222222222222.zzp(zzgufVar4);
                zztVar22222222222222222222222.zzj(str2);
                zztVar22222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222222222222.zzM();
                return;
            case 25:
                int i18 = this.zzQ;
                if (i18 == 8) {
                    zzgufVar4 = null;
                    str2 = null;
                    i7 = -1;
                    i11 = 3;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i13222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zzt zztVar222222222222222222222222 = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar222222222222222222222222.zzb(i5);
                    zztVar222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222222222222222222222222.zzm(str3);
                    zztVar222222222222222222222222.zzn(i7);
                    zztVar222222222222222222222222.zze(this.zzac);
                    zztVar222222222222222222222222.zzf(i13222222222222222222222222);
                    zztVar222222222222222222222222.zzp(zzgufVar4);
                    zztVar222222222222222222222222.zzj(str2);
                    zztVar222222222222222222222222.zzq(this.zzl);
                    this.zzZ = zztVar222222222222222222222222.zzM();
                    return;
                }
                if (i18 == 16) {
                    zzz = 268435456;
                } else if (i18 == 24) {
                    zzz = 1342177280;
                } else {
                    if (i18 != 32) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i18).length() + 75);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i18);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc("MatroskaExtractor", sb3.toString());
                        zzgufVar = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i7 = -1;
                        zzgufVar3 = zzgufVar;
                        i11 = -1;
                        zzgufVar4 = zzgufVar3;
                        if (this.zzO != null) {
                        }
                        str3 = str6;
                        int i132222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                        zzt zztVar2222222222222222222222222 = new zzt();
                        if (zzas.zza(str3)) {
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                        }
                        zztVar2222222222222222222222222.zzb(i5);
                        zztVar2222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                        zztVar2222222222222222222222222.zzm(str3);
                        zztVar2222222222222222222222222.zzn(i7);
                        zztVar2222222222222222222222222.zze(this.zzac);
                        zztVar2222222222222222222222222.zzf(i132222222222222222222222222);
                        zztVar2222222222222222222222222.zzp(zzgufVar4);
                        zztVar2222222222222222222222222.zzj(str2);
                        zztVar2222222222222222222222222.zzq(this.zzl);
                        this.zzZ = zztVar2222222222222222222222222.zzM();
                        return;
                    }
                    zzz = 1610612736;
                }
                i11 = zzz;
                zzgufVar4 = null;
                str2 = null;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222222222222222.zzb(i5);
                zztVar22222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222.zzm(str3);
                zztVar22222222222222222222222222.zzn(i7);
                zztVar22222222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222222.zzf(i1322222222222222222222222222);
                zztVar22222222222222222222222222.zzp(zzgufVar4);
                zztVar22222222222222222222222222.zzj(str2);
                zztVar22222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222222222222222.zzM();
                return;
            case 26:
                int i19 = this.zzQ;
                if (i19 != 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i19).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i19);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc("MatroskaExtractor", sb4.toString());
                    zzgufVar = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i7 = -1;
                    zzgufVar3 = zzgufVar;
                    i11 = -1;
                    zzgufVar4 = zzgufVar3;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i13222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zzt zztVar222222222222222222222222222 = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar222222222222222222222222222.zzb(i5);
                    zztVar222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222222222222222222222222222.zzm(str3);
                    zztVar222222222222222222222222222.zzn(i7);
                    zztVar222222222222222222222222222.zze(this.zzac);
                    zztVar222222222222222222222222222.zzf(i13222222222222222222222222222);
                    zztVar222222222222222222222222222.zzp(zzgufVar4);
                    zztVar222222222222222222222222222.zzj(str2);
                    zztVar222222222222222222222222222.zzq(this.zzl);
                    this.zzZ = zztVar222222222222222222222222222.zzM();
                    return;
                }
                zzgufVar4 = null;
                str2 = null;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222222222222222222.zzb(i5);
                zztVar2222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222.zzm(str3);
                zztVar2222222222222222222222222222.zzn(i7);
                zztVar2222222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222222.zzf(i132222222222222222222222222222);
                zztVar2222222222222222222222222222.zzp(zzgufVar4);
                zztVar2222222222222222222222222222.zzj(str2);
                zztVar2222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222222222222222222.zzM();
                return;
            case 27:
                zzgufVar = null;
                str2 = null;
                str6 = "application/x-subrip";
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222222222222222222.zzb(i5);
                zztVar22222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222.zzm(str3);
                zztVar22222222222222222222222222222.zzn(i7);
                zztVar22222222222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222222222.zzf(i1322222222222222222222222222222);
                zztVar22222222222222222222222222222.zzp(zzgufVar4);
                zztVar22222222222222222222222222222.zzj(str2);
                zztVar22222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222222222222222222.zzM();
                return;
            case 28:
            case 29:
                int i20 = zzajh.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = zzajh.zzc;
                str6 = "text/x-ssa";
                zzgufVar5 = zzguf.zzk(bArr, zzi);
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222222222222222222222.zzb(i5);
                zztVar222222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222.zzm(str3);
                zztVar222222222222222222222222222222.zzn(i7);
                zztVar222222222222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222222222222.zzf(i13222222222222222222222222222222);
                zztVar222222222222222222222222222222.zzp(zzgufVar4);
                zztVar222222222222222222222222222222.zzj(str2);
                zztVar222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222222222222222222222.zzM();
                return;
            case 30:
                zzgufVar = null;
                str2 = null;
                str6 = "text/vtt";
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222222222222222222222.zzb(i5);
                zztVar2222222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222.zzm(str3);
                zztVar2222222222222222222222222222222.zzn(i7);
                zztVar2222222222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222222222.zzf(i132222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzp(zzgufVar4);
                zztVar2222222222222222222222222222222.zzj(str2);
                zztVar2222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222222222222222222222.zzM();
                return;
            case 31:
                str6 = "application/vobsub";
                zzgufVar5 = zzguf.zzj(zzi(str5));
                str2 = null;
                zzgufVar = zzgufVar5;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i1322222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar22222222222222222222222222222222.zzb(i5);
                zztVar22222222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222222.zzm(str3);
                zztVar22222222222222222222222222222222.zzn(i7);
                zztVar22222222222222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222222222222.zzf(i1322222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zzp(zzgufVar4);
                zztVar22222222222222222222222222222222.zzj(str2);
                zztVar22222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar22222222222222222222222222222222.zzM();
                return;
            case ' ':
                zzgufVar = null;
                str2 = null;
                str6 = "application/pgs";
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i13222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar222222222222222222222222222222222.zzb(i5);
                zztVar222222222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222222.zzm(str3);
                zztVar222222222222222222222222222222222.zzn(i7);
                zztVar222222222222222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222222222222222.zzf(i13222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zzp(zzgufVar4);
                zztVar222222222222222222222222222222222.zzj(str2);
                zztVar222222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar222222222222222222222222222222222.zzM();
                return;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str5), 0, bArr6, 0, 4);
                zzguf zzj = zzguf.zzj(bArr6);
                str2 = null;
                str6 = "application/dvbsubs";
                zzgufVar = zzj;
                i7 = -1;
                zzgufVar3 = zzgufVar;
                i11 = -1;
                zzgufVar4 = zzgufVar3;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i132222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222222222222 = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar2222222222222222222222222222222222.zzb(i5);
                zztVar2222222222222222222222222222222222.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222222.zzm(str3);
                zztVar2222222222222222222222222222222222.zzn(i7);
                zztVar2222222222222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222222222222.zzf(i132222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222.zzp(zzgufVar4);
                zztVar2222222222222222222222222222222222.zzj(str2);
                zztVar2222222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zztVar2222222222222222222222222222222222.zzM();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i5) {
        this.zzab = i5;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
