package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z4 = true; zzerVar.zzd() > 0 && z4; z4 = false) {
                char c5 = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int zzg = zzerVar.zzg();
                    int zze = zzerVar.zze();
                    byte[] zzi = zzerVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i5 = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i6 = zzg + 2;
                            if (zzi[i5] == 42) {
                                while (true) {
                                    int i7 = i6 + 1;
                                    if (i7 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i6]) == '*' && ((char) zzi[i7]) == '/') {
                                        zze = i6 + 2;
                                        i6 = zze;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                zzerVar.zzk(zze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String zzc(zzer zzerVar, StringBuilder sb) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzerVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzerVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzer zzerVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        loop0: while (true) {
            for (boolean z4 = false; zzg < zze && !z4; z4 = true) {
                char c5 = (char) zzerVar.zzi()[zzg];
                if ((c5 >= 'A' && c5 <= 'Z') || ((c5 >= 'a' && c5 <= 'z') || ((c5 >= '0' && c5 <= '9') || c5 == '#' || c5 == '-' || c5 == '.' || c5 == '_'))) {
                    sb.append(c5);
                    zzg++;
                }
            }
        }
        zzerVar.zzk(zzg - zzerVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02fd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00aa, code lost:
    
        if (")".equals(zzc(r4, r1)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzer zzerVar) {
        String str;
        String sb;
        StringBuilder sb2 = this.zzd;
        int i5 = 0;
        sb2.setLength(0);
        int zzg = zzerVar.zzg();
        while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzer zzerVar2 = this.zzc;
        zzerVar2.zzb(zzerVar.zzi(), zzerVar.zzg());
        zzerVar2.zzh(zzg);
        ArrayList arrayList = new ArrayList();
        loop1: while (true) {
            zzb(zzerVar2);
            if (zzerVar2.zzd() >= 5 && "::cue".equals(zzerVar2.zzK(5, StandardCharsets.UTF_8))) {
                int zzg2 = zzerVar2.zzg();
                String zzc = zzc(zzerVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzerVar2.zzh(zzg2);
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzerVar2.zzg();
                        int zze = zzerVar2.zze();
                        int i6 = i5;
                        while (zzg3 < zze && i6 == 0) {
                            int i7 = zzg3 + 1;
                            i6 = ((char) zzerVar2.zzi()[zzg3]) == ')' ? 1 : i5;
                            zzg3 = i7;
                        }
                        str = zzerVar2.zzK((zzg3 - 1) - zzerVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzerVar2, sb2))) {
                        break;
                    }
                    zzanp zzanpVar = new zzanp();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzanpVar.zzd(group);
                            }
                            str = str.substring(i5, indexOf);
                        }
                        String str2 = zzfj.zza;
                        String[] split = str.split("\\.", -1);
                        String str3 = split[i5];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzanpVar.zzb(str3.substring(i5, indexOf2));
                            zzanpVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzanpVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzanpVar.zzc((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i8 = i5;
                    String str4 = null;
                    while (i8 == 0) {
                        int zzg4 = zzerVar2.zzg();
                        str4 = zzc(zzerVar2, sb2);
                        int i9 = (str4 == null || "}".equals(str4)) ? 1 : i5;
                        if (i9 == 0) {
                            zzerVar2.zzh(zzg4);
                            zzb(zzerVar2);
                            String zzd = zzd(zzerVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzerVar2, sb2))) {
                                zzb(zzerVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i10 = i5;
                                while (true) {
                                    if (i10 != 0) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzerVar2.zzg();
                                    String zzc2 = zzc(zzerVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzerVar2.zzh(zzg5);
                                        i10 = 1;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzerVar2.zzg();
                                    String zzc3 = zzc(zzerVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzerVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd)) {
                                        zzanpVar.zzn(zzdp.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzanpVar.zzq(zzdp.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzanpVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzanpVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzanpVar.zzy("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if ("underline".equals(sb)) {
                                            zzanpVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzanpVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if ("bold".equals(sb)) {
                                            zzanpVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if ("italic".equals(sb)) {
                                            zzanpVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        Matcher matcher2 = zzb.matcher(zzgql.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (!group2.equals("%")) {
                                                    break loop1;
                                                }
                                                zzanpVar.zzt(3);
                                                String group3 = matcher2.group(1);
                                                group3.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group3));
                                            } else if (hashCode == 3240) {
                                                if (!group2.equals("em")) {
                                                    break loop1;
                                                }
                                                zzanpVar.zzt(2);
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group32));
                                            } else {
                                                if (hashCode != 3592 || !group2.equals("px")) {
                                                    break loop1;
                                                }
                                                zzanpVar.zzt(1);
                                                String group322 = matcher2.group(1);
                                                group322.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group322));
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            zzee.zzc("WebvttCssParser", sb4.toString());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i8 = i9;
                        i5 = 0;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzanpVar);
                    }
                    i5 = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
        throw new IllegalStateException();
    }
}
