package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzejv implements zzejw {
    public static /* synthetic */ zzekb zzl(String str, String str2, String str3, zzejx zzejxVar, String str4, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza("Google", str2);
        zzfsw zzn = zzn("javascript");
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        zzfsw zzn2 = zzn(str4);
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zza2 = zzfsl.zza(zza, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        String valueOf2 = String.valueOf(str4);
        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    public static /* synthetic */ zzekb zzm(String str, String str2, String str3, String str4, zzejx zzejxVar, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza(str, str2);
        zzfsw zzn = zzn("javascript");
        zzfsw zzn2 = zzn(str4);
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zzb = zzfsl.zzb(zza, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        String valueOf2 = String.valueOf(str4);
        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    private static zzfsw zzn(String str) {
        return "native".equals(str) ? zzfsw.NATIVE : "javascript".equals(str) ? zzfsw.JAVASCRIPT : zzfsw.NONE;
    }

    private static zzfsr zzo(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfsr.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfsr.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfsr.BEGIN_TO_RENDER;
        }
        return zzfsr.UNSPECIFIED;
    }

    private static zzfso zzp(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfso.HTML_DISPLAY;
            }
            return null;
        }
        if (hashCode == 112202875) {
            if (str.equals("video")) {
                return zzfso.VIDEO;
            }
            return null;
        }
        if (hashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfso.NATIVE_DISPLAY;
        }
        return null;
    }

    private static final Object zzq(zzeju zzejuVar) {
        try {
            return zzejuVar.zza();
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeju() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // com.google.android.gms.internal.ads.zzeju
                public final /* synthetic */ Object zza() {
                    if (zzfsh.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfsh.zza(context);
                    return Boolean.valueOf(zzfsh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            return (String) zzq(zzejk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzekb zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzejy zzejyVar, final zzejx zzejxVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        return (zzekb) zzq(new zzeju(str7, str, str6, zzejxVar, str4, webView, str5, str8, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzejx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

            {
                this.zzb = str;
                this.zzd = zzejxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzekb zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzejy zzejyVar, final zzejx zzejxVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str7 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        final String str8 = "javascript";
        return (zzekb) zzq(new zzeju(str5, str, str8, str4, zzejxVar, webView, str6, str7, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzejx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

            {
                this.zzd = str4;
                this.zze = zzejxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zze(final zzfsj zzfsjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            Objects.requireNonNull(zzfsjVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsj.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzf(final zzfsj zzfsjVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzg(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzh(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsj.this.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final zzfsv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z4) {
        final boolean z5 = true;
        return (zzfsv) zzq(new zzeju(webView, z5) { // from class: com.google.android.gms.internal.ads.zzejq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i5 = versionInfoParcel2.buddyApkVersion;
                int i6 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(i6).length());
                sb.append(i5);
                sb.append(".");
                sb.append(i6);
                return zzfsv.zza(zzfsx.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzj(final zzfsv zzfsvVar, final zzfsu zzfsuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsv.this.zzb(zzfsuVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzk(final zzfsv zzfsvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsv.this.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
