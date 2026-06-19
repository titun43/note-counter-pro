package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzfbs implements zzfav {
    final String zza;
    final int zzb;

    public /* synthetic */ zzfbs(String str, int i5, byte[] bArr) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlR)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzdahVar.zza.putString("topics", str);
            }
            int i5 = this.zzb;
            if (i5 != -1) {
                zzdahVar.zza.putInt("atps", i5);
            }
        }
    }
}
