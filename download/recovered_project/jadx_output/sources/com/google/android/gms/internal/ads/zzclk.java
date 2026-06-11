package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationTargetException;
import k1.m;

/* loaded from: classes.dex */
public final class zzclk {
    private j1.b zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                boolean z4 = j1.f.f2020a;
                if (!m.f2422g.b()) {
                    throw m.a();
                }
                j1.f.d(webView).f2425a.setProfile("GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e4) {
                String concat = "WebViewCompat error: ".concat(e4.toString());
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpx)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "WebViewCompat.setProfile");
                }
            }
        }
    }

    public final void zzb(zzclo zzcloVar) {
        ProfileStore profileStore;
        if (!a.a.q("MULTI_PROFILE")) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore", "getInstance", new zzfyr[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e4) {
            String valueOf = String.valueOf(e4.getMessage());
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfyr[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e5.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore == null) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
                zzdxy zza = zzcloVar.zzb.zzd().zza();
                zza.zzc("action", "webview_p_f");
                zza.zzc("webview_p_f", "No instance");
                zza.zzd();
                return;
            }
            return;
        }
        this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - zzcloVar.zza;
            zzdxy zza2 = zzcloVar.zzb.zzd().zza();
            zza2.zzc("action", "webview_p_l");
            zza2.zzc("webview_p_l", Long.toString(elapsedRealtime));
            zza2.zzd();
        }
    }
}
