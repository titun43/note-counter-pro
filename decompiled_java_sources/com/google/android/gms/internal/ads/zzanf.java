package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.emoji2.text.u;
import com.getcapacitor.PluginMethod;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    public zzanf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0254, code lost:
    
        if (r3.equals("text") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0268, code lost:
    
        r0 = zze(r0);
        r0.zzu(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025d, code lost:
    
        if (r3.equals("base") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029c, code lost:
    
        r0 = zze(r0);
        r0.zzu(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0266, code lost:
    
        if (r3.equals("textContainer") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029a, code lost:
    
        if (r3.equals("baseContainer") != false) goto L128;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[Catch: zzamb -> 0x0187, TryCatch #3 {zzamb -> 0x0187, blocks: (B:33:0x00a7, B:35:0x00c3, B:36:0x00d9, B:38:0x00df, B:40:0x00e5, B:49:0x00fd, B:50:0x0118, B:52:0x011e, B:54:0x0127, B:57:0x0128, B:58:0x0145, B:62:0x0109, B:66:0x0115, B:69:0x0146, B:71:0x0147, B:72:0x0164, B:74:0x00cc, B:76:0x0165, B:77:0x0186), top: B:32:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzani zzd(XmlPullParser xmlPullParser, zzani zzaniVar) {
        Matcher matcher;
        String group;
        int attributeCount = xmlPullParser.getAttributeCount();
        zzani zzaniVar2 = zzaniVar;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                        continue;
                    }
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzM(attributeValue);
                    } else {
                        continue;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzi(attributeValue);
                    } else {
                        continue;
                    }
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzz(zzf(attributeValue));
                    } else {
                        continue;
                    }
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzK(attributeValue);
                    } else {
                        continue;
                    }
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String zza2 = zzgql.zza(attributeValue);
                        switch (zza2.hashCode()) {
                            case -1461280213:
                                if (zza2.equals("nounderline")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zze(false);
                                    break;
                                }
                                break;
                            case -1026963764:
                                if (zza2.equals("underline")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zze(true);
                                    break;
                                }
                                break;
                            case 913457136:
                                if (zza2.equals("nolinethrough")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zzc(false);
                                    break;
                                }
                                break;
                            case 1679736913:
                                if (zza2.equals("linethrough")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zzc(true);
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzs(attributeValue);
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String zza3 = zzgql.zza(attributeValue);
                        switch (zza3.hashCode()) {
                            case -618561360:
                                break;
                            case -410956671:
                                if (zza3.equals("container")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zzu(1);
                                    break;
                                }
                                break;
                            case -250518009:
                                if (zza3.equals("delimiter")) {
                                    zzaniVar2 = zze(zzaniVar2);
                                    zzaniVar2.zzu(4);
                                    break;
                                }
                                break;
                            case -136074796:
                                break;
                            case 3016401:
                                break;
                            case 3556653:
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        zzaniVar2 = zze(zzaniVar2);
                        try {
                            zzaniVar2.zzk(zzdp.zza(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused) {
                            u.q(attributeValue, "Failed parsing color value: ", "TtmlParser");
                            break;
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzani zze2 = zze(zzaniVar2);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float f5 = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(1);
                                if (group2 == null) {
                                    throw null;
                                    break;
                                } else {
                                    f5 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group2)));
                                }
                            } catch (NumberFormatException e4) {
                                zzee.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e4);
                            }
                        } else {
                            u.q(attributeValue, "Invalid value for shear: ", "TtmlParser");
                        }
                        zze2.zzp(f5);
                        zzaniVar2 = zze2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String zza4 = zzgql.zza(attributeValue);
                        int hashCode = zza4.hashCode();
                        if (hashCode == 96673) {
                            if (zza4.equals("all")) {
                                zzaniVar2 = zze(zzaniVar2);
                                zzaniVar2.zzD(true);
                                break;
                            }
                        } else if (hashCode == 3387192 && zza4.equals(PluginMethod.RETURN_NONE)) {
                            zzaniVar2 = zze(zzaniVar2);
                            zzaniVar2.zzD(false);
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            zzaniVar2 = zze(zzaniVar2);
                            String str = zzfj.zza;
                            String[] split = attributeValue.split("\\s+", -1);
                            int length = split.length;
                            if (length == 1) {
                                matcher = zze.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb.append("Invalid number of entries for fontSize: ");
                                    sb.append(length);
                                    sb.append(".");
                                    throw new zzamb(sb.toString());
                                }
                                matcher = zze.matcher(split[1]);
                                zzee.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                                sb2.append("Invalid expression for fontSize: '");
                                sb2.append(attributeValue);
                                sb2.append("'.");
                                throw new zzamb(sb2.toString());
                            }
                            String group3 = matcher.group(3);
                            if (group3 == null) {
                                throw null;
                            }
                            int hashCode2 = group3.hashCode();
                            if (hashCode2 != 37) {
                                if (hashCode2 != 3240) {
                                    if (hashCode2 == 3592 && group3.equals("px")) {
                                        zzaniVar2.zzH(1);
                                        group = matcher.group(1);
                                        if (group == null) {
                                            throw null;
                                        }
                                        zzaniVar2.zzG(Float.parseFloat(group));
                                        break;
                                    }
                                    StringBuilder sb3 = new StringBuilder(group3.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(group3);
                                    sb3.append("'.");
                                    throw new zzamb(sb3.toString());
                                }
                                if (!group3.equals("em")) {
                                    StringBuilder sb32 = new StringBuilder(group3.length() + 30);
                                    sb32.append("Invalid unit for fontSize: '");
                                    sb32.append(group3);
                                    sb32.append("'.");
                                    throw new zzamb(sb32.toString());
                                }
                                zzaniVar2.zzH(2);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            } else {
                                if (!group3.equals("%")) {
                                    StringBuilder sb322 = new StringBuilder(group3.length() + 30);
                                    sb322.append("Invalid unit for fontSize: '");
                                    sb322.append(group3);
                                    sb322.append("'.");
                                    throw new zzamb(sb322.toString());
                                }
                                zzaniVar2.zzH(3);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            }
                        } catch (zzamb unused2) {
                            u.q(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                            break;
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzF(zzanb.zza(attributeValue));
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String zza5 = zzgql.zza(attributeValue);
                        int hashCode3 = zza5.hashCode();
                        if (hashCode3 != -1392885889) {
                            if (hashCode3 == 92734940 && zza5.equals("after")) {
                                zzaniVar2 = zze(zzaniVar2);
                                zzaniVar2.zzw(2);
                                break;
                            }
                        } else if (zza5.equals("before")) {
                            zzaniVar2 = zze(zzaniVar2);
                            zzaniVar2.zzw(1);
                            break;
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        zzaniVar2 = zze(zzaniVar2);
                        try {
                            zzaniVar2.zzn(zzdp.zza(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused3) {
                            u.q(attributeValue, "Failed parsing background value: ", "TtmlParser");
                            break;
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzB(zzf(attributeValue));
                        break;
                    }
                    break;
            }
        }
        return zzaniVar2;
    }

    private static zzani zze(zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    private static Layout.Alignment zzf(String str) {
        String zza2 = zzgql.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!zza2.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!zza2.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!zza2.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!zza2.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long zzg(String str, zzand zzandVar) {
        double d5;
        double d6;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d7 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d8 = d7 + parseLong3;
            return (long) ((d8 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r12) / zzandVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / zzandVar.zzb) / zzandVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzamb("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                d5 = zzandVar.zza;
                parseDouble2 /= d5;
            }
            return (long) (parseDouble2 * 1000000.0d);
        }
        if (hashCode != 104) {
            if (hashCode != 109) {
                if (hashCode != 3494) {
                    if (hashCode == 115) {
                        group6.equals("s");
                    } else if (hashCode == 116 && group6.equals("t")) {
                        d5 = zzandVar.zzc;
                        parseDouble2 /= d5;
                    }
                } else if (group6.equals("ms")) {
                    d5 = 1000.0d;
                    parseDouble2 /= d5;
                }
            } else if (group6.equals("m")) {
                d6 = 60.0d;
                parseDouble2 *= d6;
            }
        } else if (group6.equals("h")) {
            d6 = 3600.0d;
            parseDouble2 *= d6;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i5, i6), zzameVar, zzdrVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:242|(2:243|244)|(3:246|247|73)|290|291|(3:293|(4:295|(1:297)(1:321)|298|(1:300)(1:301))|322)(1:323)|302|(2:304|(1:306)(7:(2:308|(1:310))|311|312|313|314|315|(1:317)))|320|312|313|314|315|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:353|(1:(6:356|357|358|34|(2:326|(1:328)(4:329|330|331|(2:333|(1:335)(2:336|337))(2:338|339)))|36)(1:361))(1:363)|362|357|358|34|(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04ca, code lost:
    
        if (r0.equals("tblr") != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d5, code lost:
    
        r40 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04d3, code lost:
    
        if (r0.equals("tb") != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0687, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:247:0x0580. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ba A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0683 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, zzamb -> 0x0687, TRY_LEAVE, TryCatch #3 {zzamb -> 0x0687, blocks: (B:315:0x067e, B:317:0x0683), top: B:314:0x067e }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0174 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_ENTER, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, LOOP:1: B:76:0x0271->B:91:0x0543, LOOP_START, PHI: r1 r3 r7 r8 r13 r14 r15
      0x0271: PHI (r1v18 java.lang.String) = (r1v9 java.lang.String), (r1v53 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r3v27 java.lang.String) = (r3v1 java.lang.String), (r3v51 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v6 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v31 java.util.HashMap) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r8v14 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v22 java.util.HashMap) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r13v11 java.lang.String) = (r13v8 java.lang.String), (r13v29 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r14v24 java.lang.String) = (r14v10 java.lang.String), (r14v27 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v14 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE], TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #0, #1, #2, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0543 A[LOOP:1: B:76:0x0271->B:91:0x0543, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x053d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.zzani, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzama zzb(byte[] bArr, int i5, int i6) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        zzand zzandVar;
        zzanj zzanjVar;
        int i7;
        ArrayDeque arrayDeque2;
        zzand zzandVar2;
        int attributeCount;
        zzani zzd2;
        int i8;
        String str4;
        long j2;
        long j5;
        long j6;
        String[] strArr;
        String str5;
        zzanc zzancVar;
        zzanc zzancVar2;
        long j7;
        long j8;
        Object obj;
        String str6;
        String str7;
        String str8;
        String zzc2;
        String str9;
        String str10;
        String str11;
        HashMap hashMap2;
        String str12;
        float f5;
        float f6;
        zzang zzangVar;
        String zzc3;
        float f7;
        float f8;
        String zzc4;
        int i9;
        float f9;
        String zzc5;
        int i10;
        String zzc6;
        zzani zzaniVar;
        zzani zzaniVar2;
        String str13;
        float f10;
        String group;
        String group2;
        boolean z4;
        String zzc7;
        String str14 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str15 = "http://www.w3.org/ns/ttml#parameter";
        String str16 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new zzang(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i5, i6), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzand zzandVar3 = zzh;
            zzanj zzanjVar2 = null;
            zzane zzaneVar = null;
            zzand zzandVar4 = zzandVar3;
            int i11 = 0;
            int i12 = 15;
            while (eventType != 1) {
                zzanc zzancVar3 = (zzanc) arrayDeque3.peek();
                ?? r47 = obj2;
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    str = str14;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str15, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            zzanjVar = zzanjVar2;
                            String attributeValue2 = newPullParser.getAttributeValue(str15, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                i7 = i11;
                                String str17 = zzfj.zza;
                                arrayDeque2 = arrayDeque3;
                                zzgrc.zzb(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f10 = Integer.parseInt(r10[0]) / Integer.parseInt(r10[1]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i7 = i11;
                                f10 = 1.0f;
                            }
                            int i13 = zzandVar3.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str15, "subFrameRate");
                            if (attributeValue3 != null) {
                                i13 = Integer.parseInt(attributeValue3);
                            }
                            int i14 = zzandVar3.zzc;
                            zzandVar = zzandVar3;
                            String attributeValue4 = newPullParser.getAttributeValue(str15, "tickRate");
                            if (attributeValue4 != null) {
                                i14 = Integer.parseInt(attributeValue4);
                            }
                            zzand zzandVar5 = new zzand(parseInt * f10, i13, i14);
                            String attributeValue5 = newPullParser.getAttributeValue(str15, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str15;
                                    }
                                    if (group == null) {
                                        throw r47;
                                    }
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str15;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzandVar4 = zzandVar5;
                                        zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i12 = 15;
                                        zzc7 = zzfq.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                        }
                                        zzaneVar = r47;
                                        zzane zzaneVar2 = zzaneVar;
                                        int i15 = i12;
                                        String str18 = "image";
                                        String str19 = "metadata";
                                        String str20 = "region";
                                        String str21 = "head";
                                        zzandVar4 = zzandVar4;
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzandVar4 = zzandVar2;
                                        zzaneVar = zzaneVar2;
                                        i12 = i15;
                                        zzanjVar2 = zzanjVar;
                                        i11 = i7;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        str14 = str;
                                        zzandVar3 = zzandVar;
                                        str15 = str2;
                                        str16 = str3;
                                        obj2 = null;
                                    }
                                    if (group2 == null) {
                                        throw r47;
                                    }
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        z4 = false;
                                    } else if (parseInt3 != 0) {
                                        zzandVar4 = zzandVar5;
                                        z4 = true;
                                        zzgrc.zzg(z4, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                        i12 = parseInt3;
                                        zzc7 = zzfq.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                            Matcher matcher2 = zzf.matcher(zzc7);
                                            if (matcher2.matches()) {
                                                try {
                                                    String group3 = matcher2.group(1);
                                                    if (group3 == null) {
                                                        throw r47;
                                                    }
                                                    int parseInt4 = Integer.parseInt(group3);
                                                    String group4 = matcher2.group(2);
                                                    if (group4 == null) {
                                                        throw r47;
                                                    }
                                                    zzaneVar = new zzane(parseInt4, Integer.parseInt(group4));
                                                } catch (NumberFormatException unused3) {
                                                    zzee.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc7));
                                                }
                                            } else {
                                                zzee.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc7));
                                            }
                                        }
                                        zzaneVar = r47;
                                    } else {
                                        parseInt3 = 0;
                                        z4 = false;
                                    }
                                    zzandVar4 = zzandVar5;
                                    zzgrc.zzg(z4, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                    i12 = parseInt3;
                                    zzc7 = zzfq.zzc(newPullParser, "extent");
                                    if (zzc7 != null) {
                                    }
                                    zzaneVar = r47;
                                } else {
                                    zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str15;
                            zzandVar4 = zzandVar5;
                            i12 = 15;
                            zzc7 = zzfq.zzc(newPullParser, "extent");
                            if (zzc7 != null) {
                            }
                            zzaneVar = r47;
                        } else {
                            str2 = str15;
                            arrayDeque2 = arrayDeque3;
                            zzandVar = zzandVar3;
                            zzanjVar = zzanjVar2;
                            i7 = i11;
                        }
                        zzane zzaneVar22 = zzaneVar;
                        int i152 = i12;
                        String str182 = "image";
                        String str192 = "metadata";
                        String str202 = "region";
                        String str212 = "head";
                        zzandVar4 = zzandVar4;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            String name2 = newPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str16);
                            sb.append(name2);
                            zzee.zzb("TtmlParser", sb.toString());
                            str3 = str16;
                            hashMap = hashMap5;
                            zzaneVar = zzaneVar22;
                            i12 = i152;
                            zzanjVar2 = zzanjVar;
                            arrayDeque = arrayDeque2;
                            i11 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            hashMap5 = hashMap;
                            str14 = str;
                            zzandVar3 = zzandVar;
                            str15 = str2;
                            str16 = str3;
                            obj2 = null;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzfq.zzb(newPullParser, "style")) {
                                    String zzc8 = zzfq.zzc(newPullParser, "style");
                                    zzani zzd3 = zzd(newPullParser, new zzani());
                                    if (zzc8 != null) {
                                        String[] zzc9 = zzc(zzc8);
                                        str3 = str16;
                                        str6 = str212;
                                        int i16 = 0;
                                        for (int length = zzc9.length; i16 < length; length = length) {
                                            zzd3.zzr((zzani) hashMap3.get(zzc9[i16]));
                                            i16++;
                                        }
                                    } else {
                                        str3 = str16;
                                        str6 = str212;
                                    }
                                    String zzt = zzd3.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd3);
                                    }
                                    hashMap = hashMap5;
                                    str7 = str192;
                                    str8 = str202;
                                } else {
                                    str3 = str16;
                                    str6 = str212;
                                    if (zzfq.zzb(newPullParser, str202)) {
                                        str8 = str202;
                                        HashMap hashMap6 = hashMap5;
                                        String zzc10 = zzfq.zzc(newPullParser, "id");
                                        if (zzc10 == null) {
                                            zzangVar = r47;
                                            str11 = str182;
                                            hashMap2 = hashMap4;
                                            str12 = str192;
                                        } else {
                                            String zzc11 = zzfq.zzc(newPullParser, "origin");
                                            if (zzc11 == null) {
                                                str9 = zzc11;
                                                String zzc12 = zzfq.zzc(newPullParser, "style");
                                                if (zzc12 != null && (zzaniVar2 = (zzani) hashMap3.get(zzc12)) != null) {
                                                    str10 = zzaniVar2.zzL();
                                                    if (str10 == null) {
                                                        str11 = str182;
                                                        Matcher matcher3 = zzb.matcher(str10);
                                                        str12 = str192;
                                                        Matcher matcher4 = zzf.matcher(str10);
                                                        if (matcher3.matches()) {
                                                            hashMap2 = hashMap4;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r47;
                                                                }
                                                                float parseFloat = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r47;
                                                                }
                                                                f5 = Float.parseFloat(group6) / 100.0f;
                                                                f6 = parseFloat;
                                                            } catch (NumberFormatException unused4) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                            }
                                                        } else {
                                                            hashMap2 = hashMap4;
                                                            if (!matcher4.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str10));
                                                            } else if (zzaneVar22 == null) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str10));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r47;
                                                                    }
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r47;
                                                                    }
                                                                    f5 = Integer.parseInt(group8) / zzaneVar22.zzb;
                                                                    f6 = parseInt5 / zzaneVar22.zza;
                                                                } catch (NumberFormatException unused5) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                                }
                                                            }
                                                            zzangVar = r47;
                                                        }
                                                    } else {
                                                        str11 = str182;
                                                        hashMap2 = hashMap4;
                                                        str12 = str192;
                                                        f5 = 0.0f;
                                                        f6 = 0.0f;
                                                    }
                                                    zzc3 = zzfq.zzc(newPullParser, "extent");
                                                    if (zzc3 == null && (zzc6 = zzfq.zzc(newPullParser, "style")) != null && (zzaniVar = (zzani) hashMap3.get(zzc6)) != null) {
                                                        zzc3 = zzaniVar.zzN();
                                                    }
                                                    if (zzc3 == null) {
                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw r47;
                                                                }
                                                                float parseFloat2 = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw r47;
                                                                }
                                                                f7 = parseFloat2;
                                                                f8 = Float.parseFloat(group10) / 100.0f;
                                                            } catch (NumberFormatException unused6) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str10)));
                                                            } else if (zzaneVar22 == null) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str10)));
                                                            } else {
                                                                try {
                                                                    String group11 = matcher6.group(1);
                                                                    if (group11 == null) {
                                                                        throw r47;
                                                                    }
                                                                    int parseInt6 = Integer.parseInt(group11);
                                                                    String group12 = matcher6.group(2);
                                                                    if (group12 == null) {
                                                                        throw r47;
                                                                    }
                                                                    f8 = Integer.parseInt(group12) / zzaneVar22.zzb;
                                                                    f7 = parseInt6 / zzaneVar22.zza;
                                                                } catch (NumberFormatException unused7) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                }
                                                            }
                                                            zzangVar = r47;
                                                        }
                                                    } else {
                                                        f7 = 1.0f;
                                                        f8 = 1.0f;
                                                    }
                                                    zzc4 = zzfq.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 != null) {
                                                        String zza2 = zzgql.zza(zzc4);
                                                        int hashCode = zza2.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                f9 = f5 + f8;
                                                                i9 = 2;
                                                                float f11 = 1.0f / i152;
                                                                zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                    String zza3 = zzgql.zza(zzc5);
                                                                    int hashCode2 = zza3.hashCode();
                                                                    if (hashCode2 != 3694) {
                                                                        if (hashCode2 != 3553396) {
                                                                            if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                                i10 = 1;
                                                                            }
                                                                        }
                                                                    }
                                                                    zzangVar = new zzang(zzc10, f6, f9, 0, i9, f7, f8, 1, f11, i10);
                                                                }
                                                                i10 = Integer.MIN_VALUE;
                                                                zzangVar = new zzang(zzc10, f6, f9, 0, i9, f7, f8, 1, f11, i10);
                                                            }
                                                        } else if (zza2.equals("center")) {
                                                            f9 = f5 + (f8 / 2.0f);
                                                            i9 = 1;
                                                            float f112 = 1.0f / i152;
                                                            zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i10 = Integer.MIN_VALUE;
                                                            zzangVar = new zzang(zzc10, f6, f9, 0, i9, f7, f8, 1, f112, i10);
                                                        }
                                                    }
                                                    i9 = 0;
                                                    f9 = f5;
                                                    float f1122 = 1.0f / i152;
                                                    zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i10 = Integer.MIN_VALUE;
                                                    zzangVar = new zzang(zzc10, f6, f9, 0, i9, f7, f8, 1, f1122, i10);
                                                }
                                            } else {
                                                str9 = zzc11;
                                            }
                                            str10 = str9;
                                            if (str10 == null) {
                                            }
                                            zzc3 = zzfq.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                                zzc3 = zzaniVar.zzN();
                                            }
                                            if (zzc3 == null) {
                                            }
                                            zzc4 = zzfq.zzc(newPullParser, "displayAlign");
                                            if (zzc4 != null) {
                                            }
                                            i9 = 0;
                                            f9 = f5;
                                            float f11222 = 1.0f / i152;
                                            zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i10 = Integer.MIN_VALUE;
                                            zzangVar = new zzang(zzc10, f6, f9, 0, i9, f7, f8, 1, f11222, i10);
                                        }
                                        if (zzangVar != null) {
                                            hashMap4 = hashMap2;
                                            hashMap4.put(zzangVar.zza, zzangVar);
                                        } else {
                                            hashMap4 = hashMap2;
                                        }
                                        str13 = str6;
                                        hashMap = hashMap6;
                                        str182 = str11;
                                        str7 = str12;
                                        if (zzfq.zza(newPullParser, str13)) {
                                            str192 = str7;
                                            hashMap5 = hashMap;
                                            str202 = str8;
                                            str212 = str13;
                                            str16 = str3;
                                        } else {
                                            zzandVar2 = zzandVar4;
                                            arrayDeque = arrayDeque2;
                                        }
                                    } else {
                                        String str22 = str182;
                                        HashMap hashMap7 = hashMap5;
                                        str7 = str192;
                                        str8 = str202;
                                        if (zzfq.zzb(newPullParser, str7)) {
                                            while (true) {
                                                newPullParser.next();
                                                str182 = str22;
                                                if (!zzfq.zzb(newPullParser, str182) || (zzc2 = zzfq.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap7;
                                                } else {
                                                    hashMap = hashMap7;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzfq.zza(newPullParser, str7)) {
                                                    str22 = str182;
                                                    hashMap7 = hashMap;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap7;
                                            str182 = str22;
                                        }
                                    }
                                }
                                str13 = str6;
                                if (zzfq.zza(newPullParser, str13)) {
                                }
                            }
                        } else {
                            str3 = str16;
                            hashMap = hashMap5;
                            Object obj3 = "region";
                            try {
                                attributeCount = newPullParser.getAttributeCount();
                                zzd2 = zzd(newPullParser, r47);
                                i8 = 0;
                                str4 = str;
                                j2 = -9223372036854775807L;
                                j5 = -9223372036854775807L;
                                j6 = -9223372036854775807L;
                                strArr = null;
                                str5 = null;
                            } catch (zzamb e4) {
                                e = e4;
                            }
                            while (i8 < attributeCount) {
                                String attributeName = newPullParser.getAttributeName(i8);
                                String attributeValue6 = newPullParser.getAttributeValue(i8);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        zzandVar2 = zzandVar4;
                                        obj = obj3;
                                        if (attributeName.equals(obj) && hashMap4.containsKey(attributeValue6)) {
                                            str4 = attributeValue6;
                                        }
                                        try {
                                            i8++;
                                            obj3 = obj;
                                            zzandVar4 = zzandVar2;
                                        } catch (zzamb e5) {
                                            e = e5;
                                            arrayDeque = arrayDeque2;
                                            zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                            zzandVar4 = zzandVar2;
                                            zzaneVar = zzaneVar22;
                                            i12 = i152;
                                            zzanjVar2 = zzanjVar;
                                            i11 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str14 = str;
                                            zzandVar3 = zzandVar;
                                            str15 = str2;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                        break;
                                    case 99841:
                                        zzandVar2 = zzandVar4;
                                        if (attributeName.equals("dur")) {
                                            j6 = zzg(attributeValue6, zzandVar2);
                                        }
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                    case 100571:
                                        zzandVar2 = zzandVar4;
                                        if (attributeName.equals("end")) {
                                            j2 = zzg(attributeValue6, zzandVar2);
                                        }
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                    case 93616297:
                                        if (attributeName.equals("begin")) {
                                            zzandVar2 = zzandVar4;
                                            j5 = zzg(attributeValue6, zzandVar2);
                                            obj = obj3;
                                            i8++;
                                            obj3 = obj;
                                            zzandVar4 = zzandVar2;
                                        }
                                        zzandVar2 = zzandVar4;
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                    case 109780401:
                                        if (attributeName.equals("style")) {
                                            String[] zzc13 = zzc(attributeValue6);
                                            if (zzc13.length > 0) {
                                                strArr = zzc13;
                                            }
                                        }
                                        zzandVar2 = zzandVar4;
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                    case 1292595405:
                                        if (attributeName.equals("backgroundImage")) {
                                            try {
                                                if (attributeValue6.startsWith("#")) {
                                                    str5 = attributeValue6.substring(1);
                                                }
                                            } catch (zzamb e6) {
                                                e = e6;
                                                zzandVar2 = zzandVar4;
                                                arrayDeque = arrayDeque2;
                                                zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                zzandVar4 = zzandVar2;
                                                zzaneVar = zzaneVar22;
                                                i12 = i152;
                                                zzanjVar2 = zzanjVar;
                                                i11 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap5 = hashMap;
                                                str14 = str;
                                                zzandVar3 = zzandVar;
                                                str15 = str2;
                                                str16 = str3;
                                                obj2 = null;
                                            }
                                        }
                                        zzandVar2 = zzandVar4;
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                    default:
                                        zzandVar2 = zzandVar4;
                                        obj = obj3;
                                        i8++;
                                        obj3 = obj;
                                        zzandVar4 = zzandVar2;
                                }
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                arrayDeque3 = arrayDeque;
                                hashMap5 = hashMap;
                                str14 = str;
                                zzandVar3 = zzandVar;
                                str15 = str2;
                                str16 = str3;
                                obj2 = null;
                            }
                            zzandVar2 = zzandVar4;
                            if (zzancVar3 != null) {
                                zzancVar = zzancVar3;
                                long j9 = zzancVar.zzd;
                                if (j9 != -9223372036854775807L) {
                                    j5 = j5 != -9223372036854775807L ? j5 + j9 : -9223372036854775807L;
                                    if (j2 != -9223372036854775807L) {
                                        j2 += j9;
                                    } else {
                                        zzancVar2 = zzancVar;
                                        j2 = -9223372036854775807L;
                                    }
                                }
                                zzancVar2 = zzancVar;
                            } else {
                                zzancVar = zzancVar3;
                                zzancVar2 = null;
                            }
                            if (j2 == -9223372036854775807L) {
                                if (j6 != -9223372036854775807L) {
                                    j2 = j5 + j6;
                                } else {
                                    if (zzancVar2 != null) {
                                        j2 = zzancVar2.zze;
                                        if (j2 != -9223372036854775807L) {
                                        }
                                    }
                                    j8 = j5;
                                    j7 = -9223372036854775807L;
                                    zzanc zzb2 = zzanc.zzb(newPullParser.getName(), j8, j7, zzd2, strArr, str4, str5, zzancVar2);
                                    arrayDeque = arrayDeque2;
                                    arrayDeque.push(zzb2);
                                    if (zzancVar != null) {
                                        zzancVar.zzd(zzb2);
                                    }
                                }
                            }
                            j7 = j2;
                            j8 = j5;
                            zzanc zzb22 = zzanc.zzb(newPullParser.getName(), j8, j7, zzd2, strArr, str4, str5, zzancVar2);
                            arrayDeque = arrayDeque2;
                            arrayDeque.push(zzb22);
                            if (zzancVar != null) {
                            }
                        }
                        zzandVar4 = zzandVar2;
                        zzaneVar = zzaneVar22;
                        i12 = i152;
                    } else {
                        str2 = str15;
                        str3 = str16;
                        arrayDeque = arrayDeque3;
                        zzandVar = zzandVar3;
                        zzanjVar = zzanjVar2;
                        i7 = i11;
                        hashMap = hashMap5;
                        if (eventType == 4) {
                            if (zzancVar3 == null) {
                                throw null;
                            }
                            zzancVar3.zzd(zzanc.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzanc zzancVar4 = (zzanc) arrayDeque.peek();
                                if (zzancVar4 == null) {
                                    throw null;
                                }
                                zzanjVar2 = new zzanj(zzancVar4, hashMap3, hashMap4, hashMap);
                            } else {
                                zzanjVar2 = zzanjVar;
                            }
                            arrayDeque.pop();
                        }
                    }
                    zzanjVar2 = zzanjVar;
                } else {
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    hashMap = hashMap5;
                    arrayDeque = arrayDeque3;
                    zzandVar = zzandVar3;
                    zzanjVar = zzanjVar2;
                    i7 = i11;
                    if (eventType == 2) {
                        i11 = i7 + 1;
                    } else {
                        if (eventType == 3) {
                            i11 = i7 - 1;
                        }
                        zzanjVar2 = zzanjVar;
                    }
                    zzanjVar2 = zzanjVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap5 = hashMap;
                    str14 = str;
                    zzandVar3 = zzandVar;
                    str15 = str2;
                    str16 = str3;
                    obj2 = null;
                }
                i11 = i7;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap5 = hashMap;
                str14 = str;
                zzandVar3 = zzandVar;
                str15 = str2;
                str16 = str3;
                obj2 = null;
            }
            zzanj zzanjVar3 = zzanjVar2;
            if (zzanjVar3 != null) {
                return zzanjVar3;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }
}
