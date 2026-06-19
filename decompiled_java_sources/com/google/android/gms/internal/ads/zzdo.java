package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(int i5, int i6, int i7) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
    }

    public static String zzb(int i5, boolean z4, int i6, int i7, int[] iArr, int i8) {
        int i9;
        Object[] objArr = {zzc[i5], Integer.valueOf(i6), Integer.valueOf(i7), Character.valueOf(true != z4 ? 'L' : 'H'), Integer.valueOf(i8)};
        String str = zzfj.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i10 = 6;
        while (true) {
            if (i10 <= 0) {
                break;
            }
            int i11 = i10 - 1;
            if (iArr[i11] != 0) {
                break;
            }
            i10 = i11;
        }
        for (i9 = 0; i9 < i10; i9++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i9])));
        }
        return sb.toString();
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b2 = bArr[0];
        zzgrc.zzd(b2 == 1, "Invalid APV CSD version: %s", b2);
        byte b5 = bArr[5];
        byte b6 = bArr[6];
        byte b7 = bArr[7];
        String str = zzfj.zza;
        Locale locale = Locale.US;
        return "apv1.apvf" + ((int) b5) + ".apvl" + ((int) b6) + ".apvb" + ((int) b7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0151, code lost:
    
        if (r0.equals("11") != false) goto L104;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzd(zzv zzvVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int length;
        int i9;
        int parseInt;
        int parseInt2;
        int i10;
        int i11;
        int i12;
        Integer num;
        Integer num2 = 1024;
        Integer valueOf = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
        int i13 = 2;
        String str = zzvVar.zzk;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(zzvVar.zzo)) {
            String str2 = split[0];
            int i14 = 8192;
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        String str3 = zzvVar.zzk;
                        if (split.length != 4) {
                            u.q(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                int parseInt5 = Integer.parseInt(split[3]);
                                if (parseInt3 == 0) {
                                    if (parseInt4 == 0) {
                                        i5 = 257;
                                        parseInt4 = 0;
                                    }
                                    i5 = -1;
                                } else if (parseInt3 != 1) {
                                    if (parseInt3 == 2) {
                                        if (parseInt4 == 1) {
                                            i5 = 1026;
                                            parseInt4 = 1;
                                        } else if (parseInt4 == 2) {
                                            i5 = 1028;
                                            parseInt4 = 2;
                                        }
                                    }
                                    i5 = -1;
                                } else if (parseInt4 == 0) {
                                    i5 = 513;
                                    parseInt4 = 0;
                                } else {
                                    if (parseInt4 == 1) {
                                        i5 = 514;
                                        parseInt4 = 1;
                                    }
                                    i5 = -1;
                                }
                                if (i5 != -1) {
                                    int i15 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? parseInt5 != 4 ? -1 : 16 : 8 : 4 : 2 : 1;
                                    if (i15 != -1) {
                                        break;
                                    } else {
                                        u.r(new StringBuilder(String.valueOf(parseInt5).length() + 20), "Unknown AC-4 level: ", parseInt5, "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    zzee.zzc("CodecSpecificDataUtil", s.c.c(new StringBuilder(String.valueOf(parseInt3).length() + 23 + String.valueOf(parseInt4).length()), "Unknown AC-4 profile: ", parseInt3, ".", parseInt4));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                u.q(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                                return null;
                            }
                        }
                    }
                    break;
                case 3001066:
                    if (str2.equals("apv1")) {
                        String str4 = zzvVar.zzk;
                        if (split.length < 4) {
                            u.q(str4, "Ignoring malformed APV codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int parseInt6 = Integer.parseInt(split[1].substring(4));
                                int parseInt7 = Integer.parseInt(split[2].substring(4));
                                int parseInt8 = Integer.parseInt(split[3].substring(4));
                                if (parseInt6 != 33) {
                                    if (parseInt6 != 44) {
                                        StringBuilder sb = new StringBuilder(u.b(parseInt6, 30));
                                        sb.append("Ignoring invalid APV profile: ");
                                        sb.append(parseInt6);
                                        zzee.zzc("CodecSpecificDataUtil", sb.toString());
                                        break;
                                    }
                                } else {
                                    i14 = 1;
                                }
                                int i16 = parseInt7 / 30;
                                int i17 = i16 + i16;
                                if (parseInt7 % 30 == 0) {
                                    i17--;
                                }
                                break;
                            } catch (NumberFormatException e4) {
                                zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str4)), e4);
                                return null;
                            }
                        }
                    }
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        String str5 = zzvVar.zzk;
                        zzi zziVar = zzvVar.zzE;
                        if (split.length < 4) {
                            u.q(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int parseInt9 = Integer.parseInt(split[1]);
                                int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt11 = Integer.parseInt(split[3]);
                                if (parseInt9 == 0) {
                                    if (parseInt11 == 8) {
                                        i6 = 1;
                                    } else if (parseInt11 != 10) {
                                        u.r(new StringBuilder(String.valueOf(parseInt11).length() + 23), "Unknown AV1 bit depth: ", parseInt11, "CodecSpecificDataUtil");
                                        break;
                                    } else {
                                        i6 = (zziVar == null || !(zziVar.zze != null || (i8 = zziVar.zzd) == 7 || i8 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt10) {
                                        case 0:
                                            i7 = 1;
                                            break;
                                        case 1:
                                            i7 = 2;
                                            break;
                                        case 2:
                                            i7 = 4;
                                            break;
                                        case 3:
                                            i7 = 8;
                                            break;
                                        case 4:
                                            i7 = 16;
                                            break;
                                        case 5:
                                            i7 = 32;
                                            break;
                                        case 6:
                                            i7 = 64;
                                            break;
                                        case 7:
                                            i7 = 128;
                                            break;
                                        case 8:
                                            i7 = 256;
                                            break;
                                        case 9:
                                            i7 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                            break;
                                        case 10:
                                            i7 = 1024;
                                            break;
                                        case 11:
                                            i7 = 2048;
                                            break;
                                        case 12:
                                            i7 = 4096;
                                            break;
                                        case 13:
                                            i7 = 8192;
                                            break;
                                        case 14:
                                            i7 = 16384;
                                            break;
                                        case 15:
                                            i7 = 32768;
                                            break;
                                        case 16:
                                            i7 = 65536;
                                            break;
                                        case 17:
                                            i7 = 131072;
                                            break;
                                        case 18:
                                            i7 = 262144;
                                            break;
                                        case 19:
                                            i7 = 524288;
                                            break;
                                        case 20:
                                            i7 = 1048576;
                                            break;
                                        case zzbgj.zzt.zzm /* 21 */:
                                            i7 = 2097152;
                                            break;
                                        case 22:
                                            i7 = 4194304;
                                            break;
                                        case 23:
                                            i7 = 8388608;
                                            break;
                                        default:
                                            i7 = -1;
                                            break;
                                    }
                                    if (i7 != -1) {
                                        break;
                                    } else {
                                        u.r(new StringBuilder(String.valueOf(parseInt10).length() + 19), "Unknown AV1 level: ", parseInt10, "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    u.r(new StringBuilder(String.valueOf(parseInt9).length() + 21), "Unknown AV1 profile: ", parseInt9, "CodecSpecificDataUtil");
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                u.q(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                                return null;
                            }
                        }
                    }
                    break;
                case 3006243:
                    if (!str2.equals("avc1")) {
                    }
                    String str6 = zzvVar.zzk;
                    length = split.length;
                    if (length >= 2) {
                        u.q(str6, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i9 = 16;
                                if (length < 3) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 37);
                                    sb2.append("Ignoring malformed AVC codec string: ");
                                    sb2.append(str6);
                                    zzee.zzc("CodecSpecificDataUtil", sb2.toString());
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i9 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt == 66) {
                                i13 = 1;
                            } else if (parseInt != 77) {
                                i13 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i9 : 8 : 4;
                            }
                            if (i13 != -1) {
                                switch (parseInt2) {
                                    case 10:
                                        i10 = 1;
                                        break;
                                    case 11:
                                        i10 = 4;
                                        break;
                                    case 12:
                                        i10 = 8;
                                        break;
                                    case 13:
                                        i10 = i9;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i10 = 32;
                                                break;
                                            case zzbgj.zzt.zzm /* 21 */:
                                                i10 = 64;
                                                break;
                                            case 22:
                                                i10 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 30:
                                                        i10 = 256;
                                                        break;
                                                    case 31:
                                                        i10 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                                        break;
                                                    case 32:
                                                        i10 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 40:
                                                                i10 = 2048;
                                                                break;
                                                            case 41:
                                                                i10 = 4096;
                                                                break;
                                                            case 42:
                                                                i10 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i10 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i10 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i10 = 65536;
                                                                        break;
                                                                    default:
                                                                        i10 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i10 != -1) {
                                    break;
                                } else {
                                    u.r(new StringBuilder(String.valueOf(parseInt2).length() + 19), "Unknown AVC level: ", parseInt2, "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                u.r(new StringBuilder(String.valueOf(parseInt).length() + 21), "Unknown AVC profile: ", parseInt, "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            u.q(str6, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 3006244:
                    if (!str2.equals("avc2")) {
                    }
                    String str62 = zzvVar.zzk;
                    length = split.length;
                    if (length >= 2) {
                    }
                    break;
                case 3199032:
                    if (!str2.equals("hev1")) {
                    }
                    break;
                case 3214780:
                    if (!str2.equals("hvc1")) {
                    }
                    break;
                case 3224753:
                    if (str2.equals("iamf")) {
                        if (split.length < 4) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                            break;
                        } else {
                            try {
                                int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
                                String str7 = split[3];
                                switch (str7.hashCode()) {
                                    case 2464863:
                                        if (str7.equals("Opus")) {
                                            i11 = 1;
                                            break;
                                        }
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str7));
                                        break;
                                    case 3114792:
                                        if (str7.equals("fLaC")) {
                                            i11 = 4;
                                            break;
                                        }
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str7));
                                        break;
                                    case 3238865:
                                        if (str7.equals("ipcm")) {
                                            i11 = 8;
                                            break;
                                        }
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str7));
                                        break;
                                    case 3356560:
                                        if (str7.equals("mp4a")) {
                                            i11 = 2;
                                            break;
                                        }
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str7));
                                        break;
                                    default:
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str7));
                                        break;
                                }
                            } catch (NumberFormatException e5) {
                                zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(split[1])), e5);
                                return null;
                            }
                        }
                    }
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        String str8 = zzvVar.zzk;
                        if (split.length != 3) {
                            u.q(str8, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(split[1], 16)))) {
                                    int parseInt13 = Integer.parseInt(split[2]);
                                    if (parseInt13 == 17) {
                                        i12 = 17;
                                    } else if (parseInt13 == 20) {
                                        i12 = 20;
                                    } else if (parseInt13 == 23) {
                                        i12 = 23;
                                    } else if (parseInt13 == 29) {
                                        i12 = 29;
                                    } else if (parseInt13 == 39) {
                                        i12 = 39;
                                    } else if (parseInt13 != 42) {
                                        switch (parseInt13) {
                                            case 1:
                                                i12 = 1;
                                                break;
                                            case 2:
                                                i12 = 2;
                                                break;
                                            case 3:
                                                i12 = 3;
                                                break;
                                            case 4:
                                                i12 = 4;
                                                break;
                                            case 5:
                                                i12 = 5;
                                                break;
                                            case 6:
                                                i12 = 6;
                                                break;
                                            default:
                                                i12 = -1;
                                                break;
                                        }
                                    } else {
                                        i12 = 42;
                                    }
                                    if (i12 != -1) {
                                        break;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                u.q(str8, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                                return null;
                            }
                        }
                    }
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        String str9 = zzvVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (split.length < 3) {
                            u.q(str9, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        } else {
                            try {
                                break;
                            } catch (NumberFormatException unused5) {
                                u.q(str9, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                            }
                        }
                        break;
                    }
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        String str10 = zzvVar.zzk;
                        if (split.length < 3) {
                            u.q(str10, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int parseInt14 = Integer.parseInt(split[1]);
                                int parseInt15 = Integer.parseInt(split[2]);
                                int i18 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i18 != -1) {
                                    if (parseInt15 == 10) {
                                        i13 = 1;
                                    } else if (parseInt15 != 11) {
                                        if (parseInt15 == 20) {
                                            i13 = 4;
                                        } else if (parseInt15 == 21) {
                                            i13 = 8;
                                        } else if (parseInt15 == 30) {
                                            i13 = 16;
                                        } else if (parseInt15 == 31) {
                                            i13 = 32;
                                        } else if (parseInt15 == 40) {
                                            i13 = 64;
                                        } else if (parseInt15 == 41) {
                                            i13 = 128;
                                        } else if (parseInt15 == 50) {
                                            i13 = 256;
                                        } else if (parseInt15 != 51) {
                                            switch (parseInt15) {
                                                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                                                    i13 = 2048;
                                                    break;
                                                case 61:
                                                    i13 = 4096;
                                                    break;
                                                case 62:
                                                    i13 = 8192;
                                                    break;
                                                default:
                                                    i13 = -1;
                                                    break;
                                            }
                                        } else {
                                            i13 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                        }
                                    }
                                    if (i13 != -1) {
                                        break;
                                    } else {
                                        u.r(new StringBuilder(String.valueOf(parseInt15).length() + 19), "Unknown VP9 level: ", parseInt15, "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    u.r(new StringBuilder(String.valueOf(parseInt14).length() + 21), "Unknown VP9 profile: ", parseInt14, "CodecSpecificDataUtil");
                                    break;
                                }
                            } catch (NumberFormatException unused6) {
                                u.q(str10, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                                return null;
                            }
                        }
                    }
                    break;
            }
            return null;
        }
        if (split.length < 3) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = zzd.matcher(split[1]);
        if (!matcher.matches()) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num = 1;
                            break;
                        }
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num = 2;
                            break;
                        }
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num = 4;
                            break;
                        }
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num = 8;
                            break;
                        }
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num = 16;
                            break;
                        }
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num = 32;
                            break;
                        }
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num = 64;
                            break;
                        }
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num = 128;
                            break;
                        }
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num = 256;
                            break;
                        }
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num = valueOf;
                            break;
                        }
                        break;
                }
                if (num == null) {
                    u.q(group, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                    return null;
                }
                String str11 = split[2];
                if (str11 != null) {
                    int hashCode2 = str11.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str11.equals("01")) {
                                num2 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str11.equals("02")) {
                                num2 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str11.equals("03")) {
                                num2 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str11.equals("04")) {
                                num2 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str11.equals("05")) {
                                num2 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str11.equals("06")) {
                                num2 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str11.equals("07")) {
                                num2 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str11.equals("08")) {
                                num2 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str11.equals("09")) {
                                num2 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str11.equals("10")) {
                                        num2 = valueOf;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str11.equals("12")) {
                                        num2 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str11.equals("13")) {
                                        num2 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num2 == null) {
                        return new Pair(num, num2);
                    }
                    u.q(str11, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
                    return null;
                }
                num2 = null;
                if (num2 == null) {
                }
            } else if (group.equals("10")) {
                num = num2;
                if (num == null) {
                }
            }
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zze(String str, String[] strArr, zzi zziVar) {
        int i5;
        Integer num;
        if (strArr.length < 4) {
            u.q(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.q(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i5 = 1;
        } else {
            i5 = 6;
            if ("2".equals(group)) {
                i5 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
            } else if (!"6".equals(group)) {
                u.q(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        num = 2;
                        break;
                    }
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        num = 8;
                        break;
                    }
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        num = 32;
                        break;
                    }
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        num = 128;
                        break;
                    }
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        num = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
                        break;
                    }
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        num = 1;
                        break;
                    }
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        num = 4;
                        break;
                    }
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        num = 16;
                        break;
                    }
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        num = 64;
                        break;
                    }
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        num = 256;
                        break;
                    }
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        num = 2048;
                        break;
                    }
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        num = 8192;
                        break;
                    }
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        num = 32768;
                        break;
                    }
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        num = 131072;
                        break;
                    }
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        num = 524288;
                        break;
                    }
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        num = 2097152;
                        break;
                    }
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        num = 8388608;
                        break;
                    }
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        num = 33554432;
                        break;
                    }
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        num = 1024;
                        break;
                    }
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        num = 4096;
                        break;
                    }
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        num = 16384;
                        break;
                    }
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        num = 65536;
                        break;
                    }
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        num = 262144;
                        break;
                    }
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        num = 1048576;
                        break;
                    }
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        num = 4194304;
                        break;
                    }
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        num = 16777216;
                        break;
                    }
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i5), num);
            }
            u.q(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static byte[] zzf(byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[i6 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i5, bArr2, 4, i6);
        return bArr2;
    }
}
