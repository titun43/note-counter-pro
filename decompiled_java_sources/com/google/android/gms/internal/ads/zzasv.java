package com.google.android.gms.internal.ads;

import com.getcapacitor.PluginCall;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class zzasv {
    public static zzarh zza(zzaru zzaruVar) {
        long j2;
        boolean z4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaruVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i5 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z4 = false;
            j5 = 0;
            j6 = 0;
            while (i5 < split.length) {
                String trim = split[i5].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j6 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j5 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i5++;
            }
            j2 = 0;
            i5 = 1;
        } else {
            j2 = 0;
            z4 = false;
            j5 = 0;
            j6 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zzb2 = str3 != null ? zzb(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j7 = currentTimeMillis;
            j8 = zzb(str4);
        } else {
            j7 = currentTimeMillis;
            j8 = j2;
        }
        String str5 = (String) map.get("ETag");
        if (i5 != 0) {
            long j11 = (j6 * 1000) + j7;
            j10 = z4 ? j11 : (j5 * 1000) + j11;
            j9 = j11;
        } else {
            j9 = (zzb <= j2 || zzb2 < zzb) ? j2 : (zzb2 - zzb) + j7;
            j10 = j9;
        }
        zzarh zzarhVar = new zzarh();
        zzarhVar.zza = zzaruVar.zzb;
        zzarhVar.zzb = str5;
        zzarhVar.zzf = j9;
        zzarhVar.zze = j10;
        zzarhVar.zzc = zzb;
        zzarhVar.zzd = j8;
        zzarhVar.zzg = map;
        zzarhVar.zzh = zzaruVar.zzd;
        return zzarhVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e4) {
            if ("0".equals(str) || PluginCall.CALLBACK_ID_DANGLING.equals(str)) {
                zzask.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzask.zzd(e4, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j2) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
