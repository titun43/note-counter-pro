package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzafn {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = zzfj.zza;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzguf zze = zzapVar.zze(zzaih.class, zzafm.zza);
        int size = zze.size();
        int i5 = 0;
        while (i5 < size) {
            boolean zzc2 = zzc(((zzaih) zze.get(i5)).zzc);
            i5++;
            if (zzc2) {
                return true;
            }
        }
        zzguf zze2 = zzapVar.zze(zzaip.class, zzafl.zza);
        int size2 = zze2.size();
        int i6 = 0;
        while (i6 < size2) {
            boolean zzc3 = zzc(((zzaip) zze2.get(i6)).zzc);
            i6++;
            if (zzc3) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
