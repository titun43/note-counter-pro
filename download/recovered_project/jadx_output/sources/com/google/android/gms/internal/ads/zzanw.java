package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzanw {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    public static zzanq zza(zzer zzerVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String zzN = zzerVar.zzN(charset);
        if (zzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String zzN2 = zzerVar.zzN(charset);
            if (zzN2 != null) {
                Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    public static zzcw zzb(String str) {
        zzanv zzanvVar = new zzanv();
        zze(str, zzanvVar);
        return zzanvVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString zzc(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < str2.length()) {
            int i6 = i5 + 1;
            char charAt = str2.charAt(i5);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i6);
                int indexOf2 = str2.indexOf(32, i6);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i6, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            spannableStringBuilder.append('>');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                        }
                        StringBuilder sb = new StringBuilder(substring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(substring);
                        sb.append(";'");
                        zzee.zzc("WebvttCueParser", sb.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            spannableStringBuilder.append('<');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                        }
                        StringBuilder sb2 = new StringBuilder(substring.length() + 33);
                        sb2.append("ignoring unsupported entity: '&");
                        sb2.append(substring);
                        sb2.append(";'");
                        zzee.zzc("WebvttCueParser", sb2.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            spannableStringBuilder.append(' ');
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i5 = indexOf + 1;
                        }
                        StringBuilder sb22 = new StringBuilder(substring.length() + 33);
                        sb22.append("ignoring unsupported entity: '&");
                        sb22.append(substring);
                        sb22.append(";'");
                        zzee.zzc("WebvttCueParser", sb22.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                    } else {
                        if (substring.equals("amp")) {
                            spannableStringBuilder.append('&');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                        }
                        StringBuilder sb222 = new StringBuilder(substring.length() + 33);
                        sb222.append("ignoring unsupported entity: '&");
                        sb222.append(substring);
                        sb222.append(";'");
                        zzee.zzc("WebvttCueParser", sb222.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i6 < str2.length()) {
                char charAt2 = str2.charAt(i6);
                int indexOf3 = str2.indexOf(62, i6);
                i6 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i7 = i6 - 2;
                boolean z4 = str2.charAt(i7) == '/';
                int i8 = i5 + (charAt2 == '/' ? 2 : 1);
                if (!z4) {
                    i7 = i6 - 1;
                }
                String substring2 = str2.substring(i8, i7);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    zzgrc.zza(true ^ trim.isEmpty());
                    String str3 = zzfj.zza;
                    String str4 = trim.split("[ \\.]", 2)[0];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98 ? str4.equals("b") : !(hashCode2 == 99 ? !str4.equals("c") : hashCode2 == 105 ? !str4.equals("i") : hashCode2 == 3650 ? !str4.equals("rt") : hashCode2 == 3314158 ? !str4.equals("lang") : hashCode2 == 3511770 ? !str4.equals("ruby") : hashCode2 == 117 ? !str4.equals(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM) : hashCode2 != 118 || !str4.equals("v"))) {
                        if (charAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzant zzantVar = (zzant) arrayDeque.pop();
                                zzf(str, zzantVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzans(zzantVar, spannableStringBuilder.length(), null));
                                }
                                if (zzantVar.zza.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z4) {
                            arrayDeque.push(zzant.zza(substring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i5 = i6;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzant) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzant.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzanq zzd(String str, Matcher matcher, zzer zzerVar, List list) {
        zzanv zzanvVar = new zzanv();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            zzanvVar.zza = zzany.zza(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            zzanvVar.zzb = zzany.zza(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzanvVar);
            StringBuilder sb = new StringBuilder();
            String zzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzN.trim());
                zzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanvVar.zzc = zzc(str, sb.toString(), list);
            return new zzanq(zzanvVar.zza().zzr(), zzanvVar.zza, zzanvVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0076, code lost:
    
        if (r8.equals("middle") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x007d, code lost:
    
        if (r8.equals("center") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0185, code lost:
    
        if (r9.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018e, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018c, code lost:
    
        if (r9.equals("center") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r9.equals("start") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r9.equals("end") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.equals("middle") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r9.equals("line-right") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r9.equals("center") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r9.equals("line-left") != false) goto L78;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zze(String str, zzanv zzanvVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    i8 = 2;
                                    break;
                                }
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i8 = Integer.MIN_VALUE;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    i8 = 0;
                                    break;
                                }
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i8 = Integer.MIN_VALUE;
                                break;
                            default:
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i8 = Integer.MIN_VALUE;
                                break;
                        }
                        zzanvVar.zzg = i8;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzanvVar.zze = zzany.zzb(group2);
                        zzanvVar.zzf = 0;
                    } else {
                        zzanvVar.zze = Integer.parseInt(group2);
                        zzanvVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            break;
                        case -1074341483:
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                i5 = 3;
                                break;
                            }
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i5 = 2;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                i5 = 4;
                                break;
                            }
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i5 = 2;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                i5 = 5;
                                break;
                            }
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i5 = 2;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                i5 = 1;
                                break;
                            }
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i5 = 2;
                            break;
                        default:
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i5 = 2;
                            break;
                    }
                    zzanvVar.zzd = i5;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                break;
                            case -1364013995:
                                break;
                            case -1276788989:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                break;
                            case 109757538:
                                break;
                            default:
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i7 = Integer.MIN_VALUE;
                                break;
                        }
                        zzanvVar.zzi = i7;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzanvVar.zzh = zzany.zzb(group2);
                } else if ("size".equals(group)) {
                    zzanvVar.zzj = zzany.zzb(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            i6 = 1;
                        }
                        zzee.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i6 = Integer.MIN_VALUE;
                    } else {
                        if (group2.equals("lr")) {
                            i6 = 2;
                        }
                        zzee.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i6 = Integer.MIN_VALUE;
                    }
                    zzanvVar.zzk = i6;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    zzee.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzee.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static void zzf(String str, zzant zzantVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        Comparator comparator;
        int i5 = zzantVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzantVar.zza;
        int hashCode = str2.hashCode();
        int i6 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int zzg = zzg(list2, str, zzantVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        comparator = zzans.zza;
                        Collections.sort(arrayList, comparator);
                        int i7 = i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < arrayList.size()) {
                            if ("rt".equals(((zzans) arrayList.get(i8)).zzc().zza)) {
                                zzans zzansVar = (zzans) arrayList.get(i8);
                                int zzg2 = zzg(list2, str, zzansVar.zzc());
                                if (zzg2 == i6) {
                                    zzg2 = zzg != i6 ? zzg : 1;
                                }
                                int i10 = zzansVar.zzc().zzb - i9;
                                int zzd2 = zzansVar.zzd() - i9;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i10, zzd2);
                                spannableStringBuilder.delete(i10, zzd2);
                                spannableStringBuilder.setSpan(new zzdc(subSequence.toString(), zzg2), i7, i10, 33);
                                i9 += subSequence.length();
                                i7 = i10;
                            }
                            i8++;
                            i6 = -1;
                        }
                    } else if (hashCode != 98) {
                        if (hashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzantVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i5, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i5, length, 33);
                                    }
                                }
                            }
                        } else if (hashCode != 117) {
                            if (hashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdf(zzantVar.zzc), i5, length, 33);
                            }
                        } else if (!str2.equals(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM)) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
            }
        } else if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            return;
        }
        List zzh = zzh(list2, str, zzantVar);
        for (int i11 = 0; i11 < zzh.size(); i11++) {
            zzanp zzanpVar = ((zzanu) zzh.get(i11)).zzb;
            if (zzanpVar != null) {
                if (zzanpVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzanpVar.zzf()), i5, length, 33);
                }
                if (zzanpVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                }
                if (zzanpVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzanpVar.zzm()), i5, length, 33);
                }
                if (zzanpVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzanpVar.zzp()), i5, length, 33);
                }
                if (zzanpVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzanpVar.zzk()), i5, length, 33);
                }
                int zzu = zzanpVar.zzu();
                if (zzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzanpVar.zzv(), true), i5, length, 33);
                } else if (zzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv()), i5, length, 33);
                } else if (zzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv() / 100.0f), i5, length, 33);
                }
                if (zzanpVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i5, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzant zzantVar) {
        List zzh = zzh(list, str, zzantVar);
        for (int i5 = 0; i5 < zzh.size(); i5++) {
            zzanp zzanpVar = ((zzanu) zzh.get(i5)).zzb;
            if (zzanpVar.zzx() != -1) {
                return zzanpVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzant zzantVar) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzanp zzanpVar = (zzanp) list.get(i5);
            int zze = zzanpVar.zze(str, zzantVar.zza, zzantVar.zzd, zzantVar.zzc);
            if (zze > 0) {
                arrayList.add(new zzanu(zze, zzanpVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
