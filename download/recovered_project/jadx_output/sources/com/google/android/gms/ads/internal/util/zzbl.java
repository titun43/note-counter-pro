package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcen;
import j3.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbl {
    private static zzasb zza;
    private static final Object zzb = new Object();

    public zzbl(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbhe.zza(context);
                    zza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfp)).booleanValue() ? zzay.zzb(context) : zzatd.zza(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a zza(String str) {
        zzcen zzcenVar = new zzcen();
        zza.zzb(new zzbk(str, null, zzcenVar));
        return zzcenVar;
    }

    public final a zzb(int i5, String str, Map map, byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i5, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzarg e4) {
                String message = e4.getMessage();
                int i6 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
