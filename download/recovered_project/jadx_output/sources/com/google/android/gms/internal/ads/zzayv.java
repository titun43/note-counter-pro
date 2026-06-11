package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzayv {
    public static final String zza(Context context, String str, long j2, boolean z4) {
        try {
            zzaxp zza = zzaxq.zza();
            zza.zzb(str);
            zza.zza("0.825731049");
            zza.zzd(context.getPackageName());
            zza.zzf((System.currentTimeMillis() - j2) / 1000);
            zza.zzc(System.currentTimeMillis() / 1000);
            try {
                zza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            zzaxw zzc = zzayg.zzc(((zzaxq) zza.zzbu()).zzaN(), null);
            zzc.zzc(5);
            zzc.zzd(2);
            return Base64.encodeToString(((zzaxx) zzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
