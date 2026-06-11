package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcrh implements zzcql {
    private final CookieManager zza;

    public zzcrh(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List zze = zzgrr.zza(zzgqq.zzc(';')).zze(cookie);
            for (int i5 = 0; i5 < zze.size(); i5++) {
                Iterator it = zzgrr.zza(zzgqq.zzc('=')).zzd((String) zze.get(i5)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(u.m(new StringBuilder(String.valueOf(0).length() + 70), "position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbg))));
            }
        }
    }
}
