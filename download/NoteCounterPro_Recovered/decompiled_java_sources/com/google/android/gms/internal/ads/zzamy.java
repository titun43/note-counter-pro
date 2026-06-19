package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzamy {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i5, Integer num, Integer num2, float f5, boolean z4, boolean z5, boolean z6, boolean z7, int i6) {
        this.zza = str;
        this.zzb = i5;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f5;
        this.zzf = z4;
        this.zzg = z5;
        this.zzh = z6;
        this.zzi = z7;
        this.zzj = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124 A[Catch: RuntimeException -> 0x00c7, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00c7, blocks: (B:22:0x00cd, B:24:0x00d3, B:27:0x00e3, B:29:0x00e7, B:32:0x00f6, B:34:0x00fa, B:37:0x010b, B:39:0x010f, B:42:0x0120, B:44:0x0124, B:46:0x012c, B:52:0x014a, B:50:0x013d, B:71:0x00ae), top: B:70:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamy zza(String str, zzamw zzamwVar) {
        zzamy zzamyVar;
        float f5;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int parseInt;
        zzgrc.zza(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i8 = zzamwVar.zzk;
        if (length != i8) {
            String str2 = zzfj.zza;
            Locale locale = Locale.US;
            zzee.zzc("SsaStyle", "Skipping malformed 'Style:' line (expected " + i8 + " values, found " + length + "): '" + str + "'");
            return null;
        }
        try {
            String trim = split[zzamwVar.zza].trim();
            int i9 = zzamwVar.zzb;
            int zzd = i9 != -1 ? zzd(split[i9].trim()) : -1;
            int i10 = zzamwVar.zzc;
            Integer zzb = i10 != -1 ? zzb(split[i10].trim()) : null;
            int i11 = zzamwVar.zzd;
            Integer zzb2 = i11 != -1 ? zzb(split[i11].trim()) : null;
            int i12 = zzamwVar.zze;
            if (i12 != -1) {
                String trim2 = split[i12].trim();
                try {
                    f5 = Float.parseFloat(trim2);
                    zzamyVar = null;
                } catch (NumberFormatException e4) {
                    zzamyVar = null;
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(trim2);
                        sb.append("'");
                        zzee.zzd("SsaStyle", sb.toString(), e4);
                    } catch (RuntimeException e5) {
                        e = e5;
                        zzee.zzd("SsaStyle", h1.b(new StringBuilder(str.length() + 36), "Skipping malformed 'Style:' line: '", str, "'"), e);
                        return zzamyVar;
                    }
                }
                i5 = zzamwVar.zzf;
                boolean z5 = false;
                if (i5 == -1 && zze(split[i5].trim())) {
                    z4 = false;
                    z5 = true;
                } else {
                    z4 = false;
                }
                int i13 = zzamwVar.zzg;
                boolean z6 = (i13 == -1 && zze(split[i13].trim())) ? true : z4;
                int i14 = zzamwVar.zzh;
                boolean z7 = i14 == -1 && zze(split[i14].trim());
                int i15 = zzamwVar.zzi;
                boolean z8 = i15 == -1 && zze(split[i15].trim());
                i6 = zzamwVar.zzj;
                if (i6 != -1) {
                    String trim3 = split[i6].trim();
                    try {
                        parseInt = Integer.parseInt(trim3.trim());
                    } catch (NumberFormatException unused) {
                    }
                    if (parseInt == 1 || parseInt == 3) {
                        i7 = parseInt;
                        return new zzamy(trim, zzd, zzb, zzb2, f5, z5, z6, z7, z8, i7);
                    }
                    zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
                }
                i7 = -1;
                return new zzamy(trim, zzd, zzb, zzb2, f5, z5, z6, z7, z8, i7);
            }
            zzamyVar = null;
            f5 = -3.4028235E38f;
            i5 = zzamwVar.zzf;
            boolean z52 = false;
            if (i5 == -1) {
            }
            z4 = false;
            int i132 = zzamwVar.zzg;
            if (i132 == -1) {
            }
            int i142 = zzamwVar.zzh;
            if (i142 == -1) {
            }
            int i152 = zzamwVar.zzi;
            if (i152 == -1) {
            }
            i6 = zzamwVar.zzj;
            if (i6 != -1) {
            }
            i7 = -1;
            return new zzamy(trim, zzd, zzb, zzb2, f5, z52, z6, z7, z8, i7);
        } catch (RuntimeException e6) {
            e = e6;
            zzamyVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((parseLong >> 24) & 255) ^ 255), zzgxz.zza(parseLong & 255), zzgxz.zza((parseLong >> 8) & 255), zzgxz.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            zzee.zzd("SsaStyle", h1.b(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                u.q(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e4) {
            zzee.zzd("SsaStyle", h1.b(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e4);
            return false;
        }
    }
}
