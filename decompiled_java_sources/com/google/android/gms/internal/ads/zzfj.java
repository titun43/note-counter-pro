package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.getcapacitor.PluginMethod;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzbgj;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class zzfj {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i5 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i5).length());
        s.c.e(sb, str, ", ", str2, ", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i5);
        zza = sb.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean zzA(int i5) {
        return i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4;
    }

    public static int zzB(int i5) {
        int i6;
        int i7 = 6396;
        if (i5 != 10) {
            if (i5 == 16) {
                i6 = 205215996;
            } else if (i5 != 24) {
                switch (i5) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i5) {
                            case 12:
                                return 743676;
                            case 13:
                                i6 = 30136348;
                                break;
                            case 14:
                                i6 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i6 = 67108860;
            }
            i7 = 0;
        } else {
            i6 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i6 : i7;
    }

    public static int zzC(int i5) {
        if (i5 == 30) {
            return 34;
        }
        switch (i5) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i5) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i5) {
                            case 20:
                                return 30;
                            case zzbgj.zzt.zzm /* 21 */:
                            case 22:
                                return 31;
                            default:
                                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                }
        }
    }

    public static int zzD(int i5) {
        if (i5 != 2) {
            if (i5 == 3) {
                return 1;
            }
            if (i5 != 4) {
                if (i5 != 21) {
                    if (i5 != 22) {
                        if (i5 != 268435456) {
                            if (i5 != 1342177280) {
                                if (i5 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzE(int i5) {
        if (i5 == 2 || i5 == 4) {
            return 6005;
        }
        if (i5 == 10) {
            return 6004;
        }
        if (i5 == 7) {
            return 6005;
        }
        if (i5 == 8) {
            return 6003;
        }
        switch (i5) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case zzbgj.zzt.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i5) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0.equals("isml") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r0.equals("ism") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzF(Uri uri) {
        int i5;
        String scheme = uri.getScheme();
        if (scheme != null && (zzgql.zze("rtsp", scheme) || zzgql.zze("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzgql.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        i5 = 0;
                        break;
                    }
                    i5 = 4;
                    break;
                case 3242057:
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        i5 = 2;
                        break;
                    }
                    i5 = 4;
                    break;
                default:
                    i5 = 4;
                    break;
            }
            if (i5 != 4) {
                return i5;
            }
        }
        Pattern pattern = zzc;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzG(byte[] bArr, int i5, int i6, int i7) {
        while (i5 < i6) {
            i7 = zzg[(i7 >>> 24) ^ (bArr[i5] & 255)] ^ (i7 << 8);
            i5++;
        }
        return i7;
    }

    public static int zzH(byte[] bArr, int i5, int i6, int i7) {
        int i8 = 65535;
        for (int i9 = 0; i9 < i6; i9++) {
            byte b2 = bArr[i9];
            i8 = zzT(b2 & 15, zzT((b2 & 255) >> 4, i8));
        }
        return i8;
    }

    public static int zzI(byte[] bArr, int i5, int i6, int i7) {
        int i8 = 0;
        while (i5 < i6) {
            i8 = zzi[i8 ^ (bArr[i5] & 255)];
            i5++;
        }
        return i8;
    }

    public static int zzJ(ByteBuffer byteBuffer, int i5) {
        int i6 = byteBuffer.getInt(i5);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i6 : Integer.reverseBytes(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.zzf(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzK(zzer zzerVar, zzer zzerVar2, Inflater inflater) {
        boolean z4 = false;
        if (zzerVar.zzd() == 0) {
            return false;
        }
        if (zzerVar2.zzj() < zzerVar.zzd()) {
            int zzd2 = zzerVar.zzd();
            zzerVar2.zzc(zzd2 + zzd2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzerVar.zzi(), zzerVar.zzg(), zzerVar.zzd());
        int i5 = 0;
        while (true) {
            try {
                i5 += inflater.inflate(zzerVar2.zzi(), i5, zzerVar2.zzj() - i5);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i5 == zzerVar2.zzj()) {
                        int zzj = zzerVar2.zzj();
                        zzerVar2.zzc(zzj + zzj);
                    }
                } else {
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z4;
    }

    public static boolean zzL(zzer zzerVar, zzer zzerVar2, Inflater inflater) {
        return zzerVar.zzd() > 0 && zzerVar.zzn() == 120 && zzK(zzerVar, zzerVar2, inflater);
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzN(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzO(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            String zzU = Build.VERSION.SDK_INT < 28 ? zzU("sys.display-size") : zzU("vendor.display-size");
            if (!TextUtils.isEmpty(zzU)) {
                try {
                    String[] split = zzU.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zze("Util", "Invalid display size: ".concat(String.valueOf(zzU)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzP(int i5) {
        switch (i5) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                return PluginMethod.RETURN_NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int zzQ(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int parseInt = Integer.parseInt(str2);
            return z4 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzR(Context context) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i5 == 30) {
            String str = Build.MODEL;
            if (zzgql.zze(str, "moto g(20)") || zzgql.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i5 == 34 && zzgql.zze(Build.MODEL, "sm-x200");
    }

    private static long zzS(long j2, long j5, long j6, RoundingMode roundingMode) {
        long zzc2 = zzgxu.zzc(j2, j5);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return zzgxu.zza(zzc2, j6, roundingMode);
        }
        long zzb2 = zzgxu.zzb(Math.abs(j5), Math.abs(j6));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long zza2 = zzgxu.zza(j5, zzb2, roundingMode2);
        long zza3 = zzgxu.zza(j6, zzb2, roundingMode2);
        long zzb3 = zzgxu.zzb(Math.abs(j2), Math.abs(zza3));
        long zza4 = zzgxu.zza(j2, zzb3, roundingMode2);
        long zza5 = zzgxu.zza(zza3, zzb3, roundingMode2);
        long zzc3 = zzgxu.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return zzgxu.zza(zzc3, zza5, roundingMode);
        }
        double d5 = (zza2 / zza5) * zza4;
        if (d5 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d5 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgxp.zza(d5, roundingMode);
    }

    private static int zzT(int i5, int i6) {
        return (char) (zzh[(i5 ^ (i6 >> 12)) & 255] ^ ((char) (i6 << 4)));
    }

    private static String zzU(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            zzee.zzf("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    private static HashMap zzV() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap hashMap = new HashMap(length + 88);
        int i5 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i5 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i5], strArr[i5 + 1]);
            i5 += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i5) {
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i5) {
        zzgrc.zza(i5 <= objArr.length);
        return Arrays.copyOf(objArr, i5);
    }

    public static Handler zzc(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, null);
    }

    public static boolean zzd(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zze() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfi
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzfj.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzg(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzfh
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzfj.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzgql.zza(str);
        int i5 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzV();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i5 >= 18) {
                    break;
                }
                if (zza2.startsWith(strArr[i5])) {
                    return String.valueOf(strArr[i5 + 1]).concat(String.valueOf(zza2.substring(strArr[i5].length())));
                }
                i5 += 2;
            }
        }
        return zza2;
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzj(byte[] bArr, int i5, int i6) {
        return new String(bArr, i5, i6, StandardCharsets.UTF_8);
    }

    public static boolean zzk(int i5) {
        return i5 == 10 || i5 == 13;
    }

    public static int zzl(int[] iArr, int i5, boolean z4, boolean z5) {
        int i6;
        int i7;
        int binarySearch = Arrays.binarySearch(iArr, i5);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                i6 = binarySearch - 1;
                if (i6 < 0 || iArr[i6] != i5) {
                    break;
                }
                binarySearch = i6;
            }
            i7 = z4 ? binarySearch : i6;
        }
        return z5 ? Math.max(0, i7) : i7;
    }

    public static int zzm(long[] jArr, long j2, boolean z4, boolean z5) {
        int i5;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i5 = -(binarySearch + 2);
        } else {
            while (true) {
                int i6 = binarySearch - 1;
                if (i6 < 0 || jArr[i6] != j2) {
                    break;
                }
                binarySearch = i6;
            }
            i5 = binarySearch;
        }
        return z5 ? Math.max(0, i5) : i5;
    }

    public static int zzn(zzef zzefVar, long j2, boolean z4, boolean z5) {
        int zzd2 = zzefVar.zzd() - 1;
        int i5 = 0;
        while (i5 <= zzd2) {
            int i6 = (i5 + zzd2) >>> 1;
            if (zzefVar.zzc(i6) < j2) {
                i5 = i6 + 1;
            } else {
                zzd2 = i6 - 1;
            }
        }
        int i7 = zzd2 + 1;
        if (i7 < zzefVar.zzd() && zzefVar.zzc(i7) == j2) {
            return i7;
        }
        if (zzd2 == -1) {
            return 0;
        }
        return zzd2;
    }

    public static int zzo(long[] jArr, long j2, boolean z4, boolean z5) {
        int i5;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i5 = binarySearch + 1;
            if (i5 >= jArr.length || jArr[i5] != j2) {
                break;
            }
            binarySearch = i5;
        }
        return !z4 ? i5 : binarySearch;
    }

    public static long zzp(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static long zzq(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long zzr(long j2, int i5) {
        return zzt(j2, 1000000L, i5, RoundingMode.DOWN);
    }

    public static long zzs(long j2, int i5) {
        return zzt(j2, i5, 1000000L, RoundingMode.UP);
    }

    public static long zzt(long j2, long j5, long j6, RoundingMode roundingMode) {
        if (j2 == 0 || j5 == 0) {
            return 0L;
        }
        return (j6 < j5 || j6 % j5 != 0) ? (j6 >= j5 || j5 % j6 != 0) ? (j6 < j2 || j6 % j2 != 0) ? (j6 >= j2 || j2 % j6 != 0) ? zzS(j2, j5, j6, roundingMode) : zzgxu.zzc(j5, zzgxu.zza(j2, j6, RoundingMode.UNNECESSARY)) : zzgxu.zza(j5, zzgxu.zza(j6, j2, RoundingMode.UNNECESSARY), roundingMode) : zzgxu.zzc(j2, zzgxu.zza(j5, j6, RoundingMode.UNNECESSARY)) : zzgxu.zza(j2, zzgxu.zza(j6, j5, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzu(long[] jArr, long j2, long j5) {
        long j6;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i5 = 0;
        if (j5 >= 1000000 && j5 % 1000000 == 0) {
            long zza2 = zzgxu.zza(j5, 1000000L, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = zzgxu.zza(jArr[i5], zza2, roundingMode);
                i5++;
            }
            return;
        }
        if (j5 < 1000000 && 1000000 % j5 == 0) {
            long zza3 = zzgxu.zza(1000000L, j5, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = zzgxu.zzc(jArr[i5], zza3);
                i5++;
            }
            return;
        }
        int i6 = 0;
        while (i6 < jArr.length) {
            long j7 = jArr[i6];
            if (j7 != 0) {
                if (j5 >= j7 && j5 % j7 == 0) {
                    jArr[i6] = zzgxu.zza(1000000L, zzgxu.zza(j5, j7, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j5 >= j7 || j7 % j5 != 0) {
                    j6 = j5;
                    jArr[i6] = zzS(j7, 1000000L, j6, roundingMode);
                    i6++;
                    j5 = j6;
                } else {
                    jArr[i6] = zzgxu.zzc(1000000L, zzgxu.zza(j7, j5, RoundingMode.UNNECESSARY));
                }
            }
            j6 = j5;
            i6++;
            j5 = j6;
        }
    }

    public static long zzv(long j2, float f5) {
        return f5 == 1.0f ? j2 : Math.round(j2 * f5);
    }

    public static long zzw(long j2, float f5) {
        return f5 == 1.0f ? j2 : Math.round(j2 / f5);
    }

    public static String zzx(int i5) {
        return new String(new byte[]{(byte) (i5 >> 24), (byte) (i5 >> 16), (byte) (i5 >> 8), (byte) i5}, StandardCharsets.US_ASCII);
    }

    public static zzv zzy(int i5, int i6, int i7) {
        zzt zztVar = new zzt();
        zztVar.zzm("audio/raw");
        zztVar.zzE(i6);
        zztVar.zzF(i7);
        zztVar.zzG(i5);
        return zztVar.zzM();
    }

    public static int zzz(int i5, ByteOrder byteOrder) {
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i5 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i5 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }
}
