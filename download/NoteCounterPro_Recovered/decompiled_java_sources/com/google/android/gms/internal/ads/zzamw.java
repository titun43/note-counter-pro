package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzamw {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzamw(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = i12;
        this.zzi = i13;
        this.zzj = i14;
        this.zzk = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzamw zza(String str) {
        String[] split = TextUtils.split(str.substring(7), ",");
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = split.length;
            if (i5 >= length) {
                if (i6 != -1) {
                    return new zzamw(i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, length);
                }
                return null;
            }
            String zza = zzgql.zza(split[i5].trim());
            switch (zza.hashCode()) {
                case -1178781136:
                    if (!zza.equals("italic")) {
                        break;
                    } else {
                        i12 = i5;
                        break;
                    }
                case -1026963764:
                    if (!zza.equals("underline")) {
                        break;
                    } else {
                        i13 = i5;
                        break;
                    }
                case -192095652:
                    if (!zza.equals("strikeout")) {
                        break;
                    } else {
                        i14 = i5;
                        break;
                    }
                case -70925746:
                    if (!zza.equals("primarycolour")) {
                        break;
                    } else {
                        i8 = i5;
                        break;
                    }
                case 3029637:
                    if (!zza.equals("bold")) {
                        break;
                    } else {
                        i11 = i5;
                        break;
                    }
                case 3373707:
                    if (!zza.equals("name")) {
                        break;
                    } else {
                        i6 = i5;
                        break;
                    }
                case 366554320:
                    if (!zza.equals("fontsize")) {
                        break;
                    } else {
                        i10 = i5;
                        break;
                    }
                case 767321349:
                    if (!zza.equals("borderstyle")) {
                        break;
                    } else {
                        i15 = i5;
                        break;
                    }
                case 1767875043:
                    if (!zza.equals("alignment")) {
                        break;
                    } else {
                        i7 = i5;
                        break;
                    }
                case 1988365454:
                    if (!zza.equals("outlinecolour")) {
                        break;
                    } else {
                        i9 = i5;
                        break;
                    }
            }
            i5++;
        }
    }
}
