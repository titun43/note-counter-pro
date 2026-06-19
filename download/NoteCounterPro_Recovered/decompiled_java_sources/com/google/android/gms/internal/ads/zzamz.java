package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzamz implements zzamf {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzer zze = new zzer();

    public static float zzb(int i5) {
        if (i5 == 0) {
            return 0.08f;
        }
        if (i5 == 1) {
            return 0.5f;
        }
        if (i5 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i5) {
        String group = matcher.group(i5 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i5 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i5 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i5 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        if (r4.equals("{\\an9}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015b, code lost:
    
        r3.zzg(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
    
        if (r4.equals("{\\an8}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if (r4.equals("{\\an7}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        if (r4.equals("{\\an3}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0175, code lost:
    
        r3.zzg(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016c, code lost:
    
        if (r4.equals("{\\an2}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        if (r4.equals("{\\an1}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
    
        if (r4.equals("{\\an9}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        r3.zzj(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010c, code lost:
    
        if (r4.equals("{\\an7}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        r3.zzj(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0116, code lost:
    
        if (r4.equals("{\\an6}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r4.equals("{\\an4}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        if (r4.equals("{\\an3}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        if (r4.equals("{\\an1}") != false) goto L46;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar;
        String str;
        zzcx zzr;
        zzamz zzamzVar = this;
        zzer zzerVar2 = zzamzVar.zze;
        zzerVar2.zzb(bArr, i5 + i6);
        zzerVar2.zzh(i5);
        Charset zzR = zzerVar2.zzR();
        if (zzR == null) {
            zzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzN = zzerVar2.zzN(zzR);
            if (zzN == null) {
                return;
            }
            if (zzN.isEmpty()) {
                zzerVar = zzerVar2;
            } else {
                try {
                    Integer.parseInt(zzN);
                    zzer zzerVar3 = zzamzVar.zze;
                    String zzN2 = zzerVar3.zzN(zzR);
                    if (zzN2 == null) {
                        zzee.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzN2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzamzVar.zzc;
                        int i7 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzamzVar.zzd;
                        arrayList.clear();
                        String zzN3 = zzerVar3.zzN(zzR);
                        while (!TextUtils.isEmpty(zzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = zzN3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i8 = i7;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i8;
                                int length = group.length();
                                sb2.replace(start, start + length, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                i8 += length;
                                zzerVar2 = zzerVar2;
                            }
                            sb.append(sb2.toString());
                            zzN3 = zzerVar3.zzN(zzR);
                            i7 = 0;
                        }
                        zzerVar = zzerVar2;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList.size()) {
                                str = (String) arrayList.get(i9);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i9++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(fromHtml);
                        if (str == null) {
                            zzr = zzcwVar.zzr();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620648:
                                    break;
                                case -685620617:
                                    break;
                                case -685620555:
                                    break;
                                case -685620524:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    zzcwVar.zzj(1);
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620679:
                                    break;
                                case -685620648:
                                    break;
                                case -685620524:
                                    break;
                                case -685620493:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    zzcwVar.zzg(1);
                                    break;
                            }
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzr = zzcwVar.zzr();
                        }
                        zzdrVar.zza(new zzalx(zzguf.zzj(zzr), zzc, zzc2 - zzc));
                    } else {
                        zzerVar = zzerVar2;
                        zzee.zzc("SubripParser", "Skipping invalid timing: ".concat(zzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzerVar = zzerVar2;
                    zzee.zzc("SubripParser", "Skipping invalid index: ".concat(zzN));
                }
            }
            zzamzVar = this;
            zzerVar2 = zzerVar;
        }
    }
}
