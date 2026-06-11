package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfrf {
    private final zzdxz zza;

    public zzfrf(zzdxz zzdxzVar, Context context) {
        this.zza = zzdxzVar;
    }

    private final void zzt(String str, long j2, String str2, String str3, AdFormat adFormat, int i5, int i6, int i7, String str4) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j2));
        zza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("cache_size", Integer.toString(i6));
        zza.zzc("pas", Integer.toString(i7));
        zza.zzc("pv", "2");
        zza.zzc("ad_unit_id", str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzu(String str, String str2, long j2, int i5, int i6, String str3, zzfrm zzfrmVar, String str4) {
        zzdxy zza = this.zza.zza();
        zza.zzc(str2, Long.toString(j2));
        if (zzfrmVar != null) {
            zza.zzc("ad_unit_id", zzfrmVar.zza());
            zza.zzc("ad_format", zzfrmVar.zzb());
            zza.zzc("pid", zzfrmVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i5 >= 0) {
            zza.zzc("max_ads", Integer.toString(i5));
        }
        if (i6 >= 0) {
            zza.zzc("cache_size", Integer.toString(i6));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    private final void zzv(String str, long j2, String str2, String str3, AdFormat adFormat, int i5, int i6, int i7, int i8, int i9) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j2));
        zza.zzc("pid", str2);
        zza.zzc("ad_unit_id", str3);
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("cache_size", Integer.toString(i6));
        zza.zzc("tpcnt", Integer.toString(i8));
        zza.zzc("mpl", Integer.toString(i9));
        if (adFormat != null) {
            zza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i7 > 0) {
            zza.zzc("nptr", Integer.toString(i7));
        }
        zza.zzd();
    }

    public final void zza(int i5, long j2, zzfrm zzfrmVar, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j2));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(Map map, long j2, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j2));
        zza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zza.zzc(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i5, int i6, long j2, zzfrm zzfrmVar) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", Long.toString(j2));
        zza.zzc("orig_ma", Integer.toString(i5));
        zza.zzc("max_ads", Integer.toString(i6));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i5, int i6, long j2, Long l5, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zza = this.zza.zza();
        zza.zzc("plaac_ts", Long.toString(j2));
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("cache_size", Integer.toString(i6));
        zza.zzc("action", "is_ad_available");
        if (zzfrmVar != null) {
            zza.zzc("ad_unit_id", zzfrmVar.zza());
            zza.zzc("pid", zzfrmVar.zzc());
            zza.zzc("ad_format", zzfrmVar.zzb());
        }
        if (l5 != null) {
            zza.zzc("plaay_ts", Long.toString(l5.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j2, String str) {
        zzu("poll_ad", "ppacwe_ts", j2, -1, -1, null, null, "2");
    }

    public final void zzf(long j2, zzfrm zzfrmVar, int i5, int i6, String str) {
        zzu("poll_ad", "ppac_ts", j2, i5, i6, null, zzfrmVar, str);
    }

    public final void zzg(long j2, int i5, int i6, String str, zzfrm zzfrmVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j2, i5, i6, str, zzfrmVar, str2);
    }

    public final void zzh(long j2, int i5, int i6, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zza = this.zza.zza();
        zza.zzc("ppla_ts", Long.toString(j2));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("cache_size", Integer.toString(i6));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j2, String str, zzfrm zzfrmVar, int i5, int i6, String str2) {
        zzu("paa", "pano_ts", j2, i5, i6, str, zzfrmVar, str2);
    }

    public final void zzj(long j2, zzfrm zzfrmVar, int i5, String str) {
        zzu("pae", "paeo_ts", j2, i5, 0, null, zzfrmVar, str);
    }

    public final void zzk(long j2, zzfrm zzfrmVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i5, int i6, String str) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", Long.toString(j2));
        zza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zza.zzc("ad_format", zzfrmVar.zzb());
        zza.zzc("max_ads", Integer.toString(i5));
        zza.zzc("cache_size", Integer.toString(i6));
        zza.zzc("ad_unit_id", zzfrmVar.zza());
        zza.zzc("pid", zzfrmVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j2, AdFormat adFormat, int i5) {
        zzt("pda", j2, null, null, adFormat, -1, -1, i5, "2");
    }

    public final void zzm(long j2, String str, String str2, AdFormat adFormat, int i5, int i6) {
        zzt("pd", j2, str, str2, adFormat, i5, i6, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j2, int i5) {
        zzt("pgcs", j2, null, null, adFormat, -1, -1, i5, "2");
    }

    public final void zzo(long j2, String str, String str2, AdFormat adFormat, int i5, int i6) {
        zzt("pgc", j2, str, str2, adFormat, i5, i6, 1, "2");
    }

    public final void zzp(int i5, long j2, String str, String str2, AdFormat adFormat, int i6) {
        zzt("pnav", j2, str, str2, adFormat, i6, i5, 1, "2");
    }

    public final void zzq(long j2, String str, String str2, AdFormat adFormat, int i5, int i6, int i7, int i8) {
        zzv("acmpa", j2, str, str2, adFormat, i5, i6, 0, i7, i8);
    }

    public final void zzr(long j2, String str, String str2, AdFormat adFormat, int i5, int i6, int i7, int i8, int i9) {
        zzv("acmpr", j2, str, str2, adFormat, i5, i6, i7, i8, i9);
    }

    public final void zzs(long j2, int i5, int i6) {
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "acmlr");
        zza.zzc("pat", Long.toString(j2));
        zza.zzc("mpl", Integer.toString(i5));
        zza.zzc("pas", Integer.toString(i6));
        zza.zzd();
    }
}
