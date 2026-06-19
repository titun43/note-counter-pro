package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.getcapacitor.PluginMethod;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzanb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgup zze = zzgup.zzj("auto", PluginMethod.RETURN_NONE);
    private static final zzgup zzf = zzgup.zzk("dot", "sesame", "circle");
    private static final zzgup zzg = zzgup.zzj("filled", "open");
    private static final zzgup zzh = zzgup.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzanb(int i5, int i6, int i7) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
    }

    public static zzanb zza(String str) {
        int i5;
        if (str == null) {
            return null;
        }
        String zza = zzgql.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgup zzp = zzgup.zzp(TextUtils.split(zza, zzd));
        String str2 = (String) zzgut.zzb(zzgwp.zza(zzh, zzp), "outside");
        int hashCode = str2.hashCode();
        int i6 = 1;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                i5 = 2;
            }
            i5 = 1;
        } else {
            if (str2.equals("outside")) {
                i5 = -2;
            }
            i5 = 1;
        }
        zzgwo zza2 = zzgwp.zza(zze, zzp);
        int i7 = 0;
        if (zza2.isEmpty()) {
            zzgwo zza3 = zzgwp.zza(zzg, zzp);
            zzgwo zza4 = zzgwp.zza(zzf, zzp);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                String str3 = (String) zzgut.zzb(zza3, "filled");
                i7 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgut.zzb(zza4, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i6 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i6 = 3;
                }
            }
            i6 = -1;
        } else {
            String str5 = (String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(PluginMethod.RETURN_NONE)) {
                i6 = 0;
            }
            i6 = -1;
        }
        return new zzanb(i6, i7, i5);
    }
}
