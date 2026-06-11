package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzamu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamu(int i5, int i6, int i7, int i8, int i9, int i10) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzamu zza(String str) {
        zzgrc.zza(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            int length = split.length;
            if (i5 >= length) {
                if (i7 == -1 || i8 == -1 || i10 == -1) {
                    return null;
                }
                return new zzamu(i6, i7, i8, i9, i10, length);
            }
            String zza = zzgql.zza(split[i5].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (!zza.equals("end")) {
                        break;
                    } else {
                        i8 = i5;
                        break;
                    }
                case 3556653:
                    if (!zza.equals("text")) {
                        break;
                    } else {
                        i10 = i5;
                        break;
                    }
                case 102749521:
                    if (!zza.equals("layer")) {
                        break;
                    } else {
                        i6 = i5;
                        break;
                    }
                case 109757538:
                    if (!zza.equals("start")) {
                        break;
                    } else {
                        i7 = i5;
                        break;
                    }
                case 109780401:
                    if (!zza.equals("style")) {
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
